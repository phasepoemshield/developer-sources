/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  minecraft.class00500
 *  minecraft.class01467
 *  minecraft.class01476
 *  minecraft.class03194
 *  minecraft.class04887
 *  minecraft.class05291
 *  minecraft.class05312
 *  minecraft.class06069
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07221
 */
package minecraft;

import com.google.common.collect.Lists;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;
import minecraft.class00500;
import minecraft.class01467;
import minecraft.class01476;
import minecraft.class03194;
import minecraft.class04887;
import minecraft.class05291;
import minecraft.class05312;
import minecraft.class06069;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07221;

public class class05064
extends class05291 {
    public static final MapCodec<class05064> N = RecordCodecBuilder.mapCodec(instance -> class05064.N(instance).apply(instance, class05064::new));

    public class05064(int n, int n2, int n3) {
        super(n, n2, n3);
    }

    protected class05312<?> N() {
        return class05312.i;
    }

    public List<class01467> N(class04887 class048872, BiConsumer<class07209, class00500> biConsumer, class06069 class060692, int n, class07209 class072092, class01476 class014762) {
        int n2;
        int n3;
        ArrayList arrayList = Lists.newArrayList();
        class07209 class072093 = class072092.method_10074();
        class05064.N((class04887)class048872, biConsumer, (class06069)class060692, (class07209)class072093, (class01476)class014762);
        class05064.N((class04887)class048872, biConsumer, (class06069)class060692, (class07209)class072093.method_10078(), (class01476)class014762);
        class05064.N((class04887)class048872, biConsumer, (class06069)class060692, (class07209)class072093.method_10072(), (class01476)class014762);
        class05064.N((class04887)class048872, biConsumer, (class06069)class060692, (class07209)class072093.method_10072().method_10078(), (class01476)class014762);
        class07211 class072112 = class07221.field_11062.N(class060692);
        int n4 = n - class060692.y(4);
        int n5 = 2 - class060692.y(3);
        int n6 = class072092.method_10263();
        int n7 = class072092.method_10264();
        int n8 = class072092.method_10260();
        int n9 = n6;
        int n10 = n8;
        int n11 = n7 + n - 1;
        for (n3 = 0; n3 < n; ++n3) {
            class07209 class072094;
            if (n3 >= n4 && n5 > 0) {
                n9 += class072112.P();
                n10 += class072112.T();
                --n5;
            }
            if (!class03194.y((class04887)class048872, (class07209)(class072094 = new class07209(n9, n2 = n7 + n3, n10)))) continue;
            this.y(class048872, biConsumer, class060692, class072094, class014762);
            this.y(class048872, biConsumer, class060692, class072094.method_10078(), class014762);
            this.y(class048872, biConsumer, class060692, class072094.method_10072(), class014762);
            this.y(class048872, biConsumer, class060692, class072094.method_10078().method_10072(), class014762);
        }
        arrayList.add(new class01467(new class07209(n9, n11, n10), 0, true));
        for (n3 = -1; n3 <= 2; ++n3) {
            for (n2 = -1; n2 <= 2; ++n2) {
                if (n3 >= 0 && n3 <= 1 && n2 >= 0 && n2 <= 1 || class060692.y(3) > 0) continue;
                int n12 = class060692.y(3) + 2;
                for (int i = 0; i < n12; ++i) {
                    this.y(class048872, biConsumer, class060692, new class07209(n6 + n3, n11 - i - 1, n8 + n2), class014762);
                }
                arrayList.add(new class01467(new class07209(n6 + n3, n11, n8 + n2), 0, false));
            }
        }
        return arrayList;
    }
}

