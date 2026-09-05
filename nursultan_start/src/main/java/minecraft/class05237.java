/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.textures.GpuTexture
 */
package minecraft;

import com.mojang.blaze3d.textures.GpuTexture;

public interface class05237 {
    default public float L() {
        return 7.0f - this.R();
    }

    default public float i() {
        return 0.0f;
    }

    default public float u() {
        return this.L() + (float)this.method_2032() / this.method_2035();
    }

    default public float y() {
        return this.N() + (float)this.method_2031() / this.method_2035();
    }

    default public float N() {
        return this.i();
    }

    default public float R() {
        return 7.0f;
    }

    public int method_2031();

    public int method_2032();

    public void method_2030(int var1, int var2, GpuTexture var3);

    public boolean method_2033();

    public float method_2035();
}

