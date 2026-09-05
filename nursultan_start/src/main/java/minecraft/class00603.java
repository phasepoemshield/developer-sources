/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
package minecraft;

import com.mojang.serialization.Codec;
import minecraft.class00585;
import minecraft.class00607;
import minecraft.class00610;

@FunctionalInterface
public interface class00603
extends class00585<Float> {
    @Override
    default public Codec<Float> argumentCodec(class00607<Float> class006072) {
        return Codec.FLOAT;
    }

    @Override
    default public class00610<Float> argumentKeyframeLerp(class00607<Float> class006072) {
        return class00610.N();
    }
}

