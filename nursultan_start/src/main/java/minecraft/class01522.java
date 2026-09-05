/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  minecraft.class00717
 *  minecraft.class04137
 *  minecraft.class04142
 *  minecraft.class05352
 *  minecraft.class05378
 *  minecraft.class05751
 *  minecraft.class05779
 *  minecraft.class07049
 *  minecraft.class07438
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import java.util.function.Predicate;
import minecraft.class00717;
import minecraft.class04137;
import minecraft.class04142;
import minecraft.class05352;
import minecraft.class05378;
import minecraft.class05751;
import minecraft.class05779;
import minecraft.class07049;
import minecraft.class07438;

public class class01522 {
    public static <E extends class07438> class04142<E> N(Predicate<E> predicate, float f, boolean bl, int n) {
        return class04137.N_42(class041282 -> {
            class04137 class041372 = bl ? class041282.N(class05378.m) : class041282.L(class05378.m);
            return class041282.group((App)class041282.N(class05378.P), (App)class041372, (App)class041282.y(class05378.H), (App)class041282.N(class05378.yN)).apply((Applicative)class041282, (class041392, class041393, class041394, class041395) -> (class047822, class074382, l) -> {
                class00717 class007172 = (class00717)class041282.y(class041394);
                if (class041282.N(class041395).isEmpty() && predicate.test(class074382) && class007172.method_24516((class07049)class074382, (double)n) && class074382.method_73183().method_8621().N(class007172.method_24515()) && class074382.method_5936()) {
                    class05352 class053522 = new class05352((class05779)new class05751((class07049)class007172, false), f, 0);
                    class041392.N((Object)new class05751((class07049)class007172, true));
                    class041393.N((Object)class053522);
                    return true;
                }
                return false;
            });
        });
    }

    public static class04142<class07438> N(float f, boolean bl, int n) {
        return class01522.N(class074382 -> true, f, bl, n);
    }
}

