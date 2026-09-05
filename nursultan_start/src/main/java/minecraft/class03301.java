/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  minecraft.class02139
 *  minecraft.class02142
 *  minecraft.class04523
 *  minecraft.class04540
 *  minecraft.class06069
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import minecraft.class02139;
import minecraft.class02142;
import minecraft.class04523;
import minecraft.class04540;
import minecraft.class06069;

public class class03301
extends class02142 {
    public static final MapCodec<class03301> N = RecordCodecBuilder.mapCodec(instance -> instance.group((App)class04540.y((Codec)class02142.L).fieldOf("distribution").forGetter(class033012 -> class033012.y)).apply(instance, class03301::new));
    private final class04540<class02142> y;
    private final int R;
    private final int M;

    public int L() {
        return this.M;
    }

    public class03301(class04540<class02142> class045402) {
        this.y = class045402;
        int n = Integer.MAX_VALUE;
        int n2 = Integer.MIN_VALUE;
        for (class04523 class045232 : class045402.u()) {
            int n3 = ((class02142)class045232.N()).y();
            int n4 = ((class02142)class045232.N()).L();
            n = Math.min(n, n3);
            n2 = Math.max(n2, n4);
        }
        this.R = n;
        this.M = n2;
    }

    public class02139<?> u() {
        return class02139.i;
    }

    public int y() {
        return this.R;
    }

    public int N(class06069 class060692) {
        return ((class02142)this.y.y(class060692)).N(class060692);
    }
}

