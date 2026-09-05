/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  minecraft.class00753
 *  minecraft.class01296
 *  minecraft.class04119
 *  minecraft.class04137
 *  minecraft.class04782
 *  minecraft.class05352
 *  minecraft.class05378
 *  minecraft.class05456
 *  minecraft.class05475
 *  minecraft.class06293
 *  minecraft.class06889
 *  minecraft.class07209
 *  minecraft.class07475
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import java.util.Optional;
import minecraft.class00753;
import minecraft.class01296;
import minecraft.class04119;
import minecraft.class04137;
import minecraft.class04782;
import minecraft.class05352;
import minecraft.class05378;
import minecraft.class05456;
import minecraft.class05475;
import minecraft.class06293;
import minecraft.class06889;
import minecraft.class07209;
import minecraft.class07475;

public class class05755 {
    private static final int N = 10;
    private static final int y = 7;

    public static class04119<class07475> N(float f, int n, int n2) {
        return class04137.N_42(class041282 -> class041282.group((App)class041282.L(class05378.m)).apply((Applicative)class041282, class041392 -> (class047822, class074752, l) -> {
            class01296 class012962;
            class01296 class012963;
            class07209 class072092 = class074752.method_24515();
            class06889 class068893 = class047822.method_19500(class072092) ? class05456.N((class07475)class074752, (int)n, (int)n2) : ((class012963 = class06293.N((class04782)class047822, (class01296)(class012962 = class01296.N((class07209)class072092)), (int)2)) != class012962 ? class05475.N((class07475)class074752, (int)n, (int)n2, (class06889)class06889.L((class00753)class012963.U()), (double)1.5707963705062866) : class05456.N((class07475)class074752, (int)n, (int)n2));
            class041392.N(Optional.ofNullable(class068893).map(class068892 -> new class05352(class068892, f, 0)));
            return true;
        }));
    }

    public static class04119<class07475> N(float f) {
        return class05755.N(f, 10, 7);
    }
}

