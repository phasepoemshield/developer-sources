package ru.metaculture.protection;

import baritone.api.BaritoneAPI;
import baritone.api.IBaritone;
import baritone.api.pathing.goals.GoalBlock;
import lombok.Generated;
import net.minecraft.class_2338;
import net.minecraft.class_2561;
import org.wild.module.api.Module;
import org.wild.module.api.ModuleRegister;

@uNUunUnnnVu(
   uUnuvNvvNU = {"lichoday", "bitrixtime", "oblamovvv"}
)
@ModuleRegister(
   UuUVuuUu = "Test",
   uUnuvNvvNU = oOOOo0.Player,
   C00OOC00oO = "..."
)
public class Test extends Module {
   private final uVNuNUVvn NVNnnvnuunNv = new uVNuNUVvn("Установка точки", -1);
   private static class_2338 uVunuUNVVUUV;
   private static class_2338 UNnVVNvvnVvU;
   private class_2338[] uNnUnnuNUnNu;
   private int NnUuNNU = 0;
   private int nNvNUVU = 0;
   private final unnunUVvU UnUNuUU = new unnunUVvU();

   public Test() {
      this.UuUVuuUu(new nvUuvVvuuN[]{this.NVNnnvnuunNv});
   }

   @Override
   public void UuUVuuUu() {
      this.UnUNVVVNuv();
      this.NnUuNNU = 0;
      super.UuUVuuUu();
   }

   @vuVvUNNvVNV
   public void UuUVuuUu(vVvuNVUVvNv var1) {
      if (var1.vVvUvVVuuNvV() == this.NVNnnvnuunNv.uUnuvNvvNU() && this.UnUNuUU.vVvUvVVuuNvV(300L)) {
         if (this.nNvNUVU == 0) {
            uVunuUNVVUUV = uUnuvNvvNU.field_1724.method_24515();
            UNnVVNvvnVvU = null;
            this.uNnUnnuNUnNu = null;
            this.UuUVuuUu("Точка 1: " + uVunuUNVVUUV.method_23854());
            this.nNvNUVU = 1;
         } else if (this.nNvNUVU == 1) {
            UNnVVNvvnVvU = uUnuvNvvNU.field_1724.method_24515();
            this.UuUVuuUu("Точка 2: " + UNnVVNvvnVvU.method_23854());
            this.UnUNVVVNuv();
            this.nNvNUVU = 2;
         } else {
            uVunuUNVVUUV = uUnuvNvvNU.field_1724.method_24515();
            UNnVVNvvnVvU = null;
            this.uNnUnnuNUnNu = null;
            BaritoneAPI.getProvider().getPrimaryBaritone().getPathingBehavior().cancelEverything();
            this.UuUVuuUu("Сброс. Точка 1: " + uVunuUNVVUUV.method_23854());
            this.nNvNUVU = 1;
         }

         this.UnUNuUU.UuUVuuUu();
      }
   }

   @vuVvUNNvVNV
   public void UuUVuuUu(nVunNNvuv var1) {
      if (uUnuvNvvNU.field_1724 != null && uUnuvNvvNU.field_1687 != null && this.uNnUnnuNUnNu != null && this.uNnUnnuNUnNu.length != 0) {
         IBaritone var2 = BaritoneAPI.getProvider().getPrimaryBaritone();
         this.UuUVuuUu(var2);
      }
   }

   private void UuUVuuUu(IBaritone var1) {
      class_2338 var2 = this.uNnUnnuNUnNu[this.NnUuNNU];
      double var3 = uUnuvNvvNU.field_1724.method_5649(var2.method_10263() + 0.5, var2.method_10264(), var2.method_10260() + 0.5);
      if (var3 < 2.0) {
         this.NnUuNNU = (this.NnUuNNU + 1) % this.uNnUnnuNUnNu.length;
         var2 = this.uNnUnnuNUnNu[this.NnUuNNU];
      }

      var1.getCustomGoalProcess().setGoalAndPath(new GoalBlock(var2));
   }

   private void UnUNVVVNuv() {
      if (uVunuUNVVUUV != null && UNnVVNvvnVvU != null) {
         int var1 = Math.min(uVunuUNVVUUV.method_10263(), UNnVVNvvnVvU.method_10263());
         int var2 = Math.max(uVunuUNVVUUV.method_10263(), UNnVVNvvnVvU.method_10263());
         int var3 = Math.min(uVunuUNVVUUV.method_10260(), UNnVVNvvnVvU.method_10260());
         int var4 = Math.max(uVunuUNVVUUV.method_10260(), UNnVVNvvnVvU.method_10260());
         int var5 = (int)uUnuvNvvNU.field_1724.method_23318();
         this.uNnUnnuNUnNu = new class_2338[]{
            new class_2338(var1, var5, var3), new class_2338(var2, var5, var3), new class_2338(var2, var5, var4), new class_2338(var1, var5, var4)
         };
      }
   }

   private void UuUVuuUu(String var1) {
      if (uUnuvNvvNU.field_1724 != null) {
         uUnuvNvvNU.field_1724.method_7353(class_2561.method_30163("§7[§bTestModule§7] §f" + var1), false);
      }
   }

   @Override
   public void C00OOC00oO() {
      BaritoneAPI.getProvider().getPrimaryBaritone().getPathingBehavior().cancelEverything();
      super.C00OOC00oO();
   }

   @Generated
   public static class_2338 UuuNnUvUuv() {
      return uVunuUNVVUUV;
   }

   @Generated
   public static void UuUVuuUu(class_2338 var0) {
      uVunuUNVVUUV = var0;
   }

   @Generated
   public static class_2338 nUUVuvU() {
      return UNnVVNvvnVvU;
   }

   @Generated
   public static void C00OOC00oO(class_2338 var0) {
      UNnVVNvvnVvU = var0;
   }
}
