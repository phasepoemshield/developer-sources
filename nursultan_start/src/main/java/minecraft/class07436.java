/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01328
 *  minecraft.class04782
 *  minecraft.class06570
 *  minecraft.class06584
 *  minecraft.class07049
 *  minecraft.class07050
 *  minecraft.class07473
 *  minecraft.class07894
 *  minecraft.class08036
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.util.EnumSet;
import minecraft.class01328;
import minecraft.class04782;
import minecraft.class06570;
import minecraft.class06584;
import minecraft.class07049;
import minecraft.class07050;
import minecraft.class07430;
import minecraft.class07438;
import minecraft.class07473;
import minecraft.class07894;
import minecraft.class08036;
import org.jspecify.annotations.Nullable;

public class class07436
extends class07473 {
    private final class07894 N;
    private @Nullable class08036 y;
    private final class04782 L;
    private final float u;
    private int i;
    private final class01328 R;

    public void L() {
        this.N.N(true);
        this.i = this.N(40 + this.N.method_59922().y(40));
    }

    public class07436(class07894 class078942, float f) {
        this.N = class078942;
        this.L = class07436.N((class07049)class078942);
        this.u = f;
        this.R = class01328.y().N((double)f);
        this.N_71(EnumSet.of(class07430.field_18406));
    }

    public void i() {
        this.N.p().N(this.y.method_23317(), this.y.method_23320(), this.y.method_23321(), 10.0f, this.N.Ni());
        --this.i;
    }

    public void u() {
        this.N.N(false);
        this.y = null;
    }

    public boolean y() {
        if (!this.y.method_5805()) {
            return false;
        }
        if (this.N.method_5858((class07049)this.y) > (double)(this.u * this.u)) {
            return false;
        }
        return this.i > 0 && this.N(this.y);
    }

    public boolean N() {
        this.y = this.L.N(this.R, (class07438)this.N);
        if (this.y == null) {
            return false;
        }
        return this.N(this.y);
    }

    private boolean N(class08036 class080362) {
        for (class07050 class070502 : class07050.values()) {
            class06584 class065842 = class080362.method_5998(class070502);
            if (!class065842.N(class06570.vO) && !this.N.N(class065842)) continue;
            return true;
        }
        return false;
    }
}

