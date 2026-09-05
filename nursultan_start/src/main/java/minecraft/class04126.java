/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.Applicative
 *  minecraft.class02135
 *  minecraft.class04051
 *  minecraft.class05378
 *  minecraft.class05751
 *  minecraft.class07049
 *  minecraft.class07078
 *  minecraft.class07438
 */
package minecraft;

import com.mojang.datafixers.kinds.Applicative;
import java.util.Optional;
import java.util.function.Predicate;
import minecraft.class02135;
import minecraft.class04051;
import minecraft.class04133;
import minecraft.class04137;
import minecraft.class04142;
import minecraft.class05378;
import minecraft.class05751;
import minecraft.class07049;
import minecraft.class07078;
import minecraft.class07438;

@Deprecated
public class class04126 {
    public static class04142<class07438> N(float f, class02135 class021352) {
        return class04126.N(f, class021352, (class07438 class074382) -> true);
    }

    public static class04142<class07438> N(class07078<?> class070782, float f, class02135 class021352) {
        return class04126.N(f, class021352, (class07438 class074382) -> class070782.equals(class074382.method_5864()));
    }

    private static class04142<class07438> N(float f, class02135 class021352, Predicate<class07438> predicate) {
        float f2 = f * f;
        class04133 class041332 = new class04133(class021352);
        return class04137.N_42(class041282 -> class041282.group(class041282.L(class05378.P), class041282.y(class05378.B)).apply((Applicative)class041282, (class041392, class041393) -> (class047822, class074382, l) -> {
            Optional var10 = ((class04051)class041282.y(class041393)).N(predicate.and(class074383 -> class074383.method_5858((class07049)class074382) <= (double)f2));
            if (var10.isEmpty()) {
                return false;
            }
            if (!class041332.N(class047822.field_9229)) {
                return false;
            }
            class041392.N(new class05751((class07049)var10.get(), true));
            return true;
        }));
    }
}

