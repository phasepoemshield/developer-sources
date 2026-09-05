package ru.metaculture.protection;

import java.util.Optional;
import net.minecraft.class_1268;
import net.minecraft.class_1269;
import net.minecraft.class_1923;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_238;
import net.minecraft.class_243;
import net.minecraft.class_2586;
import net.minecraft.class_2595;
import net.minecraft.class_2601;
import net.minecraft.class_2608;
import net.minecraft.class_2609;
import net.minecraft.class_2611;
import net.minecraft.class_2614;
import net.minecraft.class_2627;
import net.minecraft.class_2818;
import net.minecraft.class_3719;
import net.minecraft.class_3965;
import org.wild.module.api.Module;
import org.wild.module.api.ModuleRegister;

@ModuleRegister(
   UuUVuuUu = "OpenWalls",
   uUnuvNvvNU = oOOOo0.Player,
   C00OOC00oO = "Открывает контейнеры через стены"
)
public class OpenWalls extends Module {
   private final nNUuNvVn NVNnnvnuunNv = new nNUuNvVn("Дистанция", 4.6F, 2.0F, 6.0F, 0.1F, false);
   private long uVunuUNVVUUV;

   public OpenWalls() {
      this.UuUVuuUu(new nvUuvVvuuN[]{this.NVNnnvnuunNv});
   }

   @vuVvUNNvVNV
   public void UuUVuuUu(VnuuuuVvVnN var1) {
      if (!var1.uVUuuVnNVU()) {
         if (var1.vuuuNvNuv() && var1.vVvUvVVuuNvV() == 1) {
            if (uUnuvNvvNU.field_1724 != null && uUnuvNvvNU.field_1687 != null && uUnuvNvvNU.field_1761 != null && uUnuvNvvNU.field_1755 == null) {
               if (System.currentTimeMillis() - this.uVunuUNVVUUV >= 120L) {
                  class_2338 var2 = this.UuuNnUvUuv();
                  if (var2 != null) {
                     class_1269 var3 = this.UuUVuuUu(var2);
                     if (var3 != class_1269.field_5814) {
                        this.uVunuUNVVUUV = System.currentTimeMillis();
                        var1.C00OOC00oO();
                     }
                  }
               }
            }
         }
      }
   }

   private class_2338 UuuNnUvUuv() {
      class_243 var1 = uUnuvNvvNU.field_1724.method_33571();
      class_243 var2 = uUnuvNvvNU.field_1724.method_5828(1.0F).method_1029();
      class_243 var3 = var1.method_1019(var2.method_1021(this.NVNnnvnuunNv.uUnuvNvvNU()));
      class_1923 var4 = uUnuvNvvNU.field_1724.method_31476();
      int var5 = Math.max(1, (int)Math.ceil(this.NVNnnvnuunNv.uUnuvNvvNU() / 16.0F) + 1);
      class_2338 var6 = null;
      double var7 = Double.MAX_VALUE;

      for (int var9 = var4.field_9181 - var5; var9 <= var4.field_9181 + var5; var9++) {
         for (int var10 = var4.field_9180 - var5; var10 <= var4.field_9180 + var5; var10++) {
            class_2818 var11 = uUnuvNvvNU.field_1687.method_8497(var9, var10);
            if (var11 != null) {
               for (class_2586 var13 : var11.method_12214().values()) {
                  if (this.UuUVuuUu(var13)) {
                     class_2338 var14 = var13.method_11016();
                     if (!(uUnuvNvvNU.field_1724.method_5707(class_243.method_24953(var14)) > this.NVNnnvnuunNv.uUnuvNvvNU() * this.NVNnnvnuunNv.uUnuvNvvNU())) {
                        Optional var15 = new class_238(var14).method_1014(0.01).method_992(var1, var3);
                        if (!var15.isEmpty()) {
                           double var16 = var1.method_1025((class_243)var15.get());
                           if (var16 < var7) {
                              var7 = var16;
                              var6 = var14.method_10062();
                           }
                        }
                     }
                  }
               }
            }
         }
      }

      return var6;
   }

   private class_1269 UuUVuuUu(class_2338 var1) {
      class_2350 var2 = this.C00OOC00oO(var1);
      class_243 var3 = new class_243(
         var1.method_10263() + 0.5 + var2.method_10148() * 0.5,
         var1.method_10264() + 0.5 + var2.method_10164() * 0.5,
         var1.method_10260() + 0.5 + var2.method_10165() * 0.5
      );
      class_3965 var4 = new class_3965(var3, var2, var1, false);
      class_1269 var5 = uUnuvNvvNU.field_1761.method_2896(uUnuvNvvNU.field_1724, class_1268.field_5808, var4);
      if (var5 != class_1269.field_5814) {
         uUnuvNvvNU.field_1724.method_6104(class_1268.field_5808);
      }

      return var5;
   }

   private class_2350 C00OOC00oO(class_2338 var1) {
      class_243 var2 = class_243.method_24953(var1);
      class_243 var3 = uUnuvNvvNU.field_1724.method_33571().method_1020(var2);
      return class_2350.method_10142(var3.field_1352, var3.field_1351, var3.field_1350);
   }

   private boolean UuUVuuUu(class_2586 var1) {
      return var1 instanceof class_2595
         || var1 instanceof class_3719
         || var1 instanceof class_2611
         || var1 instanceof class_2627
         || var1 instanceof class_2614
         || var1 instanceof class_2601
         || var1 instanceof class_2608
         || var1 instanceof class_2609;
   }
}
