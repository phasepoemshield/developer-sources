/*
 * Decompiled with CFR 0.152.
 */
package Nursultan;

public class class09329 {
    public Object N_0;
    public Object N_1;
    public boolean N_init;
    public static Object y_0;

    private void L() {
        if (!this.N_init) {
            this.N_init = true;
            this.N_0 = false;
            this.N_1 = Float.valueOf(0.0f);
        }
    }

    public class09329() {
        this.L();
    }

    static {
        class09329.R();
        y_0 = new class09329();
    }

    public static class09329 y(float f) {
        ((class09329)class09329.y_0).N_1 = Float.valueOf(f);
        ((class09329)class09329.y_0).N_0 = true;
        return (class09329)y_0;
    }

    public float y() {
        return ((Float)this.N_1).floatValue();
    }

    public class09329 N(float f) {
        this.N_1 = Float.valueOf(f);
        return this;
    }

    public class09329 N(boolean bl) {
        this.N_0 = bl;
        return this;
    }

    public boolean N() {
        return (Boolean)this.N_0;
    }

    private static void R() {
    }
}

