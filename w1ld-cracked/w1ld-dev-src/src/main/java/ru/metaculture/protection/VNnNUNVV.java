package ru.metaculture.protection;

import java.util.Locale;
import net.minecraft.class_2828;

public class VNnNUNVV extends nvnnUuNnUvUN {
   public static boolean UuUVuuUu = false;
   public static boolean C00OOC00oO = false;
   private static float uUnuvNvvNU;
   private static float vVvUvVVuuNvV;
   private static boolean uNNnnnuuuN;

   @vuVvUNNvVNV
   public void UuUVuuUu(uvUUuvnunU var1) {
      if (UuUVuuUu && var1.uUnuvNvvNU() && !var1.UuUVuuUu()) {
         if (var1.vVvUvVVuuNvV() instanceof class_2828 var2 && var2.method_36172()) {
            String var9 = nvNVUnVUUnun.uUnuvNvvNU();
            if (!C00OOC00oO || !"IDLE".equals(var9)) {
               float var4 = var2.method_12271(uUnuvNvvNU);
               float var5 = var2.method_12270(vVvUvVVuuNvV);
               float var6 = uNNnnnuuuN ? var4 - uUnuvNvvNU : 0.0F;
               float var7 = uNNnnnuuuN ? var5 - vVvUvVVuuNvV : 0.0F;
               float var8 = uNvunUnUUnvV.UuUVuuUu();
               System.out
                  .printf(
                     Locale.ROOT,
                     "[WildRot] %-6s yaw=%9.4f pitch=%8.4f dYaw=%+9.4f dPitch=%+8.4f steps=%+d/%+d gcd=%.6f onGround=%b camera=%.4f/%.4f%n",
                     var9,
                     var4,
                     var5,
                     var6,
                     var7,
                     Math.round(var6 / var8),
                     Math.round(var7 / var8),
                     var8,
                     var2.method_12273(),
                     NNvvnnunn.uUnuvNvvNU,
                     NNvvnnunn.vVvUvVVuuNvV
                  );
               uUnuvNvvNU = var4;
               vVvUvVVuuNvV = var5;
               uNNnnnuuuN = true;
            }
         }
      }
   }
}
