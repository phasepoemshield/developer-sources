/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  minecraft.class04137
 *  minecraft.class04142
 *  minecraft.class05378
 *  minecraft.class07438
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import java.util.function.Predicate;
import minecraft.class04137;
import minecraft.class04142;
import minecraft.class05378;
import minecraft.class07438;

public class class01518 {
    public static <E extends class07438> class04142<E> N(Predicate<E> predicate, class05378<?> class053782) {
        return class04137.N_42(class041282 -> class041282.group((App)class041282.y(class053782)).apply((Applicative)class041282, class041392 -> (class047822, class074382, l) -> {
            if (predicate.test(class074382)) {
                class041392.y();
                return true;
            }
            return false;
        }));
    }
}

