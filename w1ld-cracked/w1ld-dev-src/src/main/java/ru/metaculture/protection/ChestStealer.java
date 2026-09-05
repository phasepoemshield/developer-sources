package ru.metaculture.protection;

import java.util.ArrayList;
import java.util.Random;
import net.minecraft.class_1297;
import net.minecraft.class_1657;
import net.minecraft.class_1703;
import net.minecraft.class_1707;
import net.minecraft.class_1713;
import net.minecraft.class_1716;
import net.minecraft.class_1792;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_238;
import net.minecraft.class_476;
import net.minecraft.class_480;
import org.wild.module.api.Module;
import org.wild.module.api.ModuleRegister;

@ModuleRegister(
   UuUVuuUu = "ChestStealer",
   C00OOC00oO = "Лутает предметы с сундуков",
   uUnuvNvvNU = oOOOo0.Player
)
public class ChestStealer extends Module {
   public static vvNnnUNnVvn NVNnnvnuunNv = new vvNnnUNnVvn("Убирать игроков", false);
   public final UvNnUnuNUUU uVunuUNVVUUV = new UvNnUnuNUUU("Режим работы", "Обычный", "Обычный", "FunTime Event");
   private static final int UNnVVNvvnVvU = 9;
   private static final double uNnUnnuNUnNu = 0.5;
   private static final double NnUuNNU = 1.0;
   private final Random nNvNUVU = new Random();

   public ChestStealer() {
      this.UuUVuuUu(new nvUuvVvuuN[]{NVNnnvnuunNv, this.uVunuUNVVUUV});
   }

   @vuVvUNNvVNV
   public void UuUVuuUu(VvuuvuVVvvn var1) {
      if (!VUUuVvvnNVUu.UuUVuuUu()) {
         if (NVNnnvnuunNv.uUnuvNvvNU()) {
            this.UuUVuuUu(0.5);

            for (class_1297 var3 : uUnuvNvvNU.field_1687.method_18112()) {
               if (var3 instanceof class_1657 var4 && var4 != uUnuvNvvNU.field_1724) {
                  double var5 = var3.method_23317();
                  double var7 = var3.method_23318();
                  double var9 = var3.method_23321();
                  var3.method_5857(new class_238(var5 - 1.0E-5, var7, var9 - 1.0E-5, var5 + 1.0E-5, var7 + var3.method_17682(), var9 + 1.0E-5));
               }
            }
         } else {
            this.UuUVuuUu(1.0);
         }
      }
   }

   @vuVvUNNvVNV
   public void UuUVuuUu(nVunNNvuv var1) {
      if (uUnuvNvvNU.field_1755 instanceof class_476 var2) {
         class_1707 var6 = (class_1707)var2.method_17577();
         if (var6 instanceof class_1707) {
            this.UuUVuuUu(var2.method_25440().getString(), var6, var6.method_17388() * 9);
         }
      } else if (uUnuvNvvNU.field_1755 instanceof class_480 var3) {
         class_1716 var8 = (class_1716)var3.method_17577();
         if (var8 instanceof class_1716) {
            this.UuUVuuUu(var3.method_25440().getString(), var8, 9);
         }
      }
   }

   private void UuUVuuUu(String var1, class_1703 var2, int var3) {
      ArrayList var4 = new ArrayList();
      String var5 = this.uVunuUNVVUUV.uUnuvNvvNU();
      switch (var5) {
         case "Обычный":
            for (int var12 = 0; var12 < var3; var12++) {
               if (!var2.method_7611(var12).method_7677().method_7960()) {
                  var4.add(var12);
               }
            }
            break;
         case "FunTime Event":
            for (int var11 = 0; var11 < var3; var11++) {
               class_1799 var14 = var2.method_7611(var11).method_7677();
               if (!var14.method_7960()) {
                  class_1792 var15 = var14.method_7909();
                  if (var15 == class_1802.field_8864 || var15 == class_1802.field_8054 || var15 == class_1802.field_8446 || var15 == class_1802.field_8851) {
                     var4.add(var11);
                  }
               }
            }
            break;
         case "FunTime AIRDrop":
            if (this.UuUVuuUu(var1)) {
               boolean var7 = false;

               for (int var8 = 0; var8 < var3; var8++) {
                  class_1799 var9 = var2.method_7611(var8).method_7677();
                  if (var9.method_7909() == class_1802.field_8183 && var9.method_7964().getString().contains("[★] Предмет еще не остыл")) {
                     var7 = true;
                     break;
                  }
               }

               if (!var7) {
                  for (int var13 = 0; var13 < var3; var13++) {
                     if (!var2.method_7611(var13).method_7677().method_7960()) {
                        var4.add(var13);
                     }
                  }
               }
            }
      }

      if (!var4.isEmpty()) {
         int var10 = (Integer)var4.get(this.nNvNUVU.nextInt(var4.size()));
         uUnuvNvvNU.field_1761.method_2906(var2.field_7763, var10, 0, class_1713.field_7794, uUnuvNvvNU.field_1724);
      }
   }

   private boolean UuUVuuUu(String var1) {
      String var2 = var1.toLowerCase().replaceAll("§.", "").trim();
      return var2.equals("бочка")
         || var2.equals("раздатчик")
         || var2.equals("dispenser")
         || var2.equals("barrel")
         || var2.equals("аир-дроп")
         || var2.equals("аир дроп")
         || var2.equals("air-drop")
         || var2.equals("air drop")
         || var2.equals("airdrop");
   }

   private void UuUVuuUu(double var1) {
      double var3 = (Double)uUnuvNvvNU.field_1690.method_42517().method_41753();
      if (Math.abs(var3 - var1) > 0.001) {
         uUnuvNvvNU.field_1690.method_42517().method_41748(var1);
      }
   }

   @Override
   public void C00OOC00oO() {
      super.C00OOC00oO();
      this.UuUVuuUu(1.0);
   }
}
