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
import minecraft.class05237;
import minecraft.class05656;

class class05651
implements class05237 {
    final /* synthetic */ class05656 N;

    class05651(class05656 class056562) {
        this.N = class056562;
    }

    public float R() {
        return this.N.Z();
    }

    public int method_2031() {
        return this.N.R();
    }

    public int method_2032() {
        return this.N.M();
    }

    public void method_2030(int n, int n2, GpuTexture gpuTexture) {
        RenderSystem.getDevice().createCommandEncoder().writeToTexture(gpuTexture, this.N.L(), 0, 0, n, n2, this.N.R(), this.N.M(), this.N.u(), this.N.i());
    }

    public boolean method_2033() {
        return this.N.L().L().N() > 1;
    }

    public float method_2035() {
        return 1.0f / this.N.y();
    }
}

