/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.Particles
 *  Nursultan.class10996
 *  Nursultan.class11798
 *  Nursultan.class11908
 *  minecraft.class03448
 *  minecraft.class06202
 *  minecraft.class06889
 *  minecraft.class07049
 *  minecraft.class07488
 *  minecraft.class07517
 */
package Nursultan;

import Nursultan.Particles;
import Nursultan.class10996;
import Nursultan.class11179;
import Nursultan.class11230;
import Nursultan.class11798;
import Nursultan.class11908;
import minecraft.class03448;
import minecraft.class06202;
import minecraft.class06889;
import minecraft.class07049;
import minecraft.class07488;
import minecraft.class07517;

public class class11251
extends class11230 {
    public class11251(Particles particles, String string, boolean bl) {
        super(particles, string, bl);
    }

    public void y(Object object) {
        if (!(object instanceof class10996)) {
            return;
        }
        for (class07049 class070492 : ((class03448)((class06202)((class11798)this).N_0).T_3).M()) {
            if (!(class070492 instanceof class07517) && !(class070492 instanceof class07488) || !this.N(class070492)) continue;
            for (int i = 0; i < 5; ++i) {
                class06889 class068892 = new class06889((Math.random() - 0.5) * 0.3, (Math.random() - 0.5) * 0.2, (Math.random() - 0.5) * 0.3);
                class11179 class111792 = new class11179(class11908.N((int)20, (int)40), this.N());
                class111792.N(true);
                class111792.N(class070492.method_73189());
                class111792.y(class068892);
                class111792.y(0.95);
                class111792.N(0.02);
                this.N(class111792);
            }
        }
    }

    private boolean N(class07049 class070492) {
        if (class070492.field_6012 > 0) {
            return class070492.field_6038 != class070492.method_23317() || class070492.field_5971 != class070492.method_23318() || class070492.field_5989 != class070492.method_23321();
        }
        return false;
    }
}

