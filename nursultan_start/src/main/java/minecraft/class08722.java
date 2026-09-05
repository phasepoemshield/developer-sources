/*
 * Decompiled with CFR 0.152.
 */
package minecraft;

public class class08722 {
    private final int N;
    private final int y;
    private int L;

    public boolean L() {
        return this.L < this.y;
    }

    public class08722(int n, int n2) {
        this.N = n;
        this.y = n2;
    }

    public void y() {
        if (this.L > 0) {
            --this.L;
        }
    }

    public void N() {
        this.L += this.N;
    }
}

