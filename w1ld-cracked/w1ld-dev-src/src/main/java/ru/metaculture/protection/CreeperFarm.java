package ru.metaculture.protection;

import baritone.api.BaritoneAPI;
import baritone.api.IBaritone;
import baritone.api.Settings;
import baritone.api.pathing.goals.GoalBlock;
import baritone.api.pathing.goals.GoalXZ;
import java.util.List;
import lombok.Generated;
import net.minecraft.class_1268;
import net.minecraft.class_1542;
import net.minecraft.class_1548;
import net.minecraft.class_1792;
import net.minecraft.class_1802;
import net.minecraft.class_2338;
import net.minecraft.class_238;
import net.minecraft.class_243;
import net.minecraft.class_2533;
import org.wild.module.api.Module;
import org.wild.module.api.ModuleRegister;

@ModuleRegister(
   UuUVuuUu = "CreeperFarm",
   uUnuvNvvNU = oOOOo0.Misc,
   C00OOC00oO = "Автоматический фарм криперов"
)
public class CreeperFarm extends Module {
   private static class_2338 NVNnnvnuunNv;
   private static class_2338 uVunuUNVVUUV;
   private static final double UNnVVNvvnVvU = 3.5;
   private static final double uNnUnnuNUnNu = 15.0;
   private static final double NnUuNNU = 4.0;
   private static final long nNvNUVU = 500L;
   private CreeperFarm.NVnVnNnN UnUNuUU = CreeperFarm.NVnVnNnN.SEARCH;
   private final UUVuuNuvVuVv uUVuVvuNUvnu = new UUVuuNuvVuVv();
   private class_2338[] UvUvUNuvNU;
   private int c0oOOCcCoC0 = 0;

   public static void UuuNnUvUuv() {
      NVNnnvnuunNv = null;
      uVunuUNVVUUV = null;
   }

   @Override
   public void UuUVuuUu() {
      if (uUnuvNvvNU.field_1724 != null && uUnuvNvvNU.field_1687 != null) {
         Settings var1 = BaritoneAPI.getSettings();
         var1.allowPlace.value = false;
         var1.allowBreak.value = false;
         var1.legitMine.value = true;
         this.UvnvNVnnnnNU();
         this.c0oOOCcCoC0 = 0;
         this.UnUNuUU = CreeperFarm.NVnVnNnN.SEARCH;
         this.uUVuVvuNUvnu.UuUVuuUu();
         super.UuUVuuUu();
      }
   }

   @vuVvUNNvVNV
   public void UuUVuuUu(nVunNNvuv var1) {
      if (uUnuvNvvNU.field_1724 != null && uUnuvNvvNU.field_1687 != null && NVNnnvnuunNv != null && uVunuUNVVUUV != null) {
         IBaritone var2 = BaritoneAPI.getProvider().getPrimaryBaritone();
         if (PlayerHelper.UuuNnUvUuv()) {
            var2.getPathingBehavior().cancelEverything();
         } else {
            class_1548 var3 = this.NVNnnvnuunNv();
            if (var3 != null) {
               class_243 var9 = uUnuvNvvNU.field_1724.method_19538().method_1020(var3.method_19538()).method_1029();
               class_243 var11 = uUnuvNvvNU.field_1724.method_19538().method_1019(var9.method_1021(15.0));
               this.UnUNuUU = CreeperFarm.NVnVnNnN.RETREAT;
               this.UuUVuuUu(var2, var11);
               this.UuUVuuUu(var11);
            } else {
               class_1542 var4 = this.vNVuvnUUnuUn();
               if (var4 != null) {
                  this.UnUNuUU = CreeperFarm.NVnVnNnN.LOOTING;
                  class_243 var10 = var4.method_19538();
                  this.UuUVuuUu(var2, var10);
                  this.UuUVuuUu(var10);
               } else {
                  class_1548 var5 = this.uVunuUNVVUUV();
                  if (var5 != null) {
                     double var6 = uUnuvNvvNU.field_1724.method_5739(var5);
                     if (var6 <= 3.5) {
                        this.UnUNuUU = CreeperFarm.NVnVnNnN.ATTACK;
                        var2.getPathingBehavior().cancelEverything();
                        if (this.uUVuVvuNUvnu.UuUVuuUu(500.0)) {
                           uUnuvNvvNU.field_1761.method_2918(uUnuvNvvNU.field_1724, var5);
                           uUnuvNvvNU.field_1724.method_6104(class_1268.field_5808);
                           this.uUVuVvuNUvnu.UuUVuuUu();
                        }
                     } else {
                        this.UnUNuUU = CreeperFarm.NVnVnNnN.APPROACH;
                        class_243 var8 = var5.method_19538();
                        this.UuUVuuUu(var2, var8);
                        this.UuUVuuUu(var8);
                     }
                  } else {
                     this.UuUVuuUu(var2);
                  }
               }
            }
         }
      }
   }

   private class_1542 vNVuvnUUnuUn() {
      class_1542 var1 = this.UuUVuuUu(class_1802.field_8054);
      if (var1 == null) {
         var1 = this.UuUVuuUu(class_1802.field_8287);
      }

      if (var1 != null) {
         List var2 = uUnuvNvvNU.field_1687.method_8390(class_1548.class, var1.method_5829().method_1014(4.0), var0 -> true);
         if (var2.isEmpty()) {
            return var1;
         }
      }

      return null;
   }

   private void UuUVuuUu(IBaritone var1) {
      if (this.UvUvUNuvNU != null && this.UvUvUNuvNU.length != 0) {
         class_2338 var2 = this.UvUvUNuvNU[this.c0oOOCcCoC0];
         double var3 = uUnuvNvvNU.field_1724.method_5649(var2.method_10263() + 0.5, var2.method_10264(), var2.method_10260() + 0.5);
         if (var3 < 2.0) {
            this.c0oOOCcCoC0 = (this.c0oOOCcCoC0 + 1) % this.UvUvUNuvNU.length;
            var2 = this.UvUvUNuvNU[this.c0oOOCcCoC0];
         }

         this.UnUNuUU = CreeperFarm.NVnVnNnN.PATROL;
         var1.getCustomGoalProcess().setGoalAndPath(new GoalBlock(var2));
         this.UuUVuuUu(new class_243(var2.method_10263() + 0.5, var2.method_10264(), var2.method_10260() + 0.5));
      }
   }

   private void UvnvNVnnnnNU() {
      if (NVNnnvnuunNv != null && uVunuUNVVUUV != null) {
         int var1 = Math.min(NVNnnvnuunNv.method_10263(), uVunuUNVVUUV.method_10263());
         int var2 = Math.max(NVNnnvnuunNv.method_10263(), uVunuUNVVUUV.method_10263());
         int var3 = Math.min(NVNnnvnuunNv.method_10260(), uVunuUNVVUUV.method_10260());
         int var4 = Math.max(NVNnnvnuunNv.method_10260(), uVunuUNVVUUV.method_10260());
         int var5 = (int)uUnuvNvvNU.field_1724.method_23318();
         this.UvUvUNuvNU = new class_2338[]{
            new class_2338(var1, var5, var3), new class_2338(var2, var5, var3), new class_2338(var2, var5, var4), new class_2338(var1, var5, var4)
         };
      }
   }

   private void UuUVuuUu(IBaritone var1, class_243 var2) {
      var1.getCustomGoalProcess().setGoalAndPath(new GoalXZ((int)var2.field_1352, (int)var2.field_1350));
   }

   private void UuUVuuUu(class_243 var1) {
      if (var1 != null) {
         double var2 = var1.field_1352 - uUnuvNvvNU.field_1724.method_23317();
         double var4 = var1.field_1350 - uUnuvNvvNU.field_1724.method_23321();
         float var6 = Math.abs(var2) > Math.abs(var4) ? (var2 > 0.0 ? -90.0F : 90.0F) : (var4 > 0.0 ? 0.0F : 180.0F);
         float var7 = var6 + (float)(Math.random() * 4.0 - 2.0);
      }
   }

   private void uVUVnuvnuVuv() {
      class_2338 var1 = class_2338.method_49637(
         uUnuvNvvNU.field_1724.method_23317(), uUnuvNvvNU.field_1724.method_23318() + uUnuvNvvNU.field_1724.method_5751(), uUnuvNvvNU.field_1724.method_23321()
      );
      if ((
            uUnuvNvvNU.field_1687.method_8320(var1).method_26204() instanceof class_2533
               || uUnuvNvvNU.field_1687.method_8320(var1.method_10084()).method_26204() instanceof class_2533
         )
         && uUnuvNvvNU.field_1724.method_24828()) {
      }
   }

   private class_1548 NVNnnvnuunNv() {
      for (class_1548 var3 : uUnuvNvvNU.field_1687.method_8390(class_1548.class, uUnuvNvvNU.field_1724.method_5829().method_1014(15.0), var0 -> true)) {
         if (var3.method_5805() && var3.method_7007() > 0) {
            return var3;
         }
      }

      return null;
   }

   private class_1548 uVunuUNVVUUV() {
      class_238 var1 = class_238.method_54784(NVNnnvnuunNv, uVunuUNVVUUV).method_1014(1.0);
      List var2 = uUnuvNvvNU.field_1687.method_8390(class_1548.class, var1, var0 -> true);
      class_1548 var3 = null;
      double var4 = Double.MAX_VALUE;

      for (class_1548 var7 : var2) {
         if (var7.method_5805()) {
            double var8 = uUnuvNvvNU.field_1724.method_5739(var7);
            if (var8 < var4) {
               var4 = var8;
               var3 = var7;
            }
         }
      }

      return var3;
   }

   private class_1542 UuUVuuUu(class_1792 var1) {
      class_238 var2 = class_238.method_54784(NVNnnvnuunNv, uVunuUNVVUUV).method_1014(1.0);
      List var3 = uUnuvNvvNU.field_1687.method_8390(class_1542.class, var2, var0 -> true);
      class_1542 var4 = null;
      double var5 = Double.MAX_VALUE;

      for (class_1542 var8 : var3) {
         if (var8.method_5805() && var8.method_6983().method_7909() == var1) {
            double var9 = uUnuvNvvNU.field_1724.method_5739(var8);
            if (var9 < var5) {
               var5 = var9;
               var4 = var8;
            }
         }
      }

      return var4;
   }

   @Override
   public void C00OOC00oO() {
      BaritoneAPI.getProvider().getPrimaryBaritone().getPathingBehavior().cancelEverything();
      Settings var1 = BaritoneAPI.getSettings();
      var1.allowPlace.value = true;
      var1.allowBreak.value = true;
      var1.legitMine.value = false;
      super.C00OOC00oO();
   }

   @Generated
   public static class_2338 nUUVuvU() {
      return NVNnnvnuunNv;
   }

   @Generated
   public static void UuUVuuUu(class_2338 var0) {
      NVNnnvnuunNv = var0;
   }

   @Generated
   public static class_2338 UnUNVVVNuv() {
      return uVunuUNVVUUV;
   }

   @Generated
   public static void C00OOC00oO(class_2338 var0) {
      uVunuUNVVUUV = var0;
   }

   static enum NVnVnNnN {
      SEARCH,
      APPROACH,
      ATTACK,
      RETREAT,
      PATROL,
      LOOTING;
   }
}
