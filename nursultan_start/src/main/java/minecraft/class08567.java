/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  minecraft.class01362
 *  minecraft.class02615
 *  minecraft.class06069
 *  minecraft.class06338
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
import minecraft.class02615;
import minecraft.class06069;
import minecraft.class06338;
import minecraft.class07107;
import minecraft.class07126;
import minecraft.class07131;
import minecraft.class07209;
import minecraft.class07299;

public class class08567
extends class07131 {
    public static final MapCodec<class08567> N = RecordCodecBuilder.mapCodec(instance -> instance.group((App)class06338.N((float)0.0f, (float)1.0f).fieldOf("leaf_particle_chance").forGetter(class085672 -> Float.valueOf(class085672.M)), (App)class07107.yE.fieldOf("leaf_particle").forGetter(class085672 -> class085672.y), (App)class08567.t()).apply(instance, class08567::new));
    protected final class07126 y;

    public class08567(float f, class07126 class071262, class01362 class013622) {
        super(f, class013622);
        this.y = class071262;
    }

    protected void N(class07299 class072992, class07209 class072092, class06069 class060692) {
        class02615.N((class07299)class072992, (class07209)class072092, (class06069)class060692, (class07126)this.y);
    }

    public MapCodec<class08567> N() {
        return N;
    }
}

