/*
 * Decompiled with CFR 0.152.
 */
package Nursultan;

public class class10947 {
    public static Object N_0;
    public Object y_0;
    public boolean y_init;

    private void L() {
        if (!this.y_init) {
            this.y_init = true;
            this.y_0 = false;
        }
    }

    public class10947() {
        this.L();
    }

    static {
        class10947.R();
        N_0 = new class10947();
    }

    public boolean y() {
        return (Boolean)this.y_0;
    }

    public static class10947 N() {
        return (class10947)N_0;
    }

    public class10947 N(boolean bl) {
        this.y_0 = bl;
        return this;
    }

    private static void R() {
    }
}

