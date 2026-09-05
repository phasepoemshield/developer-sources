/*
 * Decompiled with CFR 0.152.
 */
package Nursultan;

public class class09308 {
    public static Object N_0;
    public Object y_0;
    public boolean y_init;

    public class09308() {
        this.y();
    }

    static {
        class09308.R();
        N_0 = new class09308();
    }

    private void y() {
        if (!this.y_init) {
            this.y_init = true;
            this.y_0 = Float.valueOf(0.0f);
        }
    }

    public class09308 y(float f) {
        this.y_0 = Float.valueOf(f);
        return this;
    }

    public static class09308 N(float f) {
        ((class09308)class09308.N_0).y_0 = Float.valueOf(f);
        return (class09308)N_0;
    }

    public float N() {
        return ((Float)this.y_0).floatValue();
    }

    private static void R() {
    }
}

