package ru.metaculture.protection;

import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.Queue;
import java.util.Set;
import net.minecraft.class_1268;
import net.minecraft.class_1297;
import net.minecraft.class_1511;
import net.minecraft.class_1657;
import net.minecraft.class_1713;
import net.minecraft.class_1802;
import net.minecraft.class_2246;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_238;
import net.minecraft.class_243;
import net.minecraft.class_2680;
import net.minecraft.class_2815;
import net.minecraft.class_3532;
import net.minecraft.class_3965;
import net.minecraft.class_9892;
import org.wild.module.api.Module;
import org.wild.module.api.ModuleRegister;

@ModuleRegister(
   UuUVuuUu = "AutoExplosion",
   uUnuvNvvNU = oOOOo0.Combat,
   C00OOC00oO = "Автоматически ставит и взрывает кристаллы на новом обсидиане",
   vVvUvVVuuNvV = {uVUNNUnNvU.RISKY}
)
public class AutoExplosion extends Module {
   private static final float NVNnnvnuunNv = 6.0F;
   private final nNUuNvVn uVunuUNVVUUV = new nNUuNvVn("Количество кристаллов", 1.0F, 1.0F, 10.0F, 1.0F, false);
   private final vvNnnUNnVvn UNnVVNvvnVvU = new vvNnnUNnVvn("Не взрывать себя", false);
   private final vvNnnUNnVvn uNnUnnuNUnNu = new vvNnnUNnVvn("Не взрывать друзей", false);
   private final Set<class_2338> NnUuNNU = new HashSet<>();
   private final Set<class_2338> nNvNUVU = new HashSet<>();
   private final Queue<class_2338> UnUNuUU = new ArrayDeque<>();
   private class_2338 uUVuVvuNUvnu;
   private int UvUvUNuvNU;
   private int c0oOOCcCoC0 = -1;
   private int VVnVNnunVvu = -1;
   private int unNNVVNnvvV;
   private class_2338 NuunnvnN;

   public AutoExplosion() {
      this.UuUVuuUu(new nvUuvVvuuN[]{this.uVunuUNVVUUV, this.UNnVVNvvnVvU, this.uNnUnnuNUnNu});
   }

   @vuVvUNNvVNV
   public void UuUVuuUu(nVunNNvuv var1) {
      if (!NUvunNNvN.UuUVuuUu() && uUnuvNvvNU.field_1761 != null && uUnuvNvvNU.method_1562() != null) {
         this.UuuNnUvUuv();
         if (this.unNNVVNnvvV > 0) {
            this.unNNVVNnvvV--;
            if (this.unNNVVNnvvV == 0) {
               this.UnUNVVVNuv();
            }
         } else if (this.NuunnvnN == null) {
            if (this.uUVuVvuNUvnu == null) {
               this.nUUVuvU();
            }

            if (this.uUVuVvuNUvnu != null) {
               if (!this.UuUVuuUu(this.uUVuVvuNUvnu, 3.0)) {
                  this.vNVuvnUUnuUn();
               } else if (!this.vVvUvVVuuNvV(this.uUVuVvuNUvnu)) {
                  this.vNVuvnUUnuUn();
               } else {
                  class_1511 var4 = this.C00OOC00oO(this.uUVuVvuNUvnu);
                  if (var4 != null) {
                     if (!this.VVuuUN(this.uUVuVvuNUvnu)) {
                        this.vNVuvnUUnuUn();
                     } else {
                        this.UuUVuuUu(var4);
                        this.UvUvUNuvNU--;
                        if (this.UvUvUNuvNU <= 0) {
                           this.uUVuVvuNUvnu = null;
                        }
                     }
                  } else if (this.UvUvUNuvNU > 0 && !this.nuUnNvnuUu(this.uUVuVvuNUvnu)) {
                     this.vNVuvnUUnuUn();
                  } else {
                     if (this.UvUvUNuvNU > 0 && this.uNNnnnuuuN(this.uUVuVvuNUvnu)) {
                        int var5 = UVuvVVvnVNu.UuUVuuUu(class_1802.field_8301);
                        if (var5 == -1) {
                           this.vNVuvnUUnuUn();
                           return;
                        }

                        this.UuUVuuUu(this.uUVuVvuNUvnu, var5);
                     }
                  }
               }
            }
         } else {
            class_2338 var2 = this.NuunnvnN;
            this.NuunnvnN = null;
            if (var2.equals(this.uUVuVvuNUvnu) && this.UvUvUNuvNU > 0) {
               class_1511 var3 = this.C00OOC00oO(var2);
               if (var3 != null) {
                  if (!this.VVuuUN(var2)) {
                     this.vNVuvnUUnuUn();
                  } else {
                     this.UuUVuuUu(var3);
                     this.UvUvUNuvNU--;
                     if (this.UvUvUNuvNU <= 0) {
                        this.uUVuVvuNUvnu = null;
                     }
                  }
               } else {
                  if (this.nuUnNvnuUu(var2) && this.uNNnnnuuuN(var2)) {
                     this.uUnuvNvvNU(var2);
                  } else {
                     this.vNVuvnUUnuUn();
                  }
               }
            } else {
               this.vNVuvnUUnuUn();
            }
         }
      }
   }

   private void UuuNnUvUuv() {
      class_2338 var1 = uUnuvNvvNU.field_1724.method_24515();
      byte var2 = 3;
      HashSet var3 = new HashSet();

      for (int var4 = -var2; var4 <= var2; var4++) {
         for (int var5 = -var2; var5 <= var2; var5++) {
            for (int var6 = -var2; var6 <= var2; var6++) {
               class_2338 var7 = var1.method_10069(var4, var5, var6).method_10062();
               if (this.UuUVuuUu(var7, (double)var2)) {
                  var3.add(var7);
                  boolean var8 = uUnuvNvvNU.field_1687.method_8320(var7).method_27852(class_2246.field_10540);
                  if (!this.NnUuNNU.contains(var7)) {
                     if (var8) {
                        this.nNvNUVU.add(var7);
                     } else {
                        this.nNvNUVU.remove(var7);
                     }
                  } else {
                     boolean var9 = this.nNvNUVU.contains(var7);
                     if (!var9 && var8) {
                        this.nNvNUVU.add(var7);
                        this.UuUVuuUu(var7);
                     } else if (var9 && !var8) {
                        this.nNvNUVU.remove(var7);
                     }
                  }
               }
            }
         }
      }

      this.NnUuNNU.clear();
      this.NnUuNNU.addAll(var3);
   }

   private void UuUVuuUu(class_2338 var1) {
      if (this.UuUVuuUu(var1, 3.0)) {
         if (!var1.equals(this.uUVuVvuNUvnu)) {
            if (!this.UnUNuUU.contains(var1)) {
               this.UnUNuUU.offer(var1);
            }
         }
      }
   }

   private void nUUVuvU() {
      while (!this.UnUNuUU.isEmpty()) {
         class_2338 var1 = this.UnUNuUU.poll();
         if (this.UuUVuuUu(var1, 3.0) && this.vVvUvVVuuNvV(var1)) {
            this.uUVuVvuNUvnu = var1;
            this.UvUvUNuvNU = Math.max(1, Math.round(this.uVunuUNVVUUV.uUnuvNvvNU()));
            return;
         }
      }
   }

   private class_1511 C00OOC00oO(class_2338 var1) {
      class_238 var2 = new class_238(
         var1.method_10263() - 0.5,
         var1.method_10264() + 0.5,
         var1.method_10260() - 0.5,
         var1.method_10263() + 1.5,
         var1.method_10264() + 3.0,
         var1.method_10260() + 1.5
      );

      for (class_1297 var4 : uUnuvNvvNU.field_1687.method_8335(null, var2)) {
         if (var4 instanceof class_1511 var5) {
            return var5;
         }
      }

      return null;
   }

   private void UuUVuuUu(class_1511 var1) {
      this.UuUVuuUu(var1.method_19538());
      uUnuvNvvNU.field_1761.method_2918(uUnuvNvvNU.field_1724, var1);
      uUnuvNvvNU.field_1724.method_6104(class_1268.field_5808);
      this.unNNVVNnvvV = 2;
   }

   private void UuUVuuUu(class_2338 var1, int var2) {
      this.UuUVuuUu(var2);
      this.NuunnvnN = var1;
   }

   private void uUnuvNvvNU(class_2338 var1) {
      class_243 var2 = var1.method_46558().method_1031(0.0, 0.5, 0.0);
      this.UuUVuuUu(var2);
      uUnuvNvvNU.field_1761.method_2896(uUnuvNvvNU.field_1724, class_1268.field_5808, new class_3965(var2, class_2350.field_11036, var1, false));
      uUnuvNvvNU.field_1724.method_6104(class_1268.field_5808);
      this.unNNVVNnvvV = 2;
   }

   private boolean vVvUvVVuuNvV(class_2338 var1) {
      class_2680 var2 = uUnuvNvvNU.field_1687.method_8320(var1);
      return var2.method_27852(class_2246.field_10540) || var2.method_27852(class_2246.field_9987);
   }

   private boolean uNNnnnuuuN(class_2338 var1) {
      if (!this.vVvUvVVuuNvV(var1)) {
         return false;
      } else {
         class_2338 var2 = var1.method_10084();
         class_2338 var3 = var2.method_10084();
         return uUnuvNvvNU.field_1687.method_8320(var2).method_26215()
            && uUnuvNvvNU.field_1687.method_8320(var3).method_26215()
            && uUnuvNvvNU.field_1687.method_8335(null, new class_238(var2)).isEmpty()
            && uUnuvNvvNU.field_1687.method_8335(null, new class_238(var3)).isEmpty();
      }
   }

   private boolean UuUVuuUu(class_2338 var1, double var2) {
      return uUnuvNvvNU.field_1724.method_5707(var1.method_46558()) <= var2 * var2;
   }

   private boolean nuUnNvnuUu(class_2338 var1) {
      return this.UNnVVNvvnVvU.uUnuvNvvNU() && this.vNUvnnVnUvu(var1) ? false : this.VVuuUN(var1);
   }

   private boolean VVuuUN(class_2338 var1) {
      if (this.UNnVVNvvnVvU.uUnuvNvvNU() && this.vNUvnnVnUvu(var1)) {
         return false;
      } else if (!this.uNnUnnuNUnNu.uUnuvNvvNU()) {
         return true;
      } else {
         for (class_1657 var3 : uUnuvNvvNU.field_1687.method_18456()) {
            if (var3 != uUnuvNvvNU.field_1724
               && uNvUVUNvuUVV.UuUVuuUu(var3.method_5477().getString())
               && this.UuUVuuUu(var3, var1.method_46558().method_1031(0.0, 1.0, 0.0))) {
               return false;
            }
         }

         return true;
      }
   }

   private boolean vNUvnnVnUvu(class_2338 var1) {
      return uUnuvNvvNU.field_1724.method_31478() == var1.method_10264() + 1;
   }

   private boolean UuUVuuUu(class_1657 var1, class_243 var2) {
      double var3 = 12.0;
      return var1.method_5707(var2) > var3 * var3 ? false : class_9892.method_61731(var2, var1) > 0.0F;
   }

   private void UuUVuuUu(int var1) {
      if (this.c0oOOCcCoC0 < 0) {
         this.c0oOOCcCoC0 = uUnuvNvvNU.field_1724.method_31548().method_67532();
      }

      if (this.C00OOC00oO(var1)) {
         uUnuvNvvNU.field_1724.method_31548().method_61496(this.uUnuvNvvNU(var1));
      } else {
         this.VVnVNnunVvu = var1;
         uUnuvNvvNU.field_1761
            .method_2906(uUnuvNvvNU.field_1724.field_7498.field_7763, this.VVnVNnunVvu, this.c0oOOCcCoC0, class_1713.field_7791, uUnuvNvvNU.field_1724);
      }
   }

   private void UnUNVVVNuv() {
      if (this.c0oOOCcCoC0 >= 0) {
         if (this.VVnVNnunVvu >= 0) {
            uUnuvNvvNU.field_1761
               .method_2906(uUnuvNvvNU.field_1724.field_7498.field_7763, this.VVnVNnunVvu, this.c0oOOCcCoC0, class_1713.field_7791, uUnuvNvvNU.field_1724);
            if (uUnuvNvvNU.method_1562() != null) {
               uUnuvNvvNU.method_1562().method_52787(new class_2815(uUnuvNvvNU.field_1724.field_7498.field_7763));
            }

            this.VVnVNnunVvu = -1;
         }

         uUnuvNvvNU.field_1724.method_31548().method_61496(this.c0oOOCcCoC0);
         this.c0oOOCcCoC0 = -1;
      }
   }

   private boolean C00OOC00oO(int var1) {
      return var1 >= 0 && var1 <= 8 || var1 >= 36 && var1 <= 44;
   }

   private int uUnuvNvvNU(int var1) {
      return var1 >= 36 ? var1 - 36 : var1;
   }

   private void vNVuvnUUnuUn() {
      this.uUVuVvuNUvnu = null;
      this.UvUvUNuvNU = 0;
      this.NuunnvnN = null;
      this.UnUNVVVNuv();
   }

   private void UuUVuuUu(class_243 var1) {
      class_243 var2 = var1.method_1020(uUnuvNvvNU.field_1724.method_33571());
      float var3 = (float)Math.toDegrees(Math.atan2(-var2.field_1352, var2.field_1350));
      float var4 = (float)(-Math.toDegrees(Math.atan2(var2.field_1351, Math.hypot(var2.field_1352, var2.field_1350))));
      COC0OCc.UuUVuuUu(new uuUuvNuNVNVU(var3, class_3532.method_15363(var4, -90.0F, 90.0F)), 360.0F, 360.0F, 360.0F, 360.0F, 2, 30, false);
   }

   @Override
   public void C00OOC00oO() {
      if (this.c0oOOCcCoC0 >= 0 && uUnuvNvvNU.field_1724 != null) {
         this.UnUNVVVNuv();
      }

      this.uUVuVvuNUvnu = null;
      this.UvUvUNuvNU = 0;
      this.c0oOOCcCoC0 = -1;
      this.VVnVNnunVvu = -1;
      this.unNNVVNnvvV = 0;
      this.NuunnvnN = null;
      this.UnUNuUU.clear();
      this.NnUuNNU.clear();
      this.nNvNUVU.clear();
      COC0OCc.UuUVuuUu = COC0OCc.VvunVVUvUNnv.IDLE;
      COC0OCc.nuUnNvnuUu = 0;
      COC0OCc.uVUuuVnNVU = null;
      NNvvnnunn.UuUVuuUu = false;
      super.C00OOC00oO();
   }
}
