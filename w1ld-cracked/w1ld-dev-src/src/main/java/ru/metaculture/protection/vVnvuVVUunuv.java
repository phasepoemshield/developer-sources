package ru.metaculture.protection;

import java.awt.Color;
import lombok.Generated;
import net.minecraft.class_124;
import net.minecraft.class_2561;
import net.minecraft.class_2583;
import net.minecraft.class_310;
import net.minecraft.class_5250;
import net.minecraft.class_5251;

public final class vVnvuVVUunuv implements O000c0oocoo {
   public static void UuUVuuUu(String var0) {
      class_310 var1 = class_310.method_1551();
      if (var1.field_1705 != null && var1.field_1705.method_1743() != null) {
         NvVNvUvunNNu var2 = NVnVnNnN.UuUVuuUu != null && NVnVnNnN.UuUVuuUu.nvUVNnuu != null ? NVnVnNnN.UuUVuuUu.nvUVNnuu.C00OOC00oO() : NvVNvUvunNNu.WILD;
         class_5250 var3 = class_2561.method_43470("")
            .method_10852(UuUVuuUu("Wild", var2))
            .method_10852(class_2561.method_43470(" » ").method_27692(class_124.field_1068))
            .method_10852(class_2561.method_43470(var0).method_27692(class_124.field_1080));
         var1.field_1705.method_1743().method_1812(var3);
      } else {
         System.out.println("[WILD Log] " + var0);
      }
   }

   public static void C00OOC00oO(String var0) {
      class_310 var1 = class_310.method_1551();
      if (var1.field_1705 != null && var1.field_1705.method_1743() != null) {
         NvVNvUvunNNu var2 = NVnVnNnN.UuUVuuUu != null && NVnVnNnN.UuUVuuUu.nvUVNnuu != null ? NVnVnNnN.UuUVuuUu.nvUVNnuu.C00OOC00oO() : NvVNvUvunNNu.WILD;
         class_5250 var3 = class_2561.method_43470("")
            .method_10852(UuUVuuUu("AI", var2))
            .method_10852(class_2561.method_43470(" » ").method_27692(class_124.field_1063))
            .method_10852(class_2561.method_43470(var0).method_27692(class_124.field_1068));
         var1.field_1705.method_1743().method_1812(var3);
      }
   }

   public static class_2561 UuUVuuUu(String var0, NvVNvUvunNNu var1) {
      class_5250 var2 = class_2561.method_43473();
      int var3 = var0.length();
      Color var4 = var1.UuUVuuUu();
      Color var5 = var1.nuUnNvnuUu();
      long var6 = System.currentTimeMillis();

      for (int var8 = 0; var8 < var3; var8++) {
         float var9 = var8 * 0.15F + (float)var6 / 1500.0F;
         float var10 = (float)(Math.sin(var9) + 1.0) / 2.0F;
         int var11 = (int)(var4.getRed() * (1.0F - var10) + var5.getRed() * var10);
         int var12 = (int)(var4.getGreen() * (1.0F - var10) + var5.getGreen() * var10);
         int var13 = (int)(var4.getBlue() * (1.0F - var10) + var5.getBlue() * var10);
         class_5251 var14 = class_5251.method_27717(var11 << 16 | var12 << 8 | var13);
         class_5250 var15 = class_2561.method_43470(String.valueOf(var0.charAt(var8))).method_10862(class_2583.field_24360.method_27703(var14));
         var2.method_10852(var15);
      }

      return var2;
   }

   @Generated
   private vVnvuVVUunuv() {
      throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
   }
}
