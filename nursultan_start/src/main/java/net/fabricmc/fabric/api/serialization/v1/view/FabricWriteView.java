/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class08329
 *  net.fabricmc.fabric.impl.serialization.SpecialCodecs
 */
package net.fabricmc.fabric.api.serialization.v1.view;

import minecraft.class08329;
import net.fabricmc.fabric.impl.serialization.SpecialCodecs;

public interface FabricWriteView {
    default public void putByteArray(String string, byte[] byArray) {
        ((class08329)this).N(string, SpecialCodecs.BYTE_ARRAY, (Object)byArray);
    }

    default public void putLongArray(String string, long[] lArray) {
        ((class08329)this).N(string, SpecialCodecs.LONG_ARRAY, (Object)lArray);
    }
}

