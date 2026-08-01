package fun.wonderful.api.storages.implement;

import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.JsonPrimitive;
import fun.wonderful.Wonderful;
import fun.wonderful.api.storages.implement.DragStorage;
import fun.wonderful.api.storages.implement.LocalizationStorage;
import fun.wonderful.api.storages.implement.ThemeStorage;
import fun.wonderful.api.storages.implement.helpertstorages.enumvar.ModuleClass;
import fun.wonderful.api.utils.cmd.macro.Macro;
import fun.wonderful.api.utils.color.ColorUtils;
import fun.wonderful.api.utils.draggable.Draggable;
import fun.wonderful.api.utils.namespaced.FileUtils;
import fun.wonderful.api.utils.player.ViaFabricPlusVersionStorage;
import fun.wonderful.client.modules.Module;
import fun.wonderful.client.modules.impl.render.Interface;
import fun.wonderful.client.modules.impl.render.base.InterfaceProcessing;
import fun.wonderful.client.modules.impl.render.base.implement.TargetHud;
import fun.wonderful.client.modules.impl.render.base.implement.WaterMark;
import fun.wonderful.client.modules.settings.Setting;
import fun.wonderful.client.modules.settings.implement.BindSetting;
import fun.wonderful.client.modules.settings.implement.BooleanSetting;
import fun.wonderful.client.modules.settings.implement.FloatSetting;
import fun.wonderful.client.modules.settings.implement.ListSetting;
import fun.wonderful.client.modules.settings.implement.ModeSetting;
import fun.wonderful.client.modules.settings.implement.TextSetting;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Paths;
import java.util.LinkedHashMap;
import java.util.Map;

public class ConfigStorage {
    public String currentConfig = "default";
    private final String extension = ".wonder";
    private static final int AUTOSAVE_INTERVAL_TICKS = 6000;
    private int autosaveTicker = 0;
    private final Object saveLock = new Object();

    public ConfigStorage() {
        this.loadAll();
        this.registerShutdownHook();
    }

    private void registerShutdownHook() {
        Thread hook = new Thread(() -> {
            Object object = this.saveLock;
            synchronized (object) {
                try {
                    this.saveGlobals();
                    this.saveConfig(this.currentConfig);
                }
                catch (Exception e2) {
                    e2.printStackTrace(System.err);
                }
            }
        }, "Wonderful-Config-Shutdown");
        hook.setDaemon(false);
        Runtime.getRuntime().addShutdownHook(hook);
    }

    public void tickAutosave() {
        ViaFabricPlusVersionStorage.applyPending();
        if (++this.autosaveTicker >= 6000) {
            this.autosaveTicker = 0;
            Thread saveThread = new Thread(() -> {
                Object object = this.saveLock;
                synchronized (object) {
                    try {
                        this.saveGlobals();
                        this.saveConfig(this.currentConfig);
                    }
                    catch (Exception e2) {
                        e2.printStackTrace(System.err);
                    }
                }
            }, "Wonderful-Config-AutoSave");
            saveThread.setDaemon(false);
            saveThread.start();
        }
    }

    private void loadAll() {
        try {
            this.loadGlobals();
            this.loadConfig(this.currentConfig);
        }
        catch (Exception e2) {
            e2.printStackTrace(System.err);
        }
    }

    private void writeJson(File targetFile, JsonObject object) throws IOException {
        String json = new GsonBuilder().setPrettyPrinting().create().toJson((JsonElement)object);
        FileOutputStream fos = new FileOutputStream(targetFile, false);
        try (OutputStreamWriter writer = new OutputStreamWriter((OutputStream)fos, StandardCharsets.UTF_8);){
            writer.write(json);
            writer.flush();
            fos.getFD().sync();
        }
    }

    public void saveConfig(String config) throws Exception {
        File file = new File(Wonderful.INSTANCE.configsDir, config + ".wonder");
        JsonObject object = new JsonObject();
        object.add("config", (JsonElement)new JsonPrimitive(config));
        object.add("theme", (JsonElement)new JsonPrimitive(Wonderful.INSTANCE.themeStorage.getThemes().name()));
        this.appendCustomTheme(object);
        object.add("language", (JsonElement)new JsonPrimitive(Wonderful.INSTANCE.localizationStorage.getLanguage().name()));
        object.add("modules", (JsonElement)(Object)this.serializeModules());
        object.add("draggables", (JsonElement)(Object)this.serializeDraggables());
        object.add("hud", (JsonElement)(Object)this.serializeHudState());
        object.add("macros", (JsonElement)(Object)this.serializeMacros());
        this.writeJson(file, object);
        this.currentConfig = config;
    }

    public void loadConfig(String config) throws Exception {
        JsonObject object;
        if (!FileUtils.exists(String.valueOf(Wonderful.INSTANCE.configsDir) + "/" + config + ".wonder")) {
            return;
        }
        try (InputStream stream = Files.newInputStream(Paths.get(String.valueOf(Wonderful.INSTANCE.configsDir) + "/" + config + ".wonder", new String[0]), new OpenOption[0]);
             InputStreamReader reader = new InputStreamReader(stream, StandardCharsets.UTF_8);){
            object = JsonParser.parseReader((Reader)reader).getAsJsonObject();
        }
        if (object.has("theme")) {
            String themeName = object.get("theme").getAsString();
            for (ThemeStorage.Themes theme : ThemeStorage.Themes.values()) {
                if (!theme.name().equals(themeName)) continue;
                Wonderful.INSTANCE.themeStorage.setThemes(theme);
                break;
            }
        }
        this.readCustomTheme(object);
        if (object.has("language")) {
            try {
                Wonderful.INSTANCE.localizationStorage.setLanguage(LocalizationStorage.Language.valueOf(object.get("language").getAsString()));
            }
            catch (Exception exception) {
                
            }
        }
        if (object.has("draggables")) {
            this.deserializeDraggables(object.get("draggables").getAsJsonObject());
        }
        if (object.has("modules")) {
            this.deserializeModules(object.get("modules").getAsJsonObject());
        }
        if (object.has("hud")) {
            this.deserializeHudState(object.get("hud").getAsJsonObject());
        }
        if (object.has("macros")) {
            this.deserializeMacros(object.get("macros").getAsJsonArray());
        }
        this.currentConfig = config;
    }

    public void saveGlobals() throws Exception {
        File file = new File(Wonderful.INSTANCE.globalsDir, "globals.wonder");
        JsonObject object = new JsonObject();
        object.add("config", (JsonElement)new JsonPrimitive(this.currentConfig));
        object.add("theme", (JsonElement)new JsonPrimitive(Wonderful.INSTANCE.themeStorage.getThemes().name()));
        this.appendCustomTheme(object);
        object.add("language", (JsonElement)new JsonPrimitive(Wonderful.INSTANCE.localizationStorage.getLanguage().name()));
        ViaFabricPlusVersionStorage.append(object);
        object.add("draggables", (JsonElement)(Object)this.serializeDraggables());
        object.add("hud", (JsonElement)(Object)this.serializeHudState());
        JsonArray friendsArray = new JsonArray();
        Wonderful.INSTANCE.friendStorage.getFriends().forEach(arg_0 -> ((JsonArray)friendsArray).add(arg_0));
        object.add("friends", (JsonElement)friendsArray);
        JsonArray staffsArray = new JsonArray();
        Wonderful.INSTANCE.staffStorage.getStaffs().forEach(arg_0 -> ((JsonArray)staffsArray).add(arg_0));
        object.add("staffs", (JsonElement)staffsArray);
        object.add("macros", (JsonElement)(Object)this.serializeMacros());
        this.writeJson(file, object);
    }

    public void loadGlobals() throws Exception {
        JsonObject object;
        if (!FileUtils.exists(String.valueOf(Wonderful.INSTANCE.globalsDir) + "/globals.wonder")) {
            return;
        }
        try (InputStream stream = Files.newInputStream(Paths.get(String.valueOf(Wonderful.INSTANCE.globalsDir) + "/globals.wonder", new String[0]), new OpenOption[0]);
             InputStreamReader reader = new InputStreamReader(stream, StandardCharsets.UTF_8);){
            object = JsonParser.parseReader((Reader)reader).getAsJsonObject();
        }
        if (object.has("config")) {
            this.currentConfig = object.get("config").getAsString();
        }
        if (object.has("theme")) {
            String themeName = object.get("theme").getAsString();
            for (ThemeStorage.Themes theme : ThemeStorage.Themes.values()) {
                if (!theme.name().equals(themeName)) continue;
                Wonderful.INSTANCE.themeStorage.setThemes(theme);
                break;
            }
        }
        this.readCustomTheme(object);
        if (object.has("language")) {
            try {
                Wonderful.INSTANCE.localizationStorage.setLanguage(LocalizationStorage.Language.valueOf(object.get("language").getAsString()));
            }
            catch (Exception exception) {
                
            }
        }
        ViaFabricPlusVersionStorage.read(object);
        if (object.has("draggables")) {
            this.deserializeDraggables(object.get("draggables").getAsJsonObject());
        }
        if (object.has("hud")) {
            this.deserializeHudState(object.get("hud").getAsJsonObject());
        }
        if (object.has("friends")) {
            for (JsonElement element : object.get("friends").getAsJsonArray()) {
                if (Wonderful.INSTANCE.friendStorage.isFriend(element.getAsString())) continue;
                Wonderful.INSTANCE.friendStorage.add(element.getAsString());
            }
        }
        if (object.has("staffs")) {
            for (JsonElement element : object.get("staffs").getAsJsonArray()) {
                if (Wonderful.INSTANCE.staffStorage.isStaff(element.getAsString())) continue;
                Wonderful.INSTANCE.staffStorage.add(element.getAsString());
            }
        }
        if (object.has("macros")) {
            this.deserializeMacros(object.get("macros").getAsJsonArray());
        }
    }

    private JsonArray serializeMacros() {
        JsonArray macrosArray = new JsonArray();
        Wonderful.INSTANCE.macroStorage.getMacros().forEach(macro -> {
            JsonObject macroObject = new JsonObject();
            macroObject.addProperty("name", macro.getName());
            macroObject.addProperty("command", macro.getCommand());
            macroObject.addProperty("key", (Number)macro.getBind().getKey());
            macrosArray.add((JsonElement)macroObject);
        });
        return macrosArray;
    }

    private void deserializeMacros(JsonArray macrosArray) {
        Wonderful.INSTANCE.macroStorage.clear();
        for (JsonElement element : macrosArray) {
            try {
                int key;
                String command;
                String name;
                if (element.isJsonObject()) {
                    JsonObject macroObject = element.getAsJsonObject();
                    name = macroObject.has("name") ? macroObject.get("name").getAsString() : "";
                    command = macroObject.has("command") ? macroObject.get("command").getAsString() : "";
                    key = macroObject.has("key") ? macroObject.get("key").getAsInt() : -1;
                } else {
                    String[] split = element.getAsString().split(":", 3);
                    if (split.length < 3) continue;
                    name = split[0];
                    command = split[1];
                    key = Integer.parseInt(split[2]);
                }
                if (name.isBlank()) continue;
                Wonderful.INSTANCE.macroStorage.add(new Macro(name, command, new BindSetting("bind", key)));
            }
            catch (Exception exception) {}
        }
    }

    private JsonObject serializeModules() {
        JsonObject modules = new JsonObject();
        for (Module module : ModuleClass.INSTANCE.getObject()) {
            try {
                JsonObject object = new JsonObject();
                object.add("toggled", (JsonElement)new JsonPrimitive(Boolean.valueOf(module.isEnable())));
                object.add("bind", (JsonElement)new JsonPrimitive((Number)module.getKey()));
                JsonObject settings = new JsonObject();
                for (Setting s2 : module.getSettings()) {
                    try {
                        if (s2 instanceof BooleanSetting) {
                            BooleanSetting bool = (BooleanSetting)s2;
                            settings.add(s2.name(), (JsonElement)new JsonPrimitive(Boolean.valueOf(bool.isState())));
                            continue;
                        }
                        if (s2 instanceof FloatSetting) {
                            FloatSetting num = (FloatSetting)s2;
                            settings.add(s2.name(), (JsonElement)new JsonPrimitive((Number)Float.valueOf(num.getValue().floatValue())));
                            continue;
                        }
                        if (s2 instanceof ModeSetting) {
                            ModeSetting mode = (ModeSetting)s2;
                            settings.add(s2.name(), (JsonElement)new JsonPrimitive(mode.getCurrent()));
                            continue;
                        }
                        if (s2 instanceof TextSetting) {
                            TextSetting text = (TextSetting)s2;
                            settings.add(s2.name(), (JsonElement)new JsonPrimitive(text.get()));
                            continue;
                        }
                        if (s2 instanceof BindSetting) {
                            BindSetting bind = (BindSetting)s2;
                            settings.add(s2.name(), (JsonElement)new JsonPrimitive((Number)bind.getKey()));
                            continue;
                        }
                        if (!(s2 instanceof ListSetting)) continue;
                        ListSetting list = (ListSetting)s2;
                        JsonObject listObj = new JsonObject();
                        for (BooleanSetting setting : list.getSettings()) {
                            listObj.add(setting.name(), (JsonElement)new JsonPrimitive(Boolean.valueOf(setting.isState())));
                        }
                        settings.add(list.name(), (JsonElement)listObj);
                    }
                    catch (Exception exception) {}
                }
                object.add("settings", (JsonElement)settings);
                modules.add(module.getName(), (JsonElement)object);
            }
            catch (Exception exception) {}
        }
        return modules;
    }

    private void deserializeModules(JsonObject modules) {
        JsonObject object;
        LinkedHashMap<Module, Boolean> targetStates = new LinkedHashMap<Module, Boolean>();
        for (Module module : ModuleClass.INSTANCE.getObject()) {
            try {
                object = modules.has(module.getName()) ? modules.get(module.getName()).getAsJsonObject() : null;
                boolean toggled = object != null && object.has("toggled") && object.get("toggled").getAsBoolean();
                targetStates.put(module, toggled);
                if (!module.isEnable()) continue;
                module.setEnabled(false);
            }
            catch (Exception ignored) {
                targetStates.put(module, false);
            }
        }
        for (Module module : ModuleClass.INSTANCE.getObject()) {
            try {
                if (!modules.has(module.getName())) continue;
                object = modules.get(module.getName()).getAsJsonObject();
                if (object.has("bind")) {
                    module.setKey(object.get("bind").getAsInt());
                }
                if (!object.has("settings")) continue;
                JsonObject settings = object.get("settings").getAsJsonObject();
                for (Setting s2 : module.getSettings()) {
                    try {
                        if (!settings.has(s2.name())) continue;
                        JsonElement element = settings.get(s2.name());
                        if (s2 instanceof BooleanSetting) {
                            BooleanSetting bool = (BooleanSetting)s2;
                            bool.setState(element.getAsBoolean());
                            continue;
                        }
                        if (s2 instanceof FloatSetting) {
                            FloatSetting num = (FloatSetting)s2;
                            num.setValue(element.getAsFloat());
                            continue;
                        }
                        if (s2 instanceof ModeSetting) {
                            ModeSetting mode = (ModeSetting)s2;
                            mode.set(element.getAsString());
                            continue;
                        }
                        if (s2 instanceof TextSetting) {
                            TextSetting text = (TextSetting)s2;
                            text.setText(element.getAsString());
                            continue;
                        }
                        if (s2 instanceof BindSetting) {
                            BindSetting bind = (BindSetting)s2;
                            bind.setKey(element.getAsInt());
                            continue;
                        }
                        if (!(s2 instanceof ListSetting)) continue;
                        ListSetting list = (ListSetting)s2;
                        JsonObject listObj = element.getAsJsonObject();
                        for (BooleanSetting setting : list.getSettings()) {
                            if (!listObj.has(setting.name())) continue;
                            setting.setState(listObj.get(setting.name()).getAsBoolean());
                        }
                    }
                    catch (Exception exception) {
                    }
                }
            }
            catch (Exception exception) {
            }
        }
        for (Map.Entry entry : targetStates.entrySet()) {
            try {
                ((Module)entry.getKey()).setEnabled((Boolean)entry.getValue());
            }
            catch (Exception exception) {}
        }
    }

    private JsonObject serializeHudState() {
        JsonObject hud = new JsonObject();
        Interface interfaceModule = ModuleClass.interfaceModule;
        if (interfaceModule == null) {
            return hud;
        }
        for (Map.Entry<String, InterfaceProcessing> entry : interfaceModule.getConfigurableHudElements().entrySet()) {
            InterfaceProcessing element = entry.getValue();
            if (element == null) continue;
            JsonObject object = new JsonObject();
            if (element instanceof WaterMark) {
                WaterMark waterMark = (WaterMark)element;
                object.add("showUsername", (JsonElement)new JsonPrimitive(Boolean.valueOf(waterMark.isShowUsername())));
                object.add("showFps", (JsonElement)new JsonPrimitive(Boolean.valueOf(waterMark.isShowFps())));
                object.add("showTime", (JsonElement)new JsonPrimitive(Boolean.valueOf(waterMark.isShowTime())));
                object.add("showMs", (JsonElement)new JsonPrimitive(Boolean.valueOf(waterMark.isShowMs())));
                object.add("showServer", (JsonElement)new JsonPrimitive(Boolean.valueOf(waterMark.isShowServer())));
                object.add("showTps", (JsonElement)new JsonPrimitive(Boolean.valueOf(waterMark.isShowTps())));
            } else if (element instanceof TargetHud) {
                TargetHud targetHud = (TargetHud)element;
                object.add("headParticlesEnabled", (JsonElement)new JsonPrimitive(Boolean.valueOf(targetHud.isHeadParticlesEnabled())));
            }
            hud.add(entry.getKey(), (JsonElement)object);
        }
        return hud;
    }

    private void deserializeHudState(JsonObject hud) {
        Interface interfaceModule = ModuleClass.interfaceModule;
        if (interfaceModule == null) {
            return;
        }
        for (Map.Entry<String, InterfaceProcessing> entry : interfaceModule.getConfigurableHudElements().entrySet()) {
            if (!hud.has(entry.getKey())) continue;
            try {
                JsonObject object = hud.get(entry.getKey()).getAsJsonObject();
                InterfaceProcessing element = entry.getValue();
                element.setUnusualRectType(false);
                if (element instanceof WaterMark) {
                    WaterMark waterMark = (WaterMark)element;
                    if (object.has("showUsername")) {
                        waterMark.setShowUsername(object.get("showUsername").getAsBoolean());
                    }
                    if (object.has("showFps")) {
                        waterMark.setShowFps(object.get("showFps").getAsBoolean());
                    }
                    if (object.has("showTime")) {
                        waterMark.setShowTime(object.get("showTime").getAsBoolean());
                    }
                    if (object.has("showMs")) {
                        waterMark.setShowMs(object.get("showMs").getAsBoolean());
                    }
                    if (object.has("showServer")) {
                        waterMark.setShowServer(object.get("showServer").getAsBoolean());
                    }
                    if (!object.has("showTps")) continue;
                    waterMark.setShowTps(object.get("showTps").getAsBoolean());
                    continue;
                }
                if (!(element instanceof TargetHud)) continue;
                TargetHud targetHud = (TargetHud)element;
                if (!object.has("headParticlesEnabled")) continue;
                targetHud.setHeadParticlesEnabled(object.get("headParticlesEnabled").getAsBoolean());
            }
            catch (Exception exception) {}
        }
    }

    private void appendCustomTheme(JsonObject object) {
        object.add("customThemePrimary", (JsonElement)new JsonPrimitive((Number)Wonderful.INSTANCE.themeStorage.getCustomPrimaryColor()));
        object.add("customThemeSecondary", (JsonElement)new JsonPrimitive((Number)Wonderful.INSTANCE.themeStorage.getCustomSecondaryColor()));
    }

    private void readCustomTheme(JsonObject object) {
        if (!object.has("customThemePrimary")) {
            return;
        }
        int primary = object.get("customThemePrimary").getAsInt();
        int secondary = object.has("customThemeSecondary") ? object.get("customThemeSecondary").getAsInt() : ColorUtils.darken(primary, 0.35f);
        Wonderful.INSTANCE.themeStorage.setCustomThemeColors(primary, secondary);
    }

    private JsonObject serializeDraggables() {
        JsonObject draggables = new JsonObject();
        for (Draggable drag : DragStorage.draggables.values()) {
            JsonObject object = new JsonObject();
            object.add("x", (JsonElement)new JsonPrimitive((Number)Float.valueOf(drag.getX())));
            object.add("y", (JsonElement)new JsonPrimitive((Number)Float.valueOf(drag.getY())));
            draggables.add(drag.getName(), (JsonElement)object);
        }
        return draggables;
    }

    private void deserializeDraggables(JsonObject draggables) {
        for (String name : draggables.keySet()) {
            Draggable drag = DragStorage.draggables.get(name);
            if (drag == null) continue;
            JsonObject object = draggables.get(name).getAsJsonObject();
            if (object.has("x")) {
                drag.setX(object.get("x").getAsFloat());
            }
            if (!object.has("y")) continue;
            drag.setY(object.get("y").getAsFloat());
        }
    }
}