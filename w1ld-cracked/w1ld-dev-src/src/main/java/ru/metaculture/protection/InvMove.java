package ru.metaculture.protection;

import java.util.ArrayList;
import java.util.List;
import net.minecraft.class_1703;
import net.minecraft.class_1713;
import net.minecraft.class_1735;
import net.minecraft.class_1799;
import net.minecraft.class_2596;
import net.minecraft.class_2813;
import net.minecraft.class_2815;
import net.minecraft.class_304;
import net.minecraft.class_310;
import net.minecraft.class_3675;
import net.minecraft.class_490;
import org.wild.module.api.Module;
import org.wild.module.api.ModuleRegister;

@ModuleRegister(
   UuUVuuUu = "InvMove",
   C00OOC00oO = "Позволяет ходить с открытым инвентарём и меню клиента",
   uUnuvNvvNU = oOOOo0.Movement
)
public class InvMove extends Module {
   public static UvNnUnuNUUU NVNnnvnuunNv = new UvNnUnuNUUU("Режим", "Grim", "Grim", "Vanilla", "FunTime");
   public static nNUuNvVn uVunuUNVVUUV = new nNUuNvVn("Задержка закрытия", 100.0F, 0.0F, 300.0F, 10.0F, false);
   private final List<class_2596<?>> uNnUnnuNUnNu = new ArrayList<>();
   public boolean UNnVVNvvnVvU = false;
   private boolean NnUuNNU = false;
   private boolean nNvNUVU = false;
   private long UnUNuUU = 0L;
   private static long uUVuVvuNUvnu = 0L;

   public InvMove() {
      this.UuUVuuUu(new nvUuvVvuuN[]{NVNnnvnuunNv, uVunuUNVVUUV});
   }

   @vuVvUNNvVNV
   public void UuUVuuUu(nVUVuNnVvU var1) {
      if (this.UNnVVNvvnVvU) {
         NVnVnU.UuUVuuUu().UuUVuuUu("GuiMove");
      } else {
         NVnVnU.UuUVuuUu().C00OOC00oO("GuiMove");
      }

      if (this.NnUuNNU && System.currentTimeMillis() >= this.UnUNuUU) {
         this.NnUuNNU = false;
         this.vNVuvnUUnuUn();
         this.UNnVVNvvnVvU = false;
      }

      if (uUnuvNvvNU.field_1724 != null) {
         if (NVNnnvnuunNv.C00OOC00oO("Vanilla")) {
            this.UNnVVNvvnVvU();
         } else if (NVNnnvnuunNv.C00OOC00oO("Grim")) {
            this.uVunuUNVVUUV();
         } else if (NVNnnvnuunNv.C00OOC00oO("FunTime")) {
            if (!UNnnNuVnu.UuUVuuUu() && !this.uNnUnnuNUnNu.isEmpty() && uUnuvNvvNU.field_1755 instanceof class_490) {
               this.nUUVuvU();
            }

            this.uNnUnnuNUnNu();
         }
      }
   }

   @vuVvUNNvVNV
   public void UuUVuuUu(uvUUuvnunU var1) {
      if (var1.uUnuvNvvNU() && !this.nNvNUVU && uUnuvNvvNU.field_1755 instanceof class_490) {
         label54: {
            if (var1.vVvUvVVuuNvV() instanceof class_2815 && NVNnnvnuunNv.C00OOC00oO("FunTime")) {
               if (!this.uNnUnnuNUnNu.isEmpty()) {
                  break label54;
               }

               if (UNnnNuVnu.UuUVuuUu()) {
                  break label54;
               }
            }

            if (var1.vVvUvVVuuNvV() instanceof class_2813 var2) {
               NVNnnvnuunNv();
               if (!NVNnnvnuunNv.C00OOC00oO("Grim") || !uUnuvNvvNU.field_1724.method_5624() && !uUnuvNvvNU.field_1724.method_70673()) {
                  if (NVNnnvnuunNv.C00OOC00oO("FunTime") && UNnnNuVnu.UuUVuuUu() && (!this.uNnUnnuNUnNu.isEmpty() || this.UuUVuuUu(var2))) {
                     this.uNnUnnuNUnNu.add(var2);
                     var1.C00OOC00oO();
                  }
               } else {
                  this.uNnUnnuNUnNu.add(var2);
                  var1.C00OOC00oO();
               }
            }

            return;
         }

         var1.C00OOC00oO();
         this.UnUNuUU = System.currentTimeMillis() + this.uVUVnuvnuVuv();
         this.NnUuNNU = true;
         this.UNnVVNvvnVvU = true;
      }
   }

   @vuVvUNNvVNV
   public void UuUVuuUu(nVVuNnVvvnnn var1) {
      if (uUnuvNvvNU.field_1755 instanceof class_490) {
         if (NVNnnvnuunNv.C00OOC00oO("Grim")) {
            if (!uUnuvNvvNU.field_1724.method_5624()) {
               this.UvnvNVnnnnNU();
               return;
            }

            var1.C00OOC00oO();
            this.UNnVVNvvnVvU = false;
            this.UnUNuUU = System.currentTimeMillis() + this.uVUVnuvnuVuv();
            this.NnUuNNU = true;
         } else if (NVNnnvnuunNv.C00OOC00oO("FunTime")) {
            if (this.uNnUnnuNUnNu.isEmpty() && !UNnnNuVnu.UuUVuuUu()) {
               this.UvnvNVnnnnNU();
               this.UNnVVNvvnVvU = false;
               this.NnUuNNU = false;
            } else {
               var1.C00OOC00oO();
               this.UnUNuUU = System.currentTimeMillis() + this.uVUVnuvnuVuv();
               this.NnUuNNU = true;
               this.UNnVVNvvnVvU = true;
            }
         }
      }
   }

   private void nUUVuvU() {
      if (!this.uNnUnnuNUnNu.isEmpty()) {
         NVNnnvnuunNv();
         this.nNvNUVU = true;

         try {
            for (class_2596 var2 : this.uNnUnnuNUnNu) {
               if (uUnuvNvvNU.method_1562() != null) {
                  uUnuvNvvNU.method_1562().method_52787(var2);
               }
            }
         } finally {
            this.nNvNUVU = false;
            this.uNnUnnuNUnNu.clear();
         }
      }
   }

   private void UnUNVVVNuv() {
      if (uUnuvNvvNU.field_1724 != null) {
         uUnuvNvvNU.field_1724.method_3137();
      }
   }

   private void vNVuvnUUnuUn() {
      this.nUUVuvU();
      this.UvnvNVnnnnNU();
      this.UnUNVVVNuv();
   }

   private void UvnvNVnnnnNU() {
      if (uUnuvNvvNU.field_1724 != null && uUnuvNvvNU.field_1761 != null) {
         class_1703 var1 = uUnuvNvvNU.field_1724.field_7512;
         if (var1 != null && !var1.method_34255().method_7960()) {
            int var2 = this.UuUVuuUu(var1);
            if (var2 != -1) {
               boolean var3 = this.nNvNUVU;
               this.nNvNUVU = true;

               try {
                  NVNnnvnuunNv();
                  uUnuvNvvNU.field_1761.method_2906(var1.field_7763, var2, 0, class_1713.field_7790, uUnuvNvvNU.field_1724);
               } finally {
                  this.nNvNUVU = var3;
               }
            }
         }
      }
   }

   private int UuUVuuUu(class_1703 var1) {
      class_1799 var2 = var1.method_34255();
      int var3 = -1;

      for (class_1735 var5 : var1.field_7761) {
         if (var5.field_7871 == uUnuvNvvNU.field_1724.method_31548()) {
            class_1799 var6 = var5.method_7677();
            if (var6.method_7960()) {
               if (var3 == -1) {
                  var3 = var5.field_7874;
               }
            } else if (class_1799.method_31577(var6, var2) && var6.method_7947() + var2.method_7947() <= var6.method_7914()) {
               return var5.field_7874;
            }
         }
      }

      return var3;
   }

   private long uVUVnuvnuVuv() {
      return (long)uVunuUNVVUUV.uUnuvNvvNU();
   }

   private boolean UuUVuuUu(class_2813 var1) {
      return !var1.comp_3847().isEmpty();
   }

   private static void NVNnnvnuunNv() {
      uUVuVvuNUvnu = System.currentTimeMillis();
   }

   public static boolean UuuNnUvUuv() {
      return uUnuvNvvNU.field_1755 instanceof class_490 && System.currentTimeMillis() - uUVuVvuNUvnu < 350L;
   }

   private void uVunuUNVVUUV() {
      class_304[] var1 = new class_304[]{
         uUnuvNvvNU.field_1690.field_1894,
         uUnuvNvvNU.field_1690.field_1881,
         uUnuvNvvNU.field_1690.field_1913,
         uUnuvNvvNU.field_1690.field_1849,
         uUnuvNvvNU.field_1690.field_1903,
         uUnuvNvvNU.field_1690.field_1867
      };
      if (this.NnUuNNU()) {
         this.UNnVVNvvnVvU = false;
         this.UuUVuuUu(var1);
      } else if (this.NnUuNNU) {
         this.UNnVVNvvnVvU = true;
      } else {
         if (!(uUnuvNvvNU.field_1755 instanceof class_490)) {
            this.UNnVVNvvnVvU = false;
         }

         if (uUnuvNvvNU.field_1755 instanceof class_490) {
            this.UuUVuuUu(var1);
         }
      }
   }

   private void UNnVVNvvnVvU() {
      if (!(uUnuvNvvNU.field_1755 instanceof class_490) && !this.NnUuNNU()) {
         this.UNnVVNvvnVvU = false;
      }

      class_304[] var1 = new class_304[]{
         uUnuvNvvNU.field_1690.field_1894,
         uUnuvNvvNU.field_1690.field_1881,
         uUnuvNvvNU.field_1690.field_1913,
         uUnuvNvvNU.field_1690.field_1849,
         uUnuvNvvNU.field_1690.field_1903,
         uUnuvNvvNU.field_1690.field_1867
      };
      if (uUnuvNvvNU.field_1755 instanceof class_490 || this.NnUuNNU()) {
         this.UNnVVNvvnVvU = false;
         this.UuUVuuUu(var1);
      }
   }

   private void uNnUnnuNUnNu() {
      class_304[] var1 = new class_304[]{
         uUnuvNvvNU.field_1690.field_1894,
         uUnuvNvvNU.field_1690.field_1881,
         uUnuvNvvNU.field_1690.field_1913,
         uUnuvNvvNU.field_1690.field_1849,
         uUnuvNvvNU.field_1690.field_1903,
         uUnuvNvvNU.field_1690.field_1867
      };
      if (this.NnUuNNU()) {
         this.UNnVVNvvnVvU = false;
         this.UuUVuuUu(var1);
      } else if (this.NnUuNNU) {
         this.UNnVVNvvnVvU = true;
      } else {
         if (!(uUnuvNvvNU.field_1755 instanceof class_490)) {
            this.UNnVVNvvnVvU = false;
         }

         if (uUnuvNvvNU.field_1755 instanceof class_490) {
            this.UuUVuuUu(var1);
         }
      }
   }

   private boolean NnUuNNU() {
      return uUnuvNvvNU.field_1755 instanceof nNVvvnU || uUnuvNvvNU.field_1755 instanceof nuUnNNVUUnU;
   }

   private void UuUVuuUu(class_304[] var1) {
      long var2 = class_310.method_1551().method_22683().method_4490();
      nuUnNNVUUnU var4 = uUnuvNvvNU.field_1755 instanceof nuUnNNVUUnU ? (nuUnNNVUUnU)uUnuvNvvNU.field_1755 : null;
      boolean var5 = var4 != null && var4.UuUVuuUu().uNNnnnuuuN();

      for (class_304 var9 : var1) {
         if (var5) {
            var9.method_23481(false);
         } else {
            int var10 = var9.method_1429().method_1444();
            boolean var11 = class_3675.method_15987(var2, var10);
            var9.method_23481(var11);
         }
      }
   }

   @Override
   public void C00OOC00oO() {
      this.UNnVVNvvnVvU = false;
      this.NnUuNNU = false;
      this.nNvNUVU = false;
      NVnVnU.UuUVuuUu().C00OOC00oO("GuiMove");
      this.uNnUnnuNUnNu.clear();
      super.C00OOC00oO();
   }
}
