/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10487
 *  com.google.common.collect.Lists
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  minecraft.class00500
 *  minecraft.class01467
 *  minecraft.class01476
 *  minecraft.class04887
 *  minecraft.class04995
 *  minecraft.class05291
 *  minecraft.class05312
 *  minecraft.class06069
 *  minecraft.class07004
 *  minecraft.class07185
 *  minecraft.class07209
 *  minecraft.class08092
 */
package minecraft;

import Nursultan.class10487;
import com.google.common.collect.Lists;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.BiConsumer;
import minecraft.class00500;
import minecraft.class01467;
import minecraft.class01476;
import minecraft.class04887;
import minecraft.class04995;
import minecraft.class05291;
import minecraft.class05312;
import minecraft.class06069;
import minecraft.class07004;
import minecraft.class07185;
import minecraft.class07209;
import minecraft.class08092;

public class class05079
extends class05291 {
    public static final MapCodec<class05079> N = RecordCodecBuilder.mapCodec(instance -> class05079.N(instance).apply(instance, class05079::new));
    private static final double M = 0.618;
    private static final double B = 1.382;
    private static final double Z = 0.381;
    private static final double z = 0.328;

    public class05079(int n, int n2, int n3) {
        super(n, n2, n3);
    }

    private static float y(int n, int n2) {
        if ((float)n2 < (float)n * 0.3f) {
            return -1.0f;
        }
        float f = (float)n / 2.0f;
        float f2 = f - (float)n2;
        float f3 = class04995.N((float)(f * f - f2 * f2));
        if (f2 == 0.0f) {
            f3 = f;
        } else if (Math.abs(f2) >= f) {
            return 0.0f;
        }
        return f3 * 0.5f;
    }

    private void N(class04887 class048872, BiConsumer<class07209, class00500> biConsumer, class06069 class060692, int n, class07209 class072092, List<class10487> list, class01476 class014762) {
        for (class10487 class104872 : list) {
            int n2 = class104872.N();
            class07209 class072093 = new class07209(class072092.method_10263(), n2, class072092.method_10260());
            if (class072093.equals((Object)class104872.N.N()) || !this.N(n, n2 - class072092.method_10264())) continue;
            this.N(class048872, biConsumer, class060692, class072093, class104872.N.N(), true, class014762);
        }
    }

    private boolean N(int n, int n2) {
        return (double)n2 >= (double)n * 0.2;
    }

    public List<class01467> N(class04887 class048872, BiConsumer<class07209, class00500> biConsumer, class06069 class060692, int n, class07209 class072092, class01476 class014762) {
        int n2;
        int n3 = 5;
        int n4 = n + 2;
        int n5 = class04995.N((double)((double)n4 * 0.618));
        class05079.N((class04887)class048872, biConsumer, (class06069)class060692, (class07209)class072092.method_10074(), (class01476)class014762);
        double d = 1.0;
        int n6 = Math.min(1, class04995.N((double)(1.382 + Math.pow(1.0 * (double)n4 / 13.0, 2.0))));
        int n7 = class072092.method_10264() + n5;
        ArrayList arrayList = Lists.newArrayList();
        arrayList.add(new class10487(class072092.method_10086(n2), n7));
        for (n2 = n4 - 5; n2 >= 0; --n2) {
            float f = class05079.y(n4, n2);
            if (f < 0.0f) continue;
            for (int i = 0; i < n6; ++i) {
                class07209 class072093;
                double d2 = 1.0;
                double d3 = 1.0 * (double)f * ((double)class060692.z() + 0.328);
                double d4 = (double)(class060692.z() * 2.0f) * Math.PI;
                double d5 = d3 * Math.sin(d4) + 0.5;
                double d6 = d3 * Math.cos(d4) + 0.5;
                class07209 class072094 = class072092.method_10069(class04995.N((double)d5), n2 - 1, class04995.N((double)d6));
                if (!this.N(class048872, biConsumer, class060692, class072094, class072093 = class072094.method_10086(5), false, class014762)) continue;
                int n8 = class072092.method_10263() - class072094.method_10263();
                int n9 = class072092.method_10260() - class072094.method_10260();
                double d7 = (double)class072094.method_10264() - Math.sqrt(n8 * n8 + n9 * n9) * 0.381;
                int n10 = d7 > (double)n7 ? n7 : (int)d7;
                class07209 class072095 = new class07209(class072092.method_10263(), n10, class072092.method_10260());
                if (!this.N(class048872, biConsumer, class060692, class072095, class072094, false, class014762)) continue;
                arrayList.add(new class10487(class072094, class072095.method_10264()));
            }
        }
        this.N(class048872, biConsumer, class060692, class072092, class072092.method_10086(n5), true, class014762);
        this.N(class048872, biConsumer, class060692, n4, class072092, arrayList, class014762);
        ArrayList arrayList2 = Lists.newArrayList();
        for (class10487 class104872 : arrayList) {
            if (!this.N(n4, class104872.N() - class072092.method_10264())) continue;
            arrayList2.add(class104872.N);
        }
        return arrayList2;
    }

    private boolean N(class04887 class048872, BiConsumer<class07209, class00500> biConsumer, class06069 class060692, class07209 class072092, class07209 class072093, boolean bl, class01476 class014762) {
        if (!bl && Objects.equals(class072092, class072093)) {
            return true;
        }
        class07209 class072094 = class072093.method_10069(-class072092.method_10263(), -class072092.method_10264(), -class072092.method_10260());
        int n = this.N(class072094);
        float f = (float)class072094.method_10263() / (float)n;
        float f2 = (float)class072094.method_10264() / (float)n;
        float f3 = (float)class072094.method_10260() / (float)n;
        for (int i = 0; i <= n; ++i) {
            class07209 class072095 = class072092.method_10069(class04995.y((float)(0.5f + (float)i * f)), class04995.y((float)(0.5f + (float)i * f2)), class04995.y((float)(0.5f + (float)i * f3)));
            if (bl) {
                this.N(class048872, biConsumer, class060692, class072095, class014762, class005002 -> (class00500)class005002.L((class08092)class07004.L, (Comparable)this.N(class072092, class072095)));
                continue;
            }
            if (this.y(class048872, class072095)) continue;
            return false;
        }
        return true;
    }

    private int N(class07209 class072092) {
        int n = class04995.N((int)class072092.method_10263());
        int n2 = class04995.N((int)class072092.method_10264());
        int n3 = class04995.N((int)class072092.method_10260());
        return Math.max(n, Math.max(n2, n3));
    }

    private class07185 N(class07209 class072092, class07209 class072093) {
        int n;
        class07185 class071852 = class07185.field_11052;
        int n2 = Math.abs(class072093.method_10263() - class072092.method_10263());
        int n3 = Math.max(n2, n = Math.abs(class072093.method_10260() - class072092.method_10260()));
        if (n3 > 0) {
            class071852 = n2 == n3 ? class07185.field_11048 : class07185.field_11051;
        }
        return class071852;
    }

    protected class05312<?> N() {
        return class05312.R;
    }
}

