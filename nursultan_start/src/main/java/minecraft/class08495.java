/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class11220
 *  Nursultan.class11898
 *  com.mojang.blaze3d.buffers.GpuBuffer
 *  com.mojang.blaze3d.buffers.GpuBuffer$MappedView
 *  com.mojang.blaze3d.buffers.GpuBufferSlice
 *  com.mojang.blaze3d.buffers.GpuFence
 *  com.mojang.blaze3d.opengl.GlConst
 *  com.mojang.blaze3d.opengl.GlStateManager
 *  com.mojang.blaze3d.pipeline.BlendFunction
 *  com.mojang.blaze3d.pipeline.RenderPipeline
 *  com.mojang.blaze3d.platform.DepthTestFunction
 *  com.mojang.blaze3d.platform.DestFactor
 *  com.mojang.blaze3d.platform.PolygonMode
 *  com.mojang.blaze3d.platform.SourceFactor
 *  com.mojang.blaze3d.systems.CommandEncoder
 *  com.mojang.blaze3d.systems.GpuQuery
 *  com.mojang.blaze3d.systems.RenderPass
 *  com.mojang.blaze3d.systems.RenderPass$class_10884
 *  com.mojang.blaze3d.systems.RenderSystem
 *  com.mojang.blaze3d.textures.GpuTexture
 *  com.mojang.blaze3d.textures.GpuTextureView
 *  com.mojang.blaze3d.textures.TextureFormat
 *  com.mojang.blaze3d.vertex.VertexFormat$class_5595
 *  com.mojang.blaze3d.vertex.VertexFormat$class_5596
 *  java.lang.MatchException
 *  java.lang.runtime.SwitchBootstraps
 *  minecraft.class00060
 *  minecraft.class00613
 *  minecraft.class02255
 *  minecraft.class02566
 *  minecraft.class07332
 *  minecraft.class07341
 *  minecraft.class07345
 *  minecraft.class07353
 *  minecraft.class08247
 *  minecraft.class08280
 *  minecraft.class08419
 *  minecraft.class08849
 *  minecraft.class08858
 *  minecraft.class08870
 *  minecraft.class08879
 *  minecraft.class08893
 *  minecraft.class09006
 *  net.caffeinemc.mods.sodium.mixin.core.GlCommandEncoderAccessor
 *  net.irisshaders.iris.Iris
 *  net.irisshaders.iris.gl.blending.DepthColorStorage
 *  net.irisshaders.iris.pipeline.IrisRenderingPipeline
 *  net.irisshaders.iris.pipeline.WorldRenderingPipeline
 *  net.irisshaders.iris.pipeline.programs.ExtendedShader
 *  net.irisshaders.iris.pipeline.programs.IrisProgram
 *  net.irisshaders.iris.shadows.ShadowRenderingState
 *  net.irisshaders.iris.vertices.ImmediateState
 *  org.jspecify.annotations.Nullable
 *  org.lwjgl.opengl.GL11
 *  org.lwjgl.opengl.GL11C
 *  org.lwjgl.opengl.GL14
 *  org.lwjgl.opengl.GL31
 *  org.lwjgl.opengl.GL32
 *  org.lwjgl.opengl.GL32C
 *  org.lwjgl.opengl.GL33C
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package minecraft;

import Nursultan.class11220;
import Nursultan.class11898;
import com.mojang.blaze3d.buffers.GpuBuffer;
import com.mojang.blaze3d.buffers.GpuBufferSlice;
import com.mojang.blaze3d.buffers.GpuFence;
import com.mojang.blaze3d.opengl.GlConst;
import com.mojang.blaze3d.opengl.GlStateManager;
import com.mojang.blaze3d.pipeline.BlendFunction;
import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.mojang.blaze3d.platform.DepthTestFunction;
import com.mojang.blaze3d.platform.DestFactor;
import com.mojang.blaze3d.platform.PolygonMode;
import com.mojang.blaze3d.platform.SourceFactor;
import com.mojang.blaze3d.systems.CommandEncoder;
import com.mojang.blaze3d.systems.GpuQuery;
import com.mojang.blaze3d.systems.RenderPass;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.textures.GpuTexture;
import com.mojang.blaze3d.textures.GpuTextureView;
import com.mojang.blaze3d.textures.TextureFormat;
import com.mojang.blaze3d.vertex.VertexFormat;
import java.lang.runtime.SwitchBootstraps;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.function.BiConsumer;
import java.util.function.Supplier;
import minecraft.class00060;
import minecraft.class00613;
import minecraft.class02255;
import minecraft.class02566;
import minecraft.class07332;
import minecraft.class07341;
import minecraft.class07345;
import minecraft.class07353;
import minecraft.class08247;
import minecraft.class08280;
import minecraft.class08419;
import minecraft.class08523;
import minecraft.class08849;
import minecraft.class08858;
import minecraft.class08870;
import minecraft.class08879;
import minecraft.class08893;
import minecraft.class09006;
import net.caffeinemc.mods.sodium.mixin.core.GlCommandEncoderAccessor;
import net.irisshaders.iris.Iris;
import net.irisshaders.iris.gl.blending.DepthColorStorage;
import net.irisshaders.iris.pipeline.IrisRenderingPipeline;
import net.irisshaders.iris.pipeline.WorldRenderingPipeline;
import net.irisshaders.iris.pipeline.programs.ExtendedShader;
import net.irisshaders.iris.pipeline.programs.IrisProgram;
import net.irisshaders.iris.shadows.ShadowRenderingState;
import net.irisshaders.iris.vertices.ImmediateState;
import org.jspecify.annotations.Nullable;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL11C;
import org.lwjgl.opengl.GL14;
import org.lwjgl.opengl.GL31;
import org.lwjgl.opengl.GL32;
import org.lwjgl.opengl.GL32C;
import org.lwjgl.opengl.GL33C;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public class class08495
implements CommandEncoder,
GlCommandEncoderAccessor {
    private static Logger N = LoggerFactory.getLogger((String)"minecraft.class08495");
    private final class08879 y;
    private final int L;
    private final int u;
    private @Nullable RenderPipeline i;
    private boolean R;
    private @Nullable class02255 M;
    private @Nullable class00613 B;
    private int Z;
    private List z = new ArrayList();
    private static class08858 U;

    private boolean L(class08495 class084952) {
        if (ImmediateState.temporarilyIgnorePass) {
            return false;
        }
        return this.R;
    }

    public class08495(class08879 class088792) {
        this.y = class088792;
        this.L = class088792.y().y();
        this.u = class088792.y().y();
    }

    protected class08879 y() {
        return this.y;
    }

    private boolean y(class08495 class084952) {
        if (ImmediateState.temporarilyIgnorePass) {
            return false;
        }
        return this.R;
    }

    private void y(int n, int n2) {
        if (!ImmediateState.safeToMultiply) {
            GlStateManager._glBindFramebuffer((int)n, (int)n2);
        }
    }

    private void y(GpuTexture gpuTexture) {
        if (!gpuTexture.getFormat().hasDepthAspect()) {
            throw new IllegalStateException("Trying to clear a non-depth texture as depth");
        }
        if (gpuTexture.isClosed()) {
            throw new IllegalStateException("Depth texture is closed");
        }
        if ((gpuTexture.usage() & 8) == 0) {
            throw new IllegalStateException("Depth texture must have USAGE_RENDER_ATTACHMENT");
        }
        if (gpuTexture.getDepthOrLayers() > 1) {
            throw new UnsupportedOperationException("Clearing a texture with multiple layers or depths is not yet supported");
        }
    }

    private void y(class08858 class088582, Collection collection, CallbackInfoReturnable callbackInfoReturnable) {
        IrisProgram irisProgram;
        class02255 class022552 = class088582.L.y();
        if (class022552 instanceof IrisProgram && !(irisProgram = (IrisProgram)class022552).iris$isSetUp()) {
            WorldRenderingPipeline worldRenderingPipeline;
            class022552 = (class08849)class088582.B.get("Sampler0");
            if (class022552 != null && (worldRenderingPipeline = Iris.getPipelineManager().getPipelineNullable()) instanceof IrisRenderingPipeline) {
                ((IrisRenderingPipeline)worldRenderingPipeline).onSetAlbedoTex((GpuTextureView)class022552.N());
            }
            irisProgram.iris$setupState((GpuTextureView)(class022552 == null ? null : class022552.N()));
            this.z.add(irisProgram);
        }
    }

    public void N() {
        this.N((CallbackInfo)null);
        this.R = false;
        int n = 0;
        int n2 = 36160;
        this.y(n2, n);
        this.y.N().N();
    }

    protected <T> void N(class08858 class088582, Collection<RenderPass.class_10884<T>> collection, @Nullable GpuBuffer gpuBuffer, // Could not load outer class - annotation placement on inner may be incorrect
     @Nullable VertexFormat.class_5595 class_55952, Collection<String> collection2, T t) {
        if (!this.N(class088582, collection2)) {
            return;
        }
        if (class_55952 == null) {
            class_55952 = VertexFormat.class_5595.field_27372;
        }
        for (RenderPass.class_10884<T> class_108842 : collection) {
            BiConsumer biConsumer;
            VertexFormat.class_5595 class_55953 = class_108842.comp_3807() == null ? class_55952 : class_108842.comp_3807();
            class088582.setIndexBuffer(class_108842.comp_3806() == null ? gpuBuffer : class_108842.comp_3806(), class_55953);
            class088582.setVertexBuffer(class_108842.comp_3804(), class_108842.comp_3805());
            if (class08858.y) {
                if (class088582.i == null) {
                    throw new IllegalStateException("Missing index buffer");
                }
                if (class088582.i.isClosed()) {
                    throw new IllegalStateException("Index buffer has been closed!");
                }
                if (class088582.u[0] == null) {
                    throw new IllegalStateException("Missing vertex buffer at slot 0");
                }
                if (class088582.u[0].isClosed()) {
                    throw new IllegalStateException("Vertex buffer at slot 0 has been closed!");
                }
            }
            if ((biConsumer = class_108842.comp_3810()) != null) {
                biConsumer.accept(t, (string, gpuBufferSlice) -> {
                    class07345 class073452 = class088582.L.y().method_34582(string);
                    if (class073452 instanceof class07332) {
                        int n;
                        class07332 class073322 = (class07332)class073452;
                        try {
                            n = class073322.N();
                        }
                        catch (Throwable throwable) {
                            throw new MatchException(throwable.toString(), throwable);
                        }
                        GL32.glBindBufferRange((int)35345, (int)n, (int)((class08523)gpuBufferSlice.buffer()).u, (long)gpuBufferSlice.offset(), (long)gpuBufferSlice.length());
                    }
                });
            }
            this.N(class088582, 0, class_108842.comp_3808(), class_108842.comp_3809(), class_55953, class088582.L, 1);
        }
    }

    /*
     * Could not resolve type clashes
     * Unable to fully structure code
     */
    private boolean N(class08858 var1_1, Collection<String> var2_2) {
        var26_3 = new CallbackInfoReturnable("", true);
        this.N(var1_1, var2_2, var26_3);
        if (var26_3.isCancelled()) {
            return var26_3.getReturnValueZ();
        }
        if (class08858.y) {
            if (var1_1.L == null) {
                throw new IllegalStateException("Can't draw without a render pipeline");
            }
            if (var1_1.L.y() == class02255.field_57864) {
                throw new IllegalStateException("Pipeline contains invalid shader program");
            }
            for (Object var4_5 : var1_1.L.N().getUniforms()) {
                var5_6 /* !! */  = (GpuBufferSlice)var1_1.M.get(var4_5.name());
                if (var2_2.contains(var4_5.name())) continue;
                if (var5_6 /* !! */  == null) {
                    throw new IllegalStateException("Missing uniform " + var4_5.name() + " (should be " + String.valueOf(var4_5.type()) + ")");
                }
                if (var4_5.type() == class08419.field_60031) {
                    if (var5_6 /* !! */ .buffer().isClosed()) {
                        throw new IllegalStateException("Uniform buffer " + var4_5.name() + " is already closed");
                    }
                    if ((var5_6 /* !! */ .buffer().usage() & 128) == 0) {
                        throw new IllegalStateException("Uniform buffer " + var4_5.name() + " must have GpuBuffer.USAGE_UNIFORM");
                    }
                }
                if (var4_5.type() != class08419.field_60032) continue;
                if (var5_6 /* !! */ .offset() != 0L || var5_6 /* !! */ .length() != var5_6 /* !! */ .buffer().size()) {
                    throw new IllegalStateException("Uniform texel buffers do not support a slice of a buffer, must be entire buffer");
                }
                if (var4_5.textureFormat() != null) continue;
                throw new IllegalStateException("Invalid uniform texel buffer " + var4_5.name() + " (missing a texture format)");
            }
            for (Object var4_5 : var1_1.L.y().method_68406().entrySet()) {
                if (!(var4_5.getValue() instanceof class07341)) continue;
                var5_6 /* !! */  = (String)var4_5.getKey();
                var6_8 = (class08849)var1_1.B.get(var5_6 /* !! */ );
                if (var6_8 == null) {
                    throw new IllegalStateException("Missing sampler " + (String)var5_6 /* !! */ );
                }
                var7_10 = var6_8.N();
                if (var7_10.isClosed()) {
                    throw new IllegalStateException("Texture view " + (String)var5_6 /* !! */  + " (" + var7_10.texture().getLabel() + ") has been closed!");
                }
                if ((var7_10.texture().usage() & 4) == 0) {
                    throw new IllegalStateException("Texture view " + (String)var5_6 /* !! */  + " (" + var7_10.texture().getLabel() + ") must have USAGE_TEXTURE_BINDING!");
                }
                if (!var6_8.y().B()) continue;
                throw new IllegalStateException("Sampler for " + (String)var5_6 /* !! */  + " (" + var7_10.texture().getLabel() + ") has been closed!");
            }
            if (var1_1.L.N().wantsDepthTexture() && !var1_1.N()) {
                class08495.N.warn("Render pipeline {} wants a depth texture but none was provided - this is probably a bug", (Object)var1_1.L.N().getLocation());
            }
        } else if (var1_1.L == null || var1_1.L.y() == class02255.field_57864) {
            this.y(var1_1, var2_2, null);
            return false;
        }
        var3_4 = var1_1.L.N();
        var4_5 = var1_1.L.y();
        this.N(var3_4);
        v0 = var5_7 = this.M != var4_5;
        if (var5_7) {
            GlStateManager._glUseProgram((int)var4_5.method_1270());
            this.M = var4_5;
        }
        block15: for (class09006 var7_10 : var4_5.method_68406().entrySet()) {
            var8_11 = (String)var7_10.getKey();
            var9_12 = var1_1.Z.contains(var8_11);
            Objects.requireNonNull((class07345)var7_10.getValue());
            var11_14 = 0;
            switch (SwitchBootstraps.typeSwitch("typeSwitch", new Object[]{class07332.class, class07353.class, class07341.class}, (Object)var10_13, (int)var11_14)) {
                default: {
                    throw new MatchException(null, null);
                }
                case 0: {
                    var13_15 = var14_16 = ((class07332)var10_13).N();
                    if (!var9_12) continue block15;
                    var14_17 = (GpuBufferSlice)var1_1.M.get(var8_11);
                    GL32.glBindBufferRange((int)35345, (int)var13_15, (int)((class08523)var14_17.buffer()).u, (long)var14_17.offset(), (long)var14_17.length());
                    continue block15;
                }
                case 1: {
                    var14_18 = (class07353)var10_13;
                    var15_19 = var19_23 = var14_18.N();
                    var16_20 = var19_23 = var14_18.y();
                    var17_21 = var19_24 = var14_18.L();
                    var18_22 = var19_25 = var14_18.u();
                    if (!var5_7 && !var9_12) ** GOTO lbl79
                    GlStateManager._glUniform1i((int)var15_19, (int)var16_20);
lbl79:
                    // 2 sources

                    GlStateManager._activeTexture((int)(33984 + var16_20));
                    GL11C.glBindTexture((int)35882, (int)var18_22);
                    if (!var9_12) continue block15;
                    var19_26 = (GpuBufferSlice)var1_1.M.get(var8_11);
                    GL31.glTexBuffer((int)35882, (int)GlConst.toGlInternalId((TextureFormat)var17_21), (int)((class08523)var19_26.buffer()).u);
                    continue block15;
                }
                case 2: 
            }
            var19_27 = (class07341)var10_13;
            var20_28 = var22_31 = var19_27.N();
            var21_29 = var22_31 = var19_27.y();
            var22_30 = (class08849)var1_1.B.get(var8_11);
            if (var22_30 == null) continue;
            var23_32 = var22_30.N();
            if (var5_7 || var9_12) {
                GlStateManager._glUniform1i((int)var20_28, (int)var21_29);
            }
            GlStateManager._activeTexture((int)(33984 + var21_29));
            var24_33 = var23_32.texture();
            if ((var24_33.usage() & 16) != 0) {
                var25_34 = 34067;
                GL11.glBindTexture((int)34067, (int)var24_33.N);
            } else {
                var25_34 = 3553;
                GlStateManager._bindTexture((int)var24_33.N);
            }
            GL33C.glBindSampler((int)var21_29, (int)var22_30.y().N());
            GlStateManager._texParameter((int)var25_34, (int)33084, (int)var23_32.baseMipLevel());
            GlStateManager._texParameter((int)var25_34, (int)33085, (int)(var23_32.baseMipLevel() + var23_32.mipLevels() - 1));
        }
        var1_1.Z.clear();
        if (var1_1.y()) {
            GlStateManager._enableScissorTest();
            GlStateManager._scissorBox((int)var1_1.L(), (int)var1_1.u(), (int)var1_1.i(), (int)var1_1.R());
        } else {
            GlStateManager._disableScissorTest();
        }
        this.y(var1_1, var2_2, null);
        return true;
        catch (Throwable var6_9) {
            throw new MatchException(var6_9.toString(), var6_9);
        }
    }

    private void N(RenderPipeline renderPipeline) {
        this.N(renderPipeline, null);
        if (this.i == renderPipeline) {
            return;
        }
        this.i = renderPipeline;
        if (renderPipeline.getDepthTestFunction() != DepthTestFunction.NO_DEPTH_TEST) {
            GlStateManager._enableDepthTest();
            GlStateManager._depthFunc((int)GlConst.toGl((DepthTestFunction)renderPipeline.getDepthTestFunction()));
        } else {
            GlStateManager._disableDepthTest();
        }
        if (renderPipeline.isCull()) {
            GlStateManager._enableCull();
        } else {
            GlStateManager._disableCull();
        }
        if (renderPipeline.getBlendFunction().isPresent()) {
            GlStateManager._enableBlend();
            BlendFunction blendFunction = (BlendFunction)renderPipeline.getBlendFunction().get();
            GlStateManager._blendFuncSeparate((int)GlConst.toGl((SourceFactor)blendFunction.sourceColor()), (int)GlConst.toGl((DestFactor)blendFunction.destColor()), (int)GlConst.toGl((SourceFactor)blendFunction.sourceAlpha()), (int)GlConst.toGl((DestFactor)blendFunction.destAlpha()));
        } else {
            GlStateManager._disableBlend();
        }
        GlStateManager._polygonMode((int)1032, (int)GlConst.toGl((PolygonMode)renderPipeline.getPolygonMode()));
        GlStateManager._depthMask((boolean)renderPipeline.isWriteDepth());
        GlStateManager._colorMask((boolean)renderPipeline.isWriteColor(), (boolean)renderPipeline.isWriteColor(), (boolean)renderPipeline.isWriteColor(), (boolean)renderPipeline.isWriteAlpha());
        if (renderPipeline.getDepthBiasConstant() != 0.0f || renderPipeline.getDepthBiasScaleFactor() != 0.0f) {
            GlStateManager._polygonOffset((float)renderPipeline.getDepthBiasScaleFactor(), (float)renderPipeline.getDepthBiasConstant());
            GlStateManager._enablePolygonOffset();
        } else {
            GlStateManager._disablePolygonOffset();
        }
        switch (class11220.N[renderPipeline.getColorLogic().ordinal()]) {
            case 1: {
                GlStateManager._disableColorLogicOp();
                break;
            }
            case 2: {
                GlStateManager._enableColorLogicOp();
                GlStateManager._logicOp((int)5387);
            }
        }
    }

    protected void N(class08858 class088582, int n, int n2, int n3, // Could not load outer class - annotation placement on inner may be incorrect
     @Nullable VertexFormat.class_5595 class_55952, int n4) {
        if (!this.N(class088582, Collections.emptyList())) {
            return;
        }
        if (class08858.y) {
            if (class_55952 != null) {
                if (class088582.i == null) {
                    throw new IllegalStateException("Missing index buffer");
                }
                if (class088582.i.isClosed()) {
                    throw new IllegalStateException("Index buffer has been closed!");
                }
                if ((class088582.i.usage() & 0x40) == 0) {
                    throw new IllegalStateException("Index buffer must have GpuBuffer.USAGE_INDEX!");
                }
            }
            class08870 class088702 = class088582.L;
            if (class088582.u[0] == null && class088702 != null && !class088702.N().getVertexFormat().getElements().isEmpty()) {
                throw new IllegalStateException("Vertex format contains elements but vertex buffer at slot 0 is null");
            }
            if (class088582.u[0] != null && class088582.u[0].isClosed()) {
                throw new IllegalStateException("Vertex buffer at slot 0 has been closed!");
            }
            if (class088582.u[0] != null && (class088582.u[0].usage() & 0x20) == 0) {
                throw new IllegalStateException("Vertex buffer must have GpuBuffer.USAGE_VERTEX!");
            }
        }
        this.N(class088582, n, n2, n3, class_55952, class088582.L, n4);
    }

    private void N(class08858 class088582, int n, int n2, int n3, // Could not load outer class - annotation placement on inner may be incorrect
     @Nullable VertexFormat.class_5595 class_55952, class08870 class088702, int n4) {
        this.y.L().N(class088702.N().getVertexFormat(), (class08523)class088582.u[0]);
        if (class_55952 != null) {
            GlStateManager._glBindBuffer((int)34963, (int)((class08523)class088582.i).u);
            if (n4 > 1) {
                if (n > 0) {
                    GL32.glDrawElementsInstancedBaseVertex((int)GlConst.toGl((VertexFormat.class_5596)class088702.N().getVertexFormatMode()), (int)n3, (int)GlConst.toGl((VertexFormat.class_5595)class_55952), (long)((long)n2 * (long)class_55952.field_27375), (int)n4, (int)n);
                } else {
                    GL31.glDrawElementsInstanced((int)GlConst.toGl((VertexFormat.class_5596)class088702.N().getVertexFormatMode()), (int)n3, (int)GlConst.toGl((VertexFormat.class_5595)class_55952), (long)((long)n2 * (long)class_55952.field_27375), (int)n4);
                }
            } else if (n > 0) {
                GL32.glDrawElementsBaseVertex((int)GlConst.toGl((VertexFormat.class_5596)class088702.N().getVertexFormatMode()), (int)n3, (int)GlConst.toGl((VertexFormat.class_5595)class_55952), (long)((long)n2 * (long)class_55952.field_27375), (int)n);
            } else {
                GlStateManager._drawElements((int)GlConst.toGl((VertexFormat.class_5596)class088702.N().getVertexFormatMode()), (int)n3, (int)GlConst.toGl((VertexFormat.class_5595)class_55952), (long)((long)n2 * (long)class_55952.field_27375));
            }
        } else if (n4 > 1) {
            GL31.glDrawArraysInstanced((int)GlConst.toGl((VertexFormat.class_5596)class088702.N().getVertexFormatMode()), (int)n, (int)n3, (int)n4);
        } else {
            GlStateManager._drawArrays((int)GlConst.toGl((VertexFormat.class_5596)class088702.N().getVertexFormatMode()), (int)n, (int)n3);
        }
    }

    private boolean N(class08495 class084952) {
        if (ImmediateState.temporarilyIgnorePass) {
            return false;
        }
        return this.R;
    }

    private void N(class08858 class088582, Collection collection, CallbackInfoReturnable callbackInfoReturnable) {
        DepthColorStorage.unlockDepthColor();
        if (ImmediateState.safeToMultiply && !(class088582.L.y() instanceof ExtendedShader)) {
            GlStateManager._glBindFramebuffer((int)36160, (int)this.Z);
        }
        U = class088582;
        if (class088582.iris$getCustomPass() != null) {
            this.M = null;
            callbackInfoReturnable.setReturnValue((Object)true);
            class088582.iris$getCustomPass().setupState();
            RenderPipeline renderPipeline = class088582.L.N();
            if (class088582.y()) {
                GlStateManager._enableScissorTest();
                GlStateManager._scissorBox((int)class088582.L(), (int)class088582.u(), (int)class088582.i(), (int)class088582.R());
            } else {
                GlStateManager._disableScissorTest();
            }
            if (this.i != renderPipeline) {
                this.i = renderPipeline;
                if (renderPipeline.getDepthTestFunction() != DepthTestFunction.NO_DEPTH_TEST) {
                    GlStateManager._enableDepthTest();
                    GlStateManager._depthFunc((int)GlConst.toGl((DepthTestFunction)renderPipeline.getDepthTestFunction()));
                } else {
                    GlStateManager._disableDepthTest();
                }
                if (renderPipeline.isCull()) {
                    GlStateManager._enableCull();
                } else {
                    GlStateManager._disableCull();
                }
                GlStateManager._polygonMode((int)1032, (int)GlConst.toGl((PolygonMode)renderPipeline.getPolygonMode()));
                GlStateManager._depthMask((boolean)renderPipeline.isWriteDepth());
                GlStateManager._colorMask((boolean)renderPipeline.isWriteColor(), (boolean)renderPipeline.isWriteColor(), (boolean)renderPipeline.isWriteColor(), (boolean)renderPipeline.isWriteAlpha());
                if (renderPipeline.getDepthBiasConstant() == 0.0f && renderPipeline.getDepthBiasScaleFactor() == 0.0f) {
                    GlStateManager._disablePolygonOffset();
                } else {
                    GlStateManager._polygonOffset((float)renderPipeline.getDepthBiasScaleFactor(), (float)renderPipeline.getDepthBiasConstant());
                    GlStateManager._enablePolygonOffset();
                }
                switch (renderPipeline.getColorLogic()) {
                    case NONE: {
                        GlStateManager._disableColorLogicOp();
                        break;
                    }
                    case OR_REVERSE: {
                        GlStateManager._enableColorLogicOp();
                        GlStateManager._logicOp((int)5387);
                    }
                }
            }
        }
    }

    private void N(CallbackInfo callbackInfo) {
        this.z.forEach(IrisProgram::iris$clearState);
        this.z.clear();
    }

    public void N(RenderPipeline renderPipeline, CallbackInfo callbackInfo) {
        if (this.i != renderPipeline) {
            if (renderPipeline == (RenderPipeline)class11898.N_0) {
                GL14.glBlendEquation((int)32779);
            } else if (this.i == (RenderPipeline)class11898.N_0) {
                GL14.glBlendEquation((int)32774);
            }
        }
    }

    private void N(int n, int n2) {
        if (ShadowRenderingState.areShadowsCurrentlyBeingRendered() || ImmediateState.safeToMultiply) {
            this.Z = n2;
            return;
        }
        GlStateManager._glBindFramebuffer((int)n, (int)n2);
    }

    private void N(int n, int n2, int n3, int n4) {
        if (ShadowRenderingState.areShadowsCurrentlyBeingRendered()) {
            return;
        }
        GlStateManager._viewport((int)n, (int)n2, (int)n3, (int)n4);
    }

    private void N(GpuTexture gpuTexture, int n, int n2, int n3, int n4) {
        if (n < 0 || n >= gpuTexture.getWidth(0)) {
            throw new IllegalArgumentException("regionX should not be outside of the texture");
        }
        if (n2 < 0 || n2 >= gpuTexture.getHeight(0)) {
            throw new IllegalArgumentException("regionY should not be outside of the texture");
        }
        if (n3 <= 0) {
            throw new IllegalArgumentException("regionWidth should be greater than 0");
        }
        if (n + n3 > gpuTexture.getWidth(0)) {
            throw new IllegalArgumentException("regionWidth + regionX should be less than the texture width");
        }
        if (n4 <= 0) {
            throw new IllegalArgumentException("regionHeight should be greater than 0");
        }
        if (n2 + n4 > gpuTexture.getHeight(0)) {
            throw new IllegalArgumentException("regionWidth + regionX should be less than the texture height");
        }
    }

    private void N(GpuTexture gpuTexture) {
        if (!gpuTexture.getFormat().hasColorAspect()) {
            throw new IllegalStateException("Trying to clear a non-color texture as color");
        }
        if (gpuTexture.isClosed()) {
            throw new IllegalStateException("Color texture is closed");
        }
        if ((gpuTexture.usage() & 8) == 0) {
            throw new IllegalStateException("Color texture must have USAGE_RENDER_ATTACHMENT");
        }
        if (gpuTexture.getDepthOrLayers() > 1) {
            throw new UnsupportedOperationException("Clearing a texture with multiple layers or depths is not yet supported");
        }
    }

    public GpuFence createFence() {
        if (this.R) {
            throw new IllegalStateException("Close the existing render pass before performing additional commands");
        }
        return new class00060();
    }

    public RenderPass createRenderPass(Supplier<String> supplier, GpuTextureView gpuTextureView, OptionalInt optionalInt, @Nullable GpuTextureView gpuTextureView2, OptionalDouble optionalDouble) {
        int n;
        if (this.L(this)) {
            throw new IllegalStateException("Close the existing render pass before creating a new one!");
        }
        if (optionalDouble.isPresent() && gpuTextureView2 == null) {
            N.warn("Depth clear value was provided but no depth texture is being used");
        }
        if (gpuTextureView.isClosed()) {
            throw new IllegalStateException("Color texture is closed");
        }
        if ((gpuTextureView.texture().usage() & 8) == 0) {
            throw new IllegalStateException("Color texture must have USAGE_RENDER_ATTACHMENT");
        }
        if (gpuTextureView.texture().getDepthOrLayers() > 1) {
            throw new UnsupportedOperationException("Textures with multiple depths or layers are not yet supported as an attachment");
        }
        if (gpuTextureView2 != null) {
            if (gpuTextureView2.isClosed()) {
                throw new IllegalStateException("Depth texture is closed");
            }
            if ((gpuTextureView2.texture().usage() & 8) == 0) {
                throw new IllegalStateException("Depth texture must have USAGE_RENDER_ATTACHMENT");
            }
            if (gpuTextureView2.texture().getDepthOrLayers() > 1) {
                throw new UnsupportedOperationException("Textures with multiple depths or layers are not yet supported as an attachment");
            }
        }
        this.R = true;
        this.y.N().N(supplier);
        int n2 = n = ((class09006)gpuTextureView).N(this.y.y(), gpuTextureView2 == null ? null : gpuTextureView2.texture());
        int n3 = 36160;
        this.N(n3, n2);
        int n4 = 0;
        if (optionalInt.isPresent()) {
            int n5 = optionalInt.getAsInt();
            GL11.glClearColor((float)class02566.m((int)n5), (float)class02566.P((int)n5), (float)class02566.s((int)n5), (float)class02566.W((int)n5));
            n4 |= 0x4000;
        }
        if (gpuTextureView2 != null && optionalDouble.isPresent()) {
            GL11.glClearDepth((double)optionalDouble.getAsDouble());
            n4 |= 0x100;
        }
        if (n4 != 0) {
            GlStateManager._disableScissorTest();
            GlStateManager._depthMask((boolean)true);
            GlStateManager._colorMask((boolean)true, (boolean)true, (boolean)true, (boolean)true);
            GlStateManager._clear((int)n4);
        }
        int n6 = gpuTextureView.getHeight(0);
        int n7 = gpuTextureView.getWidth(0);
        n2 = 0;
        n3 = 0;
        this.N(n3, n2, n7, n6);
        this.i = null;
        return new class08858(this, gpuTextureView2 != null);
    }

    public RenderPass createRenderPass(Supplier<String> supplier, GpuTextureView gpuTextureView, OptionalInt optionalInt) {
        return this.createRenderPass(supplier, gpuTextureView, optionalInt, null, OptionalDouble.empty());
    }

    public void writeToBuffer(GpuBufferSlice gpuBufferSlice, ByteBuffer byteBuffer) {
        if (this.N(this)) {
            throw new IllegalStateException("Close the existing render pass before performing additional commands");
        }
        class08523 class085232 = (class08523)gpuBufferSlice.buffer();
        if (class085232.y) {
            throw new IllegalStateException("Buffer already closed");
        }
        if ((class085232.usage() & 8) == 0) {
            throw new IllegalStateException("Buffer needs USAGE_COPY_DST to be a destination for a copy");
        }
        int n = byteBuffer.remaining();
        if ((long)n > gpuBufferSlice.length()) {
            throw new IllegalArgumentException("Cannot write more data than the slice allows (attempting to write " + n + " bytes into a slice of length " + gpuBufferSlice.length() + ")");
        }
        if (gpuBufferSlice.length() + gpuBufferSlice.offset() > class085232.size()) {
            throw new IllegalArgumentException("Cannot write more data than this buffer can hold (attempting to write " + n + " bytes at offset " + gpuBufferSlice.offset() + " to " + class085232.size() + " size buffer)");
        }
        this.y.y().N(class085232.u, gpuBufferSlice.offset(), byteBuffer, class085232.usage());
    }

    public void presentTexture(GpuTextureView gpuTextureView) {
        if (this.R) {
            throw new IllegalStateException("Close the existing render pass before performing additional commands");
        }
        if (!gpuTextureView.texture().getFormat().hasColorAspect()) {
            throw new IllegalStateException("Cannot present a non-color texture!");
        }
        if ((gpuTextureView.texture().usage() & 8) == 0) {
            throw new IllegalStateException("Color texture must have USAGE_RENDER_ATTACHMENT to presented to the screen");
        }
        if (gpuTextureView.texture().getDepthOrLayers() > 1) {
            throw new UnsupportedOperationException("Textures with multiple depths or layers are not yet supported for presentation");
        }
        GlStateManager._disableScissorTest();
        GlStateManager._viewport((int)0, (int)0, (int)gpuTextureView.getWidth(0), (int)gpuTextureView.getHeight(0));
        GlStateManager._depthMask((boolean)true);
        GlStateManager._colorMask((boolean)true, (boolean)true, (boolean)true, (boolean)true);
        this.y.y().N(this.u, ((class08893)gpuTextureView.texture()).N(), 0, 0, 0);
        this.y.y().N(this.u, 0, 0, 0, gpuTextureView.getWidth(0), gpuTextureView.getHeight(0), 0, 0, gpuTextureView.getWidth(0), gpuTextureView.getHeight(0), 16384, 9728);
    }

    public void clearColorTexture(GpuTexture gpuTexture, int n) {
        if (this.R) {
            throw new IllegalStateException("Close the existing render pass before creating a new one!");
        }
        this.N(gpuTexture);
        this.y.y().N(this.u, ((class08893)gpuTexture).N, 0, 0, 36160);
        GL11.glClearColor((float)class02566.m((int)n), (float)class02566.P((int)n), (float)class02566.s((int)n), (float)class02566.W((int)n));
        GlStateManager._disableScissorTest();
        GlStateManager._colorMask((boolean)true, (boolean)true, (boolean)true, (boolean)true);
        GlStateManager._clear((int)16384);
        GlStateManager._glFramebufferTexture2D((int)36160, (int)36064, (int)3553, (int)0, (int)0);
        GlStateManager._glBindFramebuffer((int)36160, (int)0);
    }

    public void writeToTexture(GpuTexture gpuTexture, class08280 class082802, int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8) {
        int n9;
        if (this.y(this)) {
            throw new IllegalStateException("Close the existing render pass before performing additional commands");
        }
        if (n < 0 || n >= gpuTexture.getMipLevels()) {
            throw new IllegalArgumentException("Invalid mipLevel " + n + ", must be >= 0 and < " + gpuTexture.getMipLevels());
        }
        if (n7 + n5 > class082802.N() || n8 + n6 > class082802.y()) {
            throw new IllegalArgumentException("Copy source (" + class082802.N() + "x" + class082802.y() + ") is not large enough to read a rectangle of " + n5 + "x" + n6 + " from " + n7 + "x" + n8);
        }
        if (n3 + n5 > gpuTexture.getWidth(n) || n4 + n6 > gpuTexture.getHeight(n)) {
            throw new IllegalArgumentException("Dest texture (" + n5 + "x" + n6 + ") is not large enough to write a rectangle of " + n5 + "x" + n6 + " at " + n3 + "x" + n4 + " (at mip level " + n + ")");
        }
        if (gpuTexture.isClosed()) {
            throw new IllegalStateException("Destination texture is closed");
        }
        if ((gpuTexture.usage() & 1) == 0) {
            throw new IllegalStateException("Color texture must have USAGE_COPY_DST to be a destination for a write");
        }
        if (n2 >= gpuTexture.getDepthOrLayers()) {
            throw new UnsupportedOperationException("Depth or layer is out of range, must be >= 0 and < " + gpuTexture.getDepthOrLayers());
        }
        if ((gpuTexture.usage() & 0x10) != 0) {
            n9 = GlConst.CUBEMAP_TARGETS[n2 % 6];
            GL11.glBindTexture((int)34067, (int)((class08893)gpuTexture).N);
        } else {
            n9 = 3553;
            GlStateManager._bindTexture((int)((class08893)gpuTexture).N);
        }
        GlStateManager._pixelStore((int)3314, (int)class082802.N());
        GlStateManager._pixelStore((int)3316, (int)n7);
        GlStateManager._pixelStore((int)3315, (int)n8);
        GlStateManager._pixelStore((int)3317, (int)class082802.L().N());
        GlStateManager._texSubImage2D((int)n9, (int)n, (int)n3, (int)n4, (int)n5, (int)n6, (int)GlConst.toGl((class08247)class082802.L()), (int)5121, (long)class082802.B());
    }

    public void writeToTexture(GpuTexture gpuTexture, ByteBuffer byteBuffer, class08247 class082472, int n, int n2, int n3, int n4, int n5, int n6) {
        int n7;
        if (this.y(this)) {
            throw new IllegalStateException("Close the existing render pass before performing additional commands");
        }
        if (n < 0 || n >= gpuTexture.getMipLevels()) {
            throw new IllegalArgumentException("Invalid mipLevel, must be >= 0 and < " + gpuTexture.getMipLevels());
        }
        if (n5 * n6 * class082472.N() > byteBuffer.remaining()) {
            throw new IllegalArgumentException("Copy would overrun the source buffer (remaining length of " + byteBuffer.remaining() + ", but copy is " + n5 + "x" + n6 + " of format " + String.valueOf(class082472) + ")");
        }
        if (n3 + n5 > gpuTexture.getWidth(n) || n4 + n6 > gpuTexture.getHeight(n)) {
            throw new IllegalArgumentException("Dest texture (" + gpuTexture.getWidth(n) + "x" + gpuTexture.getHeight(n) + ") is not large enough to write a rectangle of " + n5 + "x" + n6 + " at " + n3 + "x" + n4);
        }
        if (gpuTexture.isClosed()) {
            throw new IllegalStateException("Destination texture is closed");
        }
        if ((gpuTexture.usage() & 1) == 0) {
            throw new IllegalStateException("Color texture must have USAGE_COPY_DST to be a destination for a write");
        }
        if (n2 >= gpuTexture.getDepthOrLayers()) {
            throw new UnsupportedOperationException("Depth or layer is out of range, must be >= 0 and < " + gpuTexture.getDepthOrLayers());
        }
        if ((gpuTexture.usage() & 0x10) != 0) {
            n7 = GlConst.CUBEMAP_TARGETS[n2 % 6];
            GL11.glBindTexture((int)34067, (int)((class08893)gpuTexture).N);
        } else {
            n7 = 3553;
            GlStateManager._bindTexture((int)((class08893)gpuTexture).N);
        }
        GlStateManager._pixelStore((int)3314, (int)n5);
        GlStateManager._pixelStore((int)3316, (int)0);
        GlStateManager._pixelStore((int)3315, (int)0);
        GlStateManager._pixelStore((int)3317, (int)class082472.N());
        GlStateManager._texSubImage2D((int)n7, (int)n, (int)n3, (int)n4, (int)n5, (int)n6, (int)GlConst.toGl((class08247)class082472), (int)5121, (ByteBuffer)byteBuffer);
    }

    public void writeToTexture(GpuTexture gpuTexture, class08280 class082802) {
        int n = gpuTexture.getWidth(0);
        int n2 = gpuTexture.getHeight(0);
        if (class082802.N() != n || class082802.y() != n2) {
            throw new IllegalArgumentException("Cannot replace texture of size " + n + "x" + n2 + " with image of size " + class082802.N() + "x" + class082802.y());
        }
        if (gpuTexture.isClosed()) {
            throw new IllegalStateException("Destination texture is closed");
        }
        if ((gpuTexture.usage() & 1) == 0) {
            throw new IllegalStateException("Color texture must have USAGE_COPY_DST to be a destination for a write");
        }
        this.writeToTexture(gpuTexture, class082802, 0, 0, 0, 0, n, n2, 0, 0);
    }

    public void clearDepthTexture(GpuTexture gpuTexture, double d) {
        if (this.R) {
            throw new IllegalStateException("Close the existing render pass before creating a new one!");
        }
        this.y(gpuTexture);
        this.y.y().N(this.u, 0, ((class08893)gpuTexture).N, 0, 36160);
        GL11.glDrawBuffer((int)0);
        GL11.glClearDepth((double)d);
        GlStateManager._depthMask((boolean)true);
        GlStateManager._disableScissorTest();
        GlStateManager._clear((int)256);
        GL11.glDrawBuffer((int)36064);
        GlStateManager._glFramebufferTexture2D((int)36160, (int)36096, (int)3553, (int)0, (int)0);
        GlStateManager._glBindFramebuffer((int)36160, (int)0);
    }

    public GpuQuery timerQueryBegin() {
        RenderSystem.assertOnRenderThread();
        if (this.B != null) {
            throw new IllegalStateException("A GL_TIME_ELAPSED query is already active");
        }
        int n = GL32C.glGenQueries();
        GL32C.glBeginQuery((int)35007, (int)n);
        this.B = new class00613(n);
        return this.B;
    }

    public void timerQueryEnd(GpuQuery gpuQuery) {
        RenderSystem.assertOnRenderThread();
        if (gpuQuery != this.B) {
            throw new IllegalStateException("Mismatched or duplicate GpuQuery when ending timerQuery");
        }
        GL32C.glEndQuery((int)35007);
        this.B = null;
    }

    public void copyToBuffer(GpuBufferSlice gpuBufferSlice, GpuBufferSlice gpuBufferSlice2) {
        if (this.R) {
            throw new IllegalStateException("Close the existing render pass before performing additional commands");
        }
        class08523 class085232 = (class08523)gpuBufferSlice.buffer();
        if (class085232.y) {
            throw new IllegalStateException("Source buffer already closed");
        }
        if ((class085232.usage() & 0x10) == 0) {
            throw new IllegalStateException("Source buffer needs USAGE_COPY_SRC to be a source for a copy");
        }
        class08523 class085233 = (class08523)gpuBufferSlice2.buffer();
        if (class085233.y) {
            throw new IllegalStateException("Target buffer already closed");
        }
        if ((class085233.usage() & 8) == 0) {
            throw new IllegalStateException("Target buffer needs USAGE_COPY_DST to be a destination for a copy");
        }
        if (gpuBufferSlice.length() != gpuBufferSlice2.length()) {
            throw new IllegalArgumentException("Cannot copy from slice of size " + gpuBufferSlice.length() + " to slice of size " + gpuBufferSlice2.length() + ", they must be equal");
        }
        if (gpuBufferSlice.offset() + gpuBufferSlice.length() > class085232.size()) {
            throw new IllegalArgumentException("Cannot copy more data than the source buffer holds (attempting to copy " + gpuBufferSlice.length() + " bytes at offset " + gpuBufferSlice.offset() + " from " + class085232.size() + " size buffer)");
        }
        if (gpuBufferSlice2.offset() + gpuBufferSlice2.length() > class085233.size()) {
            throw new IllegalArgumentException("Cannot copy more data than the target buffer can hold (attempting to copy " + gpuBufferSlice2.length() + " bytes at offset " + gpuBufferSlice2.offset() + " to " + class085233.size() + " size buffer)");
        }
        this.y.y().N(class085232.u, class085233.u, gpuBufferSlice.offset(), gpuBufferSlice2.offset(), gpuBufferSlice.length());
    }

    public void clearColorAndDepthTextures(GpuTexture gpuTexture, int n, GpuTexture gpuTexture2, double d, int n2, int n3, int n4, int n5) {
        if (this.R) {
            throw new IllegalStateException("Close the existing render pass before creating a new one!");
        }
        this.N(gpuTexture);
        this.y(gpuTexture2);
        this.N(gpuTexture, n2, n3, n4, n5);
        int n6 = ((class08893)gpuTexture).N(this.y.y(), gpuTexture2);
        GlStateManager._glBindFramebuffer((int)36160, (int)n6);
        GlStateManager._scissorBox((int)n2, (int)n3, (int)n4, (int)n5);
        GlStateManager._enableScissorTest();
        GL11.glClearDepth((double)d);
        GL11.glClearColor((float)class02566.m((int)n), (float)class02566.P((int)n), (float)class02566.s((int)n), (float)class02566.W((int)n));
        GlStateManager._depthMask((boolean)true);
        GlStateManager._colorMask((boolean)true, (boolean)true, (boolean)true, (boolean)true);
        GlStateManager._clear((int)16640);
        GlStateManager._glBindFramebuffer((int)36160, (int)0);
    }

    public void clearColorAndDepthTextures(GpuTexture gpuTexture, int n, GpuTexture gpuTexture2, double d) {
        if (this.R) {
            throw new IllegalStateException("Close the existing render pass before creating a new one!");
        }
        this.N(gpuTexture);
        this.y(gpuTexture2);
        int n2 = ((class08893)gpuTexture).N(this.y.y(), gpuTexture2);
        GlStateManager._glBindFramebuffer((int)36160, (int)n2);
        GlStateManager._disableScissorTest();
        GL11.glClearDepth((double)d);
        GL11.glClearColor((float)class02566.m((int)n), (float)class02566.P((int)n), (float)class02566.s((int)n), (float)class02566.W((int)n));
        GlStateManager._depthMask((boolean)true);
        GlStateManager._colorMask((boolean)true, (boolean)true, (boolean)true, (boolean)true);
        GlStateManager._clear((int)16640);
        GlStateManager._glBindFramebuffer((int)36160, (int)0);
    }

    public /* synthetic */ void sodium$applyPipelineState(RenderPipeline renderPipeline) {
        this.N(renderPipeline);
    }

    public /* synthetic */ void sodium$setLastProgram(class02255 class022552) {
        this.M = class022552;
    }

    public void copyTextureToBuffer(GpuTexture gpuTexture, GpuBuffer gpuBuffer, long l, Runnable runnable, int n, int n2, int n3, int n4, int n5) {
        if (this.R) {
            throw new IllegalStateException("Close the existing render pass before performing additional commands");
        }
        if (n < 0 || n >= gpuTexture.getMipLevels()) {
            throw new IllegalArgumentException("Invalid mipLevel " + n + ", must be >= 0 and < " + gpuTexture.getMipLevels());
        }
        if ((long)(gpuTexture.getWidth(n) * gpuTexture.getHeight(n) * gpuTexture.getFormat().pixelSize()) + l > gpuBuffer.size()) {
            throw new IllegalArgumentException("Buffer of size " + gpuBuffer.size() + " is not large enough to hold " + n4 + "x" + n5 + " pixels (" + gpuTexture.getFormat().pixelSize() + " bytes each) starting from offset " + l);
        }
        if ((gpuTexture.usage() & 2) == 0) {
            throw new IllegalArgumentException("Texture needs USAGE_COPY_SRC to be a source for a copy");
        }
        if ((gpuBuffer.usage() & 8) == 0) {
            throw new IllegalArgumentException("Buffer needs USAGE_COPY_DST to be a destination for a copy");
        }
        if (n2 + n4 > gpuTexture.getWidth(n) || n3 + n5 > gpuTexture.getHeight(n)) {
            throw new IllegalArgumentException("Copy source texture (" + gpuTexture.getWidth(n) + "x" + gpuTexture.getHeight(n) + ") is not large enough to read a rectangle of " + n4 + "x" + n5 + " from " + n2 + "," + n3);
        }
        if (gpuTexture.isClosed()) {
            throw new IllegalStateException("Source texture is closed");
        }
        if (gpuBuffer.isClosed()) {
            throw new IllegalStateException("Destination buffer is closed");
        }
        if (gpuTexture.getDepthOrLayers() > 1) {
            throw new UnsupportedOperationException("Textures with multiple depths or layers are not yet supported for copying");
        }
        GlStateManager.clearGlErrors();
        this.y.y().N(this.L, ((class08893)gpuTexture).N(), 0, n, 36008);
        GlStateManager._glBindBuffer((int)35051, (int)((class08523)gpuBuffer).u);
        GlStateManager._pixelStore((int)3330, (int)n4);
        GlStateManager._readPixels((int)n2, (int)n3, (int)n4, (int)n5, (int)GlConst.toGlExternalId((TextureFormat)gpuTexture.getFormat()), (int)GlConst.toGlType((TextureFormat)gpuTexture.getFormat()), (long)l);
        RenderSystem.queueFencedTask((Runnable)runnable);
        GlStateManager._glFramebufferTexture2D((int)36008, (int)36064, (int)3553, (int)0, (int)n);
        GlStateManager._glBindFramebuffer((int)36008, (int)0);
        GlStateManager._glBindBuffer((int)35051, (int)0);
        int n6 = GlStateManager._getError();
        if (n6 != 0) {
            throw new IllegalStateException("Couldn't perform copyTobuffer for texture " + gpuTexture.getLabel() + ": GL error " + n6);
        }
    }

    public void copyTextureToBuffer(GpuTexture gpuTexture, GpuBuffer gpuBuffer, long l, Runnable runnable, int n) {
        if (this.R) {
            throw new IllegalStateException("Close the existing render pass before performing additional commands");
        }
        this.copyTextureToBuffer(gpuTexture, gpuBuffer, l, runnable, n, 0, 0, gpuTexture.getWidth(n), gpuTexture.getHeight(n));
    }

    public GpuBuffer.MappedView mapBuffer(GpuBufferSlice gpuBufferSlice, boolean bl, boolean bl2) {
        if (this.R) {
            throw new IllegalStateException("Close the existing render pass before performing additional commands");
        }
        class08523 class085232 = (class08523)gpuBufferSlice.buffer();
        if (class085232.y) {
            throw new IllegalStateException("Buffer already closed");
        }
        if (!bl && !bl2) {
            throw new IllegalArgumentException("At least read or write must be true");
        }
        if (bl && (class085232.usage() & 1) == 0) {
            throw new IllegalStateException("Buffer is not readable");
        }
        if (bl2 && (class085232.usage() & 2) == 0) {
            throw new IllegalStateException("Buffer is not writable");
        }
        if (gpuBufferSlice.offset() + gpuBufferSlice.length() > class085232.size()) {
            throw new IllegalArgumentException("Cannot map more data than this buffer can hold (attempting to map " + gpuBufferSlice.length() + " bytes at offset " + gpuBufferSlice.offset() + " from " + class085232.size() + " size buffer)");
        }
        int n = 0;
        if (bl) {
            n |= 1;
        }
        if (bl2) {
            n |= 0x22;
        }
        return this.y.u().N(this.y.y(), class085232, gpuBufferSlice.offset(), gpuBufferSlice.length(), n);
    }

    public GpuBuffer.MappedView mapBuffer(GpuBuffer gpuBuffer, boolean bl, boolean bl2) {
        return this.mapBuffer(gpuBuffer.slice(), bl, bl2);
    }

    public void copyTextureToTexture(GpuTexture gpuTexture, GpuTexture gpuTexture2, int n, int n2, int n3, int n4, int n5, int n6, int n7) {
        if (this.R) {
            throw new IllegalStateException("Close the existing render pass before performing additional commands");
        }
        if (n < 0 || n >= gpuTexture.getMipLevels() || n >= gpuTexture2.getMipLevels()) {
            throw new IllegalArgumentException("Invalid mipLevel " + n + ", must be >= 0 and < " + gpuTexture.getMipLevels() + " and < " + gpuTexture2.getMipLevels());
        }
        if (n2 + n6 > gpuTexture2.getWidth(n) || n3 + n7 > gpuTexture2.getHeight(n)) {
            throw new IllegalArgumentException("Dest texture (" + gpuTexture2.getWidth(n) + "x" + gpuTexture2.getHeight(n) + ") is not large enough to write a rectangle of " + n6 + "x" + n7 + " at " + n2 + "x" + n3);
        }
        if (n4 + n6 > gpuTexture.getWidth(n) || n5 + n7 > gpuTexture.getHeight(n)) {
            throw new IllegalArgumentException("Source texture (" + gpuTexture.getWidth(n) + "x" + gpuTexture.getHeight(n) + ") is not large enough to read a rectangle of " + n6 + "x" + n7 + " at " + n4 + "x" + n5);
        }
        if (gpuTexture.isClosed()) {
            throw new IllegalStateException("Source texture is closed");
        }
        if (gpuTexture2.isClosed()) {
            throw new IllegalStateException("Destination texture is closed");
        }
        if ((gpuTexture.usage() & 2) == 0) {
            throw new IllegalArgumentException("Texture needs USAGE_COPY_SRC to be a source for a copy");
        }
        if ((gpuTexture2.usage() & 1) == 0) {
            throw new IllegalArgumentException("Texture needs USAGE_COPY_DST to be a destination for a copy");
        }
        if (gpuTexture.getDepthOrLayers() > 1) {
            throw new UnsupportedOperationException("Textures with multiple depths or layers are not yet supported for copying");
        }
        if (gpuTexture2.getDepthOrLayers() > 1) {
            throw new UnsupportedOperationException("Textures with multiple depths or layers are not yet supported for copying");
        }
        GlStateManager.clearGlErrors();
        GlStateManager._disableScissorTest();
        boolean bl = gpuTexture.getFormat().hasDepthAspect();
        int n8 = ((class08893)gpuTexture).N();
        int n9 = ((class08893)gpuTexture2).N();
        this.y.y().N(this.L, bl ? 0 : n8, bl ? n8 : 0, 0, 0);
        this.y.y().N(this.u, bl ? 0 : n9, bl ? n9 : 0, 0, 0);
        this.y.y().N(this.L, this.u, n4, n5, n6, n7, n2, n3, n6, n7, bl ? 256 : 16384, 9728);
        int n10 = GlStateManager._getError();
        if (n10 != 0) {
            throw new IllegalStateException("Couldn't perform copyToTexture for texture " + gpuTexture.getLabel() + " to " + gpuTexture2.getLabel() + ": GL error " + n10);
        }
    }
}

