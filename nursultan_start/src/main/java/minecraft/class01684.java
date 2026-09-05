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
 *  minecraft.class04995
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
import minecraft.class04995;
import minecraft.class06069;

public class class01684
extends class02142 {
    public static final MapCodec<class01684> N = RecordCodecBuilder.mapCodec(instance -> instance.group((App)class02142.L.fieldOf("source").forGetter(class016842 -> class016842.y), (App)Codec.INT.fieldOf("min_inclusive").forGetter(class016842 -> class016842.R), (App)Codec.INT.fieldOf("max_inclusive").forGetter(class016842 -> class016842.M)).apply(instance, class01684::new)).validate(class016842 -> {
        if (class016842.M < class016842.R) {
            return DataResult.error(() -> "Max must be at least min, min_inclusive: " + class016842.R + ", max_inclusive: " + class016842.M);
        }
        return DataResult.success((Object)class016842);
    });
    private final class02142 y;
    private final int R;
    private final int M;

    public int L() {
        return Math.min(this.M, this.y.L());
    }

    public class01684(class02142 class021422, int n, int n2) {
        this.y = class021422;
        this.R = n;
        this.M = n2;
    }

    public class02139<?> u() {
        return class02139.u;
    }

    public int y() {
        return Math.max(this.R, this.y.y());
    }

    public static class01684 N(class02142 class021422, int n, int n2) {
        return new class01684(class021422, n, n2);
    }

    public int N(class06069 class060692) {
        return class04995.N((int)this.y.N(class060692), (int)this.R, (int)this.M);
    }
}

