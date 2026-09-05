package ru.metaculture.protection;

import baritone.api.BaritoneAPI;
import baritone.api.IBaritone;
import baritone.api.pathing.goals.GoalBlock;
import net.minecraft.class_1268;
import net.minecraft.class_1792;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_2246;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_243;
import net.minecraft.class_2680;
import net.minecraft.class_3532;
import net.minecraft.class_3959;
import net.minecraft.class_3965;
import net.minecraft.class_239.class_240;
import net.minecraft.class_3959.class_242;
import net.minecraft.class_3959.class_3960;
import org.wild.module.api.Module;
import org.wild.module.api.ModuleRegister;

@ModuleRegister(
   UuUVuuUu = "AutoFTObsidianFarm",
   uUnuvNvvNU = oOOOo0.Misc,
   C00OOC00oO = "Лаваход + бур: проходит лаву и чистит обсидиановый след зонами 3x3"
)
public final class AutoFTObsidianFarm extends Module {
   private final nNUuNvVn NVNnnvnuunNv = new nNUuNvVn("Дистанция хода", 100.0F, 10.0F, 500.0F, 1.0F, false);
   private final nNUuNvVn uVunuUNVVUUV = new nNUuNvVn("Отступ", 3.0F, 1.0F, 6.0F, 1.0F, false);
   private final nNUuNvVn UNnVVNvvnVvU = new nNUuNvVn("Задержка (мс)", 100.0F, 0.0F, 1000.0F, 10.0F, false);
   private AutoFTObsidianFarm.VvunVVUvUNnv uNnUnnuNUnNu = AutoFTObsidianFarm.VvunVVUvUNnv.IDLE;
   private AutoFTObsidianFarm.nvnNNunvv NnUuNNU = AutoFTObsidianFarm.nvnNNunvv.FIND;
   private class_2350 nNvNUVU = class_2350.field_11043;
   private class_2338 UnUNuUU;
   private class_2338 uUVuVvuNUvnu;
   private class_2338 UvUvUNuvNU;
   private class_2338 c0oOOCcCoC0;
   private class_2338 VVnVNnunVvu;
   private int unNNVVNnvvV;
   private int NuunnvnN;
   private int NVUunUNUN;
   private int UUVNuUNUvUnV;
   private int vuvnUnVnUNnV;
   private long nnuUVNUuvvVU;
   private Boolean nVVUuvuNnUN;

   public AutoFTObsidianFarm() {
      this.UuUVuuUu(new nvUuvVvuuN[]{this.NVNnnvnuunNv, this.uVunuUNVVUUV, this.UNnVVNvvnVvU});
   }

   @Override
   public void UuUVuuUu() {
      super.UuUVuuUu();
      this.uNnUnnuNUnNu();
      this.uVunuUNVVUUV();
      if (uUnuvNvvNU.field_1724 != null) {
         this.nUUVuvU();
      }
   }

   @Override
   public void C00OOC00oO() {
      this.vNVuvnUUnuUn();
      this.UvnvNVnnnnNU();
      this.UNnVVNvvnVvU();
      this.uNnUnnuNUnNu();
      super.C00OOC00oO();
   }

   @vuVvUNNvVNV
   public void UuUVuuUu(nVunNNvuv var1) {
      if (uUnuvNvvNU.field_1724 != null && uUnuvNvvNU.field_1687 != null && uUnuvNvvNU.field_1761 != null) {
         switch (this.uNnUnnuNUnNu) {
            case WALKING:
               if (this.uUVuVvuNUvnu == null || this.UuUVuuUu(this.uUVuVvuNUvnu, 1.5) || !this.uVUVnuvnuVuv()) {
                  this.vNVuvnUUnuUn();
                  this.UvUvUNuvNU = new class_2338(
                     uUnuvNvvNU.field_1724.method_24515().method_10263(), this.unNNVVNnvvV, uUnuvNvvNU.field_1724.method_24515().method_10260()
                  );
                  this.NVUunUNUN = (int)(this.NVNnnvnuunNv.uUnuvNvvNU() / 3.0F) + 1;
                  this.NuunnvnN = 0;
                  this.NnUuNNU = AutoFTObsidianFarm.nvnNNunvv.FIND;
                  this.uNnUnnuNUnNu = AutoFTObsidianFarm.VvunVVUvUNnv.MINING;
               }
               break;
            case MINING:
               this.UuuNnUvUuv();
         }
      }
   }

   private void UuuNnUvUuv() {
      if (this.NnUuNNU != AutoFTObsidianFarm.nvnNNunvv.BREAK) {
         this.UvnvNVnnnnNU();
      }

      switch (this.NnUuNNU) {
         case FIND:
            if (this.NuunnvnN >= this.NVUunUNUN) {
               this.nUUVuvU();
               return;
            }

            this.c0oOOCcCoC0 = this.UvUvUNuvNU.method_10079(this.nNvNUVU.method_10153(), this.NuunnvnN * 3);
            this.VVnVNnunVvu = this.c0oOOCcCoC0.method_10084();
            if (!this.UuUVuuUu(this.c0oOOCcCoC0)) {
               this.NuunnvnN++;
               return;
            }

            this.NnUuNNU = AutoFTObsidianFarm.nvnNNunvv.RETREAT;
            break;
         case RETREAT:
            class_2338 var4 = this.c0oOOCcCoC0.method_10079(this.nNvNUVU.method_10153(), (int)this.uVunuUNVVUUV.uUnuvNvvNU()).method_10084();
            if (!this.uVUVnuvnuVuv()) {
               if (this.UuUVuuUu(var4, 1.5)) {
                  this.vNVuvnUUnuUn();
                  this.NnUuNNU = AutoFTObsidianFarm.nvnNNunvv.PLACE;
               } else {
                  this.nuUnNvnuUu(var4);
               }
            }
            break;
         case PLACE:
            if (!this.vVvUvVVuuNvV(this.VVnVNnunVvu)) {
               this.NnUuNNU = AutoFTObsidianFarm.nvnNNunvv.RETREAT;
               return;
            }

            class_2680 var3 = uUnuvNvvNU.field_1687.method_8320(this.VVnVNnunVvu);
            if (!var3.method_26215() && !var3.method_45474()) {
               this.nnuUVNUuvvVU = System.currentTimeMillis();
               this.vuvnUnVnUNnV = 0;
               this.NnUuNNU = AutoFTObsidianFarm.nvnNNunvv.AIM;
               return;
            }

            if (this.C00OOC00oO(this.VVnVNnunVvu)) {
               this.nnuUVNUuvvVU = System.currentTimeMillis();
               this.vuvnUnVnUNnV = 0;
               this.NnUuNNU = AutoFTObsidianFarm.nvnNNunvv.AIM;
            } else {
               vVnvuVVUunuv.UuUVuuUu("§8[§6AutoFTObsidianFarm§8] §cНет булыжника в хотбаре");
               this.UuUVuuUu(false);
            }
            break;
         case AIM:
            this.vNVuvnUUnuUn();
            if (!this.UnUNVVVNuv()) {
               return;
            }

            if (uUnuvNvvNU.field_1687.method_8320(this.VVnVNnunVvu).method_26215()) {
               this.UUVNuUNUvUnV = 10;
               this.NnUuNNU = AutoFTObsidianFarm.nvnNNunvv.WAIT;
               return;
            }

            AutoFTObsidianFarm.NVnVnNnN var2 = this.uUnuvNvvNU(this.VVnVNnunVvu);
            if (var2 == null) {
               return;
            }

            this.UuUVuuUu(var2.hit);
            if (this.vuvnUnVnUNnV++ >= 3) {
               this.NnUuNNU = AutoFTObsidianFarm.nvnNNunvv.BREAK;
            }
            break;
         case BREAK:
            this.vNVuvnUUnuUn();
            if (uUnuvNvvNU.field_1687.method_8320(this.VVnVNnunVvu).method_26215()) {
               uUnuvNvvNU.field_1690.field_1886.method_23481(false);
               this.UUVNuUNUvUnV = 10;
               this.NnUuNNU = AutoFTObsidianFarm.nvnNNunvv.WAIT;
               return;
            }

            AutoFTObsidianFarm.NVnVnNnN var1 = this.uUnuvNvvNU(this.VVnVNnunVvu);
            if (var1 == null) {
               uUnuvNvvNU.field_1690.field_1886.method_23481(false);
               return;
            }

            this.UuUVuuUu(uUnuvNvvNU.field_1687.method_8320(this.VVnVNnunVvu));
            this.UuUVuuUu(var1.hit);
            uUnuvNvvNU.field_1690.field_1886.method_23481(true);
            break;
         case WAIT:
            if (this.UUVNuUNUvUnV-- <= 0) {
               this.NuunnvnN++;
               this.NnUuNNU = AutoFTObsidianFarm.nvnNNunvv.FIND;
            }
      }
   }

   private void nUUVuvU() {
      this.nNvNUVU = uUnuvNvvNU.field_1724.method_5735();
      this.UnUNuUU = uUnuvNvvNU.field_1724.method_24515();
      this.unNNVVNnvvV = this.UnUNuUU.method_10264() - 1;
      this.uUVuVvuNUvnu = this.UnUNuUU.method_10079(this.nNvNUVU, (int)this.NVNnnvnuunNv.uUnuvNvvNU());
      this.uNnUnnuNUnNu = AutoFTObsidianFarm.VvunVVUvUNnv.WALKING;
      this.nuUnNvnuUu(this.uUVuVvuNUvnu);
   }

   private boolean UuUVuuUu(class_2338 var1) {
      for (int var2 = -1; var2 <= 1; var2++) {
         for (int var3 = -1; var3 <= 1; var3++) {
            if (uUnuvNvvNU.field_1687.method_8320(var1.method_10069(var2, 0, var3)).method_27852(class_2246.field_10540)) {
               return true;
            }
         }
      }

      return false;
   }

   private boolean C00OOC00oO(class_2338 var1) {
      int var2 = this.UuUVuuUu(class_1802.field_20412);
      if (var2 == -1) {
         return false;
      } else {
         for (class_2350 var6 : class_2350.values()) {
            class_2338 var7 = var1.method_10093(var6);
            class_2680 var8 = uUnuvNvvNU.field_1687.method_8320(var7);
            if (!var8.method_26215() && !var8.method_45474() && !var8.method_26220(uUnuvNvvNU.field_1687, var7).method_1110()) {
               class_243 var9 = class_243.method_24953(var7).method_1019(class_243.method_24954(var6.method_10153().method_62675()).method_1021(0.5));
               int var10 = uUnuvNvvNU.field_1724.method_31548().method_67532();
               this.UuUVuuUu(var2);
               this.UuUVuuUu(var9);
               uUnuvNvvNU.field_1761.method_2896(uUnuvNvvNU.field_1724, class_1268.field_5808, new class_3965(var9, var6.method_10153(), var7, false));
               uUnuvNvvNU.field_1724.method_6104(class_1268.field_5808);
               this.UuUVuuUu(var10);
               return true;
            }
         }

         return false;
      }
   }

   private AutoFTObsidianFarm.NVnVnNnN uUnuvNvvNU(class_2338 var1) {
      class_243 var2 = uUnuvNvvNU.field_1724.method_33571();

      for (class_2350 var6 : class_2350.values()) {
         class_2680 var7 = uUnuvNvvNU.field_1687.method_8320(var1.method_10093(var6));
         if (var7.method_26215()
            || var7.method_27852(class_2246.field_10164)
            || var7.method_27852(class_2246.field_10382)
            || var7.method_27852(class_2246.field_10543)) {
            class_243 var8 = class_243.method_24953(var1).method_1019(class_243.method_24954(var6.method_62675()).method_1021(0.5));
            class_3965 var9 = uUnuvNvvNU.field_1687
               .method_17742(new class_3959(var2, var8, class_3960.field_17559, class_242.field_1348, uUnuvNvvNU.field_1724));
            if (var9.method_17783() == class_240.field_1332 && var9.method_17777().equals(var1)) {
               return new AutoFTObsidianFarm.NVnVnNnN(var6, var8);
            }
         }
      }

      return null;
   }

   private void UuUVuuUu(class_2680 var1) {
      int var2 = uUnuvNvvNU.field_1724.method_31548().method_67532();
      float var3 = uUnuvNvvNU.field_1724.method_6047().method_7924(var1);

      for (int var4 = 0; var4 < 9; var4++) {
         class_1799 var5 = uUnuvNvvNU.field_1724.method_31548().method_5438(var4);
         float var6 = var5.method_7924(var1);
         if (var5.method_7951(var1)) {
            var6 += 1000.0F;
         }

         if (var6 > var3) {
            var3 = var6;
            var2 = var4;
         }
      }

      this.UuUVuuUu(var2);
   }

   private void UuUVuuUu(class_243 var1) {
      class_243 var2 = uUnuvNvvNU.field_1724.method_33571();
      double var3 = var1.field_1352 - var2.field_1352;
      double var5 = var1.field_1351 - var2.field_1351;
      double var7 = var1.field_1350 - var2.field_1350;
      double var9 = Math.sqrt(var3 * var3 + var7 * var7);
      float var11 = (float)class_3532.method_15338(Math.toDegrees(Math.atan2(var7, var3)) - 90.0);
      float var12 = (float)class_3532.method_15350(-Math.toDegrees(Math.atan2(var5, var9)), -90.0, 90.0);
      uUnuvNvvNU.field_1724.method_36456(var11);
      uUnuvNvvNU.field_1724.method_36457(var12);
      uUnuvNvvNU.field_1724.field_6241 = var11;
      uUnuvNvvNU.field_1724.field_6283 = var11;
   }

   private int UuUVuuUu(class_1792 var1) {
      for (int var2 = 0; var2 < 9; var2++) {
         if (uUnuvNvvNU.field_1724.method_31548().method_5438(var2).method_7909() == var1) {
            return var2;
         }
      }

      return -1;
   }

   private void UuUVuuUu(int var1) {
      if (var1 >= 0 && var1 <= 8) {
         uUnuvNvvNU.field_1724.method_31548().method_61496(var1);
      }
   }

   private boolean UnUNVVVNuv() {
      return (float)(System.currentTimeMillis() - this.nnuUVNUuvvVU) >= this.UNnVVNvvnVvU.uUnuvNvvNU();
   }

   private boolean vVvUvVVuuNvV(class_2338 var1) {
      return uUnuvNvvNU.field_1724.method_5707(class_243.method_24953(var1)) <= 20.25;
   }

   private double uNNnnnuuuN(class_2338 var1) {
      double var2 = var1.method_10263() + 0.5 - uUnuvNvvNU.field_1724.method_23317();
      double var4 = var1.method_10260() + 0.5 - uUnuvNvvNU.field_1724.method_23321();
      return Math.sqrt(var2 * var2 + var4 * var4);
   }

   private void nuUnNvnuUu(class_2338 var1) {
      IBaritone var2 = this.NVNnnvnuunNv();
      if (var2 != null && var1 != null) {
         var2.getCustomGoalProcess().setGoalAndPath(new GoalBlock(var1));
      }
   }

   private void vNVuvnUUnuUn() {
      IBaritone var1 = this.NVNnnvnuunNv();
      if (var1 != null) {
         var1.getPathingBehavior().cancelEverything();
         var1.getCustomGoalProcess().setGoal(null);
         var1.getInputOverrideHandler().clearAllKeys();
      }
   }

   private void UvnvNVnnnnNU() {
      if (uUnuvNvvNU.field_1690 != null) {
         uUnuvNvvNU.field_1690.field_1886.method_23481(false);
      }
   }

   private boolean uVUVnuvnuVuv() {
      IBaritone var1 = this.NVNnnvnuunNv();
      return var1 != null && var1.getPathingBehavior().isPathing();
   }

   private boolean UuUVuuUu(class_2338 var1, double var2) {
      return var1 != null && this.uNNnnnuuuN(var1) <= var2;
   }

   private IBaritone NVNnnvnuunNv() {
      try {
         return BaritoneAPI.getProvider().getPrimaryBaritone();
      } catch (Throwable var2) {
         return null;
      }
   }

   private void uVunuUNVVUUV() {
      try {
         if (this.nVVUuvuNnUN == null) {
            this.nVVUuvuNnUN = (Boolean)BaritoneAPI.getSettings().assumeWalkOnLava.value;
         }

         BaritoneAPI.getSettings().assumeWalkOnLava.value = true;
      } catch (Throwable var2) {
      }
   }

   private void UNnVVNvvnVvU() {
      try {
         if (this.nVVUuvuNnUN != null) {
            BaritoneAPI.getSettings().assumeWalkOnLava.value = this.nVVUuvuNnUN;
         }
      } catch (Throwable var2) {
      }

      this.nVVUuvuNnUN = null;
   }

   private void uNnUnnuNUnNu() {
      this.uNnUnnuNUnNu = AutoFTObsidianFarm.VvunVVUvUNnv.IDLE;
      this.NnUuNNU = AutoFTObsidianFarm.nvnNNunvv.FIND;
      this.nNvNUVU = class_2350.field_11043;
      this.UnUNuUU = null;
      this.uUVuVvuNUvnu = null;
      this.UvUvUNuvNU = null;
      this.c0oOOCcCoC0 = null;
      this.VVnVNnunVvu = null;
      this.unNNVVNnvvV = 0;
      this.NuunnvnN = 0;
      this.NVUunUNUN = 0;
      this.UUVNuUNUvUnV = 0;
      this.vuvnUnVnUNnV = 0;
      this.nnuUVNUuvvVU = 0L;
   }

   record NVnVnNnN(class_2350 side, class_243 hit) {
   }

   static enum VvunVVUvUNnv {
      IDLE,
      WALKING,
      MINING;
   }

   static enum nvnNNunvv {
      FIND,
      RETREAT,
      PLACE,
      AIM,
      BREAK,
      WAIT;
   }
}
