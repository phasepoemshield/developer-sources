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

class class07174
extends class07473 {
    private final class07162 N;

    public class07174(class07162 class071622) {
        this.N = class071622;
        this.N_71(EnumSet.of(class07430.field_18407, class07430.field_18405));
    }

    public void i() {
        class07458 class074582 = this.N.F();
        if (class074582 instanceof class07143) {
            ((class07143)class074582).N(1.0);
        }
    }

    public boolean N() {
        return !this.N.method_5765();
    }
}

