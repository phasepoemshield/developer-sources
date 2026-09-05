/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.util.Function8
 *  minecraft.class02362
 */
package Nursultan;

import com.mojang.datafixers.util.Function8;
import java.util.function.Function;
import minecraft.class02362;

public class class10075<B, C>
implements class02362<B, C> {
    final /* synthetic */ class02362 N;
    final /* synthetic */ class02362 y;
    final /* synthetic */ class02362 L;
    final /* synthetic */ class02362 u;
    final /* synthetic */ class02362 i;
    final /* synthetic */ class02362 R;
    final /* synthetic */ class02362 M;
    final /* synthetic */ class02362 B;
    final /* synthetic */ Function8 Z;
    final /* synthetic */ Function z;
    final /* synthetic */ Function U;
    final /* synthetic */ Function E;
    final /* synthetic */ Function W;
    final /* synthetic */ Function m;
    final /* synthetic */ Function P;
    final /* synthetic */ Function s;
    final /* synthetic */ Function T;

    public class10075(class02362 class023622, class02362 class023623, class02362 class023624, class02362 class023625, class02362 class023626, class02362 class023627, class02362 class023628, class02362 class023629, Function8 function8, Function function, Function function2, Function function3, Function function4, Function function5, Function function6, Function function7, Function function9) {
        this.N = class023622;
        this.y = class023623;
        this.L = class023624;
        this.u = class023625;
        this.i = class023626;
        this.R = class023627;
        this.M = class023628;
        this.B = class023629;
        this.Z = function8;
        this.z = function;
        this.U = function2;
        this.E = function3;
        this.W = function4;
        this.m = function5;
        this.P = function6;
        this.s = function7;
        this.T = function9;
    }

    public C decode(B b) {
        Object object = this.N.decode(b);
        Object object2 = this.y.decode(b);
        Object object3 = this.L.decode(b);
        Object object4 = this.u.decode(b);
        Object object5 = this.i.decode(b);
        Object object6 = this.R.decode(b);
        Object object7 = this.M.decode(b);
        Object object8 = this.B.decode(b);
        return (C)this.Z.apply(object, object2, object3, object4, object5, object6, object7, object8);
    }

    public void encode(B b, C c) {
        this.N.encode(b, this.z.apply(c));
        this.y.encode(b, this.U.apply(c));
        this.L.encode(b, this.E.apply(c));
        this.u.encode(b, this.W.apply(c));
        this.i.encode(b, this.m.apply(c));
        this.R.encode(b, this.P.apply(c));
        this.M.encode(b, this.s.apply(c));
        this.B.encode(b, this.T.apply(c));
    }
}

