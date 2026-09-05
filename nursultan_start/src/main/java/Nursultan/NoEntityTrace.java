/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class11067
 *  Nursultan.class11072
 *  Nursultan.class11080
 *  Nursultan.class11106
 *  Nursultan.class11357
 *  Nursultan.class11507
 *  Nursultan.class11512
 *  Nursultan.class11524
 *  Nursultan.class11782
 *  minecraft.class03443
 *  minecraft.class06202
 */
package Nursultan;

import Nursultan.class11067;
import Nursultan.class11072;
import Nursultan.class11080;
import Nursultan.class11106;
import Nursultan.class11357;
import Nursultan.class11507;
import Nursultan.class11512;
import Nursultan.class11524;
import Nursultan.class11782;
import minecraft.class03443;
import minecraft.class06202;

@class11080(L="NoEntityTrace", y=class11072.PLAYER, N=class11106.BASE)
public class NoEntityTrace
extends class11067 {
    public Object L_0;

    private void P() {
    }

    public NoEntityTrace() {
        this.P();
        this.L_0 = class11524.N((class11512)this, (String)"only-while-breaking", (boolean)false);
    }

    @class11782
    public void N(class11357 class113572) {
        this.P();
        if (((Boolean)((class11507)this.L_0).i()).booleanValue() && !((class03443)((class06202)this.y_0).T_2).E()) {
            return;
        }
        class113572.N();
    }
}

