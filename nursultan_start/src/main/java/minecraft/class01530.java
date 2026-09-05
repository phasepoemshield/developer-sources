/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  minecraft.class00753
 *  minecraft.class04119
 *  minecraft.class04137
 *  minecraft.class05378
 *  minecraft.class06069
 *  minecraft.class06293
 *  minecraft.class07079
 *  minecraft.class07209
 *  minecraft.class07438
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import minecraft.class00753;
import minecraft.class04119;
import minecraft.class04137;
import minecraft.class05378;
import minecraft.class06069;
import minecraft.class06293;
import minecraft.class07079;
import minecraft.class07209;
import minecraft.class07438;

public class class01530 {
    public static <E extends class07079> class04119<E> N(class05378<class07209> class053782, int n, float f) {
        return class04137.N_42(class041282 -> class041282.group((App)class041282.y(class053782), (App)class041282.L(class05378.s), (App)class041282.L(class05378.m), (App)class041282.N(class05378.P)).apply((Applicative)class041282, (class041392, class041393, class041394, class041395) -> (class047822, class070792, l) -> {
            class07209 class072092 = (class07209)class041282.y(class041392);
            if (!class072092.method_19771((class00753)class070792.method_24515(), (double)n)) {
                class06293.N((class07438)class070792, (class07209)class01530.N(class070792, class072092), (float)f, (int)n);
            }
            return true;
        }));
    }

    private static int N(class06069 class060692) {
        return class060692.y(3) - 1;
    }

    private static class07209 N(class07079 class070792, class07209 class072092) {
        class06069 class060692 = class070792.method_73183().field_9229;
        return class072092.method_10069(class01530.N(class060692), 0, class01530.N(class060692));
    }
}

