/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.logging.LogUtils
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  minecraft.class06055
 *  minecraft.class06057
 *  minecraft.class06069
 *  org.slf4j.Logger
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import minecraft.class03855;
import minecraft.class03862;
import minecraft.class06055;
import minecraft.class06057;
import minecraft.class06069;
import org.slf4j.Logger;

public class class03851
extends class03855 {
    public static final MapCodec<class03851> N = RecordCodecBuilder.mapCodec(instance -> instance.group((App)class06055.N.fieldOf("min_inclusive").forGetter(class038512 -> class038512.u), (App)class06055.N.fieldOf("max_inclusive").forGetter(class038512 -> class038512.i), (App)Codec.intRange((int)1, (int)Integer.MAX_VALUE).optionalFieldOf("inner", (Object)1).forGetter(class038512 -> class038512.R)).apply(instance, class03851::new));
    private static final Logger y = LogUtils.getLogger();
    private final class06055 u;
    private final class06055 i;
    private final int R;

    private class03851(class06055 class060552, class06055 class060553, int n) {
        this.u = class060552;
        this.i = class060553;
        this.R = n;
    }

    public String toString() {
        return "biased[" + String.valueOf(this.u) + "-" + String.valueOf(this.i) + " inner: " + this.R + "]";
    }

    public static class03851 N(class06055 class060552, class06055 class060553, int n) {
        return new class03851(class060552, class060553, n);
    }

    @Override
    public int N(class06069 class060692, class06057 class060572) {
        int n = this.u.N(class060572);
        int n2 = this.i.N(class060572);
        if (n2 - n - this.R + 1 <= 0) {
            y.warn("Empty height range: {}", (Object)this);
            return n;
        }
        int n3 = class060692.y(n2 - n - this.R + 1);
        return class060692.y(n3 + this.R) + n;
    }

    @Override
    public class03862<?> N() {
        return class03862.L;
    }
}

