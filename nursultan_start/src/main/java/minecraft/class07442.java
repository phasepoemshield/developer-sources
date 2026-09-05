/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class04995
 *  minecraft.class06889
 *  minecraft.class07049
 *  minecraft.class07079
 *  minecraft.class08701
 */
package minecraft;

import java.util.Optional;
import minecraft.class04995;
import minecraft.class06889;
import minecraft.class07049;
import minecraft.class07079;
import minecraft.class08701;

public class class07442
implements class08701 {
    protected final class07079 y;
    protected float L;
    protected float u;
    protected int i;
    protected double R;
    protected double M;
    protected double B;

    protected boolean L() {
        return true;
    }

    public double M() {
        return this.B;
    }

    public class07442(class07079 class070792) {
        this.y = class070792;
    }

    protected Optional<Float> B() {
        double d = this.R - this.y.method_23317();
        double d2 = this.M - this.y.method_23320();
        double d3 = this.B - this.y.method_23321();
        double d4 = Math.sqrt(d * d + d3 * d3);
        return Math.abs(d2) > (double)1.0E-5f || Math.abs(d4) > (double)1.0E-5f ? Optional.of(Float.valueOf((float)(-(class04995.u((double)d2, (double)d4) * 57.2957763671875)))) : Optional.empty();
    }

    protected Optional<Float> Z() {
        double d = this.R - this.y.method_23317();
        double d2 = this.B - this.y.method_23321();
        return Math.abs(d2) > (double)1.0E-5f || Math.abs(d) > (double)1.0E-5f ? Optional.of(Float.valueOf((float)(class04995.u((double)d2, (double)d) * 57.2957763671875) - 90.0f)) : Optional.empty();
    }

    public double i() {
        return this.R;
    }

    public boolean u() {
        return this.i > 0;
    }

    protected void y() {
        if (!this.y.f().U()) {
            this.y.fields_4212a028292fd3c078969e3ee4c71d9e8_2 = Float.valueOf(class04995.L((float)this.y.fields_4212a028292fd3c078969e3ee4c71d9e8_2.floatValue(), (float)this.y.fields_4212a028292fd3c078969e3ee4c71d9e8_0.floatValue(), (float)this.y.NR()));
        }
    }

    public void N(double d, double d2, double d3, float f, float f2) {
        this.R = d;
        this.M = d2;
        this.B = d3;
        this.L = f;
        this.u = f2;
        this.i = 2;
    }

    public void N(double d, double d2, double d3) {
        this.N(d, d2, d3, this.y.NB(), this.y.Ni());
    }

    public void N(class07049 class070492, float f, float f2) {
        this.N(class070492.method_23317(), class070492.method_23320(), class070492.method_23321(), f, f2);
    }

    public void N(class07049 class070492) {
        this.N(class070492.method_23317(), class070492.method_23320(), class070492.method_23321());
    }

    public void N() {
        if (this.L()) {
            this.y.method_36457(0.0f);
        }
        if (this.i > 0) {
            --this.i;
            this.Z().ifPresent(f -> {
                this.y.fields_4212a028292fd3c078969e3ee4c71d9e8_2 = Float.valueOf(this.N(this.y.fields_4212a028292fd3c078969e3ee4c71d9e8_2.floatValue(), f.floatValue(), this.L));
            });
            this.B().ifPresent(f -> this.y.method_36457(this.N(this.y.method_36455(), f.floatValue(), this.u)));
        } else {
            this.y.fields_4212a028292fd3c078969e3ee4c71d9e8_2 = Float.valueOf(this.N(this.y.fields_4212a028292fd3c078969e3ee4c71d9e8_2.floatValue(), this.y.fields_4212a028292fd3c078969e3ee4c71d9e8_0.floatValue(), 10.0f));
        }
        this.y();
    }

    public void N(class06889 class068892) {
        this.N(class068892.M, class068892.B, class068892.Z);
    }

    public double R() {
        return this.M;
    }
}

