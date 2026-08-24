package oxxxde;

import java.nio.ByteBuffer;
import lombok.Generated;
import org.lwjgl.opengl.GL15;

// $VF: Compiled from heavy
public class تظ implements زز, AutoCloseable {
   private boolean closed = false;
   private final ظح target;
   private final اً usage;
   private final int id = GL15.glGenBuffers();

   @Override
   public void bind() {
      GL15.glBindBuffer(this.target.glId, this.id);
   }

   public تظ(ByteBuffer data, اً usage, ظح target) {
      this.usage = usage;
      this.target = target;
      this.upload(data);
   }

   @Override
   public void unbind() {
      GL15.glBindBuffer(this.target.glId, 0);
   }

   @Override
   public void close() {
      if (!this.closed) {
         GL15.glDeleteBuffers(this.id);
      }

      this.closed = true;
   }

   public void upload(ByteBuffer data) {
      if (this.closed) {
         throw new IllegalStateException("Cannot upload data to a closed GPU buffer");
      }

      this.bind();
      GL15.glBufferData(this.target.glId, data, this.usage.glId);
      GL15.glBindBuffer(this.target.glId, 0);
   }

   @Generated
   public int getId() {
      return this.id;
   }

   @Generated
   public ظح getTarget() {
      return this.target;
   }

   @Generated
   public اً getUsage() {
      return this.usage;
   }
}
