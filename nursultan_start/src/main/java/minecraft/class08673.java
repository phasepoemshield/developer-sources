/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.buffers.GpuBuffer
 *  com.mojang.blaze3d.pipeline.RenderPipeline
 *  com.mojang.blaze3d.vertex.VertexFormat$class_5596
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class03255
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.mixin.client.rendering.DrawAccessor
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.mojang.blaze3d.buffers.GpuBuffer;
import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.mojang.blaze3d.vertex.VertexFormat;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class03255;
import minecraft.class08679;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.mixin.client.rendering.DrawAccessor;
import org.jspecify.annotations.Nullable;

@Environment(value=EnvType.CLIENT)
final class class08673
extends Record
implements DrawAccessor {
    final GpuBuffer vertexBuffer;
    final int baseVertex;
    private final VertexFormat.class_5596 mode;
    final int indexCount;
    private final RenderPipeline pipeline;
    final class08679 textureSetup;
    private final @Nullable class03255 scissorArea;

    public VertexFormat.class_5596 L() {
        return this.mode;
    }

    public @Nullable class03255 M() {
        return this.scissorArea;
    }

    class08673(GpuBuffer gpuBuffer, int n, VertexFormat.class_5596 class_55962, int n2, RenderPipeline renderPipeline, class08679 class086792, @Nullable class03255 class032552) {
        this.vertexBuffer = gpuBuffer;
        this.baseVertex = n;
        this.mode = class_55962;
        this.indexCount = n2;
        this.pipeline = renderPipeline;
        this.textureSetup = class086792;
        this.scissorArea = class032552;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class08673.class, "vertexBuffer;baseVertex;mode;indexCount;pipeline;textureSetup;scissorArea", "vertexBuffer", "baseVertex", "mode", "indexCount", "pipeline", "textureSetup", "scissorArea"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class08673.class, "vertexBuffer;baseVertex;mode;indexCount;pipeline;textureSetup;scissorArea", "vertexBuffer", "baseVertex", "mode", "indexCount", "pipeline", "textureSetup", "scissorArea"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class08673.class, "vertexBuffer;baseVertex;mode;indexCount;pipeline;textureSetup;scissorArea", "vertexBuffer", "baseVertex", "mode", "indexCount", "pipeline", "textureSetup", "scissorArea"}, this);
    }

    public RenderPipeline i() {
        return this.pipeline;
    }

    public int u() {
        return this.indexCount;
    }

    public int y() {
        return this.baseVertex;
    }

    public GpuBuffer N() {
        return this.vertexBuffer;
    }

    public class08679 R() {
        return this.textureSetup;
    }

    public /* synthetic */ RenderPipeline fabric$pipeline() {
        return this.pipeline;
    }

    public /* synthetic */ int fabric$indexCount() {
        return this.indexCount;
    }
}

