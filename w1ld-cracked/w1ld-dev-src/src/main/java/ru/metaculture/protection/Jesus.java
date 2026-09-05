package ru.metaculture.protection;

import net.minecraft.class_1293;
import net.minecraft.class_1294;
import net.minecraft.class_1304;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_2828.class_2829;
import org.wild.module.api.Module;
import org.wild.module.api.ModuleRegister;

@ModuleRegister(
   UuUVuuUu = "Jesus",
   uUnuvNvvNU = oOOOo0.Movement,
   C00OOC00oO = "ходьба по воде"
)
public class Jesus extends Module {
   private final UvNnUnuNUUU NVNnnvnuunNv = new UvNnUnuNUUU("Режим", "Авто", "Авто", "Простой");
   private final nNUuNvVn uVunuUNVVUUV = new nNUuNvVn("Скорость", 0.2F, 0.2F, 1.05F, 0.01F, false).UuUVuuUu(() -> !this.NVNnnvnuunNv.C00OOC00oO("Простой"));
   private final nNUuNvVn UNnVVNvvnVvU = new nNUuNvVn("Скорость Funtime", 1.175F, 1.0F, 1.2F, 0.005F, false)
      .UuUVuuUu(() -> !this.NVNnnvnuunNv.C00OOC00oO("Funtime"));
   private final uVNuNUVvn uNnUnnuNUnNu = new uVNuNUVvn("Кнопка буста", -1);
   private long NnUuNNU = 0L;
   private boolean nNvNUVU = false;
   private boolean UnUNuUU = false;
   private final float uUVuVvuNUvnu = 0.47F;
   private final float UvUvUNuvNU = 0.43F;
   private int c0oOOCcCoC0 = 0;

   public Jesus() {
      this.UuUVuuUu(new nvUuvVvuuN[]{this.NVNnnvnuunNv, this.uVunuUNVVUUV, this.UNnVVNvvnVvU, this.uNnUnnuNUnNu});
   }

   @vuVvUNNvVNV
   public void UuUVuuUu(vVvuNVUVvNv var1) {
      if (uUnuvNvvNU.field_1755 == null && var1.nuUnNvnuUu() == 1) {
         if (var1.vVvUvVVuuNvV() == this.uNnUnnuNUnNu.uUnuvNvvNU()) {
            this.UnUNuUU = true;
         }
      }
   }

   @vuVvUNNvVNV
   public void UuUVuuUu(nVunNNvuv var1) {
      if (uUnuvNvvNU.field_1724 != null && uUnuvNvvNU.field_1687 != null) {
         if (this.UnUNuUU) {
            this.nNvNUVU = true;
            this.NnUuNNU = System.currentTimeMillis() + 2000L;
            this.UnUNuUU = false;
         }

         if (this.nNvNUVU && System.currentTimeMillis() > this.NnUuNNU) {
            this.nNvNUVU = false;
         }

         if (uUnuvNvvNU.field_1724.method_5799() || uUnuvNvvNU.field_1724.method_5771()) {
            class_1293 var2 = uUnuvNvvNU.field_1724.method_6112(class_1294.field_5904);
            class_1293 var3 = uUnuvNvvNU.field_1724.method_6112(class_1294.field_5909);
            class_1799 var4 = uUnuvNvvNU.field_1724.method_6079();
            String var5 = var4.method_7964().getString();
            class_1799 var6 = uUnuvNvvNU.field_1724.method_6118(class_1304.field_6169);
            class_1799 var7 = uUnuvNvvNU.field_1724.method_6118(class_1304.field_6174);
            class_1799 var8 = uUnuvNvvNU.field_1724.method_6118(class_1304.field_6172);
            class_1799 var9 = uUnuvNvvNU.field_1724.method_6118(class_1304.field_6166);
            String var10 = var6.method_7964().getString();
            String var11 = var7.method_7964().getString();
            String var12 = var8.method_7964().getString();
            String var13 = var9.method_7964().getString();
            if (this.NVNnnvnuunNv.C00OOC00oO("Funtime")) {
               this.UuuNnUvUuv();
               return;
            }

            float var14 = this.UuUVuuUu(var2, var3, var5);
            var14 = this.UuUVuuUu(var14, var6, var10, var7, var11, var8, var12, var9, var13);
            if (this.nNvNUVU) {
               var14 *= 1.89F;
            }

            UNnnNuVnu.C00OOC00oO(var14);
            boolean var15 = uUnuvNvvNU.field_1690.field_1894.method_1434()
               || uUnuvNvvNU.field_1690.field_1881.method_1434()
               || uUnuvNvvNU.field_1690.field_1913.method_1434()
               || uUnuvNvvNU.field_1690.field_1849.method_1434();
            if (!var15) {
               uUnuvNvvNU.field_1724.method_18800(0.0, uUnuvNvvNU.field_1724.method_18798().field_1351, 0.0);
            }

            double var16 = uUnuvNvvNU.field_1690.field_1903.method_1434() ? 0.019 : 0.003;
            uUnuvNvvNU.field_1724.method_18800(uUnuvNvvNU.field_1724.method_18798().field_1352, var16, uUnuvNvvNU.field_1724.method_18798().field_1350);
         }
      }
   }

   private void UuuNnUvUuv() {
      if (uUnuvNvvNU.field_1724 != null && uUnuvNvvNU.field_1724.field_3944 != null) {
         double var1 = Math.ceil(uUnuvNvvNU.field_1724.method_23318()) - 0.001;
         uUnuvNvvNU.field_1724
            .field_3944
            .method_52787(
               new class_2829(uUnuvNvvNU.field_1724.method_23317(), var1, uUnuvNvvNU.field_1724.method_23321(), true, uUnuvNvvNU.field_1724.field_5976)
            );
      }
   }

   private float UuUVuuUu(class_1293 var1, class_1293 var2, String var3) {
      float var4 = 0.0F;
      if (this.NVNnnvnuunNv.C00OOC00oO("Авто")) {
         if (var1 != null) {
            if (var1.method_5578() == 2) {
               var4 = this.UuUVuuUu(var3) ? 0.58515F : 0.53535F;
            } else if (var1.method_5578() == 1) {
               var4 = this.UuUVuuUu(var3) ? 0.47F : 0.43F;
            }
         } else {
            var4 = this.UuUVuuUu(var3) ? 0.3243F : 0.2967F;
         }
      } else if (this.NVNnnvnuunNv.C00OOC00oO("Простой")) {
         var4 = this.uVunuUNVVUUV.uUnuvNvvNU();
      }

      if (var2 != null) {
         var4 *= 0.85F;
      }

      return var4;
   }

   private boolean UuUVuuUu(String var1) {
      return var1.contains("Шар Геракла 2")
         || var1.contains("Шар CHAMPION")
         || var1.contains("Шар Аида 2")
         || var1.contains("Шар GOD")
         || var1.contains("КУБИК-РУБИК");
   }

   private float UuUVuuUu(float var1, class_1799 var2, String var3, class_1799 var4, String var5, class_1799 var6, String var7, class_1799 var8, String var9) {
      if (var8.method_7909() == class_1802.field_8753 && var9.contains("Тапочки админа SoveryBRIZ")) {
         var1 *= 1.01F;
      }

      if (var6.method_7909() == class_1802.field_8416 && var7.contains("Штаны админа stqffy")) {
         var1 *= 1.02F;
      }

      if (var2.method_7909() == class_1802.field_8862 && var3.contains("Шляпа админа Vester")) {
         var1 *= 1.05F;
      }

      if (var4.method_7909() == class_1802.field_8678 && var5.contains("Грудак админа lxckscream")) {
         var1 *= 1.03F;
      }

      if (var2.method_7909() == class_1802.field_8575 && var3.contains("Новогодний Подарок")) {
         var1 *= 0.75F;
      }

      return var1;
   }
}
