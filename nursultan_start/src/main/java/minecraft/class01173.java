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

public class class01173
implements class06386 {
    public static final Codec<class01173> N = RecordCodecBuilder.create(instance -> instance.group((App)Codec.floatRange((float)0.0f, (float)1.0f).fieldOf("chance_of_taller_dripstone").orElse((Object)Float.valueOf(0.2f)).forGetter(class011732 -> Float.valueOf(class011732.y)), (App)Codec.floatRange((float)0.0f, (float)1.0f).fieldOf("chance_of_directional_spread").orElse((Object)Float.valueOf(0.7f)).forGetter(class011732 -> Float.valueOf(class011732.L)), (App)Codec.floatRange((float)0.0f, (float)1.0f).fieldOf("chance_of_spread_radius2").orElse((Object)Float.valueOf(0.5f)).forGetter(class011732 -> Float.valueOf(class011732.u)), (App)Codec.floatRange((float)0.0f, (float)1.0f).fieldOf("chance_of_spread_radius3").orElse((Object)Float.valueOf(0.5f)).forGetter(class011732 -> Float.valueOf(class011732.i))).apply(instance, class01173::new));
    public final float y;
    public final float L;
    public final float u;
    public final float i;

    public class01173(float f, float f2, float f3, float f4) {
        this.y = f;
        this.L = f2;
        this.u = f3;
        this.i = f4;
    }
}

