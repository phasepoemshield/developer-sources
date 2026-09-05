/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00869
 *  minecraft.class04995
 *  minecraft.class06139
 *  minecraft.class06165
 *  minecraft.class06889
 *  minecraft.class07049
 *  minecraft.class07299
 *  minecraft.class07438
 */
package minecraft;

import minecraft.class00869;
import minecraft.class04995;
import minecraft.class06139;
import minecraft.class06165;
import minecraft.class06889;
import minecraft.class07049;
import minecraft.class07299;
import minecraft.class07438;

public class class01287
extends class06139 {
    final /* synthetic */ class06165 N;

    public void L() {
        this.N.method_6100(true);
        this.N.z(true);
        this.N.E(false);
        class07438 class074382 = this.N.T();
        if (class074382 != null) {
            this.N.p().N((class07049)class074382, 60.0f, 30.0f);
            class06889 class068892 = new class06889(class074382.method_23317() - this.N.method_23317(), class074382.method_23318() - this.N.method_23318(), class074382.method_23321() - this.N.method_23321()).u();
            this.N.method_18799(this.N.method_18798().y(class068892.M * 0.8, 0.9, class068892.Z * 0.8));
        }
        this.N.f().W();
    }

    public class01287(class06165 class061652) {
        this.N = class061652;
    }

    public void i() {
        class07438 class074382 = this.N.T();
        if (class074382 != null) {
            this.N.p().N((class07049)class074382, 60.0f, 30.0f);
        }
        if (!this.N.n()) {
            class06889 class068892 = this.N.method_18798();
            if (class068892.B * class068892.B < (double)0.03f && this.N.method_36455() != 0.0f) {
                this.N.method_36457(class04995.Z((float)0.2f, (float)this.N.method_36455(), (float)0.0f));
            } else {
                double d = class068892.Z();
                double d2 = Math.signum(-class068892.B) * Math.acos(d / class068892.M()) * 57.2957763671875;
                this.N.method_36457((float)d2);
            }
        }
        if (class074382 != null && this.N.method_5739((class07049)class074382) <= 2.0f) {
            this.N.method_6121(class01287.N_18((class07299)this.N.method_73183()), (class07049)class074382);
        } else if (this.N.method_36455() > 0.0f && this.N.method_24828() && (float)this.N.method_18798().B != 0.0f && this.N.method_73183().method_8320(this.N.method_24515()).N(class00869.is)) {
            this.N.method_36457(60.0f);
            this.N.y(null);
            this.N.M(true);
        }
    }

    public void u() {
        this.N.U(false);
        this.N.R = 0.0f;
        this.N.M = 0.0f;
        this.N.E(false);
        this.N.z(false);
    }

    public boolean y() {
        class07438 class074382 = this.N.T();
        if (class074382 == null || !class074382.method_5805()) {
            return false;
        }
        double d = this.N.method_18798().B;
        return !(d * d < (double)0.05f && Math.abs(this.N.method_36455()) < 15.0f && this.N.method_24828() || this.N.n());
    }

    public boolean N() {
        if (!this.N.l()) {
            return false;
        }
        class07438 class074382 = this.N.T();
        if (class074382 == null || !class074382.method_5805()) {
            return false;
        }
        if (class074382.method_5755() != class074382.method_5735()) {
            return false;
        }
        boolean bl = class06165.N((class06165)this.N, (class07438)class074382);
        if (!bl) {
            this.N.f().N((class07049)class074382, 0);
            this.N.U(false);
            this.N.E(false);
        }
        return bl;
    }

    public boolean O_() {
        return false;
    }
}

