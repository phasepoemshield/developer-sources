/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01391
 *  minecraft.class07915
 *  org.joml.Matrix4f
 */
package minecraft;

import minecraft.class01391;
import minecraft.class07915;
import org.joml.Matrix4f;

public interface class06596
extends class07915 {
    public static final float N = 8.0f;
    public static final float y = 8.0f;
    public static final float L = 8.0f;

    public int M();

    public int B();

    public float Z();

    public float i();

    default public float n() {
        return 8.0f;
    }

    default public float m() {
        return this.s() + this.v();
    }

    default public float v() {
        return 8.0f;
    }

    default public float j() {
        return 8.0f;
    }

    default public float U() {
        return this.i();
    }

    default public float E() {
        return this.R() + 7.0f - this.n();
    }

    public void N(Matrix4f var1, class01391 var2, int var3, float var4, float var5, float var6, int var7);

    default public void N(Matrix4f matrix4f, class01391 class013912, int n, boolean bl) {
        float f = 0.0f;
        if (this.B() != 0) {
            this.N(matrix4f, class013912, n, this.Z(), this.Z(), 0.0f, this.B());
            if (!bl) {
                f += 0.03f;
            }
        }
        this.N(matrix4f, class013912, n, 0.0f, 0.0f, f, this.M());
    }

    default public float W() {
        return this.U() + this.j();
    }

    public float R();
}

