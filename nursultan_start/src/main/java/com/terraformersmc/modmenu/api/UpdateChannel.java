/*
 * Decompiled with CFR 0.152.
 */
package com.terraformersmc.modmenu.api;

import com.terraformersmc.modmenu.config.ModMenuConfig;

public enum UpdateChannel {
    ALPHA,
    BETA,
    RELEASE;


    public static UpdateChannel getUserPreference() {
        return ModMenuConfig.UPDATE_CHANNEL.getValue();
    }
}

