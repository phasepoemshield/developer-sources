/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10950
 *  Nursultan.class10992
 *  Nursultan.class11036
 *  Nursultan.class11048
 *  Nursultan.class11067
 *  Nursultan.class11072
 *  Nursultan.class11080
 *  Nursultan.class11106
 *  Nursultan.class11328
 *  Nursultan.class11389
 *  Nursultan.class11400
 *  Nursultan.class11782
 *  Nursultan.class11907
 *  Nursultan.class11929
 *  minecraft.class03443
 *  minecraft.class03556
 *  minecraft.class04453
 *  minecraft.class06202
 *  minecraft.class06570
 *  minecraft.class06581
 *  minecraft.class06584
 *  minecraft.class07047
 *  minecraft.class07050
 */
package Nursultan;

import Nursultan.class10950;
import Nursultan.class10992;
import Nursultan.class11036;
import Nursultan.class11048;
import Nursultan.class11067;
import Nursultan.class11072;
import Nursultan.class11080;
import Nursultan.class11106;
import Nursultan.class11328;
import Nursultan.class11389;
import Nursultan.class11400;
import Nursultan.class11782;
import Nursultan.class11907;
import Nursultan.class11929;
import minecraft.class03443;
import minecraft.class03556;
import minecraft.class04453;
import minecraft.class06202;
import minecraft.class06570;
import minecraft.class06581;
import minecraft.class06584;
import minecraft.class07047;
import minecraft.class07050;

@class11080(L="QuickUse", y=class11072.PLAYER, N=class11106.BASE)
public class QuickUse
extends class11067 {
    public Object L_0;
    public Object L_1;
    public boolean L_init;

    private boolean P() {
        if (((class03443)((class06202)this.y_0).T_2).E() || ((class04453)((class06202)this.y_0).T_4).n()) {
            return false;
        }
        return !((class04453)((class06202)this.y_0).T_4).method_6115() && (Integer)((class06202)this.y_0).M_4 == 0;
    }

    public QuickUse() {
        this.m();
        this.L_0 = new class11048[]{new class11048(class11328.N((class06581)class06570.lo), "shield", this), new class11048(class11328.N((class06581)class06570.jT), "milk", this), new class11048(class11328.N((class06581)class06570.lt), "chorus", this), new class11048(class11328.N((class06581)class06570.bV), "golden-apple", this), new class11048(class11328.N((class06581)class06570.be), "enchanted-golden-apple", this), new class11048(class11328.N((class06581)class06570.GB), "bottle-of-exp", this), new class11036(class065842 -> class11929.N((class06584)class065842, (class03556[])new class03556[]{class07047.M}), "instant-damage", this), new class11048(class065842 -> class065842.N(class06570.ns) && class11929.N((class06584)class065842, (class03556[])new class03556[]{class07047.R}), "instant-health", this), new class11048(class11328.N((class06581)class06570.db), "trident", this)};
    }

    private void m() {
        if (!this.L_init) {
            this.L_init = true;
            this.L_1 = false;
        }
    }

    @class11782(u=true)
    public void N(class11400 class114002) {
        this.m();
        class11048[] class11048Array = (class11048[])this.L_0;
        int n = class11048Array.length;
        for (int i = 0; i < n; ++i) {
            class11048Array[i].N((class11389)class114002);
        }
    }

    @class11782
    public void N(class10992 class109922) {
        this.m();
        if (((Boolean)this.L_1).booleanValue() && this.P()) {
            ((class06202)this.y_0).M_4 = 4;
            class11907.N((class07050)class07050.field_5808);
        }
        class11048[] class11048Array = (class11048[])this.L_0;
        int n = class11048Array.length;
        for (int i = 0; i < n; ++i) {
            class11048Array[i].L();
        }
    }

    @class11782
    public void N(class10950 class109502) {
        this.m();
        if (((Boolean)this.L_1).booleanValue()) {
            class109502.N();
        }
    }
}

