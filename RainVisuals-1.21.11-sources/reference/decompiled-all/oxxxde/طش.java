package oxxxde;

import com.mojang.blaze3d.buffers.GpuBufferSlice;
import java.util.function.BiConsumer;
import net.minecraft.client.gl.GlGpuBuffer;
import org.lwjgl.opengl.GL32;

// $VF: Compiled from heavy
public record طش<T>(BiConsumer<دق, T> uploadConsumer) {
   public static final طش<GlGpuBuffer> GL_GPU_BUFFER = new طش<>(
      (bufferUniform, glGpuBuffer) -> GL32.glBindBufferBase(
         ظح.UNIFORM_BUFFER.glId, bufferUniform.getBufferIndex(), ِ.getBufferIdGetter().applyAsInt(glGpuBuffer)
      )
   );
   public static final طش<GpuBufferSlice> GPU_BUFFER_SLICE = new طش<>(
      (bufferUniform, gpuBufferSlice) -> GL32.glBindBufferRange(
         ظح.UNIFORM_BUFFER.glId,
         bufferUniform.getBufferIndex(),
         ِ.getBufferIdGetter().applyAsInt((GlGpuBuffer)gpuBufferSlice.buffer()),
         gpuBufferSlice.offset(),
         gpuBufferSlice.length()
      )
   );
   public static final طش<تظ> GPU_BUFFER = new طش<>(
      (bufferUniform, gpuBuffer) -> GL32.glBindBufferBase(ظح.UNIFORM_BUFFER.glId, bufferUniform.getBufferIndex(), gpuBuffer.getId())
   );
}
