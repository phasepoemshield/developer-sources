/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.AttackAura
 *  Nursultan.class09331
 *  Nursultan.class10992
 *  Nursultan.class11355
 *  minecraft.class00500
 *  minecraft.class00624
 *  minecraft.class00650
 *  minecraft.class00730
 *  minecraft.class00737
 *  minecraft.class00860
 *  minecraft.class00891
 *  minecraft.class01312
 *  minecraft.class04453
 *  minecraft.class06202
 *  minecraft.class06999
 *  minecraft.class07007
 *  minecraft.class07209
 *  minecraft.class07746
 *  minecraft.class08434
 */
package Nursultan;

import Nursultan.AttackAura;
import Nursultan.class09331;
import Nursultan.class10992;
import Nursultan.class11110;
import Nursultan.class11355;
import minecraft.class00500;
import minecraft.class00624;
import minecraft.class00650;
import minecraft.class00730;
import minecraft.class00737;
import minecraft.class00860;
import minecraft.class00891;
import minecraft.class01312;
import minecraft.class04453;
import minecraft.class06202;
import minecraft.class06999;
import minecraft.class07007;
import minecraft.class07209;
import minecraft.class07746;
import minecraft.class08434;

public class class11121
extends class11110 {
    public Object y_0;
    public boolean y_init;

    private void L() {
        if (!this.y_init) {
            this.y_init = true;
            this.y_0 = false;
        }
    }

    public class11121(AttackAura attackAura, String string, boolean bl) {
        super(attackAura, string, bl, false);
        this.L();
    }

    @Override
    public void y(Object object) {
        this.L();
        if (object instanceof class10992) {
            this.y_0 = true;
        } else if (object instanceof class11355) {
            this.y_0 = false;
        } else if (object instanceof class09331) {
            class09331 class093312 = (class09331)object;
            if (((Boolean)this.y_0).booleanValue() && this.N(class093312.u(), class093312.L())) {
                class093312.N();
            }
        }
    }

    private boolean N(class00500 class005002, class07209 class072092) {
        class07209 class072093 = class07209.method_49638((class00737)((class04453)((class06202)this.N_0).T_4).method_33571());
        if (class072093.equals((Object)class072092) || ((class04453)((class06202)this.N_0).T_4).method_41328(class01312.field_18079) && class072093.method_10084().equals((Object)class072092)) {
            return true;
        }
        class00891 class008912 = class005002.i();
        return class008912 instanceof class07746 || class008912 instanceof class07007 || class008912 instanceof class06999 || class008912 instanceof class00730 || class008912 instanceof class00860 || class008912 instanceof class08434 || class008912 instanceof class00650 || class008912 instanceof class00624;
    }
}

