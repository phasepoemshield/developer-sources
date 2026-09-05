/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.opengl.GlStateManager
 *  it.unimi.dsi.fastutil.ints.Int2ObjectArrayMap
 */
package net.irisshaders.iris.gl.buffer;

import com.mojang.blaze3d.opengl.GlStateManager;
import it.unimi.dsi.fastutil.ints.Int2ObjectArrayMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import net.irisshaders.iris.Iris;
import net.irisshaders.iris.gl.IrisRenderSystem;
import net.irisshaders.iris.gl.buffer.BuiltShaderStorageInfo;
import net.irisshaders.iris.gl.buffer.ShaderStorageBuffer;
import net.irisshaders.iris.gl.buffer.ShaderStorageBufferHolder$OutOfVideoMemoryError;
import net.irisshaders.iris.gl.sampler.SamplerLimits;

public class ShaderStorageBufferHolder {
    private static final List<ShaderStorageBuffer> ACTIVE_BUFFERS = new ArrayList<ShaderStorageBuffer>();
    private int cachedWidth;
    private int cachedHeight;
    private ShaderStorageBuffer[] buffers;
    private boolean destroyed = false;

    public static void forceDeleteBuffers() {
        if (!ACTIVE_BUFFERS.isEmpty()) {
            Iris.logger.warn("Found " + ACTIVE_BUFFERS.size() + " stored buffers with a total size of " + String.valueOf(ACTIVE_BUFFERS.stream().map(ShaderStorageBuffer::getSize).reduce(0L, Long::sum)) + ", forcing them to be deleted.");
            ACTIVE_BUFFERS.forEach(ShaderStorageBuffer::destroy);
            ACTIVE_BUFFERS.clear();
        }
    }

    public ShaderStorageBufferHolder(Int2ObjectArrayMap<BuiltShaderStorageInfo> int2ObjectArrayMap, int n, int n2) {
        this.cachedWidth = n;
        this.cachedHeight = n2;
        this.buffers = new ShaderStorageBuffer[(Integer)Collections.max(int2ObjectArrayMap.keySet()) + 1];
        int2ObjectArrayMap.forEach((n3, builtShaderStorageInfo) -> {
            if (builtShaderStorageInfo.size() > IrisRenderSystem.getVRAM()) {
                throw new ShaderStorageBufferHolder$OutOfVideoMemoryError("We only have " + ShaderStorageBufferHolder.toMib(IrisRenderSystem.getVRAM()) + "MiB of RAM to work with, but the pack is requesting " + builtShaderStorageInfo.size() + "! Can't continue.");
            }
            if (n3 > SamplerLimits.get().getMaxShaderStorageUnits()) {
                throw new IllegalStateException("We don't have enough SSBO units??? (index: " + n3 + ", max: " + SamplerLimits.get().getMaxShaderStorageUnits());
            }
            this.buffers[n3] = new ShaderStorageBuffer(n3, (BuiltShaderStorageInfo)((Object)builtShaderStorageInfo));
            ACTIVE_BUFFERS.add(this.buffers[n3]);
            int n4 = this.buffers[n3].getId();
            if (builtShaderStorageInfo.relative()) {
                this.buffers[n3].resizeIfRelative(n, n2);
            } else {
                this.buffers[n3].createStatic();
            }
        });
        GlStateManager._glBindBuffer((int)37074, (int)0);
    }

    public void setupBuffers() {
        if (this.destroyed) {
            throw new IllegalStateException("Tried to use destroyed buffer objects");
        }
        for (ShaderStorageBuffer shaderStorageBuffer : this.buffers) {
            if (shaderStorageBuffer == null) continue;
            shaderStorageBuffer.bind();
        }
    }

    public void destroyBuffers() {
        for (ShaderStorageBuffer shaderStorageBuffer : this.buffers) {
            if (shaderStorageBuffer == null) continue;
            ACTIVE_BUFFERS.remove(shaderStorageBuffer);
            shaderStorageBuffer.destroy();
        }
        this.buffers = null;
        this.destroyed = true;
    }

    public int getBufferIndex(int n) {
        if (this.buffers.length < n || this.buffers[n] == null) {
            throw new RuntimeException("Tried to query a buffer for indirect dispatch that doesn't exist!");
        }
        return this.buffers[n].getId();
    }

    public void hasResizedScreen(int n, int n2) {
        if (n != this.cachedWidth || n2 != this.cachedHeight) {
            this.cachedWidth = n;
            this.cachedHeight = n2;
            for (ShaderStorageBuffer shaderStorageBuffer : this.buffers) {
                if (shaderStorageBuffer == null) continue;
                shaderStorageBuffer.resizeIfRelative(n, n2);
            }
        }
    }

    private static long toMib(long l) {
        return l / 1024L / 1024L;
    }
}

