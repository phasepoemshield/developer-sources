/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.buffers.GpuBufferSlice
 *  com.mojang.blaze3d.systems.GpuDevice
 *  com.mojang.blaze3d.systems.RenderSystem
 *  com.mojang.blaze3d.textures.GpuTexture
 *  com.mojang.blaze3d.textures.TextureFormat
 *  it.unimi.dsi.fastutil.ints.Int2ObjectMap
 *  it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap
 *  net.irisshaders.iris.mixin.texture.SpriteContentsAnimatedTextureAccessor
 */
package minecraft;

import com.mojang.blaze3d.buffers.GpuBufferSlice;
import com.mojang.blaze3d.systems.GpuDevice;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.textures.GpuTexture;
import com.mojang.blaze3d.textures.TextureFormat;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.List;
import java.util.stream.IntStream;
import minecraft.class01991;
import minecraft.class02007;
import minecraft.class02011;
import net.irisshaders.iris.mixin.texture.SpriteContentsAnimatedTextureAccessor;

public class class02034
implements SpriteContentsAnimatedTextureAccessor {
    public final List<class02007> N;
    private final int u;
    public final boolean y;
    final /* synthetic */ class01991 L;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    class02034(class01991 class019912, List list, int n, boolean bl) {
        this.L = class019912;
        this.N = list;
        this.u = n;
        this.y = bl;
    }

    int y(int n) {
        return n / this.u;
    }

    public IntStream N() {
        return this.N.stream().mapToInt(class020072 -> class020072.getIndex()).distinct();
    }

    public class02011 N(GpuBufferSlice gpuBufferSlice, int n) {
        GpuDevice gpuDevice = RenderSystem.getDevice();
        Int2ObjectOpenHashMap int2ObjectOpenHashMap = new Int2ObjectOpenHashMap();
        GpuBufferSlice[] gpuBufferSliceArray = new GpuBufferSlice[this.L.field_40540.length];
        for (int n2 : this.N().toArray()) {
            GpuTexture gpuTexture = gpuDevice.createTexture(() -> String.valueOf(this.L.field_40536) + " animation frame " + n2, 5, TextureFormat.RGBA8, this.L.field_40537, this.L.field_40538, 1, this.L.field_40540.length + 1);
            int n3 = this.N(n2) * this.L.field_40537;
            int n4 = this.y(n2) * this.L.field_40538;
            for (int i = 0; i < this.L.field_40540.length; ++i) {
                RenderSystem.getDevice().createCommandEncoder().writeToTexture(gpuTexture, this.L.field_40540[i], i, 0, 0, 0, this.L.field_40537 >> i, this.L.field_40538 >> i, n3 >> i, n4 >> i);
            }
            int2ObjectOpenHashMap.put(n2, (Object)RenderSystem.getDevice().createTextureView(gpuTexture));
        }
        for (int i = 0; i < this.L.field_40540.length; ++i) {
            gpuBufferSliceArray[i] = gpuBufferSlice.slice((long)(i * n), (long)n);
        }
        return new class02011(this.L, this, (Int2ObjectMap)int2ObjectOpenHashMap, gpuBufferSliceArray);
    }

    int N(int n) {
        return n % this.u;
    }

    public /* synthetic */ List getFrames() {
        return this.N;
    }
}

