package l;

import net.minecraft.client.render.VertexConsumer;
import org.joml.Matrix4f;

public final class Helper61 {
   private final int code;
   private final float minU;
   private final float maxU;
   private final float minV;
   private final float maxV;
   private final float advance;
   private final float topPosition;
   private final float width;
   private final float height;

   public Helper61(Helper47 var1, float var2, float var3) {
      this.code = var1.method606();
      this.advance = var1.method607();
      Helper49 var4 = var1.method609();
      if (var4 != null) {
         this.minU = var4.method614() / var2;
         this.maxU = var4.method616() / var2;
         this.minV = 1.0F - var4.method615() / var3;
         this.maxV = 1.0F - var4.method617() / var3;
      } else {
         this.minU = this.maxU = this.minV = this.maxV = 0.0F;
      }

      Helper49 var5 = var1.method608();
      if (var5 != null) {
         this.width = var5.method616() - var5.method614();
         this.height = var5.method615() - var5.method617();
         this.topPosition = var5.method615();
      } else {
         this.width = this.height = this.topPosition = 0.0F;
      }
   }

   public float method674(Matrix4f var1, VertexConsumer var2, float var3, float var4, float var5, float var6, int var7) {
      var5 -= this.topPosition * var3;
      float var8 = this.width * var3;
      float var9 = this.height * var3;
      var2.vertex(var1, var4, var5, var6).texture(this.minU, this.minV).color(var7);
      var2.vertex(var1, var4, var5 + var9, var6).texture(this.minU, this.maxV).color(var7);
      var2.vertex(var1, var4 + var8, var5 + var9, var6).texture(this.maxU, this.maxV).color(var7);
      var2.vertex(var1, var4 + var8, var5, var6).texture(this.maxU, this.minV).color(var7);
      return this.advance * var3;
   }

   public float method675(float var1) {
      return this.advance * var1;
   }

   public int method676() {
      return this.code;
   }
}
