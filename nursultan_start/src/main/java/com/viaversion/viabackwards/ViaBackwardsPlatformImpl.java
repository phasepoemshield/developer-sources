/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.Via
 */
package com.viaversion.viabackwards;

import com.viaversion.viabackwards.api.ViaBackwardsPlatform;
import com.viaversion.viaversion.api.Via;
import java.io.File;
import java.util.logging.Logger;

public class ViaBackwardsPlatformImpl
implements ViaBackwardsPlatform {
    private final Logger logger = Via.getPlatform().createLogger("ViaBackwards");

    @Override
    public void disable() {
    }

    public ViaBackwardsPlatformImpl() {
        this.init(new File(this.getDataFolder(), "viabackwards.yml"));
        this.enable();
    }

    @Override
    public Logger getLogger() {
        return this.logger;
    }

    @Override
    public File getDataFolder() {
        return Via.getPlatform().getDataFolder();
    }

    @Override
    public boolean isOutdated() {
        return false;
    }
}

