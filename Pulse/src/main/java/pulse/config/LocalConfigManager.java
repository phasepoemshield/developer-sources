package pulse.config;

import java.awt.Color;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CodingErrorAction;
import java.nio.charset.StandardCharsets;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.nio.file.StandardOpenOption;
import java.nio.file.attribute.FileAttribute;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;
import net.minecraft.client.MinecraftClient;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import pulse.config.ConfigEntry;
import pulse.hud.core.HudElement;
import pulse.hud.core.HudElementManager;
import pulse.render.icons.IconTextureRegistry;
import pulse.module.ClientModule;
import pulse.module.ModuleRegistry;
import pulse.settings.BooleanSetting;
import pulse.settings.ColorSetting;
import pulse.settings.ItemToggleSetting;
import pulse.settings.KeySetting;
import pulse.settings.ModeSetting;
import pulse.settings.Setting;
import pulse.settings.SettingGroup;
import pulse.settings.SliderSetting;
import pulse.settings.TokenSetting;

public class LocalConfigManager {
    private static final Logger LOG = LogManager.getLogger("pulse/config");
    private static final LocalConfigManager INSTANCE = new LocalConfigManager();
    private static final String FOLDER_NAME = "pulse";
    private static final String APPDATA_DIR = "Pulse";
    private static final String FILE_EXT = ".json";
    private static final String AUTOSAVE_FILE = "pulse.cfg";
    private static final String DEFAULT_NAME = "default";
    private static final int FORMAT_VER = 1;
    private static final long SAVE_DEBOUNCE_MS = 200;
    private volatile boolean applying;
    private volatile ScheduledFuture<?> pendingSave;
    private final LinkedHashMap<String, String> profiles = new LinkedHashMap<>();
    private String activeProfile = DEFAULT_NAME;
    private final ScheduledExecutorService saveExecutor = Executors.newSingleThreadScheduledExecutor(runnable -> {
        Thread thread = new Thread(runnable, "pulse-autosave");
        thread.setDaemon(true);
        return thread;
    });

    public static LocalConfigManager get() {
        return INSTANCE;
    }

    private LocalConfigManager() {
    }

    public boolean isApplying() {
        return this.applying;
    }

    public String configDirectory() {
        return getConfigDir().toAbsolutePath().toString();
    }

    public void init() {
        migrateLegacyConfigIfNeeded();
        LOG.info("[Pulse] init() — config dir: {}", configDirectory());
        this.applying = true;
        boolean z = false;
        try {
            loadAllFromDisk();
            LOG.info("[Pulse] Profiles on disk: {}", this.profiles.keySet());
            String autosave = readAutosave();
            if (autosave != null && !autosave.isBlank()) {
                applyJson(autosave);
                this.profiles.put(this.activeProfile, autosave);
                z = true;
                logLoadSummary(AUTOSAVE_FILE, autosave);
            } else if (this.profiles.isEmpty()) {
                LOG.info("[Pulse] No config files found, using defaults");
            } else {
                String next = this.profiles.containsKey(this.activeProfile) ? this.activeProfile : this.profiles.keySet().iterator().next();
                applyProfile(next);
                logLoadSummary(next + ".json", this.profiles.get(next));
            }
            if (z) {
                return;
            }
            LOG.info("[Pulse] Creating initial {}", AUTOSAVE_FILE);
            flushSaveNow("init-migrate");
        } finally {
            this.applying = false;
        }
    }

    public void flushSaveNow(String str) {
        synchronized (this) {
            if (this.pendingSave != null) {
                this.pendingSave.cancel(false);
                this.pendingSave = null;
            }
        }
        if (this.applying) {
            LOG.debug("[Pulse] flushSaveNow skipped (applying): {}", str);
        } else {
            LOG.debug("[Pulse] flushSaveNow: {}", str);
            writeStateToDisk();
        }
    }

    public void requestSave(String str) {
        if (this.applying) {
            LOG.debug("[Pulse] Autosave skipped (applying): {}", str);
            return;
        }
        LOG.debug("[Pulse] Autosave scheduled in {}ms: {}", Long.valueOf(SAVE_DEBOUNCE_MS), str);
        synchronized (this) {
            if (this.pendingSave != null) {
                this.pendingSave.cancel(false);
            }
            this.pendingSave = this.saveExecutor.schedule(this::flushSave, SAVE_DEBOUNCE_MS, TimeUnit.MILLISECONDS);
        }
    }

    public void requestSave() {
        requestSave("unspecified");
    }

    public void saveCurrentState() {
        requestSave("saveCurrentState");
    }

    private void flushSave() {
        if (this.applying) {
            LOG.debug("[Pulse] flushSave skipped (applying)");
        } else {
            writeStateToDisk();
        }
    }

    private void writeStateToDisk() {
        if (this.applying) {
            LOG.debug("[Pulse] writeStateToDisk skipped (applying)");
            return;
        }
        try {
            String strSerializeState = serializeState();
            this.profiles.put(this.activeProfile, strSerializeState);
            Path pathWriteAutosave = writeAutosave(strSerializeState);
            Path pathWriteToDisk = writeToDisk(this.activeProfile, strSerializeState);
            if (pathWriteAutosave == null || !Files.exists(pathWriteAutosave, new LinkOption[0])) {
                LOG.error("[Pulse] pulse.cfg was NOT written (check permissions): {}", getAutosavePath());
                return;
            }
            LOG.info("[Pulse] Verified on disk: {} ({} bytes)", pathWriteAutosave, Long.valueOf(Files.size(pathWriteAutosave)));
            if (pathWriteToDisk != null) {
                LOG.debug("[Pulse] Profile copy: {}", pathWriteToDisk);
            }
            logSaveSummary(strSerializeState);
        } catch (Exception e) {
            LOG.warn("[Pulse] Failed to save config", e);
        }
    }

    private void logLoadSummary(String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject(str2);
            LOG.info("[Pulse] Loaded {} ({} bytes, {} modules, {} hud)", str, Integer.valueOf(str2.length()), Integer.valueOf(jSONObject.optJSONObject("modules") != null ? jSONObject.getJSONObject("modules").length() : 0), Integer.valueOf(jSONObject.optJSONObject("hud") != null ? jSONObject.getJSONObject("hud").length() : 0));
        } catch (Exception e) {
            LOG.info("[Pulse] Loaded {} ({} bytes)", str, Integer.valueOf(str2 != null ? str2.length() : 0));
        }
    }

    private void logSaveSummary(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            int length = jSONObject.optJSONObject("modules") != null ? jSONObject.getJSONObject("modules").length() : 0;
            int i = 0;
            if (jSONObject.has("modules")) {
                JSONObject jSONObject2 = jSONObject.getJSONObject("modules");
                Iterator it = jSONObject2.keySet().iterator();
                while (it.hasNext()) {
                    if (jSONObject2.getJSONObject((String) it.next()).optBoolean("enabled", false)) {
                        i++;
                    }
                }
            }
            LOG.info("[Pulse] Saved {} ({} bytes, {} modules, {} enabled, {} hud) -> {}", AUTOSAVE_FILE, Integer.valueOf(str.length()), Integer.valueOf(length), Integer.valueOf(i), Integer.valueOf(jSONObject.optJSONObject("hud") != null ? jSONObject.getJSONObject("hud").length() : 0), getAutosavePath());
        } catch (Exception e) {
            LOG.info("[Pulse] Saved {} -> {}", AUTOSAVE_FILE, getAutosavePath());
        }
    }

    public Set<String> profileNames() {
        return Collections.unmodifiableSet(this.profiles.keySet());
    }

    public String activeProfile() {
        return this.activeProfile;
    }

    public void createProfile(String str, Runnable runnable, Consumer<String> consumer) throws JSONException {
        String strSanitizeName = sanitizeName(str);
        if (strSanitizeName.isEmpty()) {
            if (consumer != null) {
                consumer.accept("Имя профиля пустое");
                return;
            }
            return;
        }
        if (this.profiles.containsKey(strSanitizeName)) {
            if (consumer != null) {
                consumer.accept("Профиль '" + strSanitizeName + "' уже существует");
                return;
            }
            return;
        }
        String strSerializeState = serializeState();
        this.profiles.put(strSanitizeName, strSerializeState);
        try {
            writeToDisk(strSanitizeName, strSerializeState);
            if (runnable != null) {
                runnable.run();
            }
        } catch (IOException e) {
            LOG.warn("[Pulse] Cannot create profile {}", strSanitizeName, e);
            if (consumer != null) {
                consumer.accept(e.getMessage());
            }
        }
    }

    public void loadProfile(String str, Runnable runnable, Consumer<String> consumer) {
        if (!this.profiles.containsKey(str)) {
            if (consumer != null) {
                consumer.accept("Профиль '" + str + "' не найден");
                return;
            }
            return;
        }
        this.applying = true;
        try {
            applyProfile(str);
            this.activeProfile = str;
            this.applying = false;
            flushSaveNow("loadProfile-" + str);
            if (runnable != null) {
                runnable.run();
            }
        } catch (Throwable th) {
            this.applying = false;
            throw th;
        }
    }

    public void deleteProfile(String str, Runnable runnable, Consumer<String> consumer) {
        if (!this.profiles.containsKey(str)) {
            if (consumer != null) {
                consumer.accept("Профиль '" + str + "' не найден");
                return;
            }
            return;
        }
        this.profiles.remove(str);
        deleteFromDisk(str);
        if (this.activeProfile.equals(str)) {
            this.activeProfile = this.profiles.isEmpty() ? DEFAULT_NAME : this.profiles.keySet().iterator().next();
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    public void renameProfile(String str, String str2, Runnable runnable, Consumer<String> consumer) {
        String strSanitizeName = sanitizeName(str2);
        if (!this.profiles.containsKey(str)) {
            if (consumer != null) {
                consumer.accept("Профиль '" + str + "' не найден");
                return;
            }
            return;
        }
        if (this.profiles.containsKey(strSanitizeName)) {
            if (consumer != null) {
                consumer.accept("Профиль '" + strSanitizeName + "' уже существует");
                return;
            }
            return;
        }
        String strRemove = this.profiles.remove(str);
        this.profiles.put(strSanitizeName, strRemove);
        deleteFromDisk(str);
        try {
            writeToDisk(strSanitizeName, strRemove);
            if (this.activeProfile.equals(str)) {
                this.activeProfile = strSanitizeName;
            }
            if (runnable != null) {
                runnable.run();
            }
        } catch (IOException e) {
            LOG.warn("[Pulse] Cannot rename profile {} -> {}", str, strSanitizeName, e);
            if (consumer != null) {
                consumer.accept(e.getMessage());
            }
        }
    }

    public String getProfileData(String str) {
        return this.profiles.getOrDefault(str, "{}");
    }

    private String serializeState() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("version", 1);
        JSONObject jSONObject2 = new JSONObject();
        for (ClientModule clientModule : ModuleRegistry.all()) {
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("enabled", clientModule.isEnabled());
            jSONObject3.put("bindKey", clientModule.bindKey());
            jSONObject3.put("settings", serializeSettings(clientModule.settings()));
            jSONObject2.put(clientModule.name(), jSONObject3);
        }
        jSONObject.put("modules", jSONObject2);
        jSONObject.put("hud", serializeHud());
        return jSONObject.toString(2);
    }

    private JSONObject serializeSettings(List<Setting<?>> list) {
        JSONObject jSONObject = new JSONObject();
        for (Setting<?> setting : list) {
            if (!(setting instanceof SettingGroup)) {
                String strF = setting.f();
                try {
                    if (setting instanceof BooleanSetting) {
                        BooleanSetting booleanSetting = (BooleanSetting) setting;
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("type", "boolean");
                        jSONObject2.put("value", booleanSetting.get());
                        jSONObject.put(strF, jSONObject2);
                    } else if (setting instanceof SliderSetting) {
                        SliderSetting sliderSetting = (SliderSetting) setting;
                        JSONObject jSONObject3 = new JSONObject();
                        jSONObject3.put("type", "slider");
                        jSONObject3.put("value", sliderSetting.get());
                        jSONObject.put(strF, jSONObject3);
                    } else if (setting instanceof ColorSetting) {
                        ColorSetting colorSetting = (ColorSetting) setting;
                        JSONObject jSONObject4 = new JSONObject();
                        jSONObject4.put("type", "color");
                        jSONObject4.put("hue", colorSetting.c());
                        jSONObject4.put("sat", colorSetting.d());
                        jSONObject4.put("bri", colorSetting.e());
                        jSONObject.put(strF, jSONObject4);
                    } else if (setting instanceof KeySetting) {
                        KeySetting keySetting = (KeySetting) setting;
                        JSONObject jSONObject5 = new JSONObject();
                        jSONObject5.put("type", IconTextureRegistry.KEY);
                        jSONObject5.put("value", keySetting.a());
                        jSONObject.put(strF, jSONObject5);
                    } else if (setting instanceof ModeSetting) {
                        ModeSetting modeSetting = (ModeSetting) setting;
                        JSONObject jSONObject6 = new JSONObject();
                        jSONObject6.put("type", "mode");
                        jSONObject6.put("value", modeSetting.k());
                        if (modeSetting.c()) {
                            JSONArray jSONArray = new JSONArray();
                            Iterator<Integer> it = modeSetting.e().iterator();
                            while (it.hasNext()) {
                                jSONArray.put(it.next().intValue());
                            }
                            jSONObject6.put("selected", jSONArray);
                        }
                        jSONObject.put(strF, jSONObject6);
                    } else if (setting instanceof TokenSetting) {
                        TokenSetting tokenSetting = (TokenSetting) setting;
                        JSONObject jSONObject7 = new JSONObject();
                        jSONObject7.put("type", "token");
                        jSONObject7.put("value", tokenSetting.a());
                        jSONObject.put(strF, jSONObject7);
                    } else if (setting instanceof ItemToggleSetting) {
                        ItemToggleSetting itemToggleSetting = (ItemToggleSetting) setting;
                        JSONObject jSONObject8 = new JSONObject();
                        jSONObject8.put("type", "itemtoggle");
                        jSONObject8.put("enabled", itemToggleSetting.get());
                        Color colorD = itemToggleSetting.d();
                        jSONObject8.put("color", colorD != null ? colorD.getRGB() : -1);
                        jSONObject.put(strF, jSONObject8);
                    }
                } catch (Exception e) {
                }
            }
        }
        return jSONObject;
    }

    private JSONObject serializeHud() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        HudElementManager hudElementManagerA = HudElementManager.a();
        serializeHudElement(jSONObject, "potions", hudElementManagerA.i());
        serializeHudElement(jSONObject, "hotkeys", hudElementManagerA.j());
        serializeHudElement(jSONObject, "cooldowns", hudElementManagerA.k());
        serializeHudElement(jSONObject, "target", hudElementManagerA.l());
        return jSONObject;
    }

    private void serializeHudElement(JSONObject jSONObject, String str, HudElement hudElement) throws JSONException {
        if (hudElement == null) {
            return;
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("x", hudElement.t().a());
        jSONObject2.put("y", hudElement.t().b());
        jSONObject2.put("scale", hudElement.g());
        jSONObject.put(str, jSONObject2);
    }

    private void applyProfile(String str) {
        applyJson(this.profiles.get(str));
    }

    private void applyJson(String str) {
        if (str == null || str.isEmpty()) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has("modules")) {
                deserializeModules(jSONObject.getJSONObject("modules"));
            }
            if (jSONObject.has("hud")) {
                deserializeHud(jSONObject.getJSONObject("hud"));
            }
        } catch (JSONException e) {
            LOG.warn("[Pulse] Failed to parse config JSON", e);
        }
    }

    private void deserializeModules(JSONObject jSONObject) {
        for (ClientModule clientModule : ModuleRegistry.all()) {
            if (jSONObject.has(clientModule.name())) {
                try {
                    JSONObject jSONObject2 = jSONObject.getJSONObject(clientModule.name());
                    if (jSONObject2.has("enabled")) {
                        clientModule.setEnabledStateQuiet(jSONObject2.getBoolean("enabled"));
                    }
                    if (jSONObject2.has("bindKey")) {
                        clientModule.setBindKeyQuiet(jSONObject2.getInt("bindKey"));
                    }
                    if (jSONObject2.has("settings")) {
                        deserializeSettings(clientModule.settings(), jSONObject2.getJSONObject("settings"));
                    }
                } catch (Exception e) {
                }
            }
        }
    }

    private void deserializeSettings(List<Setting<?>> list, JSONObject jSONObject) {
        for (Setting<?> setting : list) {
            if (setting instanceof SettingGroup) {
                continue;
            }
            String name = setting.f();
            if (!jSONObject.has(name)) {
                continue;
            }
            try {
                JSONObject entry = jSONObject.getJSONObject(name);
                if (setting instanceof BooleanSetting) {
                    ((BooleanSetting) setting).set(entry.getBoolean("value"));
                } else if (setting instanceof SliderSetting) {
                    ((SliderSetting) setting).set((float) entry.getDouble("value"));
                } else if (setting instanceof ColorSetting) {
                    ((ColorSetting) setting).setHsb(
                            (float) entry.getDouble("hue"),
                            (float) entry.getDouble("sat"),
                            (float) entry.getDouble("bri"));
                } else if (setting instanceof KeySetting) {
                    ((KeySetting) setting).setKey(entry.getInt("value"));
                } else if (setting instanceof ModeSetting) {
                    ModeSetting modeSetting = (ModeSetting) setting;
                    modeSetting.select(entry.getInt("value"));
                    if (modeSetting.c() && entry.has("selected")) {
                        JSONArray arr = entry.getJSONArray("selected");
                        java.util.HashSet<Integer> set = new java.util.HashSet<>();
                        for (int i = 0; i < arr.length(); i++) {
                            set.add(arr.getInt(i));
                        }
                        modeSetting.setSelectedIndices(set);
                    }
                } else if (setting instanceof TokenSetting) {
                    ((TokenSetting) setting).set(entry.getString("value"));
                } else if (setting instanceof ItemToggleSetting) {
                    ItemToggleSetting itemToggleSetting = (ItemToggleSetting) setting;
                    if (entry.has("enabled")) {
                        itemToggleSetting.set(entry.getBoolean("enabled"));
                    }
                    if (entry.has("color")) {
                        itemToggleSetting.setColor(new Color(entry.getInt("color"), true));
                    }
                }
            } catch (Exception e) {
                LOG.debug("[Pulse] Failed to apply setting '{}'", name, e);
            }
        }
    }

    private void deserializeHud(JSONObject jSONObject) {
        HudElementManager hudElementManagerA = HudElementManager.a();
        MinecraftClient MinecraftClientVarGetInstance = MinecraftClient.getInstance();
        float fGetFramebufferWidth = MinecraftClientVarGetInstance.getWindow().getFramebufferWidth() / 2.0f;
        float fGetFramebufferHeight = MinecraftClientVarGetInstance.getWindow().getFramebufferHeight() / 2.0f;
        applyHudElement(jSONObject, "potions", hudElementManagerA.i(), fGetFramebufferWidth, fGetFramebufferHeight);
        applyHudElement(jSONObject, "hotkeys", hudElementManagerA.j(), fGetFramebufferWidth, fGetFramebufferHeight);
        applyHudElement(jSONObject, "cooldowns", hudElementManagerA.k(), fGetFramebufferWidth, fGetFramebufferHeight);
        applyHudElement(jSONObject, "target", hudElementManagerA.l(), fGetFramebufferWidth, fGetFramebufferHeight);
        hudElementManagerA.d();
    }

    private void applyHudElement(JSONObject jSONObject, String str, HudElement hudElement, float f, float f2) {
        if (hudElement == null || !jSONObject.has(str)) {
            return;
        }
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject(str);
            float f3 = (float) jSONObject2.getDouble("x");
            float f4 = (float) jSONObject2.getDouble("y");
            hudElement.t().a(f3);
            hudElement.t().b(f4);
            hudElement.b();
            if (f > 1.0f && f2 > 1.0f) {
                hudElement.a(hudElement.t().a(hudElement.n(), f));
                hudElement.b(hudElement.t().b(hudElement.o(), f2));
                hudElement.b(f, f2);
            }
        } catch (Exception e) {
        }
    }

    private Path getConfigDir() {
        String str = System.getenv("APPDATA");
        if (str != null && !str.isBlank()) {
            return Path.of(str, APPDATA_DIR, "config");
        }
        MinecraftClient MinecraftClientVarGetInstance = MinecraftClient.getInstance();
        return MinecraftClientVarGetInstance != null ? MinecraftClientVarGetInstance.runDirectory.toPath().resolve("config").resolve("pulse") : Path.of(System.getProperty("user.home"), APPDATA_DIR, "config");
    }

    private Path getLegacyConfigDir() {
        MinecraftClient MinecraftClientVarGetInstance = MinecraftClient.getInstance();
        if (MinecraftClientVarGetInstance == null) {
            return null;
        }
        return MinecraftClientVarGetInstance.runDirectory.toPath().resolve("config").resolve("pulse");
    }

    private void migrateLegacyConfigIfNeeded() {
        Path legacyConfigDir = getLegacyConfigDir();
        Path configDir = getConfigDir();
        if (legacyConfigDir == null || !Files.isDirectory(legacyConfigDir, new LinkOption[0])) {
            return;
        }
        try {
            Files.createDirectories(configDir, new FileAttribute[0]);
            Path pathResolve = legacyConfigDir.resolve(AUTOSAVE_FILE);
            Path pathResolve2 = configDir.resolve(AUTOSAVE_FILE);
            if (Files.exists(pathResolve, new LinkOption[0]) && !Files.exists(pathResolve2, new LinkOption[0])) {
                Files.copy(pathResolve, pathResolve2, StandardCopyOption.REPLACE_EXISTING);
                LOG.info("[Pulse] Migrated {} -> {}", pathResolve, pathResolve2);
            }
            DirectoryStream<Path> directoryStreamNewDirectoryStream = Files.newDirectoryStream(legacyConfigDir, "*.json");
            try {
                for (Path path : directoryStreamNewDirectoryStream) {
                    Path pathResolve3 = configDir.resolve(path.getFileName());
                    if (!Files.exists(pathResolve3, new LinkOption[0])) {
                        Files.copy(path, pathResolve3, StandardCopyOption.REPLACE_EXISTING);
                        LOG.info("[Pulse] Migrated profile {}", path.getFileName());
                    }
                }
                if (directoryStreamNewDirectoryStream != null) {
                    directoryStreamNewDirectoryStream.close();
                }
            } finally {
            }
        } catch (IOException e) {
            LOG.warn("[Pulse] Legacy migration from {} failed", legacyConfigDir, e);
        }
    }

    private Path getAutosavePath() {
        return getConfigDir().resolve(AUTOSAVE_FILE);
    }

    private String readAutosave() {
        try {
            Path autosavePath = getAutosavePath();
            if (Files.exists(autosavePath, new LinkOption[0])) {
                return Files.readString(autosavePath, StandardCharsets.UTF_8);
            }
            return null;
        } catch (IOException e) {
            LOG.warn("[Pulse] Cannot read {}", getAutosavePath(), e);
            return null;
        }
    }

    private Path writeAutosave(String str) throws IOException {
        Path configDir = getConfigDir();
        Files.createDirectories(configDir, new FileAttribute[0]);
        Path pathResolve = configDir.resolve(AUTOSAVE_FILE);
        writeUtf8File(pathResolve, str);
        return pathResolve;
    }

    private static void writeUtf8File(Path path, String str) throws IOException {
        ByteBuffer byteBufferEncode = StandardCharsets.UTF_8.newEncoder().onMalformedInput(CodingErrorAction.REPLACE).onUnmappableCharacter(CodingErrorAction.REPLACE).encode(CharBuffer.wrap(str));
        byte[] bArr = new byte[byteBufferEncode.remaining()];
        byteBufferEncode.get(bArr);
        Files.write(path, bArr, StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING, StandardOpenOption.WRITE);
    }

    private void loadAllFromDisk() {
        this.profiles.clear();
        try {
            Path configDir = getConfigDir();
            Files.createDirectories(configDir, new FileAttribute[0]);
            if (!Files.exists(configDir, new LinkOption[0])) {
                return;
            }
            DirectoryStream<Path> directoryStreamNewDirectoryStream = Files.newDirectoryStream(configDir, "*.json");
            try {
                for (Path path : directoryStreamNewDirectoryStream) {
                    String string = path.getFileName().toString();
                    String strSubstring = string.substring(0, string.length() - FILE_EXT.length());
                    try {
                        this.profiles.put(strSubstring, Files.readString(path, StandardCharsets.UTF_8));
                    } catch (IOException e) {
                        LOG.warn("[Pulse] Cannot read profile {}", path, e);
                    }
                }
                if (directoryStreamNewDirectoryStream != null) {
                    directoryStreamNewDirectoryStream.close();
                }
            } finally {
            }
        } catch (IOException e2) {
            LOG.warn("[Pulse] Cannot list config dir {}", getConfigDir(), e2);
        }
        if (this.profiles.containsKey(DEFAULT_NAME)) {
            return;
        }
        this.profiles.put(DEFAULT_NAME, "{}");
    }

    private Path writeToDisk(String str, String str2) throws IOException {
        Path configDir = getConfigDir();
        Files.createDirectories(configDir, new FileAttribute[0]);
        Path pathResolve = configDir.resolve(sanitizeName(str) + ".json");
        writeUtf8File(pathResolve, str2);
        return pathResolve;
    }

    private void deleteFromDisk(String str) {
        try {
            Files.deleteIfExists(getConfigDir().resolve(sanitizeName(str) + ".json"));
        } catch (IOException e) {
            LOG.warn("[Pulse] Cannot delete profile {}", str, e);
        }
    }

    private static String sanitizeName(String str) {
        return str == null ? "" : str.trim().replaceAll("[/\\\\:*?\"<>| ]", "_");
    }

    public List<ConfigEntry> toConfigEntries() {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, String> entry : this.profiles.entrySet()) {
            arrayList.add(new ConfigEntry(entry.getKey(), entry.getValue()));
        }
        return arrayList;
    }
}
