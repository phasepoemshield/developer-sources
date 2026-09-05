package ru.metaculture.protection;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import net.minecraft.class_1268;
import net.minecraft.class_1297;
import net.minecraft.class_1657;
import net.minecraft.class_1684;
import net.minecraft.class_1713;
import net.minecraft.class_1802;
import net.minecraft.class_238;
import net.minecraft.class_243;
import net.minecraft.class_2815;
import net.minecraft.class_3532;
import net.minecraft.class_3959;
import net.minecraft.class_3965;
import net.minecraft.class_239.class_240;
import net.minecraft.class_3959.class_242;
import net.minecraft.class_3959.class_3960;
import org.wild.module.api.Module;
import org.wild.module.api.ModuleRegister;

@uNUunUnnnVu(
   uUnuvNvvNU = {"lichoday"}
)
@ModuleRegister(
   UuUVuuUu = "TargetPearl",
   C00OOC00oO = "Кидает эндер-перл вслед за перлом ближайшего игрока",
   uUnuvNvvNU = oOOOo0.Combat
)
public class TargetPearl extends Module {
   private static final double NVNnnvnuunNv = 0.03;
   private static final double uVunuUNVVUUV = 0.99;
   private static final double UNnVVNvvnVvU = 0.8;
   private static final double uNnUnnuNUnNu = 1.5;
   private static final int NnUuNNU = 240;
   private static final int nNvNUVU = 160;
   private static final String UnUNuUU = "TargetPearl";
   private final nNUuNvVn uUVuVvuNUvnu = new nNUuNvVn("Радиус реакции", 48.0F, 8.0F, 128.0F, 1.0F, false);
   private final vvNnnUNnVvn UvUvUNuvNU = new vvNnnUNnVvn("Использовать ротацию", true);
   private final nNUuNvVn c0oOOCcCoC0 = new nNUuNvVn("Скорость поворота", 40.0F, 5.0F, 180.0F, 1.0F, false).UuUVuuUu(() -> !this.UvUvUNuvNU.uUnuvNvvNU());
   private final nNUuNvVn VVnVNnunVvu = new nNUuNvVn("Точность прицела", 2.5F, 0.5F, 10.0F, 0.1F, false).UuUVuuUu(() -> !this.UvUvUNuvNU.uUnuvNvvNU());
   private final nNUuNvVn unNNVVNnvvV = new nNUuNvVn("Макс. промах (блоки)", 2.5F, 0.5F, 8.0F, 0.1F, false);
   private final nNUuNvVn NuunnvnN = new nNUuNvVn("Задержка броска (мс)", 600.0F, 0.0F, 3000.0F, 50.0F, false);
   private final vvNnnUNnVvn NVUunUNUN = new vvNnnUNnVvn("Только из хотбара", false);
   private final vvNnnUNnVvn UUVNuUNUvUnV = new vvNnnUNnVvn("Только из инвентаря", false);
   private final vvNnnUNnVvn vuvnUnVnUNnV = new vvNnnUNnVvn("Игнорировать друзей", true);
   private final vvNnnUNnVvn nnuUVNUuvvVU = new vvNnnUNnVvn("Требовать владельца", false);
   private static final double nVVUuvuNnUN = 3.0;
   private final Set<Integer> nNnVnUNVV = new HashSet<>();
   private final Set<Integer> nuunNvv = new HashSet<>();
   private final Map<Integer, class_243> uUVVvVVNvvn = new HashMap<>();
   private final Map<Integer, class_243> vvUVNVvvNUv = new HashMap<>();
   private long UuNnnVnuNNV;
   private int uUVvnUuNvvN = -1;
   private int UUuUnNVNuuv;
   private int NVuNUuVnVUN;
   private int NVuunNnvvvVu = -1;
   private int vNnNuuvVn = -1;
   private float VUuuVUnun;
   private float vVVuuVVv;
   private float VuunNUUUvu;
   private float NNUUNUuVNNVn;

   public TargetPearl() {
      this.UuUVuuUu(
         new nvUuvVvuuN[]{
            this.uUVuVvuNUvnu,
            this.UvUvUNuvNU,
            this.c0oOOCcCoC0,
            this.VVnVNnunVvu,
            this.unNNVVNnvvV,
            this.NuunnvnN,
            this.NVUunUNUN,
            this.UUVNuUNUvUnV,
            this.vuvnUnVnUNnV,
            this.nnuUVNUuvvVU
         }
      );
   }

   @vuVvUNNvVNV
   public void UuUVuuUu(nVunNNvuv var1) {
      if (uUnuvNvvNU.field_1724 != null && uUnuvNvvNU.field_1687 != null && uUnuvNvvNU.field_1761 != null) {
         this.UvnvNVnnnnNU();
         if (this.UUuUnNVNuuv > 0) {
            this.nUUVuvU();
         } else {
            this.uVunuUNVVUUV();
            class_1684 var2 = this.uVUVnuvnuVuv();
            if (var2 != null) {
               class_243 var3 = this.UuUVuuUu(var2, this.UuUVuuUu(var2));
               if (var3 != null) {
                  class_243 var4 = uUnuvNvvNU.field_1724.method_33571().method_1023(0.0, 0.1, 0.0);
                  TargetPearl.NVnVnNnN var5 = this.UuUVuuUu(var4, var3);
                  if (var5 != null && !(var5.uUnuvNvvNU > this.unNNVVNnvvV.uUnuvNvvNU())) {
                     if (this.UvUvUNuvNU.uUnuvNvvNU()) {
                        float var6 = this.c0oOOCcCoC0.uUnuvNvvNU();
                        COC0OCc.UuUVuuUu(new uuUuvNuNVNVU(var5.UuUVuuUu, var5.C00OOC00oO), var6, var6, 6, 5);
                     }

                     if (!this.nNnVnUNVV.contains(var2.method_5628())) {
                        if (System.currentTimeMillis() - this.UuNnnVnuNNV >= (long)this.NuunnvnN.uUnuvNvvNU()) {
                           if (this.UvUvUNuvNU.uUnuvNvvNU()) {
                              float var7 = new uuUuvNuNVNVU(uUnuvNvvNU.field_1724).UuUVuuUu(new uuUuvNuNVNVU(var5.UuUVuuUu, var5.C00OOC00oO));
                              if (var7 > this.VVnVNnunVvu.uUnuvNvvNU()) {
                                 return;
                              }
                           }

                           int var8 = this.NVNnnvnuunNv();
                           if (var8 != -1) {
                              this.UuUVuuUu(var8, var5, var2.method_5628());
                              this.nNnVnUNVV.add(var2.method_5628());
                           }
                        }
                     }
                  }
               }
            }
         }
      }
   }

   private void UuUVuuUu(int var1, TargetPearl.NVnVnNnN var2, int var3) {
      this.NVuunNnvvvVu = var1;
      this.uUVvnUuNvvN = var3;
      this.VUuuVUnun = var2.UuUVuuUu;
      this.vVVuuVVv = var2.C00OOC00oO;
      this.vNnNuuvVn = -1;
      this.NVuNUuVnVUN = 0;
      this.UUuUnNVNuuv = 1;
      this.nUUVuvU();
   }

   private void UuuNnUvUuv() {
      if (this.uUVvnUuNvvN != -1 && uUnuvNvvNU.field_1687 != null) {
         if (uUnuvNvvNU.field_1687.method_8469(this.uUVvnUuNvvN) instanceof class_1684 var1) {
            class_243 var5 = this.UuUVuuUu(var1, this.UuUVuuUu(var1));
            if (var5 != null) {
               class_243 var3 = uUnuvNvvNU.field_1724.method_33571().method_1023(0.0, 0.1, 0.0);
               TargetPearl.NVnVnNnN var4 = this.UuUVuuUu(var3, var5);
               if (var4 != null && var4.uUnuvNvvNU <= this.unNNVVNnvvV.uUnuvNvvNU()) {
                  this.VUuuVUnun = var4.UuUVuuUu;
                  this.vVVuuVVv = var4.C00OOC00oO;
               }
            }
         }
      }
   }

   private void nUUVuvU() {
      boolean var1 = this.UuUVuuUu(this.NVuunNnvvvVu);
      if (!var1) {
         NnUuNNU = 2;
         uUnuvNvvNU.field_1690.field_1867.method_23481(false);
         uUnuvNvvNU.field_1724.method_5728(false);
         NVnVnU.UuUVuuUu().UuUVuuUu("TargetPearl");
      }

      if (this.NVuNUuVnVUN > 0) {
         this.NVuNUuVnVUN--;
      } else if (var1) {
         int var2 = this.C00OOC00oO(this.NVuunNnvvvVu);
         switch (this.UUuUnNVNuuv) {
            case 1:
               this.vNnNuuvVn = uUnuvNvvNU.field_1724.method_31548().method_67532();
               if (this.vNnNuuvVn != var2) {
                  uUnuvNvvNU.field_1724.method_31548().method_61496(var2);
               }

               this.UnUNVVVNuv();
               this.UUuUnNVNuuv = 2;
               this.NVuNUuVnVUN = 1;
               break;
            case 2:
               if (this.vNnNuuvVn != var2) {
                  uUnuvNvvNU.field_1724.method_31548().method_61496(this.vNnNuuvVn);
               }

               this.vNVuvnUUnuUn();
         }
      } else {
         switch (this.UUuUnNVNuuv) {
            case 1:
               this.UUuUnNVNuuv = 2;
               this.NVuNUuVnVUN = 3;
               break;
            case 2:
               this.vNnNuuvVn = uUnuvNvvNU.field_1724.method_31548().method_67532();
               if (!uUnuvNvvNU.field_1724.method_5624()) {
                  uUnuvNvvNU.field_1761
                     .method_2906(uUnuvNvvNU.field_1724.field_7498.field_7763, this.NVuunNnvvvVu, this.vNnNuuvVn, class_1713.field_7791, uUnuvNvvNU.field_1724);
               }

               this.UUuUnNVNuuv = 3;
               this.NVuNUuVnVUN = 1;
               break;
            case 3:
               this.UnUNVVVNuv();
               this.UUuUnNVNuuv = 4;
               this.NVuNUuVnVUN = 1;
               break;
            case 4:
               if (!uUnuvNvvNU.field_1724.method_5624()) {
                  uUnuvNvvNU.field_1761
                     .method_2906(uUnuvNvvNU.field_1724.field_7498.field_7763, this.NVuunNnvvvVu, this.vNnNuuvVn, class_1713.field_7791, uUnuvNvvNU.field_1724);
               }

               if (uUnuvNvvNU.method_1562() != null) {
                  uUnuvNvvNU.method_1562().method_52787(new class_2815(uUnuvNvvNU.field_1724.field_7498.field_7763));
               }

               this.UUuUnNVNuuv = 5;
               this.NVuNUuVnVUN = 1;
               break;
            case 5:
               NVnVnU.UuUVuuUu().C00OOC00oO("TargetPearl");
               this.vNVuvnUUnuUn();
         }
      }
   }

   private void UnUNVVVNuv() {
      this.UuuNnUvUuv();
      this.VuunNUUUvu = uUnuvNvvNU.field_1724.method_36454();
      this.NNUUNUuVNNVn = uUnuvNvvNU.field_1724.method_36455();
      uUnuvNvvNU.field_1724.method_36456(this.VUuuVUnun);
      uUnuvNvvNU.field_1724.field_6241 = this.VUuuVUnun;
      uUnuvNvvNU.field_1724.method_36457(this.vVVuuVVv);
      uUnuvNvvNU.field_1761.method_2919(uUnuvNvvNU.field_1724, class_1268.field_5808);
      uUnuvNvvNU.field_1724.method_6104(class_1268.field_5808);
      uUnuvNvvNU.field_1724.method_36456(this.VuunNUUUvu);
      uUnuvNvvNU.field_1724.field_6241 = this.VuunNUUUvu;
      uUnuvNvvNU.field_1724.method_36457(this.NNUUNUuVNNVn);
   }

   private void vNVuvnUUnuUn() {
      this.UuNnnVnuNNV = System.currentTimeMillis();
      this.UUuUnNVNuuv = 0;
      this.NVuNUuVnVUN = 0;
      this.NVuunNnvvvVu = -1;
      this.uUVvnUuNvvN = -1;
      this.vNnNuuvVn = -1;
   }

   private void UvnvNVnnnnNU() {
      this.vvUVNVvvNUv.clear();
      HashSet var1 = new HashSet();

      for (class_1297 var3 : uUnuvNvvNU.field_1687.method_18112()) {
         if (var3 instanceof class_1684 var4) {
            int var5 = var4.method_5628();
            var1.add(var5);
            class_243 var6 = var4.method_19538();
            class_243 var7 = this.uUVVvVVNvvn.get(var5);
            if (var7 == null && uUnuvNvvNU.field_1724.method_33571().method_1025(var6) < 9.0) {
               this.nuunNvv.add(var5);
            }

            this.vvUVNVvvNUv.put(var5, var7 != null ? var6.method_1020(var7) : var4.method_18798());
            this.uUVVvVVNvvn.put(var5, var6);
         }
      }

      this.uUVVvVVNvvn.keySet().retainAll(var1);
      this.nuunNvv.retainAll(var1);
   }

   private class_243 UuUVuuUu(class_1684 var1) {
      class_243 var2 = var1.method_18798();
      if (var2.method_1027() > 0.001) {
         return var2;
      } else {
         class_243 var3 = this.vvUVNVvvNUv.get(var1.method_5628());
         return var3 != null ? var3 : var2;
      }
   }

   private class_1684 uVUVnuvnuVuv() {
      class_1684 var1 = null;
      double var2 = Double.MAX_VALUE;
      double var4 = this.uUVuVvuNUvnu.uUnuvNvvNU() * this.uUVuVvuNUvnu.uUnuvNvvNU();

      for (class_1297 var7 : uUnuvNvvNU.field_1687.method_18112()) {
         if (var7 instanceof class_1684 var8 && !(this.UuUVuuUu(var8).method_1027() < 0.001) && !this.nuunNvv.contains(var8.method_5628())) {
            class_1657 var10 = var8.method_24921() instanceof class_1657 var11 ? var11 : null;
            if (var10 != uUnuvNvvNU.field_1724
               && (var10 == null ? !this.nnuUVNUuvvVU.uUnuvNvvNU() : !this.vuvnUnVnUNnV.uUnuvNvvNU() || !uNvUVUNvuUVV.UuUVuuUu(var10.method_5477().getString()))
               )
             {
               double var13 = uUnuvNvvNU.field_1724.method_5858(var8);
               if (!(var13 > var4) && var13 < var2) {
                  var2 = var13;
                  var1 = var8;
               }
            }
         }
      }

      return var1;
   }

   private class_243 UuUVuuUu(class_1684 var1, class_243 var2) {
      double var3 = var1.method_56989();
      if (var3 <= 0.0) {
         var3 = 0.03;
      }

      double var5 = var1.method_5799() ? 0.8 : 0.99;
      return this.UuUVuuUu(var1.method_19538(), var2, var3, var5, var1, 240);
   }

   private TargetPearl.NVnVnNnN UuUVuuUu(class_243 var1, class_243 var2) {
      double var3 = var2.field_1352 - var1.field_1352;
      double var5 = var2.field_1350 - var1.field_1350;
      float var7 = (float)Math.toDegrees(Math.atan2(-var3, var5));
      TargetPearl.NVnVnNnN var8 = null;

      for (float var9 = -10.0F; var9 <= 10.0F; var9 += 2.0F) {
         float var10 = var7 + var9;

         for (float var11 = -90.0F; var11 <= 90.0F; var11++) {
            TargetPearl.NVnVnNnN var12 = this.UuUVuuUu(var1, var2, var10, var11);
            if (var12 != null && (var8 == null || var12.uUnuvNvvNU < var8.uUnuvNvvNU)) {
               var8 = var12;
            }
         }
      }

      if (var8 == null) {
         return null;
      } else {
         TargetPearl.NVnVnNnN var13 = var8;

         for (float var14 = var8.UuUVuuUu - 2.0F; var14 <= var8.UuUVuuUu + 2.0F; var14 += 0.5F) {
            for (float var15 = var8.C00OOC00oO - 2.0F; var15 <= var8.C00OOC00oO + 2.0F; var15 += 0.3F) {
               TargetPearl.NVnVnNnN var16 = this.UuUVuuUu(var1, var2, var14, var15);
               if (var16 != null && var16.uUnuvNvvNU < var13.uUnuvNvvNU) {
                  var13 = var16;
               }
            }
         }

         return var13;
      }
   }

   private TargetPearl.NVnVnNnN UuUVuuUu(class_243 var1, class_243 var2, float var3, float var4) {
      class_243 var5 = this.UuUVuuUu(var3, var4);
      class_243 var6 = this.UuUVuuUu(var1, var5, 0.03, 0.99, uUnuvNvvNU.field_1724, 160);
      if (var6 == null) {
         return null;
      } else {
         double var7 = Math.sqrt(var6.method_1025(var2));
         return new TargetPearl.NVnVnNnN(class_3532.method_15393(var3), class_3532.method_15363(var4, -90.0F, 90.0F), var7);
      }
   }

   private class_243 UuUVuuUu(float var1, float var2) {
      float var3 = var1 * (float) (Math.PI / 180.0);
      float var4 = var2 * (float) (Math.PI / 180.0);
      double var5 = -class_3532.method_15374(var3) * class_3532.method_15362(var4);
      double var7 = -class_3532.method_15374(var4);
      double var9 = class_3532.method_15362(var3) * class_3532.method_15362(var4);
      class_243 var11 = new class_243(var5, var7, var9).method_1029().method_1021(1.5);
      class_243 var12 = uUnuvNvvNU.field_1724.method_60478();
      return var11.method_1031(var12.field_1352, uUnuvNvvNU.field_1724.method_24828() ? 0.0 : var12.field_1351, var12.field_1350);
   }

   private class_243 UuUVuuUu(class_243 var1, class_243 var2, double var3, double var5, class_1297 var7, int var8) {
      if (uUnuvNvvNU.field_1687 == null) {
         return null;
      } else {
         class_243 var9 = var1;
         class_243 var10 = var2;

         for (int var11 = 0; var11 < var8; var11++) {
            var10 = var10.method_1023(0.0, var3, 0.0).method_1021(var5);
            class_243 var12 = var9.method_1019(var10);
            class_3965 var13 = uUnuvNvvNU.field_1687.method_17742(new class_3959(var9, var12, class_3960.field_17558, class_242.field_1348, var7));
            if (var13.method_17783() != class_240.field_1333) {
               return var13.method_17784();
            }

            class_238 var14 = new class_238(var9, var12).method_1014(1.0);
            double var15 = Double.MAX_VALUE;
            class_243 var17 = null;

            for (class_1297 var19 : uUnuvNvvNU.field_1687
               .method_8333(var7, var14, var0 -> var0.method_5805() && !var0.method_7325() && var0 instanceof class_1657)) {
               class_238 var20 = var19.method_5829().method_1014(0.3);
               Optional var21 = var20.method_992(var9, var12);
               if (var21.isPresent()) {
                  double var22 = var9.method_1025((class_243)var21.get());
                  if (var22 < var15) {
                     var15 = var22;
                     var17 = (class_243)var21.get();
                  }
               }
            }

            if (var17 != null) {
               return var17;
            }

            var9 = var12;
         }

         return var9;
      }
   }

   private int NVNnnvnuunNv() {
      for (int var1 = 0; var1 < 36; var1++) {
         if (uUnuvNvvNU.field_1724.method_31548().method_5438(var1).method_7909() == class_1802.field_8634) {
            boolean var2 = var1 < 9;
            if ((!this.UUVNuUNUvUnV.uUnuvNvvNU() || !var2) && (!this.NVUunUNUN.uUnuvNvvNU() || var2)) {
               return var2 ? var1 + 36 : var1;
            }
         }
      }

      return -1;
   }

   private boolean UuUVuuUu(int var1) {
      return var1 >= 0 && var1 <= 8 || var1 >= 36 && var1 <= 44;
   }

   private int C00OOC00oO(int var1) {
      if (var1 >= 0 && var1 <= 8) {
         return var1;
      } else {
         return var1 >= 36 && var1 <= 44 ? var1 - 36 : -1;
      }
   }

   private void uVunuUNVVUUV() {
      if (!this.nNnVnUNVV.isEmpty()) {
         this.nNnVnUNVV.removeIf(var0 -> uUnuvNvvNU.field_1687.method_8469(var0) == null);
      }
   }

   @Override
   public void C00OOC00oO() {
      if (this.UUuUnNVNuuv > 0 && !this.UuUVuuUu(this.NVuunNnvvvVu)) {
         NVnVnU.UuUVuuUu().C00OOC00oO("TargetPearl");
      }

      this.nNnVnUNVV.clear();
      this.nuunNvv.clear();
      this.uUVVvVVNvvn.clear();
      this.vvUVNVvvNUv.clear();
      this.UUuUnNVNuuv = 0;
      this.NVuNUuVnVUN = 0;
      this.NVuunNnvvvVu = -1;
      this.uUVvnUuNvvN = -1;
      NNvvnnunn.UuUVuuUu = NNvvnnunn.C00OOC00oO;
      super.C00OOC00oO();
   }

   static final class NVnVnNnN {
      final float UuUVuuUu;
      final float C00OOC00oO;
      final double uUnuvNvvNU;

      NVnVnNnN(float var1, float var2, double var3) {
         this.UuUVuuUu = var1;
         this.C00OOC00oO = var2;
         this.uUnuvNvvNU = var3;
      }
   }
}
