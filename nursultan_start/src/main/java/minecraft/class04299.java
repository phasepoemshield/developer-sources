/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  minecraft.class03855
 *  minecraft.class03862
 *  minecraft.class04540
 *  minecraft.class06057
 *  minecraft.class06069
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import minecraft.class03855;
import minecraft.class03862;
import minecraft.class04540;
import minecraft.class06057;
import minecraft.class06069;

public class class04299
extends class03855 {
    public static final MapCodec<class04299> N = RecordCodecBuilder.mapCodec(instance -> instance.group((App)class04540.y((Codec)class03855.L).fieldOf("distribution").forGetter(class042992 -> class042992.y)).apply(instance, class04299::new));
    private final class04540<class03855> y;

    public class04299(class04540<class03855> class045402) {
        this.y = class045402;
    }

    public int N(class06069 class060692, class06057 class060572) {
        return ((class03855)this.y.y(class060692)).N(class060692, class060572);
    }

    public class03862<?> N() {
        return class03862.R;
    }
}

