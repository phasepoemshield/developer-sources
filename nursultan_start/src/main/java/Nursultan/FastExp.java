/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class11067
 *  Nursultan.class11072
 *  Nursultan.class11080
 *  Nursultan.class11106
 *  Nursultan.class11375
 *  Nursultan.class11504
 *  Nursultan.class11507
 *  Nursultan.class11512
 *  Nursultan.class11524
 *  Nursultan.class11782
 *  Nursultan.class11907
 *  minecraft.class04453
 *  minecraft.class06202
 *  minecraft.class06570
 */
package Nursultan;

import Nursultan.class11067;
import Nursultan.class11072;
import Nursultan.class11080;
import Nursultan.class11106;
import Nursultan.class11375;
import Nursultan.class11504;
import Nursultan.class11507;
import Nursultan.class11512;
import Nursultan.class11524;
import Nursultan.class11782;
import Nursultan.class11907;
import minecraft.class04453;
import minecraft.class06202;
import minecraft.class06570;

@class11080(L="FastExp", y=class11072.PLAYER, N=class11106.BASE)
public class FastExp
extends class11067 {
    public Object L_0;
    public Object L_1;

    private void T() {
    }

    public FastExp() {
        this.T();
        this.L_0 = class11524.N((class11512)this, (String)"only-without-pvp", (boolean)true);
        this.L_1 = class11524.N((class11512)this, (String)"delay", (float)1.0f, (float)0.0f, (float)3.0f, (float)1.0f);
    }

    @class11782
    public void N(class11375 class113752) {
        this.T();
        if (((Boolean)((class11507)this.L_0).i()).booleanValue() && class11907.u()) {
            return;
        }
        if (((class04453)((class06202)this.y_0).T_4).method_5998(class113752.i()).B() == class06570.GB) {
            ((class06202)this.y_0).M_4 = ((Float)((class11504)this.L_1).i()).intValue();
        }
    }
}

