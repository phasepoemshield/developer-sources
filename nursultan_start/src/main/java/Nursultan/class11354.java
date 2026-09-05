/*
 * Decompiled with CFR 0.152.
 */
package Nursultan;

public class class11354 {
    public static Object N_0;
    public Object y_0;
    public boolean y_init;

    private void L() {
        if (!this.y_init) {
            this.y_init = true;
            this.y_0 = Float.valueOf(0.0f);
        }
    }

    public class11354() {
        this.L();
    }

    static {
        class11354.i();
        N_0 = new class11354();
    }

    private static void i() {
    }

    public static class11354 y(float f) {
        ((class11354)class11354.N_0).y_0 = Float.valueOf(f);
        return (class11354)N_0;
    }

    public float N() {
        return ((Float)this.y_0).floatValue();
    }

    public class11354 N(float f) {
        this.y_0 = Float.valueOf(f);
        return this;
    }
}

