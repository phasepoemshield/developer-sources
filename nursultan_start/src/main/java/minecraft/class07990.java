/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class06171
 *  minecraft.class07049
 *  minecraft.class07430
 *  minecraft.class07473
 */
package minecraft;

import java.util.EnumSet;
import minecraft.class06171;
import minecraft.class07049;
import minecraft.class07430;
import minecraft.class07473;
import minecraft.class08036;

public class class07990
extends class07473 {
    private final class06171 N;

    public void L() {
        this.N.f().W();
    }

    public class07990(class06171 class061712) {
        this.N = class061712;
        this.N_71(EnumSet.of(class07430.field_18407, class07430.field_18405));
    }

    public void u() {
        this.N.N(null);
    }

    public boolean N() {
        if (!this.N.method_5805()) {
            return false;
        }
        if (this.N.method_5799()) {
            return false;
        }
        if (!this.N.method_24828()) {
            return false;
        }
        if (this.N.field_6037) {
            return false;
        }
        class08036 class080362 = this.N.N();
        if (class080362 == null) {
            return false;
        }
        return !(this.N.method_5858((class07049)class080362) > 16.0);
    }
}

