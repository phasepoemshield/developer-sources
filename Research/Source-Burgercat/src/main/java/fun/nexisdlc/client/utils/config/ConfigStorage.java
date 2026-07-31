package fun.nexisdlc.client.utils.config;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import net.minecraft.client.MinecraftClient;
import org.jetbrains.annotations.Nullable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.sterford.Initializator;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.List;

public class ConfigStorage {
    private static final Logger LOGGER = LoggerFactory.getLogger(ConfigStorage.class);
    public final File CONFIG_DIR = new File(MinecraftClient.getInstance().runDirectory, "Nexis" + File.separator + "configs");
    public final File AUTOCFG_DIR = new File(CONFIG_DIR, "backup.json");
    private static final Gson GSON = new GsonBuilder().setPrettyPrinting().create();

    public void init() throws IOException {
        if (new Initializator().protectionInner() != 45781368) {
            Initializator.crasher(true);
        }
        LOGGER.info("  - Настройка папки конфигурации: {}", CONFIG_DIR.getAbsolutePath());
        setupFolder();
        LOGGER.info("  ✓ Папка конфигурации готова");
    }

    private void setupFolder() {
        if (!CONFIG_DIR.exists()) {
            LOGGER.info("  - Создание папки конфигурации...");
            CONFIG_DIR.mkdirs();
            LOGGER.info("  ✓ Папка создана");
        }
        if (!AUTOCFG_DIR.exists()) {
            try {
                LOGGER.info("  - Создание файла конфигурации по умолчанию...");
                AUTOCFG_DIR.createNewFile();
                try (FileWriter writer = new FileWriter(AUTOCFG_DIR)) {
                    writer.write("{}");
                }
                LOGGER.info("  ✓ Файл конфигурации создан");
            } catch (IOException ignored) {
                LOGGER.warn("  ✗ Не удалось создать файл конфигурации", ignored);
            }
        }
    }

    public List<Config> getConfigs() {
        List<Config> configs = new ArrayList<>();
        File[] configFiles = CONFIG_DIR.listFiles();
        if (configFiles != null) {
            for (File configFile : configFiles) {
                if (configFile.isFile() && configFile.getName().endsWith(".json")) {
                    String configName = configFile.getName().replace(".json", "");
                    configs.add(new Config(configName));
                }
            }
        }
        return configs;
    }

    public void loadConfiguration(String configuration) {
        LOGGER.info("  - Загрузка конфигурации: {}", configuration);
        Config config = findConfig(configuration);
        if (config == null) {
            LOGGER.warn("  ✗ Конфигурация '{}' не найдена", configuration);
            return;
        }
        try (FileReader reader = new FileReader(config.getFile())) {
            JsonObject object = JsonParser.parseReader(reader).getAsJsonObject();
            config.loadConfig(object);
            LOGGER.info("  ✓ Конфигурация '{}' успешно загружена", configuration);
        } catch (IOException e) {
            LOGGER.error("  ✗ Ошибка при загрузке конфигурации '{}'", configuration, e);
        } catch (com.google.gson.JsonParseException e) {
            LOGGER.error("  ✗ Конфигурация '{}' повреждена, используйте backup", configuration, e);
        }
    }

    public static synchronized void saveConfiguration(String configuration) {
        LOGGER.info("  - Сохранение конфигурации: {}", configuration);
        Config config = new Config(configuration);
        File configDir = config.getFile().getParentFile();
        if (!configDir.exists()) {
            configDir.mkdirs();
        }
        try {
            Path tempFile = Files.createTempFile(configDir.toPath(), configuration, ".tmp");
            Files.writeString(tempFile, GSON.toJson(config.saveConfig()));
            Files.move(tempFile, config.getFile().toPath(), StandardCopyOption.ATOMIC_MOVE);
            LOGGER.info("  ✓ Конфигурация '{}' успешно сохранена", configuration);
        } catch (IOException e) {
            LOGGER.error("  ✗ Ошибка при сохранении конфигурации '{}'", configuration, e);
        }
    }

    @Nullable
    public Config findConfig(String configName) {
        if (configName == null) return null;
        File file = new File(CONFIG_DIR, configName + ".json");
        return file.exists() ? new Config(configName) : null;
    }

    public void deleteConfiguration(String configName) {
        if (configName == null) return;
        File file = new File(CONFIG_DIR, configName + ".json");
        if (file.exists()) {
            file.delete();
        }
    }

    @Nullable
    public Config getConfiguration(String configName) {
        return findConfig(configName);
    }
}
