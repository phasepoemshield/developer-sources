/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  minecraft.class04995
 *  minecraft.class05301
 *  minecraft.class06069
 *  minecraft.class07185
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07212
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import minecraft.class04995;
import minecraft.class05301;
import minecraft.class05318;
import minecraft.class06069;
import minecraft.class07185;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07212;

public class class05333
extends class05318 {
    public static final MapCodec<class05333> N = RecordCodecBuilder.mapCodec(instance -> instance.group((App)Codec.FLOAT.fieldOf("min_chance").orElse((Object)Float.valueOf(0.0f)).forGetter(class053332 -> Float.valueOf(class053332.y)), (App)Codec.FLOAT.fieldOf("max_chance").orElse((Object)Float.valueOf(0.0f)).forGetter(class053332 -> Float.valueOf(class053332.u)), (App)Codec.INT.fieldOf("min_dist").orElse((Object)0).forGetter(class053332 -> class053332.i), (App)Codec.INT.fieldOf("max_dist").orElse((Object)0).forGetter(class053332 -> class053332.R), (App)class07185.field_25065.fieldOf("axis").orElse((Object)class07185.field_11052).forGetter(class053332 -> class053332.M)).apply(instance, class05333::new));
    private final float y;
    private final float u;
    private final int i;
    private final int R;
    private final class07185 M;

    public class05333(float f, float f2, int n, int n2, class07185 class071852) {
        if (n >= n2) {
            throw new IllegalArgumentException("Invalid range: [" + n + "," + n2 + "]");
        }
        this.y = f;
        this.u = f2;
        this.i = n;
        this.R = n2;
        this.M = class071852;
    }

    @Override
    public boolean N(class07209 class072092, class07209 class072093, class07209 class072094, class06069 class060692) {
        class07211 class072112 = class07211.N((class07212)class07212.field_11056, (class07185)this.M);
        float f = Math.abs((class072093.method_10263() - class072094.method_10263()) * class072112.P());
        float f2 = Math.abs((class072093.method_10264() - class072094.method_10264()) * class072112.s());
        float f3 = Math.abs((class072093.method_10260() - class072094.method_10260()) * class072112.T());
        int n = (int)(f + f2 + f3);
        return class060692.z() <= class04995.y((float)class04995.R((float)n, (float)this.i, (float)this.R), (float)this.y, (float)this.u);
    }

    @Override
    protected class05301<?> N() {
        return class05301.L;
    }
}

