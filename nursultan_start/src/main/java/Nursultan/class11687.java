/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.AutoSwap
 *  Nursultan.class11328
 *  Nursultan.class11389
 *  Nursultan.class11517
 *  Nursultan.class11527
 *  Nursultan.class11807
 *  Nursultan.class11938
 *  Nursultan.class12002
 *  minecraft.class04453
 *  minecraft.class06202
 *  minecraft.class06584
 */
package Nursultan;

import Nursultan.AutoSwap;
import Nursultan.class11328;
import Nursultan.class11389;
import Nursultan.class11517;
import Nursultan.class11527;
import Nursultan.class11679;
import Nursultan.class11798;
import Nursultan.class11807;
import Nursultan.class11938;
import Nursultan.class12002;
import minecraft.class04453;
import minecraft.class06202;
import minecraft.class06584;

public class class11687
extends class11807<AutoSwap> {
    public class11687(AutoSwap autoSwap, String string, boolean bl) {
        super((Object)autoSwap, string, bl);
    }

    private void u() {
        class06584 class065842 = ((class04453)((class06202)((class11798)((Object)this)).N_0).T_4).method_6079();
        class11679 class116792 = (class11679)((Object)((class11517)((AutoSwap)((class11798)((Object)this)).N_1).R_5).i());
        class11679 class116793 = (class11679)((Object)((class11517)((AutoSwap)((class11798)((Object)this)).N_1).R_6).i());
        if (((class11328)class116792.N_0).test((Object)class065842)) {
            ((AutoSwap)((class11798)((Object)this)).N_1).N(class116793::N);
        } else if (((class11328)class116793.N_0).test((Object)class065842)) {
            ((AutoSwap)((class11798)((Object)this)).N_1).N(class116792::N);
        } else if (!((AutoSwap)((class11798)((Object)this)).N_1).N(class116792::N)) {
            ((AutoSwap)((class11798)((Object)this)).N_1).N(class116793::N);
        }
    }

    public void y(Object object) {
        if (object instanceof class11389) {
            class11389 class113892 = (class11389)object;
            if (this.N(class113892)) {
                return;
            }
            class11938.Z().N(this::u);
        }
    }

    private boolean N(class11389 class113892) {
        class11527 class115272 = (class11527)((AutoSwap)((class11798)((Object)this)).N_1).u_0;
        return !class113892.y((class12002)class115272.i(), class115272.L());
    }
}

