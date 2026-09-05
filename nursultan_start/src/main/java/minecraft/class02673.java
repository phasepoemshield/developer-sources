/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  minecraft.class00891
 *  minecraft.class01471
 *  minecraft.class03530
 *  minecraft.class03556
 *  minecraft.class04025
 *  minecraft.class04227
 *  minecraft.class04336
 *  minecraft.class05946
 *  minecraft.class06386
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import minecraft.class00891;
import minecraft.class01471;
import minecraft.class03530;
import minecraft.class03556;
import minecraft.class04025;
import minecraft.class04227;
import minecraft.class04336;
import minecraft.class05946;
import minecraft.class06386;

public class class02673
implements class06386 {
    public static final Codec<class02673> N = RecordCodecBuilder.create(instance -> instance.group((App)class04336.y.fieldOf("feature").forGetter(class026732 -> class026732.y), (App)Codec.intRange((int)1, (int)64).fieldOf("required_vertical_space_for_tree").forGetter(class026732 -> class026732.L), (App)Codec.intRange((int)1, (int)64).fieldOf("root_radius").forGetter(class026732 -> class026732.u), (App)class03530.y((class05946)class04227.Z).fieldOf("root_replaceable").forGetter(class026732 -> class026732.i), (App)class01471.N.fieldOf("root_state_provider").forGetter(class026732 -> class026732.M), (App)Codec.intRange((int)1, (int)256).fieldOf("root_placement_attempts").forGetter(class026732 -> class026732.B), (App)Codec.intRange((int)1, (int)4096).fieldOf("root_column_max_height").forGetter(class026732 -> class026732.Z), (App)Codec.intRange((int)1, (int)64).fieldOf("hanging_root_radius").forGetter(class026732 -> class026732.z), (App)Codec.intRange((int)1, (int)16).fieldOf("hanging_roots_vertical_span").forGetter(class026732 -> class026732.U), (App)class01471.N.fieldOf("hanging_root_state_provider").forGetter(class026732 -> class026732.E), (App)Codec.intRange((int)1, (int)256).fieldOf("hanging_root_placement_attempts").forGetter(class026732 -> class026732.W), (App)Codec.intRange((int)1, (int)64).fieldOf("allowed_vertical_water_for_tree").forGetter(class026732 -> class026732.m), (App)class04025.y.fieldOf("allowed_tree_position").forGetter(class026732 -> class026732.P)).apply(instance, class02673::new));
    public final class03556<class04336> y;
    public final int L;
    public final int u;
    public final class03530<class00891> i;
    public final class01471 M;
    public final int B;
    public final int Z;
    public final int z;
    public final int U;
    public final class01471 E;
    public final int W;
    public final int m;
    public final class04025 P;

    public class02673(class03556<class04336> class035562, int n, int n2, class03530<class00891> class035302, class01471 class014712, int n3, int n4, int n5, int n6, class01471 class014713, int n7, int n8, class04025 class040252) {
        this.y = class035562;
        this.L = n;
        this.u = n2;
        this.i = class035302;
        this.M = class014712;
        this.B = n3;
        this.Z = n4;
        this.z = n5;
        this.U = n6;
        this.E = class014713;
        this.W = n7;
        this.m = n8;
        this.P = class040252;
    }
}

