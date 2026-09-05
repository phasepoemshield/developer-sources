/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00500
 *  minecraft.class01989
 *  minecraft.class02859
 *  minecraft.class04782
 *  minecraft.class06584
 *  minecraft.class06758
 *  minecraft.class07209
 *  minecraft.class07210
 *  minecraft.class07211
 *  minecraft.class08092
 */
package Nursultan;

import java.util.Optional;
import minecraft.class00500;
import minecraft.class01989;
import minecraft.class02859;
import minecraft.class04782;
import minecraft.class06584;
import minecraft.class06758;
import minecraft.class07209;
import minecraft.class07210;
import minecraft.class07211;
import minecraft.class08092;

public class class09398
extends class01989 {
    public class06584 N(class07210 class072102, class06584 class065842) {
        class07209 class072092 = class072102.L().method_10093((class07211)class072102.u().L((class08092)class06758.y));
        class04782 class047822 = class072102.y();
        Optional var6 = class02859.N((class00500)class047822.method_8320(class072092));
        if (var6.isPresent()) {
            class047822.method_8501(class072092, (class00500)var6.get());
            class047822.N(3003, class072092, 0);
            class065842.B(1);
            this.N(true);
            return class065842;
        }
        return super.N(class072102, class065842);
    }
}

