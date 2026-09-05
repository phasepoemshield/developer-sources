/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  minecraft.class04137
 *  minecraft.class04142
 *  minecraft.class05378
 *  minecraft.class07078
 *  minecraft.class07305
 *  minecraft.class07438
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import java.util.function.BiPredicate;
import minecraft.class04137;
import minecraft.class04142;
import minecraft.class05378;
import minecraft.class07078;
import minecraft.class07305;
import minecraft.class07438;

public class class01515 {
    public static class04142<class07438> N(int n, BiPredicate<class07438, class07438> biPredicate) {
        return class04137.N_42(class041282 -> class041282.group((App)class041282.y(class05378.s), (App)class041282.N(class05378.NW), (App)class041282.L(class05378.Nv), (App)class041282.N(class05378.Nn)).apply((Applicative)class041282, (class041392, class041393, class041394, class041395) -> (class047822, class074382, l) -> {
            class07438 class074383 = (class07438)class041282.y(class041392);
            if (!class074383.method_29504()) {
                return false;
            }
            if (biPredicate.test(class074382, class074383)) {
                class041395.N((Object)true, (long)n);
            }
            class041394.N((Object)class074383.method_24515(), (long)n);
            if (class074383.method_5864() != class07078.Ly || ((Boolean)class047822.method_64395().N(class07305.P)).booleanValue()) {
                class041392.y();
                class041393.y();
            }
            return true;
        }));
    }
}

