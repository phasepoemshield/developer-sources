/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.joml.Matrix4f
 *  org.joml.Vector3f
 *  org.lwjgl.system.MemoryUtil
 */
package Nursultan;

import java.nio.ByteBuffer;
import org.joml.Matrix4f;
import org.joml.Vector3f;
import org.lwjgl.system.MemoryUtil;

public class class11184 {
    public static Object N_0;
    public Object y_0;
    public Object y_1;
    public boolean y_init;

    public ByteBuffer L() {
        ((ByteBuffer)this.y_0).flip();
        return (ByteBuffer)this.y_0;
    }

    private void M(int n) {
        int n2;
        for (n2 = ((ByteBuffer)this.y_0).capacity(); ((ByteBuffer)this.y_0).position() + n > n2; n2 += n2 >> 1) {
        }
        int n3 = ((ByteBuffer)this.y_0).position();
        this.y_0 = MemoryUtil.memRealloc((ByteBuffer)((ByteBuffer)this.y_0), (int)n2);
        ((ByteBuffer)this.y_0).position(n3);
    }

    private static void M() {
        N_0 = null;
    }

    public class11184(int n) {
        this.Z();
        this.y_0 = MemoryUtil.memAlloc((int)n);
    }

    static {
        class11184.M();
        N_0 = new Vector3f();
    }

    private void Z() {
        if (!this.y_init) {
            this.y_init = true;
            this.y_1 = 0;
        }
    }

    public int i() {
        return (Integer)this.y_1;
    }

    public ByteBuffer u() {
        return (ByteBuffer)this.y_0;
    }

    private ByteBuffer u(int n) {
        if (((ByteBuffer)this.y_0).position() + n > ((ByteBuffer)this.y_0).capacity()) {
            this.M(n);
        }
        return (ByteBuffer)this.y_0;
    }

    public class11184 y(int n) {
        this.u(4).putInt(n);
        return this;
    }

    public int y() {
        int n = (Integer)this.y_1;
        this.y_1 = n + 1;
        return n;
    }

    public class11184 N(float f) {
        this.u(4).putFloat(f);
        return this;
    }

    public class11184 N(float f, float f2) {
        this.u(8).putFloat(f).putFloat(f2);
        return this;
    }

    public void N() {
        ((ByteBuffer)this.y_0).position(0);
        this.y_1 = 0;
    }

    public class11184 N(int n) {
        this.u(4).putInt(n);
        return this;
    }

    public class11184 N(byte by) {
        this.u(1).put(by);
        return this;
    }

    public class11184 N(float f, float f2, float f3) {
        this.u(12).putFloat(f).putFloat(f2).putFloat(f3);
        return this;
    }

    public class11184 N(Matrix4f matrix4f, float f, float f2, float f3) {
        Vector3f vector3f = ((Vector3f)N_0).set(f, f2, f3);
        matrix4f.transformPosition(vector3f);
        this.u(12).putFloat(vector3f.x).putFloat(vector3f.y).putFloat(vector3f.z);
        return this;
    }
}

