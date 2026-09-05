/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class07430
 *  minecraft.class07458
 *  minecraft.class07473
 */
package minecraft;

import java.util.EnumSet;
import minecraft.class07143;
import minecraft.class07162;
import minecraft.class07430;
import minecraft.class07458;
import minecraft.class07473;

class class07161
extends class07473 {
    private final class07162 N;

    public class07161(class07162 class071622) {
        this.N = class071622;
        this.N_71(EnumSet.of(class07430.field_18407, class07430.field_18405));
        class071622.f().N(true);
    }

    public boolean B() {
        return true;
    }

    public void i() {
        class07458 class074582;
        if (this.N.method_59922().z() < 0.8f) {
            this.N.A().y();
        }
        if ((class074582 = this.N.F()) instanceof class07143) {
            ((class07143)class074582).N(1.2);
        }
    }

    public boolean N() {
        return (this.N.method_5799() || this.N.method_5771()) && this.N.F() instanceof class07143;
    }
}

