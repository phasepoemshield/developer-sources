/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.buffers.GpuBuffer
 *  com.mojang.blaze3d.buffers.GpuBuffer$MappedView
 *  com.mojang.blaze3d.systems.CommandEncoder
 *  com.mojang.blaze3d.systems.GpuDevice
 *  com.mojang.blaze3d.systems.RenderPass
 *  com.mojang.blaze3d.systems.RenderSystem
 *  com.mojang.blaze3d.textures.FilterMode
 *  com.mojang.blaze3d.textures.GpuTexture
 *  com.mojang.blaze3d.textures.GpuTextureView
 *  com.mojang.blaze3d.textures.TextureFormat
 *  com.mojang.jtracy.TracyClient
 *  minecraft.class08066
 *  minecraft.class08394
 */
package minecraft;

import com.mojang.blaze3d.buffers.GpuBuffer;
import com.mojang.blaze3d.systems.CommandEncoder;
import com.mojang.blaze3d.systems.GpuDevice;
import com.mojang.blaze3d.systems.RenderPass;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.textures.FilterMode;
import com.mojang.blaze3d.textures.GpuTexture;
import com.mojang.blaze3d.textures.GpuTextureView;
import com.mojang.blaze3d.textures.TextureFormat;
import com.mojang.jtracy.TracyClient;
import java.nio.ByteBuffer;
import java.util.OptionalInt;
import minecraft.class08066;
import minecraft.class08394;
import minecraft.class08692;

public class class08712
implements AutoCloseable {
    private static final int N = 320;
    private static final int y = 180;
    private static final long L = 4L;
    private int u;
    private int i;
    private int R = 320;
    private int M = 180;
    private GpuTexture B;
    private GpuTextureView Z;
    private GpuBuffer z;
    private int U;
    private boolean E;
    private class08692 W = class08692.field_57834;

    public class08712() {
        GpuDevice gpuDevice = RenderSystem.getDevice();
        this.B = gpuDevice.createTexture("Tracy Frame Capture", 10, TextureFormat.RGBA8, this.R, this.M, 1, 1);
        this.Z = gpuDevice.createTextureView(this.B);
        this.z = gpuDevice.createBuffer(() -> "Tracy Frame Capture buffer", 9, (long)(this.R * this.M) * 4L);
    }

    @Override
    public void close() {
        this.B.close();
        this.Z.close();
        this.z.close();
    }

    public void y() {
        ++this.U;
        this.E = false;
        TracyClient.markFrame();
    }

    private void N(int n, int n2) {
        float f = (float)n / (float)n2;
        if (n > 320) {
            n = 320;
            n2 = (int)(320.0f / f);
        }
        if (n2 > 180) {
            n = (int)(180.0f * f);
            n2 = 180;
        }
        n = n / 4 * 4;
        n2 = n2 / 4 * 4;
        if (this.R != n || this.M != n2) {
            this.R = n;
            this.M = n2;
            GpuDevice gpuDevice = RenderSystem.getDevice();
            this.B.close();
            this.B = gpuDevice.createTexture("Tracy Frame Capture", 10, TextureFormat.RGBA8, n, n2, 1, 1);
            this.Z.close();
            this.Z = gpuDevice.createTextureView(this.B);
            this.z.close();
            this.z = gpuDevice.createBuffer(() -> "Tracy Frame Capture buffer", 9, (long)(n * n2) * 4L);
        }
    }

    public void N() {
        if (this.W != class08692.field_57836) {
            return;
        }
        this.W = class08692.field_57834;
        try (GpuBuffer.MappedView mappedView = RenderSystem.getDevice().createCommandEncoder().mapBuffer(this.z, true, false);){
            TracyClient.frameImage((ByteBuffer)mappedView.data(), (int)this.R, (int)this.M, (int)this.U, (boolean)true);
        }
    }

    public void N(class08066 class080662) {
        if (this.W != class08692.field_57834 || this.E || class080662.L() == null) {
            return;
        }
        this.E = true;
        if (class080662.N != this.u || class080662.y != this.i) {
            this.u = class080662.N;
            this.i = class080662.y;
            this.N(this.u, this.i);
        }
        this.W = class08692.field_57835;
        CommandEncoder commandEncoder = RenderSystem.getDevice().createCommandEncoder();
        try (RenderPass renderPass = RenderSystem.getDevice().createCommandEncoder().createRenderPass(() -> "Tracy blit", this.Z, OptionalInt.empty());){
            renderPass.setPipeline(class08394.Nr);
            renderPass.bindTexture("InSampler", class080662.u(), RenderSystem.getSamplerCache().N(FilterMode.LINEAR));
            renderPass.draw(0, 3);
        }
        commandEncoder.copyTextureToBuffer(this.B, this.z, 0L, () -> {
            this.W = class08692.field_57836;
        }, 0);
        this.U = 0;
    }
}

