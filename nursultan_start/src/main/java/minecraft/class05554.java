/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableSet
 *  minecraft.class01289
 *  minecraft.class01328
 *  minecraft.class04770
 *  minecraft.class04782
 *  minecraft.class05298
 *  minecraft.class05355
 *  minecraft.class05378
 *  minecraft.class06584
 *  minecraft.class07042
 *  minecraft.class07049
 *  minecraft.class07438
 *  minecraft.class07475
 *  minecraft.class07633
 *  minecraft.class08036
 */
package minecraft;

import com.google.common.collect.ImmutableSet;
import java.util.Set;
import java.util.function.BiPredicate;
import java.util.function.Predicate;
import minecraft.class01289;
import minecraft.class01328;
import minecraft.class04770;
import minecraft.class04782;
import minecraft.class05298;
import minecraft.class05355;
import minecraft.class05378;
import minecraft.class06584;
import minecraft.class07042;
import minecraft.class07049;
import minecraft.class07438;
import minecraft.class07475;
import minecraft.class07633;
import minecraft.class08036;

public class class05554
extends class05355<class07475> {
    private static final class01328 N = class01328.y().u();
    private final BiPredicate<class07475, class06584> y;

    public class05554(Predicate<class06584> predicate) {
        this((class07475 class074752, class06584 class065842) -> predicate.test((class06584)class065842));
    }

    private class05554(BiPredicate<class07475, class06584> biPredicate) {
        this.y = biPredicate;
    }

    public static class05554 y() {
        return new class05554((class074752, class065842) -> {
            if (class074752 instanceof class07633) {
                return ((class07633)class074752).N(class065842);
            }
            return false;
        });
    }

    public void N(class04782 class047822, class07475 class074752) {
        class01289 var3 = class074752.method_18868();
        class01328 class013282 = N.L().N((double)((float)class074752.method_45325(class05298.J)));
        class04770 class047702 = null;
        double d = Double.MAX_VALUE;
        for (class04770 class047703 : class047822.method_18456()) {
            double d2;
            if (!class07042.R.test(class047703) || !class013282.N(class047822, (class07438)class074752, (class07438)class047703) || !this.y(class074752, (class08036)class047703) || class074752.method_5626((class07049)class047703) || !((d2 = class074752.method_5858((class07049)class047703)) < d)) continue;
            d = d2;
            class047702 = class047703;
        }
        if (class047702 != null) {
            var3.N(class05378.a, class047702);
        } else {
            var3.y(class05378.a);
        }
    }

    private static /* synthetic */ boolean N(class01328 class013282, class04782 class047822, class07475 class074752, class04770 class047702) {
        return class013282.N(class047822, (class07438)class074752, (class07438)class047702);
    }

    private boolean y(class07475 class074752, class08036 class080362) {
        return this.N(class074752, class080362.method_6047()) || this.N(class074752, class080362.method_6079());
    }

    private boolean N(class07475 class074752, class06584 class065842) {
        return this.y.test(class074752, class065842);
    }

    public Set<class05378<?>> N() {
        return ImmutableSet.of((Object)class05378.a);
    }

    private static /* synthetic */ boolean N(class07475 class074752, class04770 class047702) {
        return !class074752.method_5626((class07049)class047702);
    }
}

