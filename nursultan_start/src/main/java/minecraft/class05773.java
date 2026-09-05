/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  minecraft.class00737
 *  minecraft.class04119
 *  minecraft.class04137
 *  minecraft.class04142
 *  minecraft.class05352
 *  minecraft.class05378
 *  minecraft.class05456
 *  minecraft.class06889
 *  minecraft.class07049
 *  minecraft.class07209
 *  minecraft.class07475
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import java.util.Optional;
import java.util.function.Function;
import minecraft.class00737;
import minecraft.class04119;
import minecraft.class04137;
import minecraft.class04142;
import minecraft.class05352;
import minecraft.class05378;
import minecraft.class05456;
import minecraft.class06889;
import minecraft.class07049;
import minecraft.class07209;
import minecraft.class07475;

public class class05773 {
    public static class04119<class07475> y(class05378<? extends class07049> class053782, float f, int n, boolean bl) {
        return class05773.N(class053782, f, n, bl, class07049::method_73189);
    }

    private static <T> class04119<class07475> N(class05378<T> class053782, float f, int n, boolean bl, Function<T, class06889> function) {
        return class04137.N_42(class041282 -> class041282.group((App)class041282.N(class05378.m), (App)class041282.y(class053782)).apply((Applicative)class041282, (class041392, class041393) -> (class047822, class074752, l) -> {
            class06889 class068892;
            class06889 class068893;
            class06889 class068894;
            Optional optional = class041282.N(class041392);
            if (optional.isPresent() && !bl) {
                return false;
            }
            class06889 class068895 = class074752.method_73189();
            if (!class068895.N((class00737)(class068894 = (class06889)function.apply(class041282.y(class041393))), (double)n)) {
                return false;
            }
            if (optional.isPresent() && ((class05352)optional.get()).y() == f && (class068893 = ((class05352)optional.get()).N().N().u(class068895)).y(class068892 = class068894.u(class068895)) < 0.0) {
                return false;
            }
            for (int i = 0; i < 10; ++i) {
                class068892 = class05456.y((class07475)class074752, (int)16, (int)7, (class06889)class068894);
                if (class068892 == null) continue;
                class041392.N((Object)new class05352(class068892, f, 0));
                break;
            }
            return true;
        }));
    }

    public static class04142<class07475> N(class05378<class07209> class053782, float f, int n, boolean bl) {
        return class05773.N(class053782, f, n, bl, class06889::L);
    }
}

