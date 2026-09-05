/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.AttackAura
 *  Nursultan.class11499
 *  Nursultan.class11505
 *  Nursultan.class11799
 *  Nursultan.class11892
 *  Nursultan.class11895
 *  Nursultan.class11908
 *  minecraft.class03443
 *  minecraft.class04453
 *  minecraft.class06202
 *  minecraft.class06889
 *  minecraft.class07049
 *  minecraft.class07113
 *  minecraft.class07438
 */
package Nursultan;

import Nursultan.AttackAura;
import Nursultan.class11079;
import Nursultan.class11499;
import Nursultan.class11505;
import Nursultan.class11799;
import Nursultan.class11892;
import Nursultan.class11895;
import Nursultan.class11908;
import minecraft.class03443;
import minecraft.class04453;
import minecraft.class06202;
import minecraft.class06889;
import minecraft.class07049;
import minecraft.class07113;
import minecraft.class07438;

public class class11103
extends class11079 {
    public Object N_0;
    public boolean N_init;

    public class11103(AttackAura attackAura, String string) {
        super(attackAura, string);
        this.R();
    }

    @Override
    public class06889 N(class07438 class074382, double d) {
        return class11895.N((class07049)class074382, (class11499)class11505.N(), (double)d);
    }

    @Override
    public class11499 N(class07438 class074382, boolean bl, double d) {
        float f;
        class11499 class114992;
        this.R();
        if (this.N(bl)) {
            this.N_0 = true;
            return class11505.L();
        }
        if (bl && (class114992 = class11892.N((class07049)((class04453)((class06202)this.y_0).T_4), (class11499)class11505.N(), (double)d, (boolean)true, class070492 -> class070492 == class074382)) != null && class114992.N() == class07113.field_1331) {
            this.N_0 = false;
            return class11505.L();
        }
        class114992 = class11505.N((class11499)class11505.N(), (class06889)this.N(class074382, d));
        float f2 = (Boolean)this.N_0 != false ? class11908.y((float)7.0f, (float)13.0f) : 0.0f;
        float f3 = f = bl ? class114992.y() : f2;
        float f4 = bl ? class114992.R() : (((class04453)((class06202)this.y_0).T_4).method_36455() > 0.0f ? -f2 : f2);
        return class11505.N().N(f, f4).N(true);
    }

    public boolean N(boolean bl) {
        return ((class11799)((class03443)((class06202)this.y_0).T_2)).N() > 1 && !bl;
    }

    private void R() {
        if (!this.N_init) {
            this.N_init = true;
            this.N_0 = false;
        }
    }
}

