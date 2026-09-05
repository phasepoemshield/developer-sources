/*
 * Decompiled with CFR 0.152.
 */
package Nursultan;

public class class10991 {
    public static Object N_0;
    public Object y_0;
    public boolean y_init;

    public class10991() {
        this.i();
    }

    static {
        class10991.u();
        N_0 = new class10991();
    }

    private void i() {
        if (!this.y_init) {
            this.y_init = true;
            this.y_0 = false;
        }
    }

    private static void u() {
    }

    public static class10991 y(boolean bl) {
        ((class10991)class10991.N_0).y_0 = bl;
        return (class10991)N_0;
    }

    public boolean N() {
        return (Boolean)this.y_0;
    }

    public void N(boolean bl) {
        this.y_0 = bl;
    }
}

