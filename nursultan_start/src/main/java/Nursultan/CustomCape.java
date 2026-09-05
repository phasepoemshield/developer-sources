/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10985
 *  Nursultan.class11067
 *  Nursultan.class11072
 *  Nursultan.class11080
 *  Nursultan.class11106
 *  Nursultan.class11782
 *  Nursultan.class11911
 *  minecraft.class01894
 *  minecraft.class04453
 *  minecraft.class06202
 */
package Nursultan;

import Nursultan.class10985;
import Nursultan.class11067;
import Nursultan.class11072;
import Nursultan.class11080;
import Nursultan.class11106;
import Nursultan.class11782;
import Nursultan.class11911;
import minecraft.class01894;
import minecraft.class04453;
import minecraft.class06202;

@class11080(L="CustomCape", y=class11072.MISC, N=class11106.CLIENT)
public class CustomCape
extends class11067 {
    public Object L_0;

    private void P() {
    }

    public CustomCape() {
        this.P();
    }

    @class11782
    public void N(class10985 class109852) {
        this.P();
        if (class109852.y() == (class04453)((class06202)this.y_0).T_4) {
            if ((class01894)this.L_0 == null) {
                this.L_0 = class11911.N((String)"textures/capes/cape.png");
            }
            class109852.N((class01894)this.L_0);
        }
    }
}

