/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  minecraft.class00891
 *  minecraft.class01471
 *  minecraft.class02142
 *  minecraft.class03530
 *  minecraft.class03556
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
import minecraft.class02142;
import minecraft.class02258;
import minecraft.class03530;
import minecraft.class03556;
import minecraft.class04227;
import minecraft.class04336;
import minecraft.class05946;
import minecraft.class06386;

public class class02256
implements class06386 {
    public static final Codec<class02256> N = RecordCodecBuilder.create(instance -> instance.group((App)class03530.y((class05946)class04227.Z).fieldOf("replaceable").forGetter(class022562 -> class022562.y), (App)class01471.N.fieldOf("ground_state").forGetter(class022562 -> class022562.L), (App)class04336.y.fieldOf("vegetation_feature").forGetter(class022562 -> class022562.u), (App)class02258.field_29315.fieldOf("surface").forGetter(class022562 -> class022562.i), (App)class02142.N((int)1, (int)128).fieldOf("depth").forGetter(class022562 -> class022562.M), (App)Codec.floatRange((float)0.0f, (float)1.0f).fieldOf("extra_bottom_block_chance").forGetter(class022562 -> Float.valueOf(class022562.B)), (App)Codec.intRange((int)1, (int)256).fieldOf("vertical_range").forGetter(class022562 -> class022562.Z), (App)Codec.floatRange((float)0.0f, (float)1.0f).fieldOf("vegetation_chance").forGetter(class022562 -> Float.valueOf(class022562.z)), (App)class02142.L.fieldOf("xz_radius").forGetter(class022562 -> class022562.U), (App)Codec.floatRange((float)0.0f, (float)1.0f).fieldOf("extra_edge_column_chance").forGetter(class022562 -> Float.valueOf(class022562.E))).apply(instance, class02256::new));
    public final class03530<class00891> y;
    public final class01471 L;
    public final class03556<class04336> u;
    public final class02258 i;
    public final class02142 M;
    public final float B;
    public final int Z;
    public final float z;
    public final class02142 U;
    public final float E;

    public class02256(class03530<class00891> class035302, class01471 class014712, class03556<class04336> class035562, class02258 class022582, class02142 class021422, float f, int n, float f2, class02142 class021423, float f3) {
        this.y = class035302;
        this.L = class014712;
        this.u = class035562;
        this.i = class022582;
        this.M = class021422;
        this.B = f;
        this.Z = n;
        this.z = f2;
        this.U = class021423;
        this.E = f3;
    }
}

