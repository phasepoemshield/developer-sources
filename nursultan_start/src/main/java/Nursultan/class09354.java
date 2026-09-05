/*
 * Decompiled with CFR 0.152.
 */
package Nursultan;

public class class09354 {
    public static Object N_0;
    public Object y_0;
    public boolean y_init;

    public class09354() {
        this.i();
    }

    static {
        class09354.u();
        N_0 = new class09354();
    }

    private void i() {
        if (!this.y_init) {
            this.y_init = true;
            this.y_0 = 0;
        }
    }

    private static void u() {
    }

    public static class09354 y(int n) {
        ((class09354)class09354.N_0).y_0 = n;
        return (class09354)N_0;
    }

    public class09354 N(int n) {
        this.y_0 = n;
        return this;
    }

    public int N() {
        return (Integer)this.y_0;
    }
}

