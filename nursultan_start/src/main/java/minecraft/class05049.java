/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00394
 *  minecraft.class00500
 *  minecraft.class00734
 *  minecraft.class01194
 *  minecraft.class01210
 *  minecraft.class01989
 *  minecraft.class03556
 *  minecraft.class04593
 *  minecraft.class04782
 *  minecraft.class04909
 *  minecraft.class04911
 *  minecraft.class05310
 *  minecraft.class05497
 *  minecraft.class06584
 *  minecraft.class06758
 *  minecraft.class07042
 *  minecraft.class07049
 *  minecraft.class07209
 *  minecraft.class07210
 *  minecraft.class07211
 *  minecraft.class07299
 *  minecraft.class08092
 */
package minecraft;

import minecraft.class00394;
import minecraft.class00500;
import minecraft.class00734;
import minecraft.class01194;
import minecraft.class01210;
import minecraft.class01989;
import minecraft.class03556;
import minecraft.class04593;
import minecraft.class04782;
import minecraft.class04909;
import minecraft.class04911;
import minecraft.class05310;
import minecraft.class05497;
import minecraft.class06584;
import minecraft.class06758;
import minecraft.class07042;
import minecraft.class07049;
import minecraft.class07209;
import minecraft.class07210;
import minecraft.class07211;
import minecraft.class07299;
import minecraft.class08092;

public class class05049
extends class01989 {
    private static boolean N(class04782 class047822, class07209 class072092, class06584 class065842) {
        for (class07049 class070492 : class047822.N(class07049.class, new class00734(class072092), class07042.R)) {
            class05310 class053102;
            if (class070492.method_70984(null)) {
                return true;
            }
            if (!(class070492 instanceof class05310) || !(class053102 = (class05310)class070492).d()) continue;
            class053102.N(class047822, class04911.field_15245, class065842);
            class047822.N(null, (class03556)class01194.H, class072092);
            return true;
        }
        return false;
    }

    private static boolean N(class04782 class047822, class06584 class065842, class07209 class072092) {
        class00500 class005002 = class047822.method_8320(class072092);
        if (class005002.N(class01210.NC, class013392 -> class013392.y((class08092)class04593.L) && class013392.i() instanceof class04593) && (Integer)class005002.L((class08092)class04593.L) >= 5) {
            class047822.method_8396(null, class072092, class04909.Lz, class04911.field_15245, 1.0f, 1.0f);
            class04593.N((class04782)class047822, (class06584)class065842, (class00500)class005002, (class00394)class047822.method_8321(class072092), null, (class07209)class072092);
            ((class04593)class005002.i()).N((class07299)class047822, class005002, class072092, null, class05497.field_20429);
            class047822.N(null, (class03556)class01194.H, class072092);
            return true;
        }
        return false;
    }

    protected class06584 N(class07210 class072102, class06584 class065842) {
        class04782 class047822 = class072102.y();
        if (!class047822.method_8608()) {
            class07209 class072092 = class072102.L().method_10093((class07211)class072102.u().L((class08092)class06758.y));
            this.N(class05049.N(class047822, class065842, class072092) || class05049.N(class047822, class072092, class065842));
            if (this.y()) {
                class065842.N(1, class047822, null, class065812 -> {});
            }
        }
        return class065842;
    }
}

