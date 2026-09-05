/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.textures.AddressMode
 *  com.mojang.blaze3d.textures.FilterMode
 *  com.mojang.blaze3d.textures.GpuTexture
 *  com.mojang.blaze3d.textures.GpuTextureView
 *  com.mojang.blaze3d.textures.TextureFormat
 *  minecraft.class07607
 *  minecraft.class08188
 *  org.jspecify.annotations.Nullable
 */
package com.mojang.blaze3d.systems;

import com.mojang.blaze3d.buffers.GpuBuffer;
import com.mojang.blaze3d.pipeline.CompiledRenderPipeline;
import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.mojang.blaze3d.systems.CommandEncoder;
import com.mojang.blaze3d.textures.AddressMode;
import com.mojang.blaze3d.textures.FilterMode;
import com.mojang.blaze3d.textures.GpuTexture;
import com.mojang.blaze3d.textures.GpuTextureView;
import com.mojang.blaze3d.textures.TextureFormat;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.OptionalDouble;
import java.util.function.Supplier;
import minecraft.class07607;
import minecraft.class08188;
import org.jspecify.annotations.Nullable;

public interface GpuDevice {
    public String getVendor();

    public void close();

    public String getVersion();

    public class08188 createSampler(AddressMode var1, AddressMode var2, FilterMode var3, FilterMode var4, int var5, OptionalDouble var6);

    public GpuBuffer createBuffer(@Nullable Supplier<String> var1, int var2, long var3);

    public GpuBuffer createBuffer(@Nullable Supplier<String> var1, int var2, ByteBuffer var3);

    public int getMaxTextureSize();

    public GpuTextureView createTextureView(GpuTexture var1);

    public GpuTextureView createTextureView(GpuTexture var1, int var2, int var3);

    public GpuTexture createTexture(@Nullable String var1, int var2, TextureFormat var3, int var4, int var5, int var6, int var7);

    public GpuTexture createTexture(@Nullable Supplier<String> var1, int var2, TextureFormat var3, int var4, int var5, int var6, int var7);

    public List<String> getEnabledExtensions();

    default public CompiledRenderPipeline precompilePipeline(RenderPipeline renderPipeline) {
        return this.precompilePipeline(renderPipeline, null);
    }

    public CompiledRenderPipeline precompilePipeline(RenderPipeline var1, @Nullable class07607 var2);

    public void clearPipelineCache();

    public boolean isDebuggingEnabled();

    public String getImplementationInformation();

    public List<String> getLastDebugMessages();

    public int getUniformOffsetAlignment();

    public CommandEncoder createCommandEncoder();

    public String getBackendName();

    public String getRenderer();

    public int getMaxSupportedAnisotropy();
}

