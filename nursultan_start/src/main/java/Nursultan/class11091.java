/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.AttackAura
 *  Nursultan.class11499
 *  Nursultan.class11505
 *  Nursultan.class11895
 *  Nursultan.class11908
 *  minecraft.class06889
 *  minecraft.class07049
 *  minecraft.class07438
 */
package Nursultan;

import Nursultan.AttackAura;
import Nursultan.class11079;
import Nursultan.class11499;
import Nursultan.class11505;
import Nursultan.class11895;
import Nursultan.class11908;
import minecraft.class06889;
import minecraft.class07049;
import minecraft.class07438;

public class class11091
extends class11079 {
    public Object N_0;
    public boolean N_init;

    public class11091(AttackAura attackAura, String string) {
        super(attackAura, string);
        this.W();
    }

    @Override
    public class06889 N(class07438 class074382, double d) {
        return class11895.N((class07049)class074382, (class11499)class11505.N(), (boolean)true, (double)((AttackAura)this.y_1).m());
    }

    @Override
    public class11499 N(class07438 class074382, boolean bl, double d) {
        this.W();
        if ((Integer)this.N_0 > 0) {
            this.N_0 = (Integer)this.N_0 - 1;
        }
        if (bl) {
            this.N_0 = 2;
        }
        if ((Integer)this.N_0 == 0) {
            return class11505.L();
        }
        class11499 class114992 = class11505.N();
        class06889 class068892 = this.N(class074382, d);
        class11499 class114993 = class11505.N((class11499)class114992, (class06889)class068892);
        float f = class114993.y();
        float f2 = class114993.R();
        float f3 = (float)Math.hypot(Math.abs(f), Math.abs(f2));
        float f4 = Math.abs(f / f3) * 360.0f;
        float f5 = Math.abs(f2 / f3) * 360.0f;
        return new class11499(class114992.y() + Math.min(Math.max(f, -f4), f4) + class11908.y((float)0.6f), class114992.R() + Math.min(Math.max(f2, -f5), f5) + class11908.y((float)0.3f)).u(true).N(true);
    }

    private void W() {
        if (!this.N_init) {
            this.N_init = true;
            this.N_0 = 0;
        }
    }
}

