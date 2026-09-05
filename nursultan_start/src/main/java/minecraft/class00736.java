/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00500
 *  minecraft.class01194
 *  minecraft.class01210
 *  minecraft.class01231
 *  minecraft.class01989
 *  minecraft.class03556
 *  minecraft.class04593
 *  minecraft.class04782
 *  minecraft.class05497
 *  minecraft.class06506
 *  minecraft.class06517
 *  minecraft.class06570
 *  minecraft.class06581
 *  minecraft.class06584
 *  minecraft.class06758
 *  minecraft.class07209
 *  minecraft.class07210
 *  minecraft.class07211
 *  minecraft.class07299
 *  minecraft.class07310
 *  minecraft.class08092
 */
package minecraft;

import minecraft.class00500;
import minecraft.class01194;
import minecraft.class01210;
import minecraft.class01231;
import minecraft.class01989;
import minecraft.class03556;
import minecraft.class04593;
import minecraft.class04782;
import minecraft.class05497;
import minecraft.class06506;
import minecraft.class06517;
import minecraft.class06570;
import minecraft.class06581;
import minecraft.class06584;
import minecraft.class06758;
import minecraft.class07209;
import minecraft.class07210;
import minecraft.class07211;
import minecraft.class07299;
import minecraft.class07310;
import minecraft.class08092;

class class00736
extends class01989 {
    class00736() {
    }

    private class06584 y(class07210 class072102, class06584 class065842, class06584 class065843) {
        class072102.y().N(null, (class03556)class01194.d, class072102.L());
        return this.N(class072102, class065842, class065843);
    }

    public class06584 N(class07210 class072102, class06584 class065842) {
        this.N(false);
        class04782 class047822 = class072102.y();
        class07209 class072092 = class072102.L().method_10093((class07211)class072102.u().L((class08092)class06758.y));
        class00500 class005002 = class047822.method_8320(class072092);
        if (class005002.N(class01210.NC, class013392 -> class013392.y((class08092)class04593.L) && class013392.i() instanceof class04593) && (Integer)class005002.L((class08092)class04593.L) >= 5) {
            ((class04593)class005002.i()).N((class07299)class047822, class005002, class072092, null, class05497.field_20429);
            this.N(true);
            return this.y(class072102, class065842, new class06584((class07310)class06570.wZ));
        }
        if (class047822.method_8316(class072092).N(class01231.N)) {
            this.N(true);
            return this.y(class072102, class065842, class06517.N((class06581)class06570.ns, (class03556)class06506.N));
        }
        return super.N(class072102, class065842);
    }
}

