/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00734
 *  minecraft.class01383
 *  minecraft.class03345
 */
package minecraft;

import minecraft.class00734;
import minecraft.class01383;
import minecraft.class03345;
import minecraft.class08222;
import minecraft.class08230;
import minecraft.class08239;

final class class08228
implements class08222 {
    private final class03345 y;
    final /* synthetic */ class08230 N;

    class08228(class08230 class082302, class03345 class033452) {
        this.N = class082302;
        this.y = class033452;
    }

    @Override
    public class00734 y() {
        return this.y.L();
    }

    @Override
    public void N(class08239 class082392, boolean bl, class01383 class013832, int n, int n2, boolean bl2) {
        class00734 class007342 = this.y.L();
        if (bl || class013832.method_23093(this.N().L())) {
            bl2 = bl2 && this.N.N(class007342.N, class007342.y, class007342.L, class007342.u, class007342.i, class007342.R, n2);
            class082392.visit(this, bl, n, bl2);
        }
    }

    @Override
    public class03345 N() {
        return this.y;
    }
}

