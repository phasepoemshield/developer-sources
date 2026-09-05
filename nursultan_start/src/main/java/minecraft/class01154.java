/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  minecraft.class02142
 *  minecraft.class06052
 *  minecraft.class06386
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import minecraft.class02142;
import minecraft.class06052;
import minecraft.class06386;

public class class01154
implements class06386 {
    public static final Codec<class01154> N = RecordCodecBuilder.create(instance -> instance.group((App)Codec.intRange((int)1, (int)512).fieldOf("floor_to_ceiling_search_range").forGetter(class011542 -> class011542.y), (App)class02142.N((int)1, (int)128).fieldOf("height").forGetter(class011542 -> class011542.L), (App)class02142.N((int)1, (int)128).fieldOf("radius").forGetter(class011542 -> class011542.u), (App)Codec.intRange((int)0, (int)64).fieldOf("max_stalagmite_stalactite_height_diff").forGetter(class011542 -> class011542.i), (App)Codec.intRange((int)1, (int)64).fieldOf("height_deviation").forGetter(class011542 -> class011542.M), (App)class02142.N((int)0, (int)128).fieldOf("dripstone_block_layer_thickness").forGetter(class011542 -> class011542.B), (App)class06052.N((float)0.0f, (float)2.0f).fieldOf("density").forGetter(class011542 -> class011542.Z), (App)class06052.N((float)0.0f, (float)2.0f).fieldOf("wetness").forGetter(class011542 -> class011542.z), (App)Codec.floatRange((float)0.0f, (float)1.0f).fieldOf("chance_of_dripstone_column_at_max_distance_from_center").forGetter(class011542 -> Float.valueOf(class011542.U)), (App)Codec.intRange((int)1, (int)64).fieldOf("max_distance_from_edge_affecting_chance_of_dripstone_column").forGetter(class011542 -> class011542.E), (App)Codec.intRange((int)1, (int)64).fieldOf("max_distance_from_center_affecting_height_bias").forGetter(class011542 -> class011542.W)).apply(instance, class01154::new));
    public final int y;
    public final class02142 L;
    public final class02142 u;
    public final int i;
    public final int M;
    public final class02142 B;
    public final class06052 Z;
    public final class06052 z;
    public final float U;
    public final int E;
    public final int W;

    public class01154(int n, class02142 class021422, class02142 class021423, int n2, int n3, class02142 class021424, class06052 class060522, class06052 class060523, float f, int n4, int n5) {
        this.y = n;
        this.L = class021422;
        this.u = class021423;
        this.i = n2;
        this.M = n3;
        this.B = class021424;
        this.Z = class060522;
        this.z = class060523;
        this.U = f;
        this.E = n4;
        this.W = n5;
    }
}

