/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class07475
 *  minecraft.class07999
 */
package minecraft;

import minecraft.class07141;
import minecraft.class07475;
import minecraft.class07999;

class class07154
extends class07999 {
    public class07154(class07141 class071412) {
        super((class07475)class071412, 1.0, true);
    }

    public boolean y() {
        if (this.N.method_5718() >= 0.5f && this.N.method_59922().y(100) == 0) {
            this.N.y(null);
            return false;
        }
        return super.y();
    }

    public boolean N() {
        return super.N() && !this.N.method_5782();
    }
}

