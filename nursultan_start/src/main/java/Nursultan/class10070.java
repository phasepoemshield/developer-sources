/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class02362
 */
package Nursultan;

import java.util.function.BiFunction;
import java.util.function.Function;
import minecraft.class02362;

public class class10070<B, C>
implements class02362<B, C> {
    final /* synthetic */ class02362 N;
    final /* synthetic */ class02362 y;
    final /* synthetic */ BiFunction L;
    final /* synthetic */ Function u;
    final /* synthetic */ Function i;

    public class10070(class02362 class023622, class02362 class023623, BiFunction biFunction, Function function, Function function2) {
        this.N = class023622;
        this.y = class023623;
        this.L = biFunction;
        this.u = function;
        this.i = function2;
    }

    public C decode(B b) {
        Object object = this.N.decode(b);
        Object object2 = this.y.decode(b);
        return (C)this.L.apply(object, object2);
    }

    public void encode(B b, C c) {
        this.N.encode(b, this.u.apply(c));
        this.y.encode(b, this.i.apply(c));
    }
}

