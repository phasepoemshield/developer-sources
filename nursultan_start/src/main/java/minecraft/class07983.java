/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class07049
 *  minecraft.class07079
 *  minecraft.class07430
 *  minecraft.class07438
 *  minecraft.class07473
 */
package minecraft;

import java.util.EnumSet;
import minecraft.class07049;
import minecraft.class07079;
import minecraft.class07430;
import minecraft.class07438;
import minecraft.class07473;

public class class07983
extends class07473 {
    private final class07079 N;
    private class07438 y;
    private int L;

    public class07983(class07079 class070792) {
        this.N = class070792;
        this.N_71(EnumSet.of(class07430.field_18405, class07430.field_18406));
    }

    public boolean B() {
        return true;
    }

    public void i() {
        this.N.p().N((class07049)this.y, 30.0f, 30.0f);
        double d = this.N.method_17681() * 2.0f * (this.N.method_17681() * 2.0f);
        double d2 = this.N.method_5649(this.y.method_23317(), this.y.method_23318(), this.y.method_23321());
        double d3 = 0.8;
        if (d2 > d && d2 < 16.0) {
            d3 = 1.33;
        } else if (d2 < 225.0) {
            d3 = 0.6;
        }
        this.N.f().N((class07049)this.y, d3);
        this.L = Math.max(this.L - 1, 0);
        if (d2 > d) {
            return;
        }
        if (this.L > 0) {
            return;
        }
        this.L = 20;
        this.N.method_6121(class07983.N((class07049)this.N), (class07049)this.y);
    }

    public void u() {
        this.y = null;
        this.N.f().W();
    }

    public boolean y() {
        if (!this.y.method_5805()) {
            return false;
        }
        if (this.N.method_5858((class07049)this.y) > 225.0) {
            return false;
        }
        return !this.N.f().U() || this.N();
    }

    public boolean N() {
        class07438 class074382 = this.N.T();
        if (class074382 == null) {
            return false;
        }
        this.y = class074382;
        return true;
    }
}

