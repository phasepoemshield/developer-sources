/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.textures.GpuTexture
 *  com.mojang.blaze3d.textures.GpuTextureView
 *  minecraft.class08247
 *  minecraft.class08280
 *  org.jspecify.annotations.Nullable
 */
package com.mojang.blaze3d.systems;

import com.mojang.blaze3d.buffers.GpuBuffer;
import com.mojang.blaze3d.buffers.GpuBuffer$MappedView;
import com.mojang.blaze3d.buffers.GpuBufferSlice;
import com.mojang.blaze3d.buffers.GpuFence;
import com.mojang.blaze3d.systems.GpuQuery;
import com.mojang.blaze3d.systems.RenderPass;
import com.mojang.blaze3d.textures.GpuTexture;
import com.mojang.blaze3d.textures.GpuTextureView;
import java.nio.ByteBuffer;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.function.Supplier;
import minecraft.class08247;
import minecraft.class08280;
import org.jspecify.annotations.Nullable;

public interface CommandEncoder {
    public GpuFence createFence();

    public RenderPass createRenderPass(Supplier<String> var1, GpuTextureView var2, OptionalInt var3, @Nullable GpuTextureView var4, OptionalDouble var5);

    public RenderPass createRenderPass(Supplier<String> var1, GpuTextureView var2, OptionalInt var3);

    public void writeToBuffer(GpuBufferSlice var1, ByteBuffer var2);

    public void presentTexture(GpuTextureView var1);

    public void clearColorTexture(GpuTexture var1, int var2);

    public void writeToTexture(GpuTexture var1, class08280 var2);

    public void writeToTexture(GpuTexture var1, class08280 var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10);

    public void writeToTexture(GpuTexture var1, ByteBuffer var2, class08247 var3, int var4, int var5, int var6, int var7, int var8, int var9);

    public void clearDepthTexture(GpuTexture var1, double var2);

    public GpuQuery timerQueryBegin();

    public void timerQueryEnd(GpuQuery var1);

    public void copyToBuffer(GpuBufferSlice var1, GpuBufferSlice var2);

    public void clearColorAndDepthTextures(GpuTexture var1, int var2, GpuTexture var3, double var4);

    public void clearColorAndDepthTextures(GpuTexture var1, int var2, GpuTexture var3, double var4, int var6, int var7, int var8, int var9);

    public void copyTextureToBuffer(GpuTexture var1, GpuBuffer var2, long var3, Runnable var5, int var6, int var7, int var8, int var9, int var10);

    public void copyTextureToBuffer(GpuTexture var1, GpuBuffer var2, long var3, Runnable var5, int var6);

    public GpuBuffer$MappedView mapBuffer(GpuBufferSlice var1, boolean var2, boolean var3);

    public GpuBuffer$MappedView mapBuffer(GpuBuffer var1, boolean var2, boolean var3);

    public void copyTextureToTexture(GpuTexture var1, GpuTexture var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9);
}

