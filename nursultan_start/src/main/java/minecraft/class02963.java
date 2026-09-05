/*
 * Decompiled with CFR 0.152.
 */
package minecraft;

public class class02963 {
    private int N;
    private int y;
    private int L;
    private int u;

    public int L() {
        return this.L;
    }

    public void L(int n) {
        this.L = n;
    }

    public class02963(int n, int n2, int n3, int n4) {
        this.N = n;
        this.y = n2;
        this.L = n3;
        this.u = n4;
    }

    public void u(int n) {
        this.u = n;
    }

    public int u() {
        return this.u;
    }

    public boolean y(int n, int n2) {
        return n >= this.N && n <= this.N + this.L && n2 >= this.y && n2 <= this.y + this.u;
    }

    public int y() {
        return this.y;
    }

    public void y(int n) {
        this.y = n;
    }

    public void N(int n) {
        this.N = n;
    }

    public void N(int n, int n2) {
        this.N = n;
        this.y = n2;
    }

    public int N() {
        return this.N;
    }

    public class02963 N(class02963 class029632) {
        int n = this.N;
        int n2 = this.y;
        int n3 = this.N + this.L;
        int n4 = this.y + this.u;
        int n5 = class029632.N();
        int n6 = class029632.y();
        int n7 = n5 + class029632.L();
        int n8 = n6 + class029632.u();
        this.N = Math.max(n, n5);
        this.y = Math.max(n2, n6);
        this.L = Math.max(0, Math.min(n3, n7) - this.N);
        this.u = Math.max(0, Math.min(n4, n8) - this.y);
        return this;
    }
}

