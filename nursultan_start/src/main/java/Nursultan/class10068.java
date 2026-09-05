/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.util.Function7
 *  minecraft.class02362
 */
package Nursultan;

import com.mojang.datafixers.util.Function7;
import java.util.function.Function;
import minecraft.class02362;

public class class10068<B, C>
implements class02362<B, C> {
    final /* synthetic */ class02362 N;
    final /* synthetic */ class02362 y;
    final /* synthetic */ class02362 L;
    final /* synthetic */ class02362 u;
    final /* synthetic */ class02362 i;
    final /* synthetic */ class02362 R;
    final /* synthetic */ class02362 M;
    final /* synthetic */ Function7 B;
    final /* synthetic */ Function Z;
    final /* synthetic */ Function z;
    final /* synthetic */ Function U;
    final /* synthetic */ Function E;
    final /* synthetic */ Function W;
    final /* synthetic */ Function m;
    final /* synthetic */ Function P;

    public class10068(class02362 class023622, class02362 class023623, class02362 class023624, class02362 class023625, class02362 class023626, class02362 class023627, class02362 class023628, Function7 function7, Function function, Function function2, Function function3, Function function4, Function function5, Function function6, Function function8) {
        this.N = class023622;
        this.y = class023623;
        this.L = class023624;
        this.u = class023625;
        this.i = class023626;
        this.R = class023627;
        this.M = class023628;
        this.B = function7;
        this.Z = function;
        this.z = function2;
        this.U = function3;
        this.E = function4;
        this.W = function5;
        this.m = function6;
        this.P = function8;
    }

    public C decode(B b) {
        Object object = this.N.decode(b);
        Object object2 = this.y.decode(b);
        Object object3 = this.L.decode(b);
        Object object4 = this.u.decode(b);
        Object object5 = this.i.decode(b);
        Object object6 = this.R.decode(b);
        Object object7 = this.M.decode(b);
        return (C)this.B.apply(object, object2, object3, object4, object5, object6, object7);
    }

    public void encode(B b, C c) {
        this.N.encode(b, this.Z.apply(c));
        this.y.encode(b, this.z.apply(c));
        this.L.encode(b, this.U.apply(c));
        this.u.encode(b, this.E.apply(c));
        this.i.encode(b, this.W.apply(c));
        this.R.encode(b, this.m.apply(c));
        this.M.encode(b, this.P.apply(c));
    }
}

