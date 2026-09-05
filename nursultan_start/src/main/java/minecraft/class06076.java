/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  minecraft.class06386
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import minecraft.class06386;

public class class06076
implements class06386 {
    public static final Codec<class06076> N = RecordCodecBuilder.create(instance -> instance.group((App)Codec.intRange((int)0, (int)512).fieldOf("floor_search_range").forGetter(class060762 -> class060762.y), (App)Codec.intRange((int)0, (int)64).fieldOf("placement_radius_around_floor").forGetter(class060762 -> class060762.L), (App)Codec.floatRange((float)0.0f, (float)1.0f).fieldOf("placement_probability_per_valid_position").forGetter(class060762 -> Float.valueOf(class060762.u))).apply(instance, class06076::new));
    public final int y;
    public final int L;
    public final float u;

    public class06076(int n, int n2, float f) {
        this.y = n;
        this.L = n2;
        this.u = f;
    }
}

