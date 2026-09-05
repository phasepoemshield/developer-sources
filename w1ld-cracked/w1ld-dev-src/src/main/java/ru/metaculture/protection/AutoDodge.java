package ru.metaculture.protection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import net.minecraft.class_1268;
import net.minecraft.class_1297;
import net.minecraft.class_1299;
import net.minecraft.class_1665;
import net.minecraft.class_1667;
import net.minecraft.class_1685;
import net.minecraft.class_1686;
import net.minecraft.class_1713;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_1844;
import net.minecraft.class_2338;
import net.minecraft.class_238;
import net.minecraft.class_243;
import net.minecraft.class_2596;
import net.minecraft.class_2604;
import net.minecraft.class_3486;
import net.minecraft.class_3532;
import net.minecraft.class_3959;
import net.minecraft.class_3965;
import net.minecraft.class_742;
import net.minecraft.class_7439;
import net.minecraft.class_8038;
import net.minecraft.class_9334;
import net.minecraft.class_239.class_240;
import net.minecraft.class_3959.class_242;
import net.minecraft.class_3959.class_3960;
import org.wild.module.api.Module;
import org.wild.module.api.ModuleRegister;

@ModuleRegister(
   UuUVuuUu = "AutoDodge",
   uUnuvNvvNU = oOOOo0.Movement,
   C00OOC00oO = "Автоматически реагирует на опасные зелья",
   vVvUvVVuuNvV = {uVUNNUnNvU.RISKY}
)
public class AutoDodge extends Module {
   private final Map<Integer, AutoDodge.NVnVnNnN> NVNnnvnuunNv = new HashMap<>();
   private static final int uVunuUNVVUUV = 50;
   private static final int UNnVVNvvnVvU = 20;
   private static final int uNnUnnuNUnNu = 100;
   private static final int NnUuNNU = 70;
   private static final int nNvNUVU = 8;
   private static final double UnUNuUU = 0.05;
   private static final double uUVuVvuNUvnu = 0.99;
   private static final double UvUvUNuvNU = 0.05;
   private static final double c0oOOCcCoC0 = 0.99;
   private int VVnVNnunVvu;
   private int unNNVVNnvvV;
   private int NuunnvnN;
   private int NVUunUNUN;
   private int UUVNuUNUvUnV = -1;
   private int vuvnUnVnUNnV = -1;
   private int nnuUVNUuvvVU = -1;
   private class_1799 nVVUuvuNnUN = class_1799.field_8037;
   private class_1799 nNnVnUNVV = class_1799.field_8037;
   private int nuunNvv;
   private class_243 uUVVvVVNvvn = class_243.field_1353;

   @vuVvUNNvVNV
   public void UuUVuuUu(nVUVuNnVvU var1) {
      if (uUnuvNvvNU.field_1724 != null && uUnuvNvvNU.field_1687 != null && uUnuvNvvNU.field_1761 != null) {
         this.UnUNVVVNuv();
         this.vNVuvnUUnuUn();
         this.UuuNnUvUuv();
         if (this.NVUunUNUN == 0) {
            class_238 var2 = uUnuvNvvNU.field_1724.method_5829().method_1014(2.0);
            double var3 = ((Integer)uUnuvNvvNU.field_1690.method_42503().method_41753()).intValue() * 16.0;
            class_238 var5 = uUnuvNvvNU.field_1724.method_5829().method_1014(var3);

            for (class_1686 var7 : uUnuvNvvNU.field_1687.method_8390(class_1686.class, var5, var0 -> true)) {
               AutoDodge.NVnVnNnN var8 = this.NVNnnvnuunNv.get(var7.method_5628());
               if (var8 != null
                  && this.UuUVuuUu(var7, var2)
                  && this.UuUVuuUu(var8.color())
                  && !(uUnuvNvvNU.field_1724.method_5739(var7) <= 2.3F)
                  && this.NuunnvnN >= 0) {
                  this.uUnuvNvvNU(var7.method_33571());
                  if (this.nUUVuvU()) {
                     this.NuunnvnN = 5;
                     break;
                  }
               }
            }

            this.NuunnvnN++;
         }
      } else {
         this.uVUVnuvnuVuv();
      }
   }

   @vuVvUNNvVNV
   public void UuUVuuUu(uNVVnVUNun var1) {
      if (this.nuunNvv > 0 && this.uUVVvVVNvvn.method_1027() != 0.0) {
         double var2 = Math.toRadians(uUnuvNvvNU.field_1724.method_36454());
         float var4 = (float)(-Math.sin(var2) * this.uUVVvVVNvvn.field_1352 + Math.cos(var2) * this.uUVVvVVNvvn.field_1350);
         float var5 = (float)(Math.cos(var2) * this.uUVVvVVNvvn.field_1352 + Math.sin(var2) * this.uUVVvVVNvvn.field_1350);
         var1.UuUVuuUu(class_3532.method_15363(var1.uUnuvNvvNU() + var4, -1.0F, 1.0F));
         var1.C00OOC00oO(class_3532.method_15363(var1.vVvUvVVuuNvV() + var5, -1.0F, 1.0F));
      }
   }

   @vuVvUNNvVNV
   public void UuUVuuUu(uvUUuvnunU var1) {
      if (!var1.uUnuvNvvNU() && uUnuvNvvNU.field_1724 != null && uUnuvNvvNU.field_1687 != null) {
         class_2596 var2 = var1.vVvUvVVuuNvV();
         this.UuUVuuUu(var2);
         if (var2 instanceof class_7439 var3 && var3.comp_763().getString().equals("На этой анархии этот предмет не работает")) {
            this.NuunnvnN = -50;
         }
      }
   }

   private void UuUVuuUu(class_2596<?> var1) {
      if (var1 instanceof class_8038 var15) {
         for (class_2596 var17 : var15.method_48324()) {
            this.UuUVuuUu(var17);
         }
      } else if (var1 instanceof class_2604 var2 && (var2.method_11169() == class_1299.field_56254 || var2.method_11169() == class_1299.field_56255)) {
         class_243 var3 = new class_243(var2.method_11175(), var2.method_11174(), var2.method_11176());
         class_243 var4 = new class_243(var2.method_11170(), var2.method_11172(), var2.method_11173());
         double var5 = Double.MAX_VALUE;
         int var7 = -1;

         for (class_742 var9 : uUnuvNvvNU.field_1687.method_18456()) {
            if (var9 != uUnuvNvvNU.field_1724 && !(uUnuvNvvNU.field_1724.method_5858(var9) > 400.0)) {
               int var10 = this.UuUVuuUu(var9.method_6047());
               if (var10 == -1) {
                  var10 = this.UuUVuuUu(var9.method_6079());
               }

               if (var10 != -1) {
                  double var11 = var3.method_1022(var9.method_19538());
                  if (!(var11 > 25.0)) {
                     boolean var13 = var9.method_23318() - var3.field_1351 > 2.0
                        && new class_243(var3.field_1352 - var9.method_23317(), 0.0, var3.field_1350 - var9.method_23321()).method_1033() < 15.0;
                     boolean var14 = var4.method_1027() > 1.0E-6 && var4.method_1029().method_1026(var9.method_5828(1.0F).method_1029()) > 0.1;
                     if ((var13 || var14) && var11 < var5) {
                        var5 = var11;
                        var7 = var10;
                     }
                  }
               }
            }
         }

         if (var7 != -1) {
            this.NuunnvnN = 0;
            this.NVNnnvnuunNv.put(var2.method_11167(), new AutoDodge.NVnVnNnN(var7));
         }
      }
   }

   private int UuUVuuUu(class_1799 var1) {
      if (!var1.method_31574(class_1802.field_8436)) {
         return -1;
      } else {
         class_1844 var2 = (class_1844)var1.method_58694(class_9334.field_49651);
         return var2 == null ? -1 : var2.method_8064() & 16777215;
      }
   }

   private boolean UuUVuuUu(class_1686 var1, class_238 var2) {
      return this.UuUVuuUu(var1.method_19538(), var1.method_18798(), var1, var2);
   }

   private boolean UuUVuuUu(class_243 var1, class_243 var2, class_1297 var3, class_238 var4) {
      for (int var5 = 0;
         var5 < 70
            && var2.method_1027() >= 1.0E-6
            && var1.field_1351 >= uUnuvNvvNU.field_1687.method_31607()
            && var1.field_1351 <= uUnuvNvvNU.field_1687.method_31607() + uUnuvNvvNU.field_1687.method_31605();
         var5++
      ) {
         double var6 = uUnuvNvvNU.field_1687.method_8316(class_2338.method_49638(var1)).method_15767(class_3486.field_15517) ? 0.8 : 0.99;
         var2 = new class_243(var2.field_1352 * var6, (var2.field_1351 - 0.05) * var6, var2.field_1350 * var6);
         class_243 var8 = var1.method_1019(var2);
         class_3965 var9 = uUnuvNvvNU.field_1687.method_17742(new class_3959(var1, var8, class_3960.field_17558, class_242.field_1348, var3));
         if (var9.method_17783() == class_240.field_1332) {
            return this.UuUVuuUu(var4, var1, var9.method_17784());
         }

         if (this.UuUVuuUu(var4, var1, var8)) {
            return true;
         }

         var1 = var8;
      }

      return false;
   }

   private void UuuNnUvUuv() {
      if (this.nuunNvv > 0) {
         this.nuunNvv--;
      }

      class_238 var1 = uUnuvNvvNU.field_1724.method_5829().method_1014(32.0);
      class_238 var2 = uUnuvNvvNU.field_1724.method_5829().method_1014(0.25);

      for (class_1665 var4 : uUnuvNvvNU.field_1687.method_8390(class_1665.class, var1, this::UuUVuuUu)) {
         if (var4.method_24921() != uUnuvNvvNU.field_1724
            && !(var4.method_18798().method_1027() < 1.0E-4)
            && this.UuUVuuUu(var4.method_19538(), var4.method_18798(), var4, var2)) {
            this.uUVVvVVNvvn = this.UuUVuuUu(var4.method_18798());
            this.nuunNvv = 8;
            return;
         }
      }
   }

   private boolean UuUVuuUu(class_1665 var1) {
      return var1 instanceof class_1667 || var1 instanceof class_1685;
   }

   private class_243 UuUVuuUu(class_243 var1) {
      class_243 var2 = new class_243(-var1.field_1350, 0.0, var1.field_1352).method_1029();
      class_243 var3 = var2.method_22882();
      if (this.C00OOC00oO(var2)) {
         return var2;
      } else {
         return this.C00OOC00oO(var3) ? var3 : var2;
      }
   }

   private boolean C00OOC00oO(class_243 var1) {
      return !uUnuvNvvNU.field_1687
         .method_20812(uUnuvNvvNU.field_1724, uUnuvNvvNU.field_1724.method_5829().method_997(var1.method_1021(0.75)))
         .iterator()
         .hasNext();
   }

   private boolean UuUVuuUu(class_238 var1, class_243 var2, class_243 var3) {
      return new class_238(
            Math.min(var2.field_1352, var3.field_1352),
            Math.min(var2.field_1351, var3.field_1351),
            Math.min(var2.field_1350, var3.field_1350),
            Math.max(var2.field_1352, var3.field_1352),
            Math.max(var2.field_1351, var3.field_1351),
            Math.max(var2.field_1350, var3.field_1350)
         )
         .method_1014(0.12)
         .method_994(var1);
   }

   private boolean UuUVuuUu(int var1) {
      int var2 = 0xFF000000 | var1;
      return var2 == -13447886 || var2 == -16776961;
   }

   private boolean nUUVuvU() {
      if (uUnuvNvvNU.field_1724.method_7357().method_7904(class_1802.field_8551.method_7854())) {
         return false;
      } else {
         int var1 = UVuvVVvnVNu.UuUVuuUu(class_1802.field_8551);
         if (var1 == -1) {
            return false;
         } else {
            this.UUVNuUNUvUnV = uUnuvNvvNU.field_1724.method_31548().method_67532();
            this.vuvnUnVnUNnV = var1 >= 36 && var1 <= 44 ? -1 : var1;
            this.NVUunUNUN = 1;
            return true;
         }
      }
   }

   private void UnUNVVVNuv() {
      if (this.NVUunUNUN != 0) {
         if (this.NVUunUNUN == 1) {
            if (this.vuvnUnVnUNnV >= 0) {
               uUnuvNvvNU.field_1761
                  .method_2906(uUnuvNvvNU.field_1724.field_7498.field_7763, this.vuvnUnVnUNnV, this.UUVNuUNUvUnV, class_1713.field_7791, uUnuvNvvNU.field_1724);
            } else {
               int var1 = UVuvVVvnVNu.C00OOC00oO(class_1802.field_8551);
               if (var1 == -1) {
                  this.UvnvNVnnnnNU();
                  return;
               }

               uUnuvNvvNU.field_1724.method_31548().method_61496(var1);
            }

            this.NVUunUNUN = 2;
         } else if (this.NVUunUNUN == 2) {
            uUnuvNvvNU.field_1761.method_2919(uUnuvNvvNU.field_1724, class_1268.field_5808);
            uUnuvNvvNU.field_1724.method_6104(class_1268.field_5808);
            this.NVUunUNUN = 3;
         } else {
            if (this.vuvnUnVnUNnV >= 0) {
               uUnuvNvvNU.field_1761
                  .method_2906(uUnuvNvvNU.field_1724.field_7498.field_7763, this.vuvnUnVnUNnV, this.UUVNuUNUvUnV, class_1713.field_7791, uUnuvNvvNU.field_1724);
            }

            uUnuvNvvNU.field_1724.method_31548().method_61496(this.UUVNuUNUvUnV);
            this.UvnvNVnnnnNU();
         }
      }
   }

   private void vNVuvnUUnuUn() {
      Iterator var1 = this.NVNnnvnuunNv.keySet().iterator();

      while (var1.hasNext()) {
         if (uUnuvNvvNU.field_1687.method_8469((Integer)var1.next()) == null) {
            var1.remove();
         }
      }
   }

   private void uUnuvNvvNU(class_243 var1) {
      class_243 var2 = var1.method_1020(uUnuvNvvNU.field_1724.method_33571());
      float var3 = (float)Math.toDegrees(Math.atan2(-var2.field_1352, var2.field_1350));
      float var4 = (float)(-Math.toDegrees(Math.atan2(var2.field_1351, Math.hypot(var2.field_1352, var2.field_1350))));
      COC0OCc.UuUVuuUu(new uuUuvNuNVNVU(var3, var4), 180.0F, 180.0F, 180.0F, 180.0F, 1, 1, false);
   }

   private void UvnvNVnnnnNU() {
      this.NVUunUNUN = 0;
      this.UUVNuUNUvUnV = -1;
      this.vuvnUnVnUNnV = -1;
      this.nuunNvv = 0;
      this.uUVVvVVNvvn = class_243.field_1353;
   }

   private void uVUVnuvnuVuv() {
      this.NVNnnvnuunNv.clear();
      this.NuunnvnN = 0;
      this.UvnvNVnnnnNU();
   }

   @Override
   public void C00OOC00oO() {
      this.uVUVnuvnuVuv();
      super.C00OOC00oO();
   }

   record NVnVnNnN(int color) {
   }
}
