/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.util.Function3
 *  minecraft.class04782
 */
package minecraft;

import com.mojang.datafixers.util.Function3;
import minecraft.class04128;
import minecraft.class04140;
import minecraft.class04782;

class class04117<E, R>
implements class04140<E, R> {
    final /* synthetic */ class04140 N;
    final /* synthetic */ class04140 y;
    final /* synthetic */ class04140 L;
    final /* synthetic */ class04140 u;

    class04117(class04128 class041282, class04140 class041402, class04140 class041403, class04140 class041404, class04140 class041405) {
        this.N = class041402;
        this.y = class041403;
        this.L = class041404;
        this.u = class041405;
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
        Function3 function3 = (Function3)this.u.N(class047822, e, l);
        if (function3 == null) {
            return null;
        }
        return (R)function3.apply(r, r2, r3);
    }

    @Override
    public String N() {
        return this.u.N() + " * " + this.N.N() + " * " + this.y.N() + " * " + this.L.N();
    }
}

