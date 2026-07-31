package l;

import net.minecraft.client.render.VertexConsumer;

final class Helper281 implements VertexConsumer {
   private final VertexConsumer delegate;
   private final Helper282 tint;

   Helper281(VertexConsumer var1, Helper282 var2) {
      this.delegate = var1;
      this.tint = var2;
   }

   public VertexConsumer vertex(float var1, float var2, float var3) {
      this.delegate.vertex(var1, var2, var3);
      return this;
   }

   @Override
   public VertexConsumer color(int red, int green, int blue, int alpha) {
      this.delegate
         .color(
            Math.round(255.0F * this.tint.red), Math.round(255.0F * this.tint.green), Math.round(255.0F * this.tint.blue), Math.round(255.0F * this.tint.alpha)
         );
      return this;
   }

   @Override
   public VertexConsumer texture(float u, float v) {
      this.delegate.texture(u, v);
      return this;
   }

   public VertexConsumer overlay(int var1, int var2) {
      this.delegate.overlay(var1, var2);
      return this;
   }

   @Override
   public VertexConsumer light(int u, int v) {
      this.delegate.light(u, v);
      return this;
   }

   @Override
   public VertexConsumer normal(float x, float y, float z) {
      this.delegate.normal(x, y, z);
      return this;
   }
}
