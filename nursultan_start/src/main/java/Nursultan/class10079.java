/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class02362
 */
package Nursultan;

import java.util.function.Function;
import minecraft.class02362;

public class class10079<B, C>
implements class02362<B, C> {
    final /* synthetic */ class02362 N;
    final /* synthetic */ Function y;
    final /* synthetic */ Function L;

    public class10079(class02362 class023622, Function function, Function function2) {
        this.N = class023622;
        this.y = function;
        this.L = function2;
    }

    public C decode(B b) {
        Object object = this.N.decode(b);
        return (C)this.y.apply(object);
    }

    public void encode(B b, C c) {
        this.N.encode(b, this.L.apply(c));
    }
}

