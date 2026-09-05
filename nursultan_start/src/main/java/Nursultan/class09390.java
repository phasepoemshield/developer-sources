/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00500
 *  minecraft.class00886
 *  minecraft.class00891
 *  minecraft.class01194
 *  minecraft.class03556
 *  minecraft.class04782
 *  minecraft.class06581
 *  minecraft.class06584
 *  minecraft.class06758
 *  minecraft.class07206
 *  minecraft.class07209
 *  minecraft.class07210
 *  minecraft.class07211
 *  minecraft.class07284
 *  minecraft.class07310
 *  minecraft.class08092
 */
package Nursultan;

import minecraft.class00500;
import minecraft.class00886;
import minecraft.class00891;
import minecraft.class01194;
import minecraft.class03556;
import minecraft.class04782;
import minecraft.class06581;
import minecraft.class06584;
import minecraft.class06758;
import minecraft.class07206;
import minecraft.class07209;
import minecraft.class07210;
import minecraft.class07211;
import minecraft.class07284;
import minecraft.class07310;
import minecraft.class08092;

public class class09390
extends class07206 {
    public class06584 N(class07210 class072102, class06584 class065842) {
        class06584 class065843;
        class07209 class072092;
        class04782 class047822 = class072102.y();
        class00500 class005002 = class047822.method_8320(class072092 = class072102.L().method_10093((class07211)class072102.u().L((class08092)class06758.y)));
        class00891 class008912 = class005002.i();
        if (class008912 instanceof class00886) {
            class065843 = ((class00886)class008912).N(null, (class07284)class047822, class072092, class005002);
            if (class065843.R()) {
                return super.N(class072102, class065842);
            }
        } else {
            return super.N(class072102, class065842);
        }
        class047822.N(null, (class03556)class01194.d, class072092);
        class06581 class065812 = class065843.B();
        return this.N(class072102, class065842, new class06584((class07310)class065812));
    }
}

