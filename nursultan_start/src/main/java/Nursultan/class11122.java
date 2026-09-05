/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.AttackAura
 *  Nursultan.class09164
 *  Nursultan.class11385
 *  Nursultan.class11499
 *  Nursultan.class11505
 *  Nursultan.class11902
 *  minecraft.class06889
 *  minecraft.class07438
 */
package Nursultan;

import Nursultan.AttackAura;
import Nursultan.class09164;
import Nursultan.class11385;
import Nursultan.class11499;
import Nursultan.class11505;
import Nursultan.class11902;
import minecraft.class06889;
import minecraft.class07438;

public class class11122
extends class09164 {
    public class11122(AttackAura attackAura, String string, boolean bl) {
        super(attackAura, true, string, bl);
    }

    public void y(Object object) {
        if (object instanceof class11385) {
            class11385 class113852 = (class11385)object;
            if (((AttackAura)this.y_0).s()) {
                this.N(class113852);
            }
        }
    }

    public boolean N(class07438 class074382) {
        return true;
    }

    public void N(class11385 class113852) {
        class07438 class074382 = ((AttackAura)this.y_0).v();
        if (!this.N(class074382)) {
            return;
        }
        class11499 class114992 = class11505.N((class06889)class074382.method_66233().method_66265());
        class11902.y((class11385)class113852);
        class113852.B(true);
        class11902.N((class11385)class113852, (float)class114992.y());
    }
}

