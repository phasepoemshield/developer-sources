/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  minecraft.class00500
 *  minecraft.class01473
 *  minecraft.class01840
 *  minecraft.class04548
 *  minecraft.class04995
 *  minecraft.class05041
 *  minecraft.class05056
 *  minecraft.class06069
 *  minecraft.class06075
 *  minecraft.class06338
 *  minecraft.class07209
 *  minecraft.class07836
 */
package minecraft;

import com.google.common.collect.Lists;
import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.ArrayList;
import java.util.List;
import minecraft.class00500;
import minecraft.class01473;
import minecraft.class01840;
import minecraft.class04548;
import minecraft.class04995;
import minecraft.class05041;
import minecraft.class05056;
import minecraft.class06069;
import minecraft.class06075;
import minecraft.class06338;
import minecraft.class07209;
import minecraft.class07836;

public class class01813
extends class01840 {
    public static final MapCodec<class01813> y = RecordCodecBuilder.mapCodec(instance -> instance.group((App)class04548.N((Codec)Codec.INT, (Comparable)Integer.valueOf(1), (Comparable)Integer.valueOf(64)).fieldOf("variety").forGetter(class018132 -> class018132.Z), (App)class05056.L.fieldOf("slow_noise").forGetter(class018132 -> class018132.z), (App)class06338.t.fieldOf("slow_scale").forGetter(class018132 -> Float.valueOf(class018132.U))).and(class01813.y(instance)).apply(instance, class01813::new));
    private final class04548<Integer> Z;
    private final class05056 z;
    private final float U;
    private final class05041 E;

    public class01813(class04548<Integer> class045482, class05056 class050562, float f, long l, class05056 class050563, float f2, List<class00500> list) {
        super(l, class050563, f2, list);
        this.Z = class045482;
        this.z = class050562;
        this.U = f;
        this.E = class05041.y((class06069)new class07836((class06069)new class06075(l)), (class05056)class050562);
    }

    protected double N(class07209 class072092) {
        return this.E.N((double)((float)class072092.method_10263() * this.U), (double)((float)class072092.method_10264() * this.U), (double)((float)class072092.method_10260() * this.U));
    }

    protected class01473<?> N() {
        return class01473.i;
    }

    public class00500 N(class06069 class060692, class07209 class072092) {
        int n = (int)class04995.N((double)this.N(class072092), (double)-1.0, (double)1.0, (double)((Integer)this.Z.N()).intValue(), (double)((Integer)this.Z.y() + 1));
        ArrayList arrayList = Lists.newArrayListWithCapacity((int)n);
        for (int i = 0; i < n; ++i) {
            arrayList.add(this.N(this.B, this.N(class072092.method_10069(i * 54545, 0, i * 34234))));
        }
        return this.N(arrayList, class072092, this.i);
    }
}

