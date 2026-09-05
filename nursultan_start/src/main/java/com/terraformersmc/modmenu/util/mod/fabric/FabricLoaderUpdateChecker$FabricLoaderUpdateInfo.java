/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 */
package com.terraformersmc.modmenu.util.mod.fabric;

import com.terraformersmc.modmenu.api.UpdateChannel;
import com.terraformersmc.modmenu.api.UpdateInfo;
import minecraft.class00392;

class FabricLoaderUpdateChecker$FabricLoaderUpdateInfo
implements UpdateInfo {
    private final String version;
    private final boolean isStable;

    FabricLoaderUpdateChecker$FabricLoaderUpdateInfo(String string, boolean bl) {
        this.version = string;
        this.isStable = bl;
    }

    @Override
    public boolean isUpdateAvailable() {
        return true;
    }

    @Override
    public UpdateChannel getUpdateChannel() {
        return this.isStable ? UpdateChannel.RELEASE : UpdateChannel.BETA;
    }

    @Override
    public String getDownloadLink() {
        return "https://fabricmc.net/use/installer";
    }

    @Override
    public class00392 getUpdateMessage() {
        return class00392.N((String)"modmenu.install_version", (Object[])new Object[]{this.version});
    }
}

