/*
 * Decompiled with CFR 0.152.
 */
package com.viaversion.viafabricplus.api.entrypoint;

import com.viaversion.viafabricplus.api.ViaFabricPlusBase;

@FunctionalInterface
public interface ViaFabricPlusLoadEntrypoint {
    public static final String KEY = "viafabricplus";

    public void onPlatformLoad(ViaFabricPlusBase var1);
}

