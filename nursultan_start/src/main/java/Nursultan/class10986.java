/*
 * Decompiled with CFR 0.152.
 */
package Nursultan;

public class class10986 {
    public static Object N_0;
    public Object y_0;
    public boolean y_init;

    public class10986() {
        this.u();
    }

    static {
        class10986.y();
        N_0 = new class10986();
    }

    private void u() {
        if (!this.y_init) {
            this.y_init = true;
            this.y_0 = 0;
        }
    }

    private static void y() {
    }

    public class10986 y(int n) {
        this.y_0 = n;
        return this;
    }

    public static class10986 N(int n) {
        ((class10986)class10986.N_0).y_0 = n;
        return (class10986)N_0;
    }

    public int N() {
        return (Integer)this.y_0;
    }
}

