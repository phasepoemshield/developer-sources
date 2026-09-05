package ru.metaculture.protection;

import java.util.List;

@vuUuvvvNnVV(
   UuUVuuUu = "Brew Monitor",
   C00OOC00oO = "i"
)
public final class uuUnvuNNUUv extends nnvNuuNvvuu implements O000c0oocoo {
   private static final uuUnvuNNUUv UuUVuuUu = new uuUnvuNNUUv();
   private static final VVnnnnN c0oOOCcCoC0 = new VVnnnnN();
   private static final int VVnVNnunVvu = 6;

   private uuUnvuNNUUv() {
      uNvNvUNUnuu.UuUVuuUu(this);
   }

   public static void UuUVuuUu(UnVNvNnU var0) {
      UuUVuuUu.C00OOC00oO(var0);
   }

   private void C00OOC00oO(UnVNvNnU var1) {
      if (a_.field_1724 != null && a_.field_1687 != null) {
         c0oOOCcCoC0.UuUVuuUu();
         c0oOOCcCoC0.UuUVuuUu(AutoPottBot.NVNnnvnuunNv ? 1.0 : 0.0, 0.2F, VvVUUNUu.UnUNVVVNuv, false);
         float var2 = c0oOOCcCoC0.uNNnnnuuuN();
         if (!(var2 <= 0.01F)) {
            List var3 = AutoPottBot.c0oOOCcCoC0;
            List var4 = AutoPottBot.VVnVNnunVvu;
            int[] var5 = AutoPottBot.UvUvUNuvNU;
            int var6 = Math.min(var3.size(), 6);
            float var7 = 252.0F;
            float var8 = 52.0F;
            float var9 = 32.0F;
            float var10 = 15.0F;
            float var11 = var4.isEmpty() ? 0.0F : 16.0F;
            float var12 = var8 + var9 + var6 * var10 + var11 + 12.0F;
            nNuUNVu.nvnNNunvv var13 = nNuUNVu.UuUVuuUu().UuUVuuUu("HUD_BrewMonitor", 12.0F, 300.0F, var7, var12);
            float var14 = var2 * this.uVunuUNVVUUV.uUnuvNvvNU();
            float var15 = var13.C00OOC00oO;
            float var16 = var13.uUnuvNvvNU;
            float var17 = var13.vVvUvVVuuNvV;
            float var18 = var13.uNNnnnuuuN;
            this.UuUVuuUu(var15, var16, var17, var18);
            int var19 = this.uNNnnnuuuN(var14);
            int var20 = this.nuUnNvnuUu(var14);
            int var21 = AutoPottBot.NVNnnvnuunNv ? UuUVuuUu(5954680, var14) : UuUVuuUu(8421512, var14);
            this.UuUVuuUu(var1, var15, var16, var17, var18, 12.0F, var14);
            float var22 = 12.0F;
            var1.C00OOC00oO(var15 + var22 + 4.0F, var16 + 15.0F, 4.0F, 0.0F, 360.0F, var21);
            var1.UuUVuuUu(vNvnnVvvVUu.vVvUvVVuuNvV, var15 + var22 + 14.0F, var16 + 18.0F, 21.0F, "Brew Monitor", var19);
            String var23 = AutoPottBot.uVunuUNVVUUV;
            float var24 = vVVUUuunVVV.UuUVuuUu(vNvnnVvvVUu.UuUVuuUu, var23, 14.0F).UuUVuuUu;
            var1.UuUVuuUu(vNvnnVvvVUu.UuUVuuUu, var15 + var17 - var22 - var24, var16 + 17.0F, 14.0F, var23, var20);
            String var25 = "Варок "
               + AutoPottBot.UNnVVNvvnVvU
               + "   вар "
               + AutoPottBot.uNnUnnuNUnNu
               + "   своб "
               + AutoPottBot.NnUuNNU
               + "   гот "
               + AutoPottBot.nNvNUVU
               + "   зелий ≈ "
               + AutoPottBot.UnUNuUU;
            var1.UuUVuuUu(vNvnnVvvVUu.UuUVuuUu, var15 + var22, var16 + 36.0F, 13.0F, var25, VnVnuUn.UuUVuuUu(var20, (int)(235.0F * var14)));
            float var26 = var16 + 54.0F;
            String var27 = "Вода " + var5[0] + "    Бут " + AutoPottBot.uUVuVvuNUvnu + "    Нарост " + var5[1] + "    Блэйз " + var5[2];
            String var28 = "Глоу " + var5[3] + "    Сахар " + var5[4] + "    Магма " + var5[5] + "    Редст " + var5[6];
            var1.UuUVuuUu(vNvnnVvvVUu.UuUVuuUu, var15 + var22, var26, 12.5F, var27, var20);
            var26 += 14.0F;
            var1.UuUVuuUu(vNvnnVvvVUu.UuUVuuUu, var15 + var22, var26, 12.5F, var28, var20);
            var26 += 18.0F;
            float var29 = 84.0F;
            float var30 = var15 + var17 - var22 - var29;

            for (int var31 = 0; var31 < var6; var31++) {
               AutoPottBot.VUnuUnnuNvVu var32 = (AutoPottBot.VUnuUnnuNvVu)var3.get(var31);
               var1.UuUVuuUu(vNvnnVvvVUu.UuUVuuUu, var15 + var22, var26 + 1.0F, 12.5F, var32.label(), var19);
               float var33 = var26 + 2.5F;
               float var34 = 4.0F;
               var1.UuUVuuUu(var30, var33, var29, var34, var34 / 2.0F, UuUVuuUu(0, var14 * 0.55F));
               float var35 = Math.max(0.0F, Math.min(1.0F, var32.progress()));
               if (var35 > 0.001F) {
                  var1.UuUVuuUu(var30, var33, var29 * var35, var34, var34 / 2.0F, UuUVuuUu(var32.color(), var14));
               }

               var26 += var10;
            }

            if (!var4.isEmpty()) {
               String var38 = "Не хватает: " + String.join(", ", var4);
               var1.UuUVuuUu(vNvnnVvvVUu.UuUVuuUu, var15 + var22, var26 + 2.0F, 12.5F, var38, UuUVuuUu(16737392, var14));
            }

            nNuUNVu.UuUVuuUu().UuUVuuUu(var13);
            UuUuVnVvnvn.UuUVuuUu(var1, this, var13, nNuUNVu.UuUVuuUu(), a_.method_22683().method_4486(), a_.method_22683().method_4502());
         }
      }
   }

   private static int UuUVuuUu(int var0, float var1) {
      int var2 = (int)(255.0F * Math.max(0.0F, Math.min(1.0F, var1)));
      return VnVnuUn.uUnuvNvvNU(var0 >> 16 & 0xFF, var0 >> 8 & 0xFF, var0 & 0xFF, var2);
   }
}
