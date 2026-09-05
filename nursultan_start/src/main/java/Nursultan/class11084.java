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
 *  minecraft.class04453
 *  minecraft.class04995
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
import minecraft.class04453;
import minecraft.class04995;
import minecraft.class06202;
import minecraft.class06889;
import minecraft.class07049;
import minecraft.class07438;

public class class11084
extends class11079 {
    public class11084(AttackAura attackAura, String string, boolean bl) {
        super(attackAura, string, bl);
    }

    private float N(float f, float f2) {
        return (float)((double)f2 * Math.tanh(f / f2));
    }

    @Override
    public class06889 N(class07438 class074382, double d) {
        return class11895.N((class07049)class074382, (class11499)class11505.N(), (double)d);
    }

    @Override
    public class11499 N(class07438 class074382, boolean bl, double d) {
        if (((class11799)((class03443)((class06202)this.y_0).T_2)).N() == 1) {
            return class11505.N();
        }
        class11499 class114992 = class11505.N((class11499)class11505.N(), (class06889)this.N(class074382, d));
        int n = ((class04453)((class06202)this.y_0).T_4).field_6012;
        float f = bl ? class114992.y() + class11908.y((float)2.0f) : this.N(class114992.y(), class11908.y((float)40.0f, (float)60.0f)) + (class04995.m((double)n) * 10.0f + class11908.y((float)2.5f));
        float f2 = this.N(class114992.R(), 8.0f) + (class04995.P((double)n) * 4.0f + class11908.y((float)1.0f));
        return class11505.N().N(f, f2).u(true);
    }
}

