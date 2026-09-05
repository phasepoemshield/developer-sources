/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.joml.Vector3f
 *  org.joml.Vector3fc
 */
package minecraft;

import org.joml.Vector3f;
import org.joml.Vector3fc;

public class class06607 {
    private final float[] N;

    public float L(int n) {
        return this.N[3 * n + this.u(1)];
    }

    public class06607(int n) {
        this.N = new float[3 * n];
    }

    private int u(int n) {
        return 2;
    }

    public float y(int n) {
        return this.N[3 * n + 1];
    }

    public void N(int n, float f, float f2, float f3) {
        this.N[3 * n + 0] = f;
        this.N[3 * n + 1] = f2;
        this.N[3 * n + 2] = f3;
    }

    public int N() {
        return this.N.length / 3;
    }

    public Vector3f N(int n, Vector3f vector3f) {
        return vector3f.set(this.N[3 * n + 0], this.N[3 * n + 1], this.N[3 * n + 2]);
    }

    public float N(int n) {
        return this.N[3 * n + 0];
    }

    public void N(int n, Vector3fc vector3fc) {
        this.N(n, vector3fc.x(), vector3fc.y(), vector3fc.z());
    }
}

