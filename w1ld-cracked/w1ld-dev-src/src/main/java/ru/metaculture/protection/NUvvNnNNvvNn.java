package ru.metaculture.protection;

import java.util.Locale;
import net.minecraft.class_3532;

@vuUuvvvNnVV(
   UuUVuuUu = "Neuro Monitor",
   C00OOC00oO = "i"
)
public final class NUvvNnNNvvNn extends nnvNuuNvvuu implements O000c0oocoo {
   private static final NUvvNnNNvvNn UuUVuuUu = new NUvvNnNNvvNn();
   private static final VVnnnnN c0oOOCcCoC0 = new VVnnnnN();

   private NUvvNnNNvvNn() {
      uNvNvUNUnuu.UuUVuuUu(this);
   }

   public static void UuUVuuUu(UnVNvNnU var0) {
      UuUVuuUu.C00OOC00oO(var0);
   }

   private void C00OOC00oO(UnVNvNnU var1) {
      if (a_.field_1724 != null && a_.field_1687 != null) {
         VnUNuvv var2 = VuUvvnuUu.c0oOOCcCoC0();
         long var3 = System.currentTimeMillis();
         boolean var5 = AttackAura.UNnVVNvvnVvU.C00OOC00oO("AI") || VuUvvnuUu.uUVuVvuNUvnu() || var2.training() || var3 - var2.updatedAtMs() < 4000L;
         c0oOOCcCoC0.UuUVuuUu();
         c0oOOCcCoC0.UuUVuuUu(var5 ? 1.0 : 0.0, 0.2F, VvVUUNUu.UnUNVVVNuv, false);
         float var6 = c0oOOCcCoC0.uNNnnnuuuN();
         if (!(var6 <= 0.01F)) {
            float var7 = 306.0F;
            float var8 = 170.0F;
            float var9 = 12.0F;
            float var10 = 120.0F;
            nNuUNVu.nvnNNunvv var11 = nNuUNVu.UuUVuuUu().UuUVuuUu("HUD_NeuroMonitor", var9, var10, var7, var8);
            float var12 = var6 * this.uVunuUNVVUUV.uUnuvNvvNU();
            float var13 = var11.C00OOC00oO;
            float var14 = var11.uUnuvNvvNU;
            float var15 = var11.vVvUvVVuuNvV;
            float var16 = var11.uNNnnnuuuN;
            this.UuUVuuUu(var13, var14, var15, var16);
            int var17 = this.uNNnnnuuuN(var12);
            int var18 = this.nuUnNvnuUu(var12);
            int var19 = this.vNUvnnVnUvu(var12);
            int var20 = VnVnuUn.uUnuvNvvNU(255, 156, 86, (int)(255.0F * var12));
            int var21 = this.UuUVuuUu(var2, var12);
            this.UuUVuuUu(var1, var13, var14, var15, var16, 12.0F, var12);
            float var22 = 12.0F;
            var1.C00OOC00oO(var13 + var22 + 4.0F, var14 + 15.0F, 4.0F, 0.0F, 360.0F, var21);
            var1.UuUVuuUu(vNvnnVvvVUu.vVvUvVVuuNvV, var13 + var22 + 14.0F, var14 + 18.0F, 21.0F, "Neuro Monitor", var17);
            String var23 = var2.text();
            float var24 = vVVUUuunVVV.UuUVuuUu(vNvnnVvvVUu.UuUVuuUu, var23, 15.0F).UuUVuuUu;
            var1.UuUVuuUu(vNvnnVvvVUu.UuUVuuUu, var13 + var15 - var22 - var24, var14 + 17.0F, 15.0F, var23, var18);
            String var25 = VuUvvnuUu.UnUNVVVNuv() < 0.0F ? "—" : String.format(Locale.ROOT, "%.4f", VuUvvnuUu.UnUNVVVNuv());
            String var26 = "Profile "
               + VuUvvnuUu.UUVNuUNUvUnV()
               + "   Pairs "
               + VuUvvnuUu.vNVuvnUUnuUn()
               + "   Loss "
               + var25
               + "   Jitter "
               + String.format(Locale.ROOT, "%.2f", AttackAura.NnUuNNU.uUnuvNvvNU());
            var1.UuUVuuUu(vNvnnVvvVUu.UuUVuuUu, var13 + var22, var14 + 35.0F, 13.0F, var26, VnVnuUn.UuUVuuUu(var18, (int)(215.0F * var12)));
            float var27 = var13 + var22;
            float var28 = var15 - var22 * 2.0F;
            float var29 = 44.0F;
            float var30 = var14 + 50.0F;
            var1.UuUVuuUu(vNvnnVvvVUu.UuUVuuUu, var27, var30, 13.0F, "Твой стиль (датасет)", var18);
            this.UuUVuuUu(var1, var27 + var28, var30, var19, var20, var12);
            this.UuUVuuUu(
               var1,
               var27,
               var30 + 5.0F,
               var28,
               var29,
               VuUvvnuUu.UuuNnUvUuv(),
               VuUvvnuUu.nUUVuvU(),
               -1,
               var12,
               var19,
               var20,
               "Нет записи — .ai train -> .ai learn"
            );
            float var31 = var30 + 5.0F + var29 + 12.0F;
            String var32 = VuUvvnuUu.uUVuVvuNUvnu() ? "Твой аим — запись (live)" : (VuUvvnuUu.uVunuUNVVUUV() ? "Нейросеть — бой (live)" : "Live");
            var1.UuUVuuUu(vNvnnVvvVUu.UuUVuuUu, var27, var31, 13.0F, var32, var18);
            this.UuUVuuUu(
               var1,
               var27,
               var31 + 5.0F,
               var28,
               var29,
               VuUvvnuUu.vNUvnnVnUvu(),
               VuUvvnuUu.uVUuuVnNVU(),
               VuUvvnuUu.vuuuNvNuv(),
               var12,
               var19,
               var20,
               "Ожидание..."
            );
            nNuUNVu.UuUVuuUu().UuUVuuUu(var11);
            UuUuVnVvnvn.UuUVuuUu(var1, this, var11, nNuUNVu.UuUVuuUu(), a_.method_22683().method_4486(), a_.method_22683().method_4502());
         }
      }
   }

   private void UuUVuuUu(UnVNvNnU var1, float var2, float var3, int var4, int var5, float var6) {
      float var7 = 12.0F;
      String var8 = "Pitch";
      String var9 = "Yaw";
      float var10 = vVVUUuunVVV.UuUVuuUu(vNvnnVvvVUu.UuUVuuUu, var8, var7).UuUVuuUu;
      float var11 = vVVUUuunVVV.UuUVuuUu(vNvnnVvvVUu.UuUVuuUu, var9, var7).UuUVuuUu;
      float var12 = var2 - var10;
      var1.UuUVuuUu(vNvnnVvvVUu.UuUVuuUu, var12, var3, var7, var8, VnVnuUn.UuUVuuUu(var5, (int)(255.0F * var6)));
      float var13 = var12 - 10.0F - var11;
      var1.UuUVuuUu(vNvnnVvvVUu.UuUVuuUu, var13, var3, var7, var9, VnVnuUn.UuUVuuUu(var4, (int)(255.0F * var6)));
   }

   private void UuUVuuUu(
      UnVNvNnU var1, float var2, float var3, float var4, float var5, float[] var6, float[] var7, int var8, float var9, int var10, int var11, String var12
   ) {
      var1.UuUVuuUu(var2, var3, var4, var5, 6.0F, VnVnuUn.uUnuvNvvNU(8, 10, 16, (int)(150.0F * var9)));
      if (this.uNNnnnuuuN()) {
         var1.UuUVuuUu(var2, var3, var4, var5, 6.0F, this.vVvUvVVuuNvV(var9), 1.0F);
      }

      float var13 = var3 + var5 * 0.5F;
      var1.UuUVuuUu(var2 + 3.0F, var13 - 0.5F, var4 - 6.0F, 1.0F, VnVnuUn.UuUVuuUu(var10, (int)(40.0F * var9)));
      if (var6 != null && var7 != null && var6.length != 0) {
         int var27 = Math.min(var6.length, var7.length);
         float var15 = 6.0F;

         for (int var16 = 0; var16 < var27; var16++) {
            float var17 = Math.abs(var6[var16]);
            if (var17 > var15) {
               var15 = var17;
            }

            float var18 = Math.abs(var7[var16]);
            if (var18 > var15) {
               var15 = var18;
            }
         }

         if (var15 > 35.0F) {
            var15 = 35.0F;
         }

         float var28 = var5 * 0.5F - 3.0F;
         float var29 = var28 / var15;
         float var30 = var4 / var27;
         float var19 = Math.max(1.0F, var30 * 0.9F);
         int var20 = VnVnuUn.UuUVuuUu(var10, (int)(225.0F * var9));
         int var21 = VnVnuUn.UuUVuuUu(var11, (int)(150.0F * var9));

         for (int var22 = 0; var22 < var27; var22++) {
            int var23 = var8 < 0 ? var22 : (var8 + var22) % var27;
            float var24 = var2 + var22 * var30;
            float var25 = class_3532.method_15363(var7[var23] * var29, -var28, var28);
            if (var25 >= 0.0F) {
               var1.UuUVuuUu(var24, var13 - var25, var19, var25, var21);
            } else {
               var1.UuUVuuUu(var24, var13, var19, -var25, var21);
            }

            float var26 = class_3532.method_15363(var6[var23] * var29, -var28, var28);
            if (var26 >= 0.0F) {
               var1.UuUVuuUu(var24, var13 - var26, var19, var26, var20);
            } else {
               var1.UuUVuuUu(var24, var13, var19, -var26, var20);
            }
         }
      } else {
         float var14 = vVVUUuunVVV.UuUVuuUu(vNvnnVvvVUu.UuUVuuUu, var12, 12.0F).UuUVuuUu;
         var1.UuUVuuUu(vNvnnVvvVUu.UuUVuuUu, var2 + (var4 - var14) * 0.5F, var13 + 4.0F, 12.0F, var12, VnVnuUn.uUnuvNvvNU(150, 156, 170, (int)(185.0F * var9)));
      }
   }

   private int UuUVuuUu(VnUNuvv var1, float var2) {
      String var3 = var1.text().toLowerCase(Locale.ROOT);
      if (var3.contains("failed") || var3.contains("error") || var3.contains("missing") || var3.contains("устар")) {
         return VnVnuUn.uUnuvNvvNU(255, 96, 112, (int)(255.0F * var2));
      } else if (var1.training()) {
         return VnVnuUn.uUnuvNvvNU(255, 198, 92, (int)(255.0F * var2));
      } else if (var3.contains("recording") || var3.contains("запис")) {
         return VnVnuUn.uUnuvNvvNU(92, 235, 182, (int)(255.0F * var2));
      } else {
         return !var3.contains("brain") && !var3.contains("ready") && !var3.contains("replay")
            ? this.vNUvnnVnUvu(var2)
            : VnVnuUn.uUnuvNvvNU(128, 226, 255, (int)(255.0F * var2));
      }
   }
}
