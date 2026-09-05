/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  minecraft.class03556
 *  minecraft.class04336
 *  minecraft.class05974
 *  minecraft.class06069
 *  minecraft.class07209
 *  minecraft.class08088
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import minecraft.class03556;
import minecraft.class04336;
import minecraft.class05974;
import minecraft.class06069;
import minecraft.class07209;
import minecraft.class08088;

public class class04747 {
    public static final Codec<class04747> N = RecordCodecBuilder.create(instance -> instance.group((App)class04336.y.fieldOf("feature").forGetter(class047472 -> class047472.y), (App)Codec.floatRange((float)0.0f, (float)1.0f).fieldOf("chance").forGetter(class047472 -> Float.valueOf(class047472.L))).apply(instance, class04747::new));
    public final class03556<class04336> y;
    public final float L;

    public class04747(class03556<class04336> class035562, float f) {
        this.y = class035562;
        this.L = f;
    }

    public boolean N(class05974 class059742, class08088 class080882, class06069 class060692, class07209 class072092) {
        return ((class04336)this.y.N()).N(class059742, class080882, class060692, class072092);
    }
}

