package ru.metaculture.protection;

import net.minecraft.class_1268;
import net.minecraft.class_1269;
import net.minecraft.class_1713;
import net.minecraft.class_1792;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_2246;
import net.minecraft.class_2248;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_243;
import net.minecraft.class_2680;
import net.minecraft.class_2868;
import net.minecraft.class_3532;
import net.minecraft.class_3965;
import org.wild.module.api.Module;
import org.wild.module.api.ModuleRegister;

@ModuleRegister(
   UuUVuuUu = "ClanUpgrade",
   uUnuvNvvNU = oOOOo0.Misc,
   C00OOC00oO = "Прокачивает за вас клан",
   vVvUvVVuuNvV = {uVUNNUnNvU.RISKY}
)
public class ClanUpgrade extends Module {
   private static final String NVNnnvnuunNv = "Факел";
   private static final String uVunuUNVVUUV = "Красной пылью";
   private static final class_1792[] UNnVVNvvnVvU = new class_1792[]{class_1802.field_8810, class_1802.field_8530};
   private static final class_1792[] uNnUnnuNUnNu = new class_1792[]{class_1802.field_8725};
   private static final int NnUuNNU = 545;
   private static final int nNvNUVU = 1;
   private static final float UnUNuUU = -1170.1321F;
   private static final float uUVuVvuNUvnu = 90.0F;
   private static final float UvUvUNuvNU = 180.0F;
   private static final ClanUpgrade.NVnVnNnN[] c0oOOCcCoC0 = new ClanUpgrade.NVnVnNnN[]{
      new ClanUpgrade.NVnVnNnN(7, 1, true),
      new ClanUpgrade.NVnVnNnN(11, 0, true),
      new ClanUpgrade.NVnVnNnN(28, 0, false),
      new ClanUpgrade.NVnVnNnN(31, 0, true),
      new ClanUpgrade.NVnVnNnN(32, 0, false),
      new ClanUpgrade.NVnVnNnN(34, 0, true),
      new ClanUpgrade.NVnVnNnN(539, 0, false),
      new ClanUpgrade.NVnVnNnN(539, 1, false)
   };
   private final UvNnUnuNUUU VVnVNnunVvu = new UvNnUnuNUUU("Режим", "Красной пылью", "Факел", "Красной пылью");
   private final NnuUuVVVvUu unNNVVNnvvV = new NnuUuVVVvUu();
   private int NuunnvnN;
   private boolean NVUunUNUN;
   private boolean UUVNuUNUvUnV;

   public ClanUpgrade() {
      this.UuUVuuUu(new nvUuvVvuuN[]{this.VVnVNnunVvu});
   }

   @Override
   public void UuUVuuUu() {
      this.uVunuUNVVUUV();
      super.UuUVuuUu();
   }

   @Override
   public void C00OOC00oO() {
      this.unNNVVNnvvV.UuUVuuUu();
      this.uVUVnuvnuVuv();
      this.uVunuUNVVUUV();
      super.C00OOC00oO();
   }

   @vuVvUNNvVNV
   public void UuUVuuUu(nVunNNvuv var1) {
      if (uUnuvNvvNU.field_1724 != null && uUnuvNvvNU.field_1687 != null && uUnuvNvvNU.field_1761 != null && uUnuvNvvNU.method_1562() != null) {
         class_1792[] var2 = this.UuuNnUvUuv();
         if (!this.UuUVuuUu(var2)) {
            vVnvuVVUunuv.UuUVuuUu("§c[ClanUpgrade] §fНет предметов для режима: " + this.VVnVNnunVvu.uUnuvNvvNU());
            this.NVNnnvnuunNv();
         } else {
            class_2338 var3 = uUnuvNvvNU.field_1724.method_24515().method_10074();
            class_2680 var4 = uUnuvNvvNU.field_1687.method_8320(var3);
            if (!var4.method_45474() && var4.method_26227().method_15769()) {
               this.nUUVuvU();
               if (!this.UnUNVVVNuv()) {
                  this.UvnvNVnnnnNU();
               } else {
                  this.vNVuvnUUnuUn();
                  this.UuUVuuUu(var3, var3.method_10084());
                  this.NuunnvnN++;
                  if (this.NuunnvnN >= 545) {
                     this.NuunnvnN = 0;
                     this.NVUunUNUN = false;
                     this.UUVNuUNUvUnV = false;
                  }
               }
            } else {
               this.UvnvNVnnnnNU();
            }
         }
      }
   }

   private class_1792[] UuuNnUvUuv() {
      return this.VVnVNnunVvu.C00OOC00oO("Факел") ? UNnVVNvvnVvU : uNnUnnuNUnNu;
   }

   private boolean UuUVuuUu(class_1792[] var1) {
      class_1799 var2 = uUnuvNvvNU.field_1724.method_31548().method_5438(1);
      if (this.UuUVuuUu(var2, var1)) {
         this.C00OOC00oO(1);
         return true;
      } else {
         int var3 = this.C00OOC00oO(var1);
         if (var3 == -1) {
            return false;
         } else {
            this.UuUVuuUu(var3);
            this.C00OOC00oO(1);
            return this.UuUVuuUu(uUnuvNvvNU.field_1724.method_31548().method_5438(1), var1);
         }
      }
   }

   private int C00OOC00oO(class_1792[] var1) {
      for (int var2 = 0; var2 < 36; var2++) {
         if (var2 != 1 && this.UuUVuuUu(uUnuvNvvNU.field_1724.method_31548().method_5438(var2), var1)) {
            return var2;
         }
      }

      return -1;
   }

   private boolean UuUVuuUu(class_1799 var1, class_1792[] var2) {
      if (var1 != null && !var1.method_7960()) {
         for (class_1792 var6 : var2) {
            if (var1.method_31574(var6)) {
               return true;
            }
         }

         return false;
      } else {
         return false;
      }
   }

   private void UuUVuuUu(int var1) {
      if (var1 != 1) {
         int var2 = var1 < 9 ? 36 + var1 : var1;
         uUnuvNvvNU.field_1761.method_2906(uUnuvNvvNU.field_1724.field_7498.field_7763, var2, 1, class_1713.field_7791, uUnuvNvvNU.field_1724);
      }
   }

   private void C00OOC00oO(int var1) {
      if (var1 >= 0 && var1 <= 8) {
         if (uUnuvNvvNU.field_1724.method_31548().method_67532() != var1) {
            uUnuvNvvNU.field_1724.method_31548().method_61496(var1);
            uUnuvNvvNU.method_1562().method_52787(new class_2868(var1));
         }
      }
   }

   private void nUUVuvU() {
      this.unNNVVNnvvV.UuUVuuUu(new uuUuvNuNVNVU(-1170.1321F, 90.0F), 180.0F, 180.0F, 1, 15);
   }

   private boolean UnUNVVVNuv() {
      float var1 = Math.abs(class_3532.method_15393(-1170.1321F - uUnuvNvvNU.field_1724.method_36454()));
      float var2 = Math.abs(90.0F - uUnuvNvvNU.field_1724.method_36455());
      return var1 <= 1.0F && var2 <= 1.0F;
   }

   private void UuUVuuUu(class_2338 var1, class_2338 var2) {
      for (ClanUpgrade.NVnVnNnN var6 : c0oOOCcCoC0) {
         if (var6.tick == this.NuunnvnN) {
            if (var6.button == 1) {
               this.UUVNuUNUvUnV = var6.press;
               uUnuvNvvNU.field_1690.field_1904.method_23481(this.UUVNuUNUvUnV);
               if (var6.press) {
                  this.UuUVuuUu(var1);
               }
            } else if (var6.button == 0) {
               this.NVUunUNUN = var6.press;
               uUnuvNvvNU.field_1690.field_1886.method_23481(this.NVUunUNUN);
               if (var6.press) {
                  this.C00OOC00oO(var2);
               } else {
                  uUnuvNvvNU.field_1761.method_2925();
               }
            }
         }
      }
   }

   private void UuUVuuUu(class_2338 var1) {
      if (this.UuUVuuUu(uUnuvNvvNU.field_1724.method_6047(), this.UuuNnUvUuv())) {
         class_243 var2 = new class_243(var1.method_10263() + 0.5, var1.method_10264() + 1.0, var1.method_10260() + 0.5);
         class_3965 var3 = new class_3965(var2, class_2350.field_11036, var1, false);
         class_1269 var4 = uUnuvNvvNU.field_1761.method_2896(uUnuvNvvNU.field_1724, class_1268.field_5808, var3);
         if (var4 != class_1269.field_5811 && var4 != class_1269.field_5814) {
            uUnuvNvvNU.field_1724.method_6104(class_1268.field_5808);
         } else {
            var4 = uUnuvNvvNU.field_1761.method_2919(uUnuvNvvNU.field_1724, class_1268.field_5808);
            if (var4 != class_1269.field_5811 && var4 != class_1269.field_5814) {
               uUnuvNvvNU.field_1724.method_6104(class_1268.field_5808);
            }
         }
      }
   }

   private void C00OOC00oO(class_2338 var1) {
      class_2680 var2 = uUnuvNvvNU.field_1687.method_8320(var1);
      if (this.UuUVuuUu(var2)) {
         uUnuvNvvNU.field_1761.method_2910(var1, class_2350.field_11036);
         uUnuvNvvNU.field_1724.method_6104(class_1268.field_5808);
      }
   }

   private void vNVuvnUUnuUn() {
      this.C00OOC00oO(1);
      uUnuvNvvNU.field_1690.field_1894.method_23481(false);
      uUnuvNvvNU.field_1690.field_1881.method_23481(false);
      uUnuvNvvNU.field_1690.field_1913.method_23481(false);
      uUnuvNvvNU.field_1690.field_1849.method_23481(false);
      uUnuvNvvNU.field_1690.field_1903.method_23481(false);
      uUnuvNvvNU.field_1690.field_1832.method_23481(false);
      uUnuvNvvNU.field_1690.field_1867.method_23481(false);
      uUnuvNvvNU.field_1690.field_1904.method_23481(this.UUVNuUNUvUnV);
      uUnuvNvvNU.field_1690.field_1886.method_23481(this.NVUunUNUN);
      if (uUnuvNvvNU.field_1724.method_5624()) {
         uUnuvNvvNU.field_1724.method_5728(false);
      }
   }

   private void UvnvNVnnnnNU() {
      this.NVUunUNUN = false;
      this.UUVNuUNUvUnV = false;
      this.vNVuvnUUnuUn();
   }

   private void uVUVnuvnuVuv() {
      if (uUnuvNvvNU.field_1690 != null) {
         uUnuvNvvNU.field_1690.field_1894.method_23481(false);
         uUnuvNvvNU.field_1690.field_1881.method_23481(false);
         uUnuvNvvNU.field_1690.field_1913.method_23481(false);
         uUnuvNvvNU.field_1690.field_1849.method_23481(false);
         uUnuvNvvNU.field_1690.field_1903.method_23481(false);
         uUnuvNvvNU.field_1690.field_1832.method_23481(false);
         uUnuvNvvNU.field_1690.field_1867.method_23481(false);
         uUnuvNvvNU.field_1690.field_1904.method_23481(false);
         uUnuvNvvNU.field_1690.field_1886.method_23481(false);
      }
   }

   private boolean UuUVuuUu(class_2680 var1) {
      class_2248 var2 = var1.method_26204();
      return var2 == class_2246.field_10091
         || var2 == class_2246.field_10336
         || var2 == class_2246.field_10099
         || var2 == class_2246.field_10523
         || var2 == class_2246.field_10301;
   }

   private void NVNnnvnuunNv() {
      if (this.nuUnNvnuUu) {
         this.a_();
      }
   }

   private void uVunuUNVVUUV() {
      this.NuunnvnN = 0;
      this.NVUunUNUN = false;
      this.UUVNuUNUvUnV = false;
   }

   record NVnVnNnN(int tick, int button, boolean press) {
   }
}
