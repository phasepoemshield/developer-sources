/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.systems.RenderSystem
 *  com.mojang.blaze3d.textures.GpuTexture
 *  minecraft.class05237
 *  minecraft.class06267
 *  minecraft.class06268
 *  minecraft.class08247
 *  org.lwjgl.system.MemoryUtil
 */
package minecraft;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.textures.GpuTexture;
import java.nio.Buffer;
import java.nio.IntBuffer;
import minecraft.class05237;
import minecraft.class06248;
import minecraft.class06267;
import minecraft.class06268;
import minecraft.class08247;
import org.lwjgl.system.MemoryUtil;

class class06235
implements class05237 {
    final /* synthetic */ class06248 N;

    class06235(class06248 class062482) {
        this.N = class062482;
    }

    public int method_2031() {
        return this.N.y();
    }

    public int method_2032() {
        return 16;
    }

    public void method_2030(int n, int n2, GpuTexture gpuTexture) {
        IntBuffer intBuffer = MemoryUtil.memAllocInt((int)(this.N.y() * 16));
        class06268.N((IntBuffer)intBuffer, (class06267)this.N.L(), (int)this.N.u(), (int)this.N.i());
        intBuffer.rewind();
        RenderSystem.getDevice().createCommandEncoder().writeToTexture(gpuTexture, MemoryUtil.memByteBuffer((IntBuffer)intBuffer), class08247.field_4997, 0, 0, n, n2, this.N.y(), 16);
        MemoryUtil.memFree((Buffer)intBuffer);
    }

    public boolean method_2033() {
        return true;
    }

    public float method_2035() {
        return 2.0f;
    }
}

