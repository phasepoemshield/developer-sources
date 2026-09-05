/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicates
 *  minecraft.class00502
 *  minecraft.class06639
 *  minecraft.class06656
 *  minecraft.class06695
 *  minecraft.class07438
 *  minecraft.class08036
 *  net.caffeinemc.mods.lithium.common.entity.pushable.EntityPushablePredicate
 */
package minecraft;

import com.google.common.base.Predicates;
import java.util.function.Predicate;
import minecraft.class00502;
import minecraft.class06639;
import minecraft.class06656;
import minecraft.class06695;
import minecraft.class07049;
import minecraft.class07438;
import minecraft.class08036;
import net.caffeinemc.mods.lithium.common.entity.pushable.EntityPushablePredicate;

public final class class07042 {
    public static final Predicate<class07049> N = class07049::method_5805;
    public static final Predicate<class07049> y = class070492 -> class070492.method_5805() && class070492 instanceof class07438;
    public static final Predicate<class07049> L = class070492 -> class070492.method_5805() && !class070492.method_5782() && !class070492.method_5765();
    public static final Predicate<class07049> u = class070492 -> class070492 instanceof class06695 && class070492.method_5805();
    public static final Predicate<class07049> i = class070492 -> {
        if (!(class070492 instanceof class08036)) return true;
        class08036 class080362 = (class08036)class070492;
        if (class070492.method_7325()) return false;
        if (class080362.method_68878()) return false;
        return true;
    };
    public static final Predicate<class07049> R = class070492 -> !class070492.method_7325();
    public static final Predicate<class07049> M = R.and(class070492 -> class070492.method_30948(null));
    public static final Predicate<class07049> B = R.and(class07049::method_5863);

    private class07042() {
    }

    public static Predicate<class07049> y(class07049 class070492) {
        return class070493 -> {
            while (class070493.method_5765()) {
                if ((class070493 = class070493.method_5854()) != class070492) continue;
                return false;
            }
            return true;
        };
    }

    public static Predicate<class07049> N(double d, double d2, double d3, double d4) {
        double d5 = d4 * d4;
        return class070492 -> class070492.method_5649(d, d2, d3) <= d5;
    }

    private static /* synthetic */ boolean N(class07049 class070492, class06639 class066392, class06656 class066562, class07049 class070493) {
        boolean bl;
        class06656 class066563;
        class00502 class005022;
        if (!class070493.method_5810()) {
            return false;
        }
        if (!(!class070492.method_73183().method_8608() || class070493 instanceof class08036 && (class005022 = (class08036)class070493).method_7340())) {
            return false;
        }
        class005022 = class070493.method_5781();
        class06656 class066564 = class066563 = class005022 == null ? class06656.field_1437 : class005022.W();
        if (class066563 == class06656.field_1435) {
            return false;
        }
        boolean bl2 = bl = class066392 != null && class066392.N((class06639)class005022);
        if ((class066562 == class06656.field_1440 || class066563 == class06656.field_1440) && bl) {
            return false;
        }
        return class066562 != class06656.field_1434 && class066563 != class06656.field_1434 || bl;
    }

    private static Predicate N(Predicate predicate, Predicate predicate2) {
        return EntityPushablePredicate.and((Predicate)predicate, (Predicate)predicate2);
    }

    public static Predicate<class07049> N(class07049 class070492) {
        class06656 class066562;
        class00502 class005022 = class070492.method_5781();
        class06656 class066563 = class066562 = class005022 == null ? class06656.field_1437 : class005022.W();
        if (class066562 == class06656.field_1435) {
            return Predicates.alwaysFalse();
        }
        return class07042.N(R, arg_0 -> class07042.N(class070492, (class06639)class005022, class066562, arg_0));
    }
}

