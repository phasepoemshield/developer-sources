/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class02362
 */
package Nursultan;

import java.util.function.Function;
import minecraft.class02362;

public class class10072<B, U>
implements class02362<B, U> {
    final /* synthetic */ Function N;
    final /* synthetic */ Function y;
    final /* synthetic */ class02362 L;

    public class10072(class02362 class023622, Function function, Function function2) {
        this.L = class023622;
        this.N = function;
        this.y = function2;
    }

    public U decode(B b) {
        Object object = this.L.decode(b);
        return (U)((class02362)this.N.apply(object)).decode(b);
    }

    public void encode(B b, U u) {
        Object r = this.y.apply(u);
        class02362 class023622 = (class02362)this.N.apply(r);
        this.L.encode(b, r);
        class023622.encode(b, u);
    }
}

