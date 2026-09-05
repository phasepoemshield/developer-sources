/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.opengl.GlStateManager
 *  com.seibel.distanthorizons.api.DhApi$Delayed
 *  com.seibel.distanthorizons.api.interfaces.override.IDhApiOverrideable
 *  com.seibel.distanthorizons.api.interfaces.override.rendering.IDhApiFramebuffer
 *  com.seibel.distanthorizons.api.interfaces.override.rendering.IDhApiGenericObjectShaderProgram
 *  com.seibel.distanthorizons.api.objects.math.DhApiVec3f
 *  com.seibel.distanthorizons.coreapi.DependencyInjection.OverrideInjector
 *  minecraft.class05630
 *  minecraft.class06202
 *  net.irisshaders.iris.compat.dh.DhFrameBufferWrapper
 *  net.irisshaders.iris.compat.dh.IrisGenericRenderProgram
 *  net.irisshaders.iris.pipeline.IrisRenderingPipeline
 *  net.irisshaders.iris.shaderpack.programs.ProgramSource
 *  net.irisshaders.iris.shaderpack.properties.CloudSetting
 *  net.irisshaders.iris.targets.Blaze3dRenderTargetExt
 *  net.irisshaders.iris.targets.DepthTexture
 *  net.irisshaders.iris.uniforms.CapturedRenderingState
 *  net.irisshaders.iris.uniforms.custom.CustomUniforms
 */
package net.irisshaders.iris.compat.dh;

import com.mojang.blaze3d.opengl.GlStateManager;
import com.seibel.distanthorizons.api.DhApi;
import com.seibel.distanthorizons.api.interfaces.override.IDhApiOverrideable;
import com.seibel.distanthorizons.api.interfaces.override.rendering.IDhApiFramebuffer;
import com.seibel.distanthorizons.api.interfaces.override.rendering.IDhApiGenericObjectShaderProgram;
import com.seibel.distanthorizons.api.objects.math.DhApiVec3f;
import com.seibel.distanthorizons.coreapi.DependencyInjection.OverrideInjector;
import java.io.IOException;
import minecraft.class05630;
import minecraft.class06202;
import net.irisshaders.iris.Iris;
import net.irisshaders.iris.compat.dh.DhFrameBufferWrapper;
import net.irisshaders.iris.compat.dh.IrisGenericRenderProgram;
import net.irisshaders.iris.compat.dh.IrisLodRenderProgram;
import net.irisshaders.iris.gl.IrisRenderSystem;
import net.irisshaders.iris.gl.framebuffer.GlFramebuffer;
import net.irisshaders.iris.gl.texture.DepthBufferFormat;
import net.irisshaders.iris.gl.texture.DepthCopyStrategy;
import net.irisshaders.iris.pipeline.IrisRenderingPipeline;
import net.irisshaders.iris.shaderpack.programs.ProgramSource;
import net.irisshaders.iris.shaderpack.properties.CloudSetting;
import net.irisshaders.iris.targets.Blaze3dRenderTargetExt;
import net.irisshaders.iris.targets.DepthTexture;
import net.irisshaders.iris.uniforms.CapturedRenderingState;
import net.irisshaders.iris.uniforms.custom.CustomUniforms;

public class DHCompatInternal {
    public static final DHCompatInternal SHADERLESS = new DHCompatInternal(null, false);
    static boolean dhEnabled;
    private static int guiScale;
    private final IrisRenderingPipeline pipeline;
    public boolean shouldOverrideShadow;
    public boolean shouldOverride;
    private GlFramebuffer dhGenericFramebuffer;
    private IrisLodRenderProgram solidProgram;
    private IrisGenericRenderProgram genericShader;
    private IrisLodRenderProgram translucentProgram;
    private IrisLodRenderProgram shadowProgram;
    private GlFramebuffer dhTerrainFramebuffer;
    private DhFrameBufferWrapper dhTerrainFramebufferWrapper;
    private GlFramebuffer dhWaterFramebuffer;
    private GlFramebuffer dhShadowFramebuffer;
    private DhFrameBufferWrapper dhShadowFramebufferWrapper;
    private DepthTexture depthTexNoTranslucent;
    private boolean translucentDepthDirty;
    private int storedDepthTex = -1;
    private boolean incompatible = false;
    private int cachedVersion;

    public static float getFarPlane() {
        if (DhApi.Delayed.configs == null) {
            return 0.0f;
        }
        int n = (Integer)DhApi.Delayed.configs.graphics().chunkRenderDistance().getValue();
        int n2 = n * 16;
        return (float)((double)(n2 + 512) * Math.sqrt(2.0));
    }

    public static int getRenderDistance() {
        return DHCompatInternal.getDhBlockRenderDistance();
    }

    public int getStoredDepthTex() {
        return this.storedDepthTex;
    }

    public boolean incompatiblePack() {
        return this.incompatible;
    }

    public static float getNearPlane() {
        if (DhApi.Delayed.renderProxy == null) {
            return 0.0f;
        }
        return DhApi.Delayed.renderProxy.getNearClipPlaneDistanceInBlocks(CapturedRenderingState.INSTANCE.getRealTickDelta());
    }

    public DHCompatInternal(IrisRenderingPipeline irisRenderingPipeline, boolean bl) {
        ProgramSource programSource;
        this.pipeline = irisRenderingPipeline;
        if (irisRenderingPipeline == null || !((Boolean)DhApi.Delayed.configs.graphics().renderingEnabled().getValue()).booleanValue()) {
            return;
        }
        if (irisRenderingPipeline.getDHTerrainShader().isEmpty() && irisRenderingPipeline.getDHWaterShader().isEmpty()) {
            Iris.logger.warn("No DH shader found in this pack.");
            this.incompatible = true;
            return;
        }
        this.cachedVersion = ((Blaze3dRenderTargetExt)class06202.Nq().e()).iris$getDepthBufferVersion();
        this.createDepthTex(class06202.Nq().e().N, class06202.Nq().e().y);
        this.translucentDepthDirty = true;
        ProgramSource programSource2 = (ProgramSource)irisRenderingPipeline.getDHTerrainShader().get();
        this.solidProgram = IrisLodRenderProgram.createProgram(programSource2.getName(), false, false, programSource2, irisRenderingPipeline.getCustomUniforms(), irisRenderingPipeline);
        ProgramSource programSource3 = (ProgramSource)irisRenderingPipeline.getDHGenericShader().get();
        this.genericShader = IrisGenericRenderProgram.createProgram((String)(programSource3.getName() + "_g"), (boolean)false, (boolean)false, (ProgramSource)programSource3, (CustomUniforms)irisRenderingPipeline.getCustomUniforms(), (IrisRenderingPipeline)irisRenderingPipeline);
        this.dhGenericFramebuffer = irisRenderingPipeline.createDHFramebuffer(programSource3, false);
        if (irisRenderingPipeline.getDHWaterShader().isPresent()) {
            programSource = (ProgramSource)irisRenderingPipeline.getDHWaterShader().get();
            this.translucentProgram = IrisLodRenderProgram.createProgram(programSource.getName(), false, true, programSource, irisRenderingPipeline.getCustomUniforms(), irisRenderingPipeline);
            this.dhWaterFramebuffer = irisRenderingPipeline.createDHFramebuffer(programSource, true);
        }
        if (irisRenderingPipeline.getDHShadowShader().isPresent() && bl) {
            programSource = (ProgramSource)irisRenderingPipeline.getDHShadowShader().get();
            this.shadowProgram = IrisLodRenderProgram.createProgram(programSource.getName(), true, false, programSource, irisRenderingPipeline.getCustomUniforms(), irisRenderingPipeline);
            if (irisRenderingPipeline.hasShadowRenderTargets()) {
                this.dhShadowFramebuffer = irisRenderingPipeline.createDHFramebufferShadow(programSource);
                this.dhShadowFramebufferWrapper = new DhFrameBufferWrapper(this.dhShadowFramebuffer);
            }
            this.shouldOverrideShadow = true;
        } else {
            this.shouldOverrideShadow = false;
        }
        this.dhTerrainFramebuffer = irisRenderingPipeline.createDHFramebuffer(programSource2, false);
        this.dhTerrainFramebufferWrapper = new DhFrameBufferWrapper(this.dhTerrainFramebuffer);
        if (this.translucentProgram == null) {
            this.translucentProgram = this.solidProgram;
        }
        this.shouldOverride = true;
    }

    static {
        guiScale = -1;
    }

    public void clear() {
        if (this.solidProgram != null) {
            this.solidProgram.free();
            this.solidProgram = null;
        }
        if (this.translucentProgram != null) {
            this.translucentProgram.free();
            this.translucentProgram = null;
        }
        if (this.shadowProgram != null) {
            this.shadowProgram.free();
            this.shadowProgram = null;
        }
        this.shouldOverrideShadow = false;
        this.shouldOverride = false;
        this.dhTerrainFramebuffer = null;
        this.dhWaterFramebuffer = null;
        this.dhShadowFramebuffer = null;
        this.storedDepthTex = -1;
        this.translucentDepthDirty = true;
        OverrideInjector.INSTANCE.unbind(IDhApiFramebuffer.class, (IDhApiOverrideable)this.dhTerrainFramebufferWrapper);
        OverrideInjector.INSTANCE.unbind(IDhApiGenericObjectShaderProgram.class, (IDhApiOverrideable)this.genericShader);
        OverrideInjector.INSTANCE.unbind(IDhApiFramebuffer.class, (IDhApiOverrideable)this.dhShadowFramebufferWrapper);
        this.dhTerrainFramebufferWrapper = null;
        this.dhShadowFramebufferWrapper = null;
    }

    public static boolean checkFrame() {
        if (guiScale == -1) {
            guiScale = (Integer)((class05630)class06202.Nq().i_7).Nq().method_41753();
        }
        if (DhApi.Delayed.configs == null) {
            return dhEnabled;
        }
        if ((dhEnabled != (Boolean)DhApi.Delayed.configs.graphics().renderingEnabled().getValue() || guiScale != (Integer)((class05630)class06202.Nq().i_7).Nq().method_41753()) && Iris.isPackInUseQuick()) {
            guiScale = (Integer)((class05630)class06202.Nq().i_7).Nq().method_41753();
            dhEnabled = (Boolean)DhApi.Delayed.configs.graphics().renderingEnabled().getValue();
            try {
                Iris.reload();
            }
            catch (IOException iOException) {
                throw new RuntimeException(iOException);
            }
        }
        return dhEnabled;
    }

    public DhFrameBufferWrapper getShadowFBWrapper() {
        return this.dhShadowFramebufferWrapper;
    }

    public GlFramebuffer getGenericFB() {
        return this.dhGenericFramebuffer;
    }

    public IDhApiGenericObjectShaderProgram getGenericShader() {
        return this.genericShader;
    }

    public void copyTranslucents(int n, int n2) {
        if (this.translucentDepthDirty) {
            this.translucentDepthDirty = false;
            GlStateManager._bindTexture((int)this.depthTexNoTranslucent.getTextureId());
            this.dhTerrainFramebuffer.bindAsReadBuffer();
            IrisRenderSystem.copyTexImage2D(3553, 0, DepthBufferFormat.DEPTH32F.getGlInternalFormat(), 0, 0, n, n2, 0);
        } else {
            DepthCopyStrategy.fastest(false).copy(this.dhTerrainFramebuffer, this.storedDepthTex, null, this.depthTexNoTranslucent.getTextureId(), n, n2);
        }
    }

    public void setModelPos(DhApiVec3f dhApiVec3f) {
        this.solidProgram.bind();
        this.solidProgram.setModelPos(dhApiVec3f);
        this.translucentProgram.bind();
        this.translucentProgram.setModelPos(dhApiVec3f);
        this.solidProgram.bind();
    }

    public DhFrameBufferWrapper getSolidFBWrapper() {
        return this.dhTerrainFramebufferWrapper;
    }

    public IrisLodRenderProgram getSolidShader() {
        return this.solidProgram;
    }

    public void createDepthTex(int n, int n2) {
        if (this.depthTexNoTranslucent != null) {
            this.depthTexNoTranslucent.destroy();
            this.depthTexNoTranslucent = null;
        }
        this.translucentDepthDirty = true;
        this.depthTexNoTranslucent = new DepthTexture("DH depth tex", n, n2, DepthBufferFormat.DEPTH32F);
    }

    public GlFramebuffer getShadowFB() {
        return this.dhShadowFramebuffer;
    }

    public IrisLodRenderProgram getShadowShader() {
        return this.shadowProgram;
    }

    public GlFramebuffer getTranslucentFB() {
        return this.dhWaterFramebuffer;
    }

    public void reconnectDHTextures(int n) {
        if (((Blaze3dRenderTargetExt)class06202.Nq().e()).iris$getDepthBufferVersion() != this.cachedVersion) {
            this.cachedVersion = ((Blaze3dRenderTargetExt)class06202.Nq().e()).iris$getDepthBufferVersion();
            this.createDepthTex(class06202.Nq().e().N, class06202.Nq().e().y);
        }
        if (this.storedDepthTex != n && this.dhTerrainFramebuffer != null) {
            this.storedDepthTex = n;
            this.dhTerrainFramebuffer.addDepthAttachmentBypass(n);
            if (this.dhWaterFramebuffer != null) {
                this.dhWaterFramebuffer.addDepthAttachmentBypass(n);
            }
            if (this.dhGenericFramebuffer != null) {
                this.dhGenericFramebuffer.addDepthAttachmentBypass(n);
            }
        }
    }

    public static int getDhBlockRenderDistance() {
        if (DhApi.Delayed.configs == null || !dhEnabled) {
            return ((class05630)class06202.Nq().i_7).Nh();
        }
        return (Integer)DhApi.Delayed.configs.graphics().chunkRenderDistance().getValue() * 16;
    }

    public IrisLodRenderProgram getTranslucentShader() {
        if (this.translucentProgram == null) {
            return this.solidProgram;
        }
        return this.translucentProgram;
    }

    public boolean avoidRenderingClouds() {
        return this.pipeline != null && (this.pipeline.getDHCloudSetting() == CloudSetting.OFF || this.pipeline.getDHCloudSetting() == CloudSetting.DEFAULT && this.pipeline.getCloudSetting() == CloudSetting.OFF);
    }

    public GlFramebuffer getSolidFB() {
        return this.dhTerrainFramebuffer;
    }

    public int getDepthTexNoTranslucent() {
        if (this.depthTexNoTranslucent == null) {
            return 0;
        }
        return this.depthTexNoTranslucent.getTextureId();
    }
}

