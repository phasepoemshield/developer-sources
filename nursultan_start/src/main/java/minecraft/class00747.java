/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00734
 *  minecraft.class01989
 *  minecraft.class04803
 *  minecraft.class06584
 *  minecraft.class06758
 *  minecraft.class07209
 *  minecraft.class07210
 *  minecraft.class07211
 *  minecraft.class07877
 *  minecraft.class08092
 */
package minecraft;

import minecraft.class00734;
import minecraft.class01989;
import minecraft.class04803;
import minecraft.class06584;
import minecraft.class06758;
import minecraft.class07209;
import minecraft.class07210;
import minecraft.class07211;
import minecraft.class07877;
import minecraft.class08092;

class class00747
extends class01989 {
    class00747() {
    }

    public class06584 N(class07210 class072102, class06584 class065842) {
        class07209 class072092 = class072102.L().method_10093((class07211)class072102.u().L((class08092)class06758.y));
        for (class07877 class078773 : class072102.y().N(class07877.class, new class00734(class072092), class078772 -> class078772.method_5805() && !class078772.v())) {
            class04803 class048032;
            if (!class078773.I() || (class048032 = class078773.method_32318(499)) == null || !class048032.N(class065842)) continue;
            class065842.B(1);
            this.N(true);
            return class065842;
        }
        return super.N(class072102, class065842);
    }
}

