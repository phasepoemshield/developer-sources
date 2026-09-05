/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00381
 *  minecraft.class00392
 *  minecraft.class01517
 *  minecraft.class02796
 *  minecraft.class04770
 */
package minecraft;

import java.util.Locale;
import minecraft.class00381;
import minecraft.class00392;
import minecraft.class01517;
import minecraft.class02796;
import minecraft.class03106;
import minecraft.class03124;
import minecraft.class03132;
import minecraft.class04770;

public class class03143
extends class03106 {
    private long M = 0L;
    private long B = 0L;
    private long Z = 0L;
    private long z = 0L;
    private boolean U = false;
    private final class02796 E;

    public boolean L() {
        if (this.M > 0L) {
            this.s();
            return true;
        }
        return false;
    }

    private void P() {
        this.E.Nm().N((class00381)class03124.N(this));
    }

    public class03143(class02796 class027962) {
        this.E = class027962;
    }

    public void i() {
        this.Z += System.nanoTime() - this.B;
    }

    private void s() {
        long l = this.z - this.M;
        double d = Math.max(1.0, (double)this.Z) / (double)class01517.y;
        int n = (int)((double)(class01517.L * l) / d);
        String string = String.format(Locale.ROOT, "%.2f", l == 0L ? (double)this.M() : d / (double)l);
        this.z = 0L;
        this.Z = 0L;
        this.E.yu().N(() -> class00392.N((String)"commands.tick.sprint.report", (Object[])new Object[]{n, string}), true);
        this.M = 0L;
        this.N(this.U);
        this.E.Nd();
    }

    private void m() {
        this.E.Nm().N((class00381)class03132.N(this));
    }

    public boolean u() {
        if (!this.i) {
            return false;
        }
        if (this.M > 0L) {
            this.B = System.nanoTime();
            --this.M;
            return true;
        }
        this.s();
        return false;
    }

    public boolean y() {
        if (this.u > 0) {
            this.u = 0;
            this.P();
            return true;
        }
        return false;
    }

    public boolean y(int n) {
        boolean bl = this.M > 0L;
        this.Z = 0L;
        this.z = n;
        this.M = n;
        this.U = this.E();
        this.N(false);
        return bl;
    }

    public void N(class04770 class047702) {
        class047702.field_13987.method_14364((class00381)class03132.N(this));
        class047702.field_13987.method_14364((class00381)class03124.N(this));
    }

    @Override
    public void N(float f) {
        super.N(f);
        this.E.Nd();
        this.m();
    }

    @Override
    public void N(boolean bl) {
        super.N(bl);
        this.m();
    }

    public boolean N() {
        return this.z > 0L;
    }

    public boolean N(int n) {
        if (!this.E()) {
            return false;
        }
        this.u = n;
        this.P();
        return true;
    }
}

