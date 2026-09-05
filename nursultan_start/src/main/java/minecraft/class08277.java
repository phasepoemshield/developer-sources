/*
 * Decompiled with CFR 0.152.
 */
package minecraft;

import minecraft.class08263;

class class08277 {
    private final int y;
    private final int L;
    private final int u;
    private final int i;
    private final String R;
    int N = 1;

    class08277(int n, int n2, int n3, int n4, String string) {
        this.y = n3;
        this.L = n;
        this.u = n2;
        this.i = n4;
        this.R = string;
    }

    public String toString() {
        return "id=" + this.y + ", source=" + class08263.N(this.L) + ", type=" + class08263.y(this.u) + ", severity=" + class08263.L(this.i) + ", message='" + this.R + "'";
    }

    boolean N(int n, int n2, int n3, int n4, String string) {
        return n2 == this.u && n == this.L && n3 == this.y && n4 == this.i && string.equals(this.R);
    }
}

