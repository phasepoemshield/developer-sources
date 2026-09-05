/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.DataResult
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  minecraft.class00500
 *  minecraft.class01362
 *  minecraft.class03710
 *  minecraft.class04206
 *  minecraft.class06069
 *  minecraft.class07107
 *  minecraft.class07126
 *  minecraft.class07134
 *  minecraft.class07209
 *  minecraft.class07299
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import minecraft.class00500;
import minecraft.class01362;
import minecraft.class03710;
import minecraft.class04206;
import minecraft.class06069;
import minecraft.class07107;
import minecraft.class07126;
import minecraft.class07134;
import minecraft.class07209;
import minecraft.class07299;

public class class00670
extends class03710 {
    protected static final MapCodec<class07134> N = class04206.z.T().comapFlatMap(class071032 -> class071032 instanceof class07134 ? DataResult.success((Object)((class07134)class071032)) : DataResult.error(() -> "Not a SimpleParticleType: " + String.valueOf(class071032)), class071342 -> class071342).fieldOf("particle_options");
    public static final MapCodec<class00670> y = RecordCodecBuilder.mapCodec(instance -> instance.group((App)N.forGetter(class006702 -> class006702.L), (App)class00670.t()).apply(instance, class00670::new));
    protected final class07134 L;

    public class00670(class07134 class071342, class01362 class013622) {
        super(class013622);
        this.L = class071342;
    }

    public MapCodec<? extends class00670> N() {
        return y;
    }

    public void N_20(class00500 class005002, class07299 class072992, class07209 class072092, class06069 class060692) {
        double d = (double)class072092.method_10263() + 0.5;
        double d2 = (double)class072092.method_10264() + 0.7;
        double d3 = (double)class072092.method_10260() + 0.5;
        class072992.method_8406((class07126)class07107.NZ, d, d2, d3, 0.0, 0.0, 0.0);
        class072992.method_8406((class07126)this.L, d, d2, d3, 0.0, 0.0, 0.0);
    }
}

