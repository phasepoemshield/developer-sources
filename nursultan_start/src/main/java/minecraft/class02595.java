/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class04995
 *  minecraft.class07586
 */
package minecraft;

import minecraft.class04995;
import minecraft.class07586;

public class class02595 {
    private final int N;
    private final class07586 y;
    private int L;
    private int u;

    public class02595(int n, class07586 class075862) {
        this.N = n;
        this.y = class075862;
    }

    public class02595(int n) {
        this(n, class07586.u);
    }

    public float N(float f) {
        float f2 = class04995.B((float)f, (float)this.u, (float)this.L) / (float)this.N;
        return this.y.apply(f2);
    }

    public void N(boolean bl) {
        this.u = this.L;
        if (bl) {
            if (this.L < this.N) {
                ++this.L;
            }
        } else if (this.L > 0) {
            --this.L;
        }
    }
}

