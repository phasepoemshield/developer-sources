/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  minecraft.class00500
 *  minecraft.class01467
 *  minecraft.class01476
 *  minecraft.class04887
 *  minecraft.class05291
 *  minecraft.class06069
 *  minecraft.class07209
 */
package minecraft;

import com.google.common.collect.ImmutableList;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.BiConsumer;
import minecraft.class00500;
import minecraft.class01467;
import minecraft.class01476;
import minecraft.class04887;
import minecraft.class05291;
import minecraft.class05312;
import minecraft.class06069;
import minecraft.class07209;

public class class05314
extends class05291 {
    public static final MapCodec<class05314> N = RecordCodecBuilder.mapCodec(instance -> class05314.N(instance).apply(instance, class05314::new));

    public class05314(int n, int n2, int n3) {
        super(n, n2, n3);
    }

    protected class05312<?> N() {
        return class05312.N;
    }

    public List<class01467> N(class04887 class048872, BiConsumer<class07209, class00500> biConsumer, class06069 class060692, int n, class07209 class072092, class01476 class014762) {
        class05314.N((class04887)class048872, biConsumer, (class06069)class060692, (class07209)class072092.method_10074(), (class01476)class014762);
        for (int i = 0; i < n; ++i) {
            this.y(class048872, biConsumer, class060692, class072092.method_10086(i), class014762);
        }
        return ImmutableList.of((Object)new class01467(class072092.method_10086(n), 0, false));
    }
}

