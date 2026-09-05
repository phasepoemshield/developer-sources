/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class07047
 *  minecraft.class07049
 *  minecraft.class07055
 *  minecraft.class07430
 *  minecraft.class07438
 *  minecraft.class07473
 *  minecraft.class08036
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.util.EnumSet;
import minecraft.class07047;
import minecraft.class07049;
import minecraft.class07055;
import minecraft.class07430;
import minecraft.class07438;
import minecraft.class07473;
import minecraft.class07618;
import minecraft.class08036;
import org.jspecify.annotations.Nullable;

class class07635
extends class07473 {
    private final class07618 N;
    private final double y;
    private @Nullable class08036 L;

    public void L() {
        this.L.method_37222(new class07055(class07047.O, 100), (class07049)this.N);
    }

    class07635(class07618 class076182, double d) {
        this.N = class076182;
        this.y = d;
        this.N_71(EnumSet.of(class07430.field_18405, class07430.field_18406));
    }

    public void i() {
        this.N.p().N((class07049)this.L, (float)(this.N.NR() + 20), (float)this.N.Ni());
        if (this.N.method_5858((class07049)this.L) < 6.25) {
            this.N.f().W();
        } else {
            this.N.f().N((class07049)this.L, this.y);
        }
        if (this.L.method_5681() && this.L.method_73183().field_9229.y(6) == 0) {
            this.L.method_37222(new class07055(class07047.O, 100), (class07049)this.N);
        }
    }

    public void u() {
        this.L = null;
        this.N.f().W();
    }

    public boolean y() {
        return this.L != null && this.L.method_5681() && this.N.method_5858((class07049)this.L) < 256.0;
    }

    public boolean N() {
        this.L = class07635.N((class07049)this.N).N(class07618.N, (class07438)this.N);
        if (this.L == null) {
            return false;
        }
        return this.L.method_5681() && this.N.T() != this.L;
    }
}

