/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.util.Function9
 *  minecraft.class02362
 */
package Nursultan;

import com.mojang.datafixers.util.Function9;
import java.util.function.Function;
import minecraft.class02362;

public class class10080<B, C>
implements class02362<B, C> {
    final /* synthetic */ class02362 N;
    final /* synthetic */ class02362 y;
    final /* synthetic */ class02362 L;
    final /* synthetic */ class02362 u;
    final /* synthetic */ class02362 i;
    final /* synthetic */ class02362 R;
    final /* synthetic */ class02362 M;
    final /* synthetic */ class02362 B;
    final /* synthetic */ class02362 Z;
    final /* synthetic */ Function9 z;
    final /* synthetic */ Function U;
    final /* synthetic */ Function E;
    final /* synthetic */ Function W;
    final /* synthetic */ Function m;
    final /* synthetic */ Function P;
    final /* synthetic */ Function s;
    final /* synthetic */ Function T;
    final /* synthetic */ Function b;
    final /* synthetic */ Function j;

    public class10080(class02362 class023622, class02362 class023623, class02362 class023624, class02362 class023625, class02362 class023626, class02362 class023627, class02362 class023628, class02362 class023629, class02362 class0236210, Function9 function9, Function function, Function function2, Function function3, Function function4, Function function5, Function function6, Function function7, Function function8, Function function10) {
        this.N = class023622;
        this.y = class023623;
        this.L = class023624;
        this.u = class023625;
        this.i = class023626;
        this.R = class023627;
        this.M = class023628;
        this.B = class023629;
        this.Z = class0236210;
        this.z = function9;
        this.U = function;
        this.E = function2;
        this.W = function3;
        this.m = function4;
        this.P = function5;
        this.s = function6;
        this.T = function7;
        this.b = function8;
        this.j = function10;
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
        Object object9 = this.Z.decode(b);
        return (C)this.z.apply(object, object2, object3, object4, object5, object6, object7, object8, object9);
    }

    public void encode(B b, C c) {
        this.N.encode(b, this.U.apply(c));
        this.y.encode(b, this.E.apply(c));
        this.L.encode(b, this.W.apply(c));
        this.u.encode(b, this.m.apply(c));
        this.i.encode(b, this.P.apply(c));
        this.R.encode(b, this.s.apply(c));
        this.M.encode(b, this.T.apply(c));
        this.B.encode(b, this.b.apply(c));
        this.Z.encode(b, this.j.apply(c));
    }
}

