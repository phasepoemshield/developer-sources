/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  minecraft.class04051
 *  minecraft.class04137
 *  minecraft.class04142
 *  minecraft.class05352
 *  minecraft.class05378
 *  minecraft.class07049
 *  minecraft.class07078
 *  minecraft.class07438
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import java.util.function.Predicate;
import minecraft.class04051;
import minecraft.class04137;
import minecraft.class04142;
import minecraft.class05352;
import minecraft.class05378;
import minecraft.class05751;
import minecraft.class05779;
import minecraft.class07049;
import minecraft.class07078;
import minecraft.class07438;

public class class05750 {
    public static <E extends class07438, T extends class07438> class04142<E> N(class07078<? extends T> class070782, int n, Predicate<E> predicate, Predicate<T> predicate2, class05378<T> class053782, float f, int n2) {
        int n3 = n * n;
        Predicate<class07438> predicate3 = class074382 -> class070782.equals(class074382.method_5864()) && predicate2.test(class074382);
        return class04137.N_42(class041282 -> class041282.group((App)class041282.N(class053782), (App)class041282.N(class05378.P), (App)class041282.L(class05378.m), (App)class041282.y(class05378.B)).apply((Applicative)class041282, (class041392, class041393, class041394, class041395) -> (class047822, class074384, l) -> {
            class04051 class040512 = (class04051)class041282.y(class041395);
            if (predicate.test(class074384) && class040512.u(predicate3)) {
                class040512.N((T class074383) -> class074383.method_5858((class07049)class074384) <= (double)n3 && predicate3.test((class07438)class074383)).ifPresent(class074382 -> {
                    class041392.N(class074382);
                    class041393.N((Object)new class05751((class07049)class074382, true));
                    class041394.N((Object)new class05352((class05779)new class05751((class07049)class074382, false), f, n2));
                });
                return true;
            }
            return false;
        }));
    }

    public static <T extends class07438> class04142<class07438> N(class07078<? extends T> class070782, int n, class05378<T> class053782, float f, int n2) {
        return class05750.N(class070782, n, (E class074382) -> true, class074382 -> true, class053782, f, n2);
    }
}

