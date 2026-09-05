/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01237
 *  minecraft.class01421
 *  minecraft.class01894
 *  minecraft.class02294
 *  minecraft.class02566
 *  minecraft.class03999
 *  minecraft.class06078
 *  minecraft.class06249
 *  minecraft.class06252
 *  minecraft.class07311
 *  minecraft.class08476
 */
package minecraft;

import java.util.function.Function;
import minecraft.class01237;
import minecraft.class01421;
import minecraft.class01894;
import minecraft.class02294;
import minecraft.class02566;
import minecraft.class03999;
import minecraft.class06078;
import minecraft.class06249;
import minecraft.class06252;
import minecraft.class07311;
import minecraft.class08476;

public class class03971<S extends class08476, M extends class06078<S>>
extends class06249<S, M> {
    private final Function<S, class01894> N;
    private final class03999<S> y;
    private final M L;
    private final Function<class01894, class07311> u;
    private final boolean i;

    public class03971(class06252<S, M> class062522, Function<S, class01894> function, class03999<S> class039992, M m, Function<class01894, class07311> function2, boolean bl) {
        super(class062522);
        this.N = function;
        this.y = class039992;
        this.L = m;
        this.u = function2;
        this.i = bl;
    }

    public void N(class01421 class014212, class01237 class012372, int n, S s, float f, float f2) {
        if (((class08476)s).v && !this.i) {
            return;
        }
        float f3 = this.y.apply(s, ((class08476)s).P);
        if (f3 <= 1.0E-5f) {
            return;
        }
        int n2 = class02566.y((float)f3);
        class07311 class073112 = this.u.apply(this.N.apply(s));
        class012372.N(1).N(this.L, s, class014212, class073112, n, class02294.N(s, (float)0.0f), n2, null, ((class08476)s).l, null);
    }
}

