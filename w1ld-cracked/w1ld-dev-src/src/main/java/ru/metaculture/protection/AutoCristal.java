package ru.metaculture.protection;

import java.util.Comparator;
import java.util.stream.StreamSupport;
import net.minecraft.class_1268;
import net.minecraft.class_1297;
import net.minecraft.class_1511;
import net.minecraft.class_1792;
import net.minecraft.class_1802;
import net.minecraft.class_2246;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_238;
import net.minecraft.class_243;
import net.minecraft.class_2868;
import net.minecraft.class_3965;
import org.wild.module.api.Module;
import org.wild.module.api.ModuleRegister;

@ModuleRegister(
   UuUVuuUu = "AutoCristal",
   uUnuvNvvNU = oOOOo0.Combat,
   C00OOC00oO = "Автоматическая установка и взрыв кристаллов",
   vVvUvVVuuNvV = {uVUNNUnNvU.RISKY, uVUNNUnNvU.VIP}
)
public class AutoCristal extends Module {
   public final UvNnUnuNUUU NVNnnvnuunNv = new UvNnUnuNUUU("Режим", "Авто", "Авто", "Недоразвитый");
   public final nNUuNvVn uVunuUNVVUUV = new nNUuNvVn("Скорость", 50.0F, 0.0F, 1000.0F, 10.0F, false);
   public final nNUuNvVn UNnVVNvvnVvU = new nNUuNvVn("Радиус поиска", 4.0F, 1.0F, 6.0F, 1.0F, false);
   public final UUVuuNuvVuVv uNnUnnuNUnNu = new UUVuuNuvVuVv();

   public AutoCristal() {
      this.UuUVuuUu(new nvUuvVvuuN[]{this.NVNnnvnuunNv, this.uVunuUNVVUUV, this.UNnVVNvvnVvU});
   }

   @vuVvUNNvVNV
   public void UuUVuuUu(nVunNNvuv var1) {
      if (!NUvunNNvN.UuUVuuUu()) {
         if (this.uNnUnnuNUnNu.UuUVuuUu((double)((int)this.uVunuUNVVUUV.uUnuvNvvNU()))) {
            int var2 = this.UuUVuuUu(class_1802.field_8301);
            int var3 = this.UuUVuuUu(class_1802.field_8281);
            class_1511 var4 = this.UuuNnUvUuv();
            if (var4 != null) {
               this.UuUVuuUu(var4.method_19538());
               uUnuvNvvNU.field_1761.method_2918(uUnuvNvvNU.field_1724, var4);
               uUnuvNvvNU.field_1724.method_6104(class_1268.field_5808);
               this.uNnUnnuNUnNu.UuUVuuUu();
            } else if (var2 != -1) {
               class_2338 var5 = this.nUUVuvU();
               if (var5 != null) {
                  this.UuUVuuUu(var5.method_46558().method_1031(0.0, 0.5, 0.0));
                  this.UuUVuuUu(var5, var2, class_2350.field_11036);
                  this.uNnUnnuNUnNu.UuUVuuUu();
               } else {
                  if (this.NVNnnvnuunNv.C00OOC00oO("Авто") && var3 != -1) {
                     class_2338 var6 = this.UnUNVVVNuv();
                     if (var6 != null) {
                        this.UuUVuuUu(var6.method_46558());
                        this.UuUVuuUu(var6.method_10074(), var3, class_2350.field_11036);
                        this.uNnUnnuNUnNu.UuUVuuUu();
                     }
                  }
               }
            }
         }
      }
   }

   private void UuUVuuUu(class_2338 var1, int var2, class_2350 var3) {
      this.UuUVuuUu(var2);
      class_243 var4 = var1.method_46558().method_1031(var3.method_10148() * 0.5, var3.method_10164() * 0.5, var3.method_10165() * 0.5);
      class_3965 var5 = new class_3965(var4, var3, var1, false);
      uUnuvNvvNU.field_1761.method_2896(uUnuvNvvNU.field_1724, class_1268.field_5808, var5);
      uUnuvNvvNU.field_1724.method_6104(class_1268.field_5808);
   }

   private class_1511 UuuNnUvUuv() {
      double var1 = this.UNnVVNvvnVvU.uUnuvNvvNU();
      return StreamSupport.<class_1297>stream(uUnuvNvvNU.field_1687.method_18112().spliterator(), false)
         .filter(var0 -> var0 instanceof class_1511)
         .map(var0 -> (class_1511)var0)
         .filter(var2 -> uUnuvNvvNU.field_1724.method_5739(var2) <= var1)
         .min(Comparator.comparingDouble(var0 -> uUnuvNvvNU.field_1724.method_5739(var0)))
         .orElse(null);
   }

   private class_2338 nUUVuvU() {
      double var1 = this.UNnVVNvvnVvU.uUnuvNvvNU();
      class_2338 var3 = uUnuvNvvNU.field_1724.method_24515();
      int var4 = (int)var1;

      for (int var5 = -var4; var5 <= var4; var5++) {
         for (int var6 = -var4; var6 <= var4; var6++) {
            for (int var7 = -var4; var7 <= var4; var7++) {
               class_2338 var8 = var3.method_10069(var5, var6, var7);
               if (!(uUnuvNvvNU.field_1724.method_5707(var8.method_46558()) > var1 * var1)
                  && (
                     uUnuvNvvNU.field_1687.method_8320(var8).method_27852(class_2246.field_10540)
                        || uUnuvNvvNU.field_1687.method_8320(var8).method_27852(class_2246.field_9987)
                  )
                  && uUnuvNvvNU.field_1687.method_22347(var8.method_10084())
                  && uUnuvNvvNU.field_1687.method_8335(null, new class_238(var8.method_10084())).isEmpty()) {
                  return var8;
               }
            }
         }
      }

      return null;
   }

   private class_2338 UnUNVVVNuv() {
      double var1 = this.UNnVVNvvnVvU.uUnuvNvvNU();
      class_2338 var3 = uUnuvNvvNU.field_1724.method_24515();
      int var4 = (int)var1;

      for (int var5 = -var4; var5 <= var4; var5++) {
         for (int var6 = -var4; var6 <= var4; var6++) {
            for (int var7 = -var4; var7 <= var4; var7++) {
               class_2338 var8 = var3.method_10069(var5, var6, var7);
               if (!(uUnuvNvvNU.field_1724.method_5707(var8.method_46558()) > var1 * var1)
                  && uUnuvNvvNU.field_1687.method_22347(var8)
                  && uUnuvNvvNU.field_1687.method_8320(var8.method_10074()).method_26212(uUnuvNvvNU.field_1687, var8.method_10074())
                  && uUnuvNvvNU.field_1687.method_22347(var8.method_10084())
                  && uUnuvNvvNU.field_1687.method_8335(null, new class_238(var8)).isEmpty()
                  && uUnuvNvvNU.field_1687.method_8335(null, new class_238(var8.method_10084())).isEmpty()) {
                  return var8;
               }
            }
         }
      }

      return null;
   }

   private int UuUVuuUu(class_1792 var1) {
      for (int var2 = 0; var2 < 9; var2++) {
         if (uUnuvNvvNU.field_1724.method_31548().method_5438(var2).method_31574(var1)) {
            return var2;
         }
      }

      return -1;
   }

   private void UuUVuuUu(int var1) {
      if (var1 != uUnuvNvvNU.field_1724.method_31548().method_67532() && var1 >= 0 && var1 < 9) {
         uUnuvNvvNU.field_1724.method_31548().method_61496(var1);
         uUnuvNvvNU.method_1562().method_52787(new class_2868(var1));
      }
   }

   private void UuUVuuUu(class_243 var1) {
      class_243 var2 = var1.method_1020(uUnuvNvvNU.field_1724.method_33571());
      float var3 = (float)Math.toDegrees(Math.atan2(-var2.field_1352, var2.field_1350));
      float var4 = (float)(-Math.toDegrees(Math.atan2(var2.field_1351, Math.hypot(var2.field_1352, var2.field_1350))));
      COC0OCc.UuUVuuUu(new uuUuvNuNVNVU(var3, var4), 180.0F, 180.0F, 180.0F, 180.0F, 1, 10, false);
   }

   @Override
   public void C00OOC00oO() {
      COC0OCc.UuUVuuUu = COC0OCc.VvunVVUvUNnv.IDLE;
      COC0OCc.nuUnNvnuUu = 0;
      COC0OCc.uVUuuVnNVU = null;
      NNvvnnunn.UuUVuuUu = false;
      super.C00OOC00oO();
   }
}
