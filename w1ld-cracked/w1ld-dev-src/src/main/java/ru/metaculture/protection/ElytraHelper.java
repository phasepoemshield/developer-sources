package ru.metaculture.protection;

import net.minecraft.class_1268;
import net.minecraft.class_1304;
import net.minecraft.class_1713;
import net.minecraft.class_1792;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_2815;
import org.wild.module.api.Module;
import org.wild.module.api.ModuleRegister;

@ModuleRegister(
   UuUVuuUu = "ElytraHelper",
   C00OOC00oO = "Автоматически юзает фейерверки/свапает на элики",
   uUnuvNvvNU = oOOOo0.Player
)
public class ElytraHelper extends Module {
   public static ElytraHelper NVNnnvnuunNv;
   public static uVNuNUVvn uVunuUNVVUUV = new uVNuNUVvn("Свап на нагрудник", -1);
   public static uVNuNUVvn UNnVVNvvnVvU = new uVNuNUVvn("Фейерверк", -1);
   public final vvNnnUNnVvn uNnUnnuNUnNu = new vvNnnUNnVvn("Свапать при КД", false);
   private int NnUuNNU = 0;
   private int nNvNUVU = 0;
   private int UnUNuUU = -1;
   private int uUVuVvuNUvnu = -1;
   private boolean UvUvUNuvNU = false;

   public ElytraHelper() {
      this.UuUVuuUu(new nvUuvVvuuN[]{uVunuUNVVUUV, UNnVVNvvnVvU, this.uNnUnnuNUnNu});
      NVNnnvnuunNv = this;
   }

   @vuVvUNNvVNV
   private void UuUVuuUu(vVvuNVUVvNv var1) {
      if (var1.nuUnNvnuUu() == 1 && uUnuvNvvNU.field_1724 != null) {
         if (var1.vVvUvVVuuNvV() == uVunuUNVVUUV.uUnuvNvvNU()
            && this.NnUuNNU == 0
            && (!uUnuvNvvNU.field_1724.method_6115() || uUnuvNvvNU.field_1724.method_6079().method_7909() == class_1802.field_8255)) {
            class_1799 var2 = uUnuvNvvNU.field_1724.method_6118(class_1304.field_6174);
            int var3 = var2.method_7909() == class_1802.field_8833 ? this.uVunuUNVVUUV() : UVuvVVvnVNu.UuUVuuUu(class_1802.field_8833);
            if (var3 >= 0) {
               this.UnUNuUU = var3;
               this.UvUvUNuvNU = false;
               this.NnUuNNU = 1;
               this.vNVuvnUUnuUn();
            }
         }

         if (var1.vVvUvVVuuNvV() == UNnVVNvvnVvU.uUnuvNvvNU() && this.NnUuNNU == 0) {
            int var4 = UVuvVVvnVNu.UuUVuuUu(class_1802.field_8639);
            if (var4 != -1) {
               this.UnUNuUU = var4;
               this.UvUvUNuvNU = true;
               this.NnUuNNU = 1;
               this.vNVuvnUUnuUn();
            }
         }
      }
   }

   @vuVvUNNvVNV
   private void UuUVuuUu(nVunNNvuv var1) {
      if (uUnuvNvvNU.field_1724 == null || uUnuvNvvNU.field_1755 != null) {
         this.NVNnnvnuunNv();
      } else if (this.NnUuNNU > 0) {
         if (this.nNvNUVU > 0) {
            this.nNvNUVU--;
         } else {
            this.vNVuvnUUnuUn();
         }
      } else {
         if (this.uNnUnnuNUnNu.uUnuvNvvNU()) {
            boolean var2 = uUnuvNvvNU.field_1724.method_6118(class_1304.field_6174).method_7909() == class_1802.field_8833;
            if (var2 && vnvuUUVun.C00OOC00oO()) {
               int var3 = this.uVunuUNVVUUV();
               if (var3 != -1) {
                  this.UnUNuUU = var3;
                  this.UvUvUNuvNU = false;
                  this.NnUuNNU = 1;
                  this.vNVuvnUUnuUn();
               }
            }
         }
      }
   }

   private void vNVuvnUUnuUn() {
      if (this.UvUvUNuvNU) {
         this.UvnvNVnnnnNU();
      } else {
         this.uVUVnuvnuVuv();
      }
   }

   private void UvnvNVnnnnNU() {
      switch (this.NnUuNNU) {
         case 1:
            NVnVnU.UuUVuuUu().UuUVuuUu("ElytraHelper_FW");
            if (uUnuvNvvNU.field_1724.method_5624()) {
               uUnuvNvvNU.field_1724.method_5728(false);
            }

            this.NnUuNNU = 2;
            this.nNvNUVU = 1;
            break;
         case 2:
            this.uUVuVvuNUvnu = uUnuvNvvNU.field_1724.method_31548().method_67532();
            if (this.UnUNuUU < 9) {
               UVuvVVvnVNu.UuUVuuUu(this.UnUNuUU);
            } else {
               uUnuvNvvNU.field_1761
                  .method_2906(uUnuvNvvNU.field_1724.field_7498.field_7763, this.UnUNuUU, this.uUVuVvuNUvnu, class_1713.field_7791, uUnuvNvvNU.field_1724);
            }

            this.NnUuNNU = 3;
            this.nNvNUVU = 1;
            break;
         case 3:
            uUnuvNvvNU.field_1761.method_2919(uUnuvNvvNU.field_1724, class_1268.field_5808);
            uUnuvNvvNU.field_1724.method_6104(class_1268.field_5808);
            this.NnUuNNU = 4;
            this.nNvNUVU = 1;
            break;
         case 4:
            if (this.UnUNuUU < 9) {
               UVuvVVvnVNu.UuUVuuUu(this.uUVuVvuNUvnu);
            } else {
               uUnuvNvvNU.field_1761
                  .method_2906(uUnuvNvvNU.field_1724.field_7498.field_7763, this.UnUNuUU, this.uUVuVvuNUvnu, class_1713.field_7791, uUnuvNvvNU.field_1724);
            }

            NVnVnU.UuUVuuUu().C00OOC00oO("ElytraHelper_FW");
            this.NnUuNNU = 0;
      }
   }

   private void uVUVnuvnuVuv() {
      switch (this.NnUuNNU) {
         case 1:
            NVnVnU.UuUVuuUu().UuUVuuUu("ElytraHelper");
            if (uUnuvNvvNU.field_1724.method_5624()) {
               uUnuvNvvNU.field_1724.method_5728(false);
            }

            this.NnUuNNU = 2;
            this.nNvNUVU = 1;
            break;
         case 2:
            UVuvVVvnVNu.UuUVuuUu(this.UnUNuUU, 6);
            if (uUnuvNvvNU.method_1562() != null) {
               uUnuvNvvNU.method_1562().method_52787(new class_2815(uUnuvNvvNU.field_1724.field_7498.field_7763));
            }

            this.NnUuNNU = 3;
            this.nNvNUVU = 1;
            break;
         case 3:
            NVnVnU.UuUVuuUu().C00OOC00oO("ElytraHelper");
            this.NnUuNNU = 0;
      }
   }

   private void NVNnnvnuunNv() {
      if (this.NnUuNNU > 0) {
         NVnVnU.UuUVuuUu().C00OOC00oO(this.UvUvUNuvNU ? "ElytraHelper_FW" : "ElytraHelper");
      }

      this.NnUuNNU = 0;
      this.nNvNUVU = 0;
      this.UnUNuUU = -1;
   }

   private int uVunuUNVVUUV() {
      class_1792[] var1 = new class_1792[]{
         class_1802.field_22028, class_1802.field_8058, class_1802.field_8873, class_1802.field_8678, class_1802.field_8523, class_1802.field_8577
      };

      for (class_1792 var5 : var1) {
         int var6 = UVuvVVvnVNu.UuUVuuUu(var5);
         if (var6 != -1) {
            return var6;
         }
      }

      return -1;
   }

   public static boolean UuuNnUvUuv() {
      if (uUnuvNvvNU.field_1724 != null && uUnuvNvvNU.field_1761 != null) {
         if (uUnuvNvvNU.field_1724.method_6118(class_1304.field_6174).method_7909() == class_1802.field_8833) {
            return true;
         } else {
            int var0 = UVuvVVvnVNu.UuUVuuUu(class_1802.field_8833);
            if (var0 == -1) {
               return false;
            } else {
               UVuvVVvnVNu.UuUVuuUu(var0, 6);
               if (uUnuvNvvNU.method_1562() != null) {
                  uUnuvNvvNU.method_1562().method_52787(new class_2815(uUnuvNvvNU.field_1724.field_7498.field_7763));
               }

               return true;
            }
         }
      } else {
         return false;
      }
   }

   public static boolean nUUVuvU() {
      if (uUnuvNvvNU.field_1724 != null && uUnuvNvvNU.field_1761 != null) {
         class_1792[] var0 = new class_1792[]{
            class_1802.field_22028, class_1802.field_8058, class_1802.field_8523, class_1802.field_8873, class_1802.field_8678, class_1802.field_8577
         };

         for (class_1792 var4 : var0) {
            int var5 = UVuvVVvnVNu.UuUVuuUu(var4);
            if (var5 != -1) {
               UVuvVVvnVNu.UuUVuuUu(var5, 6);
               if (uUnuvNvvNU.method_1562() != null) {
                  uUnuvNvvNU.method_1562().method_52787(new class_2815(uUnuvNvvNU.field_1724.field_7498.field_7763));
               }

               return true;
            }
         }

         return false;
      } else {
         return false;
      }
   }

   public static boolean UnUNVVVNuv() {
      return UuUVuuUu(class_1802.field_8639);
   }

   private static boolean UuUVuuUu(class_1792 var0) {
      if (uUnuvNvvNU.field_1724 != null && uUnuvNvvNU.field_1761 != null) {
         int var1 = UVuvVVvnVNu.UuUVuuUu(var0);
         if (var1 == -1) {
            return false;
         } else {
            int var2 = uUnuvNvvNU.field_1724.method_31548().method_67532();
            boolean var3 = var1 >= 36 && var1 <= 44;
            if (var3) {
               UVuvVVvnVNu.UuUVuuUu(var1 - 36);
            } else {
               uUnuvNvvNU.field_1761.method_2906(uUnuvNvvNU.field_1724.field_7498.field_7763, var1, var2, class_1713.field_7791, uUnuvNvvNU.field_1724);
            }

            uUnuvNvvNU.field_1761.method_2919(uUnuvNvvNU.field_1724, class_1268.field_5808);
            uUnuvNvvNU.field_1724.method_6104(class_1268.field_5808);
            if (var3) {
               UVuvVVvnVNu.UuUVuuUu(var2);
            } else {
               uUnuvNvvNU.field_1761.method_2906(uUnuvNvvNU.field_1724.field_7498.field_7763, var1, var2, class_1713.field_7791, uUnuvNvvNU.field_1724);
            }

            return true;
         }
      } else {
         return false;
      }
   }

   @Override
   public void C00OOC00oO() {
      this.NVNnnvnuunNv();
      super.C00OOC00oO();
   }
}
