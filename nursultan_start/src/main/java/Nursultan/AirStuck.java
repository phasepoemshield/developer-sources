/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10965
 *  Nursultan.class11067
 *  Nursultan.class11072
 *  Nursultan.class11080
 *  Nursultan.class11106
 *  Nursultan.class11355
 *  Nursultan.class11379
 *  Nursultan.class11385
 *  Nursultan.class11782
 *  Nursultan.class11902
 *  Nursultan.class11910
 *  minecraft.class00381
 *  minecraft.class02574
 *  minecraft.class04453
 *  minecraft.class05630
 *  minecraft.class06202
 *  minecraft.class07352
 *  minecraft.class08687
 */
package Nursultan;

import Nursultan.class10965;
import Nursultan.class11067;
import Nursultan.class11072;
import Nursultan.class11080;
import Nursultan.class11106;
import Nursultan.class11355;
import Nursultan.class11379;
import Nursultan.class11385;
import Nursultan.class11782;
import Nursultan.class11902;
import Nursultan.class11910;
import minecraft.class00381;
import minecraft.class02574;
import minecraft.class04453;
import minecraft.class05630;
import minecraft.class06202;
import minecraft.class07352;
import minecraft.class08687;

@class11080(L="AirStuck", y=class11072.MOVEMENT, N=class11106.TOOLS)
public class AirStuck
extends class11067 {
    public Object L_0;
    public boolean L_init;

    private class08687 P() {
        class05630 class056302 = (class05630)((class06202)this.y_0).i_7;
        return new class08687(class056302.n.R(), class056302.G.R(), class056302.t.R(), class056302.l.R(), class056302.d.R(), class056302.w.R(), class056302.k.R());
    }

    private void T() {
        if (!this.L_init) {
            this.L_init = true;
            this.L_0 = 0;
        }
    }

    public AirStuck() {
        this.T();
    }

    public boolean Z() {
        this.T();
        this.L_0 = 0;
        return true;
    }

    public boolean i() {
        this.N(this.P());
        return true;
    }

    private boolean m() {
        this.T();
        return (Integer)this.L_0 >= 1;
    }

    @class11782
    public void N(class11355 class113552) {
        this.T();
        if (this.m()) {
            class113552.N();
        }
        this.L_0 = (Integer)this.L_0 + 1;
    }

    @class11782
    public void N(class11385 class113852) {
        class11902.N((class11385)class113852);
    }

    @class11782
    public void N(class10965 class109652) {
        boolean bl;
        class00381 var2 = class109652.L();
        boolean bl2 = bl = var2 instanceof class07352 || var2 instanceof class02574;
        if (this.m() && bl) {
            class109652.N();
        }
    }

    private void N(class08687 class086872) {
        if ((class04453)((class06202)this.y_0).T_4 == null || class086872.equals((Object)((class08687)((class04453)((class06202)this.y_0).T_4).L_2))) {
            return;
        }
        class11910.N((class00381)new class07352(class086872));
        ((class04453)((class06202)this.y_0).T_4).L_2 = class086872;
    }

    @class11782
    public void N(class11379 class113792) {
        if (this.m()) {
            class113792.N();
        }
    }
}

