package ru.metaculture.protection;

import net.minecraft.class_1297;
import net.minecraft.class_1304;
import net.minecraft.class_1511;
import net.minecraft.class_1541;
import net.minecraft.class_1701;
import net.minecraft.class_1713;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_1809;
import net.minecraft.class_238;
import net.minecraft.class_2815;
import net.minecraft.class_304;
import net.minecraft.class_3675;
import org.wild.module.api.Module;
import org.wild.module.api.ModuleRegister;

@ModuleRegister(
   UuUVuuUu = "AutoTotem",
   C00OOC00oO = "Автоматически берет тотем в левую руку",
   uUnuvNvvNU = oOOOo0.Combat,
   vVvUvVVuuNvV = {uVUNNUnNvU.GRIM}
)
public class AutoTotem extends Module {
   private static final String uVunuUNVVUUV = "Сохрянять талисманы";
   private static final String UNnVVNvvnVvU = "Не свапать если в КД";
   private final VUVnvvnNN uNnUnnuNUnNu = new VUVnvvnNN(
      "Настройки",
      new vvNnnUNnVvn("Здоровье с элитрами", true),
      new vvNnnUNnVvn("Динамит", true),
      new vvNnnUNnVvn("Падение", false),
      new vvNnnUNnVvn("Эндер-кристалл", false),
      new vvNnnUNnVvn("Не свапать если в КД", false),
      new vvNnnUNnVvn("Сохрянять талисманы", true)
   );
   private final nNUuNvVn NnUuNNU = new nNUuNvVn("Здоровье", 4.0F, 1.0F, 20.0F, 0.5F, false);
   private final nNUuNvVn nNvNUVU = new nNUuNvVn("Здоровье на элитре", 9.0F, 0.0F, 20.0F, 0.5F, false)
      .UuUVuuUu(() -> !this.uNnUnnuNUnNu.C00OOC00oO("Здоровье с элитрами"));
   private final nNUuNvVn UnUNuUU = new nNUuNvVn("Дистанция до кристалла", 4.0F, 1.0F, 10.0F, 1.0F, false)
      .UuUVuuUu(() -> !this.uNnUnnuNUnNu.C00OOC00oO("Эндер-кристалл"));
   private final nNUuNvVn uUVuVvuNUvnu = new nNUuNvVn("Дистанция до динамита", 30.0F, 3.0F, 50.0F, 1.0F, false)
      .UuUVuuUu(() -> !this.uNnUnnuNUnNu.C00OOC00oO("Динамит"));
   private final vvNnnUNnVvn UvUvUNuvNU = new vvNnnUNnVvn("Не свапать если шар", false);
   private int c0oOOCcCoC0 = -1;
   private boolean VVnVNnunVvu = false;
   private AutoTotem.NVnVnNnN unNNVVNnvvV = AutoTotem.NVnVnNnN.IDLE;
   private final VuNvNNvVV NuunnvnN = new VuNvNNvVV();
   private int NVUunUNUN = -1;
   private boolean UUVNuUNUvUnV = false;
   public static boolean NVNnnvnuunNv = false;

   public AutoTotem() {
      this.UuUVuuUu(new nvUuvVvuuN[]{this.uNnUnnuNUnNu, this.NnUuNNU, this.nNvNUVU, this.UnUNuUU, this.uUVuVvuNUvnu, this.UvUvUNuvNU});
   }

   @vuVvUNNvVNV
   public void UuUVuuUu(nVunNNvuv var1) {
      if (uUnuvNvvNU.field_1724 == null || !uUnuvNvvNU.field_1724.method_5805() || uUnuvNvvNU.field_1687 == null) {
         this.UvnvNVnnnnNU();
      } else if (this.unNNVVNnvvV != AutoTotem.NVnVnNnN.IDLE) {
         Sprint.NnUuNNU = 2;
         uUnuvNvvNU.field_1690.field_1867.method_23481(false);
         uUnuvNvvNU.field_1724.method_5728(false);
         this.uUnuvNvvNU(false);
         this.nUUVuvU();
      } else {
         this.UnUNVVVNuv();
      }
   }

   private void nUUVuvU() {
      switch (this.unNNVVNnvvV) {
         case PREPARE:
            if (this.NuunnvnN.UuUVuuUu(20L)) {
               this.NuunnvnN.UuUVuuUu();
               this.unNNVVNnvvV = AutoTotem.NVnVnNnN.SWAP;
            }
            break;
         case SWAP:
            if (!uUnuvNvvNU.field_1724.method_5624()) {
               uUnuvNvvNU.field_1761.method_2906(uUnuvNvvNU.field_1724.field_7498.field_7763, this.NVUunUNUN, 40, class_1713.field_7791, uUnuvNvvNU.field_1724);
            }

            uUnuvNvvNU.field_1724.field_3944.method_52787(new class_2815(uUnuvNvvNU.field_1724.field_7498.field_7763));
            if (this.NuunnvnN.UuUVuuUu(30L)) {
               this.NuunnvnN.UuUVuuUu();
               this.unNNVVNnvvV = this.UUVNuUNUvUnV ? AutoTotem.NVnVnNnN.RESTORE : AutoTotem.NVnVnNnN.COOLDOWN;
            }
            break;
         case RESTORE:
            if (this.NuunnvnN.UuUVuuUu(30L)) {
               this.NuunnvnN.UuUVuuUu();
               this.uVUVnuvnuVuv();
               this.unNNVVNnvvV = AutoTotem.NVnVnNnN.COOLDOWN;
            }
            break;
         case COOLDOWN:
            if (this.NuunnvnN.UuUVuuUu(40L)) {
               this.uUnuvNvvNU(true);
               this.unNNVVNnvvV = AutoTotem.NVnVnNnN.IDLE;
               NVNnnvnuunNv = false;
            }
      }
   }

   private void UnUNVVVNuv() {
      boolean var1 = this.UNnVVNvvnVvU();
      class_1799 var2 = uUnuvNvvNU.field_1724.method_6079();
      boolean var3 = this.UuUVuuUu(var2);
      boolean var4 = this.uNnUnnuNUnNu.C00OOC00oO("Не свапать если в КД");
      if (var4 && var3 && this.uUnuvNvvNU(var2)) {
         if (this.c0oOOCcCoC0 != -1 && this.VVnVNnunVvu) {
            this.NVUunUNUN = this.c0oOOCcCoC0;
            this.UUVNuUNUvUnV = true;
            this.vNVuvnUUnuUn();
         } else {
            this.uVUVnuvnuVuv();
         }
      } else {
         boolean var5 = var1 && this.uNnUnnuNUnNu.C00OOC00oO("Сохрянять талисманы") && this.vVvUvVVuuNvV(var2);
         if (var1 && (!var3 || var5)) {
            int var6 = var5 ? this.uVunuUNVVUUV() : this.NVNnnvnuunNv();
            if (var6 >= 0) {
               if (!this.VVnVNnunVvu) {
                  this.c0oOOCcCoC0 = var6;
                  this.VVnVNnunVvu = true;
               }

               this.NVUunUNUN = var6;
               this.UUVNuUNUvUnV = false;
               this.vNVuvnUUnuUn();
            }
         } else if (!var1 && this.c0oOOCcCoC0 != -1 && this.VVnVNnunVvu) {
            if (uUnuvNvvNU.field_1724.method_6079().method_31574(class_1802.field_8288)) {
               this.NVUunUNUN = this.c0oOOCcCoC0;
               this.UUVNuUNUvUnV = true;
               this.vNVuvnUUnuUn();
            } else {
               this.uVUVnuvnuVuv();
            }
         }
      }
   }

   private void vNVuvnUUnuUn() {
      this.NuunnvnN.UuUVuuUu();
      this.unNNVVNnvvV = AutoTotem.NVnVnNnN.PREPARE;
      NVNnnvnuunNv = true;
   }

   private void uUnuvNvvNU(boolean var1) {
      if (uUnuvNvvNU.method_22683() != null) {
         class_304[] var2 = new class_304[]{
            uUnuvNvvNU.field_1690.field_1894,
            uUnuvNvvNU.field_1690.field_1881,
            uUnuvNvvNU.field_1690.field_1913,
            uUnuvNvvNU.field_1690.field_1849,
            uUnuvNvvNU.field_1690.field_1903
         };
         long var3 = uUnuvNvvNU.method_22683().method_4490();

         for (class_304 var8 : var2) {
            boolean var9 = var1 && class_3675.method_15987(var3, var8.method_1429().method_1444());
            var8.method_23481(var9);
         }
      }
   }

   private void UvnvNVnnnnNU() {
      this.uUnuvNvvNU(true);
      this.unNNVVNnvvV = AutoTotem.NVnVnNnN.IDLE;
      this.NuunnvnN.UuUVuuUu();
      this.uVUVnuvnuVuv();
      NVNnnvnuunNv = false;
   }

   private void uVUVnuvnuVuv() {
      this.c0oOOCcCoC0 = -1;
      this.VVnVNnunVvu = false;
      this.UUVNuUNUvUnV = false;
   }

   private int NVNnnvnuunNv() {
      int var1 = this.uVunuUNVVUUV();
      if (var1 >= 0) {
         return var1;
      } else {
         for (int var2 = 0; var2 < 36; var2++) {
            class_1799 var3 = uUnuvNvvNU.field_1724.method_31548().method_5438(var2);
            if (this.C00OOC00oO(var3)) {
               return var2 < 9 ? var2 + 36 : var2;
            }
         }

         return -1;
      }
   }

   private int uVunuUNVVUUV() {
      for (int var1 = 0; var1 < 36; var1++) {
         class_1799 var2 = uUnuvNvvNU.field_1724.method_31548().method_5438(var1);
         if (this.C00OOC00oO(var2) && !this.vVvUvVVuuNvV(var2)) {
            return var1 < 9 ? var1 + 36 : var1;
         }
      }

      return -1;
   }

   public boolean UuuNnUvUuv() {
      class_1799 var1 = uUnuvNvvNU.field_1724.method_6079();
      return this.UuUVuuUu(var1);
   }

   private boolean UuUVuuUu(class_1799 var1) {
      return var1 != null && var1.method_31574(class_1802.field_8288);
   }

   private boolean C00OOC00oO(class_1799 var1) {
      return this.UuUVuuUu(var1) && (!this.uNnUnnuNUnNu.C00OOC00oO("Не свапать если в КД") || !this.uUnuvNvvNU(var1));
   }

   private boolean uUnuvNvvNU(class_1799 var1) {
      return uUnuvNvvNU.field_1724 != null && var1 != null && !var1.method_7960() && uUnuvNvvNU.field_1724.method_7357().method_7904(var1);
   }

   private boolean vVvUvVVuuNvV(class_1799 var1) {
      return this.UuUVuuUu(var1) && (var1.method_7942() || var1.method_7958());
   }

   private boolean UNnVVNvvnVvU() {
      return this.uNnUnnuNUnNu()
         || this.nNvNUVU()
         || this.UnUNuUU()
         || this.NnUuNNU()
         || uUnuvNvvNU.field_1724.method_6032() + uUnuvNvvNU.field_1724.method_6067() <= this.NnUuNNU.uUnuvNvvNU();
   }

   private boolean uNnUnnuNUnNu() {
      class_1799 var1 = uUnuvNvvNU.field_1724.method_6118(class_1304.field_6174);
      return var1.method_7909() == class_1802.field_8833
         && this.uNnUnnuNUnNu.C00OOC00oO("Здоровье с элитрами")
         && uUnuvNvvNU.field_1724.method_6032() + uUnuvNvvNU.field_1724.method_6067() <= this.nNvNUVU.uUnuvNvvNU();
   }

   private boolean NnUuNNU() {
      return this.uNnUnnuNUnNu.C00OOC00oO("Падение") && uUnuvNvvNU.field_1724.field_6017 > 12.0;
   }

   private boolean nNvNUVU() {
      if (!this.uNnUnnuNUnNu.C00OOC00oO("Эндер-кристалл")) {
         return false;
      } else {
         double var1 = this.UnUNuUU.uUnuvNvvNU() * this.UnUNuUU.uUnuvNvvNU();
         class_238 var3 = uUnuvNvvNU.field_1724.method_5829().method_1014(this.UnUNuUU.uUnuvNvvNU());
         boolean var4 = !uUnuvNvvNU.field_1687.method_8390(class_1511.class, var3, var2 -> var2.method_5858(uUnuvNvvNU.field_1724) <= var1).isEmpty();
         if (var4) {
            if (!(uUnuvNvvNU.field_1724.method_6079().method_7909() instanceof class_1809)) {
               return true;
            }

            if (!this.UvUvUNuvNU.uUnuvNvvNU()) {
               return true;
            }
         }

         return false;
      }
   }

   private boolean UnUNuUU() {
      if (!this.uNnUnnuNUnNu.C00OOC00oO("Динамит")) {
         return false;
      } else {
         double var1 = this.uUVuVvuNUvnu.uUnuvNvvNU() * this.uUVuVvuNUvnu.uUnuvNvvNU();
         class_238 var3 = uUnuvNvvNU.field_1724.method_5829().method_1014(this.uUVuVvuNUvnu.uUnuvNvvNU());
         return !uUnuvNvvNU.field_1687
            .method_8390(
               class_1297.class, var3, var2 -> (var2 instanceof class_1541 || var2 instanceof class_1701) && var2.method_5858(uUnuvNvvNU.field_1724) <= var1
            )
            .isEmpty();
      }
   }

   @Override
   public void C00OOC00oO() {
      super.C00OOC00oO();
      this.UvnvNVnnnnNU();
   }

   static enum NVnVnNnN {
      IDLE,
      PREPARE,
      SWAP,
      RESTORE,
      COOLDOWN;
   }
}
