/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01763
 */
package minecraft;

import java.util.Arrays;
import minecraft.class01763;

public class class05334 {
    private class01763[] N = new class01763[128];
    private int y;

    public class01763 L() {
        class01763 class017632 = this.N[0];
        this.N[0] = this.N[--this.y];
        this.N[this.y] = null;
        if (this.y > 0) {
            this.y(0);
        }
        class017632.u = -1;
        return class017632;
    }

    public boolean i() {
        return this.y == 0;
    }

    public int u() {
        return this.y;
    }

    private void y(int n) {
        class01763 class017632 = this.N[n];
        float f = class017632.M;
        while (true) {
            float f2;
            class01763 class017633;
            int n2 = 1 + (n << 1);
            int n3 = n2 + 1;
            if (n2 >= this.y) break;
            class01763 class017634 = this.N[n2];
            float f3 = class017634.M;
            if (n3 >= this.y) {
                class017633 = null;
                f2 = Float.POSITIVE_INFINITY;
            } else {
                class017633 = this.N[n3];
                f2 = class017633.M;
            }
            if (f3 < f2) {
                if (!(f3 < f)) break;
                this.N[n] = class017634;
                class017634.u = n;
                n = n2;
                continue;
            }
            if (!(f2 < f)) break;
            this.N[n] = class017633;
            class017633.u = n;
            n = n3;
        }
        this.N[n] = class017632;
        class017632.u = n;
    }

    public void y(class01763 class017632) {
        this.N[class017632.u] = this.N[--this.y];
        this.N[this.y] = null;
        if (this.y > class017632.u) {
            if (this.N[class017632.u].M < class017632.M) {
                this.N(class017632.u);
            } else {
                this.y(class017632.u);
            }
        }
        class017632.u = -1;
    }

    public class01763 y() {
        return this.N[0];
    }

    private void N(int n) {
        class01763 class017632 = this.N[n];
        float f = class017632.M;
        while (n > 0) {
            int n2 = n - 1 >> 1;
            class01763 class017633 = this.N[n2];
            if (!(f < class017633.M)) break;
            this.N[n] = class017633;
            class017633.u = n;
            n = n2;
        }
        this.N[n] = class017632;
        class017632.u = n;
    }

    public class01763 N(class01763 class017632) {
        if (class017632.u >= 0) {
            throw new IllegalStateException("OW KNOWS!");
        }
        if (this.y == this.N.length) {
            class01763[] class01763Array = new class01763[this.y << 1];
            System.arraycopy(this.N, 0, class01763Array, 0, this.y);
            this.N = class01763Array;
        }
        this.N[this.y] = class017632;
        class017632.u = this.y;
        this.N(this.y++);
        return class017632;
    }

    public void N() {
        this.y = 0;
    }

    public void N(class01763 class017632, float f) {
        float f2 = class017632.M;
        class017632.M = f;
        if (f < f2) {
            this.N(class017632.u);
        } else {
            this.y(class017632.u);
        }
    }

    public class01763[] R() {
        return Arrays.copyOf(this.N, this.y);
    }
}

