/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.AutoTotem
 *  minecraft.class00734
 *  minecraft.class00869
 *  minecraft.class01128
 *  minecraft.class03448
 *  minecraft.class04453
 *  minecraft.class06202
 *  minecraft.class07078
 */
package Nursultan;

import Nursultan.AutoTotem;
import Nursultan.class11697;
import minecraft.class00734;
import minecraft.class00869;
import minecraft.class01128;
import minecraft.class03448;
import minecraft.class04453;
import minecraft.class06202;
import minecraft.class07078;

public class class11692
extends class11697 {
    public class11692(String string, boolean bl) {
        super(string, bl);
    }

    @Override
    public boolean N() {
        class00734 class007342 = ((class04453)((class06202)this.y_0).T_4).method_5829().L(1.0, 5.0, 1.0).u(0.0, 7.0, 0.0);
        return !((class03448)((class06202)this.y_0).T_3).method_18023((class01128)class07078.Ny, class007342, class007012 -> class007012.L().i() == class00869.vp).isEmpty();
    }

    @Override
    public void N(AutoTotem autoTotem) {
    }
}

