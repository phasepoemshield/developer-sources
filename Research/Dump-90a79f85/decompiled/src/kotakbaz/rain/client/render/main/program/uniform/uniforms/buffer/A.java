/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.buffers.GpuBufferSlice
 *  net.minecraft.class_10859
 *  org.lwjgl.opengl.GL32
 */
package kotakbaz.rain.client.render.main.program.uniform.uniforms.buffer;

import com.mojang.blaze3d.buffers.GpuBufferSlice;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.function.BiConsumer;
import kotakbaz.rain.client.render.main.ChromaRenderer;
import kotakbaz.rain.client.render.main.buffer.b;
import kotakbaz.rain.client.render.main.program.uniform.uniforms.buffer.a_0;
import net.minecraft.class_10859;
import org.lwjgl.opengl.GL32;

public final class A<T>
extends Record {
    private final BiConsumer<a_0, T> a;
    public static final A<GpuBufferSlice> A = new A<GpuBufferSlice>((a_02, gpuBufferSlice) -> GL32.glBindBufferRange((int)kotakbaz.rain.client.render.main.buffer.a_0.C.h, (int)a_02.getBufferIndex(), (int)ChromaRenderer.getBufferIdGetter().apply((class_10859)gpuBufferSlice.buffer()), (long)gpuBufferSlice.offset(), (long)gpuBufferSlice.length()));
    public static final A<class_10859> b = new A<class_10859>((a_02, class_108592) -> GL32.glBindBufferBase((int)kotakbaz.rain.client.render.main.buffer.a_0.C.h, (int)a_02.getBufferIndex(), (int)ChromaRenderer.getBufferIdGetter().apply((class_10859)class_108592)));
    public static final A<b> B = new A<b>((a_02, b2) -> GL32.glBindBufferBase((int)kotakbaz.rain.client.render.main.buffer.a_0.C.h, (int)a_02.getBufferIndex(), (int)b2.getId()));

    public A(BiConsumer<a_0, T> biConsumer) {
        super();
        this.a = biConsumer;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{A.class, "uploadConsumer", "a"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{A.class, "uploadConsumer", "a"}, this);
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{A.class, "uploadConsumer", "a"}, this, object);
    }

    public BiConsumer<a_0, T> uploadConsumer() {
        return this.a;
    }
}

