/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  minecraft.class00500
 *  minecraft.class00891
 *  minecraft.class04206
 *  minecraft.class06069
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import minecraft.class00500;
import minecraft.class00891;
import minecraft.class04206;
import minecraft.class05240;
import minecraft.class05261;
import minecraft.class06069;

public class class05258
extends class05261 {
    public static final MapCodec<class05258> N = RecordCodecBuilder.mapCodec(instance -> instance.group((App)class04206.i.T().fieldOf("block").forGetter(class052582 -> class052582.y), (App)Codec.FLOAT.fieldOf("probability").forGetter(class052582 -> Float.valueOf(class052582.u))).apply(instance, class05258::new));
    private final class00891 y;
    private final float u;

    public class05258(class00891 class008912, float f) {
        this.y = class008912;
        this.u = f;
    }

    @Override
    public boolean N(class00500 class005002, class06069 class060692) {
        return class005002.N(this.y) && class060692.z() < this.u;
    }

    @Override
    protected class05240<?> N() {
        return class05240.i;
    }
}

