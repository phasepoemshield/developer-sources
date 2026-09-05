/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableSet
 *  com.google.common.collect.ImmutableSet$Builder
 *  com.mojang.blaze3d.opengl.GlStateManager
 *  com.mojang.blaze3d.systems.RenderSystem
 *  com.mojang.blaze3d.textures.GpuTexture
 *  com.mojang.blaze3d.textures.TextureFormat
 *  net.irisshaders.iris.gl.IrisRenderSystem
 *  net.irisshaders.iris.gl.framebuffer.GlFramebuffer
 *  net.irisshaders.iris.gl.texture.DepthBufferFormat
 *  net.irisshaders.iris.gl.texture.DepthCopyStrategy
 *  net.irisshaders.iris.platform.IrisPlatformHelpers
 *  org.joml.Vector2i
 */
package net.irisshaders.iris.targets;

import com.google.common.collect.ImmutableSet;
import com.mojang.blaze3d.opengl.GlStateManager;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.textures.GpuTexture;
import com.mojang.blaze3d.textures.TextureFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import net.irisshaders.iris.gl.IrisRenderSystem;
import net.irisshaders.iris.gl.framebuffer.GlFramebuffer;
import net.irisshaders.iris.gl.texture.DepthBufferFormat;
import net.irisshaders.iris.gl.texture.DepthCopyStrategy;
import net.irisshaders.iris.platform.IrisPlatformHelpers;
import net.irisshaders.iris.shaderpack.properties.PackDirectives;
import net.irisshaders.iris.shaderpack.properties.PackRenderTargetDirectives$RenderTargetSettings;
import net.irisshaders.iris.targets.RenderTarget;
import org.joml.Vector2i;

public class RenderTargets {
    private final RenderTarget[] targets;
    private GpuTexture noTranslucents;
    private GpuTexture noHand;
    private final GlFramebuffer depthSourceFb;
    private final GlFramebuffer noTranslucentsDestFb;
    private final GlFramebuffer noHandDestFb;
    private final List<GlFramebuffer> ownedFramebuffers;
    private final Map<Integer, PackRenderTargetDirectives$RenderTargetSettings> targetSettingsMap;
    private final PackDirectives packDirectives;
    private GpuTexture currentDepthTexture;
    private DepthBufferFormat currentDepthFormat;
    private DepthCopyStrategy copyStrategy;
    private int cachedWidth;
    private int cachedHeight;
    private boolean fullClearRequired;
    private boolean translucentDepthDirty;
    private boolean handDepthDirty;
    private int cachedDepthBufferVersion;
    private boolean destroyed;

    private void create(int n) {
        PackRenderTargetDirectives$RenderTargetSettings packRenderTargetDirectives$RenderTargetSettings = this.targetSettingsMap.get(n);
        Vector2i vector2i = this.packDirectives.getTextureScaleOverride(n, this.cachedWidth, this.cachedHeight);
        this.targets[n] = RenderTarget.builder().setDimensions(vector2i.x, vector2i.y).setName("colortex" + n).setInternalFormat(packRenderTargetDirectives$RenderTargetSettings.getInternalFormat()).setPixelFormat(packRenderTargetDirectives$RenderTargetSettings.getInternalFormat().getPixelFormat()).build();
    }

    public RenderTarget getOrCreate(int n) {
        if (this.destroyed) {
            throw new IllegalStateException("Tried to use destroyed RenderTargets");
        }
        if (this.targets[n] != null) {
            return this.targets[n];
        }
        this.create(n);
        return this.targets[n];
    }

    public RenderTargets(int n, int n2, GpuTexture gpuTexture, int n3, DepthBufferFormat depthBufferFormat, Map<Integer, PackRenderTargetDirectives$RenderTargetSettings> map, PackDirectives packDirectives) {
        this.targets = new RenderTarget[map.size()];
        this.targetSettingsMap = map;
        this.packDirectives = packDirectives;
        this.currentDepthTexture = gpuTexture;
        this.currentDepthFormat = depthBufferFormat;
        this.copyStrategy = DepthCopyStrategy.fastest((boolean)this.currentDepthFormat.isCombinedStencil());
        this.cachedWidth = n;
        this.cachedHeight = n2;
        this.cachedDepthBufferVersion = n3;
        this.ownedFramebuffers = new ArrayList<GlFramebuffer>();
        this.fullClearRequired = true;
        this.depthSourceFb = this.createFramebufferWritingToMain(new int[]{0});
        TextureFormat textureFormat = IrisPlatformHelpers.getInstance().mojangDepthFormat(depthBufferFormat);
        this.noTranslucents = RenderSystem.getDevice().createTexture("Depth / Opaque", 5, textureFormat, n, n2, 1, 1);
        this.noHand = RenderSystem.getDevice().createTexture("Depth / Before Hand", 5, textureFormat, n, n2, 1, 1);
        this.noTranslucentsDestFb = this.createFramebufferWritingToMain(new int[]{0});
        this.noTranslucentsDestFb.addDepthAttachment(this.noTranslucents);
        this.noHandDestFb = this.createFramebufferWritingToMain(new int[]{0});
        this.noHandDestFb.addDepthAttachment(this.noHand);
        this.translucentDepthDirty = true;
        this.handDepthDirty = true;
    }

    public RenderTarget get(int n) {
        if (this.destroyed) {
            throw new IllegalStateException("Tried to use destroyed RenderTargets");
        }
        if (this.targets[n] == null) {
            return null;
        }
        return this.targets[n];
    }

    public void destroy() {
        this.destroyed = true;
        for (GlFramebuffer glFramebuffer : this.ownedFramebuffers) {
            glFramebuffer.destroy();
        }
        for (RenderTarget renderTarget : this.targets) {
            if (renderTarget == null) continue;
            renderTarget.destroy();
        }
        this.noTranslucents.close();
        this.noHand.close();
    }

    private ImmutableSet<Integer> invert(ImmutableSet<Integer> immutableSet, int[] nArray) {
        ImmutableSet.Builder builder = ImmutableSet.builder();
        for (int n : nArray) {
            if (immutableSet.contains((Object)n)) continue;
            builder.add((Object)n);
        }
        return builder.build();
    }

    public GlFramebuffer createFramebufferWritingToAlt(int[] nArray) {
        return this.createFullFramebuffer(true, nArray);
    }

    public GlFramebuffer createFramebufferWritingToMain(int[] nArray) {
        return this.createFullFramebuffer(false, nArray);
    }

    public GpuTexture getDepthTextureNoTranslucents() {
        if (this.destroyed) {
            throw new IllegalStateException("Tried to use destroyed RenderTargets");
        }
        return this.noTranslucents;
    }

    public void destroyFramebuffer(GlFramebuffer glFramebuffer) {
        glFramebuffer.destroy();
        this.ownedFramebuffers.remove(glFramebuffer);
    }

    public void onFullClear() {
        this.fullClearRequired = false;
    }

    public boolean resizeIfNeeded(int n, GpuTexture gpuTexture, int n2, int n3, DepthBufferFormat depthBufferFormat, PackDirectives packDirectives) {
        boolean bl;
        boolean bl2 = false;
        if (this.cachedDepthBufferVersion != n) {
            bl2 = true;
            this.currentDepthTexture = gpuTexture;
            this.cachedDepthBufferVersion = n;
        }
        boolean bl3 = n2 != this.cachedWidth || n3 != this.cachedHeight;
        boolean bl4 = bl = depthBufferFormat != this.currentDepthFormat;
        if (bl) {
            this.currentDepthFormat = depthBufferFormat;
            this.copyStrategy = DepthCopyStrategy.fastest((boolean)this.currentDepthFormat.isCombinedStencil());
        }
        if (bl || bl3) {
            this.noTranslucents.close();
            this.noHand.close();
            this.noTranslucents = RenderSystem.getDevice().createTexture("Depth / Opaque", 5, gpuTexture.getFormat(), n2, n3, 1, 1);
            this.noHand = RenderSystem.getDevice().createTexture("Depth / Before Hand", 5, gpuTexture.getFormat(), n2, n3, 1, 1);
            this.noTranslucentsDestFb.addDepthAttachment(this.noTranslucents);
            this.noHandDestFb.addDepthAttachment(this.noHand);
            this.translucentDepthDirty = true;
            this.handDepthDirty = true;
            bl2 = true;
        }
        if (bl2) {
            for (GlFramebuffer glFramebuffer : this.ownedFramebuffers) {
                if (!glFramebuffer.hasDepthAttachment()) continue;
                glFramebuffer.addDepthAttachment(gpuTexture);
            }
        }
        if (bl3) {
            this.cachedWidth = n2;
            this.cachedHeight = n3;
            for (int i = 0; i < this.targets.length; ++i) {
                if (this.targets[i] == null) continue;
                this.targets[i].resize(packDirectives.getTextureScaleOverride(i, n2, n3));
            }
            this.fullClearRequired = true;
        }
        return bl3;
    }

    public void copyPreHandDepth() {
        if (this.handDepthDirty) {
            this.handDepthDirty = false;
            GlStateManager._bindTexture((int)this.noHand.iris$getGlId());
            this.depthSourceFb.bindAsReadBuffer();
            IrisRenderSystem.copyTexImage2D((int)3553, (int)0, (int)this.currentDepthFormat.getGlInternalFormat(), (int)0, (int)0, (int)this.cachedWidth, (int)this.cachedHeight, (int)0);
        } else {
            this.copyStrategy.copy(this.depthSourceFb, this.getDepthTexture().iris$getGlId(), this.noHandDestFb, this.noHand.iris$getGlId(), this.getCurrentWidth(), this.getCurrentHeight());
        }
    }

    public GpuTexture getDepthTexture() {
        return this.currentDepthTexture;
    }

    private GlFramebuffer createFullFramebuffer(boolean bl, int[] nArray) {
        if (nArray.length == 0) {
            return this.createEmptyFramebuffer();
        }
        ImmutableSet<Integer> immutableSet = ImmutableSet.of();
        if (!bl) {
            immutableSet = this.invert((ImmutableSet<Integer>)ImmutableSet.of(), nArray);
        }
        return this.createColorFramebufferWithDepth(immutableSet, nArray);
    }

    private GlFramebuffer createEmptyFramebuffer() {
        GlFramebuffer glFramebuffer = new GlFramebuffer();
        this.ownedFramebuffers.add(glFramebuffer);
        glFramebuffer.addDepthAttachment(this.currentDepthTexture);
        glFramebuffer.addColorAttachment(0, this.getOrCreate(0).getMainTexture());
        glFramebuffer.noDrawBuffers();
        return glFramebuffer;
    }

    public GlFramebuffer createClearFramebuffer(boolean bl, int[] nArray) {
        ImmutableSet<Integer> immutableSet = ImmutableSet.of();
        if (!bl) {
            immutableSet = this.invert((ImmutableSet<Integer>)ImmutableSet.of(), nArray);
        }
        return this.createColorFramebuffer(immutableSet, nArray);
    }

    public GlFramebuffer createColorFramebufferWithDepth(ImmutableSet<Integer> immutableSet, int[] nArray) {
        GlFramebuffer glFramebuffer = this.createColorFramebuffer(immutableSet, nArray);
        glFramebuffer.addDepthAttachment(this.currentDepthTexture);
        return glFramebuffer;
    }

    public int getCurrentHeight() {
        return this.cachedHeight;
    }

    public int getCurrentWidth() {
        return this.cachedWidth;
    }

    public GlFramebuffer createDHFramebuffer(ImmutableSet<Integer> immutableSet, int[] nArray) {
        if (nArray.length == 0) {
            return this.createEmptyFramebuffer();
        }
        ImmutableSet<Integer> immutableSet2 = this.invert(immutableSet, nArray);
        return this.createColorFramebuffer(immutableSet2, nArray);
    }

    public GlFramebuffer createGbufferFramebuffer(ImmutableSet<Integer> immutableSet, int[] nArray) {
        if (nArray.length == 0) {
            return this.createEmptyFramebuffer();
        }
        ImmutableSet<Integer> immutableSet2 = this.invert(immutableSet, nArray);
        GlFramebuffer glFramebuffer = this.createColorFramebuffer(immutableSet2, nArray);
        glFramebuffer.addDepthAttachment(this.currentDepthTexture);
        return glFramebuffer;
    }

    public GlFramebuffer createColorFramebuffer(ImmutableSet<Integer> immutableSet, int[] nArray) {
        int n;
        if (nArray.length == 0) {
            throw new IllegalArgumentException("Framebuffer must have at least one color buffer");
        }
        GlFramebuffer glFramebuffer = new GlFramebuffer();
        this.ownedFramebuffers.add(glFramebuffer);
        int[] nArray2 = new int[nArray.length];
        for (n = 0; n < nArray.length; ++n) {
            nArray2[n] = n;
            if (nArray[n] >= this.getRenderTargetCount()) {
                glFramebuffer.destroy();
                this.ownedFramebuffers.remove(glFramebuffer);
                throw new IllegalStateException("Render target with index " + nArray[n] + " is not supported, only " + this.getRenderTargetCount() + " render targets are supported.");
            }
            RenderTarget renderTarget = this.getOrCreate(nArray[n]);
            int n2 = immutableSet.contains((Object)nArray[n]) ? renderTarget.getMainTexture() : renderTarget.getAltTexture();
            glFramebuffer.addColorAttachment(n, n2);
        }
        glFramebuffer.drawBuffers(nArray2);
        glFramebuffer.readBuffer(0);
        n = glFramebuffer.getStatus();
        if (n != 36053) {
            throw new IllegalStateException("Unexpected error while creating framebuffer: Draw buffers " + Arrays.toString(nArray2) + " Status: " + n);
        }
        return glFramebuffer;
    }

    public int getRenderTargetCount() {
        return this.targets.length;
    }

    public void copyPreTranslucentDepth() {
        if (this.translucentDepthDirty) {
            this.translucentDepthDirty = false;
            GlStateManager._bindTexture((int)this.noTranslucents.iris$getGlId());
            this.depthSourceFb.bindAsReadBuffer();
            IrisRenderSystem.copyTexImage2D((int)3553, (int)0, (int)this.currentDepthFormat.getGlInternalFormat(), (int)0, (int)0, (int)this.cachedWidth, (int)this.cachedHeight, (int)0);
        } else {
            this.copyStrategy.copy(this.depthSourceFb, this.getDepthTexture().iris$getGlId(), this.noTranslucentsDestFb, this.noTranslucents.iris$getGlId(), this.getCurrentWidth(), this.getCurrentHeight());
        }
    }

    public boolean isFullClearRequired() {
        return this.fullClearRequired;
    }

    public void createIfUnsure(int n) {
        if (this.targets[n] == null) {
            this.create(n);
        }
    }

    public GpuTexture getDepthTextureNoHand() {
        return this.noHand;
    }
}

