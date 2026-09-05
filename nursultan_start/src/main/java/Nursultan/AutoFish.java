/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10996
 *  Nursultan.class11067
 *  Nursultan.class11072
 *  Nursultan.class11080
 *  Nursultan.class11106
 *  Nursultan.class11782
 *  Nursultan.class11907
 *  minecraft.class00696
 *  minecraft.class04453
 *  minecraft.class06202
 *  minecraft.class06570
 *  minecraft.class07050
 */
package Nursultan;

import Nursultan.class10996;
import Nursultan.class11067;
import Nursultan.class11072;
import Nursultan.class11080;
import Nursultan.class11106;
import Nursultan.class11782;
import Nursultan.class11907;
import minecraft.class00696;
import minecraft.class04453;
import minecraft.class06202;
import minecraft.class06570;
import minecraft.class07050;

@class11080(L="AutoFish", y=class11072.PLAYER, N=class11106.AUTO)
public class AutoFish
extends class11067 {
    public Object L_0;
    public boolean L_init;

    public AutoFish() {
        this.m();
        this.L_0 = 0;
    }

    private void m() {
        if (!this.L_init) {
            this.L_init = true;
            this.L_0 = 0;
        }
    }

    private void N(class07050 class070502, int n) {
        this.m();
        if ((Integer)this.L_0 < 0) {
            class11907.N((class07050)class070502);
            this.L_0 = n;
        }
    }

    @class11782
    public void N(class10996 class109962) {
        this.m();
        for (class07050 class070502 : class07050.values()) {
            if (!((class04453)((class06202)this.y_0).T_4).method_5998(class070502).N(class06570.jr)) continue;
            class00696 class006962 = ((class04453)((class06202)this.y_0).T_4).fields_57fa3311b0e9d3e9b883d09222919bf5a_2;
            this.L_0 = (Integer)this.L_0 - 1;
            if (class006962 == null) {
                this.N(class070502, 30);
                return;
            }
            if (!class006962.N) {
                return;
            }
            this.N(class070502, 10);
            break;
        }
    }
}

