package ru.metaculture.protection;

import net.minecraft.class_1044;
import net.minecraft.class_10868;
import net.minecraft.class_243;
import net.minecraft.class_2960;
import net.minecraft.class_310;
import net.minecraft.class_3532;

public final class VNVNvuUn {
   private static final class_310 uNNnnnuuuN = class_310.method_1551();
   private static final class_2960 nuUnNvnuUu = class_2960.method_60655("wild", "textures/arrows/arrows.png");
   private static final double VVuuUN = 32.0;
   private static final float vNUvnnVnUvu = 180.0F;
   private static final float uVUuuVnNVU = 16.0F;
   private static final float vuuuNvNuv = 22.0F;
   private static final float nvUVNnuu = 25.0F;
   public float UuUVuuUu;
   public float C00OOC00oO;
   public double uUnuvNvvNU;
   public boolean vVvUvVVuuNvV;

   public boolean UuUVuuUu(class_243 var1) {
      return this.UuUVuuUu(var1, true);
   }

   public boolean UuUVuuUu(class_243 var1, boolean var2) {
      this.vVvUvVVuuNvV = false;
      if (uNNnnnuuuN.field_1773 != null && uNNnnnuuuN.field_1773.method_19418() != null) {
         class_243 var3 = uNNnnnuuuN.field_1773.method_19418().method_19326();
         double var4 = var1.field_1352 - var3.field_1352;
         double var6 = var1.field_1351 - var3.field_1351;
         double var8 = var1.field_1350 - var3.field_1350;
         this.uUnuvNvvNU = Math.sqrt(var4 * var4 + var6 * var6 + var8 * var8);
         class_243 var10 = var1;
         if (var2 && this.uUnuvNvvNU > 32.0) {
            double var11 = 32.0 / this.uUnuvNvvNU;
            var10 = new class_243(var3.field_1352 + var4 * var11, var3.field_1351 + var6 * var11, var3.field_1350 + var8 * var11);
         }

         class_243 var13 = VnNnNnvuvn.UuUVuuUu(var10);
         if (var13 != null && !(var13.field_1350 <= 0.001) && !(var13.field_1350 > 1.0)) {
            this.UuUVuuUu = (float)var13.field_1352;
            this.C00OOC00oO = (float)var13.field_1351;
            this.vVvUvVVuuNvV = true;
            return true;
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public static void UuUVuuUu(UnVNvNnU var0, class_243 var1, String var2, String var3, float var4, int var5, int var6) {
      if (!(var4 <= 0.004F) && uNNnnnuuuN.field_1773 != null && uNNnnnuuuN.field_1773.method_19418() != null) {
         int var7 = UuUVuuUu();
         if (var7 > 0) {
            class_243 var8 = uNNnnnuuuN.field_1773.method_19418().method_19326();
            double var9 = var1.field_1352 - var8.field_1352;
            double var11 = var1.field_1350 - var8.field_1350;
            float var13 = uNNnnnuuuN.field_1773.method_19418().method_19330();
            double var14 = class_3532.method_15362((float)Math.toRadians(var13));
            double var16 = class_3532.method_15374((float)Math.toRadians(var13));
            double var18 = Math.atan2(-(var11 * var14 - var9 * var16), -(var9 * var14 + var11 * var16)) * 180.0 / Math.PI;
            float var20 = C00OOC00oO() * 0.5F;
            float var21 = 180.0F * var20 * var4;
            float var22 = var5 * 0.5F + var21 * class_3532.method_15362((float)Math.toRadians(var18));
            float var23 = var6 * 0.5F + var21 * class_3532.method_15374((float)Math.toRadians(var18));
            int var24 = VnVnuUn.uNNnnnuuuN(UnVNvNnU.VvunVVUvUNnv.nuUnNvnuUu(1, 1), (int)(255.0F * var4));
            int var25 = VnVnuUn.uUnuvNvvNU(255, 255, 255, (int)(255.0F * var4));
            float var26 = 16.0F * var20;
            float var27 = 22.0F * var20;
            float var28 = 25.0F * var20;
            var0.UuUVuuUu(var22, var23);

            try {
               var0.C00OOC00oO((float)(var18 + 90.0));
               boolean var37 = false /* VF: Semaphore variable */;

               try {
                  var37 = true;
                  var0.UuUVuuUu(var7, -var26, -var26, var26 * 2.0F, var26 * 2.0F, var25, false);
                  var37 = false;
               } finally {
                  if (var37) {
                     var0.VVuuUN();
                  }
               }

               var0.VVuuUN();
               VuuUvnvnuu.nvnNNunvv var29 = UnVNvNnU.UuUVuuUu(vNvnnVvvVUu.UuUVuuUu, var2, var27);
               VuuUvnvnuu.nvnNNunvv var30 = UnVNvNnU.UuUVuuUu(vNvnnVvvVUu.UuUVuuUu, var3, var28);
               float var31 = var26 + 10.0F * var20 + var29.C00OOC00oO;
               var0.UuUVuuUu(vNvnnVvvVUu.UuUVuuUu, -var29.UuUVuuUu * 0.5F, var31, var27, var2, VnVnuUn.uUnuvNvvNU(240, 240, 244, (int)(255.0F * var4)));
               var0.UuUVuuUu(vNvnnVvvVUu.UuUVuuUu, -var30.UuUVuuUu * 0.5F, var31 + var30.C00OOC00oO + 5.0F * var20, var28, var3, var24);
            } finally {
               var0.vNUvnnVnUvu();
            }
         }
      }
   }

   private static int UuUVuuUu() {
      try {
         class_1044 var0 = uNNnnnuuuN.method_1531().method_4619(nuUnNvnuUu);
         return var0 != null && var0.method_68004() instanceof class_10868 var1 ? var1.method_68427() : -1;
      } catch (Throwable var3) {
         return -1;
      }
   }

   private static float C00OOC00oO() {
      if (uNNnnnuuuN != null && uNNnnnuuuN.method_22683() != null) {
         float var0 = uNNnnnuuuN.method_22683().method_4495();
         return var0 <= 0.0F ? 2.0F : var0;
      } else {
         return 2.0F;
      }
   }
}
