/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09887
 */
package Nursultan;

import Nursultan.class09887;

final class class09905 {
    private boolean N;
    private boolean y;
    private float L;
    private float u;
    private float i;
    private float R;
    private float M;
    private int B;

    private boolean L(class09887 class098872, float f) {
        if (this.y == (class098872 == null)) {
            return true;
        }
        if (class098872 != null && this.N(class098872)) {
            return true;
        }
        return !class09905.N(this.M, f);
    }

    class09905() {
    }

    private void y(class09887 class098872, float f) {
        this.N = true;
        boolean bl = this.y = class098872 != null;
        if (class098872 != null) {
            this.L = class098872.y();
            this.u = class098872.L();
            this.i = class098872.u();
            this.R = class098872.i();
        }
        this.M = f;
    }

    private static boolean N(float f, float f2) {
        return Float.floatToIntBits(f) == Float.floatToIntBits(f2);
    }

    private boolean N(class09887 class098872) {
        return !class09905.N(this.L, class098872.y()) || !class09905.N(this.u, class098872.L()) || !class09905.N(this.i, class098872.u()) || !class09905.N(this.R, class098872.i());
    }

    int N(class09887 class098872, float f) {
        if (!this.N || this.L(class098872, f)) {
            this.y(class098872, f);
            ++this.B;
        }
        return this.B;
    }
}

