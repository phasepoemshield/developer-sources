/*
 * Decompiled with CFR 0.152.
 */
package Nursultan;

public class class11395 {
    public static Object N_0;
    public Object y_0;
    public boolean y_init;

    public class11395() {
        this.i();
    }

    static {
        class11395.u();
        N_0 = new class11395();
    }

    private void i() {
        if (!this.y_init) {
            this.y_init = true;
            this.y_0 = 0;
        }
    }

    private static void u() {
    }

    public class11395 y(int n) {
        this.y_0 = n;
        return this;
    }

    public int N() {
        return (Integer)this.y_0;
    }

    public static class11395 N(int n) {
        ((class11395)class11395.N_0).y_0 = n;
        return (class11395)N_0;
    }
}

