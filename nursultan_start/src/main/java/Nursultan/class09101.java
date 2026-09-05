/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.joml.Matrix4f
 */
package Nursultan;

import java.nio.FloatBuffer;
import org.joml.Matrix4f;

public class class09101 {
    public Object N_0;
    public Object N_1;
    public Object N_2;
    public Object N_3;
    public Object N_4;
    public Object N_5;
    public boolean N_init;
    public Object y_0;
    public Object y_1;
    public Object y_2;
    public Object y_3;
    public Object y_4;
    public Object y_5;
    public boolean y_init;
    public Object L_0;
    public Object L_1;

    public class09101 L(int n) {
        this.N_4 = n;
        return this;
    }

    public class09101 L(float f) {
        this.N_2 = Float.valueOf(f);
        return this;
    }

    public float L() {
        return ((Float)this.N_1).floatValue();
    }

    public float M() {
        return ((Float)this.N_3).floatValue();
    }

    private void T() {
        if (!this.y_init) {
            this.y_init = true;
            this.y_0 = 0;
            this.y_1 = 0;
            this.y_2 = 0;
            this.y_3 = 0;
            this.y_4 = Float.valueOf(0.0f);
            this.y_5 = Float.valueOf(0.0f);
        }
        if (!this.N_init) {
            this.N_init = true;
            this.N_0 = Float.valueOf(0.0f);
            this.N_1 = Float.valueOf(0.0f);
            this.N_2 = Float.valueOf(0.0f);
            this.N_3 = Float.valueOf(0.0f);
            this.N_4 = 0;
        }
    }

    public class09101() {
        this.T();
        this.L_0 = new Matrix4f();
        this.L_1 = new Matrix4f();
    }

    public int B() {
        return (Integer)this.y_2;
    }

    public int Z() {
        return (Integer)this.y_0;
    }

    public class09101 i(int n) {
        this.y_2 = n;
        return this;
    }

    public int i() {
        return (Integer)this.y_3;
    }

    public class09101 i(float f) {
        this.N_3 = Float.valueOf(f);
        return this;
    }

    public float m() {
        return ((Float)this.y_5).floatValue();
    }

    public float U() {
        return ((Float)this.N_2).floatValue();
    }

    public Matrix4f z() {
        return (Matrix4f)this.L_0;
    }

    public class09101 u(float f) {
        this.y_4 = Float.valueOf(f);
        return this;
    }

    public float u() {
        return ((Float)this.N_0).floatValue();
    }

    public class09101 u(int n) {
        this.y_3 = n;
        return this;
    }

    public class09101 y(int n) {
        this.y_0 = n;
        return this;
    }

    public class09101 y(float f) {
        this.N_0 = Float.valueOf(f);
        return this;
    }

    public Matrix4f y() {
        return (Matrix4f)this.L_1;
    }

    public float E() {
        return ((Float)this.y_4).floatValue();
    }

    public class09101 N(FloatBuffer floatBuffer) {
        this.N_5 = floatBuffer;
        return this;
    }

    public class09101 N(float f) {
        this.N_1 = Float.valueOf(f);
        return this;
    }

    public class09101 N(int n) {
        this.y_1 = n;
        return this;
    }

    public int N() {
        return (Integer)this.N_4;
    }

    public FloatBuffer W() {
        return (FloatBuffer)this.N_5;
    }

    public class09101 R(float f) {
        this.y_5 = Float.valueOf(f);
        return this;
    }

    public int R() {
        return (Integer)this.y_1;
    }
}

