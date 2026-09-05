/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class04782
 */
package minecraft;

import java.util.function.Function;
import minecraft.class04128;
import minecraft.class04140;
import minecraft.class04782;

class class04146<E, R>
implements class04140<E, R> {
    final /* synthetic */ class04140 N;
    final /* synthetic */ class04140 y;

    class04146(class04128 class041282, class04140 class041402, class04140 class041403) {
        this.N = class041402;
        this.y = class041403;
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
        Function function = (Function)this.y.N(class047822, e, l);
        if (function == null) {
            return null;
        }
        return function.apply(r);
    }

    @Override
    public String N() {
        return this.y.N() + " * " + this.N.N();
    }
}

