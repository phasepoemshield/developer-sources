package ru.metaculture.protection;

import net.minecraft.class_1268;
import net.minecraft.class_1747;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_243;
import net.minecraft.class_2680;
import net.minecraft.class_3532;
import net.minecraft.class_3965;
import net.minecraft.class_2350.class_2351;
import org.wild.module.api.Module;
import org.wild.module.api.ModuleRegister;

@ModuleRegister(
   UuUVuuUu = "Scaffold",
   C00OOC00oO = "Ставит блоки под себя, пойдет под сервера с мини играми",
   uUnuvNvvNU = oOOOo0.Misc
)
public class Scaffold extends Module {
   private class_2338 NVNnnvnuunNv = null;
   private class_2350 uVunuUNVVUUV = null;

   @Override
   public void UuUVuuUu() {
      this.NVNnnvnuunNv = null;
      this.uVunuUNVVUUV = null;
      super.UuUVuuUu();
   }

   @Override
   public void C00OOC00oO() {
      uUnuvNvvNU.field_1690.field_1913.method_23481(false);
      uUnuvNvvNU.field_1690.field_1849.method_23481(false);
      uUnuvNvvNU.field_1690.field_1832.method_23481(false);
      super.C00OOC00oO();
   }

   @vuVvUNNvVNV
   public void UuUVuuUu(nVunNNvuv var1) {
      if (uUnuvNvvNU.field_1724 != null && uUnuvNvvNU.field_1687 != null) {
         this.UuuNnUvUuv();
         this.nUUVuvU();
         if (this.NVNnnvnuunNv != null && this.uVunuUNVVUUV != null && this.UnUNVVVNuv()) {
            VvUNVunnuu.UuUVuuUu(this.NVNnnvnuunNv, this.uVunuUNVVUUV);
            if (this.C00OOC00oO(this.NVNnnvnuunNv, this.uVunuUNVVUUV)) {
               this.UuUVuuUu(this.NVNnnvnuunNv, this.uVunuUNVVUUV);
            }
         }
      }
   }

   private void UuuNnUvUuv() {
      class_2338 var1 = class_2338.method_49638(uUnuvNvvNU.field_1724.method_19538().method_1031(0.0, -1.0, 0.0));
      if (!uUnuvNvvNU.field_1687.method_8320(var1).method_45474()) {
         this.NVNnnvnuunNv = null;
         this.uVunuUNVVUUV = null;
      } else {
         class_2350[] var2 = new class_2350[]{
            class_2350.field_11033, class_2350.field_11043, class_2350.field_11035, class_2350.field_11039, class_2350.field_11034
         };

         for (class_2350 var6 : var2) {
            class_2338 var7 = var1.method_10093(var6);
            class_2680 var8 = uUnuvNvvNU.field_1687.method_8320(var7);
            if (!var8.method_45474() && var8.method_26227().method_15769()) {
               this.NVNnnvnuunNv = var7;
               this.uVunuUNVVUUV = var6.method_10153();
               return;
            }
         }
      }
   }

   private void UuUVuuUu(class_2338 var1, class_2350 var2) {
      class_243 var3 = uUnuvNvvNU.field_1724.method_33571();
      double var4 = var1.method_10263() + 0.5 + var2.method_10148() * 0.5;
      double var6 = var1.method_10264() + 0.5 + var2.method_10164() * 0.5;
      double var8 = var1.method_10260() + 0.5 + var2.method_10165() * 0.5;
      if (var2.method_10166() != class_2351.field_11048) {
         var4 = class_3532.method_15350(var3.field_1352, var1.method_10263() + 0.15, var1.method_10263() + 0.85);
      }

      if (var2.method_10166() != class_2351.field_11052) {
         var6 = class_3532.method_15350(var3.field_1351 - 1.2, var1.method_10264() + 0.15, var1.method_10264() + 0.85);
      }

      if (var2.method_10166() != class_2351.field_11051) {
         var8 = class_3532.method_15350(var3.field_1350, var1.method_10260() + 0.15, var1.method_10260() + 0.85);
      }

      class_243 var10 = new class_243(var4, var6, var8);
      class_3965 var11 = new class_3965(var10, var2, var1, false);
      uUnuvNvvNU.field_1761.method_2896(uUnuvNvvNU.field_1724, class_1268.field_5808, var11);
      uUnuvNvvNU.field_1724.method_6104(class_1268.field_5808);
      this.NVNnnvnuunNv = null;
      this.uVunuUNVVUUV = null;
   }

   private boolean C00OOC00oO(class_2338 var1, class_2350 var2) {
      float var3 = NNvvnnunn.uUnuvNvvNU;
      float var4 = NNvvnnunn.vVvUvVVuuNvV;
      class_243 var5 = uUnuvNvvNU.field_1724.method_33571();
      class_243 var6 = this.UuUVuuUu(var4, var3);
      double var7 = var1.method_10263() + 0.5 + var2.method_10148() * 0.5;
      double var9 = var1.method_10264() + 0.5 + var2.method_10164() * 0.5;
      double var11 = var1.method_10260() + 0.5 + var2.method_10165() * 0.5;
      if (var2.method_10166() != class_2351.field_11048) {
         var7 = class_3532.method_15350(var5.field_1352, var1.method_10263() + 0.15, var1.method_10263() + 0.85);
      }

      if (var2.method_10166() != class_2351.field_11052) {
         var9 = class_3532.method_15350(var5.field_1351 - 1.2, var1.method_10264() + 0.15, var1.method_10264() + 0.85);
      }

      if (var2.method_10166() != class_2351.field_11051) {
         var11 = class_3532.method_15350(var5.field_1350, var1.method_10260() + 0.15, var1.method_10260() + 0.85);
      }

      class_243 var13 = new class_243(var7, var9, var11).method_1020(var5).method_1029();
      double var14 = var6.method_1026(var13);
      return var14 > 0.95;
   }

   private void nUUVuvU() {
      if (uUnuvNvvNU.field_1690.field_1881.method_1434() && this.UnUNVVVNuv() && !uUnuvNvvNU.field_1690.field_1903.method_1434()) {
         uUnuvNvvNU.field_1690.field_1913.method_23481(false);
         uUnuvNvvNU.field_1690.field_1849.method_23481(false);
         class_2338 var1 = class_2338.method_49637(
            uUnuvNvvNU.field_1724.method_23317(), uUnuvNvvNU.field_1724.method_23318() - 0.5, uUnuvNvvNU.field_1724.method_23321()
         );
         boolean var2 = uUnuvNvvNU.field_1687.method_8320(var1).method_45474();
         uUnuvNvvNU.field_1690.field_1832.method_23481(var2);
      } else {
         uUnuvNvvNU.field_1690.field_1913.method_23481(uUnuvNvvNU.field_1690.field_1913.method_1434());
         uUnuvNvvNU.field_1690.field_1849.method_23481(uUnuvNvvNU.field_1690.field_1849.method_1434());
         uUnuvNvvNU.field_1690.field_1832.method_23481(uUnuvNvvNU.field_1690.field_1832.method_1434());
      }
   }

   private boolean UnUNVVVNuv() {
      return uUnuvNvvNU.field_1724.method_6047().method_7909() instanceof class_1747 || uUnuvNvvNU.field_1724.method_6079().method_7909() instanceof class_1747;
   }

   private class_243 UuUVuuUu(float var1, float var2) {
      float var3 = var1 * (float) (Math.PI / 180.0);
      float var4 = -var2 * (float) (Math.PI / 180.0);
      float var5 = class_3532.method_15362(var4);
      float var6 = class_3532.method_15374(var4);
      float var7 = class_3532.method_15362(var3);
      float var8 = class_3532.method_15374(var3);
      return new class_243(var6 * var7, -var8, var5 * var7);
   }
}
