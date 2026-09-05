/*
 * Decompiled with CFR 0.152.
 */
package Nursultan;

public class class09305 {
    public Object N_0;
    public boolean N_init;
    public static Object y_0;

    private void L() {
        if (!this.N_init) {
            this.N_init = true;
            this.N_0 = false;
        }
    }

    public class09305() {
        this.L();
    }

    static {
        class09305.y();
        y_0 = new class09305();
    }

    public static class09305 y(boolean bl) {
        ((class09305)class09305.y_0).N_0 = bl;
        return (class09305)y_0;
    }

    private static void y() {
    }

    public void N(boolean bl) {
        this.N_0 = bl;
    }

    public boolean N() {
        return (Boolean)this.N_0;
    }
}

