/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.vertex.VertexFormat
 *  com.mojang.blaze3d.vertex.VertexFormat$class_5596
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class01894
 *  minecraft.class08227
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.api.client.rendering.v1.FabricRenderPipeline$Snippet
 *  net.fabricmc.fabric.impl.client.rendering.FabricRenderPipelineInternals
 */
package com.mojang.blaze3d.pipeline;

import com.mojang.blaze3d.pipeline.BlendFunction;
import com.mojang.blaze3d.pipeline.RenderPipeline$UniformDescription;
import com.mojang.blaze3d.platform.DepthTestFunction;
import com.mojang.blaze3d.platform.LogicOp;
import com.mojang.blaze3d.platform.PolygonMode;
import com.mojang.blaze3d.vertex.VertexFormat;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;
import java.util.Optional;
import minecraft.class01894;
import minecraft.class08227;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.rendering.v1.FabricRenderPipeline;
import net.fabricmc.fabric.impl.client.rendering.FabricRenderPipelineInternals;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
@Environment(value=EnvType.CLIENT)
public final class RenderPipeline$Snippet
extends Record
implements FabricRenderPipeline.Snippet {
    final Optional<class01894> vertexShader;
    final Optional<class01894> fragmentShader;
    final Optional<class08227> shaderDefines;
    final Optional<List<String>> samplers;
    final Optional<List<RenderPipeline$UniformDescription>> uniforms;
    final Optional<BlendFunction> blendFunction;
    final Optional<DepthTestFunction> depthTestFunction;
    private final Optional<PolygonMode> polygonMode;
    final Optional<Boolean> cull;
    final Optional<Boolean> writeColor;
    final Optional<Boolean> writeAlpha;
    final Optional<Boolean> writeDepth;
    final Optional<LogicOp> colorLogic;
    final Optional<VertexFormat> vertexFormat;
    final Optional<VertexFormat.class_5596> vertexFormatMode;
    private final Optional usePipelineDrawModeForGui = FabricRenderPipelineInternals.getScopedUsePipelineVertexFormatForGui();

    public RenderPipeline$Snippet(Optional<class01894> optional, Optional<class01894> optional2, Optional<class08227> optional3, Optional<List<String>> optional4, Optional<List<RenderPipeline$UniformDescription>> optional5, Optional<BlendFunction> optional6, Optional<DepthTestFunction> optional7, Optional<PolygonMode> optional8, Optional<Boolean> optional9, Optional<Boolean> optional10, Optional<Boolean> optional11, Optional<Boolean> optional12, Optional<LogicOp> optional13, Optional<VertexFormat> optional14, Optional<VertexFormat.class_5596> optional15) {
        this.vertexShader = optional;
        this.fragmentShader = optional2;
        this.shaderDefines = optional3;
        this.samplers = optional4;
        this.uniforms = optional5;
        this.blendFunction = optional6;
        this.depthTestFunction = optional7;
        this.polygonMode = optional8;
        this.cull = optional9;
        this.writeColor = optional10;
        this.writeAlpha = optional11;
        this.writeDepth = optional12;
        this.colorLogic = optional13;
        this.vertexFormat = optional14;
        this.vertexFormatMode = optional15;
    }

    public final boolean equals(Object object) {
        return this.modifyReturnValue$zoo000$fabric-rendering-v1$modifyEqualsToIncludeFabricExtraData((boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{RenderPipeline$Snippet.class, "vertexShader;fragmentShader;shaderDefines;samplers;uniforms;blendFunction;depthTestFunction;polygonMode;cull;writeColor;writeAlpha;writeDepth;colorLogic;vertexFormat;vertexFormatMode", "vertexShader", "fragmentShader", "shaderDefines", "samplers", "uniforms", "blendFunction", "depthTestFunction", "polygonMode", "cull", "writeColor", "writeAlpha", "writeDepth", "colorLogic", "vertexFormat", "vertexFormatMode"}, this, object), object);
    }

    public final String toString() {
        return this.modifyReturnValue$zoo000$fabric-rendering-v1$modifyToStringToIncludeFabricExtraData((String)ObjectMethods.bootstrap("toString", new MethodHandle[]{RenderPipeline$Snippet.class, "vertexShader;fragmentShader;shaderDefines;samplers;uniforms;blendFunction;depthTestFunction;polygonMode;cull;writeColor;writeAlpha;writeDepth;colorLogic;vertexFormat;vertexFormatMode", "vertexShader", "fragmentShader", "shaderDefines", "samplers", "uniforms", "blendFunction", "depthTestFunction", "polygonMode", "cull", "writeColor", "writeAlpha", "writeDepth", "colorLogic", "vertexFormat", "vertexFormatMode"}, this));
    }

    public final int hashCode() {
        return this.modifyReturnValue$zoo000$fabric-rendering-v1$modifyHashCodeToIncludeFabricExtraData((int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{RenderPipeline$Snippet.class, "vertexShader;fragmentShader;shaderDefines;samplers;uniforms;blendFunction;depthTestFunction;polygonMode;cull;writeColor;writeAlpha;writeDepth;colorLogic;vertexFormat;vertexFormatMode", "vertexShader", "fragmentShader", "shaderDefines", "samplers", "uniforms", "blendFunction", "depthTestFunction", "polygonMode", "cull", "writeColor", "writeAlpha", "writeDepth", "colorLogic", "vertexFormat", "vertexFormatMode"}, this));
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean modifyReturnValue$zoo000$fabric-rendering-v1$modifyEqualsToIncludeFabricExtraData(boolean bl, Object object) {
        if (!bl) return false;
        if (!(object instanceof FabricRenderPipeline.Snippet)) return false;
        FabricRenderPipeline.Snippet snippet = (FabricRenderPipeline.Snippet)object;
        if (!this.usePipelineDrawModeForGui().equals(snippet.usePipelineDrawModeForGui())) return false;
        return true;
    }

    public Optional<LogicOp> colorLogic() {
        return this.colorLogic;
    }

    public Optional<Boolean> writeDepth() {
        return this.writeDepth;
    }

    public Optional<List<String>> samplers() {
        return this.samplers;
    }

    public Optional<Boolean> cull() {
        return this.cull;
    }

    public Optional<Boolean> writeColor() {
        return this.writeColor;
    }

    public Optional<List<RenderPipeline$UniformDescription>> uniforms() {
        return this.uniforms;
    }

    public Optional<Boolean> writeAlpha() {
        return this.writeAlpha;
    }

    public Optional<VertexFormat> vertexFormat() {
        return this.vertexFormat;
    }

    public Optional<VertexFormat.class_5596> vertexFormatMode() {
        return this.vertexFormatMode;
    }

    public Optional<class08227> shaderDefines() {
        return this.shaderDefines;
    }

    public Optional<DepthTestFunction> depthTestFunction() {
        return this.depthTestFunction;
    }

    public Optional<class01894> vertexShader() {
        return this.vertexShader;
    }

    public Optional<PolygonMode> polygonMode() {
        return this.polygonMode;
    }

    public Optional<BlendFunction> blendFunction() {
        return this.blendFunction;
    }

    public Optional<class01894> fragmentShader() {
        return this.fragmentShader;
    }

    private static int hashCombiner(int n, int n2) {
        return n * 31 + n2;
    }

    public Optional usePipelineDrawModeForGui() {
        return this.usePipelineDrawModeForGui;
    }

    private String modifyReturnValue$zoo000$fabric-rendering-v1$modifyToStringToIncludeFabricExtraData(String string) {
        return string.substring(0, string.length() - 1) + ", usePipelineDrawModeForGui=" + String.valueOf(this.usePipelineDrawModeForGui()) + string.substring(string.length() - 1);
    }

    private int modifyReturnValue$zoo000$fabric-rendering-v1$modifyHashCodeToIncludeFabricExtraData(int n) {
        return RenderPipeline$Snippet.hashCombiner(n, this.usePipelineDrawModeForGui().hashCode());
    }
}

