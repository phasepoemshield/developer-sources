package kotakbaz.rain.client.render.main.program.uniform.uniforms.buffer;

import com.mojang.blaze3d.buffers.GpuBufferSlice;
import java.util.function.BiConsumer;
import kotakbaz.rain.client.render.main.ChromaRenderer;
import net.minecraft.client.gl.GlGpuBuffer;
import org.lwjgl.opengl.GL32;
import oxxxde.تظ;
import oxxxde.دق;
import oxxxde.ظح;

// $VF: Compiled from heavy
public record A<T>(BiConsumer<دق, T> uploadConsumer) {
   public static final A<GlGpuBuffer> GL_GPU_BUFFER = new A<>(
      (bufferUniform, glGpuBuffer) -> GL32.glBindBufferBase(
         ظح.UNIFORM_BUFFER.glId, bufferUniform.getBufferIndex(), ChromaRenderer.getBufferIdGetter().applyAsInt(glGpuBuffer)
      )
   );
   public static final A<GpuBufferSlice> GPU_BUFFER_SLICE = new A<>(
      (bufferUniform, gpuBufferSlice) -> GL32.glBindBufferRange(
         ظح.UNIFORM_BUFFER.glId,
         bufferUniform.getBufferIndex(),
         ChromaRenderer.getBufferIdGetter().applyAsInt((GlGpuBuffer)gpuBufferSlice.buffer()),
         gpuBufferSlice.offset(),
         gpuBufferSlice.length()
      )
   );
   public static final A<تظ> GPU_BUFFER = new A<>(
      (bufferUniform, gpuBuffer) -> GL32.glBindBufferBase(ظح.UNIFORM_BUFFER.glId, bufferUniform.getBufferIndex(), gpuBuffer.getId())
   );
}
