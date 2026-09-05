/*
 * Decompiled with CFR 0.152.
 */
package Nursultan;

public class class09324 {
    public static Object N_0;
    public Object y_0;
    public Object y_1;
    public Object y_2;
    public Object y_3;
    public boolean y_init;

    public float L() {
        return ((Float)this.y_0).floatValue();
    }

    public class09324 L(float f) {
        this.y_2 = Float.valueOf(f);
        return this;
    }

    public class09324() {
        this.z();
    }

    static {
        class09324.B();
        N_0 = new class09324();
    }

    private static void B() {
    }

    private void z() {
        if (!this.y_init) {
            this.y_init = true;
            this.y_0 = Float.valueOf(0.0f);
            this.y_1 = Float.valueOf(0.0f);
            this.y_2 = Float.valueOf(0.0f);
            this.y_3 = Float.valueOf(0.0f);
        }
    }

    public float u() {
        return ((Float)this.y_1).floatValue();
    }

    public class09324 u(float f) {
        this.y_3 = Float.valueOf(f);
        return this;
    }

    public class09324 y(float f) {
        this.y_0 = Float.valueOf(f);
        return this;
    }

    public float y() {
        return ((Float)this.y_3).floatValue();
    }

    public class09324 N(float f) {
        this.y_1 = Float.valueOf(f);
        return this;
    }

    public static class09324 N(float f, float f2, float f3, float f4) {
        ((class09324)class09324.N_0).y_0 = Float.valueOf(f);
        ((class09324)class09324.N_0).y_1 = Float.valueOf(f2);
        ((class09324)class09324.N_0).y_2 = Float.valueOf(f3);
        ((class09324)class09324.N_0).y_3 = Float.valueOf(f4);
        return (class09324)N_0;
    }

    public float N() {
        return ((Float)this.y_2).floatValue();
    }
}

