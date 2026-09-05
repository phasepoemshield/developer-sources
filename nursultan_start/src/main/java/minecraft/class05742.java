/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  minecraft.class00753
 *  minecraft.class04119
 *  minecraft.class04137
 *  minecraft.class05352
 *  minecraft.class05378
 *  minecraft.class05475
 *  minecraft.class06289
 *  minecraft.class06889
 *  minecraft.class07209
 *  minecraft.class07475
 *  minecraft.class08041
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import java.util.Optional;
import minecraft.class00753;
import minecraft.class04119;
import minecraft.class04137;
import minecraft.class05352;
import minecraft.class05378;
import minecraft.class05475;
import minecraft.class06289;
import minecraft.class06889;
import minecraft.class07209;
import minecraft.class07475;
import minecraft.class08041;

public class class05742 {
    public static class04119<class08041> N(class05378<class06289> class053782, float f, int n, int n2, int n3) {
        return class04137.N_42(class041282 -> class041282.group((App)class041282.N(class05378.I), (App)class041282.L(class05378.m), (App)class041282.y(class053782)).apply((Applicative)class041282, (class041392, class041393, class041394) -> (class047822, class080412, l) -> {
            class06289 class062892 = (class06289)class041282.y(class041394);
            Optional optional = class041282.N(class041392);
            if (class062892.N() != class047822.method_27983() || optional.isPresent() && class047822.N() - (Long)optional.get() > (long)n3) {
                class080412.N(class053782);
                class041394.y();
                class041392.N((Object)l);
            } else if (class062892.y().method_19455((class00753)class080412.method_24515()) > n2) {
                class06889 class068892 = null;
                int n4 = 0;
                int n5 = 1000;
                while (class068892 == null || class07209.method_49638(class068892).method_19455((class00753)class080412.method_24515()) > n2) {
                    class068892 = class05475.N((class07475)class080412, (int)15, (int)7, (class06889)class06889.L((class00753)class062892.y()), (double)1.5707963705062866);
                    if (++n4 != 1000) continue;
                    class080412.N(class053782);
                    class041394.y();
                    class041392.N((Object)l);
                    return true;
                }
                class041393.N((Object)new class05352(class068892, f, n));
            } else if (class062892.y().method_19455((class00753)class080412.method_24515()) > n) {
                class041393.N((Object)new class05352(class062892.y(), f, n));
            }
            return true;
        }));
    }
}

