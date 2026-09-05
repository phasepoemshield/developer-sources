/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.util.Function5
 *  minecraft.class02362
 */
package Nursultan;

import com.mojang.datafixers.util.Function5;
import java.util.function.Function;
import minecraft.class02362;

public class class10073<B, C>
implements class02362<B, C> {
    final /* synthetic */ class02362 N;
    final /* synthetic */ class02362 y;
    final /* synthetic */ class02362 L;
    final /* synthetic */ class02362 u;
    final /* synthetic */ class02362 i;
    final /* synthetic */ Function5 R;
    final /* synthetic */ Function M;
    final /* synthetic */ Function B;
    final /* synthetic */ Function Z;
    final /* synthetic */ Function z;
    final /* synthetic */ Function U;

    public class10073(class02362 class023622, class02362 class023623, class02362 class023624, class02362 class023625, class02362 class023626, Function5 function5, Function function, Function function2, Function function3, Function function4, Function function6) {
        this.N = class023622;
        this.y = class023623;
        this.L = class023624;
        this.u = class023625;
        this.i = class023626;
        this.R = function5;
        this.M = function;
        this.B = function2;
        this.Z = function3;
        this.z = function4;
        this.U = function6;
    }

    public C decode(B b) {
        Object object = this.N.decode(b);
        Object object2 = this.y.decode(b);
        Object object3 = this.L.decode(b);
        Object object4 = this.u.decode(b);
        Object object5 = this.i.decode(b);
        return (C)this.R.apply(object, object2, object3, object4, object5);
    }

    public void encode(B b, C c) {
        this.N.encode(b, this.M.apply(c));
        this.y.encode(b, this.B.apply(c));
        this.L.encode(b, this.Z.apply(c));
        this.u.encode(b, this.z.apply(c));
        this.i.encode(b, this.U.apply(c));
    }
}

