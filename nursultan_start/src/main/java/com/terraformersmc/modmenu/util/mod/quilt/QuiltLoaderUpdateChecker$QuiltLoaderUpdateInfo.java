/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  org.quiltmc.loader.api.Version$Semantic
 */
package com.terraformersmc.modmenu.util.mod.quilt;

import com.terraformersmc.modmenu.api.UpdateChannel;
import com.terraformersmc.modmenu.api.UpdateInfo;
import com.terraformersmc.modmenu.util.mod.quilt.QuiltLoaderUpdateChecker;
import minecraft.class00392;
import org.quiltmc.loader.api.Version;

record QuiltLoaderUpdateChecker$QuiltLoaderUpdateInfo(Version.Semantic version) implements UpdateInfo
{
    @Override
    public boolean isUpdateAvailable() {
        return true;
    }

    @Override
    public UpdateChannel getUpdateChannel() {
        String string = this.version.preRelease();
        if (string.isEmpty()) {
            return UpdateChannel.RELEASE;
        }
        if (QuiltLoaderUpdateChecker.isStableOrBeta(string)) {
            return UpdateChannel.BETA;
        }
        return UpdateChannel.ALPHA;
    }

    @Override
    public String getDownloadLink() {
        return "https://quiltmc.org/en/install/client";
    }

    @Override
    public class00392 getUpdateMessage() {
        return class00392.N((String)"modmenu.install_version", (Object[])new Object[]{this.version.raw()});
    }
}

