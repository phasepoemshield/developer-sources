/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.joml.Vector2i
 */
package minecraft;

import org.joml.Vector2i;

public class class02419 {
    private double N;
    private double y;

    public Vector2i N(double d, double d2) {
        if (this.N != 0.0 && Math.signum(d) != Math.signum(this.N)) {
            this.N = 0.0;
        }
        if (this.y != 0.0 && Math.signum(d2) != Math.signum(this.y)) {
            this.y = 0.0;
        }
        this.N += d;
        this.y += d2;
        int n = (int)this.N;
        int n2 = (int)this.y;
        if (n == 0 && n2 == 0) {
            return new Vector2i(0, 0);
        }
        this.N -= (double)n;
        this.y -= (double)n2;
        return new Vector2i(n, n2);
    }

    public static int N(double d, int n, int n2) {
        int n3 = (int)Math.signum(d);
        n -= n3;
        for (n = Math.max(-1, n); n < 0; n += n2) {
        }
        while (n >= n2) {
            n -= n2;
        }
        return n;
    }
}

