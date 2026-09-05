/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  minecraft.class04137
 *  minecraft.class04142
 *  minecraft.class05378
 *  minecraft.class07049
 *  minecraft.class07438
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import java.util.function.BiPredicate;
import minecraft.class04137;
import minecraft.class04142;
import minecraft.class05378;
import minecraft.class07049;
import minecraft.class07438;

public class class01510 {
    private static boolean N(class07438 class074382, class07049 class070492, int n) {
        return class070492.method_5805() && class070492.method_24516((class07049)class074382, (double)n) && class070492.method_73183() == class074382.method_73183();
    }

    public static <E extends class07438> class04142<E> N(int n, BiPredicate<E, class07049> biPredicate) {
        return class04137.N_42(class041282 -> class041282.group((App)class041282.N(class05378.v)).apply((Applicative)class041282, class041392 -> (class047822, class074382, l) -> {
            class07049 class070492;
            class07049 class070493 = class074382.method_5854();
            class07049 class070494 = class041282.N(class041392).orElse(null);
            if (class070493 == null && class070494 == null) {
                return false;
            }
            class07049 class070495 = class070492 = class070493 == null ? class070494 : class070493;
            if (!class01510.N(class074382, class070492, n) || biPredicate.test(class074382, class070492)) {
                class074382.method_5848();
                class041392.y();
                return true;
            }
            return false;
        }));
    }
}

