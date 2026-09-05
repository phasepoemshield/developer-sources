package ru.metaculture.protection;

import java.util.List;
import net.minecraft.class_1297;
import net.minecraft.class_1309;
import net.minecraft.class_1531;
import net.minecraft.class_1657;
import net.minecraft.class_238;
import net.minecraft.class_243;
import org.wild.module.api.Module;
import org.wild.module.api.ModuleRegister;

@uNUunUnnnVu(
   uUnuvNvvNU = {"lichoday"}
)
@ModuleRegister(
   UuUVuuUu = "Speed",
   C00OOC00oO = "Ускоряет вашего персонажа",
   uUnuvNvvNU = oOOOo0.Movement,
   vVvUvVVuuNvV = {uVUNNUnNvU.RISKY, uVUNNUnNvU.MATRIX, uVUNNUnNvU.GRIM}
)
public class Speed extends Module {
   public static UvNnUnuNUUU NVNnnvnuunNv = new UvNnUnuNUUU("Режим", "Vanilla", "Vanilla", "ST duel", "HW", "Ares-Entity", "Grim-Entity", "TargetStrafe");
   public static nNUuNvVn uVunuUNVVUUV = new nNUuNvVn("Пиковая скорость (BPS)", 7.0F, 3.0F, 15.0F, 1.0F, false);
   public static nNUuNvVn UNnVVNvvnVvU = new nNUuNvVn("Сила ускорения", 0.8F, 0.1F, 2.0F, 0.1F, false);
   public static nNUuNvVn uNnUnnuNUnNu = new nNUuNvVn("Радиус стрейфа", 2.0F, 0.5F, 5.0F, 0.1F, false).UuUVuuUu(() -> !NVNnnvnuunNv.C00OOC00oO("TargetStrafe"));
   public static int NnUuNNU = 1;

   public Speed() {
      this.UuUVuuUu(new nvUuvVvuuN[]{NVNnnvnuunNv, uVunuUNVVUUV, UNnVVNvvnVvU, uNnUnnuNUnNu});
   }

   @Override
   public void C00OOC00oO() {
      super.C00OOC00oO();
   }

   @vuVvUNNvVNV
   public void UuUVuuUu(nVunNNvuv var1) {
      if (!VUUuVvvnNVUu.UuUVuuUu() && uUnuvNvvNU.field_1724 != null && uUnuvNvvNU.field_1687 != null) {
         if (uUnuvNvvNU.field_1724.field_5976) {
            NnUuNNU = -NnUuNNU;
         }

         String var2 = NVNnnvnuunNv.uUnuvNvvNU();
         switch (var2) {
            case "Vanilla":
               UNnnNuVnu.C00OOC00oO(0.42);
               break;
            case "ST duel":
               this.UuUVuuUu(0.16);
               break;
            case "HW":
               this.UuUVuuUu(0.1);
               break;
            case "Grim-Entity":
               this.UuuNnUvUuv();
               break;
            case "Ares-Entity":
               this.nUUVuvU();
               break;
            case "TargetStrafe":
               this.UnUNVVVNuv();
         }
      }
   }

   private void UuUVuuUu(double var1) {
      if (!uUnuvNvvNU.field_1724.method_24828()) {
         class_238 var3 = uUnuvNvvNU.field_1724.method_5829().method_1014(var1);
         List var4 = uUnuvNvvNU.field_1687.method_8335(uUnuvNvvNU.field_1724, var3);
         int var5 = 0;
         int var6 = 0;

         for (class_1297 var8 : var4) {
            if (var8 instanceof class_1531) {
               var5++;
            } else if (var8 instanceof class_1309) {
               var6++;
            }

            if (var5 > 1 || var6 > 1) {
               this.vNVuvnUUnuUn();
               return;
            }
         }
      }
   }

   private void UuuNnUvUuv() {
      double var1 = 6.0E-4F;
      class_1297 var3 = null;
      double var4 = Double.MAX_VALUE;
      double var6 = 0.2F;

      for (class_1297 var9 : uUnuvNvvNU.field_1687.method_18112()) {
         if (var9 != uUnuvNvvNU.field_1724 && var9 instanceof class_1657 && var9 == AttackAura.ccOO0COcoco0) {
            double var10 = var9.method_23317() - uUnuvNvvNU.field_1724.method_23317();
            double var12 = var9.method_23321() - uUnuvNvvNU.field_1724.method_23321();
            double var14 = var10 * var10 + var12 * var12;
            if (var14 <= var6 && var14 < var4) {
               var4 = var14;
               var3 = var9;
            }
         }
      }

      if (var3 != null) {
         double[] var16 = this.UuUVuuUu(uUnuvNvvNU.field_1724.method_19538(), var3.method_19538(), var1);
         uUnuvNvvNU.field_1724.method_5762(var16[0], 0.0, var16[1]);
         uUnuvNvvNU.field_1724.field_6037 = true;
      }
   }

   private void nUUVuvU() {
      class_1297 var1 = null;
      double var2 = Double.MAX_VALUE;
      double var4 = 2.25;

      for (class_1297 var7 : uUnuvNvvNU.field_1687.method_18112()) {
         if (var7 != uUnuvNvvNU.field_1724 && var7 instanceof class_1657) {
            double var8 = var7.method_23317() - uUnuvNvvNU.field_1724.method_23317();
            double var10 = var7.method_23321() - uUnuvNvvNU.field_1724.method_23321();
            double var12 = var8 * var8 + var10 * var10;
            if (var12 <= var4 && var12 < var2) {
               var2 = var12;
               var1 = var7;
            }
         }
      }

      if (var1 != null && !uUnuvNvvNU.field_1724.method_24828()) {
         this.vNVuvnUUnuUn();
      }
   }

   private void UnUNVVVNuv() {
      class_1309 var1 = AttackAura.ccOO0COcoco0;
      if (var1 != null && !uUnuvNvvNU.field_1724.method_24828()) {
         class_1297 var2 = null;
         double var3 = Double.MAX_VALUE;
         double var5 = 2.25;

         for (class_1297 var8 : uUnuvNvvNU.field_1687.method_18112()) {
            if (var8 != uUnuvNvvNU.field_1724 && var8 instanceof class_1657) {
               double var9 = var8.method_23317() - uUnuvNvvNU.field_1724.method_23317();
               double var11 = var8.method_23321() - uUnuvNvvNU.field_1724.method_23321();
               double var13 = var9 * var9 + var11 * var11;
               if (var13 <= var5 && var13 < var3) {
                  var3 = var13;
                  var2 = var8;
               }
            }
         }

         class_243 var33 = uUnuvNvvNU.field_1724.method_18798();
         double var34 = Math.sqrt(var33.field_1352 * var33.field_1352 + var33.field_1350 * var33.field_1350);
         if (var2 != null) {
            double var10 = 1.0 + UNnVVNvvnVvU.uUnuvNvvNU() / 10.0;
            var34 *= var10;
         }

         double var35 = uVunuUNVVUUV.uUnuvNvvNU() / 20.0;
         if (var34 > var35) {
            var34 = var35;
         }

         if (var34 < 0.15) {
            var34 = 0.15;
         }

         double var12 = uNnUnnuNUnNu.uUnuvNvvNU();
         double var14 = uUnuvNvvNU.field_1724.method_5739(var1);
         double var16 = 0.0;
         double var18 = NnUuNNU;
         if (var14 > var12 + 0.5) {
            var16 = 1.0;
         } else if (var14 < var12 - 0.5) {
            var16 = -1.0;
         }

         double var20 = var1.method_23317() - uUnuvNvvNU.field_1724.method_23317();
         double var22 = var1.method_23321() - uUnuvNvvNU.field_1724.method_23321();
         float var24 = (float)(Math.toDegrees(Math.atan2(var22, var20)) - 90.0);
         if (var16 != 0.0) {
            if (var18 > 0.0) {
               var24 += var16 > 0.0 ? -45 : 45;
            } else if (var18 < 0.0) {
               var24 += var16 > 0.0 ? 45 : -45;
            }

            var18 = 0.0;
            var16 = var16 > 0.0 ? 1.0 : -1.0;
         }

         double var25 = Math.sin(Math.toRadians(var24 + 90.0F));
         double var27 = Math.cos(Math.toRadians(var24 + 90.0F));
         double var29 = var16 * var34 * var27 + var18 * var34 * var25;
         double var31 = var16 * var34 * var25 - var18 * var34 * var27;
         uUnuvNvvNU.field_1724.method_18800(var29, var33.field_1351, var31);
         uUnuvNvvNU.field_1724.field_6037 = true;
      }
   }

   private void vNVuvnUUnuUn() {
      class_243 var1 = uUnuvNvvNU.field_1724.method_18798();
      double var2 = 1.0 + UNnVVNvvnVvU.uUnuvNvvNU() / 10.0;
      double var4 = uVunuUNVVUUV.uUnuvNvvNU() / 20.0;
      double var6 = var1.field_1352;
      double var8 = var1.field_1350;
      double var10 = var6 * var2;
      double var12 = var8 * var2;
      double var14 = Math.sqrt(var10 * var10 + var12 * var12);
      if (var14 > var4) {
         double var16 = var4 / var14;
         var10 *= var16;
         var12 *= var16;
      }

      double var20 = var10 - var6;
      double var18 = var12 - var8;
      uUnuvNvvNU.field_1724.method_5762(var20, 0.0, var18);
      uUnuvNvvNU.field_1724.field_6037 = true;
   }

   private double[] UuUVuuUu(class_243 var1, class_243 var2, double var3) {
      double var5 = var2.field_1352 - var1.field_1352;
      double var7 = var2.field_1350 - var1.field_1350;
      double var9 = Math.sqrt(var5 * var5 + var7 * var7);
      return var9 == 0.0 ? new double[]{0.0, 0.0} : new double[]{var5 / var9 * var3, var7 / var9 * var3};
   }
}
