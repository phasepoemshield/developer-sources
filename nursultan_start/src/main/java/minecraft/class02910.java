/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 *  minecraft.class04995
 *  minecraft.class07126
 */
package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import minecraft.class04995;
import minecraft.class07126;

public abstract class class02910
implements class07126 {
    public static final float i = 0.01f;
    public static final float R = 4.0f;
    protected static final Codec<Float> M = Codec.FLOAT.validate(f -> f.floatValue() >= 0.01f && f.floatValue() <= 4.0f ? DataResult.success((Object)f) : DataResult.error(() -> "Value must be within range [0.01;4.0]: " + f));
    private final float N;

    public float L() {
        return this.N;
    }

    public class02910(float f) {
        this.N = class04995.N((float)f, (float)0.01f, (float)4.0f);
    }
}

