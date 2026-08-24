package oxxxde;

import java.nio.FloatBuffer;
import org.joml.Matrix4f;
import org.lwjgl.opengl.GL20;
import org.lwjgl.system.MemoryUtil;

// $VF: Compiled from heavy
public class ضئ extends طي {
   private boolean closed;
   private boolean initialized;
   private final FloatBuffer buffer = MemoryUtil.memAllocFloat(16);
   private final Matrix4f cachedValue = new Matrix4f();

   public void set(Matrix4f matrix4f) {
      if (!this.initialized || !this.cachedValue.equals(matrix4f)) {
         this.cachedValue.set(matrix4f);
         this.initialized = true;
         matrix4f.get(this.buffer);
         this.program.addUpdatedUniform(this);
      }
   }

   @Override
   public void close() {
      if (!this.closed) {
         MemoryUtil.memFree(this.buffer);
         this.closed = true;
      }
   }

   public ضئ(String glProgram, int location, خر name) {
      super(name, location, glProgram);
      this.initialized = false;
      this.closed = false;
   }

   @Override
   public void upload() {
      GL20.glUniformMatrix4fv(this.getLocation(), false, this.buffer);
   }
}
