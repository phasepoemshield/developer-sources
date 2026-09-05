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
 *  minecraft.class04887
 *  minecraft.class05291
 *  minecraft.class06069
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07218
 *  minecraft.class07221
 */
package minecraft;

import com.google.common.collect.Lists;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.ArrayList;
import java.util.List;
import java.util.OptionalInt;
import java.util.function.BiConsumer;
import minecraft.class00500;
import minecraft.class01467;
import minecraft.class01476;
import minecraft.class04887;
import minecraft.class05291;
import minecraft.class05312;
import minecraft.class06069;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07218;
import minecraft.class07221;

public class class05326
extends class05291 {
    public static final MapCodec<class05326> N = RecordCodecBuilder.mapCodec(instance -> class05326.N(instance).apply(instance, class05326::new));

    public class05326(int n, int n2, int n3) {
        super(n, n2, n3);
    }

    protected class05312<?> N() {
        return class05312.y;
    }

    public List<class01467> N(class04887 class048872, BiConsumer<class07209, class00500> biConsumer, class06069 class060692, int n, class07209 class072092, class01476 class014762) {
        int n2;
        class05326.N((class04887)class048872, biConsumer, (class06069)class060692, (class07209)class072092.method_10074(), (class01476)class014762);
        ArrayList arrayList = Lists.newArrayList();
        class07211 class072112 = class07221.field_11062.N(class060692);
        int n3 = n - class060692.y(4) - 1;
        int n4 = 3 - class060692.y(3);
        class07218 class072182 = new class07218();
        int n5 = class072092.method_10263();
        int n6 = class072092.method_10260();
        OptionalInt optionalInt = OptionalInt.empty();
        for (int i = 0; i < n; ++i) {
            n2 = class072092.method_10264() + i;
            if (i >= n3 && n4 > 0) {
                n5 += class072112.P();
                n6 += class072112.T();
                --n4;
            }
            if (!this.y(class048872, biConsumer, class060692, (class07209)class072182.N(n5, n2, n6), class014762)) continue;
            optionalInt = OptionalInt.of(n2 + 1);
        }
        if (optionalInt.isPresent()) {
            arrayList.add(new class01467(new class07209(n5, optionalInt.getAsInt(), n6), 1, false));
        }
        n5 = class072092.method_10263();
        n6 = class072092.method_10260();
        class07211 class072113 = class07221.field_11062.N(class060692);
        if (class072113 != class072112) {
            n2 = n3 - class060692.y(2) - 1;
            int n7 = 1 + class060692.y(3);
            optionalInt = OptionalInt.empty();
            for (int i = n2; i < n && n7 > 0; ++i, --n7) {
                if (i < 1) continue;
                int n8 = class072092.method_10264() + i;
                if (!this.y(class048872, biConsumer, class060692, (class07209)class072182.N(n5 += class072113.P(), n8, n6 += class072113.T()), class014762)) continue;
                optionalInt = OptionalInt.of(n8 + 1);
            }
            if (optionalInt.isPresent()) {
                arrayList.add(new class01467(new class07209(n5, optionalInt.getAsInt(), n6), 0, false));
            }
        }
        return arrayList;
    }
}

