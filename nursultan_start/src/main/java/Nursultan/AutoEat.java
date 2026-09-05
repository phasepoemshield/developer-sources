/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10950
 *  Nursultan.class11067
 *  Nursultan.class11072
 *  Nursultan.class11080
 *  Nursultan.class11106
 *  Nursultan.class11380
 *  Nursultan.class11504
 *  Nursultan.class11512
 *  Nursultan.class11524
 *  Nursultan.class11782
 *  Nursultan.class11907
 *  Nursultan.class11929
 *  Nursultan.class11938
 *  minecraft.class03443
 *  minecraft.class03448
 *  minecraft.class04453
 *  minecraft.class06202
 *  minecraft.class06584
 *  minecraft.class07050
 */
package Nursultan;

import Nursultan.class10950;
import Nursultan.class11067;
import Nursultan.class11072;
import Nursultan.class11080;
import Nursultan.class11106;
import Nursultan.class11380;
import Nursultan.class11504;
import Nursultan.class11512;
import Nursultan.class11524;
import Nursultan.class11782;
import Nursultan.class11907;
import Nursultan.class11929;
import Nursultan.class11938;
import minecraft.class03443;
import minecraft.class03448;
import minecraft.class04453;
import minecraft.class06202;
import minecraft.class06584;
import minecraft.class07050;

@class11080(L="AutoEat", y=class11072.PLAYER, N=class11106.AUTO)
public class AutoEat
extends class11067 {
    public Object L_0;
    public Object L_1;
    public boolean L_init;

    private boolean T() {
        this.j();
        return (float)((class04453)((class06202)this.y_0).T_4).method_7344().N() < ((Float)((class11504)this.L_0).i()).floatValue();
    }

    public AutoEat() {
        this.j();
        this.L_0 = class11524.N((class11512)this, (String)"value", (float)18.0f, (float)0.0f, (float)20.0f, (float)1.0f);
    }

    private boolean m() {
        if (class11938.m().u()) {
            return false;
        }
        if (((class03443)((class06202)this.y_0).T_2).E() || ((class04453)((class06202)this.y_0).T_4).n()) {
            return false;
        }
        if (((class04453)((class06202)this.y_0).T_4).method_6115() || (Integer)((class06202)this.y_0).M_4 != 0) {
            return false;
        }
        return this.T();
    }

    private void j() {
        if (!this.L_init) {
            this.L_init = true;
            this.L_1 = false;
        }
    }

    private boolean N(class06584 class065842) {
        if (class065842 == null || class065842.R()) {
            return false;
        }
        return class11929.U((class06584)class065842);
    }

    @class11782
    public void N(class10950 class109502) {
        this.j();
        if ((class04453)((class06202)this.y_0).T_4 == null) {
            return;
        }
        this.L_1 = (Boolean)this.L_1 != false && this.T() && this.N(((class04453)((class06202)this.y_0).T_4).method_6030());
        if (((Boolean)this.L_1).booleanValue()) {
            class109502.N();
        }
    }

    @class11782
    public void N(class11380 class113802) {
        this.j();
        if ((class04453)((class06202)this.y_0).T_4 == null) {
            return;
        }
        if (!this.m()) {
            return;
        }
        for (class07050 class070502 : class07050.values()) {
            class06584 class065842 = ((class04453)((class06202)this.y_0).T_4).method_5998(class070502);
            if (!class065842.N(((class03448)((class06202)this.y_0).T_3).method_45162())) {
                return;
            }
            if (!this.N(class065842)) continue;
            class11907.N((class07050)class070502);
            ((class06202)this.y_0).M_4 = 4;
            this.L_1 = true;
            break;
        }
    }
}

