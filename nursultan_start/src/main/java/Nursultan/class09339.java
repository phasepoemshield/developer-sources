/*
 * Decompiled with CFR 0.152.
 */
package Nursultan;

public class class09339 {
    public Object N_0;
    public boolean N_init;
    public static Object y_0;

    public class09339() {
        this.u();
    }

    static {
        class09339.i();
        y_0 = new class09339();
    }

    private static void i() {
        y_0 = null;
    }

    private void u() {
        if (!this.N_init) {
            this.N_init = true;
            this.N_0 = Float.valueOf(0.0f);
        }
    }

    public float y() {
        return ((Float)this.N_0).floatValue();
    }

    public void N(float f) {
        this.N_0 = Float.valueOf(f);
    }

    public static class09339 N() {
        ((class09339)class09339.y_0).N_0 = Float.valueOf(1.0f);
        return (class09339)y_0;
    }
}

