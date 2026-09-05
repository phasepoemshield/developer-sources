package ru.metaculture.protection;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ThreadLocalRandom;
import net.minecraft.class_10055;
import net.minecraft.class_1657;
import net.minecraft.class_1921;
import net.minecraft.class_2394;
import net.minecraft.class_2398;
import net.minecraft.class_243;
import net.minecraft.class_2663;
import net.minecraft.class_2960;
import net.minecraft.class_3532;
import net.minecraft.class_4184;
import net.minecraft.class_4587;
import net.minecraft.class_4588;
import net.minecraft.class_4597;
import net.minecraft.class_4608;
import net.minecraft.class_5498;
import net.minecraft.class_5599;
import net.minecraft.class_5600;
import net.minecraft.class_5602;
import net.minecraft.class_591;
import net.minecraft.class_630;
import net.minecraft.class_742;
import net.minecraft.class_7833;
import net.minecraft.class_9848;
import net.minecraft.class_4597.class_4598;
import net.minecraft.class_8685.class_7920;
import org.joml.Matrix4f;
import org.wild.module.api.Module;
import org.wild.module.api.ModuleRegister;

@ModuleRegister(
   UuUVuuUu = "DeadEffect",
   C00OOC00oO = "Плавный выход души из модели игрока при потере тотема или смерти.",
   uUnuvNvvNU = oOOOo0.Visuals
)
public final class DeadEffect extends Module {
   private static final String NVNnnvnuunNv = "Тотем";
   private static final String uVunuUNVVUUV = "Смерть";
   private static final String UNnVVNvvnVvU = "Себя";
   private static final String uNnUnnuNUnNu = "Игроки";
   private static final long NnUuNNU = 180000000L;
   private static final long nNvNUVU = 700000000L;
   private static final long UnUNuUU = 5000000000L;
   private static final float uUVuVvuNUvnu = (float) (Math.PI * 2);
   private static final int UvUvUNuvNU = 96;
   private static final int c0oOOCcCoC0 = 36;
   private final VUVnvvnNN VVnVNnunVvu = new VUVnvvnNN("События", new vvNnnUNnVvn("Тотем", true), new vvNnnUNnVvn("Смерть", true));
   private final VUVnvvnNN unNNVVNnvvV = new VUVnvvnNN("Цели", new vvNnnUNnVvn("Себя", true), new vvNnnUNnVvn("Игроки", true));
   private final nNUuNvVn NuunnvnN = new nNUuNvVn("Длительность", 1.65F, 0.55F, 4.0F, 0.05F, false);
   private final nNUuNvVn NVUunUNUN = new nNUuNvVn("Подъём", 1.85F, 0.6F, 4.0F, 0.05F, false);
   private final nNUuNvVn UUVNuUNUvUnV = new nNUuNvVn("Прозрачность", 0.74F, 0.15F, 1.0F, 0.01F, true);
   private final nNUuNvVn vuvnUnVnUNnV = new nNUuNvVn("Свечение", 1.15F, 0.0F, 2.4F, 0.05F, false);
   private final nNUuNvVn nnuUVNUuvvVU = new nNUuNvVn("Частицы", 34.0F, 0.0F, 90.0F, 1.0F, false);
   private final VnnUvVNuNuVv nVVUuvuNnUN = new VnnUvVNuNuVv("Цвет тотема", 31.0F, 0.82F, 1.0F);
   private final VnnUvVNuNuVv nNnVnUNVV = new VnnUvVNuNuVv("Цвет смерти", 74.0F, 0.68F, 1.0F);
   private final Map<Integer, DeadEffect.nvUnvV> nuunNvv = new ConcurrentHashMap<>();
   private final Map<Integer, DeadEffect.VvunVVUvUNnv> uUVVvVVNvvn = new ConcurrentHashMap<>();
   private final Set<Integer> vvUVNVvvNUv = ConcurrentHashMap.newKeySet();
   private class_5599 UuNnnVnuNNV;
   private class_591 uUVvnUuNvvN;
   private class_591 UUuUnNVNuuv;
   private DeadEffect.VvunVVUvUNnv NVuNUuVnVUN;
   private DeadEffect.VvunVVUvUNnv NVuunNnvvvVu;

   public DeadEffect() {
      this.UuUVuuUu(
         new nvUuvVvuuN[]{
            this.VVnVNnunVvu,
            this.unNNVVNnvvV,
            this.NuunnvnN,
            this.NVUunUNUN,
            this.UUVNuUNUvUnV,
            this.vuvnUnVnUNnV,
            this.nnuUVNUuvvVU,
            this.nVVUuvuNnUN,
            this.nNnVnUNVV
         }
      );
   }

   @Override
   public void UuUVuuUu() {
      this.nuunNvv.clear();
      this.uUVVvVVNvvn.clear();
      this.vvUVNVvvNUv.clear();
      super.UuUVuuUu();
   }

   @Override
   public void C00OOC00oO() {
      this.nuunNvv.clear();
      this.uUVVvVVNvvn.clear();
      this.vvUVNVvvNUv.clear();
      super.C00OOC00oO();
   }

   @vuVvUNNvVNV
   public void UuUVuuUu(coOCCcooOcOO var1) {
      this.nuunNvv.clear();
      this.uUVVvVVNvvn.clear();
      this.vvUVNVvvNUv.clear();
   }

   @vuVvUNNvVNV
   public void UuUVuuUu(uvUUuvnunU var1) {
      if (uUnuvNvvNU.field_1687 != null && var1 != null && !var1.uUnuvNvvNU()) {
         if (var1.vVvUvVVuuNvV() instanceof class_2663 var2) {
            if (var2.method_11469(uUnuvNvvNU.field_1687) instanceof class_1657 var4 && this.UuUVuuUu(var4)) {
               byte var5 = var2.method_11470();
               if (var5 == 35 && this.VVnVNnunVvu.C00OOC00oO("Тотем")) {
                  this.UuUVuuUu(var4, DeadEffect.NVnVnNnN.TOTEM);
               } else if (var5 == 3 && this.VVnVNnunVvu.C00OOC00oO("Смерть") && C00OOC00oO(var4)) {
                  this.UuUVuuUu(var4, DeadEffect.NVnVnNnN.DEATH);
               }
            }
         }
      }
   }

   @vuVvUNNvVNV
   public void UuUVuuUu(nVunNNvuv var1) {
      if (uUnuvNvvNU.field_1687 != null && uUnuvNvvNU.field_1724 != null) {
         long var2 = System.nanoTime();
         this.UuUVuuUu(var2);

         for (class_1657 var5 : uUnuvNvvNU.field_1687.method_18456()) {
            if (this.UuUVuuUu(var5)) {
               int var6 = var5.method_5628();
               if (C00OOC00oO(var5)) {
                  if (this.vvUVNVvvNUv.add(var6) && this.VVnVNnunVvu.C00OOC00oO("Смерть")) {
                     this.UuUVuuUu(var5, DeadEffect.NVnVnNnN.DEATH);
                  }
               } else {
                  this.vvUVNVvvNUv.remove(var6);
               }
            }
         }
      } else {
         this.nuunNvv.clear();
         this.vvUVNVvvNUv.clear();
      }
   }

   public static void UuUVuuUu(class_10055 var0, class_591 var1, class_4587 var2, class_4597 var3, int var4, int var5) {
      DeadEffect var6 = UuuNnUvUuv();
      if (var6 != null) {
         var6.UuUVuuUu(var0, var1);
      }
   }

   private void UuUVuuUu(class_10055 var1, class_591 var2) {
      if (this.nuUnNvnuUu && var1 != null && var2 != null && var1.field_53520 != null) {
         if (!var1.field_53542 && !var1.field_53333 && !var1.field_53461) {
            DeadEffect.VvunVVUvUNnv var3 = DeadEffect.VvunVVUvUNnv.capture(var2, System.nanoTime());
            this.uUVVvVVNvvn.put(var1.field_53528, var3);
            DeadEffect.nvUnvV var4 = this.nuunNvv.get(var1.field_53528);
            if (var4 != null) {
               if (var4.vVvUvVVuuNvV == null) {
                  var4.vVvUvVVuuNvV = var3;
               }

               if (var4.uNNnnnuuuN == null) {
                  var4.uNNnnnuuuN = DeadEffect.uunvUUVnuNn.fromState(var1);
               }

               if (var4.nuUnNvnuUu == null) {
                  var4.nuUnNvnuUu = var1.field_53520.comp_1626();
               }

               var4.VVuuUN = UuUVuuUu(var1);
            }
         }
      }
   }

   @vuVvUNNvVNV
   public void UuUVuuUu(VvuuvuVVvvn var1) {
      if (this.nuUnNvnuUu && uUnuvNvvNU.field_1687 != null && uUnuvNvvNU.field_1724 != null && var1 != null && !this.nuunNvv.isEmpty()) {
         long var2 = System.nanoTime();
         this.UuUVuuUu(var2);
         if (!this.nuunNvv.isEmpty()) {
            class_4598 var4 = nNNnNvVVv.UuUVuuUu();

            try {
               for (Entry var6 : this.nuunNvv.entrySet()) {
                  int var7 = (Integer)var6.getKey();
                  if (var7 != uUnuvNvvNU.field_1724.method_5628()
                     || uUnuvNvvNU.field_1690 == null
                     || uUnuvNvvNU.field_1690.method_31044() != class_5498.field_26664) {
                     DeadEffect.nvUnvV var8 = (DeadEffect.nvUnvV)var6.getValue();
                     if (!this.UuUVuuUu(var8, var1.uUnuvNvvNU(), var4, var2)) {
                        this.nuunNvv.remove(var7, var8);
                     }
                  }
               }
            } finally {
               nNNnNvVVv.C00OOC00oO();
            }
         }
      }
   }

   private boolean UuUVuuUu(DeadEffect.nvUnvV var1, class_4587 var2, class_4597 var3, long var4) {
      if (var1 != null && var2 != null && var3 != null && var1.uNNnnnuuuN != null) {
         float var6 = (float)(var4 - var1.C00OOC00oO) / 1.0E9F;
         float var7 = this.C00OOC00oO(var1.UuUVuuUu);
         float var8 = this.UuUVuuUu(var1.UuUVuuUu);
         if (var6 >= var8) {
            return false;
         } else {
            float var9 = C00OOC00oO(var6 / var8);
            float var10 = C00OOC00oO(var6 / var7);
            float var11 = UuUVuuUu(var7 * 0.58F, var8, var6);
            float var12 = UuUVuuUu(0.0F, 0.11F, var9);
            float var13 = 1.0F - var11;
            float var14 = C00OOC00oO(var12 * var13 * this.UUVNuUNUvUnV.uUnuvNvvNU());
            if (var14 <= 0.002F) {
               return true;
            } else {
               float var15 = UuUVuuUu(var10);
               float var16 = this.NVUunUNUN.uUnuvNvvNU() * var1.UuUVuuUu.uUnuvNvvNU * (var15 + var11 * 0.075F);
               float var17 = var1.uUnuvNvvNU + var6 * 2.15F;
               float var18 = (float)Math.sin(var17 * 1.7F) * (0.025F + var11 * 0.045F) * var15;
               float var19 = (float)Math.cos(var17 * 1.3F) * (0.025F + var11 * 0.045F) * var15;
               float var20 = 1.0F + (float)Math.sin(var9 * Math.PI * 3.0) * 0.022F * (1.0F - var9);
               float var21 = (var20 + var1.UuUVuuUu.vVvUvVVuuNvV * var15) * (1.0F + var11 * 0.055F);
               int var22 = this.uUnuvNvvNU(var1.UuUVuuUu);
               this.UuUVuuUu(var2, var3, var1, var9, var14, var16, var17, var11);
               class_2960 var23 = var1.nuUnNvnuUu;
               if (var23 == null) {
                  return true;
               } else {
                  class_591 var24 = this.uUnuvNvvNU(var1.VVuuUN);
                  if (var24 == null) {
                     return true;
                  } else {
                     class_1921 var25 = class_1921.method_42600(var23);
                     int var26 = UuUVuuUu(UuUVuuUu(16777215, var22, var1.UuUVuuUu.uVUuuVnNVU), var14 * var1.UuUVuuUu.vNUvnnVnUvu * (1.0F - var11 * 0.22F));
                     DeadEffect.VvunVVUvUNnv var27 = var1.vVvUvVVuuNvV != null ? var1.vVvUvVVuuNvV : this.vVvUvVVuuNvV(var1.VVuuUN);
                     if (var27 != null) {
                        var27.apply(var24);
                     }

                     this.UuUVuuUu(var24, var2, var3, var25, var1.uNNnnnuuuN, 15728880, class_4608.field_21444, var18, var16, var19, var21, var26);
                     return true;
                  }
               }
            }
         }
      } else {
         return false;
      }
   }

   private void UuUVuuUu(
      class_591 var1,
      class_4587 var2,
      class_4597 var3,
      class_1921 var4,
      DeadEffect.uunvUUVnuNn var5,
      int var6,
      int var7,
      float var8,
      float var9,
      float var10,
      float var11,
      int var12
   ) {
      if ((var12 >>> 24 & 0xFF) != 0) {
         var2.method_22903();
         this.UuUVuuUu(var2, var5, var8, var9, var10, var11);
         class_4588 var13 = var3.getBuffer(var4);
         var1.method_62100(var2, var13, var6, var7, var12);
         var2.method_22909();
         if (var3 instanceof class_4598 var14) {
            var14.method_22994(var4);
         }
      }
   }

   private void UuUVuuUu(class_4587 var1, DeadEffect.uunvUUVnuNn var2, float var3, float var4, float var5, float var6) {
      class_4184 var7 = uUnuvNvvNU.field_1773.method_19418();
      class_243 var8 = var7 == null ? class_243.field_1353 : var7.method_19326();
      var1.method_22904(var2.x - var8.field_1352 + var3, var2.y - var8.field_1351 + var4, var2.z - var8.field_1350 + var5);
      var1.method_22905(var2.baseScale, var2.baseScale, var2.baseScale);
      var1.method_22907(class_7833.field_40716.rotationDegrees(180.0F - var2.bodyYaw));
      var1.method_22905(-var6, -var6, var6);
      var1.method_46416(0.0F, -1.501F, 0.0F);
   }

   private class_591 uUnuvNvvNU(boolean var1) {
      if (this.UuNnnVnuNNV == null) {
         this.UuNnnVnuNNV = new class_5599(class_5600.method_32073());
      }

      if (var1) {
         if (this.UUuUnNVNuuv == null) {
            this.UUuUnNVNuuv = new class_591(this.UuNnnVnuNNV.method_32072(class_5602.field_27581), true);
            this.NVuunNnvvvVu = DeadEffect.VvunVVUvUNnv.capture(this.UUuUnNVNuuv, 0L);
         }

         return this.UUuUnNVNuuv;
      } else {
         if (this.uUVvnUuNvvN == null) {
            this.uUVvnUuNvvN = new class_591(this.UuNnnVnuNNV.method_32072(class_5602.field_27577), false);
            this.NVuNUuVnVUN = DeadEffect.VvunVVUvUNnv.capture(this.uUVvnUuNvvN, 0L);
         }

         return this.uUVvnUuNvvN;
      }
   }

   private DeadEffect.VvunVVUvUNnv vVvUvVVuuNvV(boolean var1) {
      this.uUnuvNvvNU(var1);
      return var1 ? this.NVuunNnvvvVu : this.NVuNUuVnVUN;
   }

   private void UuUVuuUu(class_1657 var1, DeadEffect.NVnVnNnN var2) {
      if (var1 != null && this.UuUVuuUu(var1)) {
         int var3 = var1.method_5628();
         long var4 = System.nanoTime();
         DeadEffect.nvUnvV var6 = this.nuunNvv.get(var3);
         if (var6 == null || var6.UuUVuuUu != var2 || var4 - var6.C00OOC00oO >= 180000000L) {
            DeadEffect.VvunVVUvUNnv var7 = this.uUVVvVVNvvn.get(var3);
            if (var7 != null && var4 - var7.capturedNanos > 700000000L) {
               var7 = null;
            }

            this.nuunNvv
               .put(
                  var3,
                  new DeadEffect.nvUnvV(
                     var2,
                     var4,
                     (float)(ThreadLocalRandom.current().nextDouble() * Math.PI * 2.0),
                     var7,
                     DeadEffect.uunvUUVnuNn.fromPlayer(var1),
                     uUnuvNvvNU(var1),
                     vVvUvVVuuNvV(var1)
                  )
               );
            if (this.nnuUVNUuvvVU.uUnuvNvvNU() > 0.5F) {
               double var8 = var1.method_23317();
               double var10 = var1.method_23318();
               double var12 = var1.method_23321();
               double var14 = Math.max(1.0, (double)var1.method_17682());
               uUnuvNvvNU.execute(() -> this.UuUVuuUu(var8, var10, var12, var14, var2));
            }
         }
      }
   }

   private void UuUVuuUu(double var1, double var3, double var5, double var7, DeadEffect.NVnVnNnN var9) {
      if (uUnuvNvvNU.field_1713 != null) {
         ThreadLocalRandom var10 = ThreadLocalRandom.current();
         int var11 = Math.max(0, Math.round(this.nnuUVNUuvvVU.uUnuvNvvNU()));

         for (int var12 = 0; var12 < var11; var12++) {
            double var13 = var10.nextDouble(Math.PI * 2);
            double var15 = var10.nextDouble(0.08, 0.56);
            double var17 = var1 + Math.cos(var13) * var15;
            double var19 = var3 + var10.nextDouble(0.08, var7 + 0.42);
            double var21 = var5 + Math.sin(var13) * var15;
            double var23 = var10.nextDouble(0.018, 0.07);
            double var25 = Math.cos(var13) * var23;
            double var27 = var10.nextDouble(0.045, 0.145) * var9.nUUVuvU;
            double var29 = Math.sin(var13) * var23;
            uUnuvNvvNU.field_1713.method_3056(var9.UuUVuuUu(var12), var17, var19, var21, var25, var27, var29);
         }
      }
   }

   private void UuUVuuUu(long var1) {
      Iterator var3 = this.nuunNvv.entrySet().iterator();

      while (var3.hasNext()) {
         Entry var4 = (Entry)var3.next();
         DeadEffect.nvUnvV var5 = (DeadEffect.nvUnvV)var4.getValue();
         float var6 = this.UuUVuuUu(var5.UuUVuuUu) + 0.25F;
         if ((float)(var1 - var5.C00OOC00oO) > var6 * 1.0E9F) {
            var3.remove();
         }
      }

      this.uUVVvVVNvvn.entrySet().removeIf(var2 -> var1 - var2.getValue().capturedNanos > 5000000000L);
   }

   private void UuUVuuUu(class_4587 var1, class_4597 var2, DeadEffect.nvUnvV var3, float var4, float var5, float var6, float var7, float var8) {
      if (var1 != null && var3.uNNnnnuuuN != null && !(var5 <= 0.01F) && uUnuvNvvNU.field_1773 != null) {
         class_4184 var9 = uUnuvNvvNU.field_1773.method_19418();
         if (var9 != null) {
            class_1921 var10 = OOcCooOcCcO.uUnuvNvvNU();
            class_4588 var11 = var2.getBuffer(var10);
            Matrix4f var12 = var1.method_23760().method_23761();
            class_243 var13 = var9.method_19326();
            DeadEffect.uunvUUVnuNn var14 = var3.uNNnnnuuuN;
            float var15 = (float)(var14.x - var13.field_1352);
            float var16 = (float)(var14.y - var13.field_1351);
            float var17 = (float)(var14.z - var13.field_1350);
            this.UuUVuuUu(var11, var12, var3, var15, var16, var17, var4, var5, var6);
            this.UuUVuuUu(var11, var12, var3, var15, var16, var17, var4, var5, var6, var7);
            this.C00OOC00oO(var11, var12, var3, var15, var16, var17, var4, var5, var6);
            this.UuUVuuUu(var11, var12, var3, var15, var16, var17, var4, var5, var6, var7, var8);
            if (var2 instanceof class_4598 var18) {
               var18.method_22994(var10);
            }
         }
      }
   }

   private void UuUVuuUu(class_4588 var1, Matrix4f var2, DeadEffect.nvUnvV var3, float var4, float var5, float var6, float var7, float var8, float var9) {
      for (int var10 = 0; var10 < 3; var10++) {
         float var11 = uUnuvNvvNU(var7 * (1.22F + var3.UuUVuuUu.UuuNnUvUuv) + var10 * 0.31F);
         float var12 = (1.0F - var11) * UuUVuuUu(0.0F, 0.18F, var11);
         float var13 = var3.UuUVuuUu.vuuuNvNuv + var11 * var3.UuUVuuUu.nvUVNnuu;
         float var14 = 0.02F + (1.0F - var11) * 0.045F;
         float var15 = var5 + 0.08F + var9 * (0.1F + var10 * 0.075F) + var10 * 0.16F;
         int var16 = UuUVuuUu(UuUVuuUu(this.uUnuvNvvNU(var3.UuUVuuUu), var3.UuUVuuUu.UnUNVVVNuv, 0.35F + var10 * 0.18F), var8 * var12 * 0.74F);
         this.UuUVuuUu(var1, var2, var4, var15, var6, var13, var14, var16);
      }
   }

   private void UuUVuuUu(
      class_4588 var1, Matrix4f var2, DeadEffect.nvUnvV var3, float var4, float var5, float var6, float var7, float var8, float var9, float var10
   ) {
      float var11 = 1.38F + var9 * 0.72F;

      for (int var12 = 0; var12 < 2; var12++) {
         float var13 = var12 == 0 ? 1.0F : -1.0F;
         int var14 = var12 == 0 ? var3.UuUVuuUu.UvnvNVnnnnNU : var3.UuUVuuUu.uVUVnuvnuVuv;

         for (int var15 = 0; var15 < 36; var15++) {
            float var16 = var15 / 36.0F;
            float var17 = (var15 + 1) / 36.0F;
            float var18 = var10 + var13 * (var16 * (float) (Math.PI * 2) * 1.72F + var7 * (float) (Math.PI * 2) * 1.15F);
            float var19 = var10 + var13 * (var17 * (float) (Math.PI * 2) * 1.72F + var7 * (float) (Math.PI * 2) * 1.15F);
            float var20 = 0.34F + 0.13F * (float)Math.sin(var16 * Math.PI + var7 * 3.0F);
            float var21 = 0.34F + 0.13F * (float)Math.sin(var17 * Math.PI + var7 * 3.0F);
            float var22 = 0.032F + 0.018F * (1.0F - var7);
            float var23 = var5 + 0.12F + var16 * var11;
            float var24 = var5 + 0.12F + var17 * var11;
            float var25 = (float)Math.sin(var16 * Math.PI) * (1.0F - UuUVuuUu(0.86F, 1.0F, var7));
            int var26 = UuUVuuUu(UuUVuuUu(var14, var3.UuUVuuUu.vNVuvnUUnuUn, var16), var8 * var25 * 0.54F);
            int var27 = UuUVuuUu(UuUVuuUu(var14, var3.UuUVuuUu.vNVuvnUUnuUn, var17), var8 * var25 * 0.54F);
            this.UuUVuuUu(var1, var2, var4, var6, var23, var24, var18, var19, var20, var21, var22, var26, var27);
         }
      }
   }

   private void C00OOC00oO(class_4588 var1, Matrix4f var2, DeadEffect.nvUnvV var3, float var4, float var5, float var6, float var7, float var8, float var9) {
      float var10 = var5 + 0.08F + var9 * 0.08F;
      float var11 = var5 + 1.7F + var9 * 0.92F;
      float var12 = 0.1F + 0.055F * (1.0F - var7);
      int var13 = UuUVuuUu(var3.UuUVuuUu.UnUNVVVNuv, var8 * 0.04F);
      int var14 = UuUVuuUu(UuUVuuUu(this.uUnuvNvvNU(var3.UuUVuuUu), 16777215, 0.38F), var8 * 0.3F * (1.0F - var7 * 0.34F));
      this.UuUVuuUu(
         var1,
         var2,
         var4 - var12,
         var10,
         var6,
         var4 + var12,
         var10,
         var6,
         var4 + var12 * 0.32F,
         var11,
         var6,
         var4 - var12 * 0.32F,
         var11,
         var6,
         var13,
         var13,
         var14,
         var14
      );
      this.UuUVuuUu(
         var1,
         var2,
         var4,
         var10,
         var6 - var12,
         var4,
         var10,
         var6 + var12,
         var4,
         var11,
         var6 + var12 * 0.32F,
         var4,
         var11,
         var6 - var12 * 0.32F,
         var13,
         var13,
         var14,
         var14
      );
   }

   private void UuUVuuUu(
      class_4588 var1, Matrix4f var2, DeadEffect.nvUnvV var3, float var4, float var5, float var6, float var7, float var8, float var9, float var10, float var11
   ) {
      if (!(var11 <= 0.02F)) {
         byte var12 = 18;

         for (int var13 = 0; var13 < var12; var13++) {
            float var14 = uUnuvNvvNU(var3.uUnuvNvvNU * 0.137F + var13 * 0.6180339F);
            float var15 = uUnuvNvvNU(var7 * (0.78F + var14 * 0.22F) + var14);
            float var16 = var10 * 0.78F + var13 * 2.399963F + var15 * (float) (Math.PI * 2) * 0.62F;
            float var17 = 0.18F + var15 * (0.38F + var14 * 0.34F);
            float var18 = var4 + (float)Math.cos(var16) * var17;
            float var19 = var6 + (float)Math.sin(var16) * var17;
            float var20 = var5 + 0.52F + var9 * (0.45F + var14 * 0.28F) + var15 * (0.92F + var14 * 0.42F);
            float var21 = (0.025F + var14 * 0.035F) * (1.0F - var15 * 0.42F);
            float var22 = var8 * var11 * (1.0F - var15) * (0.3F + var14 * 0.28F) * this.vuvnUnVnUNnV.uUnuvNvvNU();
            int var23 = UuUVuuUu(UuUVuuUu(var3.UuUVuuUu.UnUNVVVNuv, var3.UuUVuuUu.vNVuvnUUnuUn, var14), var22);
            this.UuUVuuUu(
               var1,
               var2,
               var18,
               var20 + var21,
               var19,
               var18 + var21,
               var20,
               var19,
               var18,
               var20 - var21,
               var19,
               var18 - var21,
               var20,
               var19,
               var23,
               var23,
               var23,
               var23
            );
         }
      }
   }

   private void UuUVuuUu(class_4588 var1, Matrix4f var2, float var3, float var4, float var5, float var6, float var7, int var8) {
      if ((var8 >>> 24 & 0xFF) != 0) {
         float var9 = Math.max(0.02F, var6 - var7);
         float var10 = var6 + var7;

         for (int var11 = 0; var11 < 96; var11++) {
            float var12 = (float) (Math.PI * 2) * var11 / 96.0F;
            float var13 = (float) (Math.PI * 2) * (var11 + 1) / 96.0F;
            float var14 = (float)Math.cos(var12);
            float var15 = (float)Math.sin(var12);
            float var16 = (float)Math.cos(var13);
            float var17 = (float)Math.sin(var13);
            this.UuUVuuUu(
               var1,
               var2,
               var3 + var14 * var9,
               var4,
               var5 + var15 * var9,
               var3 + var16 * var9,
               var4,
               var5 + var17 * var9,
               var3 + var16 * var10,
               var4,
               var5 + var17 * var10,
               var3 + var14 * var10,
               var4,
               var5 + var15 * var10,
               var8,
               var8,
               var8,
               var8
            );
         }
      }
   }

   private void UuUVuuUu(
      class_4588 var1,
      Matrix4f var2,
      float var3,
      float var4,
      float var5,
      float var6,
      float var7,
      float var8,
      float var9,
      float var10,
      float var11,
      int var12,
      int var13
   ) {
      if ((var12 >>> 24 & 0xFF | var13 >>> 24 & 0xFF) != 0) {
         float var14 = (float)Math.cos(var7);
         float var15 = (float)Math.sin(var7);
         float var16 = (float)Math.cos(var8);
         float var17 = (float)Math.sin(var8);
         this.UuUVuuUu(
            var1,
            var2,
            var3 + var14 * (var9 - var11),
            var5,
            var4 + var15 * (var9 - var11),
            var3 + var14 * (var9 + var11),
            var5,
            var4 + var15 * (var9 + var11),
            var3 + var16 * (var10 + var11),
            var6,
            var4 + var17 * (var10 + var11),
            var3 + var16 * (var10 - var11),
            var6,
            var4 + var17 * (var10 - var11),
            var12,
            var12,
            var13,
            var13
         );
      }
   }

   private void UuUVuuUu(
      class_4588 var1,
      Matrix4f var2,
      float var3,
      float var4,
      float var5,
      float var6,
      float var7,
      float var8,
      float var9,
      float var10,
      float var11,
      float var12,
      float var13,
      float var14,
      int var15,
      int var16,
      int var17,
      int var18
   ) {
      this.UuUVuuUu(var1, var2, var3, var4, var5, var15);
      this.UuUVuuUu(var1, var2, var6, var7, var8, var16);
      this.UuUVuuUu(var1, var2, var9, var10, var11, var17);
      this.UuUVuuUu(var1, var2, var12, var13, var14, var18);
   }

   private void UuUVuuUu(class_4588 var1, Matrix4f var2, float var3, float var4, float var5, int var6) {
      var1.method_22918(var2, var3, var4, var5).method_1336(UuUVuuUu(var6), C00OOC00oO(var6), uUnuvNvvNU(var6), var6 >>> 24 & 0xFF);
   }

   private boolean UuUVuuUu(class_1657 var1) {
      if (var1 == null) {
         return false;
      } else {
         return uUnuvNvvNU.field_1724 != null && var1.method_5628() == uUnuvNvvNU.field_1724.method_5628()
            ? this.unNNVVNnvvV.C00OOC00oO("Себя")
            : this.unNNVVNnvvV.C00OOC00oO("Игроки");
      }
   }

   private static boolean C00OOC00oO(class_1657 var0) {
      return var0 == null || var0.method_31481() || !var0.method_5805() || var0.method_6032() <= 0.0F || var0.field_6213 > 0;
   }

   private float UuUVuuUu(DeadEffect.NVnVnNnN var1) {
      return this.C00OOC00oO(var1) + var1.C00OOC00oO;
   }

   private float C00OOC00oO(DeadEffect.NVnVnNnN var1) {
      return Math.max(0.15F, this.NuunnvnN.uUnuvNvvNU() * var1.UuUVuuUu);
   }

   private int uUnuvNvvNU(DeadEffect.NVnVnNnN var1) {
      return var1 == DeadEffect.NVnVnNnN.TOTEM ? this.nVVUuvuNnUN.vNUvnnVnUvu() : this.nNnVnUNVV.vNUvnnVnUvu();
   }

   private static DeadEffect UuuNnUvUuv() {
      if (ru.metaculture.protection.NVnVnNnN.UuUVuuUu != null && ru.metaculture.protection.NVnVnNnN.UuUVuuUu.C00OOC00oO != null) {
         DeadEffect var0 = ru.metaculture.protection.NVnVnNnN.UuUVuuUu.C00OOC00oO.UuUVuuUu(DeadEffect.class);
         return var0 != null && var0.nuUnNvnuUu ? var0 : null;
      } else {
         return null;
      }
   }

   private static class_2960 uUnuvNvvNU(class_1657 var0) {
      return var0 instanceof class_742 var1 ? var1.method_52814().comp_1626() : null;
   }

   private static boolean vVvUvVVuuNvV(class_1657 var0) {
      return var0 instanceof class_742 var1 && var1.method_52814().comp_1629() == class_7920.field_41122;
   }

   private static boolean UuUVuuUu(class_10055 var0) {
      return var0 != null && var0.field_53520 != null && var0.field_53520.comp_1629() == class_7920.field_41122;
   }

   private static int UuUVuuUu(int var0, float var1) {
      return class_9848.method_61324(vVvUvVVuuNvV(Math.round(C00OOC00oO(var1) * 255.0F)), UuUVuuUu(var0), C00OOC00oO(var0), uUnuvNvvNU(var0));
   }

   private static int UuUVuuUu(int var0, int var1, float var2) {
      float var3 = C00OOC00oO(var2);
      int var4 = Math.round(UuUVuuUu(var0) + (UuUVuuUu(var1) - UuUVuuUu(var0)) * var3);
      int var5 = Math.round(C00OOC00oO(var0) + (C00OOC00oO(var1) - C00OOC00oO(var0)) * var3);
      int var6 = Math.round(uUnuvNvvNU(var0) + (uUnuvNvvNU(var1) - uUnuvNvvNU(var0)) * var3);
      return var4 << 16 | var5 << 8 | var6;
   }

   private static int UuUVuuUu(int var0) {
      return var0 >> 16 & 0xFF;
   }

   private static int C00OOC00oO(int var0) {
      return var0 >> 8 & 0xFF;
   }

   private static int uUnuvNvvNU(int var0) {
      return var0 & 0xFF;
   }

   private static int vVvUvVVuuNvV(int var0) {
      return Math.max(0, Math.min(255, var0));
   }

   private static float UuUVuuUu(float var0) {
      float var1 = 1.0F - C00OOC00oO(var0);
      return 1.0F - var1 * var1 * var1;
   }

   private static float UuUVuuUu(float var0, float var1, float var2) {
      float var3 = class_3532.method_15363((var2 - var0) / Math.max(1.0E-4F, var1 - var0), 0.0F, 1.0F);
      return var3 * var3 * (3.0F - 2.0F * var3);
   }

   private static float C00OOC00oO(float var0) {
      return !Float.isFinite(var0) ? 0.0F : class_3532.method_15363(var0, 0.0F, 1.0F);
   }

   private static float uUnuvNvvNU(float var0) {
      return var0 - (float)Math.floor(var0);
   }

   static enum NVnVnNnN {
      TOTEM(0.9F, 0.58F, 0.92F, 0.035F, 0.82F, 0.44F, 0.42F, 0.66F, 0.2F, 0.58F, 1.18F, 0.22F, 1.1F, 6815716, 16777215, 16773226, 3669974, 0),
      DEATH(1.22F, 0.78F, 1.26F, 0.085F, 0.72F, 0.6F, 0.52F, 0.58F, 0.34F, 0.44F, 1.55F, 0.1F, 0.82F, 8693759, 15922687, 16739278, 6484991, 1);

      final float UuUVuuUu;
      final float C00OOC00oO;
      final float uUnuvNvvNU;
      final float vVvUvVVuuNvV;
      final float uNNnnnuuuN;
      final float nuUnNvnuUu;
      final float VVuuUN;
      final float vNUvnnVnUvu;
      final float uVUuuVnNVU;
      final float vuuuNvNuv;
      final float nvUVNnuu;
      final float UuuNnUvUuv;
      final float nUUVuvU;
      final int UnUNVVVNuv;
      final int vNVuvnUUnuUn;
      final int UvnvNVnnnnNU;
      final int uVUVnuvnuVuv;
      final int NVNnnvnuunNv;

      private NVnVnNnN(
         float var3,
         float var4,
         float var5,
         float var6,
         float var7,
         float var8,
         float var9,
         float var10,
         float var11,
         float var12,
         float var13,
         float var14,
         float var15,
         int var16,
         int var17,
         int var18,
         int var19,
         int var20
      ) {
         this.UuUVuuUu = var3;
         this.C00OOC00oO = var4;
         this.uUnuvNvvNU = var5;
         this.vVvUvVVuuNvV = var6;
         this.uNNnnnuuuN = var7;
         this.nuUnNvnuUu = var8;
         this.VVuuUN = var9;
         this.vNUvnnVnUvu = var10;
         this.uVUuuVnNVU = var11;
         this.vuuuNvNuv = var12;
         this.nvUVNnuu = var13;
         this.UuuNnUvUuv = var14;
         this.nUUVuvU = var15;
         this.UnUNVVVNuv = var16;
         this.vNVuvnUUnuUn = var17;
         this.UvnvNVnnnnNU = var18;
         this.uVUVnuvnuVuv = var19;
         this.NVNnnvnuunNv = var20;
      }

      class_2394 UuUVuuUu(int var1) {
         int var2 = (var1 + this.NVNnnvnuunNv) % 5;
         if (this == TOTEM) {
            return switch (var2) {
               case 0 -> class_2398.field_11220;
               case 1 -> class_2398.field_11207;
               case 2 -> class_2398.field_28479;
               case 3 -> class_2398.field_29644;
               default -> class_2398.field_11249;
            };
         } else {
            return switch (var2) {
               case 0 -> class_2398.field_23114;
               case 1 -> class_2398.field_22246;
               case 2 -> class_2398.field_23190;
               case 3 -> class_2398.field_23956;
               default -> class_2398.field_38002;
            };
         }
      }
   }

   record VvunVVUvUNnv(
      long capturedNanos,
      DeadEffect.nvnNNunvv head,
      DeadEffect.nvnNNunvv hat,
      DeadEffect.nvnNNunvv body,
      DeadEffect.nvnNNunvv rightArm,
      DeadEffect.nvnNNunvv leftArm,
      DeadEffect.nvnNNunvv rightLeg,
      DeadEffect.nvnNNunvv leftLeg,
      DeadEffect.nvnNNunvv leftSleeve,
      DeadEffect.nvnNNunvv rightSleeve,
      DeadEffect.nvnNNunvv leftPants,
      DeadEffect.nvnNNunvv rightPants,
      DeadEffect.nvnNNunvv jacket
   ) {

      static DeadEffect.VvunVVUvUNnv capture(class_591 var0, long var1) {
         return new DeadEffect.VvunVVUvUNnv(
            var1,
            DeadEffect.nvnNNunvv.capture(var0.field_3398),
            DeadEffect.nvnNNunvv.capture(var0.field_3394),
            DeadEffect.nvnNNunvv.capture(var0.field_3391),
            DeadEffect.nvnNNunvv.capture(var0.field_3401),
            DeadEffect.nvnNNunvv.capture(var0.field_27433),
            DeadEffect.nvnNNunvv.capture(var0.field_3392),
            DeadEffect.nvnNNunvv.capture(var0.field_3397),
            DeadEffect.nvnNNunvv.capture(var0.field_3484),
            DeadEffect.nvnNNunvv.capture(var0.field_3486),
            DeadEffect.nvnNNunvv.capture(var0.field_3482),
            DeadEffect.nvnNNunvv.capture(var0.field_3479),
            DeadEffect.nvnNNunvv.capture(var0.field_3483)
         );
      }

      void apply(class_591 var1) {
         this.head.apply(var1.field_3398);
         this.hat.apply(var1.field_3394);
         this.body.apply(var1.field_3391);
         this.rightArm.apply(var1.field_3401);
         this.leftArm.apply(var1.field_27433);
         this.rightLeg.apply(var1.field_3392);
         this.leftLeg.apply(var1.field_3397);
         this.leftSleeve.apply(var1.field_3484);
         this.rightSleeve.apply(var1.field_3486);
         this.leftPants.apply(var1.field_3482);
         this.rightPants.apply(var1.field_3479);
         this.jacket.apply(var1.field_3483);
      }
   }

   static final class nvUnvV {
      final DeadEffect.NVnVnNnN UuUVuuUu;
      final long C00OOC00oO;
      final float uUnuvNvvNU;
      DeadEffect.VvunVVUvUNnv vVvUvVVuuNvV;
      DeadEffect.uunvUUVnuNn uNNnnnuuuN;
      class_2960 nuUnNvnuUu;
      boolean VVuuUN;

      nvUnvV(DeadEffect.NVnVnNnN var1, long var2, float var4, DeadEffect.VvunVVUvUNnv var5, DeadEffect.uunvUUVnuNn var6, class_2960 var7, boolean var8) {
         this.UuUVuuUu = var1;
         this.C00OOC00oO = var2;
         this.uUnuvNvvNU = var4;
         this.vVvUvVVuuNvV = var5;
         this.uNNnnnuuuN = var6;
         this.nuUnNvnuUu = var7;
         this.VVuuUN = var8;
      }
   }

   record nvnNNunvv(
      float originX,
      float originY,
      float originZ,
      float pitch,
      float yaw,
      float roll,
      float xScale,
      float yScale,
      float zScale,
      boolean visible,
      boolean hidden
   ) {
      static DeadEffect.nvnNNunvv capture(class_630 var0) {
         return new DeadEffect.nvnNNunvv(
            var0.field_3657,
            var0.field_3656,
            var0.field_3655,
            var0.field_3654,
            var0.field_3675,
            var0.field_3674,
            var0.field_37938,
            var0.field_37939,
            var0.field_37940,
            var0.field_3665,
            var0.field_38456
         );
      }

      void apply(class_630 var1) {
         var1.field_3657 = this.originX;
         var1.field_3656 = this.originY;
         var1.field_3655 = this.originZ;
         var1.field_3654 = this.pitch;
         var1.field_3675 = this.yaw;
         var1.field_3674 = this.roll;
         var1.field_37938 = this.xScale;
         var1.field_37939 = this.yScale;
         var1.field_37940 = this.zScale;
         var1.field_3665 = this.visible;
         var1.field_38456 = this.hidden;
      }
   }

   record uunvUUVnuNn(double x, double y, double z, float bodyYaw, float baseScale) {

      static DeadEffect.uunvUUVnuNn fromPlayer(class_1657 var0) {
         float var1 = Module.uUnuvNvvNU.method_61966().method_60637(true);
         double var2 = class_3532.method_16436(var1, var0.field_6014, var0.method_23317());
         double var4 = class_3532.method_16436(var1, var0.field_6036, var0.method_23318());
         double var6 = class_3532.method_16436(var1, var0.field_5969, var0.method_23321());
         float var8 = class_3532.method_17821(var1, var0.field_6220, var0.field_6283);
         return new DeadEffect.uunvUUVnuNn(var2, var4, var6, var8, Math.max(0.01F, var0.method_55693()));
      }

      static DeadEffect.uunvUUVnuNn fromState(class_10055 var0) {
         return new DeadEffect.uunvUUVnuNn(var0.field_53325, var0.field_53326, var0.field_53327, var0.field_53446, Math.max(0.01F, var0.field_53453));
      }
   }
}
