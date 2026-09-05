/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  minecraft.class02135
 *  minecraft.class04137
 *  minecraft.class04142
 *  minecraft.class05378
 *  minecraft.class07438
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import java.util.function.Predicate;
import minecraft.class02135;
import minecraft.class04137;
import minecraft.class04142;
import minecraft.class05378;
import minecraft.class07438;

public class class01504 {
    public static <E extends class07438, T> class04142<E> N(Predicate<E> predicate, class05378<? extends T> class053782, class05378<T> class053783, class02135 class021352) {
        return class04137.N_42(class041282 -> class041282.group((App)class041282.y(class053782), (App)class041282.L(class053783)).apply((Applicative)class041282, (class041392, class041393) -> (class047822, class074382, l) -> {
            if (!predicate.test(class074382)) {
                return false;
            }
            class041393.N(class041282.y(class041392), (long)class021352.N(class047822.field_9229));
            return true;
        }));
    }
}

