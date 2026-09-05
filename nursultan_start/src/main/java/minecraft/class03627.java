/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  minecraft.class02362
 *  minecraft.class02389
 *  minecraft.class04247
 *  minecraft.class07103
 *  minecraft.class07107
 *  minecraft.class07126
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import minecraft.class02362;
import minecraft.class02389;
import minecraft.class04247;
import minecraft.class07103;
import minecraft.class07107;
import minecraft.class07126;

public class class03627
implements class07126 {
    public static final MapCodec<class03627> N = RecordCodecBuilder.mapCodec(instance -> instance.group((App)Codec.INT.fieldOf("delay").forGetter(class036272 -> class036272.L)).apply(instance, class03627::new));
    public static final class02362<class04247, class03627> y = class02362.N((class02362)class02389.B, class036272 -> class036272.L, class03627::new);
    private final int L;

    public class03627(int n) {
        this.L = n;
    }

    public int N() {
        return this.L;
    }

    public class07103<class03627> method_10295() {
        return class07107.Nr;
    }
}

