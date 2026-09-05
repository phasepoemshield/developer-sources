/*
 * Decompiled with CFR 0.152.
 */
package Nursultan;

public class class11810 {
    public Object N_0;
    public boolean N_init;
    public static Object y_0;

    private void L() {
        if (!this.N_init) {
            this.N_init = true;
            this.N_0 = Float.valueOf(0.0f);
        }
    }

    public class11810() {
        this.L();
    }

    static {
        class11810.u();
        y_0 = new class11810();
    }

    private static void u() {
    }

    public static class11810 y(float f) {
        ((class11810)class11810.y_0).N_0 = Float.valueOf(f);
        return (class11810)y_0;
    }

    public float N() {
        return ((Float)this.N_0).floatValue();
    }

    public class11810 N(float f) {
        this.N_0 = Float.valueOf(f);
        return this;
    }
}

