/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.vertex.VertexFormat
 *  com.mojang.blaze3d.vertex.VertexFormat$class_5596
 *  minecraft.class01894
 *  minecraft.class07529
 *  minecraft.class07835
 *  minecraft.class08227
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.impl.client.rendering.FabricRenderPipelineImpl
 *  net.irisshaders.iris.Iris
 *  net.irisshaders.iris.vertices.ImmediateState
 *  net.irisshaders.iris.vertices.IrisVertexFormats
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package com.mojang.blaze3d.pipeline;

import com.mojang.blaze3d.pipeline.BlendFunction;
import com.mojang.blaze3d.pipeline.RenderPipeline$Builder;
import com.mojang.blaze3d.pipeline.RenderPipeline$Snippet;
import com.mojang.blaze3d.pipeline.RenderPipeline$UniformDescription;
import com.mojang.blaze3d.platform.DepthTestFunction;
import com.mojang.blaze3d.platform.LogicOp;
import com.mojang.blaze3d.platform.PolygonMode;
import com.mojang.blaze3d.vertex.VertexFormat;
import java.util.List;
import java.util.Optional;
import minecraft.class01894;
import minecraft.class07529;
import minecraft.class07835;
import minecraft.class08227;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.impl.client.rendering.FabricRenderPipelineImpl;
import net.irisshaders.iris.Iris;
import net.irisshaders.iris.vertices.ImmediateState;
import net.irisshaders.iris.vertices.IrisVertexFormats;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Environment(value=EnvType.CLIENT)
public class RenderPipeline
implements FabricRenderPipelineImpl {
    private final class01894 location;
    private final class01894 vertexShader;
    private final class01894 fragmentShader;
    private final class08227 shaderDefines;
    private final List<String> samplers;
    private final List<RenderPipeline$UniformDescription> uniforms;
    private final DepthTestFunction depthTestFunction;
    private final PolygonMode polygonMode;
    private final boolean cull;
    private final LogicOp colorLogic;
    private final Optional<BlendFunction> blendFunction;
    private final boolean writeColor;
    private final boolean writeAlpha;
    private final boolean writeDepth;
    private final VertexFormat vertexFormat;
    private final VertexFormat.class_5596 vertexFormatMode;
    private final float depthBiasScaleFactor;
    private final float depthBiasConstant;
    private final int sortKey;
    private static int sortKeySeed;
    private boolean usePipelineDrawModeForGui = false;

    protected RenderPipeline(class01894 class018942, class01894 class018943, class01894 class018944, class08227 class082272, List<String> list, List<RenderPipeline$UniformDescription> list2, Optional<BlendFunction> optional, DepthTestFunction depthTestFunction, PolygonMode polygonMode, boolean bl, boolean bl2, boolean bl3, boolean bl4, LogicOp logicOp, VertexFormat vertexFormat, VertexFormat.class_5596 class_55962, float f, float f2, int n) {
        this.location = class018942;
        this.vertexShader = class018943;
        this.fragmentShader = class018944;
        this.shaderDefines = class082272;
        this.samplers = list;
        this.uniforms = list2;
        this.depthTestFunction = depthTestFunction;
        this.polygonMode = polygonMode;
        this.cull = bl;
        this.blendFunction = optional;
        this.writeColor = bl2;
        this.writeAlpha = bl3;
        this.writeDepth = bl4;
        this.colorLogic = logicOp;
        this.vertexFormat = vertexFormat;
        this.vertexFormatMode = class_55962;
        this.depthBiasScaleFactor = f;
        this.depthBiasConstant = f2;
        this.sortKey = n;
    }

    public String toString() {
        return this.location.toString();
    }

    public static RenderPipeline$Builder builder(RenderPipeline$Snippet ... renderPipeline$SnippetArray) {
        RenderPipeline$Builder renderPipeline$Builder = new RenderPipeline$Builder();
        for (RenderPipeline$Snippet renderPipeline$Snippet : renderPipeline$SnippetArray) {
            renderPipeline$Builder.withSnippet(renderPipeline$Snippet);
        }
        return renderPipeline$Builder;
    }

    public class01894 getLocation() {
        return this.location;
    }

    public boolean isCull() {
        return this.cull;
    }

    public int getSortKey() {
        return class07529.l ? super.hashCode() * (sortKeySeed + 1) : this.sortKey;
    }

    public VertexFormat getVertexFormat() {
        VertexFormat vertexFormat = this.vertexFormat;
        VertexFormat vertexFormat2 = vertexFormat;
        vertexFormat2 = new CallbackInfoReturnable("", true, (Object)vertexFormat2);
        this.handler$beg000$iris$change((CallbackInfoReturnable)vertexFormat2);
        if (vertexFormat2.isCancelled()) {
            return (VertexFormat)vertexFormat2.getReturnValue();
        }
        return vertexFormat;
    }

    public boolean isWriteColor() {
        return this.writeColor;
    }

    public List<RenderPipeline$UniformDescription> getUniforms() {
        return this.uniforms;
    }

    public PolygonMode getPolygonMode() {
        return this.polygonMode;
    }

    public class01894 getVertexShader() {
        return this.vertexShader;
    }

    public boolean wantsDepthTexture() {
        return this.depthTestFunction != DepthTestFunction.NO_DEPTH_TEST || this.depthBiasConstant != 0.0f || this.depthBiasScaleFactor != 0.0f || this.writeDepth;
    }

    public boolean isWriteDepth() {
        return this.writeDepth;
    }

    public class01894 getFragmentShader() {
        return this.fragmentShader;
    }

    public class08227 getShaderDefines() {
        return this.shaderDefines;
    }

    public LogicOp getColorLogic() {
        return this.colorLogic;
    }

    public static void updateSortKeySeed() {
        sortKeySeed = Math.round(100000.0f * (float)Math.random());
    }

    public Optional<BlendFunction> getBlendFunction() {
        return this.blendFunction;
    }

    public List<String> getSamplers() {
        return this.samplers;
    }

    public boolean isWriteAlpha() {
        return this.writeAlpha;
    }

    public VertexFormat.class_5596 getVertexFormatMode() {
        return this.vertexFormatMode;
    }

    public float getDepthBiasConstant() {
        return this.depthBiasConstant;
    }

    public DepthTestFunction getDepthTestFunction() {
        return this.depthTestFunction;
    }

    private void handler$beg000$iris$change(CallbackInfoReturnable callbackInfoReturnable) {
        if (Iris.isPackInUseQuick() && ImmediateState.renderWithExtendedVertexFormat && ImmediateState.isRenderingLevel) {
            VertexFormat vertexFormat = (VertexFormat)callbackInfoReturnable.getReturnValue();
            RenderPipeline renderPipeline = this;
            if (vertexFormat == class07835.y) {
                callbackInfoReturnable.setReturnValue((Object)IrisVertexFormats.TERRAIN);
            } else if (vertexFormat == class07835.U) {
                callbackInfoReturnable.setReturnValue((Object)IrisVertexFormats.GLYPH);
            } else if (vertexFormat == class07835.L) {
                callbackInfoReturnable.setReturnValue((Object)IrisVertexFormats.ENTITY);
            }
        }
    }

    public float getDepthBiasScaleFactor() {
        return this.depthBiasScaleFactor;
    }

    public boolean usePipelineDrawModeForGui() {
        return this.usePipelineDrawModeForGui;
    }

    public void fabric$setUsePipelineDrawModeForGuiSetter(boolean bl) {
        this.usePipelineDrawModeForGui = bl;
    }
}

