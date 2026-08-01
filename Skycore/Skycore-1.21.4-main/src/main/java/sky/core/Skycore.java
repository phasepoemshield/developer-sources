package sky.core;

import net.fabricmc.api.ModInitializer;
import ru.fametyca.protection.annotations.Native;
import sky.core.util.config.ClientConfig;
import sky.core.util.config.ConfigManager;
import sky.core.module.ModuleManager;

public class Skycore implements ModInitializer {
    private static Skycore instance;

    private final ModuleManager moduleManager = new ModuleManager();
    private final ConfigManager configManager = new ConfigManager();
    private final ClientConfig clientConfig = new ClientConfig();

    @Native
    public static Skycore getInstance() {
        return instance;
    }

    @Native
    public ModuleManager getModuleManager() {
        return this.moduleManager;
    }
    @Native
    public ConfigManager getConfigManager() {
        return this.configManager;
    }

    @Native
    public ClientConfig getClientConfig() {
        return this.clientConfig;
    }

    @Override
    public void onInitialize() {
        instance = this;
    }
}
