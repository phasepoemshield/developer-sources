package ru.metaculture.protection;

import net.minecraft.class_1268;
import net.minecraft.class_1713;
import net.minecraft.class_1792;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_2815;
import org.wild.module.api.Module;
import org.wild.module.api.ModuleRegister;

@ModuleRegister(
   UuUVuuUu = "ClickPearl",
   uUnuvNvvNU = oOOOo0.Player,
   C00OOC00oO = "Зажми бинд — превью траектории (Predictions), отпусти — бросок жемчуга"
)
public class ClickPearl extends Module {
   public static uVNuNUVvn NVNnnvnuunNv = new uVNuNUVvn("Кнопка жемчуга", -1, true);
   public static boolean uVunuUNVVUUV = false;
   private static final long uNnUnnuNUnNu = 100L;
   private static final String NnUuNNU = "MiddleClick_Pearl";
   private static final long nNvNUVU = 900L;
   private static final int UnUNuUU = 3;
   private static final long uUVuVvuNUvnu = 150L;
   private static class_1799 UvUvUNuvNU = class_1799.field_8037;
   public static boolean UNnVVNvvnVvU = false;
   private boolean c0oOOCcCoC0 = false;
   private boolean VVnVNnunVvu = false;
   private int unNNVVNnvvV = -1;
   private int NuunnvnN = -1;
   private int NVUunUNUN = -1;
   private class_1792 UUVNuUNUvUnV = null;
   private long vuvnUnVnUNnV = 0L;
   private int nnuUVNUuvvVU = 0;
   private int nVVUuvuNnUN = 0;
   private boolean nNnVnUNVV = false;
   private int nuunNvv = 0;
   private long uUVVvVVNvvn = 0L;
   private long vvUVNVvvNUv = 0L;

   public ClickPearl() {
      this.UuUVuuUu(new nvUuvVvuuN[]{NVNnnvnuunNv});
   }

   @vuVvUNNvVNV
   public void UuUVuuUu(nVunNNvuv var1) {
      if (uUnuvNvvNU.field_1724 != null && uUnuvNvvNU.field_1761 != null && uUnuvNvvNU.field_1687 != null) {
         this.NVNnnvnuunNv();
         if (this.nnuUVNUuvvVU > 0) {
            this.vNVuvnUUnuUn();
         } else {
            boolean var2 = NVNnnvnuunNv.uUnuvNvvNU() != -1 && uVNuNUVvn.C00OOC00oO(NVNnnvnuunNv.uUnuvNvvNU()) && uUnuvNvvNU.field_1755 == null;
            if (var2 && this.nUUVuvU()) {
               this.c0oOOCcCoC0 = true;
               uVunuUNVVUUV = true;
            } else if (this.c0oOOCcCoC0) {
               this.c0oOOCcCoC0 = false;
               uVunuUNVVUUV = false;
               if (uUnuvNvvNU.field_1755 == null) {
                  this.UnUNVVVNuv();
               }
            } else {
               uVunuUNVVUUV = false;
            }
         }
      } else {
         uVunuUNVVUUV = false;
         this.UNnVVNvvnVvU();
      }
   }

   private boolean nUUVuvU() {
      int var1 = UVuvVVvnVNu.UuUVuuUu(class_1802.field_8634);
      if (var1 == -1) {
         return false;
      } else {
         class_1799 var2 = this.C00OOC00oO(var1);
         return !var2.method_7960() && !uUnuvNvvNU.field_1724.method_7357().method_7904(var2);
      }
   }

   private void UnUNVVVNuv() {
      if (System.currentTimeMillis() - this.vuvnUnVnUNnV >= 100L) {
         int var1 = UVuvVVvnVNu.UuUVuuUu(class_1802.field_8634);
         if (var1 != -1) {
            class_1799 var2 = this.C00OOC00oO(var1);
            if (!var2.method_7960() && !uUnuvNvvNU.field_1724.method_7357().method_7904(var2)) {
               UvUvUNuvNU = var2.method_7972();
               this.NuunnvnN = uUnuvNvvNU.field_1724.method_31548().method_67532();
               this.nNnVnUNVV = false;
               UNnVVNvvnVvU = true;
               if (this.uUnuvNvvNU(var1)) {
                  this.unNNVVNnvvV = this.vVvUvVVuuNvV(var1);
                  this.VVnVNnunVvu = false;
               } else {
                  this.NVUunUNUN = var1;
                  this.UUVNuUNUvUnV = uUnuvNvvNU.field_1724.method_31548().method_5438(this.NuunnvnN).method_7909();
                  this.VVnVNnunVvu = true;
               }

               this.nnuUVNUuvvVU = 1;
               this.nVVUuvuNnUN = 0;
            }
         }
      }
   }

   private void vNVuvnUUnuUn() {
      if (this.VVnVNnunVvu) {
         this.uVunuUNVVUUV();
      }

      if (this.nVVUuvuNnUN > 0) {
         this.nVVUuvuNnUN--;
      } else {
         if (!this.VVnVNnunVvu) {
            switch (this.nnuUVNUuvvVU) {
               case 1:
                  if (this.unNNVVNnvvV != this.NuunnvnN) {
                     this.UuUVuuUu(this.unNNVVNnvvV);
                  }

                  this.nnuUVNUuvvVU = 2;
                  this.nVVUuvuNnUN = 0;
                  break;
               case 2:
                  this.UvnvNVnnnnNU();
                  this.nnuUVNUuvvVU = 3;
                  this.nVVUuvuNnUN = 0;
                  break;
               case 3:
                  if (this.unNNVVNnvvV != this.NuunnvnN) {
                     this.UuUVuuUu(this.NuunnvnN);
                  }

                  this.uVUVnuvnuVuv();
            }
         } else {
            switch (this.nnuUVNUuvvVU) {
               case 1:
                  this.nnuUVNUuvvVU = 2;
                  this.nVVUuvuNnUN = 0;
                  break;
               case 2:
                  uUnuvNvvNU.field_1761
                     .method_2906(uUnuvNvvNU.field_1724.field_7498.field_7763, this.NVUunUNUN, this.NuunnvnN, class_1713.field_7791, uUnuvNvvNU.field_1724);
                  this.nnuUVNUuvvVU = 3;
                  this.nVVUuvuNnUN = 0;
                  break;
               case 3:
                  this.UvnvNVnnnnNU();
                  this.nnuUVNUuvvVU = 4;
                  this.nVVUuvuNnUN = 0;
                  break;
               case 4:
                  uUnuvNvvNU.field_1761
                     .method_2906(uUnuvNvvNU.field_1724.field_7498.field_7763, this.NVUunUNUN, this.NuunnvnN, class_1713.field_7791, uUnuvNvvNU.field_1724);
                  this.nnuUVNUuvvVU = 5;
                  this.nVVUuvuNnUN = 1;
                  break;
               case 5:
                  if (uUnuvNvvNU.method_1562() != null) {
                     uUnuvNvvNU.method_1562().method_52787(new class_2815(uUnuvNvvNU.field_1724.field_7498.field_7763));
                  }

                  this.nNnVnUNVV = true;
                  this.nuunNvv = 3;
                  this.uUVVvVVNvvn = System.currentTimeMillis();
                  this.vvUVNVvvNUv = this.uUVVvVVNvvn;
                  this.uVUVnuvnuVuv();
            }
         }
      }
   }

   private void UvnvNVnnnnNU() {
      uUnuvNvvNU.field_1761.method_2919(uUnuvNvvNU.field_1724, class_1268.field_5808);
      uUnuvNvvNU.field_1724.method_6104(class_1268.field_5808);
   }

   private void uVUVnuvnuVuv() {
      this.vuvnUnVnUNnV = System.currentTimeMillis();
      NVnVnU.UuUVuuUu().C00OOC00oO("MiddleClick_Pearl");
      this.nnuUVNUuvvVU = 0;
      this.nVVUuvuNnUN = 0;
      this.VVnVNnunVvu = false;
      UNnVVNvvnVvU = false;
   }

   private void NVNnnvnuunNv() {
      if (this.nNnVnUNVV) {
         if (uUnuvNvvNU.field_1724 != null && uUnuvNvvNU.field_1761 != null) {
            long var1 = System.currentTimeMillis();
            if (var1 - this.uUVVvVVNvvn < 900L && this.nuunNvv > 0 && this.UUVNuUNUvUnV != null) {
               class_1792 var3 = uUnuvNvvNU.field_1724.method_31548().method_5438(this.NuunnvnN).method_7909();
               if (var3 != this.UUVNuUNUvUnV) {
                  if (var1 - this.vvUVNVvvNUv >= 150L) {
                     uUnuvNvvNU.field_1761
                        .method_2906(uUnuvNvvNU.field_1724.field_7498.field_7763, this.NVUunUNUN, this.NuunnvnN, class_1713.field_7791, uUnuvNvvNU.field_1724);
                     this.nuunNvv--;
                     this.vvUVNVvvNUv = var1;
                  }
               }
            } else {
               this.nNnVnUNVV = false;
            }
         } else {
            this.nNnVnUNVV = false;
         }
      }
   }

   private void UuUVuuUu(int var1) {
      if (var1 >= 0 && var1 <= 8 && uUnuvNvvNU.field_1724 != null) {
         uUnuvNvvNU.field_1724.method_31548().method_61496(var1);
      }
   }

   private void uVunuUNVVUUV() {
      Sprint.NnUuNNU = 2;
      uUnuvNvvNU.field_1690.field_1867.method_23481(false);
      uUnuvNvvNU.field_1724.method_5728(false);
      NVnVnU.UuUVuuUu().UuUVuuUu("MiddleClick_Pearl");
   }

   private void UNnVVNvvnVvU() {
      if (this.nnuUVNUuvvVU > 0) {
         NVnVnU.UuUVuuUu().C00OOC00oO("MiddleClick_Pearl");
      }

      this.c0oOOCcCoC0 = false;
      this.VVnVNnunVvu = false;
      this.nnuUVNUuvvVU = 0;
      this.nVVUuvuNnUN = 0;
      this.nNnVnUNVV = false;
      UNnVVNvvnVvU = false;
   }

   private class_1799 C00OOC00oO(int var1) {
      if (uUnuvNvvNU.field_1724 == null) {
         return class_1799.field_8037;
      } else if (var1 >= 36 && var1 <= 44) {
         return uUnuvNvvNU.field_1724.method_31548().method_5438(var1 - 36);
      } else {
         return var1 >= 0 && var1 < 36 ? uUnuvNvvNU.field_1724.method_31548().method_5438(var1) : class_1799.field_8037;
      }
   }

   public static class_1799 UuuNnUvUuv() {
      return UvUvUNuvNU.method_7972();
   }

   @Override
   public void C00OOC00oO() {
      uVunuUNVVUUV = false;
      this.UNnVVNvvnVvU();
      super.C00OOC00oO();
   }

   private boolean uUnuvNvvNU(int var1) {
      return var1 >= 0 && var1 <= 8 || var1 >= 36 && var1 <= 44;
   }

   private int vVvUvVVuuNvV(int var1) {
      if (var1 >= 0 && var1 <= 8) {
         return var1;
      } else {
         return var1 >= 36 && var1 <= 44 ? var1 - 36 : -1;
      }
   }
}
