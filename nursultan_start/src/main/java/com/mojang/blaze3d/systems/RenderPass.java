/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.textures.GpuTextureView
 *  com.mojang.blaze3d.vertex.VertexFormat$class_5595
 *  minecraft.class08188
 *  net.irisshaders.iris.mixinterface.CustomPass
 *  net.irisshaders.iris.mixinterface.RenderPassInterface
 *  org.jspecify.annotations.Nullable
 */
package com.mojang.blaze3d.systems;

import com.mojang.blaze3d.buffers.GpuBuffer;
import com.mojang.blaze3d.buffers.GpuBufferSlice;
import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.mojang.blaze3d.systems.RenderPass$class_10884;
import com.mojang.blaze3d.textures.GpuTextureView;
import com.mojang.blaze3d.vertex.VertexFormat;
import java.util.Collection;
import java.util.function.Supplier;
import minecraft.class08188;
import net.irisshaders.iris.mixinterface.CustomPass;
import net.irisshaders.iris.mixinterface.RenderPassInterface;
import org.jspecify.annotations.Nullable;

public interface RenderPass
extends AutoCloseable,
RenderPassInterface {
    @Override
    public void close();

    public void setUniform(String var1, GpuBuffer var2);

    public void setUniform(String var1, GpuBufferSlice var2);

    public void setPipeline(RenderPipeline var1);

    public void setIndexBuffer(GpuBuffer var1, VertexFormat.class_5595 var2);

    public void bindTexture(String var1, @Nullable GpuTextureView var2, @Nullable class08188 var3);

    public void drawIndexed(int var1, int var2, int var3, int var4);

    public void setVertexBuffer(int var1, GpuBuffer var2);

    public void enableScissor(int var1, int var2, int var3, int var4);

    public void disableScissor();

    default public void iris$setCustomPass(CustomPass customPass) {
        throw new UnsupportedOperationException();
    }

    public void popDebugGroup();

    public void pushDebugGroup(Supplier<String> var1);

    default public CustomPass iris$getCustomPass() {
        throw new UnsupportedOperationException();
    }

    public void draw(int var1, int var2);

    public <T> void drawMultipleIndexed(Collection<RenderPass$class_10884<T>> var1, @Nullable GpuBuffer var2, // Could not load outer class - annotation placement on inner may be incorrect
     @Nullable VertexFormat.class_5595 var3, Collection<String> var4, T var5);
}

