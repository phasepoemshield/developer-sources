/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10961
 *  Nursultan.class10990
 *  Nursultan.class11067
 *  Nursultan.class11072
 *  Nursultan.class11080
 *  Nursultan.class11106
 *  Nursultan.class11782
 *  minecraft.class00261
 *  minecraft.class00381
 *  minecraft.class04453
 *  minecraft.class04995
 *  minecraft.class06202
 *  minecraft.class06663
 *  minecraft.class06671
 */
package Nursultan;

import Nursultan.class10961;
import Nursultan.class10990;
import Nursultan.class11067;
import Nursultan.class11072;
import Nursultan.class11080;
import Nursultan.class11106;
import Nursultan.class11782;
import minecraft.class00261;
import minecraft.class00381;
import minecraft.class04453;
import minecraft.class04995;
import minecraft.class06202;
import minecraft.class06663;
import minecraft.class06671;

@class11080(L="NoServerRotation", y=class11072.PLAYER, N=class11106.BASE)
public class NoServerRotation
extends class11067 {
    public Object L_0;
    public Object L_1;
    public boolean L_init;

    private void T() {
        if (!this.L_init) {
            this.L_init = true;
            this.L_0 = Float.valueOf(0.0f);
            this.L_1 = Float.valueOf(0.0f);
        }
    }

    public NoServerRotation() {
        this.T();
    }

    @class11782
    public void N(class10990 class109902) {
        this.T();
        class04453 class044532 = (class04453)((class06202)this.y_0).T_4;
        if (class044532 == null || !this.N(class109902.u())) {
            return;
        }
        this.L_0 = Float.valueOf(class044532.method_36454());
        this.L_1 = Float.valueOf(class044532.method_36455());
    }

    @class11782
    public void N(class10961 class109612) {
        if (!this.N(class109612.N())) {
            return;
        }
        ((class06202)this.y_0).execute(() -> {
            this.T();
            if ((class04453)((class06202)this.y_0).T_4 == null) {
                return;
            }
            ((class04453)((class06202)this.y_0).T_4).R_1 = Float.valueOf(((class04453)((class06202)this.y_0).T_4).method_36454());
            ((class04453)((class06202)this.y_0).T_4).R_2 = Float.valueOf(((class04453)((class06202)this.y_0).T_4).method_36455());
            ((class04453)((class06202)this.y_0).T_4).method_36456(class04995.R((float)((Float)this.L_0).floatValue()));
            ((class04453)((class06202)this.y_0).T_4).method_36457(((Float)this.L_1).floatValue());
            ((class04453)((class06202)this.y_0).T_4).method_63614();
        });
    }

    private boolean N(class00381<?> class003812) {
        return class003812 instanceof class06663 || class003812 instanceof class00261 || class003812 instanceof class06671;
    }
}

