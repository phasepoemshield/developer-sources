/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class07049
 *  minecraft.class07430
 *  minecraft.class07438
 *  minecraft.class07453
 *  minecraft.class07473
 */
package minecraft;

import java.util.EnumSet;
import minecraft.class07049;
import minecraft.class07430;
import minecraft.class07438;
import minecraft.class07453;
import minecraft.class07473;

public class class07958
extends class07473 {
    private final class07453 N;

    public void L() {
        this.N.f().W();
        this.N.B(true);
    }

    public class07958(class07453 class074532) {
        this.N = class074532;
        this.N_71(EnumSet.of(class07430.field_18407, class07430.field_18405));
    }

    public void u() {
        this.N.B(false);
    }

    public boolean y() {
        return this.N.NJ();
    }

    public boolean N() {
        boolean bl = this.N.NJ();
        if (!bl && !this.N.NQ()) {
            return false;
        }
        if (this.N.method_5799()) {
            return false;
        }
        if (!this.N.method_24828()) {
            return false;
        }
        class07438 class074382 = this.N.L_();
        if (class074382 == null || class074382.method_73183() != this.N.method_73183()) {
            return true;
        }
        if (this.N.method_5858((class07049)class074382) < 144.0 && class074382.method_6065() != null) {
            return false;
        }
        return bl;
    }
}

