/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.buffers.GpuBufferSlice
 *  net.minecraft.client.gl.GlGpuBuffer
 *  org.lwjgl.opengl.GL32
 */
package kotakbaz.rain.client.render.main.program.uniform.uniforms.buffer;

import com.mojang.blaze3d.buffers.GpuBufferSlice;
import java.util.function.BiConsumer;
import kotakbaz.rain.client.render.main.ChromaRenderer;
import net.minecraft.client.gl.GlGpuBuffer;
import org.lwjgl.opengl.GL32;
import oxxxde.\u062a\u0638;
import oxxxde.\u062f\u0642;
import oxxxde.\u0638\u062d;

public record A<T>(BiConsumer<\u062f\u0642, T> uploadConsumer) {
    public static final A<GlGpuBuffer> GL_GPU_BUFFER;
    public static final A<GpuBufferSlice> GPU_BUFFER_SLICE;
    public static final A<\u062a\u0638> GPU_BUFFER;

    static {
        GPU_BUFFER_SLICE = new A<GpuBufferSlice>((bufferUniform, gpuBufferSlice) -> GL32.glBindBufferRange((int)\u0638\u062d.UNIFORM_BUFFER.glId, (int)bufferUniform.getBufferIndex(), (int)ChromaRenderer.getBufferIdGetter().applyAsInt((GlGpuBuffer)gpuBufferSlice.buffer()), (long)gpuBufferSlice.offset(), (long)gpuBufferSlice.length()));
        GL_GPU_BUFFER = new A<GlGpuBuffer>((bufferUniform, glGpuBuffer) -> GL32.glBindBufferBase((int)\u0638\u062d.UNIFORM_BUFFER.glId, (int)bufferUniform.getBufferIndex(), (int)ChromaRenderer.getBufferIdGetter().applyAsInt((GlGpuBuffer)glGpuBuffer)));
        GPU_BUFFER = new A<\u062a\u0638>((bufferUniform, gpuBuffer) -> GL32.glBindBufferBase((int)\u0638\u062d.UNIFORM_BUFFER.glId, (int)bufferUniform.getBufferIndex(), (int)gpuBuffer.getId()));
    }
}

