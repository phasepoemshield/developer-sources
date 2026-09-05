/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  minecraft.class00500
 *  minecraft.class06069
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import minecraft.class00500;
import minecraft.class05240;
import minecraft.class05261;
import minecraft.class06069;

public class class05263
extends class05261 {
    public static final MapCodec<class05263> N = RecordCodecBuilder.mapCodec(instance -> instance.group((App)class00500.N.fieldOf("block_state").forGetter(class052632 -> class052632.y), (App)Codec.FLOAT.fieldOf("probability").forGetter(class052632 -> Float.valueOf(class052632.u))).apply(instance, class05263::new));
    private final class00500 y;
    private final float u;

    public class05263(class00500 class005002, float f) {
        this.y = class005002;
        this.u = f;
    }

    @Override
    public boolean N(class00500 class005002, class06069 class060692) {
        return class005002 == this.y && class060692.z() < this.u;
    }

    @Override
    protected class05240<?> N() {
        return class05240.R;
    }
}

