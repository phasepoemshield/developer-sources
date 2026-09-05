package ru.metaculture.protection;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

@vuUuvvvNnVV(
   UuUVuuUu = "AutoBuyInfoHUD",
   C00OOC00oO = ""
)
public final class UNVvvuvnvVNV extends nnvNuuNvvuu implements O000c0oocoo {
   private static final UNVvvuvnvVNV UuUVuuUu = new UNVvvuvnvVNV();
   private static final VVnnnnN c0oOOCcCoC0 = new VVnnnnN();
   private static final VVnnnnN VVnVNnunVvu = new VVnnnnN();
   private static final VVnnnnN unNNVVNnvvV = new VVnnnnN();
   private static final List<UNVvvuvnvVNV.NVnVnNnN> NuunnvnN = new ArrayList<>(8);
   private static final SimpleDateFormat NVUunUNUN = new SimpleDateFormat("HH:mm:ss");

   private UNVvvuvnvVNV() {
      uNvNvUNUnuu.UuUVuuUu(this);
   }

   public static void UuUVuuUu(UnVNvNnU var0) {
      UuUVuuUu.C00OOC00oO(var0);
   }

   public void C00OOC00oO(UnVNvNnU var1) {
      if (a_.field_1724 != null && AutoBuy.NVNnnvnuunNv != null) {
         AutoBuy var2 = AutoBuy.NVNnnvnuunNv;
         NuunnvnN.clear();
         NuunnvnN.add(
            new UNVvvuvnvVNV.NVnVnNnN(
               "Статус", var2.nuUnNvnuUu ? "ON" : "OFF", var2.nuUnNvnuUu ? VnVnuUn.uUnuvNvvNU(100, 255, 140, 255) : VnVnuUn.uUnuvNvvNU(255, 90, 90, 255)
            )
         );
         NuunnvnN.add(new UNVvvuvnvVNV.NVnVnNnN("Режим", var2.NnUuNNU.uUnuvNvvNU(), VnVnuUn.uUnuvNvvNU(120, 190, 255, 255)));
         NuunnvnN.add(new UNVvvuvnvVNV.NVnVnNnN("Время", C00OOC00oO(C00OOC00oO()), VnVnuUn.uUnuvNvvNU(255, 255, 255, 255)));
         NuunnvnN.add(new UNVvvuvnvVNV.NVnVnNnN("Сделки", String.valueOf(AutoBuy.vNVuvnUUnuUn()), VnVnuUn.uUnuvNvvNU(255, 190, 80, 255)));
         NuunnvnN.add(new UNVvvuvnvVNV.NVnVnNnN("Предметы", String.valueOf(AutoBuy.UvnvNVnnnnNU()), VnVnuUn.uUnuvNvvNU(255, 190, 80, 255)));
         NuunnvnN.add(new UNVvvuvnvVNV.NVnVnNnN("Потрачено", UuUVuuUu(AutoBuy.uVUVnuvnuVuv()), VnVnuUn.uUnuvNvvNU(255, 120, 120, 255)));
         NuunnvnN.add(new UNVvvuvnvVNV.NVnVnNnN("Баланс", UvnvNVnnnnNU(), VnVnuUn.uUnuvNvvNU(160, 220, 255, 255)));
         NuunnvnN.add(
            new UNVvvuvnvVNV.NVnVnNnN(
               "Окуп", uVUVnuvnuVuv(), AutoBuy.ccOO0COcoco0 > 0L ? VnVnuUn.uUnuvNvvNU(100, 255, 140, 255) : VnVnuUn.uUnuvNvvNU(180, 180, 180, 255)
            )
         );
         c0oOOCcCoC0.UuUVuuUu();
         c0oOOCcCoC0.UuUVuuUu(1.0, 0.2F, VvVUUNUu.UnUNVVVNuv, false);
         float var3 = c0oOOCcCoC0.uNNnnnuuuN();
         if (!(var3 <= 0.01F)) {
            float var4 = 22.0F;
            float var5 = 7.0F;
            float var6 = 32.0F;
            float var7 = 22.0F;
            float var8 = 5.0F;
            float var9 = 28.0F;
            String var10 = "AutoBuy";
            float var11 = 0.0F;
            float var12 = 0.0F;

            for (UNVvvuvnvVNV.NVnVnNnN var14 : NuunnvnN) {
               var11 = Math.max(var11, vVVUUuunVVV.C00OOC00oO(vNvnnVvvVUu.UuUVuuUu, var14.label(), var4));
               var12 = Math.max(var12, vVVUUuunVVV.C00OOC00oO(vNvnnVvvVUu.UuUVuuUu, var14.value(), var4));
            }

            float var53 = var11 + var12 + 20.0F + 22.0F;
            float var54 = vVVUUuunVVV.C00OOC00oO(vNvnnVvvVUu.vVvUvVVuuNvV, var10, var9) + 42.0F;
            float var15 = Math.max(var53, var54) + var5 * 2.0F;
            float var16 = NuunnvnN.size() * var7 + 10.0F;
            float var17 = var5 + var6 + var8 + var16 + var5;
            VVnVNnunVvu.UuUVuuUu();
            unNNVVNnvvV.UuUVuuUu();
            VVnVNnunVvu.UuUVuuUu(var15, 0.18F, VvVUUNUu.UnUNVVVNuv, false);
            unNNVVNnvvV.UuUVuuUu(var17, 0.18F, VvVUUNUu.UnUNVVVNuv, false);
            float var18 = VVnVNnunVvu.uNNnnnuuuN();
            float var19 = unNNVVNnvvV.uNNnnnuuuN();
            float var20 = 10.0F;
            float var21 = 155.0F;
            nNuUNVu.nvnNNunvv var22 = nNuUNVu.UuUVuuUu().UuUVuuUu("HUD_AutoBuyInfo", var20, var21, var18, var19);
            float var23 = var22.C00OOC00oO;
            float var24 = var22.uUnuvNvvNU;
            float var25 = var22.vVvUvVVuuNvV;
            float var26 = var22.uNNnnnuuuN;
            this.UuUVuuUu(var23, var24, var25, var26);
            float var27 = var25 / Math.max(1.0F, var18);
            float var28 = var26 / Math.max(1.0F, var19);
            float var29 = Math.min(var27, var28);
            float var30 = var5 * var27;
            float var31 = var5 * var28;
            float var32 = var6 * var28;
            float var33 = var7 * var28;
            float var34 = var4 * var29;
            float var35 = var3 * this.uVunuUNVVUUV.uUnuvNvvNU();
            int var36 = (int)(255.0F * var35);
            int var37 = this.UuUVuuUu(var35);
            int var38 = this.C00OOC00oO(var35);
            int var39 = this.uUnuvNvvNU(var35);
            int var40 = this.vVvUvVVuuNvV(var35);
            int var41 = VnVnuUn.UuUVuuUu(this.uNNnnnuuuN(1.0F), var36);
            int var42 = VnVnuUn.UuUVuuUu(this.nuUnNvnuUu(1.0F), var36);
            boolean var43 = this.nvUVNnuu();
            float var44 = 14.0F;
            float var45 = var25 - var30 * 2.0F;
            this.UuUVuuUu(var1, var23, var24, var25, var26, var44, var35);
            if (var43) {
               this.UuUVuuUu(var1, var23 + var30, var24 + var31, var45, var32, 11.0F, var35);
            } else {
               var1.UuUVuuUu(var23 + var30, var24 + var31, var45, var32, 11.0F, 11.0F, 4.0F, 4.0F, var38);
            }

            var1.UuUVuuUu(vNvnnVvvVUu.vVvUvVVuuNvV, var23 + var30 + 10.0F * var27, var24 + var31 + var32 * 0.5F + 6.0F * var28, var9 * var29, var10, var41);
            var1.uUnuvNvvNU();
            float var46 = Math.min(var32, 32.0F * var29);
            NVvUNUvuNnNU.UuUVuuUu(
               var23 + var30 + var45 - 18.0F * var27 - var46 * 0.5F,
               var24 + var31 + var32 * 0.5F - var46 * 0.5F,
               var46,
               this.vNUvnnVnUvu(1.0F),
               this.uVUuuVnNVU(1.0F),
               var35,
               this.UnUNVVVNuv()
            );
            float var47 = var24 + var31 + var32 + var8 * var28;
            if (this.vNUvnnVnUvu() || var43) {
               if (var43) {
                  this.C00OOC00oO(var1, var23 + var30, var47, var45, var16 * var28, 8.0F, var35);
               } else {
                  var1.UuUVuuUu(var23 + var30, var47, var45, var16 * var28, 4.0F, 4.0F, 11.0F, 11.0F, var39);
               }
            }

            var1.UuUVuuUu(var23, var24, var25, var26, var44, var44, var44, var44);
            float var48 = var47 + 5.0F * var28;

            for (UNVvvuvnvVNV.NVnVnNnN var50 : NuunnvnN) {
               var1.UuUVuuUu(vNvnnVvvVUu.UuUVuuUu, var23 + var30 + 10.0F * var27, var48 + var33 * 0.5F + 4.0F * var28, var34, var50.label(), var42);
               int var51 = VnVnuUn.UuUVuuUu(var50.color(), var36);
               float var52 = vVVUUuunVVV.C00OOC00oO(vNvnnVvvVUu.UuUVuuUu, var50.value(), var34);
               var1.UuUVuuUu(
                  vNvnnVvvVUu.UuUVuuUu, var23 + var25 - var30 - 10.0F * var27 - var52, var48 + var33 * 0.5F + 4.0F * var28, var34, var50.value(), var51
               );
               var48 += var33;
            }

            var1.nuUnNvnuUu();
            nNuUNVu.UuUVuuUu().UuUVuuUu(var22);
            UuUuVnVvnvn.UuUVuuUu(var1, this, var22, nNuUNVu.UuUVuuUu(), a_.method_22683().method_4486(), a_.method_22683().method_4502());
         }
      }
   }

   private static long C00OOC00oO() {
      return AutoBuy.VuunNUUUvu <= 0L ? 0L : Math.max(0L, System.currentTimeMillis() - AutoBuy.VuunNUUUvu);
   }

   private static String UvnvNVnnnnNU() {
      if (AutoBuy.NNUUNUuVNNVn > 0L && AutoBuy.VvVvnNUnvuvV > 0L) {
         long var0 = AutoBuy.NVNnnvnuunNv();
         return UuUVuuUu(AutoBuy.VvVvnNUnvuvV) + " (" + (var0 >= 0L ? "+" : "") + UuUVuuUu(var0) + ")";
      } else {
         return "N/A";
      }
   }

   private static String uVUVnuvnuVuv() {
      if (AutoBuy.ccOO0COcoco0 > 0L && AutoBuy.VuunNUUUvu > 0L) {
         return NVUunUNUN.format(new Date(AutoBuy.ccOO0COcoco0)) + " (" + C00OOC00oO(AutoBuy.ccOO0COcoco0 - AutoBuy.VuunNUUUvu) + ")";
      } else {
         return AutoBuy.uVUVnuvnuVuv() <= 0L ? "-" : "ожидание";
      }
   }

   private static String UuUVuuUu(long var0) {
      long var2 = Math.abs(var0);
      String var4 = String.format(Locale.ROOT, "%,d", var2).replace(',', ' ') + "¤";
      return var0 < 0L ? "-" + var4 : var4;
   }

   private static String C00OOC00oO(long var0) {
      long var2 = Math.max(0L, var0 / 1000L);
      long var4 = var2 / 3600L;
      long var6 = var2 % 3600L / 60L;
      long var8 = var2 % 60L;
      return var4 > 0L ? String.format(Locale.ROOT, "%d:%02d:%02d", var4, var6, var8) : String.format(Locale.ROOT, "%02d:%02d", var6, var8);
   }

   record NVnVnNnN(String label, String value, int color) {
   }
}
