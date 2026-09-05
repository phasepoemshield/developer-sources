package ru.metaculture.protection;

import net.minecraft.class_1304;
import net.minecraft.class_1802;
import net.minecraft.class_2661;
import net.minecraft.class_2678;
import net.minecraft.class_2708;
import net.minecraft.class_2724;
import net.minecraft.class_2828;
import net.minecraft.class_2848;
import net.minecraft.class_2828.class_5911;
import net.minecraft.class_2848.class_2849;
import org.wild.module.api.Module;
import org.wild.module.api.ModuleRegister;

@ModuleRegister(
   UuUVuuUu = "NoFall",
   uUnuvNvvNU = oOOOo0.Movement,
   C00OOC00oO = "Предотвращает урон от падения",
   vVvUvVVuuNvV = {uVUNNUnNvU.RISKY, uVUNNUnNvU.GRIM}
)
public class NoFall extends Module {
   private final UvNnUnuNUUU NVNnnvnuunNv = new UvNnUnuNUUU("Режим", "Grim v72", "Grim v72", "Grim v73");
   private final UUVuuNuvVuVv uVunuUNVVUUV = new UUVuuNuvVuVv();
   private final UUVuuNuvVuVv UNnVVNvvnVvU = new UUVuuNuvVuVv();
   private boolean uNnUnnuNUnNu;
   private boolean NnUuNNU;
   private boolean nNvNUVU;
   private int UnUNuUU;
   private int uUVuVvuNUvnu;

   public NoFall() {
      this.UuUVuuUu(new nvUuvVvuuN[]{this.NVNnnvnuunNv});
   }

   @vuVvUNNvVNV
   public void UuUVuuUu(nVUVuNnVvU var1) {
      if (uUnuvNvvNU.field_1724 != null && uUnuvNvvNU.field_1687 != null) {
         this.uNnUnnuNUnNu = uUnuvNvvNU.field_1724.field_6017 > 3.0;
         if (this.NVNnnvnuunNv.C00OOC00oO("Grim v72")) {
            if (this.UnUNuUU > 0) {
               this.UnUNuUU--;
            }

            if (this.uNnUnnuNUnNu
               && !uUnuvNvvNU.field_1724.method_24828()
               && this.UuuNnUvUuv()
               && uUnuvNvvNU.field_1724.method_6118(class_1304.field_6174).method_31574(class_1802.field_8833)
               && this.UNnVVNvvnVvU.UuUVuuUu(200.0)) {
               this.nUUVuvU();
               this.nUUVuvU();
               this.UNnVVNvvnVvU.UuUVuuUu();
               this.NnUuNNU = true;
               this.uVunuUNVVUUV.UuUVuuUu();
            }

            if (this.uVunuUNVVUUV.UuUVuuUu(300.0)) {
               this.NnUuNNU = false;
               this.UnUNuUU = 0;
            }
         } else {
            if (this.uUVuVvuNUvnu == 2) {
               Timer.NVNnnvnuunNv = 0.5F;
            } else if (this.uUVuVvuNUvnu <= 1) {
               Timer.NVNnnvnuunNv = 1.0F;
            }

            if (this.uUVuVvuNUvnu > 0) {
               this.uUVuVvuNUvnu--;
            }

            if (this.uVunuUNVVUUV.UuUVuuUu(300.0)) {
               this.NnUuNNU = false;
               this.uUVuVvuNUvnu = 0;
            }
         }
      } else {
         this.UnUNVVVNuv();
      }
   }

   @vuVvUNNvVNV
   public void UuUVuuUu(uvUUuvnunU var1) {
      if (!var1.uUnuvNvvNU()) {
         if (!(var1.vVvUvVVuuNvV() instanceof class_2678) && !(var1.vVvUvVVuuNvV() instanceof class_2661) && !(var1.vVvUvVVuuNvV() instanceof class_2724)) {
            if (var1.vVvUvVVuuNvV() instanceof class_2708 && this.NnUuNNU) {
               if (this.NVNnnvnuunNv.C00OOC00oO("Grim v72")) {
                  this.UnUNuUU = 2;
               } else {
                  this.uUVuVvuNUvnu = 2;
               }

               this.NnUuNNU = false;
            }
         } else {
            this.UnUNVVVNuv();
         }
      } else if (uUnuvNvvNU.field_1724 != null && !this.nNvNUVU) {
         if (!this.NVNnnvnuunNv.C00OOC00oO("Grim v72") || !uUnuvNvvNU.field_1724.method_6118(class_1304.field_6174).method_31574(class_1802.field_8833)) {
            if (var1.vVvUvVVuuNvV() instanceof class_2828
               && this.uNnUnnuNUnNu
               && this.UuuNnUvUuv()
               && this.uUVuVvuNUvnu == 0
               && this.UNnVVNvvnVvU.UuUVuuUu(100.0)) {
               this.nNvNUVU = true;
               uUnuvNvvNU.method_1562().method_52787(new class_5911(true, false));
               this.nNvNUVU = false;
               var1.C00OOC00oO();
               this.UNnVVNvvnVvU.UuUVuuUu();
               this.uVunuUNVVUUV.UuUVuuUu();
               this.NnUuNNU = true;
            }
         }
      }
   }

   @vuVvUNNvVNV
   public void UuUVuuUu(uNVVnVUNun var1) {
      if (this.NnUuNNU || this.UnUNuUU == 2 || this.uUVuVvuNUvnu == 2) {
         var1.UuUVuuUu(false);
      } else if (this.UnUNuUU == 1 || this.uUVuVvuNUvnu == 1) {
         var1.UuUVuuUu(true);
      }
   }

   private boolean UuuNnUvUuv() {
      double var1 = Math.min(-0.05, uUnuvNvvNU.field_1724.method_18798().field_1351);
      return uUnuvNvvNU.field_1687.method_20812(uUnuvNvvNU.field_1724, uUnuvNvvNU.field_1724.method_5829().method_989(0.0, var1, 0.0)).iterator().hasNext();
   }

   private void nUUVuvU() {
      uUnuvNvvNU.method_1562().method_52787(new class_2848(uUnuvNvvNU.field_1724, class_2849.field_12982));
   }

   private void UnUNVVVNuv() {
      this.uNnUnnuNUnNu = false;
      this.NnUuNNU = false;
      this.nNvNUVU = false;
      this.UnUNuUU = 0;
      this.uUVuVvuNUvnu = 0;
      Timer.NVNnnvnuunNv = 1.0F;
   }

   @Override
   public void C00OOC00oO() {
      this.UnUNVVVNuv();
      super.C00OOC00oO();
   }
}
