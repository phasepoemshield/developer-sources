package sky.core.util.config;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.nio.file.Files;
import sky.core.Skycore;
import sky.core.util.drag.DragController;
import sky.core.ui.gui.click.theme.Themes;

public final class ClientConfig extends BaseManager<ClientConfig.ClientConfigData> {
    public static final class ClientConfigData {
        private String selectedConfig;
        private String selectedTheme;

        public String getSelectedConfig() {
            return this.selectedConfig;
        }

        public void setSelectedConfig(String selectedConfig) {
            this.selectedConfig = selectedConfig;
        }

        public String getSelectedTheme() {
            return this.selectedTheme;
        }

        public void setSelectedTheme(String selectedTheme) {
            this.selectedTheme = selectedTheme;
        }
    }

    public ClientConfig() {
        super(FilePath.CLIENT_CONFIG_FILE_REL);
    }

    @Override
    protected void initializeData() {
        this.data = new ClientConfigData();
    }

    @Override
    protected JsonObject serializeData() {
        JsonObject config = new JsonObject();
        config.add("modules", ConfigSerializer.saveModules());
        if (this.data.getSelectedConfig() != null) {
            config.addProperty("selectedConfig", this.data.getSelectedConfig());
        }
        if (this.data.getSelectedTheme() != null) {
            config.addProperty("selectedTheme", this.data.getSelectedTheme());
        }
        config.add("hud", DragController.getInstance().savePositions());
        return config;
    }

    @Override
    protected void deserializeData(JsonObject jsonObject) {
        ConfigSerializer.loadProperty(jsonObject, "selectedConfig", value -> this.data.setSelectedConfig(value.getAsString()));
        ConfigSerializer.loadProperty(jsonObject, "selectedTheme", value -> this.data.setSelectedTheme(value.getAsString()));
    }

    public void saveCurrentSettings() {
        this.save();
    }

    public void applySettings() {
        if (!this.configFile.exists()) {
            return;
        }

        try {
            String fileContent = Files.readString(this.configFile.toPath());
            String processedContent = this.encrypt ? HasherUtil.decrypt(fileContent) : fileContent;
            JsonObject config = JsonParser.parseString(processedContent).getAsJsonObject();

            if (config.has("modules")) {
                ConfigSerializer.loadModules(config.getAsJsonObject("modules"));
            }

            if (config.has("hud")) {
                DragController.getInstance().loadPositions(config.getAsJsonObject("hud"));
            }

            if (config.has("selectedTheme") && !config.get("selectedTheme").isJsonNull()) {
                Themes.apply(config.get("selectedTheme").getAsString());
            } else {
                Themes.init();
            }

            this.loadSelectedConfig();
        } catch (Exception exception) {
            System.err.println("Failed to apply client config settings: " + exception.getMessage());
        }
    }

    public void onConfigSelected(String configName) {
        this.data.setSelectedConfig(configName);
        this.save();
    }

    public void loadSelectedConfig() {
        if (this.data.getSelectedConfig() == null || this.data.getSelectedConfig().trim().isEmpty()) {
            return;
        }

        ConfigManager configManager = Skycore.getInstance().getConfigManager();
        if (configManager != null) {
            configManager.loadConfig(this.data.getSelectedConfig());
        }
    }

    public String getSelectedConfig() {
        return this.data.getSelectedConfig();
    }

    public void onThemeSelected(String themeId) {
        this.data.setSelectedTheme(themeId);
        this.save();
    }
}
