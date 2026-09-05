/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class07473
 */
package minecraft;

import minecraft.class07473;
import minecraft.class07637;

class class07630
extends class07473 {
    private final class07637 N;

    public void L() {
        this.N.Z(true);
    }

    public class07630(class07637 class076372) {
        this.N = class076372;
    }

    public boolean y() {
        return false;
    }

    public boolean N() {
        if (!this.N.method_6109() || !this.N.No()) {
            return false;
        }
        if (this.N.NO() && class07637.L(this.N).y(class07630.y((int)500)) == 1) {
            return true;
        }
        return class07637.u(this.N).y(class07630.y((int)6000)) == 1;
    }
}

