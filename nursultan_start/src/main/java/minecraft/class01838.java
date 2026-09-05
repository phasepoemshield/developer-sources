/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.Products$P3
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder$Instance
 *  com.mojang.serialization.codecs.RecordCodecBuilder$Mu
 *  minecraft.class01471
 *  minecraft.class05041
 *  minecraft.class05056
 *  minecraft.class06069
 *  minecraft.class06075
 *  minecraft.class06338
 *  minecraft.class07209
 *  minecraft.class07836
 */
package minecraft;

import com.mojang.datafixers.Products;
import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import minecraft.class01471;
import minecraft.class05041;
import minecraft.class05056;
import minecraft.class06069;
import minecraft.class06075;
import minecraft.class06338;
import minecraft.class07209;
import minecraft.class07836;

public abstract class class01838
extends class01471 {
    protected final long L;
    protected final class05056 u;
    protected final float i;
    protected final class05041 R;

    public class01838(long l, class05056 class050562, float f) {
        this.L = l;
        this.u = class050562;
        this.i = f;
        this.R = class05041.y((class06069)new class07836((class06069)new class06075(l)), (class05056)class050562);
    }

    protected static <P extends class01838> Products.P3<RecordCodecBuilder.Mu<P>, Long, class05056, Float> N(RecordCodecBuilder.Instance<P> instance) {
        return instance.group((App)Codec.LONG.fieldOf("seed").forGetter(class018382 -> class018382.L), (App)class05056.L.fieldOf("noise").forGetter(class018382 -> class018382.u), (App)class06338.t.fieldOf("scale").forGetter(class018382 -> Float.valueOf(class018382.i)));
    }

    protected double N(class07209 class072092, double d) {
        return this.R.N((double)class072092.method_10263() * d, (double)class072092.method_10264() * d, (double)class072092.method_10260() * d);
    }
}

