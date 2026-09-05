/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01989
 *  minecraft.class03811
 *  minecraft.class04782
 *  minecraft.class06584
 *  minecraft.class06758
 *  minecraft.class07042
 *  minecraft.class07209
 *  minecraft.class07210
 *  minecraft.class07211
 *  minecraft.class08092
 */
package minecraft;

import java.util.Iterator;
import java.util.List;
import minecraft.class00734;
import minecraft.class01989;
import minecraft.class03811;
import minecraft.class04782;
import minecraft.class06584;
import minecraft.class06758;
import minecraft.class07042;
import minecraft.class07209;
import minecraft.class07210;
import minecraft.class07211;
import minecraft.class08092;

class class00732
extends class01989 {
    class00732() {
    }

    protected class06584 N(class07210 class072102, class06584 class065842) {
        class07209 class072092;
        class04782 class047822 = class072102.y();
        List var5 = class047822.N(class03811.class, new class00734(class072092 = class072102.L().method_10093((class07211)class072102.u().L((class08092)class06758.y))), class07042.R);
        if (var5.isEmpty()) {
            this.N(false);
            return class065842;
        }
        Iterator var6 = var5.iterator();
        while (var6.hasNext()) {
            if (!((class03811)var6.next()).N(null, class065842)) continue;
            class065842.N(16, class047822, null, class065812 -> {});
            return class065842;
        }
        this.N(false);
        return class065842;
    }
}

