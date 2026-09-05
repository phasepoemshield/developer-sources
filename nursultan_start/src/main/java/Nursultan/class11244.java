/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.Particles
 *  Nursultan.class10996
 *  Nursultan.class11798
 *  Nursultan.class11908
 *  minecraft.class03386
 *  minecraft.class04453
 *  minecraft.class05363
 *  minecraft.class06202
 *  minecraft.class06889
 */
package Nursultan;

import Nursultan.Particles;
import Nursultan.class10996;
import Nursultan.class11179;
import Nursultan.class11230;
import Nursultan.class11798;
import Nursultan.class11908;
import minecraft.class03386;
import minecraft.class04453;
import minecraft.class05363;
import minecraft.class06202;
import minecraft.class06889;

public class class11244
extends class11230 {
    public class11244(Particles particles, String string, boolean bl) {
        super(particles, string, bl);
    }

    public void y(Object object) {
        if (!(object instanceof class10996)) {
            return;
        }
        if (((class04453)((class06202)((class11798)this).N_0).T_4).field_6012 % 4 != 0) {
            return;
        }
        class05363 class053632 = ((class03386)((class06202)((class11798)this).N_0).i_5).s();
        float f = class053632.R();
        for (int i = 0; i < 20; ++i) {
            float f2 = class11908.N((float)(f + class11908.y((float)-90.0f, (float)90.0f)));
            double d = -Math.sin(f2);
            double d2 = Math.cos(f2);
            double d3 = d * (double)class11908.y((float)3.0f, (float)30.0f);
            double d4 = class11908.y((float)-2.0f, (float)15.0f) - 2.0f;
            double d5 = d2 * (double)class11908.y((float)3.0f, (float)30.0f);
            class06889 class068892 = class053632.y().y(d3, d4, d5);
            class06889 class068893 = new class06889((Math.random() * 0.5 - 0.25) * 0.9, Math.random() * 0.25 * 0.01, (Math.random() * 0.5 - 0.25) * 0.9);
            class11179 class111792 = new class11179(class11908.N((int)40, (int)70), this.N());
            class111792.N(true);
            class111792.N(class068892);
            class111792.y(class068893);
            class111792.y(0.995);
            class111792.N((double)0.01f);
            this.N(class111792);
        }
    }
}

