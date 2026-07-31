package sky.core.util.config;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.function.Consumer;
import sky.core.Skycore;
import sky.core.module.Module;
import sky.core.module.setting.BooleanSetting;
import sky.core.module.setting.ModeSetting;
import sky.core.module.setting.MultiBooleanSetting;
import sky.core.module.setting.Setting;
import sky.core.module.setting.SliderSetting;

public final class ConfigSerializer {
    private ConfigSerializer() {
    }

    public static JsonObject saveModules() {
        JsonObject modules = new JsonObject();
        for (Module module : Skycore.getInstance().getModuleManager().getModules()) {
            JsonObject moduleData = new JsonObject();
            moduleData.addProperty("key", module.getKeyBind());
            moduleData.addProperty("enabled", module.isEnabled());
            for (Setting<?> setting : module.getSettings()) {
                saveSetting(moduleData, setting);
            }
            modules.add(module.getName().toLowerCase(), moduleData);
        }
        return modules;
    }

    public static void loadModules(JsonObject modules) {
        Module.setSuppressToggleEffects(true);
        try {
            for (Module module : Skycore.getInstance().getModuleManager().getModules()) {
                JsonObject moduleData = modules.getAsJsonObject(module.getName().toLowerCase());
                if (moduleData == null) {
                    continue;
                }

                module.setEnabled(false);
                loadProperty(moduleData, "key", value -> module.setKeyBind(value.getAsInt()));
                loadProperty(moduleData, "enabled", value -> module.setEnabled(value.getAsBoolean()));

                for (Setting<?> setting : module.getSettings()) {
                    loadSetting(moduleData, setting);
                }
            }
        } finally {
            Module.setSuppressToggleEffects(false);
        }
    }

    public static void saveSetting(JsonObject moduleData, Setting<?> setting) {
        try {
            if (setting instanceof BooleanSetting booleanSetting) {
                moduleData.addProperty(setting.getName(), booleanSetting.get());
            } else if (setting instanceof MultiBooleanSetting multiBooleanSetting) {
                JsonObject options = new JsonObject();
                for (BooleanSetting option : multiBooleanSetting.getOptions()) {
                    options.addProperty(option.getName(), option.get());
                }
                moduleData.add(setting.getName(), options);
            } else if (setting instanceof SliderSetting sliderSetting) {
                moduleData.addProperty(setting.getName(), sliderSetting.get());
            } else if (setting instanceof ModeSetting modeSetting) {
                moduleData.addProperty(setting.getName(), modeSetting.get());
            }
        } catch (Exception exception) {
            System.err.println("Failed to save setting " + setting.getName() + ": " + exception.getMessage());
        }
    }

    public static void loadSetting(JsonObject moduleData, Setting<?> setting) {
        JsonElement element = moduleData.get(setting.getName());
        if (element == null || element.isJsonNull()) {
            return;
        }

        try {
            if (setting instanceof BooleanSetting booleanSetting) {
                booleanSetting.set(element.getAsBoolean());
            } else if (setting instanceof MultiBooleanSetting multiBooleanSetting) {
                if (!element.isJsonObject()) {
                    return;
                }
                JsonObject options = element.getAsJsonObject();
                for (BooleanSetting option : multiBooleanSetting.getOptions()) {
                    JsonElement optionElement = options.get(option.getName());
                    if (optionElement != null && !optionElement.isJsonNull()) {
                        option.set(optionElement.getAsBoolean());
                    }
                }
            } else if (setting instanceof SliderSetting sliderSetting) {
                sliderSetting.setClamped(element.getAsFloat());
            } else if (setting instanceof ModeSetting modeSetting) {
                modeSetting.set(element.getAsString());
            }
        } catch (Exception exception) {
            System.err.println("Failed to load setting " + setting.getName() + ": " + exception.getMessage());
        }
    }

    public static void resetToDefaults() {
        Module.setSuppressToggleEffects(true);
        try {
            for (Module module : Skycore.getInstance().getModuleManager().getModules()) {
                module.resetState();
            }
        } finally {
            Module.setSuppressToggleEffects(false);
        }
    }

    public static void loadProperty(JsonObject object, String key, Consumer<JsonElement> consumer) {
        JsonElement element = object.get(key);
        if (element != null && !element.isJsonNull()) {
            consumer.accept(element);
        }
    }
}
