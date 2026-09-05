package ru.metaculture.protection;

import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL15;
import org.lwjgl.opengl.GL20;
import org.lwjgl.opengl.GL30;

public final class nnUnNnuvvN implements AutoCloseable {
   private final int UuUVuuUu = GL30.glGenVertexArrays();
   private final int C00OOC00oO = GL15.glGenBuffers();

   public nnUnNnuvvN() {
      GL30.glBindVertexArray(this.UuUVuuUu);
      GL15.glBindBuffer(34962, this.C00OOC00oO);
      float[] var1 = new float[]{0.0F, 0.0F, 1.0F, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 0.0F, 1.0F};
      GL15.glBufferData(34962, var1, 35044);
      GL20.glEnableVertexAttribArray(0);
      GL20.glVertexAttribPointer(0, 2, 5126, false, 8, 0L);
      GL15.glBindBuffer(34962, 0);
      GL30.glBindVertexArray(0);
   }

   public void UuUVuuUu() {
      GL30.glBindVertexArray(this.UuUVuuUu);
      GL11.glDrawArrays(4, 0, 6);
      GL30.glBindVertexArray(0);
   }

   @Override
   public void close() {
      GL30.glDeleteVertexArrays(this.UuUVuuUu);
      GL15.glDeleteBuffers(this.C00OOC00oO);
   }
}
