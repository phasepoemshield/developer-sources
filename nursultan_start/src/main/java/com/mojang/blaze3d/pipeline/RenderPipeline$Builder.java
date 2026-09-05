/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10881
 *  com.mojang.blaze3d.textures.TextureFormat
 *  com.mojang.blaze3d.vertex.VertexFormat
 *  com.mojang.blaze3d.vertex.VertexFormat$class_5596
 *  minecraft.class01894
 *  minecraft.class08227
 *  minecraft.class08419
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.api.client.rendering.v1.FabricRenderPipeline$Builder
 *  net.fabricmc.fabric.impl.client.rendering.FabricRenderPipelineImpl
 *  net.fabricmc.fabric.impl.client.rendering.FabricRenderPipelineInternals
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package com.mojang.blaze3d.pipeline;

import Nursultan.class10881;
import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperationRuntime;
import com.mojang.blaze3d.pipeline.BlendFunction;
import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.mojang.blaze3d.pipeline.RenderPipeline$Snippet;
import com.mojang.blaze3d.pipeline.RenderPipeline$UniformDescription;
import com.mojang.blaze3d.platform.DepthTestFunction;
import com.mojang.blaze3d.platform.LogicOp;
import com.mojang.blaze3d.platform.PolygonMode;
import com.mojang.blaze3d.textures.TextureFormat;
import com.mojang.blaze3d.vertex.VertexFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import minecraft.class01894;
import minecraft.class08227;
import minecraft.class08419;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.rendering.v1.FabricRenderPipeline;
import net.fabricmc.fabric.impl.client.rendering.FabricRenderPipelineImpl;
import net.fabricmc.fabric.impl.client.rendering.FabricRenderPipelineInternals;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
@Environment(value=EnvType.CLIENT)
public class RenderPipeline$Builder
implements FabricRenderPipeline.Builder {
    private static int nextPipelineSortKey;
    private Optional<class01894> location;
    private Optional<class01894> fragmentShader;
    private Optional<class01894> vertexShader;
    private Optional<class10881> definesBuilder;
    private Optional<List<String>> samplers;
    private Optional<List<RenderPipeline$UniformDescription>> uniforms;
    private Optional<DepthTestFunction> depthTestFunction;
    private Optional<PolygonMode> polygonMode;
    private Optional<Boolean> cull;
    private Optional<Boolean> writeColor;
    private Optional<Boolean> writeAlpha;
    private Optional<Boolean> writeDepth;
    private Optional<LogicOp> colorLogic;
    private Optional<BlendFunction> blendFunction;
    private Optional<VertexFormat> vertexFormat;
    private Optional<VertexFormat.class_5596> vertexFormatMode;
    private float depthBiasScaleFactor;
    private float depthBiasConstant;
    private Optional usePipelineDrawModeForGui = Optional.empty();

    public RenderPipeline$Builder withLocation(class01894 class018942) {
        this.location = Optional.of(class018942);
        return this;
    }

    public RenderPipeline$Builder withLocation(String string) {
        this.location = Optional.of(class01894.y((String)string));
        return this;
    }

    RenderPipeline$Builder() {
        this.location = Optional.empty();
        this.fragmentShader = Optional.empty();
        this.vertexShader = Optional.empty();
        this.definesBuilder = Optional.empty();
        this.samplers = Optional.empty();
        this.uniforms = Optional.empty();
        this.depthTestFunction = Optional.empty();
        this.polygonMode = Optional.empty();
        this.cull = Optional.empty();
        this.writeColor = Optional.empty();
        this.writeAlpha = Optional.empty();
        this.writeDepth = Optional.empty();
        this.colorLogic = Optional.empty();
        this.blendFunction = Optional.empty();
        this.vertexFormat = Optional.empty();
        this.vertexFormatMode = Optional.empty();
    }

    public RenderPipeline build() {
        if (this.location.isEmpty()) {
            throw new IllegalStateException("Missing location");
        }
        if (this.vertexShader.isEmpty()) {
            throw new IllegalStateException("Missing vertex shader");
        }
        if (this.fragmentShader.isEmpty()) {
            throw new IllegalStateException("Missing fragment shader");
        }
        if (this.vertexFormat.isEmpty()) {
            throw new IllegalStateException("Missing vertex buffer format");
        }
        if (this.vertexFormatMode.isEmpty()) {
            throw new IllegalStateException("Missing vertex mode");
        }
        return this.modifyReturnValue$zon000$fabric-rendering-v1$copyUsePipelineDrawModeForGuiToPipeline(new RenderPipeline(this.location.get(), this.vertexShader.get(), this.fragmentShader.get(), this.definesBuilder.orElse(class08227.N()).N(), List.copyOf(this.samplers.orElse(new ArrayList())), this.uniforms.orElse(Collections.emptyList()), this.blendFunction, this.depthTestFunction.orElse(DepthTestFunction.LEQUAL_DEPTH_TEST), this.polygonMode.orElse(PolygonMode.FILL), this.cull.orElse(true), this.writeColor.orElse(true), this.writeAlpha.orElse(true), this.writeDepth.orElse(true), this.colorLogic.orElse(LogicOp.NONE), this.vertexFormat.get(), this.vertexFormatMode.get(), this.depthBiasScaleFactor, this.depthBiasConstant, nextPipelineSortKey++));
    }

    private void handler$zon000$fabric-rendering-v1$copyUsePipelineDrawModeForGuiFromSnippet(RenderPipeline$Snippet renderPipeline$Snippet, CallbackInfo callbackInfo) {
        renderPipeline$Snippet.usePipelineDrawModeForGui().ifPresent(bl -> {
            this.usePipelineDrawModeForGui = Optional.of(bl);
        });
    }

    private RenderPipeline$Snippet wrapOperation$zon000$fabric-rendering-v1$copyUsePipelineDrawModeForGuiToSnippet(Optional optional, Optional optional2, Optional optional3, Optional optional4, Optional optional5, Optional optional6, Optional optional7, Optional optional8, Optional optional9, Optional optional10, Optional optional11, Optional optional12, Optional optional13, Optional optional14, Optional optional15, Operation operation) {
        return FabricRenderPipelineInternals.withSnippetUsePipelineVertexFormatForGui(() -> (RenderPipeline$Snippet)((Object)((Object)operation.call(optional, optional2, optional3, optional4, optional5, optional6, optional7, optional8, optional9, optional10, optional11, optional12, optional13, optional14, optional15))), (Optional)this.usePipelineDrawModeForGui);
    }

    public RenderPipeline$Builder withBlend(BlendFunction blendFunction) {
        this.blendFunction = Optional.of(blendFunction);
        return this;
    }

    public RenderPipeline$Builder withCull(boolean bl) {
        this.cull = Optional.of(bl);
        return this;
    }

    public RenderPipeline$Builder withDepthBias(float f, float f2) {
        this.depthBiasScaleFactor = f;
        this.depthBiasConstant = f2;
        return this;
    }

    public RenderPipeline$Builder withVertexShader(String string) {
        this.vertexShader = Optional.of(class01894.y((String)string));
        return this;
    }

    public RenderPipeline$Builder withVertexShader(class01894 class018942) {
        this.vertexShader = Optional.of(class018942);
        return this;
    }

    public RenderPipeline$Builder withUniform(String string, class08419 class084192) {
        if (this.uniforms.isEmpty()) {
            this.uniforms = Optional.of(new ArrayList());
        }
        if (class084192 == class08419.field_60032) {
            throw new IllegalArgumentException("Cannot use texel buffer without specifying texture format");
        }
        this.uniforms.get().add(new RenderPipeline$UniformDescription(string, class084192));
        return this;
    }

    public RenderPipeline$Builder withUniform(String string, class08419 class084192, TextureFormat textureFormat) {
        if (this.uniforms.isEmpty()) {
            this.uniforms = Optional.of(new ArrayList());
        }
        if (class084192 != class08419.field_60032) {
            throw new IllegalArgumentException("Only texel buffer can specify texture format");
        }
        this.uniforms.get().add(new RenderPipeline$UniformDescription(string, textureFormat));
        return this;
    }

    public RenderPipeline$Builder withFragmentShader(String string) {
        this.fragmentShader = Optional.of(class01894.y((String)string));
        return this;
    }

    public RenderPipeline$Builder withFragmentShader(class01894 class018942) {
        this.fragmentShader = Optional.of(class018942);
        return this;
    }

    public RenderPipeline$Builder withSampler(String string) {
        if (this.samplers.isEmpty()) {
            this.samplers = Optional.of(new ArrayList());
        }
        this.samplers.get().add(string);
        return this;
    }

    public RenderPipeline$Builder withShaderDefine(String string) {
        if (this.definesBuilder.isEmpty()) {
            this.definesBuilder = Optional.of(class08227.N());
        }
        this.definesBuilder.get().N(string);
        return this;
    }

    public RenderPipeline$Builder withShaderDefine(String string, float f) {
        if (this.definesBuilder.isEmpty()) {
            this.definesBuilder = Optional.of(class08227.N());
        }
        this.definesBuilder.get().N(string, f);
        return this;
    }

    public RenderPipeline$Builder withShaderDefine(String string, int n) {
        if (this.definesBuilder.isEmpty()) {
            this.definesBuilder = Optional.of(class08227.N());
        }
        this.definesBuilder.get().N(string, n);
        return this;
    }

    public RenderPipeline$Builder withPolygonMode(PolygonMode polygonMode) {
        this.polygonMode = Optional.of(polygonMode);
        return this;
    }

    public RenderPipeline$Builder withDepthWrite(boolean bl) {
        this.writeDepth = Optional.of(bl);
        return this;
    }

    public RenderPipeline$Snippet buildSnippet() {
        Optional<VertexFormat.class_5596> optional = this.vertexFormatMode;
        Optional<VertexFormat> optional2 = this.vertexFormat;
        Optional<LogicOp> optional3 = this.colorLogic;
        Optional<Boolean> optional4 = this.writeDepth;
        Optional<Boolean> optional5 = this.writeAlpha;
        Optional<Boolean> optional6 = this.writeColor;
        Optional<Boolean> optional7 = this.cull;
        Optional<PolygonMode> optional8 = this.polygonMode;
        Optional<DepthTestFunction> optional9 = this.depthTestFunction;
        Optional<BlendFunction> optional10 = this.blendFunction;
        Optional<Object> optional11 = this.uniforms.map(Collections::unmodifiableList);
        Optional<Object> optional12 = this.samplers.map(Collections::unmodifiableList);
        Optional<Object> optional13 = this.definesBuilder.map(class10881::N);
        Optional<class01894> optional14 = this.fragmentShader;
        Optional<class01894> optional15 = this.vertexShader;
        return this.wrapOperation$zon000$fabric-rendering-v1$copyUsePipelineDrawModeForGuiToSnippet(optional15, optional14, optional13, optional12, optional11, optional10, optional9, optional8, optional7, optional6, optional5, optional4, optional3, optional2, optional, objectArray -> {
            WrapOperationRuntime.checkArgumentCount(objectArray, 15, "[java.util.Optional, java.util.Optional, java.util.Optional, java.util.Optional, java.util.Optional, java.util.Optional, java.util.Optional, java.util.Optional, java.util.Optional, java.util.Optional, java.util.Optional, java.util.Optional, java.util.Optional, java.util.Optional, java.util.Optional]");
            return new RenderPipeline$Snippet((Optional)objectArray[0], (Optional)objectArray[1], (Optional)objectArray[2], (Optional)objectArray[3], (Optional)objectArray[4], (Optional)objectArray[5], (Optional)objectArray[6], (Optional)objectArray[7], (Optional)objectArray[8], (Optional)objectArray[9], (Optional)objectArray[10], (Optional)objectArray[11], (Optional)objectArray[12], (Optional)objectArray[13], (Optional)objectArray[14]);
        });
    }

    public RenderPipeline$Builder withVertexFormat(VertexFormat vertexFormat, VertexFormat.class_5596 class_55962) {
        this.vertexFormat = Optional.of(vertexFormat);
        this.vertexFormatMode = Optional.of(class_55962);
        return this;
    }

    public RenderPipeline$Builder withColorWrite(boolean bl, boolean bl2) {
        this.writeColor = Optional.of(bl);
        this.writeAlpha = Optional.of(bl2);
        return this;
    }

    public RenderPipeline$Builder withColorWrite(boolean bl) {
        this.writeColor = Optional.of(bl);
        this.writeAlpha = Optional.of(bl);
        return this;
    }

    void withSnippet(RenderPipeline$Snippet renderPipeline$Snippet) {
        if (renderPipeline$Snippet.vertexShader.isPresent()) {
            this.vertexShader = renderPipeline$Snippet.vertexShader;
        }
        if (renderPipeline$Snippet.fragmentShader.isPresent()) {
            this.fragmentShader = renderPipeline$Snippet.fragmentShader;
        }
        if (renderPipeline$Snippet.shaderDefines.isPresent()) {
            if (this.definesBuilder.isEmpty()) {
                this.definesBuilder = Optional.of(class08227.N());
            }
            class08227 class082272 = renderPipeline$Snippet.shaderDefines.get();
            for (Map.Entry object : class082272.u().entrySet()) {
                this.definesBuilder.get().N((String)object.getKey(), (String)object.getValue());
            }
            for (String string : class082272.i()) {
                this.definesBuilder.get().N(string);
            }
        }
        renderPipeline$Snippet.samplers.ifPresent(list -> {
            if (this.samplers.isPresent()) {
                this.samplers.get().addAll((Collection<String>)list);
            } else {
                this.samplers = Optional.of(new ArrayList(list));
            }
        });
        renderPipeline$Snippet.uniforms.ifPresent(list -> {
            if (this.uniforms.isPresent()) {
                this.uniforms.get().addAll((Collection<RenderPipeline$UniformDescription>)list);
            } else {
                this.uniforms = Optional.of(new ArrayList(list));
            }
        });
        if (renderPipeline$Snippet.depthTestFunction.isPresent()) {
            this.depthTestFunction = renderPipeline$Snippet.depthTestFunction;
        }
        if (renderPipeline$Snippet.cull.isPresent()) {
            this.cull = renderPipeline$Snippet.cull;
        }
        if (renderPipeline$Snippet.writeColor.isPresent()) {
            this.writeColor = renderPipeline$Snippet.writeColor;
        }
        if (renderPipeline$Snippet.writeAlpha.isPresent()) {
            this.writeAlpha = renderPipeline$Snippet.writeAlpha;
        }
        if (renderPipeline$Snippet.writeDepth.isPresent()) {
            this.writeDepth = renderPipeline$Snippet.writeDepth;
        }
        if (renderPipeline$Snippet.colorLogic.isPresent()) {
            this.colorLogic = renderPipeline$Snippet.colorLogic;
        }
        if (renderPipeline$Snippet.blendFunction.isPresent()) {
            this.blendFunction = renderPipeline$Snippet.blendFunction;
        }
        if (renderPipeline$Snippet.vertexFormat.isPresent()) {
            this.vertexFormat = renderPipeline$Snippet.vertexFormat;
        }
        if (renderPipeline$Snippet.vertexFormatMode.isPresent()) {
            this.vertexFormatMode = renderPipeline$Snippet.vertexFormatMode;
        }
        this.handler$zon000$fabric-rendering-v1$copyUsePipelineDrawModeForGuiFromSnippet(renderPipeline$Snippet, null);
    }

    @Deprecated
    public RenderPipeline$Builder withColorLogic(LogicOp logicOp) {
        this.colorLogic = Optional.of(logicOp);
        return this;
    }

    public RenderPipeline$Builder withoutBlend() {
        this.blendFunction = Optional.empty();
        return this;
    }

    public RenderPipeline$Builder withUsePipelineDrawModeForGui(boolean bl) {
        this.usePipelineDrawModeForGui = Optional.of(bl);
        return this;
    }

    public RenderPipeline$Builder withoutUsePipelineDrawModeForGui() {
        this.usePipelineDrawModeForGui = Optional.empty();
        return this;
    }

    public RenderPipeline$Builder withDepthTestFunction(DepthTestFunction depthTestFunction) {
        this.depthTestFunction = Optional.of(depthTestFunction);
        return this;
    }

    private RenderPipeline modifyReturnValue$zon000$fabric-rendering-v1$copyUsePipelineDrawModeForGuiToPipeline(RenderPipeline renderPipeline) {
        ((FabricRenderPipelineImpl)renderPipeline).fabric$setUsePipelineDrawModeForGuiSetter(this.usePipelineDrawModeForGui.orElse(false).booleanValue());
        return renderPipeline;
    }
}

