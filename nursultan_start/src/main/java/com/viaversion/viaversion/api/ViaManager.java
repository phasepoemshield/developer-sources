/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.command.ViaVersionCommand
 *  com.viaversion.viaversion.api.configuration.ConfigurationProvider
 *  com.viaversion.viaversion.api.connection.ConnectionManager
 *  com.viaversion.viaversion.api.debug.DebugHandler
 *  com.viaversion.viaversion.api.platform.ViaInjector
 *  com.viaversion.viaversion.api.platform.ViaPlatform
 *  com.viaversion.viaversion.api.platform.ViaPlatformLoader
 *  com.viaversion.viaversion.api.platform.providers.ViaProviders
 *  com.viaversion.viaversion.api.protocol.ProtocolManager
 *  com.viaversion.viaversion.api.scheduler.Scheduler
 */
package com.viaversion.viaversion.api;

import com.viaversion.viaversion.api.command.ViaVersionCommand;
import com.viaversion.viaversion.api.configuration.ConfigurationProvider;
import com.viaversion.viaversion.api.connection.ConnectionManager;
import com.viaversion.viaversion.api.debug.DebugHandler;
import com.viaversion.viaversion.api.platform.ViaInjector;
import com.viaversion.viaversion.api.platform.ViaPlatform;
import com.viaversion.viaversion.api.platform.ViaPlatformLoader;
import com.viaversion.viaversion.api.platform.providers.ViaProviders;
import com.viaversion.viaversion.api.protocol.ProtocolManager;
import com.viaversion.viaversion.api.scheduler.Scheduler;
import java.util.Set;

public interface ViaManager {
    public boolean isInitialized();

    public ViaProviders getProviders();

    public Scheduler getScheduler();

    default public boolean isDebug() {
        return this.debugHandler().enabled();
    }

    public ViaPlatformLoader getLoader();

    public void addEnableListener(Runnable var1);

    public ViaInjector getInjector();

    public Set<String> getSubPlatforms();

    public ViaVersionCommand getCommandHandler();

    public ProtocolManager getProtocolManager();

    public DebugHandler debugHandler();

    public ViaPlatform<?> getPlatform();

    @Deprecated
    default public void setDebug(boolean debug) {
        this.debugHandler().setEnabled(debug);
    }

    public void addPostEnableListener(Runnable var1);

    public ConfigurationProvider getConfigurationProvider();

    public ConnectionManager getConnectionManager();
}

