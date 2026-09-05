/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  minecraft.class04119
 *  minecraft.class04137
 *  minecraft.class05352
 *  minecraft.class05378
 *  minecraft.class07438
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import java.util.function.Function;
import java.util.function.Predicate;
import minecraft.class04119;
import minecraft.class04137;
import minecraft.class05352;
import minecraft.class05378;
import minecraft.class05779;
import minecraft.class07438;

public class class05771 {
    public static class04119<class07438> N(Predicate<class07438> predicate, Function<class07438, Float> function, int n) {
        return class04137.N_42(class041282 -> class041282.group((App)class041282.L(class05378.m), (App)class041282.y(class05378.P)).apply((Applicative)class041282, (class041392, class041393) -> (class047822, class074382, l) -> {
            if (!predicate.test(class074382)) {
                return false;
            }
            class041392.N((Object)new class05352((class05779)class041282.y(class041393), ((Float)function.apply(class074382)).floatValue(), n));
            return true;
        }));
    }

    public static class04119<class07438> N(float f, int n) {
        return class05771.N(class074382 -> true, class074382 -> Float.valueOf(f), n);
    }
}

