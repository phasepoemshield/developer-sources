/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.util.Function6
 *  minecraft.class02362
 */
package Nursultan;

import com.mojang.datafixers.util.Function6;
import java.util.function.Function;
import minecraft.class02362;

public class class10071<B, C>
implements class02362<B, C> {
    final /* synthetic */ class02362 N;
    final /* synthetic */ class02362 y;
    final /* synthetic */ class02362 L;
    final /* synthetic */ class02362 u;
    final /* synthetic */ class02362 i;
    final /* synthetic */ class02362 R;
    final /* synthetic */ Function6 M;
    final /* synthetic */ Function B;
    final /* synthetic */ Function Z;
    final /* synthetic */ Function z;
    final /* synthetic */ Function U;
    final /* synthetic */ Function E;
    final /* synthetic */ Function W;

    public class10071(class02362 class023622, class02362 class023623, class02362 class023624, class02362 class023625, class02362 class023626, class02362 class023627, Function6 function6, Function function, Function function2, Function function3, Function function4, Function function5, Function function7) {
        this.N = class023622;
        this.y = class023623;
        this.L = class023624;
        this.u = class023625;
        this.i = class023626;
        this.R = class023627;
        this.M = function6;
        this.B = function;
        this.Z = function2;
        this.z = function3;
        this.U = function4;
        this.E = function5;
        this.W = function7;
    }

    public C decode(B b) {
        Object object = this.N.decode(b);
        Object object2 = this.y.decode(b);
        Object object3 = this.L.decode(b);
        Object object4 = this.u.decode(b);
        Object object5 = this.i.decode(b);
        Object object6 = this.R.decode(b);
        return (C)this.M.apply(object, object2, object3, object4, object5, object6);
    }

    public void encode(B b, C c) {
        this.N.encode(b, this.B.apply(c));
        this.y.encode(b, this.Z.apply(c));
        this.L.encode(b, this.z.apply(c));
        this.u.encode(b, this.U.apply(c));
        this.i.encode(b, this.E.apply(c));
        this.R.encode(b, this.W.apply(c));
    }
}

