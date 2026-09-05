/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class04995
 *  minecraft.class06889
 *  minecraft.class07473
 */
package minecraft;

import minecraft.class04995;
import minecraft.class06889;
import minecraft.class07473;
import minecraft.class07883;

class class07889
extends class07473 {
    private final class07883 N;

    public class07889(class07883 class078832) {
        this.N = class078832;
    }

    public void i() {
        if (this.N.method_6131() > 100) {
            this.N.Z = class06889.L;
        } else if (this.N.method_59922().y(class07889.y((int)50)) == 0 || !class07883.N(this.N) || !this.N.m()) {
            float f = this.N.method_59922().z() * ((float)Math.PI * 2);
            this.N.Z = new class06889((double)(class04995.P((double)f) * 0.2f), (double)(-0.1f + this.N.method_59922().z() * 0.2f), (double)(class04995.m((double)f) * 0.2f));
        }
    }

    public boolean N() {
        return true;
    }
}

