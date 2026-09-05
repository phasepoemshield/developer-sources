/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00674
 *  minecraft.class01194
 *  minecraft.class01989
 *  minecraft.class03556
 *  minecraft.class04782
 *  minecraft.class04909
 *  minecraft.class04911
 *  minecraft.class06584
 *  minecraft.class06758
 *  minecraft.class07049
 *  minecraft.class07209
 *  minecraft.class07210
 *  minecraft.class07211
 *  minecraft.class07299
 *  minecraft.class07305
 *  minecraft.class08092
 */
package Nursultan;

import minecraft.class00674;
import minecraft.class01194;
import minecraft.class01989;
import minecraft.class03556;
import minecraft.class04782;
import minecraft.class04909;
import minecraft.class04911;
import minecraft.class06584;
import minecraft.class06758;
import minecraft.class07049;
import minecraft.class07209;
import minecraft.class07210;
import minecraft.class07211;
import minecraft.class07299;
import minecraft.class07305;
import minecraft.class08092;

public class class09400
extends class01989 {
    protected class06584 N(class07210 class072102, class06584 class065842) {
        class04782 class047822 = class072102.y();
        if (!((Boolean)class047822.method_64395().N(class07305.Nu)).booleanValue()) {
            this.N(false);
            return class065842;
        }
        class07209 class072092 = class072102.L().method_10093((class07211)class072102.u().L((class08092)class06758.y));
        class00674 class006742 = new class00674((class07299)class047822, (double)class072092.method_10263() + 0.5, (double)class072092.method_10264(), (double)class072092.method_10260() + 0.5, null);
        class047822.method_8649((class07049)class006742);
        class047822.method_43128(null, class006742.method_23317(), class006742.method_23318(), class006742.method_23321(), class04909.Qp, class04911.field_15245, 1.0f, 1.0f);
        class047822.N(null, (class03556)class01194.v, class072092);
        class065842.B(1);
        this.N(true);
        return class065842;
    }
}

