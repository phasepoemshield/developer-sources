/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.ViaManagerImpl$ViaManagerBuilder
 *  com.viaversion.viaversion.api.configuration.Config
 *  com.viaversion.viaversion.api.configuration.ConfigurationProvider
 *  com.viaversion.viaversion.api.connection.ConnectionManager
 *  com.viaversion.viaversion.api.data.MappingDataLoader
 *  com.viaversion.viaversion.api.debug.DebugHandler
 *  com.viaversion.viaversion.api.platform.PlatformTask
 *  com.viaversion.viaversion.api.platform.UnsupportedSoftware
 *  com.viaversion.viaversion.api.platform.ViaInjector
 *  com.viaversion.viaversion.api.platform.ViaPlatform
 *  com.viaversion.viaversion.api.platform.ViaPlatformLoader
 *  com.viaversion.viaversion.api.platform.providers.ViaProviders
 *  com.viaversion.viaversion.api.protocol.ProtocolManager
 *  com.viaversion.viaversion.api.protocol.version.ProtocolVersion
 *  com.viaversion.viaversion.api.protocol.version.ServerProtocolVersion
 *  com.viaversion.viaversion.api.scheduler.Scheduler
 *  com.viaversion.viaversion.commands.ViaCommandHandler
 *  com.viaversion.viaversion.configuration.ConfigurationProviderImpl
 *  com.viaversion.viaversion.connection.ConnectionManagerImpl
 *  com.viaversion.viaversion.debug.DebugHandlerImpl
 *  com.viaversion.viaversion.protocol.ProtocolManagerImpl
 *  com.viaversion.viaversion.protocol.ServerProtocolVersionRange
 *  com.viaversion.viaversion.protocol.ServerProtocolVersionSingleton
 *  com.viaversion.viaversion.protocols.v1_12_2to1_13.task.TabCompleteTask
 *  com.viaversion.viaversion.protocols.v1_8to1_9.task.IdlePacketTask
 *  com.viaversion.viaversion.scheduler.TaskScheduler
 *  com.viaversion.viaversion.update.UpdateUtil
 */
package com.viaversion.viaversion;

import com.viaversion.viaversion.ViaManagerImpl;
import com.viaversion.viaversion.api.Via;
import com.viaversion.viaversion.api.ViaManager;
import com.viaversion.viaversion.api.configuration.Config;
import com.viaversion.viaversion.api.configuration.ConfigurationProvider;
import com.viaversion.viaversion.api.connection.ConnectionManager;
import com.viaversion.viaversion.api.data.MappingDataLoader;
import com.viaversion.viaversion.api.debug.DebugHandler;
import com.viaversion.viaversion.api.platform.PlatformTask;
import com.viaversion.viaversion.api.platform.UnsupportedSoftware;
import com.viaversion.viaversion.api.platform.ViaInjector;
import com.viaversion.viaversion.api.platform.ViaPlatform;
import com.viaversion.viaversion.api.platform.ViaPlatformLoader;
import com.viaversion.viaversion.api.platform.providers.ViaProviders;
import com.viaversion.viaversion.api.protocol.ProtocolManager;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import com.viaversion.viaversion.api.protocol.version.ServerProtocolVersion;
import com.viaversion.viaversion.api.scheduler.Scheduler;
import com.viaversion.viaversion.commands.ViaCommandHandler;
import com.viaversion.viaversion.configuration.ConfigurationProviderImpl;
import com.viaversion.viaversion.connection.ConnectionManagerImpl;
import com.viaversion.viaversion.debug.DebugHandlerImpl;
import com.viaversion.viaversion.protocol.ProtocolManagerImpl;
import com.viaversion.viaversion.protocol.ServerProtocolVersionRange;
import com.viaversion.viaversion.protocol.ServerProtocolVersionSingleton;
import com.viaversion.viaversion.protocols.v1_12_2to1_13.task.TabCompleteTask;
import com.viaversion.viaversion.protocols.v1_8to1_9.task.IdlePacketTask;
import com.viaversion.viaversion.scheduler.TaskScheduler;
import com.viaversion.viaversion.update.UpdateUtil;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import java.util.logging.Level;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ViaManagerImpl
implements ViaManager {
    private final ProtocolManagerImpl protocolManager = new ProtocolManagerImpl();
    private final ConnectionManager connectionManager = new ConnectionManagerImpl();
    private final ConfigurationProvider configurationProvider = new ConfigurationProviderImpl();
    private final DebugHandler debugHandler = new DebugHandlerImpl();
    private final ViaProviders providers = new ViaProviders();
    private final Scheduler scheduler = new TaskScheduler();
    private final ViaPlatform<?> platform;
    private final ViaInjector injector;
    private final ViaCommandHandler commandHandler;
    private final ViaPlatformLoader loader;
    private final Set<String> subPlatforms = new HashSet<String>();
    private List<Runnable> enableListeners = new ArrayList<Runnable>();
    private List<Runnable> postEnableListeners = new ArrayList<Runnable>();
    private PlatformTask<?> mappingLoadingTask;
    private boolean initialized;

    @Override
    public boolean isInitialized() {
        return this.initialized;
    }

    @Override
    public ViaProviders getProviders() {
        return this.providers;
    }

    @Override
    public Scheduler getScheduler() {
        return this.scheduler;
    }

    public ViaManagerImpl(ViaPlatform<?> platform, ViaInjector injector, ViaCommandHandler commandHandler, ViaPlatformLoader loader) {
        this.platform = platform;
        this.injector = injector;
        this.commandHandler = commandHandler;
        this.loader = loader;
    }

    public static ViaManagerBuilder builder() {
        return new ViaManagerBuilder();
    }

    public void init() {
        this.configurationProvider.register((Config)this.platform.getConf());
        if (System.getProperty("ViaVersion") != null) {
            this.platform.onReload();
        }
        if (!this.injector.lateProtocolVersionSetting()) {
            this.loadServerProtocol();
        }
        MappingDataLoader.loadGlobalIdentifiers();
        this.protocolManager.registerProtocols();
        try {
            this.injector.inject();
        }
        catch (Exception e) {
            this.platform.getLogger().log(Level.SEVERE, "ViaVersion failed to inject:", e);
            return;
        }
        System.setProperty("ViaVersion", this.platform.getPluginVersion());
        for (Runnable listener : this.enableListeners) {
            listener.run();
        }
        this.enableListeners = null;
        this.initialized = true;
    }

    public void destroy() {
        if (this.platform.couldBeReloading()) {
            this.platform.getLogger().info("ViaVersion is disabling. If this is a reload and you experience issues, please reboot instead.");
        }
        try {
            this.injector.uninject();
        }
        catch (Exception e) {
            this.platform.getLogger().log(Level.SEVERE, "ViaVersion failed to uninject:", e);
        }
        this.loader.unload();
        this.scheduler.shutdown();
        this.platform.getLogger().info("ViaVersion has been disabled; uninjected the platform and shut down the scheduler.");
    }

    @Override
    public ViaPlatformLoader getLoader() {
        return this.loader;
    }

    public void onServerLoaded() {
        ServerProtocolVersion protocolVersion;
        if (this.platform.getConf().isCheckForUpdates()) {
            UpdateUtil.sendUpdateMessage();
        }
        if (!this.protocolManager.getServerProtocolVersion().isKnown()) {
            this.loadServerProtocol();
        }
        if ((protocolVersion = this.protocolManager.getServerProtocolVersion()).isKnown()) {
            if (this.platform.isProxy()) {
                this.platform.getLogger().info("ViaVersion detected lowest supported version by the proxy: " + String.valueOf(protocolVersion.lowestSupportedProtocolVersion()));
                this.platform.getLogger().info("Highest supported version by the proxy: " + String.valueOf(protocolVersion.highestSupportedProtocolVersion()));
                if (this.debugHandler.enabled()) {
                    this.platform.getLogger().info("Supported version range: " + Arrays.toString(protocolVersion.supportedProtocolVersions().toArray(new ProtocolVersion[0])));
                }
            } else {
                this.platform.getLogger().info("ViaVersion detected server version: " + String.valueOf(protocolVersion.highestSupportedProtocolVersion()));
            }
            if (!this.protocolManager.isWorkingPipe()) {
                this.platform.getLogger().warning("ViaVersion does not have any compatible versions for this server version!");
                this.platform.getLogger().warning("ViaVersion only supports newer client versions. Use ViaBackwards to allow older versions (ViaRewind for 1.7/1.8) to join.");
                this.platform.getLogger().warning("Get setup help at https://viaversion.com/setup or download ViaBackwards/ViaRewind directly at https://ci.viaversion.com/");
                this.platform.getLogger().warning("Need more help? Join our Discord at https://viaversion.com/discord");
            } else if (protocolVersion.highestSupportedProtocolVersion().olderThan(ProtocolVersion.v1_16)) {
                this.platform.getLogger().warning("This version of Minecraft is extremely outdated and support for it has reached its end of life. You will still be able to run Via on this Minecraft version, but we will prioritize issues with legacy Minecraft versions less. Please consider updating to give your players a better experience and to avoid issues that have long been fixed.");
            }
        }
        this.checkJavaVersion();
        this.unsupportedSoftwareWarning();
        this.loader.load();
        this.mappingLoadingTask = Via.getPlatform().runRepeatingAsync(() -> {
            if (this.protocolManager.checkForMappingCompletion() && this.mappingLoadingTask != null) {
                this.mappingLoadingTask.cancel();
                this.mappingLoadingTask = null;
            }
        }, 10L);
        ProtocolVersion serverProtocolVersion = this.protocolManager.getServerProtocolVersion().lowestSupportedProtocolVersion();
        if (serverProtocolVersion.olderThan(ProtocolVersion.v1_9) && Via.getConfig().isSimulatePlayerTick()) {
            Via.getPlatform().runRepeatingSync((Runnable)new IdlePacketTask(), 1L);
        }
        if (serverProtocolVersion.olderThan(ProtocolVersion.v1_13) && Via.getConfig().get1_13TabCompleteDelay() > 0) {
            Via.getPlatform().runRepeatingSync((Runnable)new TabCompleteTask(), 1L);
        }
        this.protocolManager.refreshVersions();
        for (Runnable listener : this.postEnableListeners) {
            listener.run();
        }
        this.postEnableListeners = null;
    }

    private void loadServerProtocol() {
        try {
            ServerProtocolVersionSingleton versionInfo;
            ProtocolVersion serverProtocolVersion = this.injector.getServerProtocolVersion();
            if (this.platform.isProxy()) {
                SortedSet supportedVersions = this.injector.getServerProtocolVersions();
                versionInfo = new ServerProtocolVersionRange((ProtocolVersion)supportedVersions.first(), (ProtocolVersion)supportedVersions.last(), supportedVersions);
            } else {
                versionInfo = new ServerProtocolVersionSingleton(serverProtocolVersion);
            }
            this.protocolManager.setServerProtocol((ServerProtocolVersion)versionInfo);
        }
        catch (Exception e) {
            this.platform.getLogger().log(Level.SEVERE, "ViaVersion failed to get the server protocol!", e);
        }
    }

    @Override
    public void addEnableListener(Runnable runnable) {
        this.enableListeners.add(runnable);
    }

    private void checkJavaVersion() {
        int version;
        String javaVersion = System.getProperty("java.version");
        Matcher matcher = Pattern.compile("(?:1\\.)?(\\d+)").matcher(javaVersion);
        if (!matcher.find()) {
            this.platform.getLogger().warning("Failed to determine Java version; could not parse: " + javaVersion);
            return;
        }
        String versionString = matcher.group(1);
        try {
            version = Integer.parseInt(versionString);
        }
        catch (NumberFormatException e) {
            this.platform.getLogger().log(Level.WARNING, "Failed to determine Java version; could not parse: " + versionString, e);
            return;
        }
        if (version < 17) {
            this.platform.getLogger().warning("You are running an outdated Java version, please update it to at least Java 21 (your version is " + javaVersion + ").");
            this.platform.getLogger().warning("ViaVersion no longer officially supports this version of Java, only offering unsupported compatibility builds.");
            this.platform.getLogger().warning("See https://github.com/ViaVersion/ViaVersion/releases/tag/5.0.0 for more information.");
        } else if (version < 21) {
            this.platform.getLogger().warning("Please update your Java runtime to at least Java 21 (your version is " + javaVersion + ").");
            this.platform.getLogger().warning("At some point in the future, ViaVersion will no longer be compatible with this version of Java.");
        }
    }

    @Override
    public ViaInjector getInjector() {
        return this.injector;
    }

    @Override
    public Set<String> getSubPlatforms() {
        return this.subPlatforms;
    }

    public ViaCommandHandler getCommandHandler() {
        return this.commandHandler;
    }

    public static ViaManager initAndLoad(ViaPlatform<?> platform, ViaInjector injector, ViaCommandHandler commandHandler, ViaPlatformLoader loader, Runnable ... enableListeners) {
        ViaManagerImpl manager = new ViaManagerImpl(platform, injector, commandHandler, loader);
        Via.init(manager);
        platform.getConf().reload();
        for (Runnable listener : enableListeners) {
            manager.addEnableListener(listener);
        }
        manager.init();
        manager.onServerLoaded();
        return manager;
    }

    @Override
    public ProtocolManager getProtocolManager() {
        return this.protocolManager;
    }

    @Override
    public DebugHandler debugHandler() {
        return this.debugHandler;
    }

    @Override
    public ViaPlatform<?> getPlatform() {
        return this.platform;
    }

    @Override
    public void addPostEnableListener(Runnable runnable) {
        this.postEnableListeners.add(runnable);
    }

    @Override
    public ConfigurationProvider getConfigurationProvider() {
        return this.configurationProvider;
    }

    private void unsupportedSoftwareWarning() {
        boolean found = false;
        for (UnsupportedSoftware software : this.platform.getUnsupportedSoftwareClasses()) {
            String match = software.match();
            if (match == null) continue;
            if (!found) {
                this.platform.getLogger().severe("************************************************");
                this.platform.getLogger().severe("You are using unsupported software and may encounter unforeseeable issues.");
                this.platform.getLogger().severe("");
                found = true;
            }
            this.platform.getLogger().severe("We strongly advise against using " + match + ":");
            this.platform.getLogger().severe(software.getReason());
            this.platform.getLogger().severe("");
        }
        if (found) {
            this.platform.getLogger().severe("We will not provide support in case you encounter issues possibly related to this software.");
            this.platform.getLogger().severe("************************************************");
        }
    }

    @Override
    public ConnectionManager getConnectionManager() {
        return this.connectionManager;
    }
}

