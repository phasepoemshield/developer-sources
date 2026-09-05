package ru.metaculture.protection;

import com.mojang.authlib.GameProfile;
import java.nio.charset.StandardCharsets;
import java.util.UUID;
import java.util.concurrent.ThreadLocalRandom;
import net.minecraft.class_10216;
import net.minecraft.class_1268;
import net.minecraft.class_1294;
import net.minecraft.class_1297;
import net.minecraft.class_1304;
import net.minecraft.class_1313;
import net.minecraft.class_1792;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_2394;
import net.minecraft.class_2398;
import net.minecraft.class_243;
import net.minecraft.class_3417;
import net.minecraft.class_3419;
import net.minecraft.class_3532;
import net.minecraft.class_638;
import net.minecraft.class_745;
import net.minecraft.class_8685;
import net.minecraft.class_9334;
import net.minecraft.class_1297.class_5529;
import org.wild.module.api.Module;
import org.wild.module.api.ModuleRegister;

@ModuleRegister(
   UuUVuuUu = "FakePlayer",
   uUnuvNvvNU = oOOOo0.Player,
   C00OOC00oO = "Создаёт локального WildBot для тренировки атак и тотемов"
)
public final class FakePlayer extends Module {
   private static final UUID NVNnnvnuunNv = UUID.nameUUIDFromBytes("WildClient:WildBot".getBytes(StandardCharsets.UTF_8));
   private static final int uVunuUNVVUUV = -1337;
   private static final int UNnVVNvvnVvU = 20;
   private static final float uNnUnnuNUnNu = 0.1F;
   private static final float NnUuNNU = 0.5F;
   private static final float nNvNUVU = 1.5F;
   private final UvNnUnuNUUU UnUNuUU = new UvNnUnuNUUU(
      "Броня", "Копировать", "Копировать", "Без брони", "Кожаная", "Кольчужная", "Золотая", "Железная", "Алмазная", "Незеритовая"
   );
   private final vvNnnUNnVvn uUVuVvuNUvnu = new vvNnnUNnVvn("Снятие тотемов", true);
   private final UvNnUnuNUUU UvUvUNuvNU = new UvNnUnuNUUU("Поведение", "Манекен", "Манекен", "Подвижный");
   private final nNUuNvVn c0oOOCcCoC0 = new nNUuNvVn("Активность", 1.0F, 0.3F, 1.5F, 0.05F, false).UuUVuuUu(() -> !this.UvUvUNuvNU.C00OOC00oO("Подвижный"));
   private final vvNnnUNnVvn VVnVNnunVvu = new vvNnnUNnVvn("Прыжки", true).UuUVuuUu(() -> !this.UvUvUNuvNU.C00OOC00oO("Подвижный"));
   private final vvNnnUNnVvn unNNVVNnvvV = new vvNnnUNnVvn("Замахи", true).UuUVuuUu(() -> !this.UvUvUNuvNU.C00OOC00oO("Подвижный"));
   private FakePlayer.NVnVnNnN NuunnvnN;
   private class_638 NVUunUNUN;
   private int UUVNuUNUvUnV;
   private String vuvnUnVnUNnV;
   private double nnuUVNUuvvVU;
   private double nVVUuvuNnUN;
   private double nNnVnUNVV;
   private int nuunNvv = 1;
   private int uUVVvVVNvvn;
   private double vvUVNVvvNUv = 3.0;
   private int UuNnnVnuNNV;
   private int uUVvnUuNvvN;
   private int UUuUnNVNuuv;
   private int NVuNUuVnVUN;

   public FakePlayer() {
      this.UuUVuuUu(new nvUuvVvuuN[]{this.UvUvUNuvNU, this.c0oOOCcCoC0, this.VVnVNnunVvu, this.unNNVVNnvvV, this.UnUNuUU, this.uUVuVvuNUvnu});
   }

   @Override
   public void UuUVuuUu() {
      this.nUUVuvU();
      super.UuUVuuUu();
   }

   @Override
   public void C00OOC00oO() {
      this.uVUVnuvnuVuv();
      super.C00OOC00oO();
   }

   @vuVvUNNvVNV
   public void UuUVuuUu(nVunNNvuv var1) {
      if (uUnuvNvvNU.field_1724 == null || uUnuvNvvNU.field_1687 == null) {
         this.uVUVnuvnuVuv();
      } else if (this.NuunnvnN != null && !this.NuunnvnN.method_31481() && this.NVUunUNUN == uUnuvNvvNU.field_1687) {
         if (!this.UnUNuUU.uUnuvNvvNU().equals(this.vuvnUnVnUNnV)) {
            this.uUnuvNvvNU(this.NuunnvnN);
         }

         this.UvnvNVnnnnNU();
         if (this.UUVNuUNUvUnV > 0) {
            this.UUVNuUNUvUnV--;
         } else if (this.NuunnvnN.method_6032() < this.NuunnvnN.method_6063()) {
            this.NuunnvnN.method_6025(0.1F);
         }
      } else {
         this.nUUVuvU();
      }
   }

   void UuUVuuUu(FakePlayer.NVnVnNnN var1) {
      if (var1 == this.NuunnvnN && uUnuvNvvNU.field_1724 != null && uUnuvNvvNU.field_1687 != null) {
         if (!this.UvUvUNuvNU.C00OOC00oO("Подвижный")) {
            this.nnuUVNUuvvVU = 0.0;
            this.nNnVnUNVV = 0.0;
            var1.method_5728(false);
            if (var1.method_24828()) {
               this.nVVUuvuNnUN = 0.0;
               var1.method_18799(class_243.field_1353);
            } else {
               this.nVVUuvuNnUN = (this.nVVUuvuNnUN - 0.08) * 0.98;
               var1.method_5784(class_1313.field_6308, new class_243(0.0, this.nVVUuvuNnUN, 0.0));
               var1.method_18800(0.0, var1.method_23318() - var1.field_6036, 0.0);
            }
         } else {
            ThreadLocalRandom var2 = ThreadLocalRandom.current();
            double var3 = uUnuvNvvNU.field_1724.method_23317() - var1.method_23317();
            double var5 = uUnuvNvvNU.field_1724.method_23321() - var1.method_23321();
            double var7 = Math.hypot(var3, var5);
            if (!(var1.method_23318() < uUnuvNvvNU.field_1724.method_23318() - 24.0) && !(var7 > 16.0)) {
               float var36 = this.c0oOOCcCoC0.uUnuvNvvNU();
               if (--this.uUVVvVVNvvn <= 0) {
                  this.nuunNvv = var2.nextBoolean() ? 1 : -1;
                  this.uUVVvVVNvvn = var2.nextInt(18, 60);
               }

               if (--this.UuNnnVnuNNV <= 0) {
                  this.vvUVNVvvNUv = var2.nextDouble(1.6, 4.4);
                  this.UuNnnVnuNNV = var2.nextInt(40, 110);
               }

               if (this.NVuNUuVnVUN > 0) {
                  this.NVuNUuVnVUN--;
               } else if (var2.nextFloat() < 0.005F) {
                  this.NVuNUuVnVUN = var2.nextInt(6, 18);
               }

               double var10 = var7 < 1.0E-4 ? 0.0 : 1.0 / var7;
               double var12 = var3 * var10;
               double var14 = var5 * var10;
               double var16 = class_3532.method_15350((var7 - this.vvUVNVvvNUv) * 0.45, -1.0, 1.0);
               double var18 = var12 * var16 - var14 * this.nuunNvv * 0.9;
               double var20 = var14 * var16 + var12 * this.nuunNvv * 0.9;
               double var22 = Math.hypot(var18, var20);
               if (var22 > 1.0) {
                  var18 /= var22;
                  var20 /= var22;
               }

               double var24 = this.NVuNUuVnVUN > 0 ? 0.0 : 0.26 * var36;
               double var26 = var1.method_24828() ? 0.3 : 0.1;
               this.nnuUVNUuvvVU = this.nnuUVNUuvvVU + (var18 * var24 - this.nnuUVNUuvvVU) * var26;
               this.nNnVnUNVV = this.nNnVnUNVV + (var20 * var24 - this.nNnVnUNVV) * var26;
               if (this.uUVvnUuNvvN > 0) {
                  this.uUVvnUuNvvN--;
               }

               if (var1.method_24828()) {
                  this.nVVUuvuNnUN = -0.0784;
                  if (this.VVnVNnunVvu.uUnuvNvvNU() && this.uUVvnUuNvvN == 0 && (var1.field_5976 || var2.nextFloat() < 0.035F * var36)) {
                     this.nVVUuvuNnUN = 0.42;
                     this.uUVvnUuNvvN = var2.nextInt(25, 70);
                  }
               } else {
                  this.nVVUuvuNnUN = (this.nVVUuvuNnUN - 0.08) * 0.98;
               }

               var1.method_5728(Math.hypot(this.nnuUVNUuvvVU, this.nNnVnUNVV) > 0.18);
               var1.method_5784(class_1313.field_6308, new class_243(this.nnuUVNUuvvVU, this.nVVUuvuNnUN, this.nNnVnUNVV));
               var1.method_18800(var1.method_23317() - var1.field_6014, var1.method_23318() - var1.field_6036, var1.method_23321() - var1.field_5969);
               float var28 = (float)Math.toDegrees(
                  Math.atan2(-(uUnuvNvvNU.field_1724.method_23317() - var1.method_23317()), uUnuvNvvNU.field_1724.method_23321() - var1.method_23321())
               );
               double var29 = uUnuvNvvNU.field_1724.method_23317() - var1.method_23317();
               double var31 = uUnuvNvvNU.field_1724.method_23320() - var1.method_23320();
               double var33 = uUnuvNvvNU.field_1724.method_23321() - var1.method_23321();
               float var35 = (float)class_3532.method_15350(-Math.toDegrees(Math.atan2(var31, Math.hypot(var29, var33))), -60.0, 60.0);
               var1.field_6241 = var1.field_6241 + class_3532.method_15363(class_3532.method_15393(var28 - var1.field_6241), -30.0F, 30.0F);
               var1.method_36456(var1.field_6241);
               var1.method_36457(var1.method_36455() + class_3532.method_15363(var35 - var1.method_36455(), -15.0F, 15.0F));
               if (this.UUuUnNVNuuv > 0) {
                  this.UUuUnNVNuuv--;
               }

               if (this.unNNVVNnvvV.uUnuvNvvNU() && this.UUuUnNVNuuv == 0 && var7 < 3.2 && var2.nextFloat() < 0.3F) {
                  var1.method_6104(class_1268.field_5808);
                  this.UUuUnNVNuuv = var2.nextInt(11, 22);
               }
            } else {
               double var9 = var2.nextDouble(0.0, Math.PI * 2);
               var1.method_5808(
                  uUnuvNvvNU.field_1724.method_23317() + Math.cos(var9) * 3.0,
                  uUnuvNvvNU.field_1724.method_23318(),
                  uUnuvNvvNU.field_1724.method_23321() + Math.sin(var9) * 3.0,
                  var1.method_36454(),
                  0.0F
               );
               this.nnuUVNUuvvVU = 0.0;
               this.nVVUuvuNnUN = 0.0;
               this.nNnVnUNVV = 0.0;
            }
         }
      }
   }

   @vuVvUNNvVNV
   public void UuUVuuUu(coOCCcooOcOO var1) {
      this.uVUVnuvnuVuv();
   }

   public static boolean UuUVuuUu(class_1297 var0) {
      FakePlayer var1 = UuuNnUvUuv();
      return var1 != null && var1.uUnuvNvvNU(var0);
   }

   public static boolean C00OOC00oO(class_1297 var0) {
      FakePlayer var1 = UuuNnUvUuv();
      return var1 != null && var0 == var1.NuunnvnN;
   }

   static FakePlayer UuuNnUvUuv() {
      if (ru.metaculture.protection.NVnVnNnN.UuUVuuUu != null && ru.metaculture.protection.NVnVnNnN.UuUVuuUu.C00OOC00oO != null) {
         FakePlayer var0 = ru.metaculture.protection.NVnVnNnN.UuUVuuUu.C00OOC00oO.UuUVuuUu(FakePlayer.class);
         return var0 != null && var0.nuUnNvnuUu ? var0 : null;
      } else {
         return null;
      }
   }

   private void nUUVuvU() {
      this.uVUVnuvnuVuv();
      if (uUnuvNvvNU.field_1724 != null && uUnuvNvvNU.field_1687 != null) {
         GameProfile var1 = new GameProfile(NVNnnvnuunNv, "WildBot");
         var1.getProperties().putAll(uUnuvNvvNU.field_1724.method_7334().getProperties());
         class_8685 var2 = uUnuvNvvNU.field_1724.method_52814();
         FakePlayer.NVnVnNnN var3 = new FakePlayer.NVnVnNnN(uUnuvNvvNU.field_1687, var1, var2);
         var3.method_5838(this.UuUVuuUu(uUnuvNvvNU.field_1687));
         class_243 var4 = uUnuvNvvNU.field_1724.method_5828(1.0F);
         class_243 var5 = new class_243(var4.field_1352, 0.0, var4.field_1350);
         if (var5.method_1027() < 1.0E-6) {
            var5 = new class_243(0.0, 0.0, 1.0);
         } else {
            var5 = var5.method_1029();
         }

         double var6 = uUnuvNvvNU.field_1724.method_23317() + var5.field_1352 * 2.5;
         double var8 = uUnuvNvvNU.field_1724.method_23318();
         double var10 = uUnuvNvvNU.field_1724.method_23321() + var5.field_1350 * 2.5;
         float var12 = uUnuvNvvNU.field_1724.method_36454() + 180.0F;
         var3.method_5808(var6, var8, var10, var12, 0.0F);
         var3.field_6283 = var12;
         var3.field_6241 = var12;
         var3.field_6220 = var12;
         var3.field_6259 = var12;
         var3.method_24830(true);
         this.C00OOC00oO(var3);
         var3.method_6033(var3.method_6063());
         uUnuvNvvNU.field_1687.method_53875(var3);
         this.NuunnvnN = var3;
         this.NVUunUNUN = uUnuvNvvNU.field_1687;
         this.UUVNuUNUvUnV = 0;
         this.nnuUVNUuvvVU = 0.0;
         this.nVVUuvuNnUN = 0.0;
         this.nNnVnUNVV = 0.0;
         this.uUVVvVVNvvn = 0;
         this.UuNnnVnuNNV = 0;
         this.uUVvnUuNvvN = 0;
         this.UUuUnNVNuuv = 0;
         this.NVuNUuVnVUN = 0;
      }
   }

   private void C00OOC00oO(FakePlayer.NVnVnNnN var1) {
      this.uUnuvNvvNU(var1);
      var1.method_5673(class_1304.field_6173, uUnuvNvvNU.field_1724.method_6047().method_7972());
      var1.method_6122(class_1268.field_5810, new class_1799(class_1802.field_8288));
   }

   private void uUnuvNvvNU(FakePlayer.NVnVnNnN var1) {
      String var2 = this.UnUNuUU.uUnuvNvvNU();
      switch (var2) {
         case "Без брони":
            this.UuUVuuUu(var1, null, null, null, null);
            break;
         case "Кожаная":
            this.UuUVuuUu(var1, class_1802.field_8267, class_1802.field_8577, class_1802.field_8570, class_1802.field_8370);
            break;
         case "Кольчужная":
            this.UuUVuuUu(var1, class_1802.field_8283, class_1802.field_8873, class_1802.field_8218, class_1802.field_8313);
            break;
         case "Золотая":
            this.UuUVuuUu(var1, class_1802.field_8862, class_1802.field_8678, class_1802.field_8416, class_1802.field_8753);
            break;
         case "Железная":
            this.UuUVuuUu(var1, class_1802.field_8743, class_1802.field_8523, class_1802.field_8396, class_1802.field_8660);
            break;
         case "Алмазная":
            this.UuUVuuUu(var1, class_1802.field_8805, class_1802.field_8058, class_1802.field_8348, class_1802.field_8285);
            break;
         case "Незеритовая":
            this.UuUVuuUu(var1, class_1802.field_22027, class_1802.field_22028, class_1802.field_22029, class_1802.field_22030);
            break;
         default:
            var1.method_5673(class_1304.field_6169, uUnuvNvvNU.field_1724.method_6118(class_1304.field_6169).method_7972());
            var1.method_5673(class_1304.field_6174, uUnuvNvvNU.field_1724.method_6118(class_1304.field_6174).method_7972());
            var1.method_5673(class_1304.field_6172, uUnuvNvvNU.field_1724.method_6118(class_1304.field_6172).method_7972());
            var1.method_5673(class_1304.field_6166, uUnuvNvvNU.field_1724.method_6118(class_1304.field_6166).method_7972());
      }

      this.vuvnUnVnUNnV = this.UnUNuUU.uUnuvNvvNU();
   }

   private void UuUVuuUu(FakePlayer.NVnVnNnN var1, class_1792 var2, class_1792 var3, class_1792 var4, class_1792 var5) {
      var1.method_5673(class_1304.field_6169, this.UuUVuuUu(var2));
      var1.method_5673(class_1304.field_6174, this.UuUVuuUu(var3));
      var1.method_5673(class_1304.field_6172, this.UuUVuuUu(var4));
      var1.method_5673(class_1304.field_6166, this.UuUVuuUu(var5));
   }

   private class_1799 UuUVuuUu(class_1792 var1) {
      return var1 == null ? class_1799.field_8037 : new class_1799(var1);
   }

   private boolean uUnuvNvvNU(class_1297 var1) {
      if (var1 == this.NuunnvnN && this.NuunnvnN != null && !this.NuunnvnN.method_31481() && uUnuvNvvNU.field_1724 != null && uUnuvNvvNU.field_1687 != null) {
         float var2 = uUnuvNvvNU.field_1724.method_7261(0.5F);
         boolean var3 = var2 > 0.9F
            && uUnuvNvvNU.field_1724.field_6017 > 0.0
            && !uUnuvNvvNU.field_1724.method_24828()
            && !uUnuvNvvNU.field_1724.method_6101()
            && !uUnuvNvvNU.field_1724.method_5799()
            && !uUnuvNvvNU.field_1724.method_6059(class_1294.field_5919)
            && !uUnuvNvvNU.field_1724.method_5765()
            && !uUnuvNvvNU.field_1724.method_5624();
         float var4 = 0.5F * (var3 ? 1.5F : 1.0F);
         this.UUVNuUNUvUnV = 20;
         uUnuvNvvNU.field_1724.method_7350();
         this.NuunnvnN.method_5879(uUnuvNvvNU.field_1724.method_36454());
         this.UuUVuuUu(var3, var2);
         this.uUnuvNvvNU(var3);
         if (!this.uUVuVvuNUvnu.uUnuvNvvNU()) {
            this.NuunnvnN.method_6033(this.NuunnvnN.method_6063());
            this.NuunnvnN.method_6073(0.0F);
            this.UUVNuUNUvUnV = 0;
            return true;
         } else {
            float var5 = Math.max(0.0F, var4);
            float var6 = Math.min(this.NuunnvnN.method_6067(), var5);
            if (var6 > 0.0F) {
               this.NuunnvnN.method_6073(this.NuunnvnN.method_6067() - var6);
               var5 -= var6;
            }

            float var7 = this.NuunnvnN.method_6032() - var5;
            if (var7 <= 0.0F) {
               this.UnUNVVVNuv();
            } else {
               this.NuunnvnN.method_6033(var7);
               uUnuvNvvNU.field_1687
                  .method_8486(
                     this.NuunnvnN.method_23317(),
                     this.NuunnvnN.method_23318(),
                     this.NuunnvnN.method_23321(),
                     class_3417.field_15115,
                     class_3419.field_15248,
                     1.0F,
                     1.0F,
                     false
                  );
            }

            return true;
         }
      } else {
         return false;
      }
   }

   private void UuUVuuUu(boolean var1, float var2) {
      uUnuvNvvNU.field_1687
         .method_8486(
            uUnuvNvvNU.field_1724.method_23317(),
            uUnuvNvvNU.field_1724.method_23318(),
            uUnuvNvvNU.field_1724.method_23321(),
            var1 ? class_3417.field_15016 : (var2 > 0.9F ? class_3417.field_14840 : class_3417.field_14625),
            class_3419.field_15248,
            1.0F,
            1.0F,
            false
         );
   }

   private void uUnuvNvvNU(boolean var1) {
      ThreadLocalRandom var2 = ThreadLocalRandom.current();
      int var3 = var1 ? 18 : 7;

      for (int var4 = 0; var4 < var3; var4++) {
         double var5 = this.NuunnvnN.method_23317() + var2.nextDouble(-0.32, 0.32);
         double var7 = this.NuunnvnN.method_23323(var2.nextDouble(0.25, 0.85));
         double var9 = this.NuunnvnN.method_23321() + var2.nextDouble(-0.32, 0.32);
         double var11 = var2.nextDouble(-0.35, 0.35);
         double var13 = var2.nextDouble(0.05, 0.45);
         double var15 = var2.nextDouble(-0.35, 0.35);
         this.UuUVuuUu(class_2398.field_11205, var5, var7, var9, var11, var13, var15);
      }

      for (int var17 = 0; var17 < 4; var17++) {
         this.UuUVuuUu(
            class_2398.field_11209,
            this.NuunnvnN.method_23317() + var2.nextDouble(-0.2, 0.2),
            this.NuunnvnN.method_23323(var2.nextDouble(0.35, 0.75)),
            this.NuunnvnN.method_23321() + var2.nextDouble(-0.2, 0.2),
            var2.nextDouble(-0.08, 0.08),
            var2.nextDouble(0.05, 0.18),
            var2.nextDouble(-0.08, 0.08)
         );
      }

      if (uUnuvNvvNU.field_1724.method_6047().method_7942()) {
         for (int var18 = 0; var18 < 12; var18++) {
            this.UuUVuuUu(
               class_2398.field_11208,
               this.NuunnvnN.method_23317() + var2.nextDouble(-0.35, 0.35),
               this.NuunnvnN.method_23323(var2.nextDouble(0.2, 0.9)),
               this.NuunnvnN.method_23321() + var2.nextDouble(-0.35, 0.35),
               var2.nextDouble(-0.45, 0.45),
               var2.nextDouble(0.05, 0.5),
               var2.nextDouble(-0.45, 0.45)
            );
         }
      }
   }

   private void UnUNVVVNuv() {
      class_1799 var1 = new class_1799(class_1802.field_8288);
      this.NuunnvnN.method_6033(1.0F);
      this.NuunnvnN.field_6213 = 0;
      class_10216 var2 = (class_10216)var1.method_58694(class_9334.field_54274);
      if (var2 != null) {
         var2.method_64201(var1, this.NuunnvnN);
      }

      this.UUVNuUNUvUnV = 20;
      this.UvnvNVnnnnNU();
      this.vNVuvnUUnuUn();
      uUnuvNvvNU.field_1687
         .method_8486(
            this.NuunnvnN.method_23317(),
            this.NuunnvnN.method_23318(),
            this.NuunnvnN.method_23321(),
            class_3417.field_14931,
            class_3419.field_15248,
            1.0F,
            1.0F,
            false
         );
   }

   private void vNVuvnUUnuUn() {
      ThreadLocalRandom var1 = ThreadLocalRandom.current();

      for (int var2 = 0; var2 < 72; var2++) {
         double var3 = var1.nextDouble(0.0, Math.PI * 2);
         double var5 = var1.nextDouble(0.05, 0.48);
         double var7 = this.NuunnvnN.method_23317() + Math.cos(var3) * var5;
         double var9 = this.NuunnvnN.method_23323(var1.nextDouble(0.05, 0.95));
         double var11 = this.NuunnvnN.method_23321() + Math.sin(var3) * var5;
         double var13 = var1.nextDouble(0.12, 0.65);
         double var15 = Math.cos(var3) * var13 + var1.nextDouble(-0.12, 0.12);
         double var17 = var1.nextDouble(0.15, 0.85);
         double var19 = Math.sin(var3) * var13 + var1.nextDouble(-0.12, 0.12);
         this.UuUVuuUu(class_2398.field_11220, var7, var9, var11, var15, var17, var19);
      }
   }

   private void UuUVuuUu(class_2394 var1, double var2, double var4, double var6, double var8, double var10, double var12) {
      uUnuvNvvNU.field_1687.method_8466(var1, true, true, var2, var4, var6, var8, var10, var12);
   }

   private void UvnvNVnnnnNU() {
      if (this.NuunnvnN != null) {
         if (!this.uUVuVvuNUvnu.uUnuvNvvNU()) {
            if (!this.NuunnvnN.method_6079().method_7960()) {
               this.NuunnvnN.method_6122(class_1268.field_5810, class_1799.field_8037);
            }

            this.NuunnvnN.method_6033(this.NuunnvnN.method_6063());
            this.NuunnvnN.method_6073(0.0F);
         } else {
            if (!this.NuunnvnN.method_6079().method_31574(class_1802.field_8288)) {
               this.NuunnvnN.method_6122(class_1268.field_5810, new class_1799(class_1802.field_8288));
            }
         }
      }
   }

   private int UuUVuuUu(class_638 var1) {
      int var2 = -1337;

      while (var1.method_8469(var2) != null) {
         var2--;
      }

      return var2;
   }

   private void uVUVnuvnuVuv() {
      if (this.NuunnvnN != null && this.NVUunUNUN != null) {
         this.NVUunUNUN.method_2945(this.NuunnvnN.method_5628(), class_5529.field_26999);
      }

      this.NuunnvnN = null;
      this.NVUunUNUN = null;
      this.UUVNuUNUvUnV = 0;
      this.vuvnUnVnUNnV = null;
   }

   static final class NVnVnNnN extends class_745 {
      private final class_8685 UuUVuuUu;

      NVnVnNnN(class_638 var1, GameProfile var2, class_8685 var3) {
         super(var1, var2);
         this.UuUVuuUu = var3;
      }

      public void method_5773() {
         FakePlayer var1 = FakePlayer.UuuNnUvUuv();
         if (var1 != null) {
            var1.UuUVuuUu(this);
         }

         super.method_5773();
      }

      public class_8685 method_52814() {
         return this.UuUVuuUu != null ? this.UuUVuuUu : super.method_52814();
      }
   }
}
