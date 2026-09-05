/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 */
package com.terraformersmc.modmenu.api;

import com.terraformersmc.modmenu.api.UpdateChannel;
import minecraft.class00392;

public interface UpdateInfo {
    public boolean isUpdateAvailable();

    public UpdateChannel getUpdateChannel();

    public String getDownloadLink();

    default public class00392 getUpdateMessage() {
        return null;
    }
}

