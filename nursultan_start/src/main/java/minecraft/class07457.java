/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class04425
 *  minecraft.class07049
 *  minecraft.class07079
 *  minecraft.class07473
 *  minecraft.class07623
 *  minecraft.class07655
 *  minecraft.class07991
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.util.EnumSet;
import java.util.List;
import java.util.function.Predicate;
import minecraft.class04425;
import minecraft.class07049;
import minecraft.class07079;
import minecraft.class07430;
import minecraft.class07442;
import minecraft.class07473;
import minecraft.class07623;
import minecraft.class07655;
import minecraft.class07991;
import org.jspecify.annotations.Nullable;

public class class07457
extends class07473 {
    private final class07079 N;
    private final Predicate<class07079> y;
    private @Nullable class07079 L;
    private final double u;
    private final class07623 i;
    private int R;
    private final float M;
    private float B;
    private final float Z;

    public void L() {
        this.R = 0;
        this.B = this.N.N(class04425.field_18);
        this.N.N(class04425.field_18, 0.0f);
    }

    public class07457(class07079 class070792, double d, float f, float f2) {
        this.N = class070792;
        this.y = class070793 -> class070792.getClass() != class070793.getClass();
        this.u = d;
        this.i = class070792.f();
        this.M = f;
        this.Z = f2;
        this.N_71(EnumSet.of(class07430.field_18405, class07430.field_18406));
        if (!(class070792.f() instanceof class07655) && !(class070792.f() instanceof class07991)) {
            throw new IllegalArgumentException("Unsupported mob type for FollowMobGoal");
        }
    }

    public void i() {
        double d;
        double d2;
        if (this.L == null || this.N.g_()) {
            return;
        }
        this.N.p().N((class07049)this.L, 10.0f, this.N.Ni());
        if (--this.R > 0) {
            return;
        }
        this.R = this.N(10);
        double d3 = this.N.method_23317() - this.L.method_23317();
        double d4 = d3 * d3 + (d2 = this.N.method_23318() - this.L.method_23318()) * d2 + (d = this.N.method_23321() - this.L.method_23321()) * d;
        if (d4 <= (double)(this.M * this.M)) {
            this.i.W();
            class07442 class074422 = this.L.p();
            if (d4 <= (double)this.M || class074422.i() == this.N.method_23317() && class074422.R() == this.N.method_23318() && class074422.M() == this.N.method_23321()) {
                double d5 = this.L.method_23317() - this.N.method_23317();
                double d6 = this.L.method_23321() - this.N.method_23321();
                this.i.N(this.N.method_23317() - d5, this.N.method_23318(), this.N.method_23321() - d6, this.u);
            }
            return;
        }
        this.i.N((class07049)this.L, this.u);
    }

    public void u() {
        this.L = null;
        this.i.W();
        this.N.N(class04425.field_18, this.B);
    }

    public boolean y() {
        return this.L != null && !this.i.U() && this.N.method_5858((class07049)this.L) > (double)(this.M * this.M);
    }

    public boolean N() {
        List var1 = this.N.method_73183().N(class07079.class, this.N.method_5829().M((double)this.Z), this.y);
        if (!var1.isEmpty()) {
            for (class07079 class070792 : var1) {
                if (class070792.method_5767()) continue;
                this.L = class070792;
                return true;
            }
        }
        return false;
    }
}

