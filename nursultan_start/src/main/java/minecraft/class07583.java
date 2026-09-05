/*
 * Decompiled with CFR 0.152.
 */
package minecraft;

public interface class07583 {
    default public boolean L(int n, int n2, int n3) {
        return n >= n3 / 2 && n < n3 && n2 >= 0 && n2 < n3;
    }

    default public boolean M(int n, int n2, int n3) {
        return n >= 0 && n < n3 / 2 && n2 >= n3 / 2 && n2 < n3;
    }

    default public boolean i(int n, int n2, int n3) {
        return n >= n3 / 2 && n < n3 && n2 >= n3 / 2 && n2 < n3;
    }

    default public boolean u(int n, int n2, int n3) {
        return n >= n3 / 2 && n < n3 && n2 >= 0 && n2 < n3 / 2;
    }

    default public boolean y(int n, int n2, int n3) {
        return n >= 0 && n < n3 / 2 && n2 >= 0 && n2 < n3;
    }

    default public boolean N(int n, int n2, int n3) {
        return n >= 0 && n < n3 && n2 >= 0 && n2 < n3;
    }

    default public boolean R(int n, int n2, int n3) {
        return n >= 0 && n < n3 / 2 && n2 >= 0 && n2 < n3 / 2;
    }
}

