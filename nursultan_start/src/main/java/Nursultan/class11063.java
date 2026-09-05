/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.AttackAura
 *  Nursultan.class11535
 *  Nursultan.class11938
 *  minecraft.class00734
 *  minecraft.class03448
 *  minecraft.class04453
 *  minecraft.class06202
 *  minecraft.class06889
 *  minecraft.class07047
 *  minecraft.class07049
 *  minecraft.class07438
 */
package Nursultan;

import Nursultan.AttackAura;
import Nursultan.class11087;
import Nursultan.class11535;
import Nursultan.class11938;
import minecraft.class00734;
import minecraft.class03448;
import minecraft.class04453;
import minecraft.class06202;
import minecraft.class06889;
import minecraft.class07047;
import minecraft.class07049;
import minecraft.class07438;

public class class11063 {
    public static Object N_0;
    public static Object N_1;
    public static Object N_2;

    private static void L() {
        N_0 = -0.008;
        N_1 = Float.valueOf(0.018f);
        N_2 = Float.valueOf(0.08f);
    }

    class11063() {
    }

    static {
        class11063.L();
    }

    private boolean N(boolean bl, float f, double d) {
        return !bl && d < -0.008 && f + 0.018f >= 0.08f;
    }

    public boolean N(class11087 class110872, class07438 class074382) {
        AttackAura attackAura = class11938.u().C();
        if (attackAura == null || ((class11535)attackAura.B_3).U()) {
            return true;
        }
        if ((class04453)((class06202)class11087.N_0).T_4 == null || (class03448)((class06202)class11087.N_0).T_3 == null || class074382 == null || this.R()) {
            return false;
        }
        return this.N(false, (float)((class04453)((class06202)class11087.N_0).T_4).field_6017, ((class04453)((class06202)class11087.N_0).T_4).method_18798().B) || this.N();
    }

    private boolean N() {
        class06889 class068892 = ((class04453)((class06202)class11087.N_0).T_4).method_18798();
        if (class068892.B >= -0.008) {
            return false;
        }
        class00734 class007342 = ((class04453)((class06202)class11087.N_0).T_4).method_5829();
        float f = (float)((class04453)((class06202)class11087.N_0).T_4).field_6017;
        double d = class068892.B;
        for (int i = 0; i < 2; ++i) {
            if (!((class03448)((class06202)class11087.N_0).T_3).method_8600((class07049)((class04453)((class06202)class11087.N_0).T_4), class007342 = class007342.u(0.0, d - 0.001, 0.0)).iterator().hasNext()) {
                return false;
            }
            if (this.N(false, f += (float)Math.max(0.0, -d), d)) {
                return true;
            }
            d = (d - 0.08) * 0.98;
        }
        return false;
    }

    private boolean R() {
        return ((class04453)((class06202)class11087.N_0).T_4).method_6101() || ((class04453)((class06202)class11087.N_0).T_4).method_5799() || ((class04453)((class06202)class11087.N_0).T_4).method_5681() || ((class04453)((class06202)class11087.N_0).T_4).method_5771() || ((class04453)((class06202)class11087.N_0).T_4).method_5765() || ((class04453)((class06202)class11087.N_0).T_4).field_17046 != class06889.L || ((class04453)((class06202)class11087.N_0).T_4).method_6059(class07047.d) || ((class04453)((class06202)class11087.N_0).T_4).method_6059(class07047.P);
    }
}

