/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09046
 *  minecraft.class00014
 *  minecraft.class00028
 *  minecraft.class00042
 *  minecraft.class00381
 *  minecraft.class00753
 *  minecraft.class04770
 *  minecraft.class07209
 *  minecraft.class07438
 */
package Nursultan;

import Nursultan.class09046;
import java.util.UUID;
import minecraft.class00014;
import minecraft.class00028;
import minecraft.class00042;
import minecraft.class00381;
import minecraft.class00753;
import minecraft.class04770;
import minecraft.class07209;
import minecraft.class07438;

public class class11342
implements class09046 {
    private final class07438 N;
    private final class00028 y;
    private final class04770 L;
    private class07209 u;

    public void L() {
        this.L.field_13987.method_14364((class00381)class00014.N((UUID)this.N.method_5667(), (class00028)this.y, (class00753)this.u));
    }

    public class11342(class07438 class074382, class00028 class000282, class04770 class047702) {
        this.N = class074382;
        this.L = class047702;
        this.y = class000282;
        this.u = class074382.method_24515();
    }

    public void i() {
        class07209 class072092 = this.N.method_24515();
        if (class072092.method_19455((class00753)this.u) > 0) {
            this.L.field_13987.method_14364((class00381)class00014.y((UUID)this.N.method_5667(), (class00028)this.y, (class00753)class072092));
            this.u = class072092;
        }
    }

    public void u() {
        this.L.field_13987.method_14364((class00381)class00014.N((UUID)this.N.method_5667()));
    }

    public boolean y() {
        return super.y() || class00042.N((class07438)this.N, (class04770)this.L);
    }

    public int N() {
        return this.u.method_19455((class00753)this.N.method_24515());
    }
}

