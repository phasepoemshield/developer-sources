/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.util.Function12
 *  minecraft.class02362
 */
package Nursultan;

import com.mojang.datafixers.util.Function12;
import java.util.function.Function;
import minecraft.class02362;

public class class09698<B, C>
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
    final /* synthetic */ class02362 E;
    final /* synthetic */ Function12 W;
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
    final /* synthetic */ Function l;
    final /* synthetic */ Function d;

    public class09698(class02362 class023622, class02362 class023623, class02362 class023624, class02362 class023625, class02362 class023626, class02362 class023627, class02362 class023628, class02362 class023629, class02362 class0236210, class02362 class0236211, class02362 class0236212, class02362 class0236213, Function12 function12, Function function, Function function2, Function function3, Function function4, Function function5, Function function6, Function function7, Function function8, Function function9, Function function10, Function function11, Function function13) {
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
        this.E = class0236213;
        this.W = function12;
        this.m = function;
        this.P = function2;
        this.s = function3;
        this.T = function4;
        this.b = function5;
        this.j = function6;
        this.v = function7;
        this.n = function8;
        this.t = function9;
        this.G = function10;
        this.l = function11;
        this.d = function13;
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
        Object object12 = this.E.decode(b);
        return (C)this.W.apply(object, object2, object3, object4, object5, object6, object7, object8, object9, object10, object11, object12);
    }

    public void encode(B b, C c) {
        this.N.encode(b, this.m.apply(c));
        this.y.encode(b, this.P.apply(c));
        this.L.encode(b, this.s.apply(c));
        this.u.encode(b, this.T.apply(c));
        this.i.encode(b, this.b.apply(c));
        this.R.encode(b, this.j.apply(c));
        this.M.encode(b, this.v.apply(c));
        this.B.encode(b, this.n.apply(c));
        this.Z.encode(b, this.t.apply(c));
        this.z.encode(b, this.G.apply(c));
        this.U.encode(b, this.l.apply(c));
        this.E.encode(b, this.d.apply(c));
    }
}

