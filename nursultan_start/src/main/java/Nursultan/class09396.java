/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00500
 *  minecraft.class00869
 *  minecraft.class01338
 *  minecraft.class01989
 *  minecraft.class04782
 *  minecraft.class06584
 *  minecraft.class06758
 *  minecraft.class07209
 *  minecraft.class07210
 *  minecraft.class07211
 *  minecraft.class07299
 *  minecraft.class08092
 */
package Nursultan;

import minecraft.class00500;
import minecraft.class00869;
import minecraft.class01338;
import minecraft.class01989;
import minecraft.class04782;
import minecraft.class06584;
import minecraft.class06758;
import minecraft.class07209;
import minecraft.class07210;
import minecraft.class07211;
import minecraft.class07299;
import minecraft.class08092;

public class class09396
extends class01989 {
    public class06584 N(class07210 class072102, class06584 class065842) {
        class07211 class072112 = (class07211)class072102.u().L((class08092)class06758.y);
        class07209 class072092 = class072102.L().method_10093(class072112);
        class04782 class047822 = class072102.y();
        class00500 class005002 = class047822.method_8320(class072092);
        this.N(true);
        if (class005002.N(class00869.TE)) {
            if ((Integer)class005002.L((class08092)class01338.u) != 4) {
                class01338.N(null, (class07299)class047822, (class07209)class072092, (class00500)class005002);
                class065842.B(1);
            } else {
                this.N(false);
            }
            return class065842;
        }
        return super.N(class072102, class065842);
    }
}

