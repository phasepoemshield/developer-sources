package oxxxde;

import com.mojang.blaze3d.buffers.GpuBufferSlice;
import lombok.Generated;
import net.minecraft.client.gl.GlGpuBuffer;
import org.lwjgl.opengl.GL31;

// $VF: Compiled from heavy
public class دق extends طي {
   private final int bufferIndex;
   private Object buffer;
   private طش<Object> uploader = null;

   public void set(تظ gpuBuffer) {
      this.setUnchecked(طش.GPU_BUFFER, gpuBuffer);
   }

   public void set(GpuBufferSlice gpuBufferSlice) {
      this.setUnchecked(طش.GPU_BUFFER_SLICE, gpuBufferSlice);
   }

   public <T> void set(طش<T> buffer, T uploader) {
      this.setUnchecked(uploader, buffer);
   }

   private <T> void setUnchecked(طش<T> uploader, T buffer) {
      this.uploader = uploader;
      this.buffer = buffer;
      this.program.addUpdatedUniform(this);
   }

   public void set(GlGpuBuffer glGpuBuffer) {
      this.setUnchecked(طش.GL_GPU_BUFFER, glGpuBuffer);
   }

   @Override
   public void upload() {
      if (this.uploader != null) {
         this.uploader.uploadConsumer().accept(this, this.buffer);
      }
   }

   public دق(String location, int glProgram, خر name) {
      super(name, location, glProgram);
      this.buffer = null;
      int index = GL31.glGetUniformBlockIndex(glProgram.getId(), name);
      if (index == -1) {
         دن.printAndExit(new ثَ(name, glProgram.getName()));
         this.bufferIndex = -1;
      } else {
         this.bufferIndex = glProgram.getBuffersIndexAmount() + 1;
         glProgram.setBuffersIndexAmount(this.bufferIndex);
         GL31.glUniformBlockBinding(glProgram.getId(), index, this.bufferIndex);
      }
   }

   @Generated
   public int getBufferIndex() {
      return this.bufferIndex;
   }
}
