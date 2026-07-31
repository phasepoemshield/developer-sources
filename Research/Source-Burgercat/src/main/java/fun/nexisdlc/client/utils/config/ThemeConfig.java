package fun.nexisdlc.client.utils.config;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import fun.nexisdlc.ClientContainer;
import fun.nexisdlc.client.ClientColors;
import fun.nexisdlc.modules.impl.render.Interface;
import fun.nexisdlc.ui.HudTheme;
import net.minecraft.client.MinecraftClient;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

public final class ThemeConfig {
    public static final String RAINBOW_NAME = "Радужная";
    private static final String DEFAULT_THEME_NAME = "Стандартная";

    private static final Gson GSON = new GsonBuilder().setPrettyPrinting().create();
    private static final String THEMES_DIR_NAME = "themes";
    private static final String CURRENT_FILE_NAME = "current.json";
    private static final List<Theme> THEMES = new ArrayList<>();
    private static String currentThemeName = DEFAULT_THEME_NAME;
    private static boolean dirty;

    private ThemeConfig() {
    }

    public static void load() {
        THEMES.clear();
        currentThemeName = DEFAULT_THEME_NAME;
        ensureDefaultThemes();

        migrateOldThemeJson();

        File dir = getThemesDir();
        if (dir != null && dir.exists()) {
            loadThemesFromDir(dir);
        }

        ensureDefaultThemes();
        Theme current = getCurrentTheme();
        if (current == null) {
            currentThemeName = DEFAULT_THEME_NAME;
            current = getCurrentTheme();
        }
        applyTheme(current);
    }

    public static void reload() {
        String previousTheme = currentThemeName;
        THEMES.clear();
        currentThemeName = DEFAULT_THEME_NAME;
        ensureDefaultThemes();

        File dir = getThemesDir();
        if (dir != null && dir.exists()) {
            loadThemesFromDir(dir);
        }

        ensureDefaultThemes();
        Theme current = getCurrentTheme();
        if (current == null) {
            currentThemeName = DEFAULT_THEME_NAME;
            current = getCurrentTheme();
        }
        applyTheme(current);
    }

    private static void loadThemesFromDir(File dir) {
        File[] files = dir.listFiles((d, name) -> name.endsWith(".json") && !name.equals(CURRENT_FILE_NAME));
        if (files != null) {
            for (File file : files) {
                try (FileReader reader = new FileReader(file)) {
                    JsonObject object = JsonParser.parseReader(reader).getAsJsonObject();
                    Theme theme = parseTheme(object);
                    if (theme != null && !theme.isReservedName()) {
                        addOrReplaceTheme(theme);
                    }
                } catch (Exception ignored) {
                }
            }
        }

        File currentFile = new File(dir, CURRENT_FILE_NAME);
        if (currentFile.exists()) {
            try (FileReader reader = new FileReader(currentFile)) {
                JsonObject object = JsonParser.parseReader(reader).getAsJsonObject();
                if (object.has("current")) {
                    currentThemeName = safeString(object.get("current"), currentThemeName);
                }
            } catch (Exception ignored) {
            }
        }
    }

    private static void migrateOldThemeJson() {
        MinecraftClient client = MinecraftClient.getInstance();
        if (client == null) {
            return;
        }
        File oldFile = new File(new File(client.runDirectory, ClientContainer.getName()), "theme.json");
        if (!oldFile.exists()) {
            return;
        }

        try (FileReader reader = new FileReader(oldFile)) {
            JsonObject object = JsonParser.parseReader(reader).getAsJsonObject();
            String current = safeString(object.get("current"), null);

            if (object.has("themes") && object.get("themes").isJsonArray()) {
                com.google.gson.JsonArray array = object.getAsJsonArray("themes");
                File dir = getThemesDir();
                if (dir != null) {
                    if (!dir.exists()) {
                        dir.mkdirs();
                    }
                    for (com.google.gson.JsonElement element : array) {
                        if (element.isJsonObject()) {
                            JsonObject themeObj = element.getAsJsonObject();
                            Theme theme = parseTheme(themeObj);
                            if (theme != null && !theme.isReservedName()) {
                                writeThemeFile(dir, theme);
                            }
                        }
                    }
                    if (current != null) {
                        JsonObject currentObj = new JsonObject();
                        currentObj.addProperty("current", current);
                        try (FileWriter writer = new FileWriter(new File(dir, CURRENT_FILE_NAME))) {
                            writer.write(GSON.toJson(currentObj));
                        } catch (IOException ignored) {
                        }
                    }
                }
            } else if (hasLegacyColors(object)) {
                Theme theme = parseLegacyTheme(object);
                if (theme != null) {
                    File dir = getThemesDir();
                    if (dir != null) {
                        if (!dir.exists()) {
                            dir.mkdirs();
                        }
                        writeThemeFile(dir, theme);
                        JsonObject currentObj = new JsonObject();
                        currentObj.addProperty("current", theme.name);
                        try (FileWriter writer = new FileWriter(new File(dir, CURRENT_FILE_NAME))) {
                            writer.write(GSON.toJson(currentObj));
                        } catch (IOException ignored) {
                        }
                    }
                }
            }

            oldFile.delete();
        } catch (Exception ignored) {
        }
    }

    public static void save() {
        File dir = getThemesDir();
        if (dir == null) {
            return;
        }
        if (!dir.exists()) {
            dir.mkdirs();
        }

        if (dirty) {
            saveCurrentTheme(true);
            dirty = false;
        }

        for (Theme theme : THEMES) {
            if (!theme.builtin && !theme.rainbow) {
                writeThemeFile(dir, theme);
            }
        }

        List<String> validFileNames = new ArrayList<>();
        for (Theme theme : THEMES) {
            if (!theme.builtin && !theme.rainbow) {
                validFileNames.add(themeNameToFileName(theme.name));
            }
        }

        File[] existingFiles = dir.listFiles((d, name) -> name.endsWith(".json") && !name.equals(CURRENT_FILE_NAME));
        if (existingFiles != null) {
            for (File file : existingFiles) {
                if (!validFileNames.contains(file.getName())) {
                    file.delete();
                }
            }
        }

        File currentFile = new File(dir, CURRENT_FILE_NAME);
        JsonObject currentObj = new JsonObject();
        currentObj.addProperty("current", currentThemeName);
        try (FileWriter writer = new FileWriter(currentFile)) {
            writer.write(GSON.toJson(currentObj));
        } catch (IOException ignored) {
        }
    }

    private static void writeThemeFile(File dir, Theme theme) {
        File file = new File(dir, themeNameToFileName(theme.name));
        JsonObject obj = serializeTheme(theme);
        try (FileWriter writer = new FileWriter(file)) {
            writer.write(GSON.toJson(obj));
        } catch (IOException ignored) {
        }
    }

    private static void deleteThemeFile(Theme theme) {
        File dir = getThemesDir();
        if (dir == null || !dir.exists()) {
            return;
        }
        File file = new File(dir, themeNameToFileName(theme.name));
        if (file.exists()) {
            file.delete();
        }
    }

    private static void renameThemeFile(String oldName, String newName) {
        File dir = getThemesDir();
        if (dir == null || !dir.exists()) {
            return;
        }
        File oldFile = new File(dir, themeNameToFileName(oldName));
        File newFile = new File(dir, themeNameToFileName(newName));
        if (oldFile.exists()) {
            oldFile.renameTo(newFile);
        }
    }

    private static String themeNameToFileName(String name) {
        return sanitizeFileName(name) + ".json";
    }

    private static String fileNameToThemeName(String fileName) {
        if (fileName.endsWith(".json")) {
            return fileName.substring(0, fileName.length() - 5);
        }
        return fileName;
    }

    private static String sanitizeFileName(String name) {
        return name.replaceAll("[\\\\/:*?\"<>|]", "_").trim();
    }

    public static List<Theme> getThemes() {
        return Collections.unmodifiableList(THEMES);
    }

    public static Theme getCurrentTheme() {
        return getTheme(currentThemeName);
    }

    public static String getCurrentThemeName() {
        return currentThemeName;
    }

    public static Theme getTheme(String name) {
        if (name == null) {
            return null;
        }
        for (Theme theme : THEMES) {
            if (name.equalsIgnoreCase(theme.name)) {
                return theme;
            }
        }
        return null;
    }

    public static File getThemesDir() {
        MinecraftClient client = MinecraftClient.getInstance();
        if (client == null) {
            return null;
        }
        return new File(new File(client.runDirectory, ClientContainer.getName()), THEMES_DIR_NAME);
    }

    public static void applyTheme(Theme theme) {
        if (theme == null) {
            return;
        }

        currentThemeName = theme.name;
        if (theme.rainbow) {
            ClientColors.clearCustomTheme();
            HudTheme.setCurrent(HudTheme.MIDNIGHT);
            HudTheme.setRainbow(true, Interface.rainbowSpeed != null ? Interface.rainbowSpeed.get() : 1.0f);
            if (Interface.hudTheme != null) {
                Interface.hudTheme.set("RAINBOW");
            }
        } else {
            HudTheme.setRainbow(false, Interface.rainbowSpeed != null ? Interface.rainbowSpeed.get() : 1.0f);
            ClientColors.setThemeColors(theme.background, theme.text, theme.icon, theme.gradientStart, theme.gradientEnd);
        }
        dirty = false;
    }

    public static Theme saveCurrentTheme(boolean updateModified) {
        Theme theme = getCurrentTheme();
        if (theme == null) {
            theme = createTheme(currentThemeName, updateModified);
        }
        if (theme.builtin || theme.rainbow) {
            return theme;
        }

        theme.background = ClientColors.BACKGROUND.getRGB();
        theme.text = ClientColors.TEXT.getRGB();
        theme.icon = ClientColors.ICON.getRGB();
        theme.gradientStart = ClientColors.GRADIENT_START.getRGB();
        theme.gradientEnd = ClientColors.GRADIENT_END.getRGB();
        if (updateModified) {
            theme.modified = System.currentTimeMillis();
        }

        File dir = getThemesDir();
        if (dir != null) {
            if (!dir.exists()) {
                dir.mkdirs();
            }
            writeThemeFile(dir, theme);
        }

        return theme;
    }

    public static Theme createThemeFromCurrent(String baseName) {
        String name = createUniqueName(sanitizeCustomThemeName(baseName));
        Theme theme = createTheme(name, true);
        currentThemeName = theme.name;
        return theme;
    }

    public static void markDirty() {
        Theme current = getCurrentTheme();
        if (current != null && !current.builtin && !current.rainbow) {
            dirty = true;
        }
    }

    public static void clearDirty() {
        dirty = false;
    }

    public static void removeTheme(Theme theme) {
        if (theme == null || theme.builtin || theme.rainbow) {
            return;
        }
        THEMES.remove(theme);
        deleteThemeFile(theme);
        if (currentThemeName != null && currentThemeName.equalsIgnoreCase(theme.name)) {
            currentThemeName = DEFAULT_THEME_NAME;
            applyTheme(getCurrentTheme());
        }
    }

    public static void renameTheme(Theme theme, String newName) {
        if (theme == null || theme.builtin || theme.rainbow || newName == null || newName.trim().isEmpty()) {
            return;
        }
        String oldName = theme.name;
        String sanitized = createUniqueName(sanitizeCustomThemeName(newName));
        renameThemeFile(oldName, sanitized);
        theme.name = sanitized;
        if (currentThemeName.equalsIgnoreCase(oldName)) {
            currentThemeName = theme.name;
        }
    }

    public static boolean isEditable(Theme theme) {
        return theme != null && !theme.builtin && !theme.rainbow;
    }

    private static Theme createTheme(String name, boolean updateModified) {
        Theme theme = new Theme();
        theme.name = sanitizeCustomThemeName(name);
        theme.background = ClientColors.BACKGROUND.getRGB();
        theme.text = ClientColors.TEXT.getRGB();
        theme.icon = ClientColors.ICON.getRGB();
        theme.gradientStart = ClientColors.GRADIENT_START.getRGB();
        theme.gradientEnd = ClientColors.GRADIENT_END.getRGB();
        theme.modified = updateModified ? System.currentTimeMillis() : 0L;
        THEMES.add(theme);

        File dir = getThemesDir();
        if (dir != null) {
            if (!dir.exists()) {
                dir.mkdirs();
            }
            writeThemeFile(dir, theme);
        }

        return theme;
    }

    private static void ensureDefaultThemes() {
        addBuiltinTheme(DEFAULT_THEME_NAME, 0xFF04000C, 0xFFFFFFFF, 0xFF8879CF, 0xFF8879CF, 0xFF6554B6);
        addBuiltinTheme("Северное сияние", 0xFF071019, 0xFFEAF7FF, 0xFF3DE6C4, 0xFF3DE6C4, 0xFF6C7DFF);
        addBuiltinTheme("Малиновый неон", 0xFF12060E, 0xFFFFECF5, 0xFFFF3D8A, 0xFFFF3D8A, 0xFF7A5CFF);
        addBuiltinTheme("Киберлайм", 0xFF071108, 0xFFEFFFF0, 0xFF7CFF4F, 0xFF7CFF4F, 0xFF00D0A2);
        addBuiltinTheme("Глубокий океан", 0xFF05121C, 0xFFE8F8FF, 0xFF27B9FF, 0xFF27B9FF, 0xFF315BFF);
        addBuiltinTheme("Солнечный импульс", 0xFF160D04, 0xFFFFF4E1, 0xFFFFB02E, 0xFFFFB02E, 0xFFFF4B2E);
        addBuiltinTheme("Ледяная мята", 0xFF071214, 0xFFE9FFFB, 0xFF75FFE7, 0xFF75FFE7, 0xFF8BA7FF);
        addBuiltinTheme("Графит", 0xFF0D0E12, 0xFFF1F3F8, 0xFFB8C0D8, 0xFFB8C0D8, 0xFF6F7A96);
        addBuiltinTheme("Сакура", 0xFF140A12, 0xFFFFEFF7, 0xFFFF78B7, 0xFFFF78B7, 0xFFFFB16D);
        if (getTheme(RAINBOW_NAME) == null) {
            Theme rainbow = fromHudTheme(HudTheme.MIDNIGHT);
            rainbow.name = RAINBOW_NAME;
            rainbow.rainbow = true;
            THEMES.add(rainbow);
        }
    }

    private static void addBuiltinTheme(String name, int background, int text, int icon, int gradientStart, int gradientEnd) {
        if (getTheme(name) != null) {
            return;
        }
        Theme theme = new Theme();
        theme.name = name;
        theme.modified = 0L;
        theme.background = background;
        theme.text = text;
        theme.icon = icon;
        theme.gradientStart = gradientStart;
        theme.gradientEnd = gradientEnd;
        theme.builtin = true;
        THEMES.add(theme);
    }

    private static Theme fromHudTheme(HudTheme hudTheme) {
        Theme theme = new Theme();
        theme.name = hudTheme.name();
        theme.modified = 0L;
        theme.background = pack(hudTheme.bgR, hudTheme.bgG, hudTheme.bgB, hudTheme.bgA);
        theme.text = pack(hudTheme.textR, hudTheme.textG, hudTheme.textB, hudTheme.textA);
        theme.icon = pack(hudTheme.accentR, hudTheme.accentG, hudTheme.accentB, hudTheme.accentA);
        theme.gradientStart = pack(hudTheme.accentR, hudTheme.accentG, hudTheme.accentB, hudTheme.accentA);
        theme.gradientEnd = pack(hudTheme.accentHoverR, hudTheme.accentHoverG, hudTheme.accentHoverB, hudTheme.accentHoverA);
        theme.builtin = true;
        return theme;
    }

    private static void addOrReplaceTheme(Theme theme) {
        Theme existing = getTheme(theme.name);
        if (existing != null && !existing.builtin && !existing.rainbow) {
            THEMES.remove(existing);
        }
        THEMES.add(theme);
    }

    private static String createUniqueName(String base) {
        String clean = sanitizeCustomThemeName(base);
        String candidate = clean;
        int idx = 1;
        while (getTheme(candidate) != null) {
            candidate = clean + " " + idx;
            idx++;
        }
        return candidate;
    }

    private static String sanitizeCustomThemeName(String value) {
        String clean = value == null || value.isBlank() ? "Theme" : value.trim();
        if (RAINBOW_NAME.equalsIgnoreCase(clean) || "RAINBOW".equalsIgnoreCase(clean)) {
            return "Своя радужная";
        }
        for (HudTheme theme : HudTheme.values()) {
            if (theme.name().equalsIgnoreCase(clean)) {
                return clean + " Custom";
            }
        }
        return clean;
    }

    private static Theme parseLegacyTheme(JsonObject object) {
        Theme theme = new Theme();
        theme.name = sanitizeCustomThemeName(safeString(object.get("current"), "Theme"));
        theme.modified = System.currentTimeMillis();
        theme.background = readColor(object, "background", ClientColors.BACKGROUND.getRGB());
        theme.text = readColor(object, "text", ClientColors.TEXT.getRGB());
        theme.icon = readColor(object, "icon", ClientColors.ICON.getRGB());
        theme.gradientStart = readColor(object, "gradient_start", ClientColors.GRADIENT_START.getRGB());
        theme.gradientEnd = readColor(object, "gradient_end", ClientColors.GRADIENT_END.getRGB());
        return theme;
    }

    private static boolean hasLegacyColors(JsonObject object) {
        return object != null && (object.has("background") || object.has("text")
                || object.has("icon") || object.has("gradient_start") || object.has("gradient_end"));
    }

    private static Theme parseTheme(JsonObject object) {
        Theme theme = new Theme();
        theme.name = sanitizeCustomThemeName(safeString(object.get("name"), "Theme"));
        theme.modified = safeLong(object.get("modified"), System.currentTimeMillis());
        theme.background = readColor(object, "background", ClientColors.BACKGROUND.getRGB());
        theme.text = readColor(object, "text", ClientColors.TEXT.getRGB());
        theme.icon = readColor(object, "icon", ClientColors.ICON.getRGB());
        theme.gradientStart = readColor(object, "gradient_start", ClientColors.GRADIENT_START.getRGB());
        theme.gradientEnd = readColor(object, "gradient_end", ClientColors.GRADIENT_END.getRGB());
        return theme;
    }

    private static JsonObject serializeTheme(Theme theme) {
        JsonObject obj = new JsonObject();
        obj.addProperty("name", theme.name);
        obj.addProperty("modified", theme.modified);
        obj.addProperty("background", theme.background);
        obj.addProperty("text", theme.text);
        obj.addProperty("icon", theme.icon);
        obj.addProperty("gradient_start", theme.gradientStart);
        obj.addProperty("gradient_end", theme.gradientEnd);
        return obj;
    }

    private static String safeString(JsonElement element, String fallback) {
        try {
            String value = element == null ? null : element.getAsString();
            return value == null || value.isBlank() ? fallback : value.trim();
        } catch (Exception ignored) {
            return fallback;
        }
    }

    private static long safeLong(JsonElement element, long fallback) {
        try {
            return element == null ? fallback : element.getAsLong();
        } catch (Exception ignored) {
            return fallback;
        }
    }

    private static int readColor(JsonObject object, String key, int fallback) {
        try {
            return object.has(key) ? object.get(key).getAsInt() : fallback;
        } catch (Exception ignored) {
            return fallback;
        }
    }

    private static int pack(float r, float g, float b, float a) {
        return (clamp255(a) << 24) | (clamp255(r) << 16) | (clamp255(g) << 8) | clamp255(b);
    }

    private static int clamp255(float value) {
        return Math.max(0, Math.min(255, Math.round(value * 255f)));
    }

    public static final class Theme {
        public String name;
        public long modified;
        public int background;
        public int text;
        public int icon;
        public int gradientStart;
        public int gradientEnd;
        public boolean builtin;
        public boolean rainbow;

        public String formattedDate() {
            if (builtin || rainbow || modified <= 0L) {
                return "Default";
            }
            java.time.Instant instant = java.time.Instant.ofEpochMilli(modified);
            java.time.ZoneId zone = java.time.ZoneId.systemDefault();
            java.time.format.DateTimeFormatter fmt =
                    java.time.format.DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm", Locale.ENGLISH);
            return fmt.format(instant.atZone(zone));
        }

        private boolean isReservedName() {
            if (RAINBOW_NAME.equalsIgnoreCase(name) || "RAINBOW".equalsIgnoreCase(name) || DEFAULT_THEME_NAME.equalsIgnoreCase(name)) {
                return true;
            }
            for (HudTheme theme : HudTheme.values()) {
                if (theme.name().equalsIgnoreCase(name)) {
                    return true;
                }
            }
            return false;
        }
    }
}
