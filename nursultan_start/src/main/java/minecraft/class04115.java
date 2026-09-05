/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.util.Function4
 *  minecraft.class04782
 */
package minecraft;

import com.mojang.datafixers.util.Function4;
import minecraft.class04128;
import minecraft.class04140;
import minecraft.class04782;

class class04115<E, R>
implements class04140<E, R> {
    final /* synthetic */ class04140 N;
    final /* synthetic */ class04140 y;
    final /* synthetic */ class04140 L;
    final /* synthetic */ class04140 u;
    final /* synthetic */ class04140 i;

    class04115(class04128 class041282, class04140 class041402, class04140 class041403, class04140 class041404, class04140 class041405, class04140 class041406) {
        this.N = class041402;
        this.y = class041403;
        this.L = class041404;
        this.u = class041405;
        this.i = class041406;
    }

    public String toString() {
        return this.N();
    }

    @Override
    public R N(class04782 class047822, E e, long l) {
        Object r = this.N.N(class047822, e, l);
        if (r == null) {
            return null;
        }
        Object r2 = this.y.N(class047822, e, l);
        if (r2 == null) {
            return null;
        }
        Object r3 = this.L.N(class047822, e, l);
        if (r3 == null) {
            return null;
        }
        Object r4 = this.u.N(class047822, e, l);
        if (r4 == null) {
            return null;
        }
        Function4 function4 = (Function4)this.i.N(class047822, e, l);
        if (function4 == null) {
            return null;
        }
        return (R)function4.apply(r, r2, r3, r4);
    }

    @Override
    public String N() {
        return this.i.N() + " * " + this.N.N() + " * " + this.y.N() + " * " + this.L.N() + " * " + this.u.N();
    }
}

