package sky.core.util.config;

public final class FilePath {
    public static final String BASE_PATH = System.getenv("SystemDrive") + "\\SkyCore\\";
    public static final String CUSTOM_DIR_REL = "custom\\";
    public static final String CLIENT_CONFIG_FILE_REL = "temp\\client_config.file";

    private FilePath() {
    }
}
