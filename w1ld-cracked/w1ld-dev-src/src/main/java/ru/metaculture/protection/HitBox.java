package ru.metaculture.protection;

import net.minecraft.class_1268;
import net.minecraft.class_1297;
import net.minecraft.class_1309;
import net.minecraft.class_1657;
import net.minecraft.class_243;
import net.minecraft.class_3532;
import org.wild.module.api.Module;
import org.wild.module.api.ModuleRegister;

@ModuleRegister(
   UuUVuuUu = "HitBox",
   C00OOC00oO = "Увеличивает хитбокс таргета",
   uUnuvNvvNU = oOOOo0.Combat,
   vVvUvVVuuNvV = {uVUNNUnNvU.RISKY}
)
public class HitBox extends Module {
   public static UvNnUnuNUUU NVNnnvnuunNv = new UvNnUnuNUUU("Режим", "Обычный", "Легит", "Обычный");
   public static nNUuNvVn uVunuUNVVUUV = new nNUuNvVn("Размер", 0.2F, 0.0F, 5.0F, 0.1F, false);
   public static vvNnnUNnVvn UNnVVNvvnVvU = new vvNnnUNnVvn("Игнор друзей", true);
   public static UvNnUnuNUUU uNnUnnuNUnNu = new UvNnUnuNUUU("Режим снапа", "Fast", "Fast", "Smooth", "Random")
      .UuUVuuUu(() -> !NVNnnvnuunNv.C00OOC00oO("Легит"));
   public static class_1309 NnUuNNU = null;
   public static int nNvNUVU = 0;

   public HitBox() {
      this.UuUVuuUu(new nvUuvVvuuN[]{NVNnnvnuunNv, uVunuUNVVUUV, UNnVVNvvnVvU, uNnUnnuNUnNu});
   }

   public static void UuUVuuUu(class_1309 var0) {
      NnUuNNU = var0;
      nNvNUVU = 0;
   }

   @vuVvUNNvVNV
   public void UuUVuuUu(nVunNNvuv var1) {
      if (uUnuvNvvNU.field_1724 != null && uUnuvNvvNU.field_1687 != null) {
         if (!NVNnnvnuunNv.C00OOC00oO("Легит")) {
            NnUuNNU = null;
         } else {
            if (NnUuNNU != null) {
               if (!NnUuNNU.method_5805() || uUnuvNvvNU.field_1724.method_5739(NnUuNNU) > 3.0F) {
                  NnUuNNU = null;
                  return;
               }

               VvUNVunnuu.UuUVuuUu(NnUuNNU, true, uNnUnnuNUnNu.uUnuvNvvNU());
               nNvNUVU++;
               if (nNvNUVU >= 2 && oCCO0cc0C0Oc.UuUVuuUu(NnUuNNU, 3.0, false)) {
                  uUnuvNvvNU.field_1761.method_2918(uUnuvNvvNU.field_1724, NnUuNNU);
                  uUnuvNvvNU.field_1724.method_6104(class_1268.field_5808);
                  NnUuNNU = null;
                  nNvNUVU = 0;
               } else if (nNvNUVU >= 6) {
                  NnUuNNU = null;
                  nNvNUVU = 0;
               }
            }
         }
      }
   }

   public class_1309 UuuNnUvUuv() {
      class_1309 var1 = null;
      double var2 = Double.MAX_VALUE;
      class_243 var4 = uUnuvNvvNU.field_1724.method_33571();
      class_243 var5 = uUnuvNvvNU.field_1724.method_5828(1.0F).method_1029();

      for (class_1297 var7 : uUnuvNvvNU.field_1687.method_18112()) {
         if (var7 instanceof class_1309 var8
            && var8 != uUnuvNvvNU.field_1724
            && var8.method_5805()
            && (!(UNnVVNvvnVvU.uUnuvNvvNU() && var8 instanceof class_1657 var9) || !uNvUVUNvuUVV.UuUVuuUu(var9.method_5477().getString()))
            && !(uUnuvNvvNU.field_1724.method_5739(var8) > 3.0F)) {
            class_243 var17 = var8.method_19538().method_1031(0.0, var8.method_17682() / 2.0, 0.0);
            class_243 var10 = var17.method_1020(var4).method_1029();
            double var11 = class_3532.method_15350(var5.method_1026(var10), -1.0, 1.0);
            double var13 = Math.toDegrees(Math.acos(var11));
            double var15 = uVunuUNVVUUV.uUnuvNvvNU() * 30.0;
            if (var13 <= var15 && var13 < var2) {
               var2 = var13;
               var1 = var8;
            }
         }
      }

      return var1;
   }
}
