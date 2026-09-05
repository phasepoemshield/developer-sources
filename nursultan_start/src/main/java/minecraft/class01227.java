/*
 * Decompiled with CFR 0.152.
 */
package minecraft;

class class01227 {
    private final int[][] L;
    final int N;
    final int y;
    private final int u;

    public class01227(int n, int n2, int n3) {
        this.N = n;
        this.y = n2;
        this.u = n3;
        this.L = new int[n][n2];
    }

    public boolean y(int n, int n2, int n3) {
        return this.N(n - 1, n2) == n3 || this.N(n + 1, n2) == n3 || this.N(n, n2 + 1) == n3 || this.N(n, n2 - 1) == n3;
    }

    public int N(int n, int n2) {
        if (n >= 0 && n < this.N && n2 >= 0 && n2 < this.y) {
            return this.L[n][n2];
        }
        return this.u;
    }

    public void N(int n, int n2, int n3, int n4) {
        if (this.N(n, n2) == n3) {
            this.N(n, n2, n4);
        }
    }

    public void N(int n, int n2, int n3) {
        if (n >= 0 && n < this.N && n2 >= 0 && n2 < this.y) {
            this.L[n][n2] = n3;
        }
    }

    public void N(int n, int n2, int n3, int n4, int n5) {
        for (int i = n2; i <= n4; ++i) {
            for (int j = n; j <= n3; ++j) {
                this.N(j, i, n5);
            }
        }
    }
}

