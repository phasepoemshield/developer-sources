/*
 * Decompiled with CFR 0.152.
 */
package Nursultan;

public class class11394 {
    public static Object N_0;
    public Object y_0;
    public Object y_1;
    public boolean y_init;

    public class11394() {
        this.B();
    }

    static {
        class11394.R();
        N_0 = new class11394();
    }

    private void B() {
        if (!this.y_init) {
            this.y_init = true;
            this.y_0 = Float.valueOf(0.0f);
            this.y_1 = Float.valueOf(0.0f);
        }
    }

    public float y() {
        return ((Float)this.y_0).floatValue();
    }

    public class11394 y(float f) {
        this.y_0 = Float.valueOf(f);
        return this;
    }

    public static class11394 N(float f, float f2) {
        ((class11394)class11394.N_0).y_0 = Float.valueOf(f);
        ((class11394)class11394.N_0).y_1 = Float.valueOf(f2);
        return (class11394)N_0;
    }

    public class11394 N(float f) {
        this.y_1 = Float.valueOf(f);
        return this;
    }

    public float N() {
        return ((Float)this.y_1).floatValue();
    }

    private static void R() {
    }
}

