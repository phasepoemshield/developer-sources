/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  minecraft.class06338
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import minecraft.class06052;
import minecraft.class06338;

public class class06037 {
    public static final Codec<class06037> N = RecordCodecBuilder.create(instance -> instance.group((App)class06052.L.fieldOf("distance_factor").forGetter(class060372 -> class060372.y), (App)class06052.L.fieldOf("thickness").forGetter(class060372 -> class060372.L), (App)class06338.b.fieldOf("width_smoothness").forGetter(class060372 -> class060372.u), (App)class06052.L.fieldOf("horizontal_radius_factor").forGetter(class060372 -> class060372.i), (App)Codec.FLOAT.fieldOf("vertical_radius_default_factor").forGetter(class060372 -> Float.valueOf(class060372.R)), (App)Codec.FLOAT.fieldOf("vertical_radius_center_factor").forGetter(class060372 -> Float.valueOf(class060372.M))).apply(instance, class06037::new));
    public final class06052 y;
    public final class06052 L;
    public final int u;
    public final class06052 i;
    public final float R;
    public final float M;

    public class06037(class06052 class060522, class06052 class060523, int n, class06052 class060524, float f, float f2) {
        this.u = n;
        this.i = class060524;
        this.R = f;
        this.M = f2;
        this.y = class060522;
        this.L = class060523;
    }
}

