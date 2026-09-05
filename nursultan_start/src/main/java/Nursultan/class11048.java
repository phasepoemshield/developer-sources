/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.QuickUse
 *  Nursultan.class11281
 *  Nursultan.class11297
 *  Nursultan.class11322
 *  Nursultan.class11328
 *  Nursultan.class11389
 *  Nursultan.class11512
 *  Nursultan.class11524
 *  Nursultan.class11527
 *  Nursultan.class11938
 *  Nursultan.class12002
 *  minecraft.class03448
 *  minecraft.class04453
 *  minecraft.class06202
 *  minecraft.class06584
 *  minecraft.class07510
 */
package Nursultan;

import Nursultan.QuickUse;
import Nursultan.class11281;
import Nursultan.class11297;
import Nursultan.class11322;
import Nursultan.class11328;
import Nursultan.class11389;
import Nursultan.class11512;
import Nursultan.class11524;
import Nursultan.class11527;
import Nursultan.class11938;
import Nursultan.class12002;
import minecraft.class03448;
import minecraft.class04453;
import minecraft.class06202;
import minecraft.class06584;
import minecraft.class07510;

public class class11048 {
    public Object N_0;
    public Object N_1;
    public Object N_2;
    public Object N_3;
    public Object N_4;
    public Object N_5;
    public Object N_6;
    public boolean N_init;

    public void L() {
        this.N_6 = (Integer)this.N_6 - 1;
        if ((Integer)this.N_6 == 0) {
            this.N();
        }
    }

    private void M() {
        if (!this.N_init) {
            this.N_init = true;
            this.N_4 = 0;
            this.N_5 = 0;
            this.N_6 = 0;
        }
    }

    public class11048(class11328 class113282, String string, QuickUse quickUse) {
        this.M();
        this.N_4 = -1;
        this.N_5 = -1;
        this.N_6 = -1;
        this.N_1 = class113282;
        this.N_3 = quickUse.W();
        this.N_0 = quickUse;
        this.N_2 = class11524.N((class11512)quickUse, (String)string, (class12002)class12002.UNKNOWN);
    }

    public void u() {
        class11297 class112972 = class11281.N((class11328)((class11328)this.N_1));
        if (class112972 == null) {
            return;
        }
        int n = class112972.y();
        class06584 class065842 = ((class04453)((class06202)this.N_3).T_4).method_31548().method_5438(n);
        if (((class04453)((class06202)this.N_3).T_4).method_7357().N(class065842)) {
            return;
        }
        int n2 = class112972.y();
        if (!class11281.u((int)n)) {
            n2 = ((class04453)((class06202)this.N_3).T_4).method_31548().M();
            this.N_5 = n2;
            class11938.m().N(0, n, n2, class07510.field_7791).y(class062022 -> this.N((Integer)this.N_5)).y();
            this.N_4 = n;
            return;
        }
        this.N(n2);
    }

    public void y() {
        this.N_6 = 4;
        ((QuickUse)this.N_0).L_1 = false;
    }

    public void N(class11389 class113892) {
        if ((class04453)((class06202)this.N_3).T_4 == null || (class03448)((class06202)this.N_3).T_3 == null) {
            return;
        }
        if (class113892.y((class12002)((class11527)this.N_2).i(), ((class11527)this.N_2).L())) {
            class11938.Z().N(this::u);
        } else if (class113892.N((class12002)((class11527)this.N_2).i())) {
            class11938.Z().N(this::y);
        }
    }

    public void N() {
        class11322.L();
        if ((Integer)this.N_4 != -1 && (Integer)this.N_5 != -1) {
            class11938.m().N(0, ((Integer)this.N_4).intValue(), ((Integer)this.N_5).intValue(), class07510.field_7791).y();
            this.N_5 = -1;
            this.N_4 = -1;
        }
    }

    public void N(int n) {
        class11322.N((int)n);
        this.N_6 = -1;
        ((QuickUse)this.N_0).L_1 = true;
    }
}

