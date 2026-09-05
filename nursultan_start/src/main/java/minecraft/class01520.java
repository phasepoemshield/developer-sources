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
 *  minecraft.class05444
 *  minecraft.class05456
 *  minecraft.class05459
 *  minecraft.class06293
 *  minecraft.class06889
 *  minecraft.class07049
 *  minecraft.class07209
 *  minecraft.class07475
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;
import minecraft.class00737;
import minecraft.class04119;
import minecraft.class04137;
import minecraft.class04142;
import minecraft.class05352;
import minecraft.class05378;
import minecraft.class05444;
import minecraft.class05456;
import minecraft.class05459;
import minecraft.class06293;
import minecraft.class06889;
import minecraft.class07049;
import minecraft.class07209;
import minecraft.class07475;
import org.jspecify.annotations.Nullable;

public class class01520 {
    private static final int N = 10;
    private static final int y = 7;
    private static final int[][] L = new int[][]{{1, 1}, {3, 3}, {5, 5}, {6, 5}, {7, 7}, {10, 7}};

    public static class04142<class07475> L(float f) {
        return class01520.N(f, class01520::N, class07049::method_5799);
    }

    public static class04142<class07475> y(float f) {
        return class01520.N(f, class074752 -> class01520.N(class074752, 10, 7), (class07475 class074752) -> true);
    }

    public static class04119<class07475> N(float f, boolean bl) {
        return class01520.N(f, class074752 -> class05456.N((class07475)class074752, (int)10, (int)7), bl ? class074752 -> true : class074752 -> !class074752.method_5799());
    }

    private static class04119<class07475> N(float f, Function<class07475, class06889> function, Predicate<class07475> predicate) {
        return class04137.N_42(class041282 -> class041282.group((App)class041282.L(class05378.m)).apply((Applicative)class041282, class041392 -> (class047822, class074752, l) -> {
            if (!predicate.test((class07475)class074752)) {
                return false;
            }
            Optional<class06889> optional = Optional.ofNullable((class06889)function.apply((class07475)class074752));
            class041392.N(optional.map(class068892 -> new class05352(class068892, f, 0)));
            return true;
        }));
    }

    public static class04119<class07475> N(float f) {
        return class01520.N(f, true);
    }

    private static @Nullable class06889 N(class07475 class074752, int n, int n2) {
        class06889 class068892 = class074752.method_5828(0.0f);
        return class05444.N((class07475)class074752, (int)n, (int)n2, (int)-2, (double)class068892.M, (double)class068892.Z, (double)1.5707963705062866);
    }

    public static class04142<class07475> N(float f, int n, int n2) {
        return class01520.N(f, class074752 -> class05456.N((class07475)class074752, (int)n, (int)n2), (class07475 class074752) -> true);
    }

    private static @Nullable class06889 N(class07475 class074752) {
        class06889 class068892 = null;
        class06889 class068893 = null;
        for (int[] nArray : L) {
            class068893 = class068892 == null ? class06293.N((class07475)class074752, (int)nArray[0], (int)nArray[1]) : class074752.method_73189().i(class074752.method_73189().N(class068892).u().u((double)nArray[0], (double)nArray[1], (double)nArray[0]));
            boolean bl = class05459.N((class07475)class074752, (double)nArray[0]);
            if (class068893 == null || class074752.method_73183().method_8316(class07209.method_49638((class00737)class068893)).W() || class05459.N((boolean)bl, (class07475)class074752, (class06889)class068893)) {
                return class068892;
            }
            class068892 = class068893;
        }
        return class068893;
    }
}

