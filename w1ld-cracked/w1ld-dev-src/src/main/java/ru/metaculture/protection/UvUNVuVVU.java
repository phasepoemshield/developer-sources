package ru.metaculture.protection;

import java.util.Locale;

@uNUunUnnnVu(
   uUnuvNvvNU = {"lichoday"}
)
@vuUuvvvNnVV(
   UuUVuuUu = "AI Status",
   C00OOC00oO = "i"
)
public final class UvUNVuVVU extends nnvNuuNvvuu implements O000c0oocoo {
   private static final UvUNVuVVU UuUVuuUu = new UvUNVuVVU();
   private static final VVnnnnN c0oOOCcCoC0 = new VVnnnnN();
   private static final VVnnnnN VVnVNnunVvu = new VVnnnnN();
   private static final VVnnnnN unNNVVNnvvV = new VVnnnnN();

   private UvUNVuVVU() {
      uNvNvUNUnuu.UuUVuuUu(this);
   }

   public static void UuUVuuUu(UnVNvNnU var0) {
      UuUVuuUu.C00OOC00oO(var0);
   }

   private void C00OOC00oO(UnVNvNnU var1) {
      if (a_.field_1724 != null && a_.field_1687 != null) {
         VnUNuvv var2 = VuUvvnuUu.c0oOOCcCoC0();
         boolean var3 = AttackAura.UNnVVNvvnVvU.C00OOC00oO("AI") || System.currentTimeMillis() - var2.updatedAtMs() < 2000L;
         c0oOOCcCoC0.UuUVuuUu();
         VVnVNnunVvu.UuUVuuUu();
         unNNVVNnvvV.UuUVuuUu();
         c0oOOCcCoC0.UuUVuuUu(var3 ? 1.0 : 0.0, 0.2F, VvVUUNUu.UnUNVVVNuv, false);
         if (!(c0oOOCcCoC0.uNNnnnuuuN() <= 0.01F)) {
            String var4 = "AI Aura";
            String var5 = var2.text();
            String var6 = "Frames " + var2.queuedRecords() + "  Saved " + var2.writtenRecords();
            float var7 = 24.0F;
            float var8 = 21.0F;
            float var9 = 18.0F;
            float var10 = vVVUUuunVVV.UuUVuuUu(vNvnnVvvVUu.vVvUvVVuuNvV, var4, var7).UuUVuuUu;
            float var11 = vVVUUuunVVV.UuUVuuUu(vNvnnVvvVUu.UuUVuuUu, var5, var8).UuUVuuUu;
            float var12 = vVVUUuunVVV.UuUVuuUu(vNvnnVvvVUu.UuUVuuUu, var6, var9).UuUVuuUu;
            float var13 = Math.max(142.0F, Math.max(var10 + var11 + 48.0F, var12 + 44.0F));
            float var14 = 48.0F;
            if (VVnVNnunVvu.uNNnnnuuuN() <= 1.0F) {
               VVnVNnunVvu.nuUnNvnuUu(var13);
            }

            VVnVNnunVvu.UuUVuuUu(var13, 0.18F, VvVUUNUu.UnUNVVVNuv, false);
            float var15 = VVnVNnunVvu.uNNnnnuuuN();
            float var17 = (a_.method_22683().method_4489() - var15) * 0.5F;
            float var18 = 52.0F;
            nNuUNVu.nvnNNunvv var19 = nNuUNVu.UuUVuuUu().UuUVuuUu("HUD_AIStatus", var17, var18, var15, var14);
            float var20 = c0oOOCcCoC0.uNNnnnuuuN() * this.uVunuUNVVUUV.uUnuvNvvNU();
            float var21 = var19.C00OOC00oO;
            float var22 = var19.uUnuvNvvNU;
            float var23 = var19.vVvUvVVuuNvV;
            float var24 = var19.uNNnnnuuuN;
            this.UuUVuuUu(var21, var22, var23, var24);
            float var25 = 12.0F;
            int var26 = this.C00OOC00oO(var20);
            int var27 = this.uNNnnnuuuN(var20);
            int var28 = this.nuUnNvnuUu(var20);
            int var29 = this.UuUVuuUu(var2, var20);
            float var30 = this.UuUVuuUu(var2);
            this.UuUVuuUu(var1, var21, var22, var23, var24, var25, var20);
            if (!this.nvUVNnuu() && this.vVvUvVVuuNvV()) {
               var1.UuUVuuUu(var21 + 8.0F, var22 + var24 - 3.0F, var23 - 16.0F, 4.0F, 6.0F, 12.0F, 1.0F, VnVnuUn.UuUVuuUu(var29, (int)(50.0F * var20)));
            }

            if (this.nvUVNnuu()) {
               this.C00OOC00oO(var1, var21 + 6.0F, var22 + 6.0F, var23 - 12.0F, var24 - 12.0F, 8.0F, var20);
            } else {
               var1.UuUVuuUu(var21 + 6.0F, var22 + 6.0F, var23 - 12.0F, var24 - 12.0F, 8.0F, var26);
            }

            var1.UuUVuuUu(
               var21 + 10.0F,
               var22 + var24 - 2.0F,
               var23 - 20.0F,
               1.0F,
               0.5F,
               VnVnuUn.UuUVuuUu(this.uVUuuVnNVU(1.0F), (int)(22.0F * var20)),
               VnVnuUn.UuUVuuUu(var29, (int)(74.0F * var20))
            );
            float var31 = var21 + 20.0F;
            float var32 = var22 + var24 * 0.5F;
            var1.C00OOC00oO(var31, var32, 8.0F + var30 * 5.0F, 0.0F, 360.0F, VnVnuUn.UuUVuuUu(var29, (int)(42.0F * var20 * (1.0F - var30 * 0.5F))));
            var1.C00OOC00oO(var31, var32, 4.0F, 0.0F, 360.0F, var29);
            var1.UuUVuuUu(vNvnnVvvVUu.vVvUvVVuuNvV, var21 + 36.0F, var22 + 20.0F, var7, var4, var27);
            var1.UuUVuuUu(vNvnnVvvVUu.UuUVuuUu, var21 + var23 - 12.0F - var11, var22 + 20.0F, var8, var5, var28);
            var1.UuUVuuUu(vNvnnVvvVUu.UuUVuuUu, var21 + 36.0F, var22 + 38.0F, var9, var6, VnVnuUn.uUnuvNvvNU(155, 165, 180, (int)(165.0F * var20)));
            nNuUNVu.UuUVuuUu().UuUVuuUu(var19);
            UuUuVnVvnvn.UuUVuuUu(var1, this, var19, nNuUNVu.UuUVuuUu(), a_.method_22683().method_4486(), a_.method_22683().method_4502());
         }
      }
   }

   private int UuUVuuUu(VnUNuvv var1, float var2) {
      String var3 = var1.text().toLowerCase(Locale.ROOT);
      if (var3.contains("failed") || var3.contains("error") || var3.contains("missing")) {
         return VnVnuUn.uUnuvNvvNU(255, 96, 112, (int)(255.0F * var2));
      } else if (var1.training()) {
         return VnVnuUn.uUnuvNvvNU(255, 198, 92, (int)(255.0F * var2));
      } else if (var1.loadingModel()) {
         return VnVnuUn.uUnuvNvvNU(120, 176, 255, (int)(255.0F * var2));
      } else if (var3.contains("recording")) {
         return VnVnuUn.uUnuvNvvNU(92, 235, 182, (int)(255.0F * var2));
      } else {
         return !var3.contains("replay") && !var3.contains("ready")
            ? VnVnuUn.UuUVuuUu(this.vNUvnnVnUvu(1.0F), (int)(255.0F * var2))
            : VnVnuUn.uUnuvNvvNU(128, 226, 255, (int)(255.0F * var2));
      }
   }

   private float UuUVuuUu(VnUNuvv var1) {
      boolean var2 = var1.training() || var1.text().contains("recording") || var1.text().contains("replay");
      unNNVVNnvvV.UuUVuuUu(var2 ? 1.0 : 0.0, 0.2F, VvVUUNUu.UnUNVVVNuv, false);
      return unNNVVNnvvV.uNNnnnuuuN() * (0.5F + 0.5F * (float)Math.sin(System.currentTimeMillis() / 180.0));
   }
}
