/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.systems.RenderSystem
 *  com.mojang.blaze3d.textures.GpuTexture
 *  minecraft.class05237
 */
package minecraft;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.textures.GpuTexture;
import minecraft.class01923;
import minecraft.class05237;

class class01907
implements class05237 {
    final /* synthetic */ class01923 N;

    class01907(class01923 class019232) {
        this.N = class019232;
    }

    public int method_2031() {
        return this.N.field_37900.N();
    }

    public int method_2032() {
        return this.N.field_37900.y();
    }

    public void method_2030(int n, int n2, GpuTexture gpuTexture) {
        RenderSystem.getDevice().createCommandEncoder().writeToTexture(gpuTexture, this.N.field_37900, 0, 0, n, n2, this.N.field_37900.N(), this.N.field_37900.y(), 0, 0);
    }

    public boolean method_2033() {
        return true;
    }

    public float method_2035() {
        return 1.0f;
    }
}

