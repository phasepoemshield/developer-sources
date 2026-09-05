/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class04425
 *  minecraft.class07049
 *  minecraft.class07473
 *  minecraft.class07623
 *  minecraft.class07655
 *  minecraft.class07991
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.util.EnumSet;
import minecraft.class04425;
import minecraft.class07049;
import minecraft.class07430;
import minecraft.class07438;
import minecraft.class07453;
import minecraft.class07473;
import minecraft.class07623;
import minecraft.class07655;
import minecraft.class07991;
import org.jspecify.annotations.Nullable;

public class class07444
extends class07473 {
    private final class07453 N;
    private @Nullable class07438 y;
    private final double L;
    private final class07623 u;
    private int i;
    private final float R;
    private final float M;
    private float B;

    public void L() {
        this.i = 0;
        this.B = this.N.N(class04425.field_18);
        this.N.N(class04425.field_18, 0.0f);
    }

    public class07444(class07453 class074532, double d, float f, float f2) {
        this.N = class074532;
        this.L = d;
        this.u = class074532.f();
        this.M = f;
        this.R = f2;
        this.N_71(EnumSet.of(class07430.field_18405, class07430.field_18406));
        if (!(class074532.f() instanceof class07655) && !(class074532.f() instanceof class07991)) {
            throw new IllegalArgumentException("Unsupported mob type for FollowOwnerGoal");
        }
    }

    public void i() {
        boolean bl = this.N.Nq();
        if (!bl) {
            this.N.p().N(this.y, 10.0f, this.N.Ni());
        }
        if (--this.i > 0) {
            return;
        }
        this.i = this.N(10);
        if (bl) {
            this.N.No();
        } else {
            this.u.N((class07049)this.y, this.L);
        }
    }

    public void u() {
        this.y = null;
        this.u.W();
        this.N.N(class04425.field_18, this.B);
    }

    public boolean y() {
        if (this.u.U()) {
            return false;
        }
        if (this.N.NK()) {
            return false;
        }
        return !(this.N.method_5858(this.y) <= (double)(this.R * this.R));
    }

    public boolean N() {
        class07438 class074382 = this.N.L_();
        if (class074382 == null) {
            return false;
        }
        if (this.N.NK()) {
            return false;
        }
        if (this.N.method_5858(class074382) < (double)(this.M * this.M)) {
            return false;
        }
        this.y = class074382;
        return true;
    }
}

