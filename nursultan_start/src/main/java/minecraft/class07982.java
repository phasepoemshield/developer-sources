/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class06889
 *  minecraft.class07049
 *  minecraft.class07079
 *  minecraft.class07430
 *  minecraft.class07438
 *  minecraft.class07473
 */
package minecraft;

import java.util.EnumSet;
import minecraft.class06889;
import minecraft.class07049;
import minecraft.class07079;
import minecraft.class07430;
import minecraft.class07438;
import minecraft.class07473;

public class class07982
extends class07473 {
    private final class07079 N;
    private class07438 y;
    private final float L;

    public void L() {
        class06889 class068892 = this.N.method_18798();
        class06889 class068893 = new class06889(this.y.method_23317() - this.N.method_23317(), 0.0, this.y.method_23321() - this.N.method_23321());
        if (class068893.B() > 1.0E-7) {
            class068893 = class068893.u().L(0.4).i(class068892.L(0.2));
        }
        this.N.method_18800(class068893.M, (double)this.L, class068893.Z);
    }

    public class07982(class07079 class070792, float f) {
        this.N = class070792;
        this.L = f;
        this.N_71(EnumSet.of(class07430.field_18407, class07430.field_18405));
    }

    public boolean y() {
        return !this.N.method_24828();
    }

    public boolean N() {
        if (this.N.method_42148()) {
            return false;
        }
        this.y = this.N.T();
        if (this.y == null) {
            return false;
        }
        double d = this.N.method_5858((class07049)this.y);
        if (d < 4.0 || d > 16.0) {
            return false;
        }
        if (!this.N.method_24828()) {
            return false;
        }
        return this.N.method_59922().y(class07982.y((int)5)) == 0;
    }
}

