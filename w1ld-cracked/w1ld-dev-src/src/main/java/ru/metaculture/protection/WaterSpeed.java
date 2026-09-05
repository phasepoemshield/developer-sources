package ru.metaculture.protection;

import net.minecraft.class_1322;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_1890;
import net.minecraft.class_1893;
import net.minecraft.class_2246;
import net.minecraft.class_2338;
import net.minecraft.class_243;
import net.minecraft.class_5134;
import net.minecraft.class_6880;
import net.minecraft.class_7924;
import net.minecraft.class_9274;
import net.minecraft.class_9285;
import net.minecraft.class_9334;
import net.minecraft.class_1322.class_1323;
import org.wild.module.api.Module;
import org.wild.module.api.ModuleRegister;

@ModuleRegister(
   UuUVuuUu = "WaterSpeed",
   uUnuvNvvNU = oOOOo0.Movement,
   C00OOC00oO = "Ускорение в воде!"
)
public class WaterSpeed extends Module {
   public final UvNnUnuNUUU NVNnnvnuunNv = new UvNnUnuNUUU("Режим", "HVH", "HVH");
   private final UUVuuNuvVuVv UNnVVNvvnVvU = new UUVuuNuvVuVv();
   private final UUVuuNuvVuVv uNnUnnuNUnNu = new UUVuuNuvVuVv();
   private boolean NnUuNNU = false;
   private boolean nNvNUVU = false;
   float uVunuUNVVUUV;

   public WaterSpeed() {
      this.UuUVuuUu(new nvUuvVvuuN[]{this.NVNnnvnuunNv});
   }

   private boolean UuuNnUvUuv() {
      class_2338 var1 = uUnuvNvvNU.field_1724.method_24515();
      class_2338 var2 = var1.method_10086(1);
      class_2338 var3 = var1.method_10086(2);
      boolean var4 = uUnuvNvvNU.field_1687.method_8320(var2).method_26204() == class_2246.field_10295
         || uUnuvNvvNU.field_1687.method_8320(var3).method_26204() == class_2246.field_10295;
      boolean var5 = VUUuVvvnNVUu.UuUVuuUu(class_2246.field_10295, var1, 1.0F, 1.0F);
      return var4 || var5;
   }

   @vuVvUNNvVNV
   public void UuUVuuUu(nVunNNvuv var1) {
      if (!NUvunNNvN.UuUVuuUu()) {
         if (UNnnNuVnu.UuUVuuUu()) {
            this.UNnVVNvvnVvU.UuUVuuUu();
         }

         if (this.NVNnnvnuunNv.C00OOC00oO("FunTime") && uUnuvNvvNU.field_1724.method_5799()) {
            boolean var2 = uUnuvNvvNU.field_1690.field_1894.method_1434();
            class_6880 var3 = (class_6880)uUnuvNvvNU.field_1687
               .method_30349()
               .method_30530(class_7924.field_41265)
               .method_46746(class_1893.field_9128)
               .orElseThrow();
            int var4 = class_1890.method_8203(var3, uUnuvNvvNU.field_1724);
            boolean var5 = var4 >= 3;
            class_1799 var6 = uUnuvNvvNU.field_1724.method_6079();
            boolean var7 = !var6.method_7960() && var6.method_7909() == class_1802.field_8575;
            boolean var8 = false;
            if (var7) {
               class_9285 var9 = (class_9285)var6.method_58694(class_9334.field_49636);
               if (var9 != null) {
                  var8 = var9.comp_2393().stream().anyMatch(var0 -> {
                     boolean var1x = var0.comp_2397() == class_9274.field_49218 || var0.comp_2397() == class_9274.field_49216;
                     boolean var2x = var0.comp_2395() == class_5134.field_23719;
                     class_1322 var3x = var0.comp_2396();
                     boolean var4x = var3x.comp_2450() == class_1323.field_6331 || var3x.comp_2450() == class_1323.field_6330;
                     return var1x && var2x && var4x && var3x.comp_2449() >= 0.14 && var3x.comp_2449() <= 0.16;
                  });
               }
            }

            boolean var12 = this.UuuNnUvUuv();
            if (var12 && !this.NnUuNNU && !this.nNvNUVU) {
               this.NnUuNNU = true;
               this.nNvNUVU = true;
               this.uNnUnnuNUnNu.UuUVuuUu();
            }

            if (!this.NnUuNNU || !this.nNvNUVU || !this.uNnUnnuNUnNu.C00OOC00oO(3000.0)) {
               this.uVunuUNVVUUV = 1.0481F;
            } else if (var5 && var12) {
               this.uVunuUNVVUUV = 1.175F;
            } else {
               this.uVunuUNVVUUV = 1.04839F;
            }

            if (!var12) {
               this.NnUuNNU = false;
               this.nNvNUVU = false;
            }

            if (var2) {
               class_243 var10 = uUnuvNvvNU.field_1724.method_18798();
               uUnuvNvvNU.field_1724.method_18800(var10.field_1352 * this.uVunuUNVVUUV, var10.field_1351, var10.field_1350 * this.uVunuUNVVUUV);
            }
         }
      }
   }
}
