/*
 * Decompiled with CFR 0.152.
 */
package com.viaversion.viafabricplus;

import com.viaversion.viafabricplus.api.ViaFabricPlusBase;

public final class ViaFabricPlus {
    private static ViaFabricPlusBase impl;

    public static void init(ViaFabricPlusBase viaFabricPlusBase) {
        if (impl != null) {
            throw new IllegalStateException("ViaFabricPlus has already been initialized!");
        }
        impl = viaFabricPlusBase;
    }

    public static ViaFabricPlusBase getImpl() {
        if (impl == null) {
            throw new IllegalStateException("ViaFabricPlus has not been initialized yet!");
        }
        return impl;
    }
}

