/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class04782
 *  minecraft.class07049
 *  minecraft.class07079
 *  minecraft.class07438
 *  minecraft.class07962
 *  minecraft.class08036
 */
package minecraft;

import minecraft.class04782;
import minecraft.class07049;
import minecraft.class07079;
import minecraft.class07438;
import minecraft.class07637;
import minecraft.class07962;
import minecraft.class08036;

class class07646
extends class07962 {
    private final class07637 B;

    public class07646(class07637 class076372, Class<? extends class07438> clazz, float f) {
        super((class07079)class076372, clazz, f);
        this.B = class076372;
    }

    public void i() {
        if (this.L != null) {
            super.i();
        }
    }

    public boolean y() {
        return this.L != null && super.y();
    }

    public void N(class07438 class074382) {
        this.L = class074382;
    }

    public boolean N() {
        if (this.y.method_59922().z() >= this.i) {
            return false;
        }
        if (this.L == null) {
            class04782 class047822 = class07646.N((class07049)this.y);
            this.L = this.R == class08036.class ? class047822.N(this.M, (class07438)this.y, this.y.method_23317(), this.y.method_23320(), this.y.method_23321()) : class047822.N(this.y.method_73183().N(this.R, this.y.method_5829().L((double)this.u, 3.0, (double)this.u), class074382 -> true), this.M, (class07438)this.y, this.y.method_23317(), this.y.method_23320(), this.y.method_23321());
        }
        return this.B.No() && this.L != null;
    }
}

