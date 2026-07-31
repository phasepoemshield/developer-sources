package sky.core.util.config;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.File;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import sky.core.Skycore;

public final class ConfigManager extends BaseManager<ConfigManager.ConfigData> {
    private static final File CONFIG_DIR = new File(FilePath.BASE_PATH + FilePath.CUSTOM_DIR_REL);

    public static final class Config {
        private final String name;
        private final long creationDate;
        private final String creator;

        public Config(String name) {
            this(name, System.currentTimeMillis(), "SkycoreUser");
        }

        public Config(String name, long creationDate, String creator) {
            this.name = name;
            this.creationDate = creationDate;
            this.creator = creator != null ? creator : "Unknown";
        }

        public String getName() {
            return this.name;
        }

        public long getCreationDate() {
            return this.creationDate;
        }

        public String getCreator() {
            return this.creator;
        }
    }

    public static final class ConfigData {
        private String lastLoadedConfig;

        public String getLastLoadedConfig() {
            return this.lastLoadedConfig;
        }

        public void setLastLoadedConfig(String lastLoadedConfig) {
            this.lastLoadedConfig = lastLoadedConfig;
        }
    }

    public ConfigManager() {
        super(FilePath.CUSTOM_DIR_REL);
    }

    @Override
    public void init() {
        CONFIG_DIR.mkdirs();
        super.init();
    }

    @Override
    protected void initializeData() {
        this.data = new ConfigData();
    }

    @Override
    protected JsonObject serializeData() {
        JsonObject config = new JsonObject();
        if (this.data.getLastLoadedConfig() != null) {
            config.addProperty("lastLoadedConfig", this.data.getLastLoadedConfig());
        }
        return config;
    }

    @Override
    protected void deserializeData(JsonObject jsonObject) {
        ConfigSerializer.loadProperty(jsonObject, "lastLoadedConfig", value -> this.data.setLastLoadedConfig(value.getAsString()));
    }

    public List<String> getConfigNames() {
        File[] files = CONFIG_DIR.listFiles((dir, name) -> name.endsWith(".cfg"));
        if (files == null) {
            return Collections.emptyList();
        }

        List<String> names = new ArrayList<>();
        for (File file : files) {
            names.add(file.getName().replace(".cfg", ""));
        }
        return names;
    }

    public void loadConfig(String name) {
        if (name == null || name.trim().isEmpty()) {
            return;
        }

        File file = new File(CONFIG_DIR, name.trim() + ".cfg");
        if (!file.exists()) {
            return;
        }

        try {
            String fileContent = Files.readString(file.toPath());
            String processedContent = this.encrypt ? HasherUtil.decrypt(fileContent) : fileContent;
            JsonObject config = JsonParser.parseString(processedContent).getAsJsonObject();

            if (config.has("module")) {
                ConfigSerializer.loadModules(config.getAsJsonObject("module"));
            }

            this.data.setLastLoadedConfig(name);
            this.save();

            ClientConfig clientConfig = Skycore.getInstance().getClientConfig();
            if (clientConfig != null) {
                clientConfig.onConfigSelected(name);
            }
        } catch (Exception exception) {
            System.err.println("Failed to load config file: " + name + " - " + exception.getMessage());
        }
    }

    public void saveConfig(String name) {
        if (name == null || name.trim().isEmpty()) {
            return;
        }

        CONFIG_DIR.mkdirs();
        File file = new File(CONFIG_DIR, name.trim() + ".cfg");

        try {
            JsonObject config = new JsonObject();
            config.add("module", ConfigSerializer.saveModules());
            config.addProperty("creationDate", System.currentTimeMillis());
            config.addProperty("creator", "SkycoreUser");

            String jsonContent = GSON.toJson(config);
            String outputContent = this.encrypt ? HasherUtil.encrypt(jsonContent) : jsonContent;
            Files.writeString(file.toPath(), outputContent);
        } catch (Exception exception) {
            System.err.println("Failed to save config: " + name + " - " + exception.getMessage());
        }
    }

    public boolean deleteConfig(String name) {
        if (name == null || name.trim().isEmpty()) {
            return false;
        }

        boolean deleted = new File(CONFIG_DIR, name.trim() + ".cfg").delete();
        if (deleted && name.equals(this.data.getLastLoadedConfig())) {
            this.data.setLastLoadedConfig(null);
            this.save();
        }
        return deleted;
    }

    public Config getConfigInfo(String name) {
        if (name == null || name.trim().isEmpty()) {
            return null;
        }

        File file = new File(CONFIG_DIR, name.trim() + ".cfg");
        if (!file.exists()) {
            return null;
        }

        try {
            String fileContent = Files.readString(file.toPath());
            String processedContent = this.encrypt ? HasherUtil.decrypt(fileContent) : fileContent;
            JsonObject config = JsonParser.parseString(processedContent).getAsJsonObject();
            long creationDate = config.has("creationDate") && !config.get("creationDate").isJsonNull()
                    ? config.get("creationDate").getAsLong()
                    : System.currentTimeMillis();
            String creator = config.has("creator") && !config.get("creator").isJsonNull()
                    ? config.get("creator").getAsString()
                    : "Unknown";
            return new Config(name, creationDate, creator);
        } catch (Exception exception) {
            return new Config(name);
        }
    }

    public void resetToDefaults() {
        ConfigSerializer.resetToDefaults();
        ClientConfig clientConfig = Skycore.getInstance().getClientConfig();
        if (clientConfig != null) {
            clientConfig.saveCurrentSettings();
        }
    }

    public File getConfigDirectory() {
        return CONFIG_DIR;
    }
}
