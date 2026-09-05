/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.Products$P4
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  com.mojang.serialization.codecs.RecordCodecBuilder$Instance
 *  com.mojang.serialization.codecs.RecordCodecBuilder$Mu
 *  minecraft.class00500
 *  minecraft.class01473
 *  minecraft.class04995
 *  minecraft.class05056
 *  minecraft.class06069
 *  minecraft.class06338
 *  minecraft.class07209
 */
package minecraft;

import com.mojang.datafixers.Products;
import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import minecraft.class00500;
import minecraft.class01473;
import minecraft.class01838;
import minecraft.class04995;
import minecraft.class05056;
import minecraft.class06069;
import minecraft.class06338;
import minecraft.class07209;

public class class01840
extends class01838 {
    public static final MapCodec<class01840> M = RecordCodecBuilder.mapCodec(instance -> class01840.y(instance).apply(instance, class01840::new));
    protected final List<class00500> B;

    public class01840(long l, class05056 class050562, float f, List<class00500> list) {
        super(l, class050562, f);
        this.B = list;
    }

    protected static <P extends class01840> Products.P4<RecordCodecBuilder.Mu<P>, Long, class05056, Float, List<class00500>> y(RecordCodecBuilder.Instance<P> instance) {
        return class01840.N(instance).and((App)class06338.y((Codec)class00500.N.listOf()).fieldOf("states").forGetter(class018402 -> class018402.B));
    }

    protected class00500 N(List<class00500> list, class07209 class072092, double d) {
        double d2 = this.N(class072092, d);
        return this.N(list, d2);
    }

    protected class01473<?> N() {
        return class01473.u;
    }

    protected class00500 N(List<class00500> list, double d) {
        double d2 = class04995.N((double)((1.0 + d) / 2.0), (double)0.0, (double)0.9999);
        return list.get((int)(d2 * (double)list.size()));
    }

    public class00500 N(class06069 class060692, class07209 class072092) {
        return this.N(this.B, class072092, this.i);
    }
}

