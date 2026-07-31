package sky.core.util.config;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.File;
import java.nio.file.Files;

public abstract class BaseManager<T> {
    protected static final Gson GSON = new GsonBuilder().setPrettyPrinting().create();

    protected final File configFile;
    protected final boolean encrypt;
    protected T data;

    protected BaseManager(String relativePath, boolean encrypt) {
        this.configFile = new File(FilePath.BASE_PATH + relativePath);
        this.encrypt = encrypt;
    }

    protected BaseManager(String relativePath) {
        this(relativePath, true);
    }

    public void init() {
        this.createDirectoriesIfNeeded();
        this.initializeData();
        this.load();
    }

    protected void createDirectoriesIfNeeded() {
        File parentDir = this.configFile.getParentFile();
        if (parentDir != null && !parentDir.exists()) {
            parentDir.mkdirs();
        }
    }

    public void load() {
        if (!this.configFile.exists()) {
            return;
        }

        try {
            String fileContent = Files.readString(this.configFile.toPath());
            String processedContent = this.encrypt ? HasherUtil.decrypt(fileContent) : fileContent;
            JsonObject jsonObject = JsonParser.parseString(processedContent).getAsJsonObject();
            this.deserializeData(jsonObject);
        } catch (Exception exception) {
            System.err.println("Failed to load config from " + this.configFile.getName() + ": " + exception.getMessage());
            this.handleLoadError(exception);
        }
    }

    public void save() {
        try {
            this.createDirectoriesIfNeeded();

            JsonObject jsonObject = this.serializeData();
            String jsonContent = GSON.toJson(jsonObject);
            String outputContent = this.encrypt ? HasherUtil.encrypt(jsonContent) : jsonContent;

            Files.writeString(this.configFile.toPath(), outputContent);
        } catch (Exception exception) {
            System.err.println("Failed to save config to " + this.configFile.getName() + ": " + exception.getMessage());
            this.handleSaveError(exception);
        }
    }

    public boolean exists() {
        return this.configFile.exists();
    }

    public boolean delete() {
        return this.configFile.exists() && this.configFile.delete();
    }

    public String getConfigPath() {
        return this.configFile.getAbsolutePath();
    }

    protected abstract void initializeData();

    protected abstract JsonObject serializeData();

    protected abstract void deserializeData(JsonObject jsonObject);

    protected void handleLoadError(Exception exception) {
    }

    protected void handleSaveError(Exception exception) {
    }

    public T getData() {
        return this.data;
    }
}
