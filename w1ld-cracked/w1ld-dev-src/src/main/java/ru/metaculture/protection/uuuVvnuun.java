package ru.metaculture.protection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import net.minecraft.class_408;
import org.wild.module.api.Module;

@vuUuvvvNnVV(
   UuUVuuUu = "KeyBindHUD",
   C00OOC00oO = "q"
)
public final class uuuVvnuun extends nnvNuuNvvuu {
   private static final uuuVvnuun UuUVuuUu = new uuuVvnuun();
   private static final List<uuuVvnuun.NVnVnNnN> c0oOOCcCoC0 = new ArrayList<>(64);
   private static final Map<Module, uuuVvnuun.NVnVnNnN> VVnVNnunVvu = new IdentityHashMap<>(128);
   private static final Map<vvNnnUNnVvn, uuuVvnuun.NVnVnNnN> unNNVVNnvvV = new IdentityHashMap<>(64);
   private static final VVnnnnN NuunnvnN = new VVnnnnN();
   private static final VVnnnnN NVUunUNUN = new VVnnnnN();
   private static final VVnnnnN UUVNuUNUvUnV = new VVnnnnN();
   private static final Map<String, VVnnnnN> vuvnUnVnUNnV = new HashMap<>();
   private static final Map<vvNnnUNnVvn, VVnnnnN> nnuUVNUuvvVU = new IdentityHashMap<>(64);
   private static final List<Module> nVVUuvuNnUN = new ArrayList<>(64);
   private static final List<vvNnnUNnVvn> nNnVnUNVV = new ArrayList<>(8);
   private static final float nuunNvv = 12.0F;
   private static final float uUVVvVVNvvn = 0.94F;
   private static final float vvUVNVvvNUv = 0.78F;
   private static final float UuNnnVnuNNV = 3.4F;
   private static final float uUVvnUuNvvN = 3.5F;
   private static final float UUuUnNVNuuv = 1.1F;
   private final vvNnnUNnVvn NVuNUuVnVUN = new vvNnnUNnVvn("Отображать иконки", true);

   private uuuVvnuun() {
      this.UuUVuuUu((nvUuvVvuuN)this.NVuNUuVnVUN);
      uNvNvUNUnuu.UuUVuuUu(this);
   }

   public static void UuUVuuUu(UnVNvNnU var0) {
      UuUVuuUu.C00OOC00oO(var0);
   }

   public static uuuVvnuun C00OOC00oO() {
      return UuUVuuUu;
   }

   public void C00OOC00oO(UnVNvNnU var1) {
      if (O000c0oocoo.a_.field_1724 != null
         && ru.metaculture.protection.NVnVnNnN.UuUVuuUu != null
         && ru.metaculture.protection.NVnVnNnN.UuUVuuUu.C00OOC00oO != null) {
         boolean var2 = this.NVuNUuVnVUN.uUnuvNvvNU();
         boolean var3 = Hud.nUUVuvU();
         unUuuVVuNnNN.NVnVnNnN var4 = var3 ? unUuuVVuNnNN.UuUVuuUu() : null;
         float var5 = 22.0F;
         float var6 = var3 ? var4.vNUvnnVnUvu : 7.0F;
         float var7 = var3 ? var4.vuuuNvNuv : 32.0F;
         float var8 = var3 ? var4.nvUVNnuu : 22.0F;
         float var9 = var3 ? var4.uVUuuVnNVU : 5.0F;
         float var10 = var3 ? var4.UuuNnUvUuv : 28.0F;
         float var11 = var3 ? var4.nUUVuvU : var5;
         float var12 = var3 ? var4.vNVuvnUUnuUn : 1.9F;
         c0oOOCcCoC0.clear();
         nVVUuvuNnUN.clear();

         for (Module var14 : ru.metaculture.protection.NVnVnNnN.UuUVuuUu.C00OOC00oO.C00OOC00oO()) {
            if (!"Menu".equals(var14.vVvUvVVuuNvV) && var14.uNNnnnuuuN != -1) {
               VVnnnnN var15 = vuvnUnVnUNnV.computeIfAbsent(var14.vVvUvVVuuNvV, var0 -> new VVnnnnN());
               var15.UuUVuuUu();
               var15.UuUVuuUu(var14.nuUnNvnuUu ? 1.0 : 0.0, 0.2F, VvVUUNUu.UnUNVVVNuv, false);
               if (var15.uNNnnnuuuN() > 0.001F || var14.nuUnNvnuUu) {
                  uuuVvnuun.NVnVnNnN var16 = VVnVNnunVvu.computeIfAbsent(var14, uuuVvnuun.NVnVnNnN::new);
                  var16.UuUVuuUu(var14, var15, var2, var5);
                  nVVUuvuNnUN.add(var14);
               }
            }
         }

         nVVUuvuNnUN.sort((var0, var1x) -> Float.compare(VVnVNnunVvu.get(var1x).vNUvnnVnUvu, VVnVNnunVvu.get(var0).vNUvnnVnUvu));

         for (Module var103 : nVVUuvuNnUN) {
            c0oOOCcCoC0.add(VVnVNnunVvu.get(var103));

            for (vvNnnUNnVvn var107 : UuUVuuUu(var103)) {
               VVnnnnN var17 = nnuUVNUuvvVU.computeIfAbsent(var107, var0 -> new VVnnnnN());
               var17.UuUVuuUu();
               var17.UuUVuuUu(var103.nuUnNvnuUu ? 1.0 : 0.0, 0.2F, VvVUUNUu.UnUNVVVNuv, false);
               if (var17.uNNnnnuuuN() > 0.001F || var103.nuUnNvnuUu) {
                  uuuVvnuun.NVnVnNnN var18 = unNNVVNnvvV.computeIfAbsent(var107, var1x -> new uuuVvnuun.NVnVnNnN(var103, var1x));
                  var18.UuUVuuUu(var107, var17, var5);
                  c0oOOCcCoC0.add(var18);
               }
            }
         }

         boolean var102 = !c0oOOCcCoC0.isEmpty() || O000c0oocoo.a_.field_1755 instanceof class_408;
         NuunnvnN.UuUVuuUu();
         NuunnvnN.UuUVuuUu(var102 ? 1.0 : 0.0, 0.22F, VvVUUNUu.UnUNVVVNuv, false);
         float var104 = NuunnvnN.uNNnnnuuuN();
         if (!(var104 <= 0.01F)) {
            float var106 = O000c0oocoo.a_.method_22683().method_4489();
            String var108 = "Binds";
            float var109 = vVVUUuunVVV.C00OOC00oO(vNvnnVvvVUu.vVvUvVVuuNvV, var108, var10);
            float var110 = 0.0F;
            float var19 = 0.0F;
            float var20 = 0.0F;

            for (uuuVvnuun.NVnVnNnN var22 : c0oOOCcCoC0) {
               var110 = Math.max(var110, var22.vNUvnnVnUvu);
               var19 = Math.max(var19, var22.uVUuuVnNVU);
               var20 += (var22.UuUVuuUu() ? var8 * 0.78F : var8) * var22.vVvUvVVuuNvV.uNNnnnuuuN();
            }

            float var111 = var110 + 24.0F;
            float var113 = var19 + 20.0F + (var3 ? var4.UnUNVVVNuv : 0.0F);
            float var23 = var111 + var9 + var113;
            float var24 = var23 + var6 * 2.0F;
            float var25 = var109 + var11 + 34.0F;
            var24 = Math.max(var24, var25 + var6 * 2.0F);
            var23 = var24 - var6 * 2.0F;
            var111 = var23 - var9 - var113;
            boolean var26 = var20 > 0.01F;
            float var27 = var6 + var7 + (var26 ? var9 : 0.0F) + var20 + var6;
            NVUunUNUN.UuUVuuUu();
            UUVNuUNUvUnV.UuUVuuUu();
            NVUunUNUN.UuUVuuUu(var24, 0.18F, VvVUUNUu.UnUNVVVNuv, false);
            UUVNuUNUvUnV.UuUVuuUu(var27, 0.18F, VvVUUNUu.UnUNVVVNuv, false);
            float var28 = NVUunUNUN.uNNnnnuuuN();
            float var29 = UUVNuUNUvUnV.uNNnnnuuuN();
            float var30 = Math.max(10.0F, var106 - var28 - 10.0F);
            float var31 = 10.0F;
            nNuUNVu.nvnNNunvv var32 = nNuUNVu.UuUVuuUu().UuUVuuUu("HUD_HotKeys", var30, var31, var28, var29);
            float var33 = var32.C00OOC00oO;
            float var34 = var32.uUnuvNvvNU;
            float var35 = var32.vVvUvVVuuNvV;
            float var36 = var32.uNNnnnuuuN;
            this.UuUVuuUu(var33, var34, var35, var36);
            float var37 = var35 / Math.max(1.0F, var28);
            float var38 = var36 / Math.max(1.0F, var29);
            float var39 = Math.min(var37, var38);
            float var40 = var6 * var37;
            float var41 = var6 * var38;
            float var42 = var7 * var38;
            float var43 = var8 * var38;
            float var44 = var5 * var39;
            float var45 = var111 * var37;
            float var46 = var113 * var37;
            float var47 = var9 * var37;
            float var48 = var104 * this.uVunuUNVVUUV.uUnuvNvvNU();
            int var49 = this.C00OOC00oO(var48);
            int var50 = this.uUnuvNvvNU(var48);
            int var51 = this.uNNnnnuuuN(var48);
            int var52 = this.vNUvnnVnUvu(var48);
            float var53 = var3 ? var4.UuUVuuUu : 14.0F;
            float var54 = var3 ? var4.C00OOC00oO : 11.0F;
            float var55 = var3 ? var4.uUnuvNvvNU : 7.0F;
            float var56 = var3 ? var4.vVvUvVVuuNvV : var55;
            float var57 = var3 ? var4.uNNnnnuuuN : var55;
            float var58 = var35 - var40 * 2.0F;
            this.UuUVuuUu(var1, var33, var34, var35, var36, var53, var48);
            if (this.UuuNnUvUuv() || this.nUUVuvU()) {
               this.C00OOC00oO(var1, var33 + var40, var34 + var41, var58, var42, var54, var48);
            } else if (this.nvUVNnuu()) {
               if (!this.UuUVuuUu(var33 + var40, var34 + var41, var58, var42, var54, false, var48, 1)) {
                  var1.UuUVuuUu(var33 + var40, var34 + var41, var58, var42, var54, var49);
               }
            } else if (var3) {
               var1.UuUVuuUu(var33 + var40, var34 + var41, var58, var42, var54, var49);
            } else {
               var1.UuUVuuUu(var33 + var40, var34 + var41, var58, var42, 11.0F, 11.0F, 4.0F, 4.0F, var49);
            }

            float var59 = var3 ? var33 + var4.UvnvNVnnnnNU.UuUVuuUu * var37 : var33 + var40 + 10.0F * var37;
            float var60 = var3 ? var34 + var4.UvnvNVnnnnNU.C00OOC00oO * var38 : UuUVuuUu(var34 + var41, var42, 28.0F * var39);
            var1.UuUVuuUu(vNvnnVvvVUu.vVvUvVVuuNvV, var59, var60, var10 * var39, var108, var51);
            float var61 = Math.max(17.0F * var39, 20.0F * var38);
            float var62 = var33 + var40 + var58 - 10.0F * var37 - var61;
            float var63 = var34 + var41 + (var42 - var61) * 0.5F;
            float var64 = var11 * var39;
            float var65 = vVVUUuunVVV.C00OOC00oO(vNvnnVvvVUu.vNUvnnVnUvu, "q", var64);
            float var66 = var3
               ? (var4.uVUVnuvnuVuv.uUnuvNvvNU ? var33 + var35 : var33) + var4.uVUVnuvnuVuv.UuUVuuUu * var37
               : var62 + (var61 - var65) * 0.5F - 1.5F;
            float var67 = var3 ? var34 + var4.uVUVnuvnuVuv.C00OOC00oO * var38 + 1.5F * var38 : UuUVuuUu(var63, var61, var64) + 1.5F * var38;
            var1.UuUVuuUu(vNvnnVvvVUu.vNUvnnVnUvu, var66, var67, var64, "q", var52);
            float var68 = var34 + var41 + var42 + (var26 ? var9 * var38 : 0.0F);
            float var69 = var20 * var38;
            float var70 = var33 + var40 + (var3 ? var4.NVNnnvnuunNv.UuUVuuUu * var37 : 0.0F);
            float var71 = var68 + (var3 ? var4.NVNnnvnuunNv.C00OOC00oO * var38 : 0.0F);
            float var72 = var33 + var40 + var45 + var47 + (var3 ? var4.uVunuUNVVUUV.UuUVuuUu * var37 : 0.0F);
            float var73 = var68 + (var3 ? var4.uVunuUNVVUUV.C00OOC00oO * var38 : 0.0F);
            if (var69 > 0.01F && (this.vNUvnnVnUvu() || this.UuuNnUvUuv() || this.nUUVuvU())) {
               if (this.UuuNnUvUuv() || this.nUUVuvU()) {
                  this.C00OOC00oO(var1, var70, var71, var45, var69, var56, var48);
                  this.C00OOC00oO(var1, var72, var73, var46, var69, var57, var48);
               } else if (this.nvUVNnuu()) {
                  if (!this.UuUVuuUu(var70, var71, var45, var69, var56, true, var48, 2)) {
                     var1.UuUVuuUu(var70, var71, var45, var69, var56, var50);
                  }

                  if (!this.UuUVuuUu(var72, var73, var46, var69, var57, true, var48, 2)) {
                     var1.UuUVuuUu(var72, var73, var46, var69, var57, var50);
                  }
               } else if (var3) {
                  var1.UuUVuuUu(var70, var71, var45, var69, var56, var50);
                  var1.UuUVuuUu(var72, var73, var46, var69, var57, var50);
               } else {
                  var1.UuUVuuUu(var70, var71, var45, var69, 4.0F, 4.0F, 4.0F, 11.0F, var50);
                  var1.UuUVuuUu(var72, var73, var46, var69, 4.0F, 4.0F, 11.0F, 4.0F, var50);
               }
            }

            var1.UuUVuuUu(var33, var34, var35, var36, var53, var53, var53, var53);
            float var74 = var71;
            float var75 = var73;

            for (uuuVvnuun.NVnVnNnN var77 : c0oOOCcCoC0) {
               float var78 = var77.vVvUvVVuuNvV.uNNnnnuuuN();
               if (!(var78 <= 0.01F)) {
                  boolean var79 = var77.UuUVuuUu();
                  float var80 = var79 ? var77.uUnuvNvvNU.uNNnnnuuuN() : 1.0F;
                  float var81 = var79 ? 0.42F + 0.58F * var80 : 1.0F;
                  int var82 = (int)(255.0F * var48 * var78 * var81);
                  int var83 = VnVnuUn.UuUVuuUu(this.uNNnnnuuuN(1.0F), var82);
                  int var84 = VnVnuUn.UuUVuuUu(this.vNUvnnVnUvu(1.0F), var82);
                  int var85 = var79 ? VnVnuUn.vVvUvVVuuNvV(var83, var84, (double)var80) : var84;
                  float var86 = var79 ? var44 * 0.94F : var44;
                  float var87 = var79 ? var43 * 0.78F : var43;
                  float var88 = (1.0F - var78) * 8.0F * var37;
                  float var89 = var70 + 10.0F * var37 - var88 + (var79 ? 12.0F * var37 : 0.0F);
                  if (var79) {
                     float var90 = var70 + 10.0F * var37 - var88 + var12 * var37 * 0.2F;
                     float var91 = var74 + var87 * 0.5F;
                     float var92 = Math.max(2.0F * var37, var89 - var90);
                     float var93 = Math.min(3.4F * var37, var92 * 0.05F);
                     float var94 = Math.max(1.0F, 1.1F * var37);
                     float var95 = var90 + var93;
                     float var96 = var91 - var93;
                     var1.UuUVuuUu(var95, var96, var93, 90.0F, 0.25F, var94, var85);
                     float var97 = var89 - 3.5F * var37;
                     if (var97 > var95 + 0.5F) {
                        var1.UuUVuuUu(var95, var91 - var94 * 0.5F, var97 - var95, var94, var94 * 0.5F, var85);
                     }
                  } else {
                     if (var12 > 0.05F) {
                        var1.UuUVuuUu(var89, var74 + (var87 - 8.0F * var38) * 0.5F, var12 * var37, 8.0F * var38, Math.max(0.7F, var12 * 0.5F) * var37, var84);
                     }

                     var89 += 8.0F * var37;
                  }

                  float var116 = UuUVuuUu(var74, var87, var86);
                  if (!var79 && var2 && var77.VVuuUN != null) {
                     var1.UuUVuuUu(vNvnnVvvVUu.vNUvnnVnUvu, var89, var116, var86, var77.VVuuUN, var83);
                     var89 += var77.vuuuNvNuv * var39 + 6.0F * var37;
                  }

                  var1.UuUVuuUu(vNvnnVvvVUu.UuUVuuUu, var89, var116, var86, var77.uNNnnnuuuN, var83);
                  float var117 = vVVUUuunVVV.C00OOC00oO(vNvnnVvvVUu.UuUVuuUu, var77.nuUnNvnuUu, var86);
                  float var118 = var72 + (var46 - var117) * 0.5F + var88;
                  float var119 = var3 ? var75 + var87 * 0.5F + 4.0F * var38 : var116;
                  if (var79 && var80 > 0.02F) {
                     float var120 = 0.5F + 0.5F * (float)Math.sin(System.currentTimeMillis() / 540.0);
                     float var121 = var86 * 1.45F;
                     float var122 = var117 + 13.0F * var37;
                     float var123 = var118 + var117 * 0.5F;
                     if (var3) {
                        float var10000 = var75 + var87 * 0.5F;
                     } else {
                        float var124 = var74 + var87 * 0.5F;
                     }

                     int var99 = Math.max(0, Math.min(255, (int)(var48 * var78 * var80 * (32.0F + 30.0F * var120))));
                     int var100 = VnVnuUn.UuUVuuUu(this.vNUvnnVnUvu(1.0F), var99);
                  }

                  var1.UuUVuuUu(vNvnnVvvVUu.UuUVuuUu, var118, var119, var86, var77.nuUnNvnuUu, var79 ? var85 : var84);
                  var74 += var87 * var78;
                  var75 += var87 * var78;
               }
            }

            var1.nuUnNvnuUu();
            nNuUNVu.UuUVuuUu().UuUVuuUu(var32);
            UuUuVnVvnvn.UuUVuuUu(
               var1, this, var32, nNuUNVu.UuUVuuUu(), O000c0oocoo.a_.method_22683().method_4486(), O000c0oocoo.a_.method_22683().method_4502()
            );
         }
      }
   }

   private static float UuUVuuUu(float var0, float var1, float var2) {
      return var0 + var1 * 0.5F + var2 * 0.18F;
   }

   private static List<vvNnnUNnVvn> UuUVuuUu(Module var0) {
      nNnVnUNVV.clear();

      for (nvUuvVvuuN var2 : var0.nvUVNnuu()) {
         if (var2 instanceof vvNnnUNnVvn var3) {
            if (var3.nuUnNvnuUu != -1) {
               nNnVnUNVV.add(var3);
            }
         } else if (var2 instanceof VUVnvvnNN var4) {
            for (vvNnnUNnVvn var6 : var4.vVvUvVVuuNvV) {
               if (var6.nuUnNvnuUu != -1) {
                  nNnVnUNVV.add(var6);
               }
            }
         }
      }

      return nNnVnUNVV;
   }

   private static boolean UuUVuuUu(float var0, float var1, float var2, float var3, float var4, float var5) {
      return var0 >= var2 && var0 <= var2 + var4 && var1 >= var3 && var1 <= var3 + var5;
   }

   static final class NVnVnNnN {
      private final Module UuUVuuUu;
      private final vvNnnUNnVvn C00OOC00oO;
      final VVnnnnN uUnuvNvvNU = new VVnnnnN();
      VVnnnnN vVvUvVVuuNvV;
      String uNNnnnuuuN = "";
      String nuUnNvnuUu = "";
      String VVuuUN;
      float vNUvnnVnUvu;
      float uVUuuVnNVU;
      float vuuuNvNuv;
      private int nvUVNnuu = Integer.MIN_VALUE;
      private boolean UuuNnUvUuv;

      private NVnVnNnN(Module var1) {
         this.UuUVuuUu = var1;
         this.C00OOC00oO = null;
      }

      NVnVnNnN(Module var1, vvNnnUNnVvn var2) {
         this.UuUVuuUu = var1;
         this.C00OOC00oO = var2;
      }

      boolean UuUVuuUu() {
         return this.C00OOC00oO != null;
      }

      void UuUVuuUu(Module var1, VVnnnnN var2, boolean var3, float var4) {
         this.vVvUvVVuuNvV = var2;
         if (!var1.vVvUvVVuuNvV.equals(this.uNNnnnuuuN)) {
            this.uNNnnnuuuN = var1.vVvUvVVuuNvV;
         }

         if (var1.uNNnnnuuuN != this.nvUVNnuu) {
            this.nvUVNnuu = var1.uNNnnnuuuN;
            String var5 = UuNVnuUvunN.UuUVuuUu(var1.uNNnnnuuuN).toUpperCase();
            if (!var5.equals(this.nuUnNvnuUu)) {
               this.nuUnNvnuUu = var5;
               this.uVUuuVnNVU = vVVUUuunVVV.C00OOC00oO(vNvnnVvvVUu.UuUVuuUu, this.nuUnNvnuUu, var4);
            }
         }

         String var6 = var3 && var1.vNUvnnVnUvu != null ? var1.vNUvnnVnUvu.UuUVuuUu() : null;
         if (var6 == null) {
            this.VVuuUN = null;
            this.vuuuNvNuv = 0.0F;
            this.vNUvnnVnUvu = vVVUUuunVVV.C00OOC00oO(vNvnnVvvVUu.UuUVuuUu, this.uNNnnnuuuN, var4);
         } else {
            if (!var6.equals(this.VVuuUN)) {
               this.VVuuUN = var6;
               this.vuuuNvNuv = vVVUUuunVVV.C00OOC00oO(vNvnnVvvVUu.vNUvnnVnUvu, this.VVuuUN, var4);
            }

            this.vNUvnnVnUvu = vVVUUuunVVV.C00OOC00oO(vNvnnVvvVUu.UuUVuuUu, this.uNNnnnuuuN, var4) + this.vuuuNvNuv + 6.0F;
         }
      }

      void UuUVuuUu(vvNnnUNnVvn var1, VVnnnnN var2, float var3) {
         this.vVvUvVVuuNvV = var2;
         this.uUnuvNvvNU.UuUVuuUu();
         this.uUnuvNvvNU.UuUVuuUu(var1.uUnuvNvvNU() ? 1.0 : 0.0, 0.26, VvVUUNUu.UnUNVVVNuv, false);
         float var4 = var3 * 0.94F;
         if (!var1.UuUVuuUu.equals(this.uNNnnnuuuN)) {
            this.uNNnnnuuuN = var1.UuUVuuUu;
            this.vNUvnnVnUvu = vVVUUuunVVV.C00OOC00oO(vNvnnVvvVUu.UuUVuuUu, this.uNNnnnuuuN, var4) + 12.0F;
         }

         if (var1.nuUnNvnuUu != this.nvUVNnuu || var1.VVuuUN != this.UuuNnUvUuv) {
            this.nvUVNnuu = var1.nuUnNvnuUu;
            this.UuuNnUvUuv = var1.VVuuUN;
            String var5 = UuNVnuUvunN.UuUVuuUu(var1.nuUnNvnuUu).toUpperCase();
            String var6 = this.UuuNnUvUuv ? "[HOLD] + " + var5 : var5;
            if (!var6.equals(this.nuUnNvnuUu)) {
               this.nuUnNvnuUu = var6;
               this.uVUuuVnNVU = vVVUUuunVVV.C00OOC00oO(vNvnnVvvVUu.UuUVuuUu, this.nuUnNvnuUu, var4);
            }
         }

         this.VVuuUN = null;
         this.vuuuNvNuv = 0.0F;
      }
   }
}
