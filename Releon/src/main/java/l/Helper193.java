package l;

import net.minecraft.client.MinecraftClient;
import net.minecraft.util.math.MathHelper;

public final class Helper193 {
   public static double delta;

   public static float method1647(float var0, float var1, float var2) {
      float var3 = (var1 - var0) / Math.max((float)MinecraftClient.getInstance().getCurrentFps(), 5.0F) * 15.0F;
      if (var3 > 0.0F) {
         var3 = Math.max(var2, var3);
         var3 = Math.min(var1 - var0, var3);
      } else if (var3 < 0.0F) {
         var3 = Math.min(-var2, var3);
         var3 = Math.max(var1 - var0, var3);
      }

      return var0 + var3;
   }

   public static float method1648(float var0, float var1, float var2) {
      float var3 = (var1 - var0) / Math.max((float)MinecraftClient.getInstance().getCurrentFps(), 5.0F) * 15.0F;
      if (var3 > 0.0F) {
         var3 = Math.min(var1 - var0, var2);
      } else if (var3 < 0.0F) {
         var3 = -var2;
         var3 = Math.max(var1 - var0, var3);
      }

      return var0 + var3;
   }

   public static float method1649(float var0, float var1, float var2) {
      float var3 = (float)(delta * (var2 / 1000.0F));
      if (var0 < var1) {
         if (var0 + var3 < var1) {
            var0 += var3;
         } else {
            var0 = var1;
         }
      } else if (var0 - var3 > var1) {
         var0 -= var3;
      } else {
         var0 = var1;
      }

      return var0;
   }

   public static double method1650(double var0, double var2, double var4) {
      return var0 + (var2 - var0) * var4;
   }

   public static float method1651(float var0, float var1, float var2, float var3, float var4) {
      float var5 = (var1 - var0) * MathHelper.clamp(var4, 0.0F, 1.0F);
      if (var5 < 0.0F) {
         var5 = MathHelper.clamp(var5, -var3, -var2);
      } else {
         var5 = MathHelper.clamp(var5, var2, var3);
      }

      return Math.abs(var5) > Math.abs(var1 - var0) ? var1 : var0 + var5;
   }

   private Helper193() {
      throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
   }
}
