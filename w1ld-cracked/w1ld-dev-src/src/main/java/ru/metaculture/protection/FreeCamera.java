package ru.metaculture.protection;

import baritone.api.BaritoneAPI;
import baritone.api.IBaritone;
import net.minecraft.class_238;
import net.minecraft.class_243;
import net.minecraft.class_2596;
import net.minecraft.class_2678;
import net.minecraft.class_2724;
import net.minecraft.class_2828;
import net.minecraft.class_5498;
import org.wild.module.api.Module;
import org.wild.module.api.ModuleRegister;

@ModuleRegister(
   UuUVuuUu = "FreeCamera",
   uUnuvNvvNU = oOOOo0.Player,
   C00OOC00oO = "Свободная камера",
   vVvUvVVuuNvV = {uVUNNUnNvU.RISKY}
)
public class FreeCamera extends Module {
   private static FreeCamera UnUNuUU;
   public final nNUuNvVn NVNnnvnuunNv = new nNUuNvVn("Скорость", 2.0F, 0.5F, 5.0F, 0.1F, false);
   public final vvNnnUNnVvn uVunuUNVVUUV = new vvNnnUNnVvn("Отменять пакет", false);
   public class_243 UNnVVNvvnVvU;
   public class_243 uNnUnnuNUnNu;
   public float NnUuNNU;
   public float nNvNUVU;
   private class_243 uUVuVvuNUvnu;

   public static FreeCamera UuuNnUvUuv() {
      if (UnUNuUU == null && NVnVnNnN.UuUVuuUu != null && NVnVnNnN.UuUVuuUu.C00OOC00oO != null) {
         UnUNuUU = NVnVnNnN.UuUVuuUu.C00OOC00oO.UuUVuuUu(FreeCamera.class);
      }

      return UnUNuUU;
   }

   public static boolean nUUVuvU() {
      FreeCamera var0 = UuuNnUvUuv();
      return var0 != null && var0.nuUnNvnuUu;
   }

   public FreeCamera() {
      UnUNuUU = this;
      this.UuUVuuUu(new nvUuvVvuuN[]{this.NVNnnvnuunNv, this.uVunuUNVVUUV});
   }

   @Override
   public void UuUVuuUu() {
      if (uUnuvNvvNU.field_1724 != null && uUnuvNvvNU.field_1687 != null) {
         class_243 var1 = uUnuvNvvNU.method_1561().field_4686 != null
            ? uUnuvNvvNU.method_1561().field_4686.method_19326()
            : uUnuvNvvNU.field_1724.method_33571();
         this.uNnUnnuNUnNu = this.UNnVVNvvnVvU = var1;
         if (uUnuvNvvNU.method_1561().field_4686 != null) {
            this.NnUuNNU = uUnuvNvvNU.method_1561().field_4686.method_19330();
            this.nNvNUVU = uUnuvNvvNU.method_1561().field_4686.method_19329();
         } else {
            this.NnUuNNU = uUnuvNvvNU.field_1724.method_36454();
            this.nNvNUVU = uUnuvNvvNU.field_1724.method_36455();
         }

         this.uUVuVvuNUvnu = null;
         super.UuUVuuUu();
      } else {
         this.a_();
      }
   }

   @Override
   public void C00OOC00oO() {
      this.uUVuVvuNUvnu = null;
      this.UNnVVNvvnVvU = null;
      this.uNnUnnuNUnNu = null;
      super.C00OOC00oO();
   }

   @vuVvUNNvVNV
   public void UuUVuuUu(uvUUuvnunU var1) {
      class_2596 var2 = var1.vVvUvVVuuNvV();
      if (!(var2 instanceof class_2724) && !(var2 instanceof class_2678)) {
         if (var1.uUnuvNvvNU() && this.uVunuUNVVUUV.uUnuvNvvNU() && var2 instanceof class_2828) {
            var1.C00OOC00oO();
         }
      } else {
         this.UuUVuuUu(false);
      }
   }

   @vuVvUNNvVNV
   public void UuUVuuUu(uUnnuUn var1) {
      if (uUnuvNvvNU.field_1724 != null && uUnuvNvvNU.field_1687 != null) {
         class_243 var2 = uUnuvNvvNU.field_1724.method_30950(var1.uVUuuVnNVU());
         class_238 var3 = uUnuvNvvNU.field_1724.method_5829().method_997(var2.method_1020(uUnuvNvvNU.field_1724.method_19538()));
         this.UuUVuuUu(var1, var3, VnVnuUn.UuUVuuUu());
      }
   }

   @vuVvUNNvVNV
   public void UuUVuuUu(nVunNNvuv var1) {
      if (uUnuvNvvNU.field_1724 != null && uUnuvNvvNU.field_1687 != null) {
         if (uUnuvNvvNU.field_1690 != null) {
            uUnuvNvvNU.field_1690.method_31043(class_5498.field_26664);
         }

         this.UnUNVVVNuv();
         this.UvnvNVnnnnNU();
      } else {
         this.UuUVuuUu(false);
      }
   }

   private void UnUNVVVNuv() {
      if (this.UNnVVNvvnVvU != null) {
         float var1 = 0.0F;
         float var2 = 0.0F;
         if (UNuNUNVv.UuUVuuUu(87)) {
            var1++;
         }

         if (UNuNUNVv.UuUVuuUu(83)) {
            var1--;
         }

         if (UNuNUNVv.UuUVuuUu(65)) {
            var2++;
         }

         if (UNuNUNVv.UuUVuuUu(68)) {
            var2--;
         }

         boolean var3 = UNuNUNVv.UuUVuuUu(32);
         boolean var4 = UNuNUNVv.UuUVuuUu(340) || UNuNUNVv.UuUVuuUu(344);
         float var5 = this.NVNnnvnuunNv.uUnuvNvvNU();
         double[] var6 = this.UuUVuuUu(var1, var2, this.NnUuNNU, var5);
         this.uNnUnnuNUnNu = this.UNnVVNvvnVvU;
         this.UNnVVNvvnVvU = this.UNnVVNvvnVvU.method_1031(var6[0], var3 ? var5 : (var4 ? -var5 : 0.0), var6[1]);
      }
   }

   private double[] UuUVuuUu(float var1, float var2, float var3, double var4) {
      if (var1 != 0.0F) {
         if (var2 > 0.0F) {
            var3 += var1 > 0.0F ? -45.0F : 45.0F;
         } else if (var2 < 0.0F) {
            var3 += var1 > 0.0F ? 45.0F : -45.0F;
         }

         var2 = 0.0F;
         var1 = var1 > 0.0F ? 1.0F : -1.0F;
      }

      double var6 = Math.sin(Math.toRadians(var3 + 90.0F));
      double var8 = Math.cos(Math.toRadians(var3 + 90.0F));
      return new double[]{var1 * var4 * var8 + var2 * var4 * var6, var1 * var4 * var6 - var2 * var4 * var8};
   }

   @vuVvUNNvVNV
   public void UuUVuuUu(nUUuNuvNUVV var1) {
      if (uUnuvNvvNU.field_1724 != null && uUnuvNvvNU.field_1687 != null && this.UNnVVNvvnVvU != null) {
         this.NnUuNNU = this.NnUuNNU + (float)var1.uUnuvNvvNU() * 0.15F;
         this.nNvNUVU = UuvVnuU.vuuuNvNuv(this.nNvNUVU + (float)var1.vVvUvVVuuNvV() * 0.15F, -90.0F, 90.0F);
         var1.C00OOC00oO();
      }
   }

   @vuVvUNNvVNV
   public void UuUVuuUu(UUvNUNvUVnu var1) {
      if (uUnuvNvvNU.field_1724 != null && uUnuvNvvNU.field_1687 != null && this.UNnVVNvvnVvU != null) {
         var1.UuUVuuUu(this.NnUuNNU);
         var1.C00OOC00oO(this.nNvNUVU);
      }
   }

   @vuVvUNNvVNV
   public void UuUVuuUu(UNNVUnNV var1) {
      if (uUnuvNvvNU.field_1724 != null && this.uVunuUNVVUUV.uUnuvNvvNU()) {
         if (this.uUVuVvuNUvnu == null) {
            this.uUVuVvuNUvnu = uUnuvNvvNU.field_1724.method_19538();
         }

         var1.UuUVuuUu(this.uUVuVvuNUvnu.field_1352);
         var1.C00OOC00oO(this.uUVuVvuNUvnu.field_1351);
         var1.uUnuvNvvNU(this.uUVuVvuNUvnu.field_1350);
         uUnuvNvvNU.field_1724.method_18799(class_243.field_1353);
         uUnuvNvvNU.field_1724.field_6017 = 0.0;
      }
   }

   @vuVvUNNvVNV
   public void UuUVuuUu(uNVVnVUNun var1) {
      if (uUnuvNvvNU.field_1724 != null && uUnuvNvvNU.field_1687 != null && this.UNnVVNvvnVvU != null) {
         if (!this.vNVuvnUUnuUn()) {
            var1.UuUVuuUu(0.0F);
            var1.C00OOC00oO(0.0F);
            var1.UuUVuuUu(false);
            var1.C00OOC00oO(false);
         }
      }
   }

   private boolean vNVuvnUUnuUn() {
      try {
         IBaritone var1 = BaritoneAPI.getProvider().getPrimaryBaritone();
         return var1.getPathingBehavior().isPathing() || var1.getCustomGoalProcess() != null && var1.getCustomGoalProcess().isActive();
      } catch (Throwable var2) {
         return false;
      }
   }

   public class_243 UuUVuuUu(float var1) {
      if (this.nuUnNvnuUu && this.uNnUnnuNUnNu != null && this.UNnVVNvvnVvU != null) {
         if (uUnuvNvvNU.field_1690 != null) {
            uUnuvNvvNU.field_1690.method_31043(class_5498.field_26664);
         }

         return this.uNnUnnuNUnNu.method_35590(this.UNnVVNvvnVvU, var1);
      } else {
         return null;
      }
   }

   private void UvnvNVnnnnNU() {
      if (uUnuvNvvNU.field_1724 != null) {
         if (!this.uVunuUNVVUUV.uUnuvNvvNU()) {
            this.uUVuVvuNUvnu = null;
         } else {
            if (this.uUVuVvuNUvnu == null) {
               this.uUVuVvuNUvnu = uUnuvNvvNU.field_1724.method_19538();
            }

            uUnuvNvvNU.field_1724.method_18799(class_243.field_1353);
            uUnuvNvvNU.field_1724.field_6017 = 0.0;
            uUnuvNvvNU.field_1724
               .method_5808(
                  this.uUVuVvuNUvnu.field_1352,
                  this.uUVuVvuNUvnu.field_1351,
                  this.uUVuVvuNUvnu.field_1350,
                  uUnuvNvvNU.field_1724.method_36454(),
                  uUnuvNvvNU.field_1724.method_36455()
               );
            uUnuvNvvNU.field_1724.field_6014 = this.uUVuVvuNUvnu.field_1352;
            uUnuvNvvNU.field_1724.field_6036 = this.uUVuVvuNUvnu.field_1351;
            uUnuvNvvNU.field_1724.field_5969 = this.uUVuVvuNUvnu.field_1350;
         }
      }
   }

   private void UuUVuuUu(uUnnuUn var1, class_238 var2, int var3) {
      int var4 = VnVnuUn.UuUVuuUu(var3, 220);
      class_243 var5 = new class_243(var2.field_1323, var2.field_1322, var2.field_1321);
      class_243 var6 = new class_243(var2.field_1320, var2.field_1325, var2.field_1324);
      class_243 var7 = new class_243(var5.field_1352, var5.field_1351, var5.field_1350);
      class_243 var8 = new class_243(var5.field_1352, var5.field_1351, var6.field_1350);
      class_243 var9 = new class_243(var5.field_1352, var6.field_1351, var5.field_1350);
      class_243 var10 = new class_243(var5.field_1352, var6.field_1351, var6.field_1350);
      class_243 var11 = new class_243(var6.field_1352, var5.field_1351, var5.field_1350);
      class_243 var12 = new class_243(var6.field_1352, var5.field_1351, var6.field_1350);
      class_243 var13 = new class_243(var6.field_1352, var6.field_1351, var5.field_1350);
      class_243 var14 = new class_243(var6.field_1352, var6.field_1351, var6.field_1350);
      var1.uNNnnnuuuN().UuUVuuUu(var7, var11, 1.0, var4, false);
      var1.uNNnnnuuuN().UuUVuuUu(var11, var12, 1.0, var4, false);
      var1.uNNnnnuuuN().UuUVuuUu(var12, var8, 1.0, var4, false);
      var1.uNNnnnuuuN().UuUVuuUu(var8, var7, 1.0, var4, false);
      var1.uNNnnnuuuN().UuUVuuUu(var9, var13, 1.0, var4, false);
      var1.uNNnnnuuuN().UuUVuuUu(var13, var14, 1.0, var4, false);
      var1.uNNnnnuuuN().UuUVuuUu(var14, var10, 1.0, var4, false);
      var1.uNNnnnuuuN().UuUVuuUu(var10, var9, 1.0, var4, false);
      var1.uNNnnnuuuN().UuUVuuUu(var7, var9, 1.0, var4, false);
      var1.uNNnnnuuuN().UuUVuuUu(var11, var13, 1.0, var4, false);
      var1.uNNnnnuuuN().UuUVuuUu(var12, var14, 1.0, var4, false);
      var1.uNNnnnuuuN().UuUVuuUu(var8, var10, 1.0, var4, false);
   }
}
