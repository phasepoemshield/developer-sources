/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.AttackAura
 *  Nursultan.class11499
 *  Nursultan.class11505
 *  Nursultan.class11799
 *  Nursultan.class11895
 *  Nursultan.class11908
 *  minecraft.class03443
 *  minecraft.class06202
 *  minecraft.class06889
 *  minecraft.class07049
 *  minecraft.class07438
 */
package Nursultan;

import Nursultan.AttackAura;
import Nursultan.class11079;
import Nursultan.class11499;
import Nursultan.class11505;
import Nursultan.class11799;
import Nursultan.class11895;
import Nursultan.class11908;
import minecraft.class03443;
import minecraft.class06202;
import minecraft.class06889;
import minecraft.class07049;
import minecraft.class07438;

public class class11071
extends class11079 {
    public class11071(AttackAura attackAura, String string) {
        super(attackAura, string);
    }

    public float i() {
        return 1.0f;
    }

    @Override
    public class11499 N(class07438 class074382, boolean bl, double d) {
        if (((class11799)((class03443)((class06202)this.y_0).T_2)).N() == 1) {
            return class11505.N();
        }
        class11499 class114992 = class11505.N((class11499)class11505.N(), (class06889)this.N(class074382, d));
        float f = this.N(class114992.y(), 45.0f) + (bl ? 0.0f : class11908.y((float)this.R()));
        float f2 = this.N(class114992.R(), 5.0f) + (bl ? 0.0f : class11908.y((float)this.i()));
        return class11505.N().N(f, f2).N(true).u(true);
    }

    private float N(float f, float f2) {
        return (float)((double)f2 * Math.tanh(f / f2));
    }

    @Override
    public class06889 N(class07438 class074382, double d) {
        return class11895.N((class07049)class074382, (class11499)class11505.N(), (double)d);
    }

    public float R() {
        return 5.0f;
    }
}

