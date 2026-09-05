/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  minecraft.class00500
 *  minecraft.class01362
 *  minecraft.class03728
 *  minecraft.class03736
 *  minecraft.class06069
 *  minecraft.class07209
 *  minecraft.class07299
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import minecraft.class00500;
import minecraft.class01362;
import minecraft.class03728;
import minecraft.class03736;
import minecraft.class06069;
import minecraft.class07209;
import minecraft.class07299;
import minecraft.class08402;

public class class08407
extends class03736 {
    public static final MapCodec<class08407> N = RecordCodecBuilder.mapCodec(instance -> instance.group((App)class03728.N.fieldOf("falling_dust_color").forGetter(class084072 -> class084072.L), (App)class08407.t()).apply(instance, class08407::new));

    public class08407(class03728 class037282, class01362 class013622) {
        super(class037282, class013622);
    }

    public MapCodec<class08407> N() {
        return N;
    }

    public void N_20(class00500 class005002, class07299 class072992, class07209 class072092, class06069 class060692) {
        super.N_20(class005002, class072992, class072092, class060692);
        class08402.N(class072992, class072092, class060692);
    }
}

