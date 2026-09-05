package ru.metaculture.protection;

import net.minecraft.class_1304;
import net.minecraft.class_1799;
import net.minecraft.class_332;
import net.minecraft.class_408;

@vuUuvvvNnVV(
   UuUVuuUu = "ArmorHUD",
   C00OOC00oO = "w"
)
public final class uuNuUnUVUUn extends nnvNuuNvvuu {
   private static final uuNuUnUVUUn UuUVuuUu = new uuNuUnUVUUn();
   private static final VVnnnnN c0oOOCcCoC0 = new VVnnnnN();
   private static final VVnnnnN VVnVNnunVvu = new VVnnnnN();
   private static final VVnnnnN unNNVVNnvvV = new VVnnnnN();
   private static final class_1799[] NuunnvnN = new class_1799[4];
   private static final VnuuvvUv[] NVUunUNUN = new VnuuvvUv[4];
   private final vvNnnUNnVvn UUVNuUNUvUnV = new vvNnnUNnVvn("Показывать в процентах", true);
   private final UvNnUnuNUUU vuvnUnVnUNnV = new UvNnUnuNUUU("Ориентация", "Горизонтально", "Горизонтально", "Вертикально");

   private uuNuUnUVUUn() {
      this.UuUVuuUu(this.UUVNuUNUvUnV);
      this.UuUVuuUu(this.vuvnUnVnUNnV);
      uNvNvUNUnuu.UuUVuuUu(this);
   }

   public static uuNuUnUVUUn C00OOC00oO() {
      return UuUVuuUu;
   }

   public static void UuUVuuUu(UnVNvNnU var0, class_332 var1) {
      UuUVuuUu.C00OOC00oO(var0, var1);
   }

   public void C00OOC00oO(UnVNvNnU var1, class_332 var2) {
      if (O000c0oocoo.a_.field_1724 != null) {
         NuunnvnN[0] = O000c0oocoo.a_.field_1724.method_6118(class_1304.field_6169);
         NuunnvnN[1] = O000c0oocoo.a_.field_1724.method_6118(class_1304.field_6174);
         NuunnvnN[2] = O000c0oocoo.a_.field_1724.method_6118(class_1304.field_6172);
         NuunnvnN[3] = O000c0oocoo.a_.field_1724.method_6118(class_1304.field_6166);
         int var3 = 0;

         for (int var4 = 0; var4 < 4; var4++) {
            class_1799 var5 = NuunnvnN[var4];
            if (var5 != null && !var5.method_7960()) {
               NuunnvnN[var3++] = var5;
            }
         }

         boolean var63 = var3 > 0;
         boolean var64 = var63 || O000c0oocoo.a_.field_1755 instanceof class_408;
         c0oOOCcCoC0.UuUVuuUu();
         c0oOOCcCoC0.UuUVuuUu(var64 ? 1.0 : 0.0, 0.22F, VvVUUNUu.UnUNVVVNuv, false);
         float var6 = c0oOOCcCoC0.uNNnnnuuuN();
         if (!(var6 <= 0.01F)) {
            float var7 = O000c0oocoo.a_.method_22683().method_4489();
            float var8 = O000c0oocoo.a_.method_22683().method_4506();
            float var9 = 7.0F;
            boolean var10 = this.vuvnUnVnUNnV.C00OOC00oO("Вертикально");
            float var11 = var10 ? 56.0F : 42.0F;
            float var12 = 54.0F;
            float var13 = 5.0F;
            int var14 = var63 ? var3 : 4;
            float var15 = var10 ? var11 : var14 * var11 + (var14 - 1) * var13;
            float var16 = var10 ? var14 * var12 + (var14 - 1) * var13 : var12;
            float var17 = var15 + var9 * 2.0F;
            float var18 = var16 + var9 * 2.0F;
            VVnVNnunVvu.UuUVuuUu();
            unNNVVNnvvV.UuUVuuUu();
            VVnVNnunVvu.UuUVuuUu(var17, 0.18F, VvVUUNUu.UnUNVVVNuv, false);
            unNNVVNnvvV.UuUVuuUu(var18, 0.18F, VvVUUNUu.UnUNVVVNuv, false);
            float var19 = VVnVNnunVvu.uNNnnnuuuN();
            float var20 = unNNVVNnvvV.uNNnnnuuuN();
            float var21 = var7 * 0.5F + 96.0F;
            float var22 = var8 - var20 - 12.0F;
            nNuUNVu.nvnNNunvv var23 = nNuUNVu.UuUVuuUu().UuUVuuUu("hud_armor", var21, var22, var19, var20);
            float var24 = var23.C00OOC00oO;
            float var25 = var23.uUnuvNvvNU;
            float var26 = var23.vVvUvVVuuNvV;
            float var27 = var23.uNNnnnuuuN;
            this.UuUVuuUu(var24, var25, var26, var27);
            float var28 = var26 / Math.max(1.0F, var19);
            float var29 = var27 / Math.max(1.0F, var20);
            float var30 = Math.min(var28, var29);
            float var31 = var11 * var28;
            float var32 = var12 * var29;
            float var33 = var13 * (var10 ? var29 : var28);
            float var34 = var15 * var28;
            float var35 = var16 * var29;
            float var36 = var6 * this.uVunuUNVVUUV.uUnuvNvvNU();
            float var37 = this.vuuuNvNuv(var36);
            int var38 = (int)(255.0F * var36);
            int var39 = this.UuUVuuUu(var36);
            int var40 = this.vVvUvVVuuNvV(var36);
            int var41 = this.vuuuNvNuv() ? VnVnuUn.uUnuvNvvNU(255, 255, 255, (int)(5.0F * var37)) : this.C00OOC00oO(var37);
            float var42 = 10.0F;
            this.UuUVuuUu(var1, var24, var25, var26, var27, var42, var36);
            var1.uUnuvNvvNU();
            var1.UuUVuuUu(var24, var25, var26, var27, var42, var42, var42, var42);

            try {
               float var43 = var24 + (var26 - var34) * 0.5F;
               float var44 = var25 + (var27 - var35) * 0.5F;

               for (int var45 = 0; var45 < var14; var45++) {
                  float var46 = var10 ? var43 : var43 + var45 * (var31 + var33);
                  float var47 = var10 ? var44 + var45 * (var32 + var33) : var44;
                  if (!this.nvUVNnuu() && !this.UuuNnUvUuv() && !this.nUUVuvU()) {
                     var1.UuUVuuUu(var46, var47, var31, var32, 6.0F * var30, var41);
                  } else {
                     this.C00OOC00oO(var1, var46, var47, var31, var32, 6.0F * var30, var36);
                  }
               }

               if (var63) {
                  var1.uUnuvNvvNU();
               }

               for (int var65 = 0; var65 < var14 && var63; var65++) {
                  float var66 = var10 ? var43 : var43 + var65 * (var31 + var33);
                  float var67 = var10 ? var44 + var65 * (var32 + var33) : var44;
                  class_1799 var48 = NuunnvnN[var65];
                  float var49 = 1.5F * var30;
                  float var50 = 16.0F * var49;
                  float var51 = var66 + (var31 - var50) * 0.5F;
                  float var52 = var67 + 8.0F * var29;
                  NuNvVUuUUnun.UuUVuuUu(
                     var1, var48, NuNvVUuUUnun.UuUVuuUu(var51), NuNvVUuUUnun.UuUVuuUu(var52), NuNvVUuUUnun.uUnuvNvvNU(var49), var65, true, var65
                  );
                  if (var48.method_7963()) {
                     int var53 = var48.method_7936();
                     int var54 = var53 - var48.method_7919();
                     boolean var55 = this.UUVNuUNUvUnV.uUnuvNvvNU();
                     float var56 = var53 <= 0 ? 1.0F : (float)var54 / var53;
                     String var57 = var55 ? (int)(var56 * 100.0F) + "%" : var54 + "/" + var53;
                     int var58 = var56 <= 0.2F ? VnVnuUn.uUnuvNvvNU(255, 85, 85, var38) : this.vNUvnnVnUvu(var36);
                     float var59 = 16.0F * var30;
                     NVUunUNUN[var65].UuUVuuUu(var57, var54);
                     NVUunUNUN[var65]
                        .UuUVuuUu(
                           var1,
                           vNvnnVvvVUu.vVvUvVVuuNvV,
                           var66,
                           var67,
                           var31,
                           var32,
                           4.0F * var30,
                           var66 + var31 * 0.5F,
                           var67 + var32 - 6.0F * var29,
                           var59,
                           var58
                        );
                  }
               }
            } finally {
               var1.uUnuvNvvNU();
               var1.nuUnNvnuUu();
            }

            nNuUNVu.UuUVuuUu().UuUVuuUu(var23);
            UuUuVnVvnvn.UuUVuuUu(
               var1, this, var23, nNuUNVu.UuUVuuUu(), O000c0oocoo.a_.method_22683().method_4486(), O000c0oocoo.a_.method_22683().method_4502()
            );
         }
      }
   }

   static {
      for (int var0 = 0; var0 < NVUunUNUN.length; var0++) {
         NVUunUNUN[var0] = new VnuuvvUv();
      }
   }
}
