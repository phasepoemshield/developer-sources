/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  minecraft.class04051
 *  minecraft.class04119
 *  minecraft.class04137
 *  minecraft.class04142
 *  minecraft.class05378
 *  minecraft.class07049
 *  minecraft.class07078
 *  minecraft.class07428
 *  minecraft.class07438
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import java.util.Optional;
import java.util.function.Predicate;
import minecraft.class04051;
import minecraft.class04119;
import minecraft.class04137;
import minecraft.class04142;
import minecraft.class05378;
import minecraft.class05751;
import minecraft.class07049;
import minecraft.class07078;
import minecraft.class07428;
import minecraft.class07438;

public class class05745 {
    public static class04142<class07438> N(class07428 class074282, float f) {
        return class05745.N((class07438 class074382) -> class074282.equals((Object)class074382.method_5864().i()), f);
    }

    public static class04119<class07438> N(class07078<?> class070782, float f) {
        return class05745.N((class07438 class074382) -> class070782.equals(class074382.method_5864()), f);
    }

    public static class04119<class07438> N(float f) {
        return class05745.N((class07438 class074382) -> true, f);
    }

    public static class04119<class07438> N(Predicate<class07438> predicate, float f) {
        float f2 = f * f;
        return class04137.N_42(class041282 -> class041282.group((App)class041282.L(class05378.P), (App)class041282.y(class05378.B)).apply((Applicative)class041282, (class041392, class041393) -> (class047822, class074382, l) -> {
            Optional var9 = ((class04051)class041282.y(class041393)).N(predicate.and(class074383 -> class074383.method_5858((class07049)class074382) <= (double)f2 && !class074382.method_5626((class07049)class074383)));
            if (var9.isEmpty()) {
                return false;
            }
            class041392.N((Object)new class05751((class07049)var9.get(), true));
            return true;
        }));
    }
}

