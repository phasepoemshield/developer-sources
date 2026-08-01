package fun.wonderful.api.storages.implement;

import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import fun.wonderful.Wonderful;
import fun.wonderful.api.storages.implement.helpertstorages.Theme;
import fun.wonderful.api.utils.color.ColorUtils;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import lombok.Generated;

public class ThemeStorage {
    private static final int DEFAULT_CUSTOM_PRIMARY = ColorUtils.rgba(95, 113, 191, 255);
    private static final int DEFAULT_CUSTOM_SECONDARY = ColorUtils.darken(DEFAULT_CUSTOM_PRIMARY, 0.35f);
    private static final String LIVE_CUSTOM_ID = "live_custom";
    private static final int MAX_THEME_ROWS = 4;
    private static final int MAX_THEME_COLUMNS = 6;
    private static final int MAX_USER_PRESETS = 15;
    private final ObjectArrayList<Themes> themeList = new ObjectArrayList();
    private final ObjectArrayList<ThemePreset> themePresets = new ObjectArrayList();
    private final ObjectArrayList<ThemePreset> userPresets = new ObjectArrayList();
    private Themes themes;
    private String selectedPresetId = Themes.Purple.name();
    private final File themesFile;

    public ThemeStorage() {
        this.themesFile = new File(Wonderful.INSTANCE.globalsDir, "themes.wonder");
        this.onInitialize();
    }

    private void onInitialize() {
        this.ensureCustomThemeInitialized();
        this.themeList.addAll(Arrays.asList(Themes.Rainbow, Themes.Purple, Themes.Red, Themes.Blue, Themes.Green, Themes.Pink, Themes.Orange, Themes.Blues, Themes.Yellows));
        this.themes = Themes.Purple;
        this.rebuildPresets();
        this.loadUserThemes();
    }

    private void ensureCustomThemeInitialized() {
        Theme custom = Themes.Custom.getTheme();
        custom.setName("Custom");
        if (custom.getColor() == null || custom.getColor().length < 2 || ColorUtils.alpha(custom.getColor()[0]) == 0) {
            custom.setColor(new int[]{DEFAULT_CUSTOM_PRIMARY, DEFAULT_CUSTOM_SECONDARY});
        }
    }

    public void setCustomThemeColors(int primary, int secondary) {
        Theme custom = Themes.Custom.getTheme();
        custom.setName("Custom");
        custom.setColor(new int[]{primary, secondary});
        ThemePreset selectedPreset = this.getSelectedPreset();
        if (selectedPreset != null && selectedPreset.removable()) {
            selectedPreset.getTheme().setColor(new int[]{primary, secondary});
            this.saveUserThemes();
        } else {
            this.selectedPresetId = LIVE_CUSTOM_ID;
        }
    }

    public int getCustomPrimaryColor() {
        this.ensureCustomThemeInitialized();
        return Themes.Custom.getTheme().getColor()[0];
    }

    public int getCustomSecondaryColor() {
        this.ensureCustomThemeInitialized();
        return Themes.Custom.getTheme().getColor()[1];
    }

    public List<ThemePreset> getThemePresets() {
        return new ArrayList<ThemePreset>((Collection<ThemePreset>)this.themePresets);
    }

    public ThemePreset getSelectedPreset() {
        for (ThemePreset preset : this.themePresets) {
            if (!preset.id().equals(this.selectedPresetId)) continue;
            return preset;
        }
        return null;
    }

    public boolean hasSelectedRemovablePreset() {
        ThemePreset preset = this.getSelectedPreset();
        return preset != null && preset.removable();
    }

    public void applyPreset(ThemePreset preset) {
        if (preset == null) {
            return;
        }
        if (preset.builtIn() && preset.builtInTheme() != null) {
            this.selectedPresetId = preset.id();
            this.setThemes(preset.builtInTheme());
            this.saveUserThemes();
            return;
        }
        this.selectedPresetId = preset.id();
        this.setCustomThemeColors(preset.getTheme().getColor()[0], preset.getTheme().getColor()[1]);
        this.setThemes(Themes.Custom);
        this.saveUserThemes();
    }

    public ThemePreset addCurrentCustomTheme() {
        if (this.userPresets.size() >= 15) {
            if (!this.userPresets.isEmpty()) {
                ThemePreset preset = (ThemePreset)(Object)this.userPresets.get(this.userPresets.size() - 1);
                this.selectedPresetId = preset.id();
                return preset;
            }
            return null;
        }
        int primary = this.getCustomPrimaryColor();
        int secondary = this.getCustomSecondaryColor();
        ThemePreset preset = new ThemePreset("user_" + System.currentTimeMillis(), new Theme("Custom", primary, secondary), null, false, true);
        this.userPresets.add(preset);
        this.rebuildPresets();
        this.selectedPresetId = preset.id();
        this.saveUserThemes();
        return preset;
    }

    public boolean removeSelectedCustomTheme() {
        ThemePreset preset = this.getSelectedPreset();
        if (preset == null || !preset.removable()) {
            return false;
        }
        boolean removed = this.userPresets.removeIf(entry -> entry.id().equals(preset.id()));
        if (removed) {
            this.rebuildPresets();
            this.selectedPresetId = !this.themePresets.isEmpty() ? ((ThemePreset)(Object)this.themePresets.get(this.themePresets.size() - 1)).id() : Themes.Rainbow.name();
            this.saveUserThemes();
        }
        return removed;
    }

    private void rebuildPresets() {
        this.themePresets.clear();
        for (Themes theme : this.themeList) {
            if (theme == Themes.Custom) continue;
            this.themePresets.add(new ThemePreset(theme.name(), theme.getTheme(), theme, true, false));
        }
        this.themePresets.addAll(this.userPresets);
    }

    private void loadUserThemes() {
        if (!this.themesFile.exists()) {
            this.rebuildPresets();
            return;
        }
        String storedSelectedPresetId = this.selectedPresetId;
        try (InputStream stream = Files.newInputStream(Paths.get(this.themesFile.getAbsolutePath(), new String[0]), new OpenOption[0]);
             InputStreamReader reader = new InputStreamReader(stream, StandardCharsets.UTF_8);){
            JsonObject object = JsonParser.parseReader((Reader)reader).getAsJsonObject();
            this.userPresets.clear();
            if (object.has("selectedPresetId")) {
                storedSelectedPresetId = object.get("selectedPresetId").getAsString();
            }
            if (object.has("customPrimary")) {
                int primary = object.get("customPrimary").getAsInt();
                int secondary = object.has("customSecondary") ? object.get("customSecondary").getAsInt() : ColorUtils.darken(primary, 0.35f);
                this.setCustomThemeColors(primary, secondary);
            }
            if (object.has("themes")) {
                for (JsonElement element : object.getAsJsonArray("themes")) {
                    if (!element.isJsonObject()) continue;
                    JsonObject entry = element.getAsJsonObject();
                    String id = entry.has("id") ? entry.get("id").getAsString() : "user_" + System.nanoTime();
                    int primary = entry.has("primary") ? entry.get("primary").getAsInt() : DEFAULT_CUSTOM_PRIMARY;
                    int secondary = entry.has("secondary") ? entry.get("secondary").getAsInt() : ColorUtils.darken(primary, 0.35f);
                    this.userPresets.add(new ThemePreset(id, new Theme("Custom", primary, secondary), null, false, true));
                }
            }
        }
        catch (Exception exception) {
            
        }
        this.rebuildPresets();
        this.selectedPresetId = storedSelectedPresetId;
    }

    public void saveUserThemes() {
        try {
            JsonObject object = new JsonObject();
            object.addProperty("selectedPresetId", this.selectedPresetId);
            object.addProperty("customPrimary", (Number)(Object)this.getCustomPrimaryColor());
            object.addProperty("customSecondary", (Number)(Object)this.getCustomSecondaryColor());
            JsonArray array = new JsonArray();
            for (ThemePreset preset : this.userPresets) {
                JsonObject entry = new JsonObject();
                entry.addProperty("id", preset.id());
                entry.addProperty("primary", (Number)preset.getTheme().getColor()[0]);
                entry.addProperty("secondary", (Number)preset.getTheme().getColor()[1]);
                array.add((JsonElement)entry);
            }
            object.add("themes", (JsonElement)array);
            try (OutputStreamWriter writer = new OutputStreamWriter((OutputStream)new FileOutputStream(this.themesFile, false), StandardCharsets.UTF_8);){
                writer.write(new GsonBuilder().setPrettyPrinting().create().toJson((JsonElement)object));
            }
        }
        catch (Exception exception) {
            
        }
    }

    @Generated
    public ObjectArrayList<Themes> getThemeList() {
        return this.themeList;
    }

    @Generated
    public ObjectArrayList<ThemePreset> getUserPresets() {
        return this.userPresets;
    }

    @Generated
    public Themes getThemes() {
        return this.themes;
    }

    @Generated
    public String getSelectedPresetId() {
        return this.selectedPresetId;
    }

    @Generated
    public File getThemesFile() {
        return this.themesFile;
    }

    @Generated
    public void setThemes(Themes themes) {
        this.themes = themes;
    }

    @Generated
    public void setSelectedPresetId(String selectedPresetId) {
        this.selectedPresetId = selectedPresetId;
    }

    public static enum Themes {
        Custom(new Theme("Custom", DEFAULT_CUSTOM_PRIMARY, DEFAULT_CUSTOM_SECONDARY)),
        Rainbow(new Theme("Rainbow", ColorUtils.rgba(255, 87, 87, 255), ColorUtils.rgba(170, 87, 255, 255))),
        Purple(new Theme("Lavender", ColorUtils.rgba(190, 143, 255, 255), ColorUtils.darken(ColorUtils.rgba(190, 143, 255, 255), 0.35f))),
        Red(new Theme("Blood", ColorUtils.rgba(230, 50, 57, 255), ColorUtils.darken(ColorUtils.rgba(230, 50, 57, 255), 0.35f))),
        Blue(new Theme("Ocean", ColorUtils.rgba(95, 113, 191, 255), ColorUtils.darken(ColorUtils.rgba(95, 113, 191, 255), 0.35f))),
        Green(new Theme("Emerald", ColorUtils.rgba(60, 220, 140, 255), ColorUtils.darken(ColorUtils.rgba(60, 220, 140, 255), 0.35f))),
        Pink(new Theme("Rose", ColorUtils.rgba(255, 120, 190, 255), ColorUtils.darken(ColorUtils.rgba(255, 120, 190, 255), 0.35f))),
        Orange(new Theme("Gold", ColorUtils.rgba(252, 192, 88, 255), ColorUtils.darken(ColorUtils.rgba(252, 192, 88, 255), 0.35f))),
        Blues(new Theme("Diamond", ColorUtils.rgba(125, 217, 250, 255), ColorUtils.darken(ColorUtils.rgba(125, 217, 250, 255), 0.35f))),
        Yellows(new Theme("Sun", ColorUtils.rgba(252, 231, 88, 255), ColorUtils.darken(ColorUtils.rgba(252, 231, 88, 255), 0.35f)));

        final Theme theme;

        @Generated
        private Themes(Theme theme) {
            this.theme = theme;
        }

        @Generated
        public Theme getTheme() {
            return this.theme;
        }
    }

    public record ThemePreset(String id, Theme theme, Themes builtInTheme, boolean builtIn, boolean removable) {
        public Theme getTheme() {
            return this.theme;
        }
    }
}