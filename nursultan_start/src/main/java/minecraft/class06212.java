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

public class class06212
implements class06386 {
    public static final Codec<class06212> N = RecordCodecBuilder.create(instance -> instance.group((App)Codec.floatRange((float)0.0f, (float)1.0f).fieldOf("probability").forGetter(class062122 -> Float.valueOf(class062122.y))).apply(instance, class06212::new));
    public final float y;

    public class06212(float f) {
        this.y = f;
    }
}

