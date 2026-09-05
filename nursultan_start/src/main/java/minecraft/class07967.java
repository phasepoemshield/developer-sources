/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class04770
 *  minecraft.class07438
 *  minecraft.class07473
 *  minecraft.class07876
 */
package minecraft;

import minecraft.class04770;
import minecraft.class07438;
import minecraft.class07473;
import minecraft.class07876;

public class class07967
extends class07473 {
    private final class07876 N;
    private boolean y;

    public void L() {
        this.y = false;
    }

    public class07967(class07876 class078762) {
        this.N = class078762;
    }

    public void i() {
        if (this.y || this.N.Ng() || this.N.g_()) {
            return;
        }
        class07438 class074382 = this.N.L_();
        if (class074382 instanceof class04770) {
            class04770 class047702 = (class04770)class074382;
            if (this.N.method_5829().L(class047702.method_5829())) {
                this.y = this.N.N(class047702);
            }
        }
    }

    public boolean N() {
        class07438 class074382 = this.N.L_();
        if (class074382 instanceof class04770) {
            class04770 class047702 = (class04770)class074382;
            boolean bl = !class047702.method_7325() && !class047702.method_31549().y && !class047702.method_5799() && !class047702.field_27857;
            return !this.N.NJ() && bl && this.N.v();
        }
        return false;
    }

    public boolean O_() {
        return !this.y;
    }
}

