/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  minecraft.class01362
 *  minecraft.class02329
 *  minecraft.class02615
 *  minecraft.class06069
 *  minecraft.class06338
 *  minecraft.class07103
 *  minecraft.class07107
 *  minecraft.class07126
 *  minecraft.class07131
 *  minecraft.class07209
 *  minecraft.class07299
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import minecraft.class01362;
import minecraft.class02329;
import minecraft.class02615;
import minecraft.class06069;
import minecraft.class06338;
import minecraft.class07103;
import minecraft.class07107;
import minecraft.class07126;
import minecraft.class07131;
import minecraft.class07209;
import minecraft.class07299;

public class class08564
extends class07131 {
    public static final MapCodec<class08564> N = RecordCodecBuilder.mapCodec(instance -> instance.group((App)class06338.N((float)0.0f, (float)1.0f).fieldOf("leaf_particle_chance").forGetter(class085642 -> Float.valueOf(class085642.M)), (App)class08564.t()).apply(instance, class08564::new));

    public class08564(float f, class01362 class013622) {
        super(f, class013622);
    }

    protected void N(class07299 class072992, class07209 class072092, class06069 class060692) {
        class02329 class023292 = class02329.N((class07103)class07107.V, (int)class072992.method_67233(class072092));
        class02615.N((class07299)class072992, (class07209)class072092, (class06069)class060692, (class07126)class023292);
    }

    public MapCodec<? extends class08564> N() {
        return N;
    }
}

