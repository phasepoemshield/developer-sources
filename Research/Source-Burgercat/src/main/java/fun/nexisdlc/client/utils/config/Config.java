package fun.nexisdlc.client.utils.config;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import fun.nexisdlc.NexisClient;
import fun.nexisdlc.client.utils.client.ILogger;
import fun.nexisdlc.client.utils.client.IMinecraft;
import fun.nexisdlc.client.utils.player.ServerUtil;
import fun.nexisdlc.modules.api.settings.api.Setting;
import fun.nexisdlc.modules.api.settings.impl.*;
import net.minecraft.client.MinecraftClient;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Config implements IMinecraft, ILogger {
    private final File file;
    private final String name;
    private final List<Setting<?>> settings = new ArrayList<>();

    private String author = "Unknown";
    private long updatedAt = 0L;

    public Config(String name) {
        this.name = name;
        this.file = new File(new File(MinecraftClient.getInstance().runDirectory, "Nexis\\configs"), name + ".json");
    }

    public String getAuthor() { return author; }
    public long getUpdatedAt() { return updatedAt; }

    public File getFile() {
        return file;
    }

    public String getName() {
        return name;
    }

    public void addSetting(Setting<?> setting) {
        settings.add(setting);
    }

    public void loadConfig(JsonObject jsonObject) {
        if (jsonObject == null) return;

        NexisClient.noNeedSounds = true;

        if (jsonObject.has("modules")) {
            loadFunctionSettings(jsonObject.getAsJsonObject("modules"));
        }

        if (jsonObject.has("settings")) {
            JsonObject settingsObject = jsonObject.getAsJsonObject("settings");
            for (Setting<?> setting : settings) {
                if (settingsObject.has(setting.getName())) {
                    JsonElement settingElement = settingsObject.get(setting.getName());
                    if (settingElement != null && !settingElement.isJsonNull()) {
                        applySettingValue(setting, settingElement);
                    }
                }
            }
        }

        NexisClient.noNeedSounds = false;
    }

    private void loadFunctionSettings(JsonObject functionsObject) {
        var functionManager = NexisClient.getFunctionManager();
        if (functionManager == null) return;
        functionManager.getFunctions().forEach(module -> {
            JsonObject moduleObject = functionsObject.getAsJsonObject(module.getName().toLowerCase());
            if (moduleObject == null) return;

            module.setState(false);
            if (moduleObject.has("bind")) {
                module.setBind(moduleObject.get("bind").getAsInt());
            }

            if (module.isNeedPremium() && ServerUtil.anarchyType != 'l') {
                JsonElement stateElement = moduleObject.get("state");
                if (stateElement != null && stateElement.getAsBoolean()) {
                    logDirect("Модуль " + module.getName() + " недоступен т.к у Вас нет премиум подписки");
                    System.out.println("Модуль " + module.getName() + " недоступен т.к у Вас нет премиум подписки");
                }
                module.setState(false);
            } else {
                JsonElement stateElement = moduleObject.get("state");
                if (stateElement != null && !stateElement.isJsonNull()) {
                    module.setState(stateElement.getAsBoolean());
                }
            }

            module.getSettings().forEach(setting -> {
                if (moduleObject.has(setting.getName())) {
                    applySettingValue(setting, moduleObject.get(setting.getName()));
                }
            });
        });
    }

    private void applySettingValue(Setting<?> setting, JsonElement element) {
        try {
            if (setting instanceof SliderSetting) {
                ((SliderSetting) setting).set(element.getAsFloat());
            } else if (setting instanceof BooleanSetting) {
                BooleanSetting bs = (BooleanSetting) setting;
                if (element.isJsonObject()) {
                    // Новый формат: {"v": true, "bind": 65}
                    com.google.gson.JsonObject obj = element.getAsJsonObject();
                    if (obj.has("v")) bs.set(obj.get("v").getAsBoolean());
                    if (obj.has("bind")) bs.setBind(obj.get("bind").getAsInt());
                } else {
                    // Старый формат: просто boolean
                    bs.set(element.getAsBoolean());
                }
            } else if (setting instanceof ColorSetting) {
                ((ColorSetting) setting).set(element.getAsInt());
                ((ColorSetting) setting).updateHSB();
            } else if (setting instanceof ModeSetting) {
                ((ModeSetting) setting).set(element.getAsString());
            } else if (setting instanceof BindSetting) {
                ((BindSetting) setting).set(element.getAsInt());
            } else if (setting instanceof ModeListSetting && element.isJsonObject()) {
                com.google.gson.JsonObject obj = element.getAsJsonObject();
                for (BooleanSetting opt : ((ModeListSetting) setting).get()) {
                    if (obj.has(opt.getName())) {
                        opt.set(obj.get(opt.getName()).getAsBoolean());
                    }
                }
            } else if (setting instanceof StringSetting) {
                ((StringSetting) setting).set(element.getAsString());
            }
        } catch (Exception e) {
            NexisClient.LOGGER.warn("[Config] Failed to apply setting value: {} ({})", setting != null ? setting.getName() : "null", e.getMessage());
        }
    }

    public JsonElement saveConfig() {
        JsonObject functionsObject = new JsonObject();
        saveFunctionSettings(functionsObject);

        JsonObject settingsObject = new JsonObject();
        for (Setting<?> setting : settings) {
            saveIndividualSetting(settingsObject, setting);
        }

        JsonObject newObject = new JsonObject();
        JsonObject metaObject = new JsonObject();
        metaObject.addProperty("author", System.getProperty("user.name", "Unknown"));
        metaObject.addProperty("updatedAt", System.currentTimeMillis());
        newObject.add("meta", metaObject);
        newObject.add("modules", functionsObject);
        if (!settings.isEmpty()) {
            newObject.add("settings", settingsObject);
        }
        return newObject;
    }

    private void saveFunctionSettings(JsonObject functionsObject) {
        var functionManager = NexisClient.getFunctionManager();
        if (functionManager == null) return;
        functionManager.getFunctions().forEach(module -> {
            JsonObject moduleObject = new JsonObject();
            moduleObject.addProperty("bind", module.getBind());
            moduleObject.addProperty("state", module.isState());
            module.getSettings().forEach(setting -> saveIndividualSetting(moduleObject, setting));
            functionsObject.add(module.getName().toLowerCase(), moduleObject);
        });
    }

    private void saveIndividualSetting(JsonObject moduleObject, Setting<?> setting) {
        if (setting instanceof BooleanSetting bs) {
            if (bs.isBound()) {
                // Новый формат с биндом
                JsonObject bsObj = new JsonObject();
                bsObj.addProperty("v", bs.get());
                bsObj.addProperty("bind", bs.getBind());
                moduleObject.add(setting.getName(), bsObj);
            } else {
                // Старый формат — просто boolean (обратная совместимость)
                moduleObject.addProperty(setting.getName(), bs.get());
            }
        } else if (setting instanceof SliderSetting) {
            moduleObject.addProperty(setting.getName(), ((SliderSetting) setting).get());
        } else if (setting instanceof ModeSetting) {
            moduleObject.addProperty(setting.getName(), ((ModeSetting) setting).get());
        } else if (setting instanceof ColorSetting) {
            moduleObject.addProperty(setting.getName(), ((ColorSetting) setting).get());
        } else if (setting instanceof ModeListSetting) {
            saveModeListSetting(moduleObject, (ModeListSetting) setting);
        } else if (setting instanceof BindSetting) {
            moduleObject.addProperty(setting.getName(), ((BindSetting) setting).get());
        } else if (setting instanceof StringSetting) {
            moduleObject.addProperty(setting.getName(), ((StringSetting) setting).get());
        }
    }

    private void saveModeListSetting(JsonObject moduleObject, ModeListSetting setting) {
        JsonObject elements = new JsonObject();
        setting.get().forEach(option -> elements.addProperty(option.getName(), option.get()));
        moduleObject.add(setting.getName(), elements);
    }
}
