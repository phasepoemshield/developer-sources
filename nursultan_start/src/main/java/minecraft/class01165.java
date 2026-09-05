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

public class class01165
implements class06386 {
    public static final Codec<class01165> N = RecordCodecBuilder.create(instance -> instance.group((App)Codec.intRange((int)1, (int)512).fieldOf("floor_to_ceiling_search_range").orElse((Object)30).forGetter(class011652 -> class011652.y), (App)class02142.N((int)1, (int)60).fieldOf("column_radius").forGetter(class011652 -> class011652.L), (App)class06052.N((float)0.0f, (float)20.0f).fieldOf("height_scale").forGetter(class011652 -> class011652.u), (App)Codec.floatRange((float)0.1f, (float)1.0f).fieldOf("max_column_radius_to_cave_height_ratio").forGetter(class011652 -> Float.valueOf(class011652.i)), (App)class06052.N((float)0.1f, (float)10.0f).fieldOf("stalactite_bluntness").forGetter(class011652 -> class011652.M), (App)class06052.N((float)0.1f, (float)10.0f).fieldOf("stalagmite_bluntness").forGetter(class011652 -> class011652.B), (App)class06052.N((float)0.0f, (float)2.0f).fieldOf("wind_speed").forGetter(class011652 -> class011652.Z), (App)Codec.intRange((int)0, (int)100).fieldOf("min_radius_for_wind").forGetter(class011652 -> class011652.z), (App)Codec.floatRange((float)0.0f, (float)5.0f).fieldOf("min_bluntness_for_wind").forGetter(class011652 -> Float.valueOf(class011652.U))).apply(instance, class01165::new));
    public final int y;
    public final class02142 L;
    public final class06052 u;
    public final float i;
    public final class06052 M;
    public final class06052 B;
    public final class06052 Z;
    public final int z;
    public final float U;

    public class01165(int n, class02142 class021422, class06052 class060522, float f, class06052 class060523, class06052 class060524, class06052 class060525, int n2, float f2) {
        this.y = n;
        this.L = class021422;
        this.u = class060522;
        this.i = f;
        this.M = class060523;
        this.B = class060524;
        this.Z = class060525;
        this.z = n2;
        this.U = f2;
    }
}

