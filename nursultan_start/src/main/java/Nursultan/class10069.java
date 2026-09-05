/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.util.Function11
 *  minecraft.class02362
 */
package Nursultan;

import com.mojang.datafixers.util.Function11;
import java.util.function.Function;
import minecraft.class02362;

public class class10069<B, C>
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
    final /* synthetic */ class02362 z;
    final /* synthetic */ class02362 U;
    final /* synthetic */ Function11 E;
    final /* synthetic */ Function W;
    final /* synthetic */ Function m;
    final /* synthetic */ Function P;
    final /* synthetic */ Function s;
    final /* synthetic */ Function T;
    final /* synthetic */ Function b;
    final /* synthetic */ Function j;
    final /* synthetic */ Function v;
    final /* synthetic */ Function n;
    final /* synthetic */ Function t;
    final /* synthetic */ Function G;

    public class10069(class02362 class023622, class02362 class023623, class02362 class023624, class02362 class023625, class02362 class023626, class02362 class023627, class02362 class023628, class02362 class023629, class02362 class0236210, class02362 class0236211, class02362 class0236212, Function11 function11, Function function, Function function2, Function function3, Function function4, Function function5, Function function6, Function function7, Function function8, Function function9, Function function10, Function function12) {
        this.N = class023622;
        this.y = class023623;
        this.L = class023624;
        this.u = class023625;
        this.i = class023626;
        this.R = class023627;
        this.M = class023628;
        this.B = class023629;
        this.Z = class0236210;
        this.z = class0236211;
        this.U = class0236212;
        this.E = function11;
        this.W = function;
        this.m = function2;
        this.P = function3;
        this.s = function4;
        this.T = function5;
        this.b = function6;
        this.j = function7;
        this.v = function8;
        this.n = function9;
        this.t = function10;
        this.G = function12;
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
        Object object10 = this.z.decode(b);
        Object object11 = this.U.decode(b);
        return (C)this.E.apply(object, object2, object3, object4, object5, object6, object7, object8, object9, object10, object11);
    }

    public void encode(B b, C c) {
        this.N.encode(b, this.W.apply(c));
        this.y.encode(b, this.m.apply(c));
        this.L.encode(b, this.P.apply(c));
        this.u.encode(b, this.s.apply(c));
        this.i.encode(b, this.T.apply(c));
        this.R.encode(b, this.b.apply(c));
        this.M.encode(b, this.j.apply(c));
        this.B.encode(b, this.v.apply(c));
        this.Z.encode(b, this.n.apply(c));
        this.z.encode(b, this.t.apply(c));
        this.U.encode(b, this.G.apply(c));
    }
}

