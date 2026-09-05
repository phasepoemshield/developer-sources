package ru.metaculture.protection;

import com.mojang.authlib.GameProfile;
import com.mojang.blaze3d.opengl.GlStateManager;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import net.minecraft.class_1044;
import net.minecraft.class_10868;
import net.minecraft.class_2960;
import net.minecraft.class_310;
import net.minecraft.class_640;

public final class UvVNVuNUVvuv {
   private static final class_310 C00OOC00oO = class_310.method_1551();
   public static final class_2960 UuUVuuUu = class_2960.method_60655("wild", "svg/waypoint.svg");
   private static final float uUnuvNvvNU = 2.0F;
   private static final float vVvUvVVuuNvV = 11.0F;
   private static final float uNNnnnuuuN = 6.0F;
   private static final float nuUnNvnuUu = 7.0F;
   private static final float VVuuUN = 6.0F;
   private static final float vNUvnnVnUvu = 2.4F;
   private static final float uVUuuVnNVU = 8.0F;
   private static final float vuuuNvNuv = 6.0F;
   private static final float nvUVNnuu = 2.0F;
   private static final float UuuNnUvUuv = 4.0F;
   private static final float nUUVuvU = 5.0F;
   private static final float UnUNVVVNuv = 8.0F;
   private static final float vNVuvnUUnuUn = 2.0F;
   private static final float UvnvNVnnnnNU = 23.0F;
   private static final Map<String, class_2960> uVUVnuvnuVuv = new ConcurrentHashMap<>();
   private float NVNnnvnuunNv;
   private float uVunuUNVVUUV;
   private float UNnVVNvvnVvU;
   private float uNnUnnuNUnNu;
   private float NnUuNNU;
   private float nNvNUVU;
   private float UnUNuUU;
   private float uUVuVvuNUvnu;
   private float UvUvUNuvNU;
   private float c0oOOCcCoC0;
   private float VVnVNnunVvu;
   private float unNNVVNnvvV;
   private float NuunnvnN;

   public static void UuUVuuUu(UnVNvNnU var0) {
      var0.UuUVuuUu(23.0F);
   }

   public float UuUVuuUu(String var1, String var2, String var3) {
      this.C00OOC00oO(var1, var2, var3);
      return this.NnUuNNU;
   }

   public void UuUVuuUu(UnVNvNnU var1, float var2, float var3, String var4, String var5, String var6, String var7, float var8, float var9) {
      float var10 = UuUVuuUu(var8);
      if (!(var10 <= 0.004F)) {
         this.C00OOC00oO(var4, var5, var6);
         float var11 = 0.9F + 0.1F * var10;
         float var12 = this.uNnUnnuNUnNu * var11;
         float var13 = this.NnUuNNU * var11;
         float var14 = var2 - var12 * 0.5F;
         float var15 = var3 + (1.0F - var10) * 6.0F * this.NVNnnvnuunNv - var13 * 0.5F;
         this.UuUVuuUu(var1, var14, var15, var12, var13, var11, var10);
         var1.UuUVuuUu(var14, var15);

         try {
            var1.C00OOC00oO(var11, var11);

            try {
               this.UuUVuuUu(var1, var4, var5, var6, var7, var10, UuUVuuUu(var9));
            } finally {
               var1.uVUuuVnNVU();
            }
         } finally {
            var1.vNUvnnVnUvu();
         }
      }
   }

   private void C00OOC00oO(String var1, String var2, String var3) {
      this.NVNnnvnuunNv = UuUVuuUu();
      this.nNvNUVU = 14.0F * this.NVNnnvnuunNv;
      this.UnUNuUU = 12.0F * this.NVNnnvnuunNv;
      this.uVunuUNVVUUV = 11.0F * this.NVNnnvnuunNv;
      this.UNnVVNvvnVvU = this.uVunuUNVVUUV + 6.0F * this.NVNnnvnuunNv;
      VuuUvnvnuu.nvnNNunvv var4 = UnVNvNnU.UuUVuuUu(vNvnnVvvVUu.UuUVuuUu, var1, this.nNvNUVU);
      VuuUvnvnuu.nvnNNunvv var5 = UnVNvNnU.UuUVuuUu(vNvnnVvvVUu.UuUVuuUu, var3, this.UnUNuUU);
      VuuUvnvnuu.nvnNNunvv var6 = UnVNvNnU.UuUVuuUu(vNvnnVvvVUu.UuUVuuUu, var2, this.UnUNuUU);
      this.uUVuVvuNUvnu = var4.UuUVuuUu;
      this.c0oOOCcCoC0 = var4.C00OOC00oO;
      this.UvUvUNuvNU = var5.UuUVuuUu;
      this.VVnVNnunVvu = var6.C00OOC00oO;
      float var7 = 15.4F * this.NVNnnvnuunNv;
      this.NnUuNNU = Math.max(this.uVunuUNVVUUV, var7) + 8.0F * this.NVNnnvnuunNv;
      float var8 = Math.max(this.uUVuVvuNUvnu + 8.0F * this.NVNnnvnuunNv + this.UvUvUNuvNU, var6.UuUVuuUu);
      this.uNnUnnuNUnNu = this.UNnVVNvvnVvU + 2.0F * this.NVNnnvnuunNv + var8 + 2.0F * this.NVNnnvnuunNv;
      float var9 = (this.NnUuNNU - var7) * 0.5F;
      this.unNNVVNnvvV = var9 + 7.0F * this.NVNnnvnuunNv * 0.5F;
      this.NuunnvnN = var9 + 9.4F * this.NVNnnvnuunNv + 6.0F * this.NVNnnvnuunNv * 0.5F;
   }

   private void UuUVuuUu(UnVNvNnU var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      float var8 = 6.0F * this.NVNnnvnuunNv * var6;
      var1.UuUVuuUu(var2, var3, var4, var5, var8, var7);
      var1.UuUVuuUu(var2, var3, var4, var5, var8, VnVnuUn.uUnuvNvvNU(22, 22, 25, (int)(133.0F * var7)));
      var1.UuUVuuUu(var2, var3, this.UNnVVNvvnVvU * var6, var5, var8, 0.0F, 0.0F, var8, VnVnuUn.uUnuvNvvNU(50, 48, 46, (int)(50.0F * var7)));
      var1.UuUVuuUu(var2, var3, var4, var5, var8, VnVnuUn.uUnuvNvvNU(255, 255, 255, (int)(56.0F * var7)), Math.max(1.0F, this.NVNnnvnuunNv));
   }

   private void UuUVuuUu(UnVNvNnU var1, String var2, String var3, String var4, String var5, float var6, float var7) {
      int var8 = VnVnuUn.uNNnnnuuuN(UnVNvNnU.VvunVVUvUNnv.nuUnNvnuUu(1, 1), (int)(255.0F * var6));
      float var9 = 0.4F + 0.6F * var7;
      this.UuUVuuUu(var1, var5, VnVnuUn.uNNnnnuuuN(var8, (int)(255.0F * var6 * var9)), var6);
      var1.UuUVuuUu(
         vNvnnVvvVUu.UuUVuuUu,
         this.UNnVVNvvnVvU + 4.0F * this.NVNnnvnuunNv,
         C00OOC00oO(this.unNNVVNnvvV - 3.0F, this.c0oOOCcCoC0),
         this.nNvNUVU,
         var2,
         VnVnuUn.uUnuvNvvNU(240, 240, 244, (int)(255.0F * var6))
      );
      var1.UuUVuuUu(
         vNvnnVvvVUu.UuUVuuUu,
         this.uNnUnnuNUnNu - 5.0F * this.NVNnnvnuunNv - this.UvUvUNuvNU,
         C00OOC00oO(this.unNNVVNnvvV - 3.0F, this.VVnVNnunVvu),
         this.UnUNuUU,
         var4,
         VnVnuUn.uNNnnnuuuN(var8, (int)(255.0F * var6 * UuUVuuUu(var7, 0.35F)))
      );
      var1.UuUVuuUu(
         vNvnnVvvVUu.UuUVuuUu,
         this.UNnVVNvvnVvU + 4.0F * this.NVNnnvnuunNv,
         C00OOC00oO(this.NuunnvnN - 3.0F, this.VVnVNnunVvu),
         this.UnUNuUU,
         var3,
         VnVnuUn.uUnuvNvvNU(168, 170, 178, (int)(255.0F * var6 * UuUVuuUu(var7, 0.18F)))
      );
   }

   private void UuUVuuUu(UnVNvNnU var1, String var2, int var3, float var4) {
      float var5 = (this.UNnVVNvvnVvU - this.uVunuUNVVUUV) * 0.55F;
      float var6 = (this.NnUuNNU - this.uVunuUNVVUUV) * 0.5F;
      if (var2 == null || var2.isEmpty() || !this.UuUVuuUu(var1, var2, var5, var6, var4)) {
         int var7 = COCc00CCc.UuUVuuUu(UuUVuuUu, COCc00CCc.UuUVuuUu(11.0F, this.NVNnnvnuunNv * 2.0F), true);
         if (var7 > 0) {
            GlStateManager._bindTexture(var7);
            var1.UuUVuuUu(var7, var5, var6, this.uVunuUNVVUUV, this.uVunuUNVVUUV, var3, false);
         } else {
            float var8 = this.uVunuUNVVUUV * 2.0F;
            VuuUvnvnuu.nvnNNunvv var9 = UnVNvNnU.UuUVuuUu(vNvnnVvvVUu.VVuuUN, "B", var8);
            var1.UuUVuuUu(
               vNvnnVvvVUu.VVuuUN, var5 + (this.uVunuUNVVUUV - var9.UuUVuuUu) * 0.5F, var6 + (this.uVunuUNVVUUV + var9.C00OOC00oO) * 0.5F, var8, "B", var3
            );
         }
      }
   }

   private boolean UuUVuuUu(UnVNvNnU var1, String var2, float var3, float var4, float var5) {
      try {
         class_2960 var6 = UuUVuuUu(var2);
         if (var6 == null) {
            return false;
         } else {
            class_1044 var7 = C00OOC00oO.method_1531().method_4619(var6);
            if (var7 != null && var7.method_68004() instanceof class_10868 var8) {
               int var16 = var8.method_68427();
               if (var16 <= 0) {
                  return false;
               } else {
                  float var10 = 2.0F * this.NVNnnvnuunNv;
                  GlStateManager._bindTexture(var16);
                  var1.uNNnnnuuuN(var5);

                  try {
                     var1.UuUVuuUu(var16, var3, var4, this.uVunuUNVVUUV, this.uVunuUNVVUUV, 0.125F, 0.125F, 0.25F, 0.25F, var10);
                     var1.UuUVuuUu(var16, var3, var4, this.uVunuUNVVUUV, this.uVunuUNVVUUV, 0.625F, 0.125F, 0.75F, 0.25F, var10);
                  } finally {
                     var1.vuuuNvNuv();
                  }

                  return true;
               }
            } else {
               return false;
            }
         }
      } catch (Throwable var15) {
         return false;
      }
   }

   private static class_2960 UuUVuuUu(String var0) {
      String var1 = var0.toLowerCase(Locale.ROOT);
      class_2960 var2 = uVUVnuvnuVuv.get(var1);
      if (var2 != null) {
         return var2;
      } else {
         class_2960 var3 = C00OOC00oO(var0);
         if (var3 != null) {
            uVUVnuvnuVuv.put(var1, var3);
         }

         return var3;
      }
   }

   private static class_2960 C00OOC00oO(String var0) {
      if (C00OOC00oO.method_1562() != null) {
         for (class_640 var2 : C00OOC00oO.method_1562().method_2880()) {
            if (var2.method_2966().getName().equalsIgnoreCase(var0)) {
               return var2.method_52810().comp_1626();
            }
         }
      }

      if (C00OOC00oO.method_1582() == null) {
         return null;
      } else {
         GameProfile var3 = new GameProfile(UUID.nameUUIDFromBytes(("OfflinePlayer:" + var0).getBytes()), var0);
         return C00OOC00oO.method_1582().method_52862(var3).comp_1626();
      }
   }

   private static float UuUVuuUu(float var0, float var1) {
      return UuUVuuUu((var0 - var1) / (1.0F - var1));
   }

   private static float C00OOC00oO(float var0, float var1) {
      return var0 + var1 * 0.5F;
   }

   private static float UuUVuuUu() {
      if (C00OOC00oO != null && C00OOC00oO.method_22683() != null) {
         float var0 = C00OOC00oO.method_22683().method_4495();
         return var0 <= 0.0F ? 2.0F : var0;
      } else {
         return 2.0F;
      }
   }

   private static float UuUVuuUu(float var0) {
      return var0 < 0.0F ? 0.0F : Math.min(var0, 1.0F);
   }
}
