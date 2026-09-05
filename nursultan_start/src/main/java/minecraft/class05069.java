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
 *  minecraft.class04995
 *  minecraft.class05039
 *  minecraft.class05312
 *  minecraft.class06069
 *  minecraft.class07209
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
import minecraft.class04887;
import minecraft.class04995;
import minecraft.class05039;
import minecraft.class05312;
import minecraft.class06069;
import minecraft.class07209;

public class class05069
extends class05039 {
    public static final MapCodec<class05069> M = RecordCodecBuilder.mapCodec(instance -> class05069.N(instance).apply(instance, class05069::new));

    public class05069(int n, int n2, int n3) {
        super(n, n2, n3);
    }

    protected class05312<?> N() {
        return class05312.u;
    }

    public List<class01467> N(class04887 class048872, BiConsumer<class07209, class00500> biConsumer, class06069 class060692, int n, class07209 class072092, class01476 class014762) {
        ArrayList arrayList = Lists.newArrayList();
        arrayList.addAll(super.N(class048872, biConsumer, class060692, n, class072092, class014762));
        for (int i = n - 2 - class060692.y(4); i > n / 2; i -= 2 + class060692.y(4)) {
            float f = class060692.z() * ((float)Math.PI * 2);
            int n2 = 0;
            int n3 = 0;
            for (int j = 0; j < 5; ++j) {
                n2 = (int)(1.5f + class04995.P((double)f) * (float)j);
                n3 = (int)(1.5f + class04995.m((double)f) * (float)j);
                class07209 class072093 = class072092.method_10069(n2, i - 3 + j / 2, n3);
                this.y(class048872, biConsumer, class060692, class072093, class014762);
            }
            arrayList.add(new class01467(class072092.method_10069(n2, i, n3), -2, false));
        }
        return arrayList;
    }
}

