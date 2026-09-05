/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  minecraft.class02139
 *  minecraft.class02142
 *  minecraft.class06069
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import minecraft.class02139;
import minecraft.class02142;
import minecraft.class06069;

public class class01697
extends class02142 {
    public static final MapCodec<class01697> N = RecordCodecBuilder.mapCodec(instance -> instance.group((App)Codec.INT.fieldOf("min_inclusive").forGetter(class016972 -> class016972.y), (App)Codec.INT.fieldOf("max_inclusive").forGetter(class016972 -> class016972.R)).apply(instance, class01697::new)).validate(class016972 -> {
        if (class016972.R < class016972.y) {
            return DataResult.error(() -> "Max must be at least min, min_inclusive: " + class016972.y + ", max_inclusive: " + class016972.R);
        }
        return DataResult.success((Object)class016972);
    });
    private final int y;
    private final int R;

    public int L() {
        return this.R;
    }

    private class01697(int n, int n2) {
        this.y = n;
        this.R = n2;
    }

    public String toString() {
        return "[" + this.y + "-" + this.R + "]";
    }

    public class02139<?> u() {
        return class02139.L;
    }

    public static class01697 y(int n, int n2) {
        return new class01697(n, n2);
    }

    public int y() {
        return this.y;
    }

    public int N(class06069 class060692) {
        return this.y + class060692.y(class060692.y(this.R - this.y + 1) + 1);
    }
}

