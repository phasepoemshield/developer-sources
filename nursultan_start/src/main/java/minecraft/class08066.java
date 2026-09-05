/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.opengl.GlStateManager
 *  com.mojang.blaze3d.systems.GpuDevice
 *  com.mojang.blaze3d.systems.RenderPass
 *  com.mojang.blaze3d.systems.RenderSystem
 *  com.mojang.blaze3d.textures.FilterMode
 *  com.mojang.blaze3d.textures.GpuTexture
 *  com.mojang.blaze3d.textures.GpuTextureView
 *  com.mojang.blaze3d.textures.TextureFormat
 *  minecraft.class06202
 *  minecraft.class08394
 *  minecraft.class08879
 *  minecraft.class08893
 *  net.irisshaders.iris.Iris
 *  net.irisshaders.iris.mixinterface.RenderTargetInterface
 *  net.irisshaders.iris.targets.Blaze3dRenderTargetExt
 *  org.jspecify.annotations.Nullable
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package minecraft;

import com.mojang.blaze3d.opengl.GlStateManager;
import com.mojang.blaze3d.systems.GpuDevice;
import com.mojang.blaze3d.systems.RenderPass;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.textures.FilterMode;
import com.mojang.blaze3d.textures.GpuTexture;
import com.mojang.blaze3d.textures.GpuTextureView;
import com.mojang.blaze3d.textures.TextureFormat;
import java.util.OptionalInt;
import minecraft.class06202;
import minecraft.class08394;
import minecraft.class08879;
import minecraft.class08893;
import net.irisshaders.iris.Iris;
import net.irisshaders.iris.mixinterface.RenderTargetInterface;
import net.irisshaders.iris.targets.Blaze3dRenderTargetExt;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public abstract class class08066
implements RenderTargetInterface,
Blaze3dRenderTargetExt {
    private static int Z = 0;
    public int N;
    public int y;
    protected final String L;
    public final boolean u;
    protected @Nullable GpuTexture i;
    protected @Nullable GpuTextureView R;
    protected @Nullable GpuTexture M;
    protected @Nullable GpuTextureView B;
    private int z;
    private int U;

    public @Nullable GpuTexture L() {
        return this.i;
    }

    public class08066(@Nullable String string, boolean bl) {
        this.L = string == null ? "FBO " + Z++ : string;
        this.u = bl;
    }

    public @Nullable GpuTexture i() {
        return this.M;
    }

    public @Nullable GpuTextureView u() {
        return this.R;
    }

    public void y() {
        if (this.i == null) {
            throw new IllegalStateException("Can't blit to screen, color texture doesn't exist yet");
        }
        RenderSystem.getDevice().createCommandEncoder().presentTexture(this.R);
    }

    public void y(int n, int n2) {
        RenderSystem.assertOnRenderThread();
        GpuDevice gpuDevice = RenderSystem.getDevice();
        int n3 = gpuDevice.getMaxTextureSize();
        if (n <= 0 || n > n3 || n2 <= 0 || n2 > n3) {
            throw new IllegalArgumentException("Window " + n + "x" + n2 + " size out of bounds (max. size: " + n3 + ")");
        }
        this.N = n;
        this.y = n2;
        if (this.u) {
            this.M = gpuDevice.createTexture(() -> this.L + " / Depth", 15, TextureFormat.DEPTH32, n, n2, 1, 1);
            this.B = gpuDevice.createTextureView(this.M);
        }
        this.i = gpuDevice.createTexture(() -> this.L + " / Color", 15, TextureFormat.RGBA8, n, n2, 1, 1);
        this.R = gpuDevice.createTextureView(this.i);
    }

    private void N(boolean bl, CallbackInfo callbackInfo) {
        boolean bl2 = this == class06202.Nq().e();
        Iris.getPipelineManager().getPipeline().ifPresent(worldRenderingPipeline -> worldRenderingPipeline.setIsMainBound(bl2));
    }

    private void N(CallbackInfo callbackInfo) {
        ++this.z;
        ++this.U;
    }

    public void N(int n, int n2) {
        RenderSystem.assertOnRenderThread();
        this.N();
        this.y(n, n2);
    }

    public void N() {
        this.N((CallbackInfo)null);
        RenderSystem.assertOnRenderThread();
        if (this.M != null) {
            this.M.close();
            this.M = null;
        }
        if (this.B != null) {
            this.B.close();
            this.B = null;
        }
        if (this.i != null) {
            this.i.close();
            this.i = null;
        }
        if (this.R != null) {
            this.R.close();
            this.R = null;
        }
    }

    public void N(class08066 class080662) {
        RenderSystem.assertOnRenderThread();
        if (this.M == null) {
            throw new IllegalStateException("Trying to copy depth texture to a RenderTarget without a depth texture");
        }
        if (class080662.M == null) {
            throw new IllegalStateException("Trying to copy depth texture from a RenderTarget without a depth texture");
        }
        RenderSystem.getDevice().createCommandEncoder().copyTextureToTexture(class080662.M, this.M, 0, 0, 0, 0, 0, this.N, this.y);
    }

    public void N(GpuTextureView gpuTextureView) {
        RenderSystem.assertOnRenderThread();
        try (RenderPass renderPass = RenderSystem.getDevice().createCommandEncoder().createRenderPass(() -> "Blit render target", gpuTextureView, OptionalInt.empty());){
            renderPass.setPipeline(class08394.Nh);
            RenderSystem.bindDefaultUniforms((RenderPass)renderPass);
            renderPass.bindTexture("InSampler", this.R, RenderSystem.getSamplerCache().N(FilterMode.NEAREST));
            renderPass.draw(0, 3);
        }
    }

    public @Nullable GpuTextureView R() {
        return this.B;
    }

    public int iris$getDepthBufferVersion() {
        return this.z;
    }

    public void iris$bindFramebuffer() {
        GlStateManager._glBindFramebuffer((int)36160, (int)((class08893)this.i).N(((class08879)RenderSystem.getDevice()).y(), this.M));
    }

    public int iris$getColorBufferVersion() {
        return this.U;
    }
}

