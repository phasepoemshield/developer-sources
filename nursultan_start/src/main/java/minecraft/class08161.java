/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class02484
 *  minecraft.class05456
 *  minecraft.class06889
 *  minecraft.class07049
 *  minecraft.class07050
 *  minecraft.class07079
 *  minecraft.class07150
 *  minecraft.class07430
 *  minecraft.class07438
 *  minecraft.class07473
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.util.EnumSet;
import java.util.Optional;
import minecraft.class02484;
import minecraft.class05456;
import minecraft.class06889;
import minecraft.class07049;
import minecraft.class07050;
import minecraft.class07079;
import minecraft.class07150;
import minecraft.class07430;
import minecraft.class07438;
import minecraft.class07473;
import minecraft.class08174;
import minecraft.class08177;
import org.jspecify.annotations.Nullable;

public class class08161<T extends class07150>
extends class07473 {
    static final int N = 6;
    static final int y = 7;
    static final int L = 9;
    static final int u = 11;
    static final double i = class08161.y((int)100);
    private final T z;
    private @Nullable class08177 U;
    double R;
    double M;
    float B;
    float Z;

    public void L() {
        super.L();
        this.z.R(true);
        this.U = new class08177();
    }

    private boolean M() {
        return this.z.T() != null && this.z.method_6047().L(class02484.X);
    }

    public class08161(T t, double d, double d2, float f, float f2) {
        this.z = t;
        this.R = d;
        this.M = d2;
        this.B = f * f;
        this.Z = f2 * f2;
        this.N_71(EnumSet.of(class07430.field_18405, class07430.field_18406));
    }

    private int Z() {
        return class08161.y((int)Optional.ofNullable((class08174)((Object)this.z.method_6047().method_58694(class02484.X))).map(class08174::N).orElse(0));
    }

    public void i() {
        double d;
        if (this.U == null) {
            return;
        }
        class07438 class074382 = this.z.T();
        double d2 = this.z.method_5649(class074382.method_23317(), class074382.method_23318(), class074382.method_23321());
        class07049 class070492 = this.z.method_5668();
        float f = 1.0f;
        if (class070492 instanceof class07079) {
            class07079 class070792 = (class07079)class070492;
            f = class070792.K_();
        }
        int n = this.z.method_5765() ? 2 : 0;
        this.z.N((class07049)class074382, 30.0f, 30.0f);
        this.z.p().N((class07049)class074382, 30.0f, 30.0f);
        if (this.U.N()) {
            if (d2 > (double)this.B) {
                this.z.f().N((class07049)class074382, (double)f * this.M);
                return;
            }
            this.U.N(this.Z());
            this.z.method_6019(class07050.field_5808);
        }
        if (this.U.y()) {
            this.z.method_6021();
            d = Math.sqrt(d2);
            this.U.y = class05456.N(this.z, (double)Math.max(0.0, (double)(9 + n) - d), (double)Math.max(1.0, (double)(11 + n) - d), (int)7, (class06889)class074382.method_73189());
            this.U.N = 1;
        }
        if (this.U.L()) {
            return;
        }
        if (this.U.y != null) {
            this.z.f().N(this.U.y.M, this.U.y.B, this.U.y.Z, (double)f * this.M);
            if (this.z.f().U()) {
                if (this.U.N > 0) {
                    this.U.L = true;
                    return;
                }
                this.U.y = null;
            }
        } else {
            this.z.f().N((class07049)class074382, (double)f * this.R);
            if (d2 < (double)this.Z || this.z.f().U()) {
                d = Math.sqrt(d2);
                this.U.y = class05456.N(this.z, (double)((double)(6 + n) - d), (double)((double)(7 + n) - d), (int)7, (class06889)class074382.method_73189());
            }
        }
    }

    public void u() {
        super.u();
        this.z.f().W();
        this.z.R(false);
        this.U = null;
        this.z.method_6021();
    }

    public boolean y() {
        return this.U != null && !this.U.L && this.M();
    }

    public boolean N() {
        return this.M() && !this.z.method_6115();
    }
}

