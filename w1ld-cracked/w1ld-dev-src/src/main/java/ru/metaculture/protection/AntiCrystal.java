package ru.metaculture.protection;

import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import net.minecraft.class_1268;
import net.minecraft.class_1713;
import net.minecraft.class_1747;
import net.minecraft.class_1799;
import net.minecraft.class_2246;
import net.minecraft.class_2248;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_238;
import net.minecraft.class_243;
import net.minecraft.class_2626;
import net.minecraft.class_2637;
import net.minecraft.class_2680;
import net.minecraft.class_2868;
import net.minecraft.class_3532;
import net.minecraft.class_3965;
import org.wild.module.api.Module;
import org.wild.module.api.ModuleRegister;

@uNUunUnnnVu(
   uUnuvNvvNU = {"lichoday"}
)
@ModuleRegister(
   UuUVuuUu = "AntiCrystal",
   uUnuvNvvNU = oOOOo0.Combat,
   C00OOC00oO = "Перекрывает блоками опасные базы под кристаллы рядом с вами",
   vVvUvVVuuNvV = {uVUNNUnNvU.RISKY}
)
public class AntiCrystal extends Module {
   private final nNUuNvVn NVNnnvnuunNv = new nNUuNvVn("Radius", 4.2F, 2.0F, 6.0F, 0.1F, false);
   private final nNUuNvVn uVunuUNVVUUV = new nNUuNvVn("Delay", 55.0F, 0.0F, 220.0F, 5.0F, false);
   private final nNUuNvVn UNnVVNvvnVvU = new nNUuNvVn("Reaction", 25.0F, 0.0F, 150.0F, 5.0F, false);
   private final nNUuNvVn uNnUnnuNUnNu = new nNUuNvVn("Yaw Speed", 180.0F, 45.0F, 360.0F, 5.0F, false);
   private final nNUuNvVn NnUuNNU = new nNUuNvVn("Pitch Speed", 170.0F, 45.0F, 360.0F, 5.0F, false);
   private final vvNnnUNnVvn nNvNUVU = new vvNnnUNnVvn("Inventory Swap", true);
   private final vvNnnUNnVvn UnUNuUU = new vvNnnUNnVvn("Restore Slot", false);
   private final vvNnnUNnVvn uUVuVvuNUvnu = new vvNnnUNnVvn("Packet Trigger", true);
   private final vvNnnUNnVvn UvUvUNuvNU = new vvNnnUNnVvn("Rescan", true);
   private final ArrayDeque<AntiCrystal.NVnVnNnN> c0oOOCcCoC0 = new ArrayDeque<>();
   private final Set<Long> VVnVNnunVvu = new HashSet<>();
   private long unNNVVNnvvV;

   public AntiCrystal() {
      this.UuUVuuUu(
         new nvUuvVvuuN[]{
            this.NVNnnvnuunNv,
            this.uVunuUNVVUUV,
            this.UNnVVNvvnVvU,
            this.uNnUnnuNUnNu,
            this.NnUuNNU,
            this.nNvNUVU,
            this.UnUNuUU,
            this.uUVuVvuNUvnu,
            this.UvUvUNuvNU
         }
      );
   }

   @vuVvUNNvVNV
   public void UuUVuuUu(uvUUuvnunU var1) {
      if (this.uUVuVvuNUvnu.uUnuvNvvNU() && !NUvunNNvN.UuUVuuUu() && var1 != null && var1.uNNnnnuuuN().equals(uvUUuvnunU.NVnVnNnN.RECEIVE)) {
         if (var1.vVvUvVVuuNvV() instanceof class_2626 var2) {
            this.UuUVuuUu(var2.method_11309(), var2.method_11308());
         } else if (var1.vVvUvVVuuNvV() instanceof class_2637 var3) {
            var3.method_30621(this::UuUVuuUu);
         }
      }
   }

   @vuVvUNNvVNV
   public void UuUVuuUu(nVunNNvuv var1) {
      if (!NUvunNNvN.UuUVuuUu() && uUnuvNvvNU.field_1761 != null && uUnuvNvvNU.method_1562() != null) {
         if (this.UvUvUNuvNU.uUnuvNvvNU()) {
            this.UuuNnUvUuv();
         }

         this.UnUNVVVNuv();
         long var2 = System.currentTimeMillis();
         if (!((float)(var2 - this.unNNVVNnvvV) < this.uVunuUNVVUUV.uUnuvNvvNU())) {
            AntiCrystal.NVnVnNnN var4 = this.UuUVuuUu(var2);
            if (var4 != null) {
               int var5 = this.nUUVuvU();
               if (var5 >= 0) {
                  if (this.UuUVuuUu(var4.base(), var5)) {
                     this.unNNVVNnvvV = var2;
                     this.VVnVNnunVvu.remove(var4.base().method_10063());
                     this.c0oOOCcCoC0.remove(var4);
                  }
               }
            }
         }
      } else {
         this.vNVuvnUUnuUn();
      }
   }

   @Override
   public void C00OOC00oO() {
      this.vNVuvnUUnuUn();
      COC0OCc.UuUVuuUu = COC0OCc.VvunVVUvUNnv.IDLE;
      COC0OCc.nuUnNvnuUu = 0;
      COC0OCc.uVUuuVnNVU = null;
      NNvvnnunn.UuUVuuUu = false;
      super.C00OOC00oO();
   }

   private void UuUVuuUu(class_2338 var1, class_2680 var2) {
      if (var1 != null && var2 != null && this.UuUVuuUu(var2.method_26204()) && this.uUnuvNvvNU(var1)) {
         this.UuUVuuUu(var1);
      }
   }

   private void UuuNnUvUuv() {
      class_2338 var1 = uUnuvNvvNU.field_1724.method_24515();
      int var2 = class_3532.method_15386(this.NVNnnvnuunNv.uUnuvNvvNU());

      for (int var3 = -var2; var3 <= var2; var3++) {
         for (int var4 = -2; var4 <= 2; var4++) {
            for (int var5 = -var2; var5 <= var2; var5++) {
               class_2338 var6 = var1.method_10069(var3, var4, var5);
               if (this.uUnuvNvvNU(var6) && this.UuUVuuUu(uUnuvNvvNU.field_1687.method_8320(var6).method_26204())) {
                  this.UuUVuuUu(var6);
               }
            }
         }
      }
   }

   private void UuUVuuUu(class_2338 var1) {
      if (this.vVvUvVVuuNvV(var1)) {
         long var2 = var1.method_10063();
         if (this.VVnVNnunVvu.add(var2)) {
            this.c0oOOCcCoC0.addLast(new AntiCrystal.NVnVnNnN(var1.method_10062(), System.currentTimeMillis()));
         }
      }
   }

   private AntiCrystal.NVnVnNnN UuUVuuUu(long var1) {
      AntiCrystal.NVnVnNnN var3 = null;
      double var4 = Double.MAX_VALUE;

      for (AntiCrystal.NVnVnNnN var7 : this.c0oOOCcCoC0) {
         if (!((float)(var1 - var7.createdAt()) < this.UNnVVNvvnVvU.uUnuvNvvNU()) && this.vVvUvVVuuNvV(var7.base())) {
            double var8 = this.C00OOC00oO(var7.base());
            if (var8 < var4) {
               var4 = var8;
               var3 = var7;
            }
         }
      }

      return var3;
   }

   private double C00OOC00oO(class_2338 var1) {
      class_243 var2 = var1.method_46558();
      class_243 var3 = uUnuvNvvNU.field_1724.method_19538();
      class_243 var4 = var2.method_1020(var3);
      double var5 = var4.method_1033();
      class_243 var7 = uUnuvNvvNU.field_1724.method_18798();
      double var8 = 0.0;
      if (var7.method_37268() > 1.0E-5 && var4.method_37268() > 1.0E-5) {
         var8 = -var7.method_1029().method_1026(new class_243(var4.field_1352, 0.0, var4.field_1350).method_1029()) * 0.42;
      }

      class_243 var10 = uUnuvNvvNU.field_1724.method_5828(1.0F);
      double var11 = var4.method_1027() <= 1.0E-5 ? 0.0 : -var10.method_1029().method_1026(var4.method_1029()) * 0.22;
      double var13 = Math.abs(var2.field_1351 - uUnuvNvvNU.field_1724.method_23318()) * 0.18;
      return var5 + var8 + var11 + var13;
   }

   private boolean uUnuvNvvNU(class_2338 var1) {
      return var1 != null && uUnuvNvvNU.field_1724 != null
         ? uUnuvNvvNU.field_1724.method_5707(var1.method_46558()) <= this.NVNnnvnuunNv.uUnuvNvvNU() * this.NVNnnvnuunNv.uUnuvNvvNU()
         : false;
   }

   private boolean vVvUvVVuuNvV(class_2338 var1) {
      if (var1 != null && uUnuvNvvNU.field_1687 != null) {
         class_2680 var2 = uUnuvNvvNU.field_1687.method_8320(var1);
         class_2338 var3 = var1.method_10084();
         return this.UuUVuuUu(var2.method_26204())
            && uUnuvNvvNU.field_1687.method_8320(var3).method_26215()
            && uUnuvNvvNU.field_1687.method_8335(null, class_238.method_30048(var3.method_46558(), 0.86, 0.86, 0.86)).isEmpty();
      } else {
         return false;
      }
   }

   private boolean UuUVuuUu(class_2338 var1, int var2) {
      int var3 = uUnuvNvvNU.field_1724.method_31548().method_67532();
      int var4 = this.UuUVuuUu(var2, var3);
      if (var4 < 0) {
         return false;
      } else {
         this.UuUVuuUu(var4);
         class_243 var5 = var1.method_46558().method_1031(0.0, 0.5, 0.0);
         this.UuUVuuUu(var5);
         class_3965 var6 = new class_3965(var5, class_2350.field_11036, var1, false);
         uUnuvNvvNU.field_1761.method_2896(uUnuvNvvNU.field_1724, class_1268.field_5808, var6);
         uUnuvNvvNU.field_1724.method_6104(class_1268.field_5808);
         if (this.UnUNuUU.uUnuvNvvNU() && var3 != var4) {
            this.UuUVuuUu(var3);
         }

         return true;
      }
   }

   private int UuUVuuUu(int var1, int var2) {
      if (var1 >= 0 && var1 < 9) {
         return var1;
      } else if (this.nNvNUVU.uUnuvNvvNU() && var1 >= 9 && var1 <= 35) {
         int var3 = var2 >= 0 && var2 < 9 ? var2 : 0;
         uUnuvNvvNU.field_1761.method_2906(uUnuvNvvNU.field_1724.field_7512.field_7763, var1, var3, class_1713.field_7791, uUnuvNvvNU.field_1724);
         return var3;
      } else {
         return -1;
      }
   }

   private void UuUVuuUu(int var1) {
      if (var1 >= 0 && var1 <= 8 && var1 != uUnuvNvvNU.field_1724.method_31548().method_67532()) {
         uUnuvNvvNU.field_1724.method_31548().method_61496(var1);
         uUnuvNvvNU.method_1562().method_52787(new class_2868(var1));
      }
   }

   private int nUUVuvU() {
      int var1 = -1;
      int var2 = Integer.MIN_VALUE;

      for (int var3 = 0; var3 < 36; var3++) {
         class_1799 var4 = uUnuvNvvNU.field_1724.method_31548().method_5438(var3);
         if (this.UuUVuuUu(var4)) {
            int var5 = this.UuUVuuUu(var4, var3);
            if (var5 > var2) {
               var2 = var5;
               var1 = var3;
            }
         }
      }

      return var1;
   }

   private boolean UuUVuuUu(class_1799 var1) {
      if (var1 != null && !var1.method_7960() && var1.method_7909() instanceof class_1747 var2) {
         class_2248 var5 = var2.method_7711();
         if (var5 != class_2246.field_10124
            && var5 != class_2246.field_10102
            && var5 != class_2246.field_10534
            && var5 != class_2246.field_10255
            && var5 != class_2246.field_10535) {
            class_2680 var4 = var5.method_9564();
            return var4.method_26212(uUnuvNvvNU.field_1687, class_2338.field_10980);
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   private int UuUVuuUu(class_1799 var1, int var2) {
      class_2248 var3 = ((class_1747)var1.method_7909()).method_7711();
      int var4 = var2 < 9 ? 1000 : 0;
      if (var3 == class_2246.field_10540) {
         var4 += 80;
      } else if (var3 == class_2246.field_10445 || var3 == class_2246.field_10340 || var3 == class_2246.field_28888) {
         var4 += 65;
      } else if (var3 == class_2246.field_10515 || var3 == class_2246.field_10566) {
         var4 += 40;
      }

      return var4 + Math.min(64, var1.method_7947());
   }

   private void UuUVuuUu(class_243 var1) {
      class_243 var2 = var1.method_1020(uUnuvNvvNU.field_1724.method_33571());
      float var3 = (float)Math.toDegrees(Math.atan2(-var2.field_1352, var2.field_1350));
      float var4 = (float)(-Math.toDegrees(Math.atan2(var2.field_1351, Math.hypot(var2.field_1352, var2.field_1350))));
      COC0OCc.UuUVuuUu(
         new uuUuvNuNVNVU(var3, class_3532.method_15363(var4, -90.0F, 90.0F)),
         this.uNnUnnuNUnNu.uUnuvNvvNU(),
         this.NnUuNNU.uUnuvNvvNU(),
         this.uNnUnnuNUnNu.uUnuvNvvNU(),
         this.NnUuNNU.uUnuvNvvNU(),
         2,
         16,
         false
      );
   }

   private boolean UuUVuuUu(class_2248 var1) {
      return var1 == class_2246.field_10540 || var1 == class_2246.field_9987;
   }

   private void UnUNVVVNuv() {
      Iterator var1 = this.c0oOOCcCoC0.iterator();
      long var2 = System.currentTimeMillis();

      while (var1.hasNext()) {
         AntiCrystal.NVnVnNnN var4 = (AntiCrystal.NVnVnNnN)var1.next();
         if (var2 - var4.createdAt() > 2500L || !this.vVvUvVVuuNvV(var4.base())) {
            this.VVnVNnunVvu.remove(var4.base().method_10063());
            var1.remove();
         }
      }
   }

   private void vNVuvnUUnuUn() {
      this.c0oOOCcCoC0.clear();
      this.VVnVNnunVvu.clear();
   }

   record NVnVnNnN(class_2338 base, long createdAt) {
   }
}
