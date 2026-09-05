/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class01454
 *  minecraft.class01462
 *  minecraft.class03556
 *  minecraft.class05216
 *  minecraft.class07084
 */
package minecraft;

import minecraft.class00392;
import minecraft.class01454;
import minecraft.class01462;
import minecraft.class03556;
import minecraft.class05216;
import minecraft.class07084;

class class01480
extends class01462 {
    final /* synthetic */ class01454 L;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    public class01480(class01454 class014542, int n, int n2, class03556 class035562) {
        this.L = class014542;
        super(class014542, n, n2, class035562, false, 3);
    }

    protected class05216 y(class03556<class07084> class035562) {
        return class00392.L((String)((class07084)class035562.N()).R()).i(" II");
    }

    public void N(int n) {
        if (this.L.G != null) {
            this.field_22764 = true;
            this.N(this.L.G);
            super.N(n);
        } else {
            this.field_22764 = false;
        }
    }
}

