/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  minecraft.class04439
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import minecraft.class01725;
import minecraft.class01741;
import minecraft.class04439;

public interface class01751
extends class04439 {
    public static final MapCodec<class01751> y = RecordCodecBuilder.mapCodec(instance -> instance.group((App)Codec.STRING.fieldOf("text").forGetter(class01751::comp_737)).apply(instance, class01751::y));
    public static final class01751 L = new class01741();

    public static class01751 y(String string) {
        return string.isEmpty() ? L : new class01725(string);
    }

    default public MapCodec<class01751> N() {
        return y;
    }

    public String comp_737();
}

