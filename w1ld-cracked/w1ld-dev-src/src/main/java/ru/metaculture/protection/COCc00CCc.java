package ru.metaculture.protection;

import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import javax.imageio.ImageIO;
import net.minecraft.class_1011;
import net.minecraft.class_1043;
import net.minecraft.class_1044;
import net.minecraft.class_10868;
import net.minecraft.class_2960;
import net.minecraft.class_310;

public final class COCc00CCc {
   private static final Map<COCc00CCc.NVnVnNnN, Integer> UuUVuuUu = new HashMap<>();
   private static final Map<COCc00CCc.NVnVnNnN, class_2960> C00OOC00oO = new HashMap<>();

   private COCc00CCc() {
   }

   public static int UuUVuuUu(float var0, float var1) {
      int var2 = Math.round(var0 * var1);
      int var3 = (var2 + 7) / 8 * 8;
      return Math.max(8, Math.min(512, var3));
   }

   public static int UuUVuuUu(class_2960 var0, int var1, boolean var2) {
      if (var0 == null) {
         return -1;
      } else {
         COCc00CCc.NVnVnNnN var3 = new COCc00CCc.NVnVnNnN(var0, var1, var2);
         Integer var4 = UuUVuuUu.get(var3);
         if (var4 != null) {
            return var4;
         } else {
            int var5 = UuUVuuUu(var3);
            if (var5 > 0) {
               UuUVuuUu.put(var3, var5);
            }

            return var5;
         }
      }
   }

   private static int UuUVuuUu(COCc00CCc.NVnVnNnN var0) {
      class_310 var1 = class_310.method_1551();

      try {
         byte var11;
         try (InputStream var2 = var1.method_1478().open(var0.source())) {
            int var3 = Math.max(1, Math.min(3, 1024 / Math.max(1, var0.size())));
            int[] var4 = vnVnvNN.UuUVuuUu(var2, var0.size(), var0.size(), var0.tinted(), var3);
            BufferedImage var5 = new BufferedImage(var0.size(), var0.size(), 2);
            var5.setRGB(0, 0, var0.size(), var0.size(), var4, 0, var0.size());
            ByteArrayOutputStream var6 = new ByteArrayOutputStream(var0.size() * var0.size() * 4);
            ImageIO.write(var5, "png", var6);
            class_1011 var7 = class_1011.method_4309(new ByteArrayInputStream(var6.toByteArray()));
            class_1043 var8 = new class_1043(() -> "wild_svg", var7);
            class_2960 var9 = class_2960.method_60655(
               "wild", "svg_" + var0.source().method_12832().replace('/', '_').replace('.', '_') + "_" + var0.size() + (var0.tinted() ? "_t" : "")
            );
            var1.method_1531().method_4616(var9, var8);
            C00OOC00oO.put(var0, var9);
            class_1044 var10 = var1.method_1531().method_4619(var9);
            if (var10 != null && var10.method_68004() instanceof class_10868 var17) {
               int var18 = var17.method_68427();
               return var18 > 0 ? var18 : -1;
            }

            var11 = -1;
         }

         return var11;
      } catch (Throwable var16) {
         return -1;
      }
   }

   public static void UuUVuuUu() {
      class_310 var0 = class_310.method_1551();

      for (class_2960 var2 : C00OOC00oO.values()) {
         try {
            var0.method_1531().method_4615(var2);
         } catch (Throwable var4) {
         }
      }

      C00OOC00oO.clear();
      UuUVuuUu.clear();
   }

   record NVnVnNnN(class_2960 source, int size, boolean tinted) {
   }
}
