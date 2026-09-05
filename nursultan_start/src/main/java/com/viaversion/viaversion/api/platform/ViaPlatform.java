/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.Via
 *  com.viaversion.viaversion.api.ViaAPI
 *  com.viaversion.viaversion.api.configuration.ViaVersionConfig
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.platform.UnsupportedSoftware
 *  com.viaversion.viaversion.libs.gson.JsonObject
 *  com.viaversion.viaversion.util.VersionInfo
 */
package com.viaversion.viaversion.api.platform;

import com.viaversion.viaversion.api.Via;
import com.viaversion.viaversion.api.ViaAPI;
import com.viaversion.viaversion.api.configuration.ViaVersionConfig;
import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.platform.PlatformTask;
import com.viaversion.viaversion.api.platform.UnsupportedSoftware;
import com.viaversion.viaversion.api.platform.ViaPlatformTask;
import com.viaversion.viaversion.libs.gson.JsonObject;
import com.viaversion.viaversion.util.VersionInfo;
import java.io.File;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

public interface ViaPlatform<T> {
    default public Logger createLogger(String name) {
        return this.getLogger();
    }

    public Logger getLogger();

    public File getDataFolder();

    public String getPlatformName();

    default public PlatformTask runRepeatingSync(Runnable runnable, long period) {
        return this.runRepeatingAsync(runnable, period);
    }

    default public boolean couldBeReloading() {
        return false;
    }

    default public String getPluginVersion() {
        return VersionInfo.getVersion();
    }

    default public void sendMessage(UserConnection connection, String message) {
    }

    default public void sendCustomPayload(UserConnection connection, String channel, byte[] message) {
    }

    public String getPlatformVersion();

    default public PlatformTask runRepeatingAsync(Runnable runnable, long ticks) {
        return new ViaPlatformTask(Via.getManager().getScheduler().scheduleRepeating(runnable, ticks * 50L, ticks * 50L, TimeUnit.MILLISECONDS));
    }

    default public PlatformTask runAsync(Runnable runnable) {
        return new ViaPlatformTask(Via.getManager().getScheduler().execute(runnable));
    }

    default public boolean isProxy() {
        return false;
    }

    public ViaAPI<T> getApi();

    public ViaVersionConfig getConf();

    default public JsonObject getDump() {
        return new JsonObject();
    }

    default public PlatformTask runSync(Runnable runnable) {
        return this.runAsync(runnable);
    }

    default public PlatformTask runSync(Runnable runnable, long delay) {
        return new ViaPlatformTask(Via.getManager().getScheduler().schedule(runnable, delay * 50L, TimeUnit.MILLISECONDS));
    }

    default public boolean hasPlugin(String name) {
        return false;
    }

    default public void onReload() {
    }

    default public boolean kickPlayer(UserConnection connection, String message) {
        return false;
    }

    default public void modifyServerDetails(UserConnection connection, JsonObject payload) {
    }

    default public void modifyPlayerDetails(UserConnection connection, JsonObject payload) {
    }

    default public void sendCustomPayloadToClient(UserConnection connection, String channel, byte[] message) {
    }

    default public Collection<UnsupportedSoftware> getUnsupportedSoftwareClasses() {
        return List.of();
    }
}

