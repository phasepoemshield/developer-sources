/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaaprilfools.api.VAFServerVersionProvider
 *  com.viaversion.viaversion.api.Via
 *  com.viaversion.viaversion.api.platform.providers.Provider
 *  com.viaversion.viaversion.api.protocol.version.VersionProvider
 */
package com.viaversion.viaaprilfools;

import com.viaversion.viaaprilfools.api.VAFServerVersionProvider;
import com.viaversion.viaaprilfools.platform.ViaAprilFoolsPlatform;
import com.viaversion.viaversion.api.Via;
import com.viaversion.viaversion.api.platform.providers.Provider;
import com.viaversion.viaversion.api.protocol.version.VersionProvider;
import java.io.File;
import java.util.logging.Logger;

public class ViaAprilFoolsPlatformImpl
implements ViaAprilFoolsPlatform {
    private final Logger logger = Via.getPlatform().createLogger("ViaAprilFools");

    public ViaAprilFoolsPlatformImpl() {
        this(true);
    }

    public ViaAprilFoolsPlatformImpl(boolean clientSide) {
        this.init(new File(this.getDataFolder(), "viaaprilfools.yml"));
        if (!clientSide) {
            Via.getManager().addPostEnableListener(() -> {
                VersionProvider delegate = (VersionProvider)Via.getManager().getProviders().get(VersionProvider.class);
                Via.getManager().getProviders().use(VersionProvider.class, (Provider)new VAFServerVersionProvider(delegate));
            });
        }
    }

    @Override
    public Logger getLogger() {
        return this.logger;
    }

    @Override
    public File getDataFolder() {
        return Via.getPlatform().getDataFolder();
    }
}

