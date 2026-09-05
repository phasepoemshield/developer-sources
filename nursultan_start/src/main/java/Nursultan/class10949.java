/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.joml.Vector4f
 */
package Nursultan;

import org.joml.Vector4f;

public class class10949 {
    public static Object N_0;
    public Object y_0;
    public Object y_1;

    public class10949() {
        this.u();
    }

    static {
        class10949.i();
        N_0 = new class10949();
    }

    private static void i() {
    }

    private void u() {
    }

    public Vector4f y() {
        return (Vector4f)this.y_0;
    }

    public class10949 y(Vector4f vector4f) {
        this.y_1 = vector4f;
        return this;
    }

    public Vector4f N() {
        return (Vector4f)this.y_1;
    }

    public static class10949 N(Vector4f vector4f, Vector4f vector4f2) {
        ((class10949)class10949.N_0).y_0 = vector4f;
        ((class10949)class10949.N_0).y_1 = vector4f2;
        return (class10949)N_0;
    }

    public class10949 N(Vector4f vector4f) {
        this.y_0 = vector4f;
        return this;
    }
}

