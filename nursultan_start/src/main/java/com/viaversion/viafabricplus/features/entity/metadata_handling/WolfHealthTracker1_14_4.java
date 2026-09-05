/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator
 *  com.viaversion.viaversion.api.connection.StorableObject
 *  it.unimi.dsi.fastutil.ints.Int2FloatMap
 *  it.unimi.dsi.fastutil.ints.Int2FloatOpenHashMap
 *  minecraft.class07438
 */
package com.viaversion.viafabricplus.features.entity.metadata_handling;

import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import com.viaversion.viaversion.api.connection.StorableObject;
import it.unimi.dsi.fastutil.ints.Int2FloatMap;
import it.unimi.dsi.fastutil.ints.Int2FloatOpenHashMap;
import minecraft.class07438;

public final class WolfHealthTracker1_14_4
implements StorableObject {
    private final Int2FloatMap healthDataMap = new Int2FloatOpenHashMap();

    public float getWolfHealth(int n, float f) {
        return this.healthDataMap.getOrDefault(n, f);
    }

    public static float getWolfHealth(class07438 class074382) {
        WolfHealthTracker1_14_4 wolfHealthTracker1_14_4 = (WolfHealthTracker1_14_4)ProtocolTranslator.getPlayNetworkUserConnection().get(WolfHealthTracker1_14_4.class);
        if (wolfHealthTracker1_14_4 != null) {
            return wolfHealthTracker1_14_4.getWolfHealth(class074382.method_5628(), class074382.method_6032());
        }
        return class074382.method_6032();
    }

    public void setWolfHealth(int n, float f) {
        this.healthDataMap.put(n, f);
    }
}

