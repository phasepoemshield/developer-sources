/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class07049
 *  minecraft.class07438
 *  minecraft.class07473
 */
package minecraft;

import minecraft.class07049;
import minecraft.class07438;
import minecraft.class07473;
import minecraft.class07871;

class class07902
extends class07473 {
    private final class07871 N;

    public void L() {
        this.N.N = 1;
        this.N.y = 0;
    }

    public class07902(class07871 class078712) {
        this.N = class078712;
    }

    public void u() {
        this.N.N = 0;
    }

    public boolean N() {
        return !this.N.method_73183().N(class07438.class, this.N.method_5829().M(2.0), class074382 -> class07871.L.N(class07902.N((class07049)this.N), (class07438)this.N, class074382)).isEmpty();
    }
}

