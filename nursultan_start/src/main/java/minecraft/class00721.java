/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00500
 *  minecraft.class01194
 *  minecraft.class01989
 *  minecraft.class03556
 *  minecraft.class04782
 *  minecraft.class05440
 *  minecraft.class05467
 *  minecraft.class05847
 *  minecraft.class05989
 *  minecraft.class06584
 *  minecraft.class06665
 *  minecraft.class06758
 *  minecraft.class07209
 *  minecraft.class07210
 *  minecraft.class07211
 *  minecraft.class07290
 *  minecraft.class07299
 *  minecraft.class08092
 */
package minecraft;

import minecraft.class00500;
import minecraft.class00655;
import minecraft.class01194;
import minecraft.class01989;
import minecraft.class03556;
import minecraft.class04782;
import minecraft.class05440;
import minecraft.class05467;
import minecraft.class05847;
import minecraft.class05989;
import minecraft.class06584;
import minecraft.class06665;
import minecraft.class06758;
import minecraft.class07209;
import minecraft.class07210;
import minecraft.class07211;
import minecraft.class07290;
import minecraft.class07299;
import minecraft.class08092;

class class00721
extends class01989 {
    class00721() {
    }

    protected class06584 N(class07210 class072102, class06584 class065842) {
        class04782 class047822 = class072102.y();
        this.N(true);
        class07211 class072112 = (class07211)class072102.u().L((class08092)class06758.y);
        class07209 class072092 = class072102.L().method_10093(class072112);
        class00500 class005002 = class047822.method_8320(class072092);
        if (class05989.N((class07299)class047822, (class07209)class072092, (class07211)class072112)) {
            class047822.method_8501(class072092, class05989.y((class07290)class047822, (class07209)class072092));
            class047822.N(null, (class03556)class01194.Z, class072092);
        } else if (class05847.T((class00500)class005002) || class05440.v((class00500)class005002) || class05467.v((class00500)class005002)) {
            class047822.method_8501(class072092, (class00500)class005002.y((class08092)class06665.n, (Comparable)Boolean.valueOf(true)));
            class047822.N(null, (class03556)class01194.L, class072092);
        } else if (class005002.i() instanceof class00655) {
            if (class00655.N((class07299)class047822, class072092)) {
                class047822.method_8650(class072092, false);
            } else {
                this.N(false);
            }
        } else {
            this.N(false);
        }
        if (this.y()) {
            class065842.N(1, class047822, null, class065812 -> {});
        }
        return class065842;
    }
}

