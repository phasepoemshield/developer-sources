/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.voicechat.command.VoicechatCommands
 *  de.maxhenkel.voicechat.config.ServerConfig
 *  de.maxhenkel.voicechat.config.Translations
 *  de.maxhenkel.voicechat.configbuilder.ConfigBuilder
 *  de.maxhenkel.voicechat.intercompatibility.CommonCompatibilityManager
 *  de.maxhenkel.voicechat.logging.Log4JVoicechatLogger
 *  de.maxhenkel.voicechat.logging.VoicechatLogger
 *  de.maxhenkel.voicechat.plugins.PluginManager
 *  de.maxhenkel.voicechat.voice.server.ServerVoiceEvents
 */
package de.maxhenkel.voicechat;

import de.maxhenkel.voicechat.BuildConstants;
import de.maxhenkel.voicechat.command.VoicechatCommands;
import de.maxhenkel.voicechat.config.ServerConfig;
import de.maxhenkel.voicechat.config.Translations;
import de.maxhenkel.voicechat.configbuilder.ConfigBuilder;
import de.maxhenkel.voicechat.intercompatibility.CommonCompatibilityManager;
import de.maxhenkel.voicechat.logging.Log4JVoicechatLogger;
import de.maxhenkel.voicechat.logging.VoicechatLogger;
import de.maxhenkel.voicechat.plugins.PluginManager;
import de.maxhenkel.voicechat.voice.server.ServerVoiceEvents;
import java.nio.file.Path;
import java.util.regex.Pattern;

public abstract class Voicechat {
    public static final String MODID = "voicechat";
    public static final VoicechatLogger LOGGER = new Log4JVoicechatLogger("voicechat");
    public static ServerVoiceEvents SERVER;
    public static ServerConfig SERVER_CONFIG;
    public static Translations TRANSLATIONS;
    public static int COMPATIBILITY_VERSION;
    public static final int MAX_GROUP_NAME_LENGTH = 24;
    public static final Pattern GROUP_REGEX;

    public void initialize() {
        if (Voicechat.debugMode()) {
            LOGGER.warn("Running in debug mode - Don't leave this enabled in production!", new Object[0]);
        }
        LOGGER.info("Compatibility version {}", new Object[]{COMPATIBILITY_VERSION});
        this.initializeConfigs();
        CommonCompatibilityManager.INSTANCE.getNetManager().init();
        SERVER = new ServerVoiceEvents();
        this.initPlugins();
        this.registerCommands();
    }

    public static Path getVoicechatConfigFolder() {
        return Voicechat.getConfigFolder().resolve(MODID);
    }

    protected Path getVoicechatConfigFolderInternal() {
        return Voicechat.getVoicechatConfigFolder();
    }

    protected Translations createTranslations(ConfigBuilder configBuilder) {
        return new Translations(configBuilder);
    }

    protected void registerCommands() {
        CommonCompatibilityManager.INSTANCE.onRegisterServerCommands(VoicechatCommands::register);
    }

    public void initializeConfigs() {
        SERVER_CONFIG = (ServerConfig)ConfigBuilder.builder(ServerConfig::new).path(this.getVoicechatConfigFolderInternal().resolve("voicechat-server.properties")).build();
        TRANSLATIONS = (Translations)ConfigBuilder.builder(this::createTranslations).path(this.getVoicechatConfigFolderInternal().resolve("translations.properties")).build();
    }

    public static Path getConfigFolder() {
        return Path.of(".", new String[0]).resolve("config");
    }

    protected void initPlugins() {
        PluginManager.instance().init();
    }

    public static boolean debugMode() {
        return CommonCompatibilityManager.INSTANCE.isDevEnvironment() || System.getProperty("voicechat.debug") != null;
    }

    static {
        COMPATIBILITY_VERSION = BuildConstants.COMPATIBILITY_VERSION;
        GROUP_REGEX = Pattern.compile("^[^\\p{C}\\s][^\\p{C}]{0,23}$");
    }
}

