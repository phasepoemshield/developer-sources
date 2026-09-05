/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00734
 *  minecraft.class01217
 *  minecraft.class01328
 *  minecraft.class06570
 *  minecraft.class06581
 *  minecraft.class07049
 *  minecraft.class07079
 *  minecraft.class07430
 *  minecraft.class07438
 *  minecraft.class07473
 *  minecraft.class07625
 *  minecraft.class08982
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.util.EnumSet;
import minecraft.class00734;
import minecraft.class01217;
import minecraft.class01328;
import minecraft.class06570;
import minecraft.class06581;
import minecraft.class07049;
import minecraft.class07079;
import minecraft.class07430;
import minecraft.class07438;
import minecraft.class07473;
import minecraft.class07625;
import minecraft.class08982;
import org.jspecify.annotations.Nullable;

public class class07995
extends class07473 {
    private static final class01328 y = class01328.y().N(6.0);
    private static final class06581 L = class06570.ud;
    public static final int N = 400;
    private final class07625 u;
    private @Nullable class07438 i;
    private int R;

    public void L() {
        this.R = this.N(400);
        this.u.N(true);
    }

    private class00734 M() {
        return this.u.method_5829().L(6.0, 2.0, 6.0);
    }

    public class07995(class07625 class076252) {
        this.u = class076252;
        this.N_71(EnumSet.of(class07430.field_18405, class07430.field_18406));
    }

    public void i() {
        if (this.i != null) {
            this.u.p().N((class07049)this.i, 30.0f, 30.0f);
        }
        --this.R;
    }

    public void u() {
        class07079 class070792;
        class07438 class074382;
        this.u.N(false);
        if (this.R == 0 && (class074382 = this.i) instanceof class07079 && (class070792 = (class07079)class074382).method_5864().N(class01217.p) && class070792.method_6118(class08982.N).R() && this.M().L(class070792.method_5829())) {
            class070792.method_5673(class08982.N, L.E());
            class070792.N(class08982.N);
        }
        this.i = null;
    }

    public boolean y() {
        return this.R > 0;
    }

    public boolean N() {
        if (!this.u.method_73183().method_8530()) {
            return false;
        }
        if (this.u.method_59922().y(8000) != 0) {
            return false;
        }
        this.i = class07995.N((class07049)this.u).N(class01217.F, y, (class07438)this.u, this.u.method_23317(), this.u.method_23318(), this.u.method_23321(), this.M());
        return this.i != null;
    }
}

