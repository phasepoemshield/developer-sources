/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00494
 *  minecraft.class00500
 *  minecraft.class01210
 *  minecraft.class02119
 *  minecraft.class04425
 *  minecraft.class04995
 *  minecraft.class05298
 *  minecraft.class07079
 *  minecraft.class07185
 *  minecraft.class07209
 *  minecraft.class07290
 *  minecraft.class07623
 *  minecraft.class08701
 */
package minecraft;

import minecraft.class00494;
import minecraft.class00500;
import minecraft.class01210;
import minecraft.class02119;
import minecraft.class04425;
import minecraft.class04995;
import minecraft.class05298;
import minecraft.class07079;
import minecraft.class07185;
import minecraft.class07209;
import minecraft.class07290;
import minecraft.class07435;
import minecraft.class07623;
import minecraft.class08701;

public class class07458
implements class08701 {
    public static final float y = 5.0E-4f;
    public static final float L = 2.5000003E-7f;
    protected static final int u = 90;
    protected final class07079 i;
    protected double R;
    protected double M;
    protected double B;
    protected double Z;
    protected float z;
    protected float U;
    protected class07435 E = class07435.field_6377;

    public double L() {
        return this.Z;
    }

    public void M() {
        this.E = class07435.field_6377;
    }

    public class07458(class07079 class070792) {
        this.i = class070792;
    }

    public double i() {
        return this.M;
    }

    public double u() {
        return this.R;
    }

    public boolean y() {
        return this.E == class07435.field_6378;
    }

    private boolean y(float f, float f2) {
        class02119 class021192;
        class07623 class076232 = this.i.f();
        return class076232 == null || (class021192 = class076232.P()) == null || class021192.y(this.i, class07209.method_49637((double)(this.i.method_23317() + (double)f), (double)this.i.method_31478(), (double)(this.i.method_23321() + (double)f2))) == class04425.field_12;
    }

    protected float y(float f, float f2, float f3) {
        float f4;
        float f5 = class04995.R((float)(f2 - f));
        if (f5 > f3) {
            f5 = f3;
        }
        if (f5 < -f3) {
            f5 = -f3;
        }
        if ((f4 = f + f5) < 0.0f) {
            f4 += 360.0f;
        } else if (f4 > 360.0f) {
            f4 -= 360.0f;
        }
        return f4;
    }

    public void N(double d, double d2, double d3, double d4) {
        this.R = d;
        this.M = d2;
        this.B = d3;
        this.Z = d4;
        if (this.E != class07435.field_6379) {
            this.E = class07435.field_6378;
        }
    }

    public void N() {
        if (this.E == class07435.field_6376) {
            float f;
            float f2 = (float)this.i.method_45325(class05298.l);
            float f3 = (float)this.Z * f2;
            float f4 = this.z;
            float f5 = this.U;
            float f6 = class04995.N((float)(f4 * f4 + f5 * f5));
            if (f6 < 1.0f) {
                f6 = 1.0f;
            }
            f6 = f3 / f6;
            float f7 = class04995.m((double)(this.i.method_36454() * ((float)Math.PI / 180)));
            float f8 = class04995.P((double)(this.i.method_36454() * ((float)Math.PI / 180)));
            float f9 = (f4 *= f6) * f8 - (f5 *= f6) * f7;
            if (!this.y(f9, f = f5 * f8 + f4 * f7)) {
                this.z = 1.0f;
                this.U = 0.0f;
            }
            this.i.method_6125(f3);
            this.i.N(this.z);
            this.i.L(this.U);
            this.E = class07435.field_6377;
        } else if (this.E == class07435.field_6378) {
            this.E = class07435.field_6377;
            double d = this.R - this.i.method_23317();
            double d2 = this.B - this.i.method_23321();
            double d3 = this.M - this.i.method_23318();
            double d4 = d * d + d3 * d3 + d2 * d2;
            if (d4 < 2.500000277905201E-7) {
                this.i.N(0.0f);
                return;
            }
            float f = (float)(class04995.u((double)d2, (double)d) * 57.2957763671875) - 90.0f;
            this.i.method_36456(this.y(this.i.method_36454(), f, 90.0f));
            this.i.method_6125((float)(this.Z * this.i.method_45325(class05298.l)));
            class07209 class072092 = this.i.method_24515();
            class00500 class005002 = this.i.method_73183().method_8320(class072092);
            class00494 class004942 = class005002.M((class07290)this.i.method_73183(), class072092);
            if (d3 > (double)this.i.method_49476() && d * d + d2 * d2 < (double)Math.max(1.0f, this.i.method_17681()) || !class004942.method_1110() && this.i.method_23318() < class004942.method_1105(class07185.field_11052) + (double)class072092.method_10264() && !class005002.N(class01210.P) && !class005002.N(class01210.A)) {
                this.i.A().y();
                this.E = class07435.field_6379;
            }
        } else if (this.E == class07435.field_6379) {
            this.i.method_6125((float)(this.Z * this.i.method_45325(class05298.l)));
            if (this.i.method_24828() || this.i.method_52535() && this.i.method_29920()) {
                this.E = class07435.field_6377;
            }
        } else {
            this.i.N(0.0f);
        }
    }

    public void N(float f, float f2) {
        this.E = class07435.field_6376;
        this.z = f;
        this.U = f2;
        this.Z = 0.25;
    }

    public double R() {
        return this.B;
    }
}

