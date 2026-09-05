/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class02233
 *  org.joml.Matrix4f
 *  org.joml.Matrix4fc
 */
package Nursultan;

import minecraft.class02233;
import org.joml.Matrix4f;
import org.joml.Matrix4fc;

public class class09317 {
    public Object N_0;
    public Object N_1;
    public static Object y_0;

    public class02233 L() {
        return (class02233)this.N_1;
    }

    private void M() {
    }

    public class09317() {
        this.M();
        this.N_0 = new Matrix4f();
    }

    static {
        class09317.i();
        y_0 = new class09317();
    }

    private static void i() {
    }

    public Matrix4f y() {
        return (Matrix4f)this.N_0;
    }

    public void N(Matrix4f matrix4f, Matrix4f matrix4f2, class02233 class022332) {
        ((Matrix4f)this.N_0).set((Matrix4fc)matrix4f).mul((Matrix4fc)matrix4f2).invert();
        this.N_1 = class022332;
    }

    public static class09317 N() {
        return (class09317)y_0;
    }
}

