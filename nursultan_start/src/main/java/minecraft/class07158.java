/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class07049
 *  minecraft.class07430
 *  minecraft.class07438
 *  minecraft.class07458
 *  minecraft.class07473
 */
package minecraft;

import java.util.EnumSet;
import minecraft.class07049;
import minecraft.class07143;
import minecraft.class07162;
import minecraft.class07430;
import minecraft.class07438;
import minecraft.class07458;
import minecraft.class07473;

class class07158
extends class07473 {
    private final class07162 N;
    private int y;

    public void L() {
        this.y = class07158.y((int)300);
        super.L();
    }

    public class07158(class07162 class071622) {
        this.N = class071622;
        this.N_71(EnumSet.of(class07430.field_18406));
    }

    public boolean B() {
        return true;
    }

    public void i() {
        class07458 class074582;
        class07438 class074382 = this.N.T();
        if (class074382 != null) {
            this.N.N((class07049)class074382, 10.0f, 10.0f);
        }
        if ((class074582 = this.N.F()) instanceof class07143) {
            ((class07143)class074582).N(this.N.method_36454(), this.N.W());
        }
    }

    public boolean y() {
        class07438 class074382 = this.N.T();
        if (class074382 == null) {
            return false;
        }
        if (!this.N.method_18395(class074382)) {
            return false;
        }
        return --this.y > 0;
    }

    public boolean N() {
        class07438 class074382 = this.N.T();
        if (class074382 == null) {
            return false;
        }
        if (!this.N.method_18395(class074382)) {
            return false;
        }
        return this.N.F() instanceof class07143;
    }
}

