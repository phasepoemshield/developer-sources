/*
 * Decompiled with CFR 0.152.
 */
package kotakbaz.rain.client.render.main.program.uniform.uniforms.buffer;

import com.mojang.blaze3d.buffers.GpuBufferSlice;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.function.BiConsumer;
import kotakbaz.rain.client.render.main.ChromaRenderer;
import kotakbaz.rain.client.render.main.buffer.b;
import kotakbaz.rain.client.render.main.program.uniform.uniforms.buffer.a;
import net.minecraft.client.gl.GlGpuBuffer;
import org.lwjgl.opengl.GL32;

/*
 * Renamed from kotakbaz.rain.client.render.main.program.uniform.uniforms.buffer.A
 */
public final class a_0<T>
extends Record {
    private final BiConsumer<a, T> a;
    public static final a_0<GpuBufferSlice> A = new a_0<GpuBufferSlice>((bufferUniform, gpuBufferSlice) -> GL32.glBindBufferRange((int)kotakbaz.rain.client.render.main.buffer.a_0.C.h, (int)bufferUniform.getBufferIndex(), (int)ChromaRenderer.getBufferIdGetter().apply((GlGpuBuffer)gpuBufferSlice.buffer()), (long)gpuBufferSlice.offset(), (long)gpuBufferSlice.length()));
    public static final a_0<GlGpuBuffer> b = new a_0<GlGpuBuffer>((bufferUniform, glGpuBuffer) -> GL32.glBindBufferBase((int)kotakbaz.rain.client.render.main.buffer.a_0.C.h, (int)bufferUniform.getBufferIndex(), (int)ChromaRenderer.getBufferIdGetter().apply((GlGpuBuffer)glGpuBuffer)));
    public static final a_0<b> B = new a_0<b>((bufferUniform, gpuBuffer) -> GL32.glBindBufferBase((int)kotakbaz.rain.client.render.main.buffer.a_0.C.h, (int)bufferUniform.getBufferIndex(), (int)gpuBuffer.getId()));

    public a_0(BiConsumer<a, T> uploadConsumer) {
        this.a = uploadConsumer;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{a_0.class, "uploadConsumer", "a"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a_0.class, "uploadConsumer", "a"}, this);
    }

    @Override
    public final boolean equals(Object o2) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a_0.class, "uploadConsumer", "a"}, this, o2);
    }

    public BiConsumer<a, T> uploadConsumer() {
        return this.a;
    }
}

