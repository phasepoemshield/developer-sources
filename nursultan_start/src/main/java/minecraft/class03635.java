/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class04391
 *  minecraft.class04770
 *  minecraft.class04782
 *  minecraft.class04909
 *  minecraft.class04911
 *  minecraft.class05367
 *  minecraft.class05378
 *  minecraft.class05765
 *  minecraft.class05779
 *  minecraft.class06069
 *  minecraft.class06293
 *  minecraft.class06584
 *  minecraft.class06889
 *  minecraft.class06912
 *  minecraft.class07049
 *  minecraft.class07209
 *  minecraft.class07299
 *  minecraft.class07438
 *  minecraft.class07536
 */
package minecraft;

import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import minecraft.class03630;
import minecraft.class03645;
import minecraft.class04391;
import minecraft.class04770;
import minecraft.class04782;
import minecraft.class04909;
import minecraft.class04911;
import minecraft.class05367;
import minecraft.class05378;
import minecraft.class05765;
import minecraft.class05779;
import minecraft.class06069;
import minecraft.class06293;
import minecraft.class06584;
import minecraft.class06889;
import minecraft.class06912;
import minecraft.class07049;
import minecraft.class07209;
import minecraft.class07299;
import minecraft.class07438;
import minecraft.class07536;

public class class03635<E extends class07438>
extends class05765<E> {
    private static final int N = 3;
    private static final int y = 60;
    private final Function<class07438, Optional<class05779>> L;
    private final float u;

    protected void L(class04782 class047822, E e, long l) {
        class06584 class065842;
        Optional<class05779> var5 = this.L.apply((class07438)e);
        if (var5.isEmpty()) {
            return;
        }
        class05779 class057792 = var5.get();
        if (class057792.N().R(e.method_33571()) < 3.0 && !(class065842 = ((class04391)e).n().method_5434(0, 1)).R()) {
            class03635.N(e, class065842, class03635.N(class057792));
            if (e instanceof class03630) {
                class03645.N((class07438)((class03630)((Object)e))).ifPresent(class047702 -> this.N(class057792, class065842, (class04770)class047702));
            }
            e.method_18868().N(class05378.yN, (Object)60);
        }
    }

    public class03635(Function<class07438, Optional<class05779>> function, float f, int n) {
        super(Map.of(class05378.P, class05367.field_18458, class05378.m, class05367.field_18458, class05378.yN, class05367.field_18458), n);
        this.L = function;
        this.u = f;
    }

    protected void u(class04782 class047822, E e, long l) {
        this.L.apply((class07438)e).ifPresent(class057792 -> class06293.N((class07438)e, (class05779)class057792, (float)this.u, (int)3));
    }

    private boolean y(E e) {
        if (((class04391)e).n().method_5442()) {
            return false;
        }
        return this.L.apply((class07438)e).isPresent();
    }

    private static class06889 N(class05779 class057792) {
        return class057792.N().y(0.0, 1.0, 0.0);
    }

    public static void N(class07438 class074382, class06584 class065842, class06889 class068892) {
        class06889 class068893 = new class06889((double)0.2f, (double)0.3f, (double)0.2f);
        class06293.N((class07438)class074382, (class06584)class065842, (class06889)class068892, (class06889)class068893, (float)0.2f);
        class07299 class072992 = class074382.method_73183();
        if (class072992.N() % 7L == 0L && class072992.field_9229.U() < 0.9) {
            float f = ((Float)class07536.N_77(class03630.u, (class06069)class072992.method_8409())).floatValue();
            class072992.method_43129(null, (class07049)class074382, class04909.M, class04911.field_15254, 1.0f, f);
        }
    }

    private void N(class05779 class057792, class06584 class065842, class04770 class047702) {
        class07209 class072092 = class057792.y().method_10074();
        class06912.NL.N(class047702, class072092, class065842);
    }

    protected boolean N(class04782 class047822, E e, long l) {
        return this.y(e);
    }

    protected boolean N(class04782 class047822, E e) {
        return this.y(e);
    }
}

