package ru.metaculture.protection;

import java.util.ArrayList;
import java.util.List;
import net.minecraft.class_1657;
import net.minecraft.class_238;
import net.minecraft.class_243;
import net.minecraft.class_2596;
import net.minecraft.class_2824;
import net.minecraft.class_5498;
import net.minecraft.class_746;
import org.wild.module.api.Module;
import org.wild.module.api.ModuleRegister;

@ModuleRegister(
   UuUVuuUu = "Blink",
   C00OOC00oO = "Замедляет пакеты имитируя пинг",
   uUnuvNvvNU = oOOOo0.Player,
   vVvUvVVuuNvV = {uVUNNUnNvU.RISKY, uVUNNUnNvU.GRIM}
)
public class Blink extends Module {
   private static final int NVNnnvnuunNv = -1258291201;
   private final List<class_2596<?>> uVunuUNVVUUV = new ArrayList<>();
   private final vvNnnUNnVvn UNnVVNvvnVvU = new vvNnnUNnVvn("Пульсировать", false);
   private final nNUuNvVn uNnUnnuNUnNu = new nNUuNvVn("Задержка", 12.0F, 1.0F, 40.0F, 1.0F, false).UuUVuuUu(() -> !this.UNnVVNvvnVvU.uUnuvNvvNU());
   private final vvNnnUNnVvn NnUuNNU = new vvNnnUNnVvn("Сброс при ударе", false);
   private final vvNnnUNnVvn nNvNUVU = new vvNnnUNnVvn("Отображать модель", true);
   private final vvNnnUNnVvn UnUNuUU = new vvNnnUNnVvn("Убирать от первого лица", true).UuUVuuUu(() -> !this.nNvNUVU.uUnuvNvvNU());
   private class_243 uUVuVvuNUvnu;
   private boolean UvUvUNuvNU;
   private boolean c0oOOCcCoC0;
   private boolean VVnVNnunVvu;
   private long unNNVVNnvvV;

   public Blink() {
      this.UuUVuuUu(new nvUuvVvuuN[]{this.UNnVVNvvnVvU, this.uNnUnnuNUnNu, this.NnUuNNU, this.nNvNUVU, this.UnUNuUU});
   }

   @Override
   public void UuUVuuUu() {
      if (!this.nUUVuvU()) {
         this.UuUVuuUu(false);
      } else {
         this.uVunuUNVVUUV.clear();
         this.uUVuVvuNUvnu = uUnuvNvvNU.field_1724.method_19538();
         this.UvUvUNuvNU = false;
         this.VVnVNnunVvu = false;
         this.unNNVVNnvvV = System.currentTimeMillis();
         super.UuUVuuUu();
      }
   }

   @Override
   public void C00OOC00oO() {
      if (!this.c0oOOCcCoC0) {
         this.UuuNnUvUuv();
      }

      this.uVunuUNVVUUV.clear();
      this.uUVuVvuNUvnu = null;
      this.UvUvUNuvNU = false;
      this.VVnVNnunVvu = false;
      this.c0oOOCcCoC0 = false;
      super.C00OOC00oO();
   }

   @vuVvUNNvVNV
   public void UuUVuuUu(uvUUuvnunU var1) {
      if (var1.uUnuvNvvNU() && !this.UvUvUNuvNU && this.nUUVuvU()) {
         if (this.VVnVNnunVvu) {
            this.VVnVNnunVvu = false;
            if (var1.vVvUvVVuuNvV() instanceof class_2824) {
               return;
            }
         }

         this.uVunuUNVVUUV.add(var1.vVvUvVVuuNvV());
         var1.C00OOC00oO();
      }
   }

   @vuVvUNNvVNV
   public void UuUVuuUu(uNvNuNnVNUvv var1) {
      if (this.NnUuNNU.uUnuvNvvNU()
         && this.nUUVuvU()
         && var1.uUnuvNvvNU() instanceof class_1657 var2
         && var2 != uUnuvNvvNU.field_1724
         && !(var2 instanceof class_746)) {
         this.UuuNnUvUuv();
         this.uVunuUNVVUUV.clear();
         this.uUVuVvuNUvnu = uUnuvNvvNU.field_1724.method_19538();
         this.VVnVNnunVvu = true;
         this.unNNVVNnvvV = System.currentTimeMillis();
      }
   }

   @vuVvUNNvVNV
   public void UuUVuuUu(nVUVuNnVvU var1) {
      if (this.UNnVVNvvnVvU.uUnuvNvvNU() && !this.uVunuUNVVUUV.isEmpty()) {
         if (System.currentTimeMillis() - this.unNNVVNnvvV >= this.UnUNVVVNuv()) {
            this.UuuNnUvUuv();
            this.uVunuUNVVUUV.clear();
            this.uUVuVvuNUvnu = uUnuvNvvNU.field_1724 != null ? uUnuvNvvNU.field_1724.method_19538() : null;
            this.unNNVVNnvvV = System.currentTimeMillis();
         }
      }
   }

   @vuVvUNNvVNV
   public void UuUVuuUu(uUnnuUn var1) {
      if (this.nNvNUVU.uUnuvNvvNU() && this.uUVuVvuNUvnu != null && uUnuvNvvNU.field_1724 != null && uUnuvNvvNU.field_1687 != null) {
         if (uUnuvNvvNU.field_1690.method_31044() != class_5498.field_26664 || !this.UnUNuUU.uUnuvNvvNU()) {
            class_238 var2 = uUnuvNvvNU.field_1724.method_5829().method_997(this.uUVuVvuNUvnu.method_1020(uUnuvNvvNU.field_1724.method_19538()));
            this.UuUVuuUu(var1, var2, -1258291201);
         }
      }
   }

   @vuVvUNNvVNV
   public void UuUVuuUu(NnVNuVNVuU var1) {
      this.c0oOOCcCoC0 = true;
      this.UuUVuuUu(false);
   }

   @vuVvUNNvVNV
   public void UuUVuuUu(coOCCcooOcOO var1) {
      this.c0oOOCcCoC0 = true;
      this.UuUVuuUu(false);
   }

   private void UuuNnUvUuv() {
      if (!this.uVunuUNVVUUV.isEmpty() && uUnuvNvvNU.method_1562() != null) {
         this.UvUvUNuvNU = true;

         try {
            for (class_2596 var2 : this.uVunuUNVVUUV) {
               uUnuvNvvNU.method_1562().method_52787(var2);
            }
         } finally {
            this.UvUvUNuvNU = false;
         }
      }
   }

   private boolean nUUVuvU() {
      return uUnuvNvvNU.field_1724 != null && uUnuvNvvNU.field_1687 != null && uUnuvNvvNU.method_1562() != null;
   }

   private long UnUNVVVNuv() {
      return Math.round(this.uNnUnnuNUnNu.uUnuvNvvNU() * 50.0F);
   }

   private void UuUVuuUu(uUnnuUn var1, class_238 var2, int var3) {
      class_243 var4 = new class_243(var2.field_1323, var2.field_1322, var2.field_1321);
      class_243 var5 = new class_243(var2.field_1320, var2.field_1325, var2.field_1324);
      class_243 var6 = new class_243(var4.field_1352, var4.field_1351, var4.field_1350);
      class_243 var7 = new class_243(var4.field_1352, var4.field_1351, var5.field_1350);
      class_243 var8 = new class_243(var4.field_1352, var5.field_1351, var4.field_1350);
      class_243 var9 = new class_243(var4.field_1352, var5.field_1351, var5.field_1350);
      class_243 var10 = new class_243(var5.field_1352, var4.field_1351, var4.field_1350);
      class_243 var11 = new class_243(var5.field_1352, var4.field_1351, var5.field_1350);
      class_243 var12 = new class_243(var5.field_1352, var5.field_1351, var4.field_1350);
      class_243 var13 = new class_243(var5.field_1352, var5.field_1351, var5.field_1350);
      var1.uNNnnnuuuN().UuUVuuUu(var6, var10, 1.0, var3, false);
      var1.uNNnnnuuuN().UuUVuuUu(var10, var11, 1.0, var3, false);
      var1.uNNnnnuuuN().UuUVuuUu(var11, var7, 1.0, var3, false);
      var1.uNNnnnuuuN().UuUVuuUu(var7, var6, 1.0, var3, false);
      var1.uNNnnnuuuN().UuUVuuUu(var8, var12, 1.0, var3, false);
      var1.uNNnnnuuuN().UuUVuuUu(var12, var13, 1.0, var3, false);
      var1.uNNnnnuuuN().UuUVuuUu(var13, var9, 1.0, var3, false);
      var1.uNNnnnuuuN().UuUVuuUu(var9, var8, 1.0, var3, false);
      var1.uNNnnnuuuN().UuUVuuUu(var6, var8, 1.0, var3, false);
      var1.uNNnnnuuuN().UuUVuuUu(var10, var12, 1.0, var3, false);
      var1.uNNnnnuuuN().UuUVuuUu(var11, var13, 1.0, var3, false);
      var1.uNNnnnuuuN().UuUVuuUu(var7, var9, 1.0, var3, false);
   }
}
