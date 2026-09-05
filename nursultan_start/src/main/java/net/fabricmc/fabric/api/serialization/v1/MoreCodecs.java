/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  net.fabricmc.fabric.impl.serialization.SpecialCodecs
 */
package net.fabricmc.fabric.api.serialization.v1;

import com.mojang.serialization.Codec;
import net.fabricmc.fabric.impl.serialization.SpecialCodecs;

public interface MoreCodecs {
    public static final Codec<long[]> LONG_ARRAY = SpecialCodecs.LONG_ARRAY;
    public static final Codec<byte[]> BYTE_ARRAY = SpecialCodecs.BYTE_ARRAY;
}

