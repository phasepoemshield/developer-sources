package ru.metaculture.protection;

import java.util.concurrent.ThreadLocalRandom;
import net.minecraft.class_1294;
import net.minecraft.class_1297;
import net.minecraft.class_1511;
import net.minecraft.class_2246;
import net.minecraft.class_238;
import net.minecraft.class_3532;
import net.minecraft.class_2338.class_2339;
import net.minecraft.class_2828.class_2830;
import org.wild.module.api.Module;
import org.wild.module.api.ModuleRegister;

@ModuleRegister(
   UuUVuuUu = "Criticals",
   C00OOC00oO = "Критический удар под плавным падением или в паутине",
   uUnuvNvvNU = oOOOo0.Combat,
   vVvUvVVuuNvV = {uVUNNUnNvU.RISKY, uVUNNUnNvU.GRIM}
)
public class Criticals extends Module {
   public static boolean NVNnnvnuunNv;
   public final VUVnvvnNN uVunuUNVVUUV = new VUVnvvnNN("Условия", new vvNnnUNnVvn("Паутина", true), new vvNnnUNnVvn("Плавное падение", true));

   public Criticals() {
      this.UuUVuuUu(new nvUuvVvuuN[]{this.uVunuUNVVUUV});
   }

   @vuVvUNNvVNV
   public void UuUVuuUu(uNvNuNnVNUvv var1) {
      if (!NVNnnvnuunNv) {
         if (!VUUuVvvnNVUu.UuUVuuUu() && uUnuvNvvNU.field_1724 != null && uUnuvNvvNU.field_1687 != null) {
            if (uUnuvNvvNU.field_1724.field_3944 != null) {
               if (!uUnuvNvvNU.field_1724.method_6128()) {
                  class_1297 var2 = var1.uUnuvNvvNU();
                  if (var2 != null && var2 != uUnuvNvvNU.field_1724 && !(var2 instanceof class_1511)) {
                     boolean var3 = this.uVunuUNVVUUV.C00OOC00oO("Паутина") && this.UuuNnUvUuv();
                     boolean var4 = this.uVunuUNVVUUV.C00OOC00oO("Плавное падение") && uUnuvNvvNU.field_1724.method_6059(class_1294.field_5906);
                     if (var3 || var4) {
                        float var5 = class_3532.method_16439(ThreadLocalRandom.current().nextFloat(), 1.0E-7F, 1.0E-6F);
                        uUnuvNvvNU.field_1724.field_6017 = var5;
                        uUnuvNvvNU.field_1724
                           .field_3944
                           .method_52787(
                              new class_2830(
                                 uUnuvNvvNU.field_1724.method_23317(),
                                 uUnuvNvvNU.field_1724.method_23318() - var5,
                                 uUnuvNvvNU.field_1724.method_23321(),
                                 uUnuvNvvNU.field_1724.method_36454(),
                                 uUnuvNvvNU.field_1724.method_36455(),
                                 false,
                                 uUnuvNvvNU.field_1724.field_5976
                              )
                           );
                     }
                  }
               }
            }
         }
      }
   }

   private boolean UuuNnUvUuv() {
      class_238 var1 = uUnuvNvvNU.field_1724.method_5829().method_1011(1.0E-7);
      int var2 = class_3532.method_15357(var1.field_1323);
      int var3 = class_3532.method_15357(var1.field_1320);
      int var4 = class_3532.method_15357(var1.field_1322);
      int var5 = class_3532.method_15357(var1.field_1325);
      int var6 = class_3532.method_15357(var1.field_1321);
      int var7 = class_3532.method_15357(var1.field_1324);
      class_2339 var8 = new class_2339();

      for (int var9 = var2; var9 <= var3; var9++) {
         for (int var10 = var4; var10 <= var5; var10++) {
            for (int var11 = var6; var11 <= var7; var11++) {
               var8.method_10103(var9, var10, var11);
               if (uUnuvNvvNU.field_1687.method_8320(var8).method_27852(class_2246.field_10343)) {
                  return true;
               }
            }
         }
      }

      return false;
   }
}
