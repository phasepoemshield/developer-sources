/*
 * Decompiled with CFR 0.152.
 */
package Nursultan;

public class class10976 {
    public static Object N_0;
    public Object y_0;
    public Object y_1;
    public boolean y_init;

    private static void L() {
    }

    private void M() {
        if (!this.y_init) {
            this.y_init = true;
            this.y_0 = false;
            this.y_1 = false;
        }
    }

    public class10976() {
        this.M();
    }

    static {
        class10976.L();
        N_0 = new class10976();
    }

    public boolean y() {
        return (Boolean)this.y_0;
    }

    public void y(boolean bl) {
        this.y_1 = bl;
    }

    public static class10976 N(boolean bl, boolean bl2) {
        ((class10976)class10976.N_0).y_0 = bl;
        ((class10976)class10976.N_0).y_1 = bl2;
        return (class10976)N_0;
    }

    public boolean N() {
        return (Boolean)this.y_1;
    }

    public void N(boolean bl) {
        this.y_0 = bl;
    }
}

