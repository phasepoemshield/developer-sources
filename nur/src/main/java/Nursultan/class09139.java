package Nursultan;

import java.util.concurrent.ThreadLocalRandom;
import minecraft.class04995;
import minecraft.class06889;

public class class09139 {
   private class09139() {
   }

   public static class06889 N(float var0, float var1) {
      float var2 = var0 * (float) (Math.PI / 180.0);
      float var3 = -var1 * (float) (Math.PI / 180.0);
      float var4 = class04995.P((double)var3);
      float var5 = class04995.m((double)var3);
      float var6 = class04995.P((double)var2);
      float var7 = class04995.m((double)var2);
      return new class06889((double)(var5 * var6), (double)(-var7), (double)(var4 * var6));
   }

   public static float N(double var0, double var2) {
      return var2 <= var0 ? (float)var0 : (float)(var0 + (var2 - var0) * ThreadLocalRandom.current().nextDouble());
   }
}
