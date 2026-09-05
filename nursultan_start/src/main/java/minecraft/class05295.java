/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  minecraft.class00753
 *  minecraft.class04995
 *  minecraft.class05318
 *  minecraft.class06069
 *  minecraft.class07209
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import minecraft.class00753;
import minecraft.class04995;
import minecraft.class05301;
import minecraft.class05318;
import minecraft.class06069;
import minecraft.class07209;

public class class05295
extends class05318 {
    public static final MapCodec<class05295> N = RecordCodecBuilder.mapCodec(instance -> instance.group((App)Codec.FLOAT.fieldOf("min_chance").orElse((Object)Float.valueOf(0.0f)).forGetter(class052952 -> Float.valueOf(class052952.y)), (App)Codec.FLOAT.fieldOf("max_chance").orElse((Object)Float.valueOf(0.0f)).forGetter(class052952 -> Float.valueOf(class052952.u)), (App)Codec.INT.fieldOf("min_dist").orElse((Object)0).forGetter(class052952 -> class052952.i), (App)Codec.INT.fieldOf("max_dist").orElse((Object)0).forGetter(class052952 -> class052952.R)).apply(instance, class05295::new));
    private final float y;
    private final float u;
    private final int i;
    private final int R;

    public class05295(float f, float f2, int n, int n2) {
        if (n >= n2) {
            throw new IllegalArgumentException("Invalid range: [" + n + "," + n2 + "]");
        }
        this.y = f;
        this.u = f2;
        this.i = n;
        this.R = n2;
    }

    public boolean N(class07209 class072092, class07209 class072093, class07209 class072094, class06069 class060692) {
        int n = class072093.method_19455((class00753)class072094);
        return class060692.z() <= class04995.y((float)class04995.R((float)n, (float)this.i, (float)this.R), (float)this.y, (float)this.u);
    }

    protected class05301<?> N() {
        return class05301.y;
    }
}

