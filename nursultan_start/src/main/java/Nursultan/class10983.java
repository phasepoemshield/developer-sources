/*
 * Decompiled with CFR 0.152.
 */
package Nursultan;

public class class10983 {
    public Object N_0;
    public Object N_1;
    public boolean N_init;
    public static Object y_0;

    private static void L() {
        y_0 = null;
    }

    private void M() {
        if (!this.N_init) {
            this.N_init = true;
            this.N_0 = 0;
            this.N_1 = 0;
        }
    }

    public class10983() {
        this.M();
    }

    static {
        class10983.L();
        y_0 = new class10983();
    }

    public int y() {
        return (Integer)this.N_1;
    }

    public static class10983 N(int n, int n2) {
        ((class10983)class10983.y_0).N_0 = n;
        ((class10983)class10983.y_0).N_1 = n2;
        return (class10983)y_0;
    }

    public int N() {
        return (Integer)this.N_0;
    }
}

