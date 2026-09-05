package ru.metaculture.protection;

import net.minecraft.class_1297;
import net.minecraft.class_1309;
import net.minecraft.class_1657;
import net.minecraft.class_1753;
import net.minecraft.class_1764;
import net.minecraft.class_1802;
import net.minecraft.class_243;
import net.minecraft.class_3532;
import org.wild.module.api.Module;
import org.wild.module.api.ModuleRegister;

@ModuleRegister(
   UuUVuuUu = "BowHelper",
   C00OOC00oO = "Плавная наводка без тряски",
   uUnuvNvvNU = oOOOo0.Combat
)
public class BowHelper extends Module {
   public nNUuNvVn NVNnnvnuunNv = new nNUuNvVn("Дистанция", 30.0F, 1.0F, 50.0F, 1.0F, false);
   public vvNnnUNnVvn uVunuUNVVUUV = new vvNnnUNnVvn("Игнор друзей", true);
   public static class_1309 UNnVVNvvnVvU = null;
   private boolean uNnUnnuNUnNu = false;

   public BowHelper() {
      this.UuUVuuUu(new nvUuvVvuuN[]{this.NVNnnvnuunNv, this.uVunuUNVVUUV});
   }

   @Override
   public void UuUVuuUu() {
      super.UuUVuuUu();
   }

   @Override
   public void C00OOC00oO() {
      COC0OCc.UuUVuuUu = COC0OCc.VvunVVUvUNnv.IDLE;
      COC0OCc.nuUnNvnuUu = 0;
      COC0OCc.uVUuuVnNVU = null;
      NNvvnnunn.UuUVuuUu = false;
      super.C00OOC00oO();
   }

   @vuVvUNNvVNV
   public void UuUVuuUu(nVunNNvuv var1) {
      if (uUnuvNvvNU.field_1724 != null && uUnuvNvvNU.field_1687 != null) {
         COC0OCc.UuUVuuUu = COC0OCc.VvunVVUvUNnv.IDLE;
         boolean var2 = uUnuvNvvNU.field_1724.method_6047().method_7909() instanceof class_1753
            || uUnuvNvvNU.field_1724.method_6079().method_7909() instanceof class_1753
            || uUnuvNvvNU.field_1724.method_6047().method_7909() instanceof class_1764
            || uUnuvNvvNU.field_1724.method_6079().method_7909() instanceof class_1764;
         if (!var2) {
            this.UuuNnUvUuv();
         } else {
            boolean var3 = uUnuvNvvNU.field_1724.method_6115() && uUnuvNvvNU.field_1724.method_6030().method_7909() instanceof class_1753;
            boolean var4 = uUnuvNvvNU.field_1724.method_6047().method_31574(class_1802.field_8399)
                  && class_1764.method_7781(uUnuvNvvNU.field_1724.method_6047())
               || uUnuvNvvNU.field_1724.method_6079().method_31574(class_1802.field_8399) && class_1764.method_7781(uUnuvNvvNU.field_1724.method_6079());
            if (UNnVVNvvnVvU != null && !this.UuUVuuUu(UNnVVNvvnVvU)) {
               UNnVVNvvnVvU = null;
            }

            if (UNnVVNvvnVvU == null) {
               UNnVVNvvnVvU = this.UnUNVVVNuv();
            }

            if (UNnVVNvvnVvU != null) {
               if (!this.uNnUnnuNUnNu) {
                  NNvvnnunn.UuUVuuUu = true;
                  this.uNnUnnuNUnNu = true;
               }

               if (var3 || var4) {
                  float var5 = this.nUUVuvU();
                  class_243 var6 = uUnuvNvvNU.field_1724.method_33571();
                  class_243 var7 = UNnVVNvvnVvU.method_19538().method_1031(0.0, UNnVVNvvnVvU.method_17682() * 0.5 + 0.1, 0.0);
                  double var8 = UNnVVNvvnVvU.method_23317() - UNnVVNvvnVvU.field_6014;
                  double var10 = UNnVVNvvnVvU.method_23321() - UNnVVNvvnVvU.field_5969;
                  double var12 = Math.sqrt(var8 * var8 + var10 * var10);
                  class_243 var14 = var7;
                  float var15 = 0.0F;

                  for (int var16 = 0; var16 < 3; var16++) {
                     double var17 = Math.cos(Math.toRadians(var15));
                     float var19 = (float)(var5 * Math.max(var17, 0.1));
                     if (var12 > 0.01) {
                        class_243 var20 = var7;

                        for (int var21 = 0; var21 < 25; var21++) {
                           double var22 = var20.field_1352 - var6.field_1352;
                           double var24 = var20.field_1350 - var6.field_1350;
                           double var26 = Math.sqrt(var22 * var22 + var24 * var24);
                           double var28 = this.UuUVuuUu(var26, var19);
                           var20 = new class_243(var7.field_1352 + var8 * var28, var7.field_1351, var7.field_1350 + var10 * var28);
                        }

                        var14 = var20;
                     }

                     double var31 = var14.field_1352 - var6.field_1352;
                     double var33 = var14.field_1350 - var6.field_1350;
                     double var34 = Math.sqrt(var31 * var31 + var33 * var33);
                     double var35 = var14.field_1351 - var6.field_1351;
                     var15 = this.UuUVuuUu(var34, var35, var5);
                  }

                  double var30 = var14.field_1352 - var6.field_1352;
                  double var18 = var14.field_1350 - var6.field_1350;
                  float var32 = (float)Math.toDegrees(Math.atan2(-var30, var18));
                  uUnuvNvvNU.field_1724.method_36456(var32);
                  uUnuvNvvNU.field_1724.method_36457(var15);
                  uUnuvNvvNU.field_1724.field_6241 = var32;
               }
            }
         }
      }
   }

   private void UuuNnUvUuv() {
      if (this.uNnUnnuNUnNu) {
         uUnuvNvvNU.field_1724.method_36456(NNvvnnunn.uUnuvNvvNU);
         uUnuvNvvNU.field_1724.method_36457(NNvvnnunn.vVvUvVVuuNvV);
         uUnuvNvvNU.field_1724.field_6241 = NNvvnnunn.uUnuvNvvNU;
         NNvvnnunn.UuUVuuUu = false;
         this.uNnUnnuNUnNu = false;
      }

      UNnVVNvvnVvU = null;
   }

   private float UuUVuuUu(double var1, double var3, float var5) {
      if (var1 < 0.5) {
         return 0.0F;
      } else {
         float var6 = -89.0F;
         float var7 = 89.0F;

         for (int var8 = 0; var8 < 60; var8++) {
            float var9 = (var6 + var7) / 2.0F;
            double var10 = this.UuUVuuUu(var1, var9, var5);
            if (var10 > var3) {
               var6 = var9;
            } else {
               var7 = var9;
            }
         }

         return (var6 + var7) / 2.0F;
      }
   }

   private double UuUVuuUu(double var1, float var3, float var4) {
      double var5 = Math.toRadians(var3);
      double var7 = var4 * Math.cos(var5);
      double var9 = -var4 * Math.sin(var5);
      double var11 = 0.0;
      double var13 = 0.0;

      for (int var15 = 0; var15 < 500; var15++) {
         double var16 = var11;
         double var18 = var13;
         var11 += var7;
         var13 += var9;
         var7 *= 0.99;
         var9 *= 0.99;
         var9 -= 0.05;
         if (var11 >= var1) {
            double var20 = var11 - var16 > 0.001 ? (var1 - var16) / (var11 - var16) : 1.0;
            return var18 + (var13 - var18) * var20;
         }
      }

      return var13;
   }

   private double UuUVuuUu(double var1, float var3) {
      double var4 = var3;
      double var6 = 0.0;

      for (int var8 = 0; var8 < 500; var8++) {
         var6 += var4;
         var4 *= 0.99;
         if (var6 >= var1) {
            return var8 + 1;
         }
      }

      return 500.0;
   }

   private float nUUVuvU() {
      boolean var1 = uUnuvNvvNU.field_1724.method_6047().method_7909() instanceof class_1764
         || uUnuvNvvNU.field_1724.method_6079().method_7909() instanceof class_1764;
      if (var1) {
         return 3.15F;
      } else {
         float var2 = 1.0F;
         if (uUnuvNvvNU.field_1724.method_6115() && uUnuvNvvNU.field_1724.method_6030().method_7909() instanceof class_1753) {
            int var3 = uUnuvNvvNU.field_1724.method_6048();
            float var4 = var3 / 20.0F;
            var2 = class_3532.method_15363((var4 * var4 + var4 * 2.0F) / 3.0F, 0.0F, 1.0F);
         }

         return var2 * 3.0F;
      }
   }

   private boolean UuUVuuUu(class_1309 var1) {
      if (var1 instanceof class_1657 var2) {
         if (!var2.method_5805()) {
            return false;
         } else {
            return var2.method_5655() ? false : !(uUnuvNvvNU.field_1724.method_5739(var2) > this.NVNnnvnuunNv.uUnuvNvvNU());
         }
      } else {
         return false;
      }
   }

   private class_1309 UnUNVVVNuv() {
      float var1 = this.NVNnnvnuunNv.uUnuvNvvNU();
      class_1657 var2 = null;
      double var3 = Double.MAX_VALUE;
      class_243 var5 = uUnuvNvvNU.field_1724.method_33571();
      float var6 = uUnuvNvvNU.field_1773.method_19418().method_19330();
      float var7 = uUnuvNvvNU.field_1773.method_19418().method_19329();
      class_243 var8 = class_243.method_1030(var7, var6).method_1029();

      for (class_1297 var10 : uUnuvNvvNU.field_1687.method_18112()) {
         if (var10 instanceof class_1657 var11
            && var11 != uUnuvNvvNU.field_1724
            && var11.method_5805()
            && !var11.method_5655()
            && !var11.method_68878()
            && !(uUnuvNvvNU.field_1724.method_5739(var11) > var1)
            && (!this.uVunuUNVVUUV.uUnuvNvvNU() || !uNvUVUNvuUVV.UuUVuuUu(var11.method_5477().getString()))) {
            class_243 var12 = var11.method_19538().method_1031(0.0, var11.method_17682() * 0.5, 0.0).method_1020(var5).method_1029();
            double var13 = Math.acos(class_3532.method_15350(var8.method_1026(var12), -1.0, 1.0));
            if (var13 < var3) {
               var3 = var13;
               var2 = var11;
            }
         }
      }

      return var2;
   }

   @Override
   public void a_() {
      super.a_();
      if (uUnuvNvvNU.field_1724 != null) {
         this.UuuNnUvUuv();
      }
   }
}
