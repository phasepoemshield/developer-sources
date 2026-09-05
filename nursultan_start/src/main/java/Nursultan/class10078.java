/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.util.Function3
 *  minecraft.class02362
 */
package Nursultan;

import com.mojang.datafixers.util.Function3;
import java.util.function.Function;
import minecraft.class02362;

public class class10078<B, C>
implements class02362<B, C> {
    final /* synthetic */ class02362 N;
    final /* synthetic */ class02362 y;
    final /* synthetic */ class02362 L;
    final /* synthetic */ Function3 u;
    final /* synthetic */ Function i;
    final /* synthetic */ Function R;
    final /* synthetic */ Function M;

    public class10078(class02362 class023622, class02362 class023623, class02362 class023624, Function3 function3, Function function, Function function2, Function function4) {
        this.N = class023622;
        this.y = class023623;
        this.L = class023624;
        this.u = function3;
        this.i = function;
        this.R = function2;
        this.M = function4;
    }

    public C decode(B b) {
        Object object = this.N.decode(b);
        Object object2 = this.y.decode(b);
        Object object3 = this.L.decode(b);
        return (C)this.u.apply(object, object2, object3);
    }

    public void encode(B b, C c) {
        this.N.encode(b, this.i.apply(c));
        this.y.encode(b, this.R.apply(c));
        this.L.encode(b, this.M.apply(c));
    }
}

