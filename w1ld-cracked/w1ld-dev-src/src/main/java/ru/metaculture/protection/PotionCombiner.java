package ru.metaculture.protection;

import java.util.Random;
import java.util.function.Predicate;
import net.minecraft.class_1268;
import net.minecraft.class_1291;
import net.minecraft.class_1293;
import net.minecraft.class_1294;
import net.minecraft.class_1706;
import net.minecraft.class_1713;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_1844;
import net.minecraft.class_2246;
import net.minecraft.class_2248;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_243;
import net.minecraft.class_2855;
import net.minecraft.class_3959;
import net.minecraft.class_3965;
import net.minecraft.class_471;
import net.minecraft.class_6880;
import net.minecraft.class_9334;
import net.minecraft.class_239.class_240;
import net.minecraft.class_3959.class_242;
import net.minecraft.class_3959.class_3960;
import org.wild.mixin.acceser.ClientPlayerInteractionManagerAccessor;
import org.wild.module.api.Module;
import org.wild.module.api.ModuleRegister;

@ModuleRegister(
   UuUVuuUu = "PotionCombiner",
   uUnuvNvvNU = oOOOo0.Misc,
   C00OOC00oO = "Автоматически объединяет зелья в наковальне"
)
public class PotionCombiner extends Module {
   private static final String uNnUnnuNUnNu = "Сила";
   private static final String NnUuNNU = "Скорость";
   private static final String nNvNUVU = "Скорость 3 + Сила 3";
   private static final String UnUNuUU = "Сила 3 + Скорость 3";
   private static final float uUVuVvuNUvnu = 0.92F;
   private static final float UvUvUNuvNU = 0.005F;
   private static final float c0oOOCcCoC0 = 0.02F;
   private static final int VVnVNnunVvu = 6;
   private static final double unNNVVNnvvV = 4.6;
   public final UvNnUnuNUUU NVNnnvnuunNv = new UvNnUnuNUUU("Зелье", "Сила", "Сила", "Скорость", "Скорость 3 + Сила 3", "Сила 3 + Скорость 3");
   public final nNUuNvVn uVunuUNVVUUV = new nNUuNvVn("Уровень", 5.0F, 1.0F, 30.0F, 1.0F, false);
   public final vvNnnUNnVvn UNnVVNvvnVvU = new vvNnnUNnVvn("Экономия опыта", true);
   private final VuNvNNvVV NuunnvnN = new VuNvNNvVV();
   private final VuNvNNvVV NVUunUNUN = new VuNvNNvVV();
   private final VuNvNNvVV UUVNuUNUvUnV = new VuNvNNvVV();
   private final VuNvNNvVV vuvnUnVnUNnV = new VuNvNNvVV();
   private final Random nnuUVNUuvvVU = new Random();
   private boolean nVVUuvuNnUN;
   private int nNnVnUNVV = 8;
   private int nuunNvv = 300;
   private int uUVVvVVNvvn = 220;
   private int vvUVNVvvNUv = -1;
   private int UuNnnVnuNNV = -1;
   private float uUVvnUuNvvN;
   private String UUuUnNVNuuv = "";
   private int NVuNUuVnVUN;

   public PotionCombiner() {
      this.UuUVuuUu(new nvUuvVvuuN[]{this.NVNnnvnuunNv, this.uVunuUNVVUUV, this.UNnVVNvvnVvU});
   }

   @Override
   public void UuUVuuUu() {
      super.UuUVuuUu();
      this.UUuUnNVNuuv = "";
      this.vuvnUnVnUNnV.C00OOC00oO(-10000L);
   }

   @vuVvUNNvVNV
   public void UuUVuuUu(nVunNNvuv var1) {
      if (uUnuvNvvNU.field_1724 == null || uUnuvNvvNU.field_1687 == null || uUnuvNvvNU.field_1761 == null) {
         this.vVvUvVVuuNvV(false);
      } else if (this.nVVUuvuNnUN) {
         this.UvnvNVnnnnNU();
      } else if (uUnuvNvvNU.field_1724.field_7520 < this.UNnVVNvvnVvU()) {
         if (this.NVNnnvnuunNv() != -1) {
            this.vNVuvnUUnuUn();
         } else {
            this.uUnuvNvvNU("§cНет пузырьков опыта. Нужно добить уровень до " + this.UNnVVNvvnVvU() + ".");
         }
      } else if (uUnuvNvvNU.field_1755 instanceof class_471 && uUnuvNvvNU.field_1724.field_7512 instanceof class_1706 var2) {
         this.UuUVuuUu(var2);
      } else {
         if (uUnuvNvvNU.field_1755 == null) {
            this.UuuNnUvUuv();
         }
      }
   }

   private void UuuNnUvUuv() {
      class_2338 var1 = this.uUnuvNvvNU(6);
      if (var1 == null) {
         this.C00OOC00oO("§cНаковальня не найдена в радиусе 6 блоков.");
      } else {
         class_243 var2 = new class_243(var1.method_10263() + 0.5, var1.method_10264() + 0.9, var1.method_10260() + 0.5);
         class_243 var3 = this.UuUVuuUu(var2, 0.02F);
         uuUuvNuNVNVU var4 = this.UuUVuuUu(var3);
         float var5 = 55.0F + this.UuUVuuUu(-2.0F, 2.0F);
         COC0OCc.UuUVuuUu(var4, var5 * 0.92F, var5 * 0.92F, 25.0F, 25.0F, 2, 30, false);
         if (this.UUVNuUNUvUnV.UuUVuuUu((long)this.nNnVnUNVV)) {
            if (!(new uuUuvNuNVNVU(uUnuvNvvNU.field_1724).UuUVuuUu(var4) > 4.0F)) {
               if (this.UuUVuuUu(var3, 4.6) && this.UuUVuuUu(var1, var3)) {
                  class_3965 var6 = new class_3965(this.UuUVuuUu(class_243.method_24953(var1), 0.08F), class_2350.field_11036, var1, false);
                  uUnuvNvvNU.field_1724.method_6104(class_1268.field_5808);
                  uUnuvNvvNU.field_1761.method_2896(uUnuvNvvNU.field_1724, class_1268.field_5808, var6);
                  this.UUVNuUNUvUnV.UuUVuuUu();
                  this.nNnVnUNVV = this.UuUVuuUu(0, 1);
               }
            }
         }
      }
   }

   private void UuUVuuUu(class_1706 var1) {
      if (!this.nuUnNvnuUu(var1)) {
         if (!this.NVUunUNUN.UuUVuuUu((long)this.uUVVvVVNvvn) || !this.uNNnnnuuuN(var1)) {
            this.C00OOC00oO(var1);
            if (uUnuvNvvNU.field_1724.field_7520 < this.UNnVVNvvnVvU()) {
               this.vNVuvnUUnuUn();
            } else {
               if (this.vVvUvVVuuNvV(var1) && var1.method_7611(2).method_7681() && this.NVUunUNUN.UuUVuuUu((long)this.uUVVvVVNvvn)) {
                  if (this.UNnVVNvvnVvU.uUnuvNvvNU()) {
                     this.VVuuUN(var1);
                  }

                  uUnuvNvvNU.field_1761.method_2906(var1.field_7763, 2, 0, class_1713.field_7794, uUnuvNvvNU.field_1724);
                  this.NVUunUNUN.UuUVuuUu();
                  this.uUVVvVVNvvn = this.UuUVuuUu(85, 120);
               }
            }
         }
      }
   }

   private void C00OOC00oO(class_1706 var1) {
      if (this.NVUunUNUN.UuUVuuUu((long)this.uUVVvVVNvvn)) {
         if (this.uNnUnnuNUnNu()) {
            this.uUnuvNvvNU(var1);
         } else {
            for (int var2 = 0; var2 < 2; var2++) {
               class_1799 var3 = this.C00OOC00oO(var1, var2);
               if (!var3.method_7960() && !this.UuUVuuUu(var3)) {
                  this.UuUVuuUu(var1, var2);
                  this.uVunuUNVVUUV();
                  return;
               }
            }

            for (int var4 = 0; var4 < 2; var4++) {
               if (this.C00OOC00oO(var1, var4).method_7960()) {
                  int var5 = this.C00OOC00oO(var1, this::UuUVuuUu);
                  if (var5 != -1) {
                     this.UuUVuuUu(var1, var5, var4);
                     this.uVunuUNVVUUV();
                  }

                  return;
               }
            }
         }
      }
   }

   private void uUnuvNvvNU(class_1706 var1) {
      for (int var2 = 0; var2 < 2; var2++) {
         class_1799 var3 = this.C00OOC00oO(var1, var2);
         if (!var3.method_7960() && !this.UuUVuuUu(var3, var2)) {
            this.UuUVuuUu(var1, var2);
            this.uVunuUNVVUUV();
            return;
         }
      }

      for (int var4 = 0; var4 < 2; var4++) {
         if (this.C00OOC00oO(var1, var4).method_7960()) {
            int var5 = this.C00OOC00oO(var1, this.UuUVuuUu(var4));
            if (var5 != -1) {
               this.UuUVuuUu(var1, var5, var4);
               this.uVunuUNVVUUV();
            }

            return;
         }
      }
   }

   private boolean vVvUvVVuuNvV(class_1706 var1) {
      class_1799 var2 = this.C00OOC00oO(var1, 0);
      class_1799 var3 = this.C00OOC00oO(var1, 1);
      return this.uNnUnnuNUnNu() ? this.UuUVuuUu(var2, 0) && this.UuUVuuUu(var3, 1) : this.UuUVuuUu(var2) && this.UuUVuuUu(var3);
   }

   private boolean uNNnnnuuuN(class_1706 var1) {
      if (this.uNnUnnuNUnNu()) {
         if (this.UuUVuuUu(var1, this::C00OOC00oO) <= 0) {
            this.uUnuvNvvNU("§cНет ингредиента: Скорость III.");
            return true;
         } else if (this.UuUVuuUu(var1, this::uUnuvNvvNU) <= 0) {
            this.uUnuvNvvNU("§cНет ингредиента: Сила III.");
            return true;
         } else {
            return false;
         }
      } else {
         int var2 = this.UuUVuuUu(var1, this::UuUVuuUu);
         if (var2 < 2) {
            this.uUnuvNvvNU("§cНет ингредиента: " + this.nUUVuvU() + " x" + (2 - var2) + ".");
            return true;
         } else {
            return false;
         }
      }
   }

   private boolean nuUnNvnuUu(class_1706 var1) {
      for (int var2 = 0; var2 < 2; var2++) {
         class_1799 var3 = this.C00OOC00oO(var1, var2);
         if (!var3.method_7960() && var3.method_7947() > 1) {
            if (this.NVUunUNUN.UuUVuuUu((long)this.uUVVvVVNvvn)) {
               this.UuUVuuUu(var1, var2);
               this.uVunuUNVVUUV();
            }

            return true;
         }
      }

      return false;
   }

   private int UuUVuuUu(class_1706 var1, Predicate<class_1799> var2) {
      int var3 = 0;

      for (int var4 = 0; var4 < var1.field_7761.size(); var4++) {
         if (var4 != 2) {
            class_1799 var5 = var1.method_7611(var4).method_7677();
            if (var2.test(var5)) {
               var3 += Math.max(1, var5.method_7947());
            }
         }
      }

      return var3;
   }

   private String nUUVuvU() {
      if (this.NVNnnvnuunNv.C00OOC00oO("Сила")) {
         return "Сила II";
      } else {
         return this.NVNnnvnuunNv.C00OOC00oO("Скорость") ? "Скорость II" : "зелье";
      }
   }

   private boolean UuUVuuUu(class_1799 var1) {
      if (this.NVNnnvnuunNv.C00OOC00oO("Сила")) {
         return this.UuUVuuUu(var1, class_1294.field_5910, 2);
      } else {
         return this.NVNnnvnuunNv.C00OOC00oO("Скорость") ? this.UuUVuuUu(var1, class_1294.field_5904, 2) : this.C00OOC00oO(var1) || this.uUnuvNvvNU(var1);
      }
   }

   private boolean UuUVuuUu(class_1799 var1, int var2) {
      return this.C00OOC00oO(var2) ? this.C00OOC00oO(var1) : this.uUnuvNvvNU(var1);
   }

   private Predicate<class_1799> UuUVuuUu(int var1) {
      return this.C00OOC00oO(var1) ? this::C00OOC00oO : this::uUnuvNvvNU;
   }

   private boolean C00OOC00oO(int var1) {
      boolean var2 = this.NVNnnvnuunNv.C00OOC00oO("Скорость 3 + Сила 3");
      return var1 == 0 ? var2 : !var2;
   }

   private boolean UuUVuuUu(class_1799 var1, class_6880<class_1291> var2, int var3) {
      if (!this.vVvUvVVuuNvV(var1)) {
         return false;
      } else {
         class_1844 var4 = (class_1844)var1.method_58694(class_9334.field_49651);
         if (var4 == null) {
            return false;
         } else {
            for (class_1293 var6 : var4.method_57397()) {
               if (var6.method_5579().equals(var2) && var6.method_5578() == var3 - 1) {
                  return true;
               }
            }

            return false;
         }
      }
   }

   private boolean C00OOC00oO(class_1799 var1) {
      return this.UuUVuuUu(var1, class_1294.field_5904, 3) && !this.UuUVuuUu(var1, class_1294.field_5910, 3);
   }

   private boolean uUnuvNvvNU(class_1799 var1) {
      return this.UuUVuuUu(var1, class_1294.field_5910, 3) && !this.UuUVuuUu(var1, class_1294.field_5904, 3);
   }

   private boolean vVvUvVVuuNvV(class_1799 var1) {
      return var1 != null
         && !var1.method_7960()
         && (var1.method_31574(class_1802.field_8574) || var1.method_31574(class_1802.field_8436) || var1.method_31574(class_1802.field_8150));
   }

   private int C00OOC00oO(class_1706 var1, Predicate<class_1799> var2) {
      for (int var3 = 3; var3 < var1.field_7761.size(); var3++) {
         class_1799 var4 = var1.method_7611(var3).method_7677();
         if (var2.test(var4)) {
            return var3;
         }
      }

      return -1;
   }

   private void UuUVuuUu(class_1706 var1, int var2, int var3) {
      uUnuvNvvNU.field_1761.method_2906(var1.field_7763, var2, 0, class_1713.field_7790, uUnuvNvvNU.field_1724);
      uUnuvNvvNU.field_1761.method_2906(var1.field_7763, var3, 1, class_1713.field_7790, uUnuvNvvNU.field_1724);
      uUnuvNvvNU.field_1761.method_2906(var1.field_7763, var2, 0, class_1713.field_7790, uUnuvNvvNU.field_1724);
   }

   private void UuUVuuUu(class_1706 var1, int var2) {
      uUnuvNvvNU.field_1761.method_2906(var1.field_7763, var2, 0, class_1713.field_7794, uUnuvNvvNU.field_1724);
   }

   private void VVuuUN(class_1706 var1) {
      if (uUnuvNvvNU.field_1724 != null && uUnuvNvvNU.field_1724.field_3944 != null) {
         String var2 = this.vNUvnnVnUvu(var1);

         for (int var3 = 0; var3 < 10; var3++) {
            String var4 = var3 % 2 == 0 ? var2 + this.UnUNVVVNuv() : var2;
            var1.method_7625(var4);
            uUnuvNvvNU.field_1724.field_3944.method_52787(new class_2855(var4));
         }
      }
   }

   private String vNUvnnVnUvu(class_1706 var1) {
      class_1799 var2 = this.C00OOC00oO(var1, 0);
      if (!var2.method_7960()) {
         return this.UuUVuuUu(var2.method_7964().getString());
      } else {
         class_1799 var3 = this.C00OOC00oO(var1, 2);
         return !var3.method_7960() ? this.UuUVuuUu(var3.method_7964().getString()) : "Potion";
      }
   }

   private String UnUNVVVNuv() {
      this.NVuNUuVnVUN++;
      return "_" + Integer.toString(this.NVuNUuVnVUN, 36) + Integer.toString(this.nnuUVNUuvvVU.nextInt(1296), 36);
   }

   private String UuUVuuUu(String var1) {
      if (var1 != null && !var1.isBlank()) {
         return var1.length() > 32 ? var1.substring(0, 32) : var1;
      } else {
         return "Potion";
      }
   }

   private class_1799 C00OOC00oO(class_1706 var1, int var2) {
      return var1 != null && var2 >= 0 && var2 < var1.field_7761.size() ? var1.method_7611(var2).method_7677() : class_1799.field_8037;
   }

   private void vNVuvnUUnuUn() {
      this.nVVUuvuNnUN = true;
      this.vvUVNVvvNUv = uUnuvNvvNU.field_1724.method_31548().method_67532();
      this.uUVvnUuNvvN = uUnuvNvvNU.field_1724.method_36455();
      this.NuunnvnN.UuUVuuUu();
   }

   private void UvnvNVnnnnNU() {
      if (uUnuvNvvNU.field_1724.field_7520 >= this.UNnVVNvvnVvU()) {
         this.uUnuvNvvNU(true);
      } else if (uUnuvNvvNU.field_1755 != null) {
         uUnuvNvvNU.field_1724.method_7346();
      } else {
         float var1 = 87.0F + this.UuUVuuUu(-0.7F, 0.7F);
         uUnuvNvvNU.field_1724.method_36457(C00OOC00oO(var1));
         if (!this.uVUVnuvnuVuv()) {
            this.uUnuvNvvNU(true);
            this.uUnuvNvvNU("§cНет пузырьков опыта. Нужно добить уровень до " + this.UNnVVNvvnVvU() + ".");
         } else if (this.NuunnvnN.UuUVuuUu((long)this.nuunNvv)) {
            uUnuvNvvNU.field_1761.method_2919(uUnuvNvvNU.field_1724, class_1268.field_5808);
            uUnuvNvvNU.field_1724.method_6104(class_1268.field_5808);
            this.NuunnvnN.UuUVuuUu();
            this.nuunNvv = this.UuUVuuUu(50, 70);
         }
      }
   }

   private boolean uVUVnuvnuVuv() {
      if (uUnuvNvvNU.field_1724.method_6047().method_31574(class_1802.field_8287)) {
         return true;
      } else {
         int var1 = this.NVNnnvnuunNv();
         if (var1 == -1) {
            return false;
         } else if (var1 >= 36 && var1 <= 44) {
            uUnuvNvvNU.field_1724.method_31548().method_61496(var1 - 36);
            ((ClientPlayerInteractionManagerAccessor)uUnuvNvvNU.field_1761).invokeSyncSelectedSlot();
            return true;
         } else {
            if (this.vvUVNVvvNUv < 0) {
               this.vvUVNVvvNUv = uUnuvNvvNU.field_1724.method_31548().method_67532();
            }

            this.UuNnnVnuNNV = var1;
            uUnuvNvvNU.field_1761
               .method_2906(uUnuvNvvNU.field_1724.field_7498.field_7763, var1, this.vvUVNVvvNUv, class_1713.field_7791, uUnuvNvvNU.field_1724);
            ((ClientPlayerInteractionManagerAccessor)uUnuvNvvNU.field_1761).invokeSyncSelectedSlot();
            return true;
         }
      }
   }

   private int NVNnnvnuunNv() {
      if (uUnuvNvvNU.field_1724 == null) {
         return -1;
      } else {
         for (int var1 = 9; var1 <= 44; var1++) {
            if (uUnuvNvvNU.field_1724.field_7498.method_7611(var1).method_7677().method_31574(class_1802.field_8287)) {
               return var1;
            }
         }

         return -1;
      }
   }

   private void uUnuvNvvNU(boolean var1) {
      if (var1 && uUnuvNvvNU.field_1724 != null && uUnuvNvvNU.field_1761 != null) {
         if (this.UuNnnVnuNNV != -1 && this.vvUVNVvvNUv >= 0) {
            uUnuvNvvNU.field_1761
               .method_2906(uUnuvNvvNU.field_1724.field_7498.field_7763, this.UuNnnVnuNNV, this.vvUVNVvvNUv, class_1713.field_7791, uUnuvNvvNU.field_1724);
         }

         if (this.vvUVNVvvNUv >= 0) {
            uUnuvNvvNU.field_1724.method_31548().method_61496(this.vvUVNVvvNUv);
            ((ClientPlayerInteractionManagerAccessor)uUnuvNvvNU.field_1761).invokeSyncSelectedSlot();
         }

         uUnuvNvvNU.field_1724.method_36457(this.uUVvnUuNvvN);
      }

      this.nVVUuvuNnUN = false;
      this.UuNnnVnuNNV = -1;
      this.vvUVNVvvNUv = -1;
   }

   private class_2338 uUnuvNvvNU(int var1) {
      class_2338 var2 = uUnuvNvvNU.field_1724.method_24515();
      class_243 var3 = uUnuvNvvNU.field_1724.method_33571();
      class_2338 var4 = null;
      double var5 = Double.MAX_VALUE;

      for (int var7 = -var1; var7 <= var1; var7++) {
         for (int var8 = -2; var8 <= 2; var8++) {
            for (int var9 = -var1; var9 <= var1; var9++) {
               class_2338 var10 = var2.method_10069(var7, var8, var9);
               class_2248 var11 = uUnuvNvvNU.field_1687.method_8320(var10).method_26204();
               if (this.UuUVuuUu(var11)) {
                  class_243 var12 = new class_243(var10.method_10263() + 0.5, var10.method_10264() + 0.9, var10.method_10260() + 0.5);
                  double var13 = var3.method_1025(var12);
                  if (var13 < var5) {
                     var5 = var13;
                     var4 = var10.method_10062();
                  }
               }
            }
         }
      }

      return var4;
   }

   private boolean UuUVuuUu(class_2248 var1) {
      return var1 == class_2246.field_10535 || var1 == class_2246.field_10105 || var1 == class_2246.field_10414;
   }

   private boolean UuUVuuUu(class_2338 var1, class_243 var2) {
      class_243 var3 = uUnuvNvvNU.field_1724.method_33571();
      class_3965 var4 = uUnuvNvvNU.field_1687.method_17742(new class_3959(var3, var2, class_3960.field_17559, class_242.field_1348, uUnuvNvvNU.field_1724));
      return var4.method_17783() == class_240.field_1332 && var4.method_17777().equals(var1);
   }

   private boolean UuUVuuUu(class_243 var1, double var2) {
      return uUnuvNvvNU.field_1724.method_33571().method_1025(var1) <= var2 * var2;
   }

   private uuUuvNuNVNVU UuUVuuUu(class_243 var1) {
      class_243 var2 = uUnuvNvvNU.field_1724.method_33571();
      double var3 = var1.field_1352 - var2.field_1352;
      double var5 = var1.field_1351 - var2.field_1351;
      double var7 = var1.field_1350 - var2.field_1350;
      double var9 = Math.hypot(var3, var7);
      float var11 = (float)Math.toDegrees(Math.atan2(var7, var3)) - 90.0F;
      float var12 = (float)(-Math.toDegrees(Math.atan2(var5, var9)));
      var11 += this.UuUVuuUu(-0.03F, 0.03F);
      var12 += this.UuUVuuUu(-0.03F, 0.03F);
      return new uuUuvNuNVNVU(UuUVuuUu(var11), C00OOC00oO(var12));
   }

   private class_243 UuUVuuUu(class_243 var1, float var2) {
      return new class_243(
         var1.field_1352 + this.UuUVuuUu(-var2, var2), var1.field_1351 + this.UuUVuuUu(-var2 * 0.5F, var2 * 0.5F), var1.field_1350 + this.UuUVuuUu(-var2, var2)
      );
   }

   private void uVunuUNVVUUV() {
      this.NVUunUNUN.UuUVuuUu();
      this.uUVVvVVNvvn = this.UuUVuuUu(85, 120);
   }

   private void C00OOC00oO(String var1) {
      if (var1 != null && !var1.isBlank()) {
         if (!var1.equals(this.UUuUnNVNuuv) || this.vuvnUnVnUNnV.UuUVuuUu(2500L)) {
            vVnvuVVUunuv.UuUVuuUu("§8[§dPotionCombiner§8] §f" + var1);
            this.UUuUnNVNuuv = var1;
            this.vuvnUnVnUNnV.UuUVuuUu();
         }
      }
   }

   private void uUnuvNvvNU(String var1) {
      this.C00OOC00oO(var1);
      if (this.nuUnNvnuUu) {
         this.a_();
      }
   }

   private int UNnVVNvvnVvU() {
      return Math.max(1, Math.round(this.uVunuUNVVUUV.uUnuvNvvNU()));
   }

   private boolean uNnUnnuNUnNu() {
      return this.NVNnnvnuunNv.C00OOC00oO("Скорость 3 + Сила 3") || this.NVNnnvnuunNv.C00OOC00oO("Сила 3 + Скорость 3");
   }

   private float UuUVuuUu(float var1, float var2) {
      return var1 + (var2 - var1) * this.nnuUVNUuvvVU.nextFloat();
   }

   private int UuUVuuUu(int var1, int var2) {
      return var1 + this.nnuUVNUuvvVU.nextInt(Math.max(1, var2 - var1 + 1));
   }

   private static float UuUVuuUu(float var0) {
      var0 %= 360.0F;
      if (var0 >= 180.0F) {
         var0 -= 360.0F;
      }

      if (var0 < -180.0F) {
         var0 += 360.0F;
      }

      return var0;
   }

   private static float C00OOC00oO(float var0) {
      return Math.max(-90.0F, Math.min(90.0F, var0));
   }

   private void vVvUvVVuuNvV(boolean var1) {
      this.uUnuvNvvNU(var1);
      COC0OCc.UuUVuuUu = COC0OCc.VvunVVUvUNnv.IDLE;
      COC0OCc.nuUnNvnuUu = 0;
      COC0OCc.uVUuuVnNVU = null;
      NNvvnnunn.UuUVuuUu = false;
   }

   @Override
   public void C00OOC00oO() {
      this.vVvUvVVuuNvV(true);
      super.C00OOC00oO();
   }
}
