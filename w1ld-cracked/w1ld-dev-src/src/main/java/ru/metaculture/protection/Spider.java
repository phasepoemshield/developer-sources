package ru.metaculture.protection;

import net.minecraft.class_1268;
import net.minecraft.class_1792;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_2248;
import net.minecraft.class_2338;
import net.minecraft.class_2349;
import net.minecraft.class_2350;
import net.minecraft.class_2354;
import net.minecraft.class_243;
import net.minecraft.class_2533;
import net.minecraft.class_2680;
import net.minecraft.class_2741;
import net.minecraft.class_2868;
import net.minecraft.class_3481;
import net.minecraft.class_3532;
import net.minecraft.class_3749;
import net.minecraft.class_3959;
import net.minecraft.class_3965;
import net.minecraft.class_5554;
import net.minecraft.class_239.class_240;
import net.minecraft.class_3959.class_242;
import net.minecraft.class_3959.class_3960;
import org.wild.module.api.Module;
import org.wild.module.api.ModuleRegister;

@ModuleRegister(
   UuUVuuUu = "Spider",
   uUnuvNvvNU = oOOOo0.Movement,
   C00OOC00oO = "Позволяет лазить по стенам",
   vVvUvVVuuNvV = {uVUNNUnNvU.RISKY, uVUNNUnNvU.MATRIX}
)
public class Spider extends Module {
   public final UvNnUnuNUUU NVNnnvnuunNv = new UvNnUnuNUUU("Режим", "FunTime", "FunTime");
   private final VuNvNNvVV uVunuUNVVUUV = new VuNvNNvVV();
   private final VuNvNNvVV UNnVVNvvnVvU = new VuNvNNvVV();
   private final VuNvNNvVV uNnUnnuNUnNu = new VuNvNNvVV();
   private final VuNvNNvVV NnUuNNU = new VuNvNNvVV();
   private final VuNvNNvVV nNvNUVU = new VuNvNNvVV();
   private boolean UnUNuUU = true;

   public Spider() {
      this.UuUVuuUu(new nvUuvVvuuN[]{this.NVNnnvnuunNv});
   }

   @Override
   public void C00OOC00oO() {
      COC0OCc.UuUVuuUu = COC0OCc.VvunVVUvUNnv.IDLE;
      COC0OCc.nuUnNvnuUu = 0;
      COC0OCc.uVUuuVnNVU = null;
      NNvvnnunn.UuUVuuUu = false;
      if (this.NVNnnvnuunNv.C00OOC00oO("SpookyTime") && uUnuvNvvNU.field_1690 != null) {
         uUnuvNvvNU.field_1690.field_1832.method_23481(false);
      }

      super.C00OOC00oO();
   }

   @vuVvUNNvVNV
   public void UuUVuuUu(NUNnuuNUvuVU var1) {
      if (!NUvunNNvN.UuUVuuUu()) {
         boolean var2 = uUnuvNvvNU.field_1724.field_5976;
         boolean var3 = var2 && uUnuvNvvNU.field_1690.field_1903.method_1434();
         if (this.NVNnnvnuunNv.C00OOC00oO("FunTime") || this.NVNnnvnuunNv.C00OOC00oO("FunTimeNew")) {
            this.UuUVuuUu(var1, var3);
         }

         if (this.NVNnnvnuunNv.C00OOC00oO("FunTimeNew") && var2) {
            this.nUUVuvU();
         }

         if (this.NVNnnvnuunNv.C00OOC00oO("FunTime v2") && var3) {
            this.uUnuvNvvNU(var1);
         }

         if (this.NVNnnvnuunNv.C00OOC00oO("FunTime v3") && var2) {
            this.C00OOC00oO(var1);
         }
      }
   }

   @vuVvUNNvVNV
   public void UuUVuuUu(nVunNNvuv var1) {
      if (this.NVNnnvnuunNv.C00OOC00oO("SpookyTime")) {
         this.UuuNnUvUuv();
      }
   }

   private void C00OOC00oO(NUNnuuNUvuVU var1) {
      int var2 = this.UuUVuuUu(class_1802.field_8048);
      if (var2 != -1) {
         if (uUnuvNvvNU.field_1724.method_24828()) {
            if (this.NnUuNNU.uNNnnnuuuN(100L)) {
               uUnuvNvvNU.field_1724.method_6043();
               this.NnUuNNU.UuUVuuUu();
            }
         } else {
            if (uUnuvNvvNU.field_1724.field_6017 > 0.0 && uUnuvNvvNU.field_1724.field_6017 < 1.5) {
               var1.UuUVuuUu(true);
               uUnuvNvvNU.field_1724.method_24830(true);
               uUnuvNvvNU.field_1724.field_5992 = true;
               this.UuUVuuUu(var2);
               uUnuvNvvNU.field_1724.method_6043();
               uUnuvNvvNU.field_1724.field_6017 = 0.0;
            }
         }
      }
   }

   private void UuUVuuUu(int var1) {
      float var2 = class_2350.method_62673(uUnuvNvvNU.field_1724.method_5735());
      float var3 = 79.0F;
      uuUuvNuNVNVU var4 = new uuUuvNuNVNVU(var2, var3);
      COC0OCc.UuUVuuUu(var4, 360.0F, 360.0F, 10, 1);
      class_243 var5 = uUnuvNvvNU.field_1724.method_5836(1.0F);
      class_243 var6 = this.UuUVuuUu(var3, var2);
      class_243 var7 = var5.method_1031(var6.field_1352 * 4.0, var6.field_1351 * 4.0, var6.field_1350 * 4.0);
      class_3965 var8 = uUnuvNvvNU.field_1687.method_17742(new class_3959(var5, var7, class_3960.field_17559, class_242.field_1348, uUnuvNvvNU.field_1724));
      if (var8 != null && var8.method_17783() == class_240.field_1332) {
         this.UuUVuuUu(var8, var1);
      }
   }

   private void UuuNnUvUuv() {
      if (uUnuvNvvNU.field_1724 != null && uUnuvNvvNU.field_1687 != null) {
         if (!uUnuvNvvNU.field_1724.field_5976) {
            if (uUnuvNvvNU.field_1690.field_1832.method_1434()) {
               uUnuvNvvNU.field_1690.field_1832.method_23481(false);
            }
         } else {
            int var1 = this.UuUVuuUu(class_1802.field_8705);
            int var2 = this.UuUVuuUu(class_1802.field_8550);
            if (var1 != -1 || var2 != -1) {
               if (uUnuvNvvNU.field_1724.method_24828()) {
                  uUnuvNvvNU.field_1724.method_6043();
               } else {
                  uuUuvNuNVNVU var3 = new uuUuvNuNVNVU(uUnuvNvvNU.field_1724.method_36454(), 78.0F);
                  COC0OCc.UuUVuuUu(var3, 20.0F, 100.0F, 4, 1);
                  if (this.UnUNuUU) {
                     this.C00OOC00oO(var1);
                     double var4 = 2.0 + Math.random() * 2.0;
                     class_243 var6 = uUnuvNvvNU.field_1724.method_18798();
                     uUnuvNvvNU.field_1724.method_18800(var6.field_1352, var4, var6.field_1350);
                     this.UnUNuUU = false;
                     this.nNvNUVU.UuUVuuUu();
                  }

                  if (this.nNvNUVU.uNNnnnuuuN(200L)) {
                     if (uUnuvNvvNU.field_1724.method_5799()) {
                        uUnuvNvvNU.field_1724.method_6043();
                        if (var2 != -1) {
                           this.C00OOC00oO(var2);
                        }
                     } else if (var1 != -1) {
                        this.C00OOC00oO(var1);
                     }

                     this.nNvNUVU.UuUVuuUu();
                  }

                  uUnuvNvvNU.field_1690.field_1832.method_23481(true);
               }
            }
         }
      }
   }

   private void C00OOC00oO(int var1) {
      int var2 = uUnuvNvvNU.field_1724.method_31548().method_67532();
      if (var1 != var2) {
         uUnuvNvvNU.field_1724.method_31548().method_61496(var1);
         uUnuvNvvNU.method_1562().method_52787(new class_2868(var1));
      }

      uUnuvNvvNU.field_1761.method_2919(uUnuvNvvNU.field_1724, class_1268.field_5808);
      uUnuvNvvNU.field_1724.method_6104(class_1268.field_5808);
      if (var1 != var2) {
         uUnuvNvvNU.field_1724.method_31548().method_61496(var2);
         uUnuvNvvNU.method_1562().method_52787(new class_2868(var2));
      }
   }

   private void UuUVuuUu(NUNnuuNUvuVU var1, boolean var2) {
      class_2338 var3 = class_2338.method_49638(uUnuvNvvNU.field_1724.method_19538());
      class_2338 var4 = var3.method_10093(uUnuvNvvNU.field_1724.method_5735());
      if (var2 && (this.UuUVuuUu(var4) || this.UuUVuuUu(var3))) {
         var1.UuUVuuUu(true);
         uUnuvNvvNU.field_1724.method_24830(true);
         uUnuvNvvNU.field_1724.method_6043();
         uUnuvNvvNU.field_1724.field_6017 = 0.0;
         this.uVunuUNVVUUV.UuUVuuUu();
      }
   }

   private boolean UuUVuuUu(class_2338 var1) {
      class_2680 var2 = uUnuvNvvNU.field_1687.method_8320(var1);
      class_2248 var3 = var2.method_26204();
      boolean var4 = var3 instanceof class_2533 && Boolean.TRUE.equals(var2.method_11654(class_2741.field_12537)) && var2.method_28498(class_2741.field_12481);
      return var3 instanceof class_2354
         || var2.method_26164(class_3481.field_15504)
         || var3 instanceof class_2349
         || var3 instanceof class_3749
         || var3 instanceof class_5554
         || var4;
   }

   private void nUUVuvU() {
      int var1 = this.UuUVuuUu(class_1802.field_27051);
      if (var1 != -1) {
         uuUuvNuNVNVU var2 = new uuUuvNuNVNVU(uUnuvNvvNU.field_1724.method_36454(), 58.1F);
         COC0OCc.UuUVuuUu(var2, 80.0F, 80.0F, 10, 1);
         if (Math.abs(uUnuvNvvNU.field_1724.method_36455() - 57.1F) < 2.0F && uUnuvNvvNU.field_1765 instanceof class_3965 var3) {
            class_2338 var5 = var3.method_17777();
            if (var3.method_17780() == class_2350.field_11036
               && !uUnuvNvvNU.field_1687.method_8320(var5).method_45474()
               && uUnuvNvvNU.field_1687.method_8320(var5.method_10084()).method_45474()
               && this.UNnVVNvvnVvU.uNNnnnuuuN(50L)) {
               this.UuUVuuUu(var3, var1);
               this.UNnVVNvvnVvU.UuUVuuUu();
            }
         }
      }
   }

   private void uUnuvNvvNU(NUNnuuNUvuVU var1) {
      if (this.uNnUnnuNUnNu.uNNnnnuuuN(400L)) {
         var1.UuUVuuUu(true);
         uUnuvNvvNU.field_1724.method_24830(true);
         uUnuvNvvNU.field_1724.field_5992 = true;
         uUnuvNvvNU.field_1724.field_5976 = true;
         uUnuvNvvNU.field_1724.method_6043();
         this.uNnUnnuNUnNu.UuUVuuUu();
         int var2 = this.UuUVuuUu(class_1802.field_8423);
         if (var2 != -1 && uUnuvNvvNU.field_1724.field_6017 > 0.0 && uUnuvNvvNU.field_1724.field_6017 < 1.5) {
            this.uUnuvNvvNU(var2);
         }
      }
   }

   private void uUnuvNvvNU(int var1) {
      float var2 = class_2350.method_62673(uUnuvNvvNU.field_1724.method_5735());
      float var3 = 80.0F;
      uuUuvNuNVNVU var4 = new uuUuvNuNVNVU(var2, var3);
      COC0OCc.UuUVuuUu(var4, 100.0F, 100.0F, 10, 1);
      class_243 var5 = uUnuvNvvNU.field_1724.method_5836(1.0F);
      class_243 var6 = this.UuUVuuUu(var3, var2);
      class_243 var7 = var5.method_1031(var6.field_1352 * 4.0, var6.field_1351 * 4.0, var6.field_1350 * 4.0);
      class_3965 var8 = uUnuvNvvNU.field_1687.method_17742(new class_3959(var5, var7, class_3960.field_17559, class_242.field_1348, uUnuvNvvNU.field_1724));
      if (var8 != null && var8.method_17783() == class_240.field_1332) {
         this.UuUVuuUu(var8, var1);
         uUnuvNvvNU.field_1724.field_6017 = 0.0;
      }
   }

   private void UuUVuuUu(class_3965 var1, int var2) {
      int var3 = uUnuvNvvNU.field_1724.method_31548().method_67532();
      uUnuvNvvNU.field_1724.method_31548().method_61496(var2);
      uUnuvNvvNU.field_1761.method_2896(uUnuvNvvNU.field_1724, class_1268.field_5808, var1);
      uUnuvNvvNU.field_1724.method_6104(class_1268.field_5808);
      uUnuvNvvNU.field_1724.method_31548().method_61496(var3);
   }

   private int UuUVuuUu(class_1792 var1) {
      for (int var2 = 0; var2 < 9; var2++) {
         class_1799 var3 = uUnuvNvvNU.field_1724.method_31548().method_5438(var2);
         if (!var3.method_7960() && var3.method_7909() == var1) {
            return var2;
         }
      }

      return -1;
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
