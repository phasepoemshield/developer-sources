/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  minecraft.class00500
 *  minecraft.class01362
 *  minecraft.class07204
 *  minecraft.class07209
 *  minecraft.class07290
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import minecraft.class00500;
import minecraft.class01362;
import minecraft.class03728;
import minecraft.class07204;
import minecraft.class07209;
import minecraft.class07290;

public class class03736
extends class07204 {
    public static final MapCodec<class03736> y = RecordCodecBuilder.mapCodec(instance -> instance.group((App)class03728.N.fieldOf("falling_dust_color").forGetter(class037362 -> class037362.L), (App)class03736.t()).apply(instance, class03736::new));
    protected final class03728 L;

    public class03736(class03728 class037282, class01362 class013622) {
        super(class013622);
        this.L = class037282;
    }

    public MapCodec<? extends class03736> N() {
        return y;
    }

    public int N(class00500 class005002, class07290 class072902, class07209 class072092) {
        return this.L.N();
    }
}

