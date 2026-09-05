/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableSet
 *  com.google.common.collect.ImmutableSet$Builder
 *  com.mojang.blaze3d.systems.RenderSystem
 *  com.mojang.blaze3d.textures.GpuTexture
 *  com.mojang.blaze3d.textures.TextureFormat
 *  it.unimi.dsi.fastutil.ints.IntArrayList
 *  it.unimi.dsi.fastutil.ints.IntList
 *  net.irisshaders.iris.features.FeatureFlags
 *  net.irisshaders.iris.gl.IrisRenderSystem
 *  net.irisshaders.iris.gl.framebuffer.GlFramebuffer
 *  net.irisshaders.iris.gl.sampler.GlSampler
 *  net.irisshaders.iris.gl.texture.DepthCopyStrategy
 *  net.irisshaders.iris.gl.texture.InternalTextureFormat
 *  net.irisshaders.iris.pipeline.WorldRenderingPipeline
 */
package net.irisshaders.iris.shadows;

import com.google.common.collect.ImmutableSet;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.textures.GpuTexture;
import com.mojang.blaze3d.textures.TextureFormat;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;
import java.util.ArrayList;
import java.util.List;
import net.irisshaders.iris.features.FeatureFlags;
import net.irisshaders.iris.gl.IrisRenderSystem;
import net.irisshaders.iris.gl.framebuffer.GlFramebuffer;
import net.irisshaders.iris.gl.sampler.GlSampler;
import net.irisshaders.iris.gl.texture.DepthCopyStrategy;
import net.irisshaders.iris.gl.texture.InternalTextureFormat;
import net.irisshaders.iris.pipeline.WorldRenderingPipeline;
import net.irisshaders.iris.shaderpack.properties.PackShadowDirectives;
import net.irisshaders.iris.shaderpack.properties.PackShadowDirectives$DepthSamplingSettings;
import net.irisshaders.iris.shaderpack.properties.PackShadowDirectives$SamplingSettings;
import net.irisshaders.iris.targets.RenderTarget;

public class ShadowRenderTargets {
    private final RenderTarget[] targets;
    private final PackShadowDirectives shadowDirectives;
    private final GpuTexture mainDepth;
    private final GpuTexture noTranslucents;
    private final GlFramebuffer depthSourceFb;
    private final GlFramebuffer noTranslucentsDestFb;
    private final boolean[] flipped;
    private final List<GlFramebuffer> ownedFramebuffers;
    private final int resolution;
    private final boolean[] hardwareFiltered;
    private final boolean[] mipped;
    private final boolean[] linearFiltered;
    private final InternalTextureFormat[] formats;
    private final IntList buffersToBeCleared;
    private final int size;
    private boolean fullClearRequired;
    private boolean translucentDepthDirty;
    private static final double LN_OF_2 = Math.log(2.0);

    private void create(int n2) {
        if (n2 > this.size) {
            throw new IllegalStateException("Tried to access buffer higher than allowed limit of " + this.size + "! If you're trying to use shadowcolor2-7, you need to activate it's feature flag!");
        }
        PackShadowDirectives$SamplingSettings packShadowDirectives$SamplingSettings = (PackShadowDirectives$SamplingSettings)this.shadowDirectives.getColorSamplingSettings().computeIfAbsent(n2, n -> new PackShadowDirectives$SamplingSettings());
        this.targets[n2] = RenderTarget.builder().setDimensions(this.resolution, this.resolution).setInternalFormat(packShadowDirectives$SamplingSettings.getFormat()).setName("shadowcolor" + n2).setPixelFormat(packShadowDirectives$SamplingSettings.getFormat().getPixelFormat()).build();
        this.formats[n2] = packShadowDirectives$SamplingSettings.getFormat();
        if (packShadowDirectives$SamplingSettings.getClear()) {
            this.buffersToBeCleared.add(n2);
        }
        if (packShadowDirectives$SamplingSettings.getClear()) {
            this.buffersToBeCleared.add(n2);
        }
        this.fullClearRequired = true;
    }

    public RenderTarget getOrCreate(int n) {
        if (this.targets[n] != null) {
            return this.targets[n];
        }
        this.create(n);
        return this.targets[n];
    }

    public ShadowRenderTargets(WorldRenderingPipeline worldRenderingPipeline, int n, PackShadowDirectives packShadowDirectives) {
        int n2;
        this.shadowDirectives = packShadowDirectives;
        this.size = worldRenderingPipeline.hasFeature(FeatureFlags.HIGHER_SHADOWCOLOR) ? 8 : 2;
        this.targets = new RenderTarget[this.size];
        this.formats = new InternalTextureFormat[this.size];
        this.flipped = new boolean[this.size];
        this.hardwareFiltered = new boolean[this.size];
        this.mipped = new boolean[this.size];
        this.linearFiltered = new boolean[this.size];
        this.buffersToBeCleared = new IntArrayList();
        this.ownedFramebuffers = new ArrayList<GlFramebuffer>();
        this.resolution = n;
        for (n2 = 0; n2 < packShadowDirectives.getDepthSamplingSettings().size(); ++n2) {
            this.hardwareFiltered[n2] = ((PackShadowDirectives$DepthSamplingSettings)packShadowDirectives.getDepthSamplingSettings().get(n2)).getHardwareFiltering();
            this.mipped[n2] = ((PackShadowDirectives$DepthSamplingSettings)packShadowDirectives.getDepthSamplingSettings().get(n2)).getMipmap();
            this.linearFiltered[n2] = !((PackShadowDirectives$DepthSamplingSettings)packShadowDirectives.getDepthSamplingSettings().get(n2)).getNearest();
        }
        this.mainDepth = RenderSystem.getDevice().createTexture("Shadow Map", 14, TextureFormat.DEPTH32, n, n, 1, this.mipped[0] ? ShadowRenderTargets.log2(n) : 1);
        this.noTranslucents = RenderSystem.getDevice().createTexture("Shadow Map / Opaque", 13, TextureFormat.DEPTH32, n, n, 1, this.mipped[1] ? ShadowRenderTargets.log2(n) : 1);
        this.fullClearRequired = true;
        this.depthSourceFb = this.createFramebufferWritingToMain(new int[]{0});
        this.noTranslucentsDestFb = this.createFramebufferWritingToMain(new int[]{0});
        this.noTranslucentsDestFb.addDepthAttachment(this.noTranslucents);
        this.translucentDepthDirty = true;
        n2 = 0;
    }

    public RenderTarget get(int n) {
        return this.targets[n];
    }

    public ImmutableSet<Integer> snapshot() {
        ImmutableSet.Builder builder = ImmutableSet.builder();
        for (int i = 0; i < this.flipped.length; ++i) {
            if (!this.flipped[i]) continue;
            builder.add((Object)i);
        }
        return builder.build();
    }

    public void destroy() {
        for (GlFramebuffer glFramebuffer : this.ownedFramebuffers) {
            glFramebuffer.destroy();
        }
        for (RenderTarget renderTarget : this.targets) {
            if (renderTarget == null) continue;
            renderTarget.destroy();
        }
        this.mainDepth.close();
        this.noTranslucents.close();
    }

    public void flip(int n) {
        this.flipped[n] = !this.flipped[n];
    }

    public static int log2(int n) {
        return (int)Math.floor(Math.log(n) / LN_OF_2);
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
        return this.noTranslucents;
    }

    public void onFullClear() {
        this.fullClearRequired = false;
    }

    public int getResolution() {
        return this.resolution;
    }

    public GpuTexture getDepthTexture() {
        return this.mainDepth;
    }

    public GlFramebuffer getDepthSourceFb() {
        return this.depthSourceFb;
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
        glFramebuffer.addDepthAttachment(this.mainDepth);
        glFramebuffer.addColorAttachment(0, this.get(0).getMainTexture());
        glFramebuffer.noDrawBuffers();
        return glFramebuffer;
    }

    public GlFramebuffer createColorFramebufferWithDepth(ImmutableSet<Integer> immutableSet, int[] nArray) {
        GlFramebuffer glFramebuffer = this.createColorFramebuffer(immutableSet, nArray);
        glFramebuffer.addDepthAttachment(this.mainDepth);
        return glFramebuffer;
    }

    public GlFramebuffer createDHFramebuffer(ImmutableSet<Integer> immutableSet, int[] nArray) {
        if (nArray.length == 0) {
            return this.createEmptyFramebuffer();
        }
        ImmutableSet<Integer> immutableSet2 = this.invert(immutableSet, nArray);
        GlFramebuffer glFramebuffer = this.createColorFramebuffer(immutableSet2, nArray);
        glFramebuffer.addDepthAttachment(this.mainDepth);
        return glFramebuffer;
    }

    public IntList getBuffersToBeCleared() {
        return this.buffersToBeCleared;
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
                this.ownedFramebuffers.remove(glFramebuffer);
                glFramebuffer.destroy();
                return this.createColorFramebuffer(immutableSet, new int[]{0, 1});
            }
            RenderTarget renderTarget = this.getOrCreate(nArray[n]);
            int n2 = immutableSet.contains((Object)nArray[n]) ? renderTarget.getMainTexture() : renderTarget.getAltTexture();
            glFramebuffer.addColorAttachment(n, n2);
        }
        glFramebuffer.drawBuffers(nArray2);
        glFramebuffer.readBuffer(0);
        n = glFramebuffer.getStatus();
        if (n != 36053) {
            throw new IllegalStateException("Unexpected error while creating framebuffer");
        }
        return glFramebuffer;
    }

    public int getRenderTargetCount() {
        return this.targets.length;
    }

    public void copyPreTranslucentDepth() {
        if (this.translucentDepthDirty) {
            this.translucentDepthDirty = false;
            IrisRenderSystem.blitFramebuffer((int)this.depthSourceFb.getId(), (int)this.noTranslucentsDestFb.getId(), (int)0, (int)0, (int)this.resolution, (int)this.resolution, (int)0, (int)0, (int)this.resolution, (int)this.resolution, (int)256, (int)9728);
        } else {
            DepthCopyStrategy.fastest((boolean)false).copy(this.depthSourceFb, this.mainDepth.iris$getGlId(), this.noTranslucentsDestFb, this.noTranslucents.iris$getGlId(), this.resolution, this.resolution);
        }
    }

    public boolean isFullClearRequired() {
        return this.fullClearRequired;
    }

    public GlFramebuffer createShadowFramebuffer(ImmutableSet<Integer> immutableSet, int[] nArray) {
        if (nArray.length == 0) {
            return this.createEmptyFramebuffer();
        }
        ImmutableSet<Integer> immutableSet2 = this.invert(immutableSet, nArray);
        GlFramebuffer glFramebuffer = this.createColorFramebuffer(immutableSet2, nArray);
        glFramebuffer.addDepthAttachment(this.mainDepth);
        return glFramebuffer;
    }

    public boolean isFlipped(int n) {
        return this.flipped[n];
    }

    public boolean isHardwareFiltered(int n) {
        return this.hardwareFiltered[n];
    }

    public int getColorTextureId(int n) {
        return this.isFlipped(n) ? this.get(n).getAltTexture() : this.get(n).getMainTexture();
    }

    public void createIfEmpty(int n) {
        if (this.targets[n] == null) {
            this.create(n);
        }
    }

    public GlSampler getSamplerFor(int n) {
        if (this.hardwareFiltered[n]) {
            if (this.linearFiltered[n]) {
                if (this.mipped[n]) {
                    return GlSampler.MIPPED_LINEAR_HW;
                }
                return GlSampler.LINEAR_HW;
            }
            if (this.mipped[n]) {
                return GlSampler.MIPPED_NEAREST_HW;
            }
            return GlSampler.NEAREST_HW;
        }
        if (this.linearFiltered[n]) {
            if (this.mipped[n]) {
                return GlSampler.MIPPED_LINEAR;
            }
            return GlSampler.LINEAR;
        }
        if (this.mipped[n]) {
            return GlSampler.MIPPED_NEAREST;
        }
        return GlSampler.NEAREST;
    }

    public InternalTextureFormat getColorTextureFormat(int n) {
        return this.formats[n];
    }

    public int getNumColorTextures() {
        return this.targets.length;
    }
}

