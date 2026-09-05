/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class04877
 *  minecraft.class04882
 *  minecraft.class07430
 *  minecraft.class07473
 */
package Nursultan;

import java.util.EnumSet;
import minecraft.class04877;
import minecraft.class04882;
import minecraft.class07430;
import minecraft.class07473;

public class class10475
extends class07473 {
    private final class04882 y;
    final /* synthetic */ class04882 N;

    public void L() {
        this.y.z(true);
        super.L();
    }

    public class10475(class04882 class048822, class04882 class048823) {
        this.N = class048822;
        this.y = class048823;
        this.N_71(EnumSet.of(class07430.field_18405));
    }

    public void i() {
        if (!this.y.method_5701() && class04882.N((class04882)this.y).y(this.N(100)) == 0) {
            this.N.method_56078(this.N.E());
        }
        if (!this.y.method_5765() && class04882.y((class04882)this.y).y(this.N(50)) == 0) {
            this.y.A().y();
        }
        super.i();
    }

    public void u() {
        this.y.z(false);
        super.u();
    }

    public boolean N() {
        class04877 class048772 = this.y.K();
        return this.y.method_5805() && this.y.T() == null && class048772 != null && class048772.R();
    }
}

