package ru.metaculture.protection;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import ru.metaculture.profile.Profile;

@vuUuvvvNnVV(
   UuUVuuUu = "WaterMark",
   C00OOC00oO = "w"
)
public final class unnvNvvnuVUn extends nnvNuuNvvuu {
   private static final unnvNvvnuVUn UuUVuuUu = new unnvNvvnuVUn();
   private static final VVnnnnN c0oOOCcCoC0 = new VVnnnnN();
   private static int VVnVNnunVvu = 0;
   private final SimpleDateFormat unNNVVNnvvV = new SimpleDateFormat("HH:mm");
   private final Map<String, VVnnnnN> NuunnvnN = new HashMap<>();
   private final List<unnvNvvnuVUn.NVnVnNnN> NVUunUNUN = new ArrayList<>(4);
   private final VUVnvvnNN UUVNuUNUvUnV = new VUVnvvnNN(
      "Отображать", new vvNnnUNnVvn("Username", true), new vvNnnUNnVvn("UID", true), new vvNnnUNnVvn("FPS", true), new vvNnnUNnVvn("Time", true)
   );
   private float vuvnUnVnUNnV = 0.0F;
   private float nnuUVNUuvvVU = 0.0F;
   private float nVVUuvuNnUN = 0.0F;
   private float nNnVnUNVV = 0.0F;

   private unnvNvvnuVUn() {
      this.UuUVuuUu(this.UUVNuUNUvUnV);
      uNvNvUNUnuu.UuUVuuUu(this);
   }

   public static unnvNvvnuVUn C00OOC00oO() {
      return UuUVuuUu;
   }

   public static void UuUVuuUu(UnVNvNnU var0) {
      UuUVuuUu.C00OOC00oO(var0);
   }

   private boolean UuUVuuUu(float var1, float var2, float var3, float var4, float var5, float var6) {
      return var1 >= var3 && var1 <= var3 + var5 && var2 >= var4 && var2 <= var4 + var6;
   }

   private void UuUVuuUu(String var1, String var2, String var3, String var4, List<unnvNvvnuVUn.NVnVnNnN> var5) {
      VVnnnnN var6 = this.NuunnvnN.computeIfAbsent(var1, var0 -> new VVnnnnN());
      var6.UuUVuuUu();
      var6.UuUVuuUu(this.UUVNuUNUvUnV.C00OOC00oO(var1) ? 1.0 : 0.0, 0.2F, VvVUUNUu.UnUNVVVNuv, false);
      if (var6.uNNnnnuuuN() > 0.01F) {
         unnvNvvnuVUn.NVnVnNnN var7 = new unnvNvvnuVUn.NVnVnNnN(var1, var2, var3, var4);
         var7.nuUnNvnuUu = var6.uNNnnnuuuN();
         var5.add(var7);
      }
   }

   public void C00OOC00oO(UnVNvNnU var1) {
      if (O000c0oocoo.a_.field_1724 != null) {
         c0oOOCcCoC0.UuUVuuUu();
         c0oOOCcCoC0.UuUVuuUu(1.0, 0.22F, VvVUUNUu.UnUNVVVNuv, false);
         float var2 = c0oOOCcCoC0.uNNnnnuuuN();
         if (!(var2 <= 0.01F)) {
            float var3 = nNuUNVu.UuUVuuUu().VVuuUN();
            float var4 = nNuUNVu.UuUVuuUu().vNUvnnVnUvu();
            boolean var5 = nNuUNVu.UuUVuuUu().vuuuNvNuv();
            boolean var6 = nNuUNVu.UuUVuuUu().uVUuuVnNVU();
            String var7 = nNuUNVu.UuUVuuUu().nvUVNnuu();
            if (this.nVVUuvuNnUN > 0.0F && this.UuUVuuUu(var3, var4, this.vuvnUnVnUNnV, this.nnuUVNUuvvVU, this.nVVUuvuNnUN, this.nNnVnUNVV) && var7 == null) {
               if (var5) {
                  O000c0oocoo.a_.field_1774.method_1455(Profile.getUsername());
               }

               if (var6) {
                  nNuUNVu.UuUVuuUu().C00OOC00oO();
               }
            }

            int var8 = O000c0oocoo.a_.method_47599();
            VVnVNnunVvu = VVnVNnunVvu + (int)((var8 - VVnVNnunVvu) * UuvVnuU.nuUnNvnuUu(0.2F));
            int var9 = Profile.getUid();
            boolean var10 = Hud.nUUVuvU();
            unUuuVVuNnNN.NVnVnNnN var11 = var10 ? unUuuVVuNnNN.UuUVuuUu("HUD_WaterMark") : null;
            float var12 = var10 ? var11.UuuNnUvUuv : 24.0F;
            float var13 = var10 ? var11.nUUVuvU : 24.0F;
            float var14 = var10 ? var11.vNUvnnVnUvu : 7.0F;
            float var15 = 10.0F;
            float var16 = var10 ? var11.uVUuuVnNVU : 5.0F;
            float var17 = var10 ? var11.nvUVNnuu : 32.0F;
            this.NVUunUNUN.clear();
            List var18 = this.NVUunUNUN;
            this.UuUVuuUu("Username", "r", Profile.getUsername(), "", var18);
            this.UuUVuuUu("FPS", "u", String.valueOf(VVnVNnunVvu), "fps", var18);
            this.UuUVuuUu("Time", "y", this.unNNVVNnvvV.format(System.currentTimeMillis()), "", var18);
            this.UuUVuuUu("UID", "t", String.valueOf(var9), "uid", var18);
            float var19 = 32.0F;
            float var20 = var14 + var19;

            for (unnvNvvnuVUn.NVnVnNnN var22 : var18) {
               float var23 = vVVUUuunVVV.UuUVuuUu(vNvnnVvvVUu.UuUVuuUu, var22.uUnuvNvvNU, var12).UuUVuuUu;
               float var24 = var22.vVvUvVVuuNvV.isEmpty() ? 0.0F : vVVUUuunVVV.UuUVuuUu(vNvnnVvvVUu.UuUVuuUu, var22.vVvUvVVuuNvV, var12).UuUVuuUu;
               float var25 = vVVUUuunVVV.UuUVuuUu(vNvnnVvvVUu.vNUvnnVnUvu, var22.C00OOC00oO, var13).UuUVuuUu;
               float var26 = var25 + 8.0F + var23 + var24 + var15 * 2.0F;
               var22.uNNnnnuuuN = var26 * var22.nuUnNvnuUu;
               var20 += var16 * var22.nuUnNvnuUu + var22.uNNnnnuuuN;
            }

            var20 += var14;
            float var59 = var17 + var14 * 2.0F;
            nNuUNVu.nvnNNunvv var60 = nNuUNVu.UuUVuuUu().UuUVuuUu("HUD_WaterMark", 10.0F, 10.0F, var20, var59);
            float var61 = var60.C00OOC00oO;
            float var62 = var60.uUnuvNvvNU;
            float var63 = var60.vVvUvVVuuNvV;
            float var64 = var60.uNNnnnuuuN;
            this.UuUVuuUu(var61, var62, var63, var64);
            float var27 = var63 / Math.max(1.0F, var20);
            float var28 = var64 / Math.max(1.0F, var59);
            float var29 = Math.min(var27, var28);
            float var30 = var14 * var27;
            float var31 = var14 * var28;
            float var32 = var16 * var27;
            float var33 = var19 * var27;
            float var34 = var17 * var28;
            float var35 = var2 * this.uVunuUNVVUUV.uUnuvNvvNU();
            int var36 = this.C00OOC00oO(var35);
            int var37 = this.vVvUvVVuuNvV(var35);
            int var38 = this.uNNnnnuuuN(var35);
            int var39 = this.VVuuUN(var35);
            float var40 = var10 ? var11.UuUVuuUu : 14.0F;
            this.UuUVuuUu(var1, var61, var62, var63, var64, var40, var35);
            float var41 = var61 + var30;
            float var42 = var62 + var31;
            if (this.UuuNnUvUuv() || this.nUUVuvU()) {
               this.C00OOC00oO(var1, var41, var42, var33, var34, 11.0F, var35);
            } else if (!this.UuUVuuUu(var41, var42, var33, var34, 11.0F, false, var35, 1)) {
               var1.UuUVuuUu(var41, var42, var33, var34, 11.0F, 4.0F, 4.0F, 11.0F, var36);
               if (this.uNNnnnuuuN()) {
                  var1.UuUVuuUu(var41, var42, var33, var34, 11.0F, 4.0F, 4.0F, 11.0F, var37, Math.max(1.0F, this.uUnuvNvvNU() * 0.65F));
               }
            }

            float var43 = (var10 ? var11.nUUVuvU : 26.0F) * var29;
            float var44 = vVVUUuunVVV.UuUVuuUu(vNvnnVvvVUu.vNUvnnVnUvu, "w", var43).UuUVuuUu;
            var1.UuUVuuUu(vNvnnVvvVUu.vNUvnnVnUvu, var41 + (var33 - var44) / 2.0F, var42 + var34 / 2.0F + 5.5F * var28, var43, "w", var39);
            float var45 = var41 + var33;

            for (int var46 = 0; var46 < var18.size(); var46++) {
               unnvNvvnuVUn.NVnVnNnN var47 = (unnvNvvnuVUn.NVnVnNnN)var18.get(var46);
               var45 += var32 * var47.nuUnNvnuUu;
               float var48 = var47.uNNnnnuuuN * var27;
               boolean var49 = var46 == var18.size() - 1;
               if (var47.UuUVuuUu.equals("Username")) {
                  this.vuvnUnVnUNnV = var45;
                  this.nnuUVNUuvvVU = var42;
                  this.nVVUuvuNnUN = var48;
                  this.nNnVnUNVV = var34;
               }

               int var50 = VnVnuUn.UuUVuuUu(var36, (int)(VnVnuUn.UuUVuuUu(var36) * var47.nuUnNvnuUu));
               int var51 = VnVnuUn.UuUVuuUu(var39, (int)(VnVnuUn.UuUVuuUu(var39) * var47.nuUnNvnuUu));
               int var52 = VnVnuUn.UuUVuuUu(var38, (int)(VnVnuUn.UuUVuuUu(var38) * var47.nuUnNvnuUu));
               boolean var53 = var47.UuUVuuUu.equals("Username") && var6 && var7 == null && this.UuUVuuUu(var3, var4, var45, var42, var48, var34);
               if (!this.UuuNnUvUuv() && !this.nUUVuvU()) {
                  if (!this.UuUVuuUu(var45, var42, var48, var34, 11.0F, var53, var35 * var47.nuUnNvnuUu, var53 ? 2 : 1)) {
                     var1.UuUVuuUu(var45, var42, var48, var34, 4.0F, var49 ? 11.0F : 4.0F, var49 ? 11.0F : 4.0F, 4.0F, var50);
                  }
               } else {
                  this.C00OOC00oO(var1, var45, var42, var48, var34, 11.0F, var35 * var47.nuUnNvnuUu);
               }

               var1.UuUVuuUu(var45, var42, var48, var34, 4.0F, var49 ? 11.0F : 4.0F, var49 ? 11.0F : 4.0F, 4.0F);
               float var54 = var45 + var15 * var27;
               float var55 = var42 + var34 / 2.0F + 4.5F * var28;
               float var56 = var13 * var29;
               float var57 = var12 * var29;
               var1.UuUVuuUu(vNvnnVvvVUu.vNUvnnVnUvu, var54, var55 + 1.0F * var28, var56, var47.C00OOC00oO, var51);
               var54 += vVVUUuunVVV.UuUVuuUu(vNvnnVvvVUu.vNUvnnVnUvu, var47.C00OOC00oO, var56).UuUVuuUu + 5.0F * var27;
               var1.UuUVuuUu(vNvnnVvvVUu.UuUVuuUu, var54, var55, var57, var47.uUnuvNvvNU, var52);
               if (!var47.vVvUvVVuuNvV.isEmpty()) {
                  var54 += vVVUUuunVVV.UuUVuuUu(vNvnnVvvVUu.UuUVuuUu, var47.uUnuvNvvNU, var57).UuUVuuUu;
                  var1.UuUVuuUu(vNvnnVvvVUu.UuUVuuUu, var54, var55, var57, var47.vVvUvVVuuNvV, var51);
               }

               var1.nuUnNvnuUu();
               var45 += var48;
            }

            nNuUNVu.UuUVuuUu().UuUVuuUu(var60);
            UuUuVnVvnvn.UuUVuuUu(
               var1, this, var60, nNuUNVu.UuUVuuUu(), O000c0oocoo.a_.method_22683().method_4486(), O000c0oocoo.a_.method_22683().method_4502()
            );
         }
      }
   }

   static class NVnVnNnN {
      final String UuUVuuUu;
      final String C00OOC00oO;
      final String uUnuvNvvNU;
      final String vVvUvVVuuNvV;
      float uNNnnnuuuN;
      float nuUnNvnuUu = 1.0F;

      NVnVnNnN(String var1, String var2, String var3, String var4) {
         this.UuUVuuUu = var1;
         this.C00OOC00oO = var2;
         this.uUnuvNvvNU = var3;
         this.vVvUvVVuuNvV = var4;
      }
   }
}
