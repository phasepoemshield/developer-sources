package ru.metaculture.protection;

import net.minecraft.class_1268;
import net.minecraft.class_1713;
import net.minecraft.class_1764;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_1839;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.wild.module.api.Module;
import org.wild.module.api.ModuleRegister;

@ModuleRegister(
   UuUVuuUu = "NoSlow",
   C00OOC00oO = "Убирает замедление при использовании предметов",
   uUnuvNvvNU = oOOOo0.Movement,
   vVvUvVVuuNvV = {uVUNNUnNvU.RISKY, uVUNNUnNvU.GRIM}
)
public class NoSlow extends Module {
   private static final Logger NnUuNNU = LogManager.getLogger("NoSlow");
   private static final int nNvNUVU = 1;
   private static final String UnUNuUU = "NoSlow_FT-Snow_Crossbow";
   private static boolean uUVuVvuNUvnu;
   private static class_1799 UvUvUNuvNU = class_1799.field_8037;
   public static UvNnUnuNUUU NVNnnvnuunNv = new UvNnUnuNUUU("Режим", "Grim", "Grim", "Grim Tick", "Grim V2", "FT");
   public static vvNnnUNnVvn uVunuUNVVUUV = new vvNnnUNnVvn("Арбалет", true).UuUVuuUu(() -> !NVNnnvnuunNv.C00OOC00oO("FT"));
   public static vvNnnUNnVvn UNnVVNvvnVvU = new vvNnnUNnVvn("Точный стоп", true)
      .UuUVuuUu(() -> !NVNnnvnuunNv.C00OOC00oO("FT-Snow") || !uVunuUNVVUUV.uUnuvNvvNU());
   public static nNUuNvVn uNnUnnuNUnNu = new nNUuNvVn("Задержка свапа", 70.0F, 0.0F, 250.0F, 5.0F, false)
      .UuUVuuUu(() -> !NVNnnvnuunNv.C00OOC00oO("FT-Snow") || !uVunuUNVVUUV.uUnuvNvvNU() || !UNnVVNvvnVvU.uUnuvNvvNU());
   private float c0oOOCcCoC0 = 0.0F;
   private int VVnVNnunVvu = -1;
   private int unNNVVNnvvV;
   private boolean NuunnvnN;
   private final VuNvNNvVV NVUunUNUN = new VuNvNNvVV();
   private NoSlow.NVnVnNnN UUVNuUNUvUnV = NoSlow.NVnVnNnN.IDLE;

   public NoSlow() {
      this.UuUVuuUu(new nvUuvVvuuN[]{NVNnnvnuunNv});
   }

   @vuVvUNNvVNV
   public void UuUVuuUu(nVUVuNnVvU var1) {
      if (uUnuvNvvNU.field_1724 != null) {
         if (NVNnnvnuunNv.C00OOC00oO("Grim Tick") || NVNnnvnuunNv.C00OOC00oO("Grim V2")) {
            if (uUnuvNvvNU.field_1724.method_6115()) {
               this.c0oOOCcCoC0++;
            } else {
               this.c0oOOCcCoC0 = 0.0F;
            }
         }
      }
   }

   @vuVvUNNvVNV(
      UuUVuuUu = 0
   )
   public void UuUVuuUu(nVunNNvuv var1) {
      if (uUnuvNvvNU.field_1724 == null) {
         this.C00OOC00oO("player-missing");
      } else {
         if (NVNnnvnuunNv.C00OOC00oO("FT-Snow") && uVunuUNVVUUV.uUnuvNvvNU() && UNnVVNvvnVvU.uUnuvNvvNU()) {
            this.UuuNnUvUuv();
         } else {
            this.uUVuVvuNUvnu();
         }
      }
   }

   @vuVvUNNvVNV
   public void UuUVuuUu(oCoOO0coOCo var1) {
      if (uUnuvNvvNU.field_1724 != null) {
         if (NVNnnvnuunNv.C00OOC00oO("Grim")) {
            if (uUnuvNvvNU.field_1724.method_6058() == class_1268.field_5808) {
               uUnuvNvvNU.field_1761.method_2919(uUnuvNvvNU.field_1724, class_1268.field_5810);
            } else {
               uUnuvNvvNU.field_1761.method_2919(uUnuvNvvNU.field_1724, class_1268.field_5808);
            }

            var1.C00OOC00oO();
         }

         if (NVNnnvnuunNv.C00OOC00oO("FT")) {
            if (uUnuvNvvNU.field_1724.method_6115() && uUnuvNvvNU.field_1724.method_6030().method_7909() instanceof class_1764) {
               var1.C00OOC00oO();
            }

            if (this.uVunuUNVVUUV()) {
               var1.C00OOC00oO();
            }
         }

         if (NVNnnvnuunNv.C00OOC00oO("Grim V2") && uUnuvNvvNU.field_1724.method_6115() && !uUnuvNvvNU.field_1724.method_5765() && this.c0oOOCcCoC0 >= 1.3F) {
            var1.C00OOC00oO();
            this.c0oOOCcCoC0 = 0.26F;
         }

         if (NVNnnvnuunNv.C00OOC00oO("Grim Tick") && uUnuvNvvNU.field_1724.method_6115() && !uUnuvNvvNU.field_1724.method_5765() && this.c0oOOCcCoC0 >= 1.2F) {
            var1.C00OOC00oO();
            this.c0oOOCcCoC0 = 0.0F;
         }
      }
   }

   private void UuuNnUvUuv() {
      if (uUnuvNvvNU.field_1761 != null && uUnuvNvvNU.field_1724 != null) {
         if (this.UUVNuUNUvUnV != NoSlow.NVnVnNnN.IDLE) {
            this.nUUVuvU();
         } else {
            if (this.UNnVVNvvnVvU() && !uUnuvNvvNU.field_1724.method_6079().method_31574(class_1802.field_8399) && UNnnNuVnu.UuUVuuUu()) {
               this.vNVuvnUUnuUn();
            }
         }
      }
   }

   private void nUUVuvU() {
      if (uUnuvNvvNU.field_1724 != null && uUnuvNvvNU.field_1761 != null) {
         switch (this.UUVNuUNUvUnV) {
            case IDLE:
            default:
               break;
            case PRE_SWAP_STOP:
               this.nNvNUVU();
               if (!this.NVNnnvnuunNv()) {
                  return;
               }

               this.vVvUvVVuuNvV(this.VVnVNnunVvu);
               if (!uUnuvNvvNU.field_1724.method_6079().method_31574(class_1802.field_8399)) {
                  this.UuUVuuUu("swap-failed-after-stop", this.VVnVNnunVvu);
                  this.uUnuvNvvNU("swap-failed-after-stop");
                  return;
               }

               this.UuUVuuUu("swapped-to-offhand", this.VVnVNnunVvu);
               this.UvnvNVnnnnNU();
               break;
            case EATING:
               this.UnUNVVVNuv();
               break;
            case PRE_RESTORE_STOP:
               this.nNvNUVU();
               if (!this.NVNnnvnuunNv()) {
                  return;
               }

               if (uUnuvNvvNU.field_1724.method_6079().method_31574(class_1802.field_8399)) {
                  this.vVvUvVVuuNvV(this.VVnVNnunVvu);
                  this.UuUVuuUu("back-swapped-after-stop", this.VVnVNnunVvu);
               } else if (this.C00OOC00oO(this.VVnVNnunVvu)) {
                  this.UuUVuuUu("crossbow-already-at-origin", this.VVnVNnunVvu);
               } else {
                  this.UuUVuuUu("back-swap-missing-crossbow", this.VVnVNnunVvu);
               }

               this.uUnuvNvvNU("restore-finished");
         }
      } else {
         this.uUnuvNvvNU("client-state-missing");
      }
   }

   private void UnUNVVVNuv() {
      if (this.UNnVVNvvnVvU()) {
         if (!this.NuunnvnN) {
            this.UnUNuUU();
            this.UuUVuuUu("eating-confirmed-unlock", this.VVnVNnunVvu);
         }

         this.NuunnvnN = true;
         this.unNNVVNnvvV = 0;
      } else {
         if (!this.NuunnvnN) {
            this.nNvNUVU();
         }

         this.UvUvUNuvNU();
         if (!this.NuunnvnN && this.uNnUnnuNUnNu()) {
            if (this.unNNVVNnvvV++ < 1) {
               this.UvnvNVnnnnNU();
               this.UuUVuuUu("restart-eating", this.VVnVNnunVvu);
            } else {
               this.UuUVuuUu("eating-did-not-start");
            }
         } else {
            this.UuUVuuUu(this.NuunnvnN ? "eating-finished" : "eating-cancelled");
         }
      }
   }

   private void vNVuvnUUnuUn() {
      int var1 = this.NnUuNNU();
      if (var1 == -1) {
         this.UuUVuuUu("no-crossbow-found", -1);
      } else {
         VVnVNnunVvu();
         this.c0oOOCcCoC0();
         this.VVnVNnunVvu = var1;
         this.UUVNuUNUvUnV = NoSlow.NVnVnNnN.PRE_SWAP_STOP;
         this.uVUVnuvnuVuv();
         this.NuunnvnN = false;
         this.unNNVVNnvvV = 0;
         this.nNvNUVU();
         this.UuUVuuUu("pre-swap-stop", var1);
      }
   }

   private void UvnvNVnnnnNU() {
      if (!this.uNnUnnuNUnNu()) {
         this.UuUVuuUu("main-hand-food-missing");
      } else {
         uUnuvNvvNU.field_1690.field_1904.method_23481(true);
         uUnuvNvvNU.field_1761.method_2919(uUnuvNvvNU.field_1724, class_1268.field_5808);
         this.UnUNuUU();
         this.UUVNuUNUvUnV = NoSlow.NVnVnNnN.EATING;
         this.UuUVuuUu("start-eating", this.VVnVNnunVvu);
      }
   }

   private void UuUVuuUu(String var1) {
      this.c0oOOCcCoC0();
      this.UUVNuUNUvUnV = NoSlow.NVnVnNnN.PRE_RESTORE_STOP;
      this.uVUVnuvnuVuv();
      this.nNvNUVU();
      this.UuUVuuUu("pre-back-swap-stop:" + var1, this.VVnVNnunVvu);
   }

   private void uVUVnuvnuVuv() {
      this.NVUunUNUN.UuUVuuUu();
   }

   private boolean NVNnnvnuunNv() {
      return UNnVVNvvnVvU.uUnuvNvvNU() && this.NVUunUNUN.vNUvnnVnUvu((long)uNnUnnuNUnNu.uUnuvNvvNU());
   }

   private boolean uVunuUNVVUUV() {
      return !this.UNnVVNvvnVvU()
         ? false
         : this.UUVNuUNUvUnV != NoSlow.NVnVnNnN.IDLE || uUnuvNvvNU.field_1724.method_6079().method_31574(class_1802.field_8399);
   }

   private boolean UNnVVNvvnVvU() {
      if (uUnuvNvvNU.field_1724 != null && uUnuvNvvNU.field_1724.method_6115() && uUnuvNvvNU.field_1724.method_6058() == class_1268.field_5808) {
         class_1799 var1 = uUnuvNvvNU.field_1724.method_6030();
         return !var1.method_7960() && var1.method_7976() == class_1839.field_8950;
      } else {
         return false;
      }
   }

   private boolean uNnUnnuNUnNu() {
      if (uUnuvNvvNU.field_1724 == null) {
         return false;
      } else {
         class_1799 var1 = uUnuvNvvNU.field_1724.method_6047();
         return !var1.method_7960() && var1.method_7976() == class_1839.field_8950;
      }
   }

   private int NnUuNNU() {
      for (int var1 = 0; var1 < 9; var1++) {
         if (this.UuUVuuUu(var1)) {
            return this.uUnuvNvvNU(var1);
         }
      }

      for (int var2 = 9; var2 < 36; var2++) {
         if (this.UuUVuuUu(var2)) {
            return this.uUnuvNvvNU(var2);
         }
      }

      return -1;
   }

   private boolean UuUVuuUu(int var1) {
      return uUnuvNvvNU.field_1724 != null
         && var1 >= 0
         && var1 < 36
         && uUnuvNvvNU.field_1724.method_31548().method_5438(var1).method_31574(class_1802.field_8399);
   }

   private boolean C00OOC00oO(int var1) {
      return var1 >= 36 && var1 <= 44 ? this.UuUVuuUu(var1 - 36) : var1 >= 9 && var1 < 36 && this.UuUVuuUu(var1);
   }

   private int uUnuvNvvNU(int var1) {
      return var1 < 9 ? var1 + 36 : var1;
   }

   private void vVvUvVVuuNvV(int var1) {
      if (uUnuvNvvNU.field_1724 != null && uUnuvNvvNU.field_1761 != null) {
         uUnuvNvvNU.field_1761.method_2906(uUnuvNvvNU.field_1724.field_7498.field_7763, var1, 40, class_1713.field_7791, uUnuvNvvNU.field_1724);
      }
   }

   private void nNvNUVU() {
      if (uUnuvNvvNU.field_1724 != null && uUnuvNvvNU.field_1687 != null) {
         NVnVnU.UuUVuuUu().UuUVuuUu("NoSlow_FT-Snow_Crossbow");
         Sprint.NnUuNNU = Math.max(Sprint.NnUuNNU, 1);
         uUnuvNvvNU.field_1690.field_1904.method_23481(false);
      }
   }

   private void UnUNuUU() {
      if (uUnuvNvvNU.field_1724 != null && uUnuvNvvNU.field_1687 != null) {
         NVnVnU.UuUVuuUu().C00OOC00oO("NoSlow_FT-Snow_Crossbow");
      } else {
         NVnVnU.UuUVuuUu().UuUVuuUu.remove("NoSlow_FT-Snow_Crossbow");
      }
   }

   private void uUVuVvuNUvnu() {
      this.C00OOC00oO("restore-requested");
   }

   private void C00OOC00oO(String var1) {
      this.UvUvUNuvNU();
      if (this.UUVNuUNUvUnV != NoSlow.NVnVnNnN.IDLE && this.VVnVNnunVvu != -1) {
         if (uUnuvNvvNU.field_1724 != null && uUnuvNvvNU.field_1761 != null && uUnuvNvvNU.field_1724.method_6079().method_31574(class_1802.field_8399)) {
            this.vVvUvVVuuNvV(this.VVnVNnunVvu);
            this.UuUVuuUu(var1, this.VVnVNnunVvu);
         } else {
            this.UuUVuuUu(var1 + ":offhand-not-crossbow", this.VVnVNnunVvu);
         }

         this.uUnuvNvvNU(var1);
      } else {
         this.uUnuvNvvNU(var1);
      }
   }

   private void uUnuvNvvNU(String var1) {
      if (this.UUVNuUNUvUnV != NoSlow.NVnVnNnN.IDLE || this.VVnVNnunVvu != -1) {
         this.UuUVuuUu("reset:" + var1, this.VVnVNnunVvu);
      }

      this.UnUNuUU();
      unNNVVNnvvV();
      this.VVnVNnunVvu = -1;
      this.unNNVVNnvvV = 0;
      this.NuunnvnN = false;
      this.NVUunUNUN.UuUVuuUu();
      this.UUVNuUNUvUnV = NoSlow.NVnVnNnN.IDLE;
   }

   private void UvUvUNuvNU() {
      if (uUnuvNvvNU.field_1724 != null && uUnuvNvvNU.field_1761 != null && this.UUVNuUNUvUnV != NoSlow.NVnVnNnN.IDLE) {
         if (uUnuvNvvNU.field_1724.method_6115() && uUnuvNvvNU.field_1724.method_6058() == class_1268.field_5810) {
            if (uUnuvNvvNU.field_1724.method_6030().method_31574(class_1802.field_8399)) {
               this.UuUVuuUu("stop-offhand-crossbow-use", this.VVnVNnunVvu);
               this.c0oOOCcCoC0();
            }
         }
      }
   }

   private void c0oOOCcCoC0() {
      if (uUnuvNvvNU.field_1724 != null && uUnuvNvvNU.field_1761 != null && uUnuvNvvNU.field_1724.method_6115()) {
         uUnuvNvvNU.field_1761.method_2897(uUnuvNvvNU.field_1724);
         uUnuvNvvNU.field_1724.method_6075();
      }
   }

   private static void VVnVNnunVvu() {
      if (uUnuvNvvNU.field_1724 != null) {
         UvUvUNuvNU = uUnuvNvvNU.field_1724.method_6079().method_7972();
         uUVuVvuNUvnu = true;
      }
   }

   private static void unNNVVNnvvV() {
      uUVuVvuNUvnu = false;
      UvUvUNuvNU = class_1799.field_8037;
   }

   public static class_1799 UuUVuuUu(class_1799 var0) {
      if (!uUVuVvuNUvnu) {
         return var0;
      } else {
         return UvUvUNuvNU == null ? class_1799.field_8037 : UvUvUNuvNU;
      }
   }

   private void UuUVuuUu(String var1, int var2) {
      NnUuNNU.info(
         "",
         new Object[]{
            var1,
            this.UUVNuUNUvUnV,
            var2,
            UNnVVNvvnVvU.uUnuvNvvNU(),
            this.NVUunUNUN.nuUnNvnuUu(),
            (long)uNnUnnuNUnNu.uUnuvNvvNU(),
            uUnuvNvvNU.field_1724 != null && uUnuvNvvNU.field_1724.method_6115(),
            uUnuvNvvNU.field_1724 != null ? uUnuvNvvNU.field_1724.method_6058() : null,
            uUnuvNvvNU.field_1724 != null ? uUnuvNvvNU.field_1724.method_6047().method_7909() : null,
            uUnuvNvvNU.field_1724 != null ? uUnuvNvvNU.field_1724.method_6079().method_7909() : null,
            uUVuVvuNUvnu,
            UvUvUNuvNU != null ? UvUvUNuvNU.method_7909() : null,
            uUnuvNvvNU.field_1690 != null && uUnuvNvvNU.field_1690.field_1904.method_1434()
         }
      );
   }

   @Override
   public void C00OOC00oO() {
      this.C00OOC00oO("module-disabled");
      super.C00OOC00oO();
   }

   static enum NVnVnNnN {
      IDLE,
      PRE_SWAP_STOP,
      EATING,
      PRE_RESTORE_STOP;
   }
}
