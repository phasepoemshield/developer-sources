/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.util.Function4
 *  minecraft.class02362
 */
package Nursultan;

import com.mojang.datafixers.util.Function4;
import java.util.function.Function;
import minecraft.class02362;

public class class10076<B, C>
implements class02362<B, C> {
    final /* synthetic */ class02362 N;
    final /* synthetic */ class02362 y;
    final /* synthetic */ class02362 L;
    final /* synthetic */ class02362 u;
    final /* synthetic */ Function4 i;
    final /* synthetic */ Function R;
    final /* synthetic */ Function M;
    final /* synthetic */ Function B;
    final /* synthetic */ Function Z;

    public class10076(class02362 class023622, class02362 class023623, class02362 class023624, class02362 class023625, Function4 function4, Function function, Function function2, Function function3, Function function5) {
        this.N = class023622;
        this.y = class023623;
        this.L = class023624;
        this.u = class023625;
        this.i = function4;
        this.R = function;
        this.M = function2;
        this.B = function3;
        this.Z = function5;
    }

    public C decode(B b) {
        Object object = this.N.decode(b);
        Object object2 = this.y.decode(b);
        Object object3 = this.L.decode(b);
        Object object4 = this.u.decode(b);
        return (C)this.i.apply(object, object2, object3, object4);
    }

    public void encode(B b, C c) {
        this.N.encode(b, this.R.apply(c));
        this.y.encode(b, this.M.apply(c));
        this.L.encode(b, this.B.apply(c));
        this.u.encode(b, this.Z.apply(c));
    }
}

