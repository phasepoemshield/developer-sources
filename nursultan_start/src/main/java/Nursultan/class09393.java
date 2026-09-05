/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00394
 *  minecraft.class00399
 *  minecraft.class00500
 *  minecraft.class00869
 *  minecraft.class01194
 *  minecraft.class01989
 *  minecraft.class03556
 *  minecraft.class03795
 *  minecraft.class04782
 *  minecraft.class06584
 *  minecraft.class06758
 *  minecraft.class07000
 *  minecraft.class07209
 *  minecraft.class07210
 *  minecraft.class07211
 *  minecraft.class07237
 *  minecraft.class07299
 *  minecraft.class08092
 *  minecraft.class08711
 */
package Nursultan;

import minecraft.class00394;
import minecraft.class00399;
import minecraft.class00500;
import minecraft.class00869;
import minecraft.class01194;
import minecraft.class01989;
import minecraft.class03556;
import minecraft.class03795;
import minecraft.class04782;
import minecraft.class06584;
import minecraft.class06758;
import minecraft.class07000;
import minecraft.class07209;
import minecraft.class07210;
import minecraft.class07211;
import minecraft.class07237;
import minecraft.class07299;
import minecraft.class08092;
import minecraft.class08711;

public class class09393
extends class01989 {
    protected class06584 N(class07210 class072102, class06584 class065842) {
        class04782 class047822 = class072102.y();
        class07211 class072112 = (class07211)class072102.u().L((class08092)class06758.y);
        class07209 class072092 = class072102.L().method_10093(class072112);
        if (class047822.R(class072092) && class00399.y((class07299)class047822, (class07209)class072092, (class06584)class065842)) {
            class047822.method_8652(class072092, (class00500)class00869.Bl.W().y((class08092)class07000.i, (Comparable)Integer.valueOf(class03795.N((class07211)class072112))), 3);
            class047822.N(null, (class03556)class01194.Z, class072092);
            class00394 class003942 = class047822.method_8321(class072092);
            if (class003942 instanceof class07237) {
                class00399.N((class07299)class047822, (class07209)class072092, (class07237)((class07237)class003942));
            }
            class065842.B(1);
            this.N(true);
        } else {
            this.N(class08711.y((class07210)class072102, (class06584)class065842));
        }
        return class065842;
    }
}

