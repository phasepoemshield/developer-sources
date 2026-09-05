/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.logging.LogUtils
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  minecraft.class03855
 *  minecraft.class03862
 *  minecraft.class04995
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
import minecraft.class04995;
import minecraft.class06055;
import minecraft.class06057;
import minecraft.class06069;
import org.slf4j.Logger;

public class class01708
extends class03855 {
    public static final MapCodec<class01708> N = RecordCodecBuilder.mapCodec(instance -> instance.group((App)class06055.N.fieldOf("min_inclusive").forGetter(class017082 -> class017082.u), (App)class06055.N.fieldOf("max_inclusive").forGetter(class017082 -> class017082.i), (App)Codec.INT.optionalFieldOf("plateau", (Object)0).forGetter(class017082 -> class017082.R)).apply(instance, class01708::new));
    private static final Logger y = LogUtils.getLogger();
    private final class06055 u;
    private final class06055 i;
    private final int R;

    private class01708(class06055 class060552, class06055 class060553, int n) {
        this.u = class060552;
        this.i = class060553;
        this.R = n;
    }

    public String toString() {
        if (this.R == 0) {
            return "triangle (" + String.valueOf(this.u) + "-" + String.valueOf(this.i) + ")";
        }
        return "trapezoid(" + this.R + ") in [" + String.valueOf(this.u) + "-" + String.valueOf(this.i) + "]";
    }

    public static class01708 N(class06055 class060552, class06055 class060553, int n) {
        return new class01708(class060552, class060553, n);
    }

    public int N(class06069 class060692, class06057 class060572) {
        int n;
        int n2 = this.u.N(class060572);
        if (n2 > (n = this.i.N(class060572))) {
            y.warn("Empty height range: {}", (Object)this);
            return n2;
        }
        int n3 = n - n2;
        if (this.R >= n3) {
            return class04995.y((class06069)class060692, (int)n2, (int)n);
        }
        int n4 = (n3 - this.R) / 2;
        int n5 = n3 - n4;
        return n2 + class04995.y((class06069)class060692, (int)0, (int)n5) + class04995.y((class06069)class060692, (int)0, (int)n4);
    }

    public static class01708 N(class06055 class060552, class06055 class060553) {
        return class01708.N(class060552, class060553, 0);
    }

    public class03862<?> N() {
        return class03862.i;
    }
}

