/*
 * Decompiled with CFR 0.152.
 */
package Nursultan;

import Nursultan.class09957;

public final class class09953 {
    public static final int N = Integer.MAX_VALUE;
    public static final int y = 0;
    public static final int L = 1;
    private int[] u;
    private int[] i;
    private int[] R;
    private int M;
    private int B;
    private int Z;
    private int z;
    private int U;
    private int E;
    private int W;
    private int[] m;
    private int P;
    private int s;
    private int T;
    private int b;
    private static final int j = -2;
    private static final int v = -1;

    private boolean L(int n, int n2) {
        int n3;
        this.y(n, n2);
        if (this.b == -2 || this.T + n2 > this.B || this.W == -1) {
            this.b = -2;
            return false;
        }
        int n4 = this.W;
        this.u[n4] = this.s;
        this.i[n4] = this.T + n2;
        this.W = this.R[n4];
        int n5 = this.y(this.b);
        if (this.u[n5] < this.s) {
            n3 = this.R[n5];
            this.R[n5] = n4;
            n5 = n3;
        } else {
            this.N(this.b, n4);
        }
        n3 = this.s + n;
        while (this.R[n5] != -1 && this.u[this.R[n5]] <= n3) {
            int n6 = this.R[n5];
            this.R[n5] = this.W;
            this.W = n5;
            n5 = n6;
        }
        this.R[n4] = n5;
        if (this.u[n5] < n3) {
            this.u[n5] = n3;
        }
        return true;
    }

    private int y(int n) {
        return n == -1 ? this.E : this.R[n];
    }

    private int y(int n, int n2, int n3) {
        int n4 = n;
        int n5 = n2 + n3;
        int n6 = 0;
        int n7 = 0;
        int n8 = 0;
        while (this.u[n4] < n5) {
            int n9 = this.i[n4];
            int n10 = this.u[n4];
            int n11 = this.u[this.R[n4]];
            if (n9 > n6) {
                n7 += n8 * (n9 - n6);
                n6 = n9;
                n8 += n10 < n2 ? n11 - n2 : n11 - n10;
            } else {
                int n12 = n11 - n10;
                if (n12 + n8 > n3) {
                    n12 = n3 - n8;
                }
                n7 += n12 * (n6 - n9);
                n8 += n12;
            }
            n4 = this.R[n4];
        }
        this.P = n7;
        return n6;
    }

    private void y(int n, int n2) {
        int n3;
        int n4;
        int n5 = 0x40000000;
        int n6 = 0x40000000;
        int n7 = 0;
        int n8 = -2;
        n = n + this.Z - 1;
        if ((n -= n % this.Z) > this.M || n2 > this.B) {
            this.b = -2;
            this.s = 0;
            this.T = 0;
            return;
        }
        int n9 = this.E;
        int n10 = -1;
        while (this.u[n9] + n <= this.M) {
            n4 = this.y(n9, this.u[n9], n);
            n3 = this.P;
            if (this.z == 0) {
                if (n4 < n6) {
                    n6 = n4;
                    n8 = n10;
                }
            } else if (n4 + n2 <= this.B && (n4 < n6 || n4 == n6 && n3 < n5)) {
                n6 = n4;
                n5 = n3;
                n8 = n10;
            }
            n10 = n9;
            n9 = this.R[n9];
        }
        int n11 = n7 = n8 == -2 ? 0 : this.u[this.y(n8)];
        if (this.z == 1) {
            n4 = this.E;
            n9 = this.E;
            n10 = -1;
            while (this.u[n4] < n) {
                n4 = this.R[n4];
            }
            while (n4 != -1) {
                n3 = this.u[n4] - n;
                while (this.u[this.R[n9]] <= n3) {
                    n10 = n9;
                    n9 = this.R[n9];
                }
                int n12 = this.y(n9, n3, n);
                int n13 = this.P;
                if (n12 + n2 <= this.B && n12 <= n6 && (n12 < n6 || n13 < n5 || n13 == n5 && n3 < n7)) {
                    n7 = n3;
                    n6 = n12;
                    n5 = n13;
                    n8 = n10;
                }
                n4 = this.R[n4];
            }
        }
        this.b = n8;
        this.s = n7;
        this.T = n6;
    }

    private static int y(int[] nArray, class09957[] class09957Array, int n, int n2) {
        int n3 = n + (n2 - n >>> 1);
        if (class09953.N(class09957Array, nArray[n], nArray[n3]) > 0) {
            class09953.N(nArray, n, n3);
        }
        if (class09953.N(class09957Array, nArray[n], nArray[n2]) > 0) {
            class09953.N(nArray, n, n2);
        }
        if (class09953.N(class09957Array, nArray[n3], nArray[n2]) > 0) {
            class09953.N(nArray, n3, n2);
        }
        class09953.N(nArray, n3, n2);
        int n4 = nArray[n2];
        int n5 = n - 1;
        for (int i = n; i < n2; ++i) {
            if (class09953.N(class09957Array, nArray[i], n4) > 0) continue;
            class09953.N(nArray, ++n5, i);
        }
        class09953.N(nArray, n5 + 1, n2);
        return n5 + 1;
    }

    private static int y(int[] nArray, int[] nArray2, int[] nArray3, int n, int n2) {
        int n3 = n + (n2 - n >>> 1);
        if (class09953.N(nArray3, nArray2, nArray[n], nArray[n3]) > 0) {
            class09953.N(nArray, n, n3);
        }
        if (class09953.N(nArray3, nArray2, nArray[n], nArray[n2]) > 0) {
            class09953.N(nArray, n, n2);
        }
        if (class09953.N(nArray3, nArray2, nArray[n3], nArray[n2]) > 0) {
            class09953.N(nArray, n3, n2);
        }
        class09953.N(nArray, n3, n2);
        int n4 = nArray[n2];
        int n5 = n - 1;
        for (int i = n; i < n2; ++i) {
            if (class09953.N(nArray3, nArray2, nArray[i], n4) > 0) continue;
            class09953.N(nArray, ++n5, i);
        }
        class09953.N(nArray, n5 + 1, n2);
        return n5 + 1;
    }

    public void N(int n) {
        this.z = n;
    }

    private static int N(int[] nArray, int[] nArray2, int n, int n2) {
        int n3 = nArray[n2] - nArray[n];
        if (n3 != 0) {
            return n3;
        }
        int n4 = nArray2[n2] - nArray2[n];
        if (n4 != 0) {
            return n4;
        }
        return n - n2;
    }

    private static void N(int[] nArray, int n, int n2) {
        int n3 = nArray[n];
        nArray[n] = nArray[n2];
        nArray[n2] = n3;
    }

    private static void N(int[] nArray, class09957[] class09957Array, int n, int n2) {
        while (n < n2) {
            int n3 = class09953.y(nArray, class09957Array, n, n2);
            if (n3 - n < n2 - n3) {
                class09953.N(nArray, class09957Array, n, n3 - 1);
                n = n3 + 1;
                continue;
            }
            class09953.N(nArray, class09957Array, n3 + 1, n2);
            n2 = n3 - 1;
        }
    }

    public void N(int n, int n2, int n3) {
        int n4;
        this.M = n;
        this.B = n2;
        this.U = n3;
        this.z = 0;
        int n5 = n3 + 2;
        if (this.u == null || this.u.length < n5) {
            this.u = new int[n5];
            this.i = new int[n5];
            this.R = new int[n5];
        }
        for (n4 = 0; n4 < n3 - 1; ++n4) {
            this.R[n4] = n4 + 1;
        }
        this.R[n3 - 1] = -1;
        this.W = 0;
        n4 = n3;
        int n6 = n3 + 1;
        this.u[n4] = 0;
        this.i[n4] = 0;
        this.R[n4] = n6;
        this.u[n6] = n;
        this.i[n6] = 0x40000000;
        this.R[n6] = -1;
        this.E = n4;
        this.N(false);
    }

    private static int N(class09957[] class09957Array, int n, int n2) {
        int n3 = class09957Array[n2].L - class09957Array[n].L;
        if (n3 != 0) {
            return n3;
        }
        int n4 = class09957Array[n2].y - class09957Array[n].y;
        if (n4 != 0) {
            return n4;
        }
        return class09957Array[n].N - class09957Array[n2].N;
    }

    private void N(int n, int n2) {
        if (n == -1) {
            this.E = n2;
        } else {
            this.R[n] = n2;
        }
    }

    public boolean N(class09957[] class09957Array, int n) {
        int n2;
        if (this.m == null || this.m.length < n) {
            this.m = new int[n];
        }
        for (n2 = 0; n2 < n; n2 += 1) {
            this.m[n2] = n2;
        }
        class09953.N(this.m, class09957Array, 0, n - 1);
        n2 = 1;
        for (int i = 0; i < n; ++i) {
            int n3 = this.m[i];
            class09957 class099572 = class09957Array[n3];
            if (class099572.y == 0 || class099572.L == 0) {
                class099572.u = 0;
                class099572.i = 0;
                class099572.R = true;
                continue;
            }
            if (this.L(class099572.y, class099572.L)) {
                class099572.u = this.s;
                class099572.i = this.T;
                class099572.R = true;
                continue;
            }
            class099572.u = Integer.MAX_VALUE;
            class099572.i = Integer.MAX_VALUE;
            class099572.R = false;
            n2 = 0;
        }
        return n2 != 0;
    }

    public boolean N(int[] nArray, int[] nArray2, int[] nArray3, int[] nArray4, int[] nArray5, boolean[] blArray, int n) {
        int n2;
        if (this.m == null || this.m.length < n) {
            this.m = new int[n];
        }
        for (n2 = 0; n2 < n; n2 += 1) {
            this.m[n2] = n2;
        }
        class09953.N(this.m, nArray2, nArray3, 0, n - 1);
        n2 = 1;
        for (int i = 0; i < n; ++i) {
            int n3 = this.m[i];
            int n4 = nArray2[n3];
            int n5 = nArray3[n3];
            if (n4 == 0 || n5 == 0) {
                nArray4[n3] = 0;
                nArray5[n3] = 0;
                blArray[n3] = true;
                continue;
            }
            if (this.L(n4, n5)) {
                nArray4[n3] = this.s;
                nArray5[n3] = this.T;
                blArray[n3] = true;
                continue;
            }
            nArray4[n3] = Integer.MAX_VALUE;
            nArray5[n3] = Integer.MAX_VALUE;
            blArray[n3] = false;
            n2 = 0;
        }
        return n2 != 0;
    }

    public void N(boolean bl) {
        this.Z = bl ? 1 : (this.M + this.U - 1) / this.U;
    }

    private static void N(int[] nArray, int[] nArray2, int[] nArray3, int n, int n2) {
        while (n < n2) {
            int n3 = class09953.y(nArray, nArray2, nArray3, n, n2);
            if (n3 - n < n2 - n3) {
                class09953.N(nArray, nArray2, nArray3, n, n3 - 1);
                n = n3 + 1;
                continue;
            }
            class09953.N(nArray, nArray2, nArray3, n3 + 1, n2);
            n2 = n3 - 1;
        }
    }
}

