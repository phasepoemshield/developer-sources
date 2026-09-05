/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00500
 *  minecraft.class00869
 *  minecraft.class01226
 *  minecraft.class02131
 *  minecraft.class02154
 *  minecraft.class03289
 *  minecraft.class04293
 *  minecraft.class04383
 *  minecraft.class04782
 *  minecraft.class05659
 *  minecraft.class06570
 *  minecraft.class06581
 *  minecraft.class06584
 *  minecraft.class06889
 *  minecraft.class07050
 *  minecraft.class07078
 *  minecraft.class07082
 *  minecraft.class07107
 *  minecraft.class07126
 *  minecraft.class07211
 *  minecraft.class07299
 *  minecraft.class07310
 *  minecraft.class07438
 *  minecraft.class08036
 *  minecraft.class08092
 *  minecraft.class08299
 *  minecraft.class08329
 */
package minecraft;

import minecraft.class00500;
import minecraft.class00869;
import minecraft.class01226;
import minecraft.class02131;
import minecraft.class02154;
import minecraft.class03289;
import minecraft.class04293;
import minecraft.class04383;
import minecraft.class04782;
import minecraft.class05659;
import minecraft.class06570;
import minecraft.class06581;
import minecraft.class06584;
import minecraft.class06889;
import minecraft.class07050;
import minecraft.class07078;
import minecraft.class07082;
import minecraft.class07107;
import minecraft.class07126;
import minecraft.class07211;
import minecraft.class07299;
import minecraft.class07310;
import minecraft.class07438;
import minecraft.class07504;
import minecraft.class08036;
import minecraft.class08092;
import minecraft.class08299;
import minecraft.class08329;

public class class07494
extends class07504 {
    private static final class02131<Boolean> L = class03289.N(class07494.class, (class04383)class02154.U);
    private static final int u = 3600;
    private static final int B = 32000;
    private static final short Z = 0;
    private static final class06889 z = class06889.L;
    private int U = 0;
    public class06889 y = z;

    protected void L(boolean bl) {
        this.field_6011.N(L, (Object)bl);
    }

    @Override
    public boolean P() {
        return true;
    }

    @Override
    public class06584 method_31480() {
        return new class06584((class07310)class06570.sU);
    }

    @Override
    protected void method_5693(class04293 class042932) {
        super.method_5693(class042932);
        class042932.N(L, (Object)false);
    }

    @Override
    public void method_5773() {
        super.method_5773();
        if (!this.method_73183().method_8608()) {
            if (this.U > 0) {
                --this.U;
            }
            if (this.U <= 0) {
                this.y = class06889.L;
            }
            this.L(this.U > 0);
        }
        if (this.U() && this.field_5974.y(4) == 0) {
            this.method_73183().method_8406((class07126)class07107.Ny, this.method_23317(), this.method_23318() + 0.8, this.method_23321(), 0.0, 0.0, 0.0);
        }
    }

    @Override
    protected void method_5652(class08329 class083292) {
        super.method_5652(class083292);
        class083292.N("PushX", this.y.M);
        class083292.N("PushZ", this.y.Z);
        class083292.N("Fuel", (short)this.U);
    }

    public class07082 method_5688(class08036 class080362, class07050 class070502) {
        class06584 class065842 = class080362.method_5998(class070502);
        if (this.N(class080362.method_73189(), class065842)) {
            class065842.N(1, (class07438)class080362);
        }
        return class07082.N;
    }

    @Override
    protected void method_5749(class08299 class082992) {
        super.method_5749(class082992);
        double d = class082992.N("PushX", class07494.z.M);
        double d2 = class082992.N("PushZ", class07494.z.Z);
        this.y = new class06889(d, 0.0, d2);
        this.U = class082992.N("Fuel", (short)0);
    }

    public class07494(class07078<? extends class07494> class070782, class07299 class072992) {
        super(class070782, class072992);
    }

    protected boolean U() {
        return (Boolean)this.field_6011.N(L);
    }

    protected class06581 z() {
        return class06570.sU;
    }

    private class06889 y(class06889 class068892) {
        double d = 1.0E-4;
        double d2 = 0.001;
        if (this.y.z() > 1.0E-4 && class068892.z() > 0.001) {
            return this.y.Z(class068892).u().L(this.y.M());
        }
        return this.y;
    }

    @Override
    protected double N_73(class04782 class047822) {
        return this.method_5799() ? super.N_73(class047822) * 0.75 : super.N_73(class047822) * 0.5;
    }

    @Override
    protected class06889 N(class06889 class068892) {
        class06889 class068893;
        if (this.y.B() > 1.0E-7) {
            this.y = this.y(class068892);
            class068893 = class068892.u(0.8, 0.0, 0.8).i(this.y);
            if (this.method_5799()) {
                class068893 = class068893.L(0.1);
            }
        } else {
            class068893 = class068892.u(0.98, 0.0, 0.98);
        }
        return super.N(class068893);
    }

    public boolean N(class06889 class068892, class06584 class065842) {
        if (class065842.N(class01226.LU) && this.U + 3600 <= 32000) {
            this.U += 3600;
        } else {
            return false;
        }
        if (this.U > 0) {
            this.y = this.method_73189().u(class068892).R();
        }
        return true;
    }

    @Override
    public class00500 R() {
        return (class00500)((class00500)class00869.uN.W().y((class08092)class05659.N, (Comparable)class07211.field_11043)).y((class08092)class05659.y, (Comparable)Boolean.valueOf(this.U()));
    }
}

