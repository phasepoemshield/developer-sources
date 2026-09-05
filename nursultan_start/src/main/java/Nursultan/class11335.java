/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09050
 *  minecraft.class00014
 *  minecraft.class00028
 *  minecraft.class00042
 *  minecraft.class00381
 *  minecraft.class04770
 *  minecraft.class07321
 *  minecraft.class07438
 */
package Nursultan;

import Nursultan.class09050;
import java.util.UUID;
import minecraft.class00014;
import minecraft.class00028;
import minecraft.class00042;
import minecraft.class00381;
import minecraft.class04770;
import minecraft.class07321;
import minecraft.class07438;

public class class11335
implements class09050 {
    private final class07438 N;
    private final class00028 y;
    private final class04770 L;
    private class07321 u;

    public void L() {
        this.L.field_13987.method_14364((class00381)class00014.N((UUID)this.N.method_5667(), (class00028)this.y, (class07321)this.u));
    }

    public class11335(class07438 class074382, class00028 class000282, class04770 class047702) {
        this.N = class074382;
        this.y = class000282;
        this.L = class047702;
        this.u = class074382.method_31476();
    }

    public void i() {
        class07321 class073212 = this.N.method_31476();
        if (class073212.N(this.u) > 0) {
            this.L.field_13987.method_14364((class00381)class00014.y((UUID)this.N.method_5667(), (class00028)this.y, (class07321)class073212));
            this.u = class073212;
        }
    }

    public void u() {
        this.L.field_13987.method_14364((class00381)class00014.N((UUID)this.N.method_5667()));
    }

    public boolean y() {
        if (super.y() || class00042.N((class07438)this.N, (class04770)this.L)) {
            return true;
        }
        return class00042.N((class07321)this.u, (class04770)this.L);
    }

    public int N() {
        return this.u.N(this.N.method_31476());
    }
}

