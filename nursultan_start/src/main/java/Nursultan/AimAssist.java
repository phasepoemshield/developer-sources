/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10992
 *  Nursultan.class11067
 *  Nursultan.class11072
 *  Nursultan.class11080
 *  Nursultan.class11106
 *  Nursultan.class11302
 *  Nursultan.class11382
 *  Nursultan.class11384
 *  Nursultan.class11499
 *  Nursultan.class11504
 *  Nursultan.class11505
 *  Nursultan.class11512
 *  Nursultan.class11524
 *  Nursultan.class11782
 *  Nursultan.class11791
 *  Nursultan.class11892
 *  Nursultan.class11895
 *  minecraft.class00734
 *  minecraft.class03448
 *  minecraft.class04453
 *  minecraft.class04995
 *  minecraft.class05835
 *  minecraft.class05849
 *  minecraft.class06202
 *  minecraft.class06889
 *  minecraft.class07049
 *  minecraft.class07438
 */
package Nursultan;

import Nursultan.TargetEsp;
import Nursultan.class10992;
import Nursultan.class11067;
import Nursultan.class11072;
import Nursultan.class11080;
import Nursultan.class11106;
import Nursultan.class11302;
import Nursultan.class11382;
import Nursultan.class11384;
import Nursultan.class11499;
import Nursultan.class11504;
import Nursultan.class11505;
import Nursultan.class11512;
import Nursultan.class11524;
import Nursultan.class11782;
import Nursultan.class11791;
import Nursultan.class11892;
import Nursultan.class11895;
import minecraft.class00734;
import minecraft.class03448;
import minecraft.class04453;
import minecraft.class04995;
import minecraft.class05835;
import minecraft.class05849;
import minecraft.class06202;
import minecraft.class06889;
import minecraft.class07049;
import minecraft.class07438;

@class11080(L="AimAssist", y=class11072.COMBAT, N=class11106.FIGHTING)
public class AimAssist
extends class11067 {
    public Object L_0;
    public Object L_1;
    public Object L_2;
    public Object L_3;
    public Object L_4;
    public Object L_5;
    public Object L_6;
    public Object L_7;
    public boolean L_init;
    public static Object u_0;
    public static Object u_1;

    private static void T() {
        u_0 = 0.008333333333333333;
        u_1 = 0.05;
    }

    public AimAssist() {
        this.v();
        this.L_0 = class11524.N((class11512)this, (String)"fov", (float)180.0f, (float)1.0f, (float)180.0f, (float)1.0f);
        this.L_1 = class11524.N((class11512)this, (String)"aim-range", (float)4.0f, (float)0.1f, (float)10.0f, (float)0.1f);
        this.L_2 = class11524.N((class11512)this, (String)"speed", (float)4.0f, (float)0.1f, (float)10.0f, (float)0.1f);
    }

    static {
        AimAssist.T();
    }

    private void v() {
        if (!this.L_init) {
            this.L_init = true;
            this.L_3 = 0;
            this.L_5 = 0L;
            this.L_6 = 0.0;
            this.L_7 = 0.0;
        }
    }

    public void y() {
        this.v();
        this.L_3 = 0;
        this.L_4 = null;
        this.L_5 = 0L;
        this.L_6 = 0.0;
        this.L_7 = 0.0;
        super.y();
    }

    private boolean y(class07438 class074382) {
        this.v();
        if (!class074382.method_5805()) {
            return false;
        }
        if (class11791.u().test(class074382)) {
            return false;
        }
        if (class11895.N((class07049)class074382, (boolean)true, (double)((class04453)((class06202)this.y_0).T_4).method_55755()).R(((class04453)((class06202)this.y_0).T_4).method_33571()) > (double)((Float)((class11504)this.L_1).i()).floatValue()) {
            return false;
        }
        return this.N(class074382);
    }

    @class11782
    public void N(class10992 class109922) {
        this.v();
        this.N(((class03448)((class06202)this.y_0).T_3).method_8469(((Integer)this.L_3).intValue()));
    }

    private void N(class07049 class070492) {
        this.v();
        if (!(class070492 instanceof class07438)) {
            this.L_4 = null;
            return;
        }
        class07438 class074382 = (class07438)class070492;
        if (!this.y(class074382)) {
            this.L_4 = null;
            return;
        }
        class11499 class114992 = class11505.N();
        TargetEsp.N(class074382, 15);
        if (class11892.N((class11499)class114992, (double)((Float)((class11504)this.L_1).i()).floatValue(), (class00734)class074382.method_5829().B(0.2))) {
            class06889 class068892 = class11895.N((class07049)class074382, (class11499)class114992, (boolean)true, (double)((class04453)((class06202)this.y_0).T_4).method_55755(), class007342 -> class007342.B(0.21));
            if (!class11892.N((class06889)((class04453)((class06202)this.y_0).T_4).method_33571(), (class06889)class068892, (class05849)class05849.field_17559, (class05835)class05835.field_1348)) {
                this.L_4 = null;
                return;
            }
            this.L_4 = class11505.N((class06889)class068892);
            return;
        }
        this.L_4 = null;
    }

    @class11782
    public void N(class11382 class113822) {
        this.v();
        this.L_3 = class113822.L().method_5628();
    }

    @class11782
    public void N(class11384 class113842) {
        float f;
        this.v();
        if ((class11499)this.L_4 == null) {
            this.L_5 = 0L;
            this.L_6 = 0.0;
            this.L_7 = 0.0;
            return;
        }
        long l = System.nanoTime();
        double d = (Long)this.L_5 == 0L ? 0.008333333333333333 : (double)(l - (Long)this.L_5) / 1.0E9;
        this.L_5 = l;
        double d2 = class04995.N((double)d, (double)0.0, (double)0.05) / 0.008333333333333333;
        class11499 class114992 = class11505.N();
        float f2 = class114992.R() - ((class11499)this.L_4).R();
        double d3 = Math.hypot(f2, f = class04995.R((float)(class114992.y() - ((class11499)this.L_4).y())));
        if (d3 < 1.0) {
            this.L_6 = 0.0;
            this.L_7 = 0.0;
            return;
        }
        if (class113842.u() == 0.0 && class113842.L() == 0.0 && d3 > 5.0) {
            this.L_6 = 0.0;
            this.L_7 = 0.0;
            return;
        }
        double d4 = class04995.u((double)f2, (double)f) * 57.2957763671875 - 90.0;
        double d5 = (double)((Float)((class11504)this.L_2).i()).floatValue() * Math.max(0.5, Math.min(d3, 10.0) * (double)0.1f) * d2;
        double d6 = Math.min(d5, (double)Math.abs(f));
        double d7 = Math.min(d5, (double)Math.abs(f2));
        this.L_6 = (Double)this.L_6 + Math.sin(d4 * 0.01745329238474369) * d6;
        this.L_7 = (Double)this.L_7 + -Math.cos(d4 * 0.01745329238474369) * d7;
        double d8 = Math.round((Double)this.L_6);
        double d9 = Math.round((Double)this.L_7);
        this.L_6 = (Double)this.L_6 - d8;
        this.L_7 = (Double)this.L_7 - d9;
        double d10 = class11302.N((double)class113842.u());
        double d11 = class11302.N((double)class113842.L());
        class113842.N(class11302.y((double)(d10 + d8)));
        class113842.y(class11302.y((double)(d11 + d9)));
    }

    public boolean N(class07438 class074382) {
        this.v();
        if (((Float)((class11504)this.L_0).i()).floatValue() == 180.0f) {
            return true;
        }
        class11499 class114992 = class11505.L();
        return !class11892.N((class11499)class114992, (double)((class04453)((class06202)this.y_0).T_4).method_55755(), (class07049)class074382) || class114992.N(class11895.N((class07049)class074382, (class11499)class114992, (boolean)false, (double)((class04453)((class06202)this.y_0).T_4).method_55755())) < ((Float)((class11504)this.L_0).i()).floatValue();
    }
}

