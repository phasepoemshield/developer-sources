/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.UserConnectionViaAPI
 *  com.viaversion.viaversion.api.ViaAPI
 *  com.viaversion.viaversion.api.configuration.ViaVersionConfig
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.platform.ViaPlatform
 *  com.viaversion.viaversion.configuration.AbstractViaConfig
 */
package com.viaversion.viaversion.platform;

import com.viaversion.viaversion.UserConnectionViaAPI;
import com.viaversion.viaversion.api.ViaAPI;
import com.viaversion.viaversion.api.configuration.ViaVersionConfig;
import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.platform.ViaPlatform;
import com.viaversion.viaversion.configuration.AbstractViaConfig;
import java.io.File;
import java.util.logging.Logger;

public abstract class UserConnectionViaVersionPlatform
implements ViaPlatform<UserConnection> {
    private final UserConnectionViaAPI api = new UserConnectionViaAPI();
    private final AbstractViaConfig config;
    private final File dataFolder;
    private final Logger logger;

    public abstract Logger createLogger(String var1);

    protected UserConnectionViaVersionPlatform(File dataFolder) {
        this.dataFolder = dataFolder;
        this.logger = this.createLogger("ViaVersion");
        this.config = this.createConfig();
    }

    public Logger getLogger() {
        return this.logger;
    }

    public File getDataFolder() {
        return this.dataFolder;
    }

    protected AbstractViaConfig createConfig() {
        return new AbstractViaConfig(new File(this.getDataFolder(), "viaversion.yml"), this.getLogger());
    }

    public boolean isProxy() {
        return true;
    }

    public ViaAPI<UserConnection> getApi() {
        return this.api;
    }

    public ViaVersionConfig getConf() {
        return this.config;
    }
}

