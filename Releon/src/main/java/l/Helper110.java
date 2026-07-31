package l;

import java.util.Map;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.texture.AbstractTexture;
import org.joml.Matrix4f;

public final class Helper110 {
   private final String name;
   private final AbstractTexture texture;
   private final Helper51 atlas;
   private final Helper48 metrics;
   private final Map<Integer, Helper61> glyphs;
   private final Map<Integer, Map<Integer, Float>> kernings;

   Helper110(String var1, AbstractTexture var2, Helper51 var3, Helper48 var4, Map<Integer, Helper61> var5, Map<Integer, Map<Integer, Float>> var6) {
      this.name = var1;
      this.texture = var2;
      this.atlas = var3;
      this.metrics = var4;
      this.glyphs = var5;
      this.kernings = var6;
   }

   public int method943() {
      return this.texture.getGlId();
   }

   public void method944(Matrix4f var1, VertexConsumer var2, String var3, float var4, float var5, float var6, float var7, float var8, float var9, int var10) {
      int var11 = -1;

      for (int var12 = 0; var12 < var3.length(); var12++) {
         char var13 = var3.charAt(var12);
         Helper61 var14 = this.glyphs.get(Integer.valueOf(var13));
         if (var14 != null) {
            Map<Integer, Float> var15 = this.kernings.get(var11);
            if (var15 != null) {
               var7 += var15.getOrDefault(Integer.valueOf(var13), 0.0F) * var4;
            }

            var7 += var14.method674(var1, var2, var4, var7, var8, var9, var10) + var5 + var6;
            var11 = var13;
         }
      }
   }

   public float method945(String var1, float var2) {
      int var3 = -1;
      float var4 = 0.0F;

      for (int var5 = 0; var5 < var1.length(); var5++) {
         char var6 = var1.charAt(var5);
         Helper61 var7 = this.glyphs.get(Integer.valueOf(var6));
         if (var7 != null) {
            Map<Integer, Float> var8 = this.kernings.get(var3);
            if (var8 != null) {
               var4 += var8.getOrDefault(Integer.valueOf(var6), 0.0F) * var2;
            }

            var4 += var7.method675(var2);
            var3 = var6;
         }
      }

      return var4;
   }

   public String getName() {
      return this.name;
   }

   public Helper51 method946() {
      return this.atlas;
   }

   public Helper48 method947() {
      return this.metrics;
   }

   public static Helper109 method948() {
      return new Helper109();
   }
}
