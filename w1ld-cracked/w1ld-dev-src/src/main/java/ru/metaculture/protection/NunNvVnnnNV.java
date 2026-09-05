package ru.metaculture.protection;

import net.minecraft.class_1792;
import net.minecraft.class_1799;
import net.minecraft.class_332;
import net.minecraft.class_408;

@vuUuvvvNnVV(
   UuUVuuUu = "InventoryHUD",
   C00OOC00oO = "w"
)
public final class NunNvVnnnNV extends nnvNuuNvvuu {
   private static final NunNvVnnnNV UuUVuuUu = new NunNvVnnnNV();
   private static final VVnnnnN c0oOOCcCoC0 = new VVnnnnN();
   private static final VVnnnnN VVnVNnunVvu = new VVnnnnN();
   private static final VVnnnnN unNNVVNnvvV = new VVnnnnN();
   private static final VVnnnnN[] NuunnvnN = new VVnnnnN[27];
   private static final class_1792[] NVUunUNUN = new class_1792[27];
   private final vvNnnUNnVvn UUVNuUNUvUnV = new vvNnnUNnVvn("Показывать верхушку", true);
   private final vvNnnUNnVvn vuvnUnVnUNnV = new vvNnnUNnVvn("Фон слотов", true);

   private NunNvVnnnNV() {
      this.UuUVuuUu(this.UUVNuUNUvUnV);
      this.UuUVuuUu(this.vuvnUnVnUNnV);
      uNvNvUNUnuu.UuUVuuUu(this);
   }

   public static void UuUVuuUu(UnVNvNnU var0, class_332 var1) {
      UuUVuuUu.C00OOC00oO(var0, var1);
   }

   public static NunNvVnnnNV C00OOC00oO() {
      return UuUVuuUu;
   }

   public void C00OOC00oO(UnVNvNnU var1, class_332 var2) {
      if (O000c0oocoo.a_.field_1724 != null) {
         boolean var3 = false;

         for (int var4 = 9; var4 < 36; var4++) {
            class_1799 var5 = O000c0oocoo.a_.field_1724.method_31548().method_5438(var4);
            if (!var5.method_7960()) {
               var3 = true;
               break;
            }
         }

         boolean var79 = !var3 && !(O000c0oocoo.a_.field_1755 instanceof class_408);
         boolean var80 = !var79;
         c0oOOCcCoC0.UuUVuuUu();
         c0oOOCcCoC0.UuUVuuUu(var80 ? 1.0 : 0.0, 0.22F, VvVUUNUu.UnUNVVVNuv, false);
         float var6 = c0oOOCcCoC0.uNNnnnuuuN();
         if (!(var6 <= 0.01F)) {
            boolean var7 = this.UUVNuUNUvUnV.uUnuvNvvNU();
            boolean var8 = Hud.nUUVuvU();
            unUuuVVuNnNN.NVnVnNnN var9 = var8 ? unUuuVVuNnNN.C00OOC00oO() : null;
            float var10 = 24.0F;
            float var11 = var8 ? var9.vNUvnnVnUvu : 7.0F;
            float var12 = var7 ? (var8 ? var9.vuuuNvNuv : 32.0F) : 0.0F;
            float var13 = var7 ? (var8 ? var9.uVUuuVnNVU : 5.0F) : 0.0F;
            float var14 = 22.0F;
            float var15 = var8 ? var9.vNUvnnVnUvu : 7.0F;
            float var16 = 9.0F * var14;
            float var17 = 3.0F * var14;
            String var18 = "Inventory";
            float var19 = vVVUUuunVVV.UuUVuuUu(vNvnnVvvVUu.vVvUvVVuuNvV, var18, var8 ? var9.UuuNnUvUuv : 26.0F).UuUVuuUu;
            float var20 = var16 + var15 * 2.0F;
            float var21 = var17 + var15 * 2.0F;
            float var22 = var20 + var11 * 2.0F;
            if (var7) {
               float var23 = var19 + 22.0F + var15 * 2.0F + (var8 ? var9.nUUVuvU : 24.0F);
               var22 = Math.max(var22, var23 + var11 * 2.0F);
            }

            float var81 = var11 + var12 + var13 + var21 + var11;
            VVnVNnunVvu.UuUVuuUu();
            unNNVVNnvvV.UuUVuuUu();
            VVnVNnunVvu.UuUVuuUu(var22, 0.18F, VvVUUNUu.UnUNVVVNuv, false);
            unNNVVNnvvV.UuUVuuUu(var81, 0.18F, VvVUUNUu.UnUNVVVNuv, false);
            float var24 = VVnVNnunVvu.uNNnnnuuuN();
            float var25 = unNNVVNnvvV.uNNnnnuuuN();
            float var26 = O000c0oocoo.a_.method_22683().method_4489();
            float var27 = Math.max(10.0F, var26 - var24 - 10.0F);
            float var28 = 10.0F;
            nNuUNVu.nvnNNunvv var29 = nNuUNVu.UuUVuuUu().UuUVuuUu("HUD_Inventory", var27, var28, var24, var25);
            float var30 = var29.C00OOC00oO;
            float var31 = var29.uUnuvNvvNU;
            float var32 = var29.vVvUvVVuuNvV;
            float var33 = var29.uNNnnnuuuN;
            this.UuUVuuUu(var30, var31, var32, var33);
            float var34 = var32 / Math.max(1.0F, var24);
            float var35 = var33 / Math.max(1.0F, var25);
            float var36 = Math.min(var34, var35);
            float var37 = var11 * var34;
            float var38 = var11 * var35;
            float var39 = var7 ? var12 * var35 : 0.0F;
            float var40 = var13 * var35;
            float var41 = var14 * var36;
            float var42 = var6 * this.uVunuUNVVUUV.uUnuvNvvNU();
            float var43 = this.vuuuNvNuv(var42);
            int var44 = (int)(255.0F * var42);
            int var45 = this.C00OOC00oO(var42);
            int var46 = this.uUnuvNvvNU(var42);
            int var47 = this.uNNnnnuuuN(var42);
            int var48 = this.VVuuUN(var42);
            int var49 = this.vuuuNvNuv() ? VnVnuUn.uUnuvNvvNU(255, 255, 255, (int)(5.0F * var43)) : this.C00OOC00oO(var43);
            float var50 = var8 ? var9.UuUVuuUu : 14.0F;
            float var51 = var8 ? var9.C00OOC00oO : 11.0F;
            float var52 = var8 ? var9.uUnuvNvvNU : 9.0F;
            float var53 = var8 ? var9.VVuuUN : 4.0F;
            float var54 = var32 - var37 * 2.0F;
            this.UuUVuuUu(var1, var30, var31, var32, var33, var50, var42);
            if (var7) {
               if (this.nvUVNnuu() || this.UuuNnUvUuv() || this.nUUVuvU()) {
                  this.UuUVuuUu(var1, var30 + var37, var31 + var38, var54, var39, var51, var42);
               } else if (var8) {
                  var1.UuUVuuUu(var30 + var37, var31 + var38, var54, var39, var51, var45);
               } else {
                  var1.UuUVuuUu(var30 + var37, var31 + var38, var54, var39, 11.0F, 11.0F, 4.0F, 4.0F, var45);
               }

               float var55 = var8 ? var30 + var9.UvnvNVnnnnNU.UuUVuuUu * var34 : var30 + var37 + 10.0F * var34;
               float var56 = var8 ? var31 + var9.UvnvNVnnnnNU.C00OOC00oO * var35 : var31 + var38 + var39 / 2.0F + 6.0F * var35;
               var1.UuUVuuUu(vNvnnVvvVUu.vVvUvVVuuNvV, var55, var56, (var8 ? var9.UuuNnUvUuv : 26.0F) * var36, var18, var47);
               float var57 = 22.0F * var35;
               float var58 = var30 + var37 + var54 - 10.0F * var34 - var57;
               float var59 = var31 + var38 + (var39 - var57) / 2.0F;
               float var60 = (var8 ? var9.nUUVuvU : var10 + 4.0F) * var36;
               float var61 = vVVUUuunVVV.UuUVuuUu(vNvnnVvvVUu.uNNnnnuuuN, "h", var60).UuUVuuUu;
               float var62 = var8
                  ? (var9.uVUVnuvnuVuv.uUnuvNvvNU ? var30 + var32 : var30) + var9.uVUVnuvnuVuv.UuUVuuUu * var34
                  : var58 + (var57 - var61) / 2.0F;
               float var63 = var8 ? var31 + var9.uVUVnuvnuVuv.C00OOC00oO * var35 : var59 + var57 / 2.0F + 7.0F * var35;
               var1.UuUVuuUu(vNvnnVvvVUu.uNNnnnuuuN, var62, var63, var60, "h", var48);
            }

            float var82 = var31 + var38 + var39 + var40;
            if (!var7) {
               var82 = var31 + var38;
            }

            float var84 = var30 + var37 + (var8 ? var9.NVNnnvnuunNv.UuUVuuUu * var34 : 0.0F);
            var82 += var8 ? var9.NVNnnvnuunNv.C00OOC00oO * var35 : 0.0F;
            float var85 = var21 * var35;
            if (this.nvUVNnuu() || this.UuuNnUvUuv() || this.nUUVuvU()) {
               this.C00OOC00oO(var1, var84, var82, var54, var85, var52, var42);
            } else if (var8) {
               var1.UuUVuuUu(var84, var82, var54, var85, var52, var46);
            } else {
               var1.UuUVuuUu(var84, var82, var54, var85, var7 ? 4.0F : 11.0F, var7 ? 4.0F : 11.0F, 11.0F, 11.0F, var46);
            }

            var1.uUnuvNvvNU();
            var1.UuUVuuUu(var30, var31, var32, var33, var50, var50, var50, var50);

            try {
               float var86 = var84 + (var54 - 9.0F * var41) / 2.0F;
               float var87 = var82 + (var85 - 3.0F * var41) / 2.0F;

               for (int var88 = 0; var88 < 3; var88++) {
                  for (int var90 = 0; var90 < 9; var90++) {
                     float var92 = var86 + var90 * var41;
                     float var94 = var87 + var88 * var41;
                     if (this.vuvnUnVnUNnV.uUnuvNvvNU()) {
                        if (!this.nvUVNnuu() && !this.UuuNnUvUuv() && !this.nUUVuvU()) {
                           var1.UuUVuuUu(var92 + 1.0F, var94 + 1.0F, var41 - 2.0F, var41 - 2.0F, var53 * var36, var49);
                        } else {
                           this.C00OOC00oO(var1, var92 + 1.0F, var94 + 1.0F, var41 - 2.0F, var41 - 2.0F, var53 * var36, var42);
                        }
                     }
                  }
               }

               var1.uUnuvNvvNU();
               int var89 = 9;

               for (int var91 = 0; var91 < 3; var91++) {
                  for (int var93 = 0; var93 < 9; var93++) {
                     float var95 = var86 + var93 * var41;
                     float var64 = var87 + var91 * var41;
                     class_1799 var65 = O000c0oocoo.a_.field_1724.method_31548().method_5438(var89);
                     int var66 = var89 - 9;
                     VVnnnnN var67 = NuunnvnN[var66];
                     var67.UuUVuuUu();
                     boolean var68 = !var65.method_7960();
                     class_1792 var69 = var68 ? var65.method_7909() : null;
                     if (var68 && NVUunUNUN[var66] != var69) {
                        var67.nuUnNvnuUu(0.0);
                     }

                     var67.UuUVuuUu(var68 ? 1.0 : 0.0, 0.2F, VvVUUNUu.UnUNVVVNuv, false);
                     NVUunUNUN[var66] = var69;
                     if (var68 && var67.uNNnnnuuuN() > 0.01F) {
                        float var70 = var67.uNNnnnuuuN();
                        float var71 = 0.4F + 0.6F * var70;
                        float var72 = var36 * var71;
                        float var73 = 16.0F * var72;
                        float var74 = var95 + (var41 - var73) / 2.0F;
                        float var75 = var64 + (var41 - var73) / 2.0F;
                        NuNvVUuUUnun.UuUVuuUu(
                           var1, var65, NuNvVUuUUnun.UuUVuuUu(var74), NuNvVUuUUnun.UuUVuuUu(var75), NuNvVUuUUnun.uUnuvNvvNU(var72), 0, true, var66
                        );
                     }

                     var89++;
                  }
               }
            } finally {
               var1.uUnuvNvvNU();
               var1.nuUnNvnuUu();
            }

            nNuUNVu.UuUVuuUu().UuUVuuUu(var29);
            UuUuVnVvnvn.UuUVuuUu(
               var1, this, var29, nNuUNVu.UuUVuuUu(), O000c0oocoo.a_.method_22683().method_4486(), O000c0oocoo.a_.method_22683().method_4502()
            );
         }
      }
   }

   static {
      for (int var0 = 0; var0 < NuunnvnN.length; var0++) {
         NuunnvnN[var0] = new VVnnnnN();
      }
   }
}
