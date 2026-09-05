/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class04864
 *  minecraft.class04866
 *  minecraft.class06202
 */
package com.viaversion.viafabricplus.features.font;

import minecraft.class04864;
import minecraft.class04866;
import minecraft.class06202;

public final class FontCacheReload {
    public static void reload() {
        if (class06202.Nq() == null) {
            return;
        }
        for (class04864 class048642 : ((class04866)class06202.Nq().E_3).u.values()) {
            class048642.L.N();
        }
    }
}

