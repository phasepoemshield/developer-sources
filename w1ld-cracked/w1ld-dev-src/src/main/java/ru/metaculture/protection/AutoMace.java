package ru.metaculture.protection;

import java.util.Comparator;
import net.minecraft.class_1268;
import net.minecraft.class_1309;
import net.minecraft.class_1531;
import net.minecraft.class_1657;
import net.minecraft.class_1802;
import net.minecraft.class_238;
import net.minecraft.class_243;
import net.minecraft.class_3959;
import net.minecraft.class_3965;
import net.minecraft.class_239.class_240;
import net.minecraft.class_3959.class_242;
import net.minecraft.class_3959.class_3960;
import org.wild.module.api.Module;
import org.wild.module.api.ModuleRegister;

@ModuleRegister(
   UuUVuuUu = "AutoMace",
   C00OOC00oO = "Автоматический идеальный удар булавой на падении",
   uUnuvNvvNU = oOOOo0.Combat
)
public class AutoMace extends Module {
   private final nNUuNvVn NVNnnvnuunNv = new nNUuNvVn("Дистанция", 4.2F, 2.8F, 6.0F, 0.1F, false);
   private final nNUuNvVn uVunuUNVVUUV = new nNUuNvVn("Мин. падение", 3.0F, 1.5F, 24.0F, 0.5F, false);
   private final nNUuNvVn UNnVVNvvnVvU = new nNUuNvVn("Точка удара", 1.15F, 0.25F, 3.0F, 0.05F, false);
   private final nNUuNvVn uNnUnnuNUnNu = new nNUuNvVn("Кулдаун", 92.0F, 70.0F, 100.0F, 1.0F, false);
   private final vvNnnUNnVvn NnUuNNU = new vvNnnUNnVvn("Только игроки", false);
   private final vvNnnUNnVvn nNvNUVU = new vvNnnUNnVvn("Только булава", true);
   private long UnUNuUU;

   public AutoMace() {
      this.UuUVuuUu(new nvUuvVvuuN[]{this.NVNnnvnuunNv, this.uVunuUNVVUUV, this.UNnVVNvvnVvU, this.uNnUnnuNUnNu, this.NnUuNNU, this.nNvNUVU});
   }

   @vuVvUNNvVNV
   public void UuUVuuUu(nVunNNvuv var1) {
      if (uUnuvNvvNU.field_1724 != null && uUnuvNvvNU.field_1687 != null && uUnuvNvvNU.field_1761 != null) {
         if (!this.nNvNUVU.uUnuvNvvNU() || uUnuvNvvNU.field_1724.method_6047().method_31574(class_1802.field_49814)) {
            if (!uUnuvNvvNU.field_1724.method_24828()
               && !(uUnuvNvvNU.field_1724.method_18798().field_1351 >= -0.08)
               && !(uUnuvNvvNU.field_1724.field_6017 < this.uVunuUNVVUUV.uUnuvNvvNU())) {
               if (!(uUnuvNvvNU.field_1724.method_7261(0.0F) * 100.0F < this.uNnUnnuNUnNu.uUnuvNvvNU())) {
                  AutoMace.NVnVnNnN var2 = this.nUUVuvU();
                  if (var2 != null && !(var2.heightToGround > this.UNnVVNvvnVvU.uUnuvNvvNU()) && var2.ticksToGround <= 4) {
                     class_1309 var3 = this.UuuNnUvUuv();
                     if (var3 != null && this.C00OOC00oO(var3)) {
                        long var4 = System.currentTimeMillis();
                        if (var4 - this.UnUNuUU >= 250L) {
                           uUnuvNvvNU.field_1761.method_2918(uUnuvNvvNU.field_1724, var3);
                           uUnuvNvvNU.field_1724.method_6104(class_1268.field_5808);
                           this.UnUNuUU = var4;
                        }
                     }
                  }
               }
            }
         }
      }
   }

   private class_1309 UuuNnUvUuv() {
      double var1 = this.NVNnnvnuunNv.uUnuvNvvNU();
      class_238 var3 = uUnuvNvvNU.field_1724.method_5829().method_1014(var1);
      return uUnuvNvvNU.field_1687
         .method_8390(class_1309.class, var3, this::UuUVuuUu)
         .stream()
         .min(Comparator.comparingDouble(var0 -> uUnuvNvvNU.field_1724.method_5858(var0)))
         .orElse(null);
   }

   private boolean UuUVuuUu(class_1309 var1) {
      if (var1 == uUnuvNvvNU.field_1724 || !var1.method_5805() || var1.method_7325() || var1 instanceof class_1531) {
         return false;
      } else if (this.NnUuNNU.uUnuvNvvNU() && !(var1 instanceof class_1657)) {
         return false;
      } else {
         double var2 = this.NVNnnvnuunNv.uUnuvNvvNU();
         return uUnuvNvvNU.field_1724.method_5858(var1) <= var2 * var2;
      }
   }

   private boolean C00OOC00oO(class_1309 var1) {
      class_243 var2 = uUnuvNvvNU.field_1724.method_33571();
      class_243 var3 = var1.method_5829().method_1005();
      class_3965 var4 = uUnuvNvvNU.field_1687.method_17742(new class_3959(var2, var3, class_3960.field_17558, class_242.field_1348, uUnuvNvvNU.field_1724));
      return var4.method_17783() == class_240.field_1333;
   }

   private AutoMace.NVnVnNnN nUUVuvU() {
      class_243 var1 = uUnuvNvvNU.field_1724.method_19538();
      class_243 var2 = uUnuvNvvNU.field_1724.method_18798();
      double var3 = var1.field_1351;

      for (int var5 = 0; var5 < 20; var5++) {
         double var6 = var3 + var2.field_1351;
         class_243 var8 = new class_243(var1.field_1352, var3, var1.field_1350);
         class_243 var9 = new class_243(var1.field_1352, var6, var1.field_1350);
         class_3965 var10 = uUnuvNvvNU.field_1687.method_17742(new class_3959(var8, var9, class_3960.field_17558, class_242.field_1348, uUnuvNvvNU.field_1724));
         if (var10.method_17783() == class_240.field_1332) {
            double var11 = Math.max(0.0, uUnuvNvvNU.field_1724.method_23318() - var10.method_17784().field_1351);
            return new AutoMace.NVnVnNnN(var5 + 1, var11);
         }

         var3 = var6;
         var2 = var2.method_18805(0.98, 0.98, 0.98).method_1023(0.0, 0.08, 0.0);
      }

      class_243 var13 = uUnuvNvvNU.field_1724.method_19538();
      class_243 var14 = var13.method_1023(0.0, 32.0, 0.0);
      class_3965 var7 = uUnuvNvvNU.field_1687.method_17742(new class_3959(var13, var14, class_3960.field_17558, class_242.field_1348, uUnuvNvvNU.field_1724));
      return var7.method_17783() != class_240.field_1332
         ? null
         : new AutoMace.NVnVnNnN(20, Math.max(0.0, uUnuvNvvNU.field_1724.method_23318() - var7.method_17784().field_1351));
   }

   record NVnVnNnN(int ticksToGround, double heightToGround) {
   }
}
