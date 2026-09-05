/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
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
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import minecraft.class01177;
import minecraft.class01190;
import minecraft.class02362;
import minecraft.class02389;
import minecraft.class04247;
import minecraft.class07103;
import minecraft.class07107;
import minecraft.class07126;

public class class01192
implements class07126 {
    private static final Codec<class01190> L = class01190.L.validate(class011902 -> class011902 instanceof class01177 ? DataResult.error(() -> "Entity position sources are not allowed") : DataResult.success((Object)class011902));
    public static final MapCodec<class01192> N = RecordCodecBuilder.mapCodec(instance -> instance.group((App)L.fieldOf("destination").forGetter(class01192::N), (App)Codec.INT.fieldOf("arrival_in_ticks").forGetter(class01192::y)).apply(instance, class01192::new));
    public static final class02362<class04247, class01192> y = class02362.N(class01190.u, class01192::N, (class02362)class02389.B, class01192::y, class01192::new);
    private final class01190 u;
    private final int i;

    public class01192(class01190 class011902, int n) {
        this.u = class011902;
        this.i = n;
    }

    public int y() {
        return this.i;
    }

    public class01190 N() {
        return this.u;
    }

    public class07103<class01192> method_10295() {
        return class07107.x;
    }
}

