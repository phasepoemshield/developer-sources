/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01894
 *  minecraft.class04689
 *  minecraft.class07769
 *  minecraft.class08829
 *  minecraft.class08918
 */
package minecraft;

import minecraft.class01894;
import minecraft.class04689;
import minecraft.class07769;
import minecraft.class08265;
import minecraft.class08280;
import minecraft.class08829;
import minecraft.class08918;

class class08258
implements AutoCloseable {
    private class07769 y;
    private final class08829 L;
    private boolean u = true;
    final class01894 N;

    class08258(class08265 class082652, int n, class07769 class077692) {
        this.y = class077692;
        this.L = new class08829(() -> "Map " + n, 128, 128, true);
        this.N = class01894.y((String)("map/" + n));
        class082652.N.N(this.N, (class08918)this.L);
    }

    @Override
    public void close() {
        this.L.close();
    }

    void y() {
        if (this.u) {
            class08280 class082802 = this.L.method_4525();
            if (class082802 != null) {
                for (int i = 0; i < 128; ++i) {
                    for (int j = 0; j < 128; ++j) {
                        int n = j + i * 128;
                        class082802.y(j, i, class04689.y((int)this.y.B[n]));
                    }
                }
            }
            this.L.method_4524();
            this.u = false;
        }
    }

    public void N() {
        this.u = true;
    }

    void N(class07769 class077692) {
        boolean bl = this.y != class077692;
        this.y = class077692;
        this.u |= bl;
    }
}

