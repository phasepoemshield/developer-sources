/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  minecraft.class00500
 *  minecraft.class00753
 *  minecraft.class01467
 *  minecraft.class01476
 *  minecraft.class04887
 *  minecraft.class05291
 *  minecraft.class05312
 *  minecraft.class06069
 *  minecraft.class07209
 *  minecraft.class07218
 */
package minecraft;

import com.google.common.collect.ImmutableList;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.BiConsumer;
import minecraft.class00500;
import minecraft.class00753;
import minecraft.class01467;
import minecraft.class01476;
import minecraft.class04887;
import minecraft.class05291;
import minecraft.class05312;
import minecraft.class06069;
import minecraft.class07209;
import minecraft.class07218;

public class class05039
extends class05291 {
    public static final MapCodec<class05039> N = RecordCodecBuilder.mapCodec(instance -> class05039.N(instance).apply(instance, class05039::new));

    public class05039(int n, int n2, int n3) {
        super(n, n2, n3);
    }

    private void N(class04887 class048872, BiConsumer<class07209, class00500> biConsumer, class06069 class060692, class07218 class072182, class01476 class014762, class07209 class072092, int n, int n2, int n3) {
        class072182.N((class00753)class072092, n, n2, n3);
        this.N(class048872, biConsumer, class060692, class072182, class014762);
    }

    public List<class01467> N(class04887 class048872, BiConsumer<class07209, class00500> biConsumer, class06069 class060692, int n, class07209 class072092, class01476 class014762) {
        class07209 class072093 = class072092.method_10074();
        class05039.N((class04887)class048872, biConsumer, (class06069)class060692, (class07209)class072093, (class01476)class014762);
        class05039.N((class04887)class048872, biConsumer, (class06069)class060692, (class07209)class072093.method_10078(), (class01476)class014762);
        class05039.N((class04887)class048872, biConsumer, (class06069)class060692, (class07209)class072093.method_10072(), (class01476)class014762);
        class05039.N((class04887)class048872, biConsumer, (class06069)class060692, (class07209)class072093.method_10072().method_10078(), (class01476)class014762);
        class07218 class072182 = new class07218();
        for (int i = 0; i < n; ++i) {
            this.N(class048872, biConsumer, class060692, class072182, class014762, class072092, 0, i, 0);
            if (i >= n - 1) continue;
            this.N(class048872, biConsumer, class060692, class072182, class014762, class072092, 1, i, 0);
            this.N(class048872, biConsumer, class060692, class072182, class014762, class072092, 1, i, 1);
            this.N(class048872, biConsumer, class060692, class072182, class014762, class072092, 0, i, 1);
        }
        return ImmutableList.of((Object)new class01467(class072092.method_10086(n), 0, true));
    }

    protected class05312<?> N() {
        return class05312.L;
    }
}

