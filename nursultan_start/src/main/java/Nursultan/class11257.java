/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.joml.Matrix4f
 */
package Nursultan;

import java.nio.FloatBuffer;
import org.joml.Matrix4f;

public class class11257 {
    public Object N_0;
    public Object N_1;
    public Object N_2;
    public Object N_3;
    public Object N_4;
    public Object N_5;
    public Object N_6;
    public boolean N_init;
    public Object y_0;
    public Object y_1;
    public Object y_2;
    public boolean y_init;

    public class11257 L(int n) {
        this.N_3 = n;
        return this;
    }

    public class11257 L(float f) {
        this.y_1 = Float.valueOf(f);
        return this;
    }

    public float L() {
        return ((Float)this.y_1).floatValue();
    }

    public FloatBuffer M() {
        return (FloatBuffer)this.y_2;
    }

    public class11257() {
        this.m();
        this.N_0 = new Matrix4f();
        this.N_1 = new Matrix4f();
    }

    public float B() {
        return ((Float)this.y_0).floatValue();
    }

    public int Z() {
        return (Integer)this.N_2;
    }

    public int i() {
        return (Integer)this.N_3;
    }

    private void m() {
        if (!this.N_init) {
            this.N_init = true;
            this.N_2 = 0;
            this.N_3 = 0;
            this.N_4 = Float.valueOf(0.0f);
            this.N_5 = Float.valueOf(0.0f);
            this.N_6 = 0;
        }
        if (!this.y_init) {
            this.y_init = true;
            this.y_0 = Float.valueOf(0.0f);
            this.y_1 = Float.valueOf(0.0f);
        }
    }

    public Matrix4f z() {
        return (Matrix4f)this.N_0;
    }

    public float u() {
        return ((Float)this.N_4).floatValue();
    }

    public class11257 u(float f) {
        this.y_0 = Float.valueOf(f);
        return this;
    }

    public class11257 y(int n) {
        this.N_2 = n;
        return this;
    }

    public float y() {
        return ((Float)this.N_5).floatValue();
    }

    public class11257 y(float f) {
        this.N_5 = Float.valueOf(f);
        return this;
    }

    public Matrix4f N() {
        return (Matrix4f)this.N_1;
    }

    public class11257 N(float f) {
        this.N_4 = Float.valueOf(f);
        return this;
    }

    public class11257 N(FloatBuffer floatBuffer) {
        this.y_2 = floatBuffer;
        return this;
    }

    public class11257 N(int n) {
        this.N_6 = n;
        return this;
    }

    public int R() {
        return (Integer)this.N_6;
    }
}

