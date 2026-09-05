/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.Particles
 *  Nursultan.class10990
 *  Nursultan.class11798
 *  Nursultan.class11908
 *  minecraft.class00381
 *  minecraft.class03448
 *  minecraft.class06202
 *  minecraft.class06889
 *  minecraft.class07049
 *  minecraft.class07268
 */
package Nursultan;

import Nursultan.Particles;
import Nursultan.class10990;
import Nursultan.class11179;
import Nursultan.class11230;
import Nursultan.class11798;
import Nursultan.class11908;
import minecraft.class00381;
import minecraft.class03448;
import minecraft.class06202;
import minecraft.class06889;
import minecraft.class07049;
import minecraft.class07268;

public class class11253
extends class11230 {
    public class11253(Particles particles, String string, boolean bl) {
        super(particles, string, bl);
    }

    public void y(Object object) {
        class07268 class072682;
        class00381 var4;
        if (!(object instanceof class10990) || !((var4 = ((class10990)object).u()) instanceof class07268) || (class072682 = (class07268)var4).y() != 4) {
            return;
        }
        class07049 class070492 = ((class03448)((class06202)((class11798)this).N_0).T_3).method_8469(class072682.N());
        if (class070492 == null) {
            return;
        }
        for (int i = 0; i < 50; ++i) {
            class06889 class068892 = new class06889((Math.random() - 0.5) * 0.6, Math.random() * 0.2 + 0.1, (Math.random() - 0.5) * 0.6);
            class06889 class068893 = new class06889(class070492.method_23316(class068892.M / 4.0), class070492.method_23318() + (double)class070492.method_17682() * Math.random(), class070492.method_23324(class068892.Z / 4.0));
            class11179 class111792 = new class11179(class11908.N((int)20, (int)30), this.N());
            class111792.N(class068893);
            class111792.y(class068892);
            class111792.y(0.998);
            class111792.N(0.7);
            this.N(class111792);
        }
    }
}

