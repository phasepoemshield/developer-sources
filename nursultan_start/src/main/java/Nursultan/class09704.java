/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class02362
 */
package Nursultan;

import java.util.function.Function;
import minecraft.class02362;

public class class09704<B, O>
implements class02362<B, O> {
    final /* synthetic */ Function N;
    final /* synthetic */ Function y;
    final /* synthetic */ class02362 L;

    public class09704(class02362 class023622, Function function, Function function2) {
        this.L = class023622;
        this.N = function;
        this.y = function2;
    }

    public O decode(B b) {
        return (O)this.N.apply(this.L.decode(b));
    }

    public void encode(B b, O o) {
        this.L.encode(b, this.y.apply(o));
    }
}

