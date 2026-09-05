/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10996
 *  Nursultan.class11373
 *  Nursultan.class11782
 *  minecraft.class03448
 *  minecraft.class04453
 *  minecraft.class04891
 *  minecraft.class04909
 *  minecraft.class06202
 *  minecraft.class07049
 *  minecraft.class07438
 *  minecraft.class08036
 */
package Nursultan;

import Nursultan.class10996;
import Nursultan.class11373;
import Nursultan.class11528;
import Nursultan.class11782;
import minecraft.class03448;
import minecraft.class04453;
import minecraft.class04891;
import minecraft.class04909;
import minecraft.class06202;
import minecraft.class07049;
import minecraft.class07438;
import minecraft.class08036;

public class class11497 {
    public Object N_0;

    public class11497() {
        this.y();
        this.N_0 = class06202.Nq();
    }

    private void y() {
    }

    @class11782
    public void N(class10996 class109962) {
        class11528.N();
    }

    private static void N(class07438 class074382, class04891 class048912) {
        class06202 class062022 = class06202.Nq();
        if ((class03448)class062022.T_3 == null) {
            return;
        }
        ((class03448)class062022.T_3).method_55116((class07049)class074382, class048912, class074382.method_5634(), 1.0f, 0.8f + class074382.method_59922().z() * 0.4f);
    }

    @class11782
    public void N(class11373 class113732) {
        class07049 class070492;
        if ((class04453)((class06202)this.N_0).T_4 == null || !((class070492 = class113732.N()) instanceof class08036)) {
            return;
        }
        class08036 class080362 = (class08036)class070492;
        if (class11528.N(class080362, ((class04453)((class06202)this.N_0).T_4).method_73189(), true) && !class11528.N((class08036)((class04453)((class06202)this.N_0).T_4))) {
            class11497.N((class07438)class080362, (class04891)class04909.wV.N());
        }
    }

    public static void N(class07438 class074382) {
        class11497.N(class074382, (class04891)class04909.we.N());
    }
}

