/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  minecraft.class01117
 *  minecraft.class01119
 *  minecraft.class01121
 *  minecraft.class02135
 *  minecraft.class02142
 *  minecraft.class06386
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import minecraft.class01117;
import minecraft.class01119;
import minecraft.class01121;
import minecraft.class02135;
import minecraft.class02142;
import minecraft.class06386;

public class class01100
implements class06386 {
    public static final Codec<Double> N = Codec.doubleRange((double)0.0, (double)1.0);
    public static final Codec<class01100> y = RecordCodecBuilder.create(instance -> instance.group((App)class01121.Z.fieldOf("blocks").forGetter(class011002 -> class011002.L), (App)class01119.N.fieldOf("layers").forGetter(class011002 -> class011002.u), (App)class01117.N.fieldOf("crack").forGetter(class011002 -> class011002.i), (App)N.fieldOf("use_potential_placements_chance").orElse((Object)0.35).forGetter(class011002 -> class011002.M), (App)N.fieldOf("use_alternate_layer0_chance").orElse((Object)0.0).forGetter(class011002 -> class011002.B), (App)Codec.BOOL.fieldOf("placements_require_layer0_alternate").orElse((Object)true).forGetter(class011002 -> class011002.Z), (App)class02142.N((int)1, (int)20).fieldOf("outer_wall_distance").orElse((Object)class02135.y((int)4, (int)5)).forGetter(class011002 -> class011002.z), (App)class02142.N((int)1, (int)20).fieldOf("distribution_points").orElse((Object)class02135.y((int)3, (int)4)).forGetter(class011002 -> class011002.U), (App)class02142.N((int)0, (int)10).fieldOf("point_offset").orElse((Object)class02135.y((int)1, (int)2)).forGetter(class011002 -> class011002.E), (App)Codec.INT.fieldOf("min_gen_offset").orElse((Object)-16).forGetter(class011002 -> class011002.W), (App)Codec.INT.fieldOf("max_gen_offset").orElse((Object)16).forGetter(class011002 -> class011002.m), (App)N.fieldOf("noise_multiplier").orElse((Object)0.05).forGetter(class011002 -> class011002.P), (App)Codec.INT.fieldOf("invalid_blocks_threshold").forGetter(class011002 -> class011002.s)).apply(instance, class01100::new));
    public final class01121 L;
    public final class01119 u;
    public final class01117 i;
    public final double M;
    public final double B;
    public final boolean Z;
    public final class02142 z;
    public final class02142 U;
    public final class02142 E;
    public final int W;
    public final int m;
    public final double P;
    public final int s;

    public class01100(class01121 class011212, class01119 class011192, class01117 class011172, double d, double d2, boolean bl, class02142 class021422, class02142 class021423, class02142 class021424, int n, int n2, double d3, int n3) {
        this.L = class011212;
        this.u = class011192;
        this.i = class011172;
        this.M = d;
        this.B = d2;
        this.Z = bl;
        this.z = class021422;
        this.U = class021423;
        this.E = class021424;
        this.W = n;
        this.m = n2;
        this.P = d3;
        this.s = n3;
    }
}

