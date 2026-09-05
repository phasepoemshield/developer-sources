package ru.metaculture.protection;

import java.util.Objects;
import org.wild.module.api.Module;

public final class nNVvUVunnVNV implements VvnNUnUu {
   private static final float UuUVuuUu = 62.0F;
   private static final float C00OOC00oO = 18.0F;
   private static final float uUnuvNvvNU = 18.0F;
   private static final float vVvUvVVuuNvV = 5.0F;
   private static final float uNNnnnuuuN = 22.0F;
   private static final float nuUnNvnuUu = 4.0F;
   private static final float VVuuUN = 18.0F;
   private static final float vNUvnnVnUvu = 16.0F;
   private static final float uVUuuVnNVU = 5.0F;
   private static final uNNnVuNunvU vuuuNvNuv = uNNnVuNunvU.UuUVuuUu(2.1F, 0.55F);
   private static final float nvUVNnuu = 0.001F;
   private static final uNNnVuNunvU UuuNnUvUuv = uNNnVuNunvU.UuUVuuUu(1.4F, 0.7F);
   private final Module nUUVuvU;
   private final vvNnnUNnVvn UnUNVVVNuv;
   private final uvNNUnnUvU vNVuvnUUnuUn;
   private final nNVnuNVvvv<Boolean> UvnvNVnnnnNU;
   private final String uVUVnuvnuVuv;
   private final uNuuunuNvuN NVNnnvnuunNv;
   private final uNuuunuNvuN uVunuUNVVUUV;
   private nNVvUVunnVNV.NVnVnNnN UNnVVNvvnVvU = nNVvUVunnVNV.NVnVnNnN.EMPTY;
   private nNVvUVunnVNV.NVnVnNnN uNnUnnuNUnNu = nNVvUVunnVNV.NVnVnNnN.EMPTY;
   private float NnUuNNU = 0.0F;
   private float nNvNUVU = 0.0F;
   private boolean UnUNuUU = false;

   public nNVvUVunnVNV(Module var1, uvNNUnnUvU var2, vvNnnUNnVvn var3, nNVnuNVvvv<?> var4) {
      this(var1, var2, var3, var4, null);
   }

   public nNVvUVunnVNV(Module var1, uvNNUnnUvU var2, vvNnnUNnVvn var3, nNVnuNVvvv<?> var4, String var5) {
      this.nUUVuvU = Objects.requireNonNull(var1, "module");
      this.vNVuvnUUnuUn = Objects.requireNonNull(var2, "popupContext");
      this.UnUNVVVNuv = Objects.requireNonNull(var3, "setting");
      this.UvnvNVnnnnNU = Objects.requireNonNull(var4, "valueAccessor");
      this.uVUVnuvnuVuv = UuUVuuUu(var5);
      Object var6 = var4.UuUVuuUu();
      boolean var7 = var6 instanceof Boolean ? (Boolean)var6 : false;
      float var8 = var7 ? 1.0F : 0.0F;
      this.NVNnnvnuunNv = new uNuuunuNvuN(vvUnNVVnV.UuUVuuUu(), vuuuNvNuv, var8, 0.0F, 1.0F, 5.0E-4F, 5.0E-4F);
      this.NVNnnvnuunNv.UuUVuuUu(unnvUnnn.UuUVuuUu);
      this.uVunuUNVVUUV = new uNuuunuNvuN(vvUnNVVnV.UuUVuuUu(), UuuNnUvUuv, var8, 0.0F, 1.0F, 5.0E-4F, 5.0E-4F);
      this.uVunuUNVVUUV.UuUVuuUu(unnvUnnn.uUnuvNvvNU);
   }

   @Override
   public void UuUVuuUu() {
      Object var1 = this.UvnvNVnnnnNU.UuUVuuUu();
      boolean var2 = var1 instanceof Boolean ? (Boolean)var1 : false;
      this.NVNnnvnuunNv.uUnuvNvvNU(var2 ? 1.0F : 0.0F);
      this.vNUvnnVnUvu();
   }

   @Override
   public void UuUVuuUu(float var1, float var2, float var3) {
      this.UNnVVNvvnVvU = new nNVvUVunnVNV.NVnVnNnN(var1, var2, var3, 62.0F);
      float var4 = var1 + var3 - 18.0F - 22.0F;
      float var5 = var2 + 20.0F;
      this.uNnUnnuNUnNu = new nNVvUVunnVNV.NVnVnNnN(var4, var5, 22.0F, 22.0F);
      this.NnUuNNU = var1 + 18.0F;
      this.nNvNUVU = var2 + 31.0F + 5.0F;
   }

   @Override
   public float C00OOC00oO() {
      return 62.0F;
   }

   @Override
   public void UuUVuuUu(UnVNvNnU var1, float var2, float var3, float var4) {
      float var5 = var2 * (float)UuUVuuUu(var3);
      if (!(var5 <= 0.0F)) {
         float var6 = this.NVNnnvnuunNv.UuUVuuUu();
         double var7 = UuUVuuUu(var5 * var6);
         if (var7 > 0.001F) {
            var1.UuUVuuUu(
               this.uNnUnnuNUnNu.x + 1.0F,
               this.uNnUnnuNUnNu.y + 1.0F,
               this.uNnUnnuNUnNu.width - 2.0F,
               this.uNnUnnuNUnNu.height - 2.0F,
               4.0F,
               VvUNvVNnuUNU.UuUVuuUu(UVvNVuUvNVn.UuUVuuUu(), var7)
            );
         }

         double var9 = UuUVuuUu(var5);
         var1.UuUVuuUu(
            this.uNnUnnuNUnNu.x, this.uNnUnnuNUnNu.y, this.uNnUnnuNUnNu.width, this.uNnUnnuNUnNu.height, 4.0F, VvUNvVNnuUNU.UuUVuuUu(5197646, var9), 1.0F
         );
         double var11 = UuUVuuUu(var6 * var5);
         if (var11 > 0.001F) {
            var1.UuUVuuUu(
               vNvnnVvvVUu.uUnuvNvvNU,
               this.uNnUnnuNUnNu.centerX(),
               this.uNnUnnuNUnNu.centerY() + 5.0F + 3.0F,
               16.0F,
               "\ue5ca",
               VvUNvVNnuUNU.UuUVuuUu(16777215, var11),
               "c"
            );
         }

         double var13 = UuUVuuUu(var5);
         float var15 = this.uVunuUNVVUUV.UuUVuuUu();
         int var16 = VvUNvVNnuUNU.UuUVuuUu(8947848, var13);
         int var17 = VvUNvVNnuUNU.UuUVuuUu(16777215, var13);
         int var18 = VvUNvVNnuUNU.UuUVuuUu(var16, var17, var15);
         var1.UuUVuuUu(vNvnnVvvVUu.vVvUvVVuuNvV, this.NnUuNNU, this.nNvNUVU, 18.0F, this.uVUuuVnNVU(), var18, "l");
      }
   }

   @Override
   public boolean UuUVuuUu(double var1, double var3, int var5) {
      if (!this.UNnVVNvvnVvU.contains(var1, var3)) {
         return false;
      } else if (var5 == 2) {
         Object var9 = this.UvnvNVnnnnNU.UuUVuuUu();
         Boolean var10 = var9 instanceof Boolean ? (Boolean)var9 : false;
         this.vNVuvnUUnuUn.openForSetting(this.nUUVuvU, this.UnUNVVVNuv, var1, var3, var10);
         return true;
      } else if (var5 != 0) {
         return false;
      } else {
         Object var6 = this.UvnvNVnnnnNU.UuUVuuUu();
         boolean var7 = var6 instanceof Boolean ? (Boolean)var6 : false;
         boolean var8 = !var7;
         this.UvnvNVnnnnNU.UuUVuuUu(var8);
         this.NVNnnvnuunNv.uUnuvNvvNU(var8 ? 1.0F : 0.0F);
         return true;
      }
   }

   @Override
   public nvUuvVvuuN uUnuvNvvNU() {
      return this.UnUNVVVNuv;
   }

   @Override
   public boolean vVvUvVVuuNvV() {
      return true;
   }

   @Override
   public void UuUVuuUu(double var1, double var3) {
      this.UnUNuUU = this.UNnVVNvvnVvU.contains(var1, var3);
      this.vNUvnnVnUvu();
   }

   private void vNUvnnVnUvu() {
      Object var2 = this.UvnvNVnnnnNU.UuUVuuUu();
      boolean var3 = var2 instanceof Boolean ? (Boolean)var2 : false;
      float var1;
      if (var3) {
         var1 = 1.0F;
      } else if (this.UnUNuUU) {
         var1 = 0.5F;
      } else {
         var1 = 0.0F;
      }

      this.uVunuUNVVUUV.uUnuvNvvNU(var1);
   }

   private String uVUuuVnNVU() {
      return this.uVUVnuvnuVuv != null ? this.uVUVnuvnuVuv : this.UnUNVVVNuv.UuUVuuUu;
   }

   private static String UuUVuuUu(String var0) {
      if (var0 == null) {
         return null;
      } else {
         String var1 = var0.trim();
         return var1.isEmpty() ? null : var1;
      }
   }

   private static double UuUVuuUu(double var0) {
      if (var0 <= 0.0) {
         return 0.0;
      } else {
         return var0 >= 1.0 ? 1.0 : var0;
      }
   }

   record NVnVnNnN(float x, float y, float width, float height) {
      static final nNVvUVunnVNV.NVnVnNnN EMPTY = new nNVvUVunnVNV.NVnVnNnN(0.0F, 0.0F, 0.0F, 0.0F);

      boolean contains(double var1, double var3) {
         return var1 >= this.x && var1 <= this.x + this.width && var3 >= this.y && var3 <= this.y + this.height;
      }

      float centerX() {
         return this.x + this.width * 0.5F;
      }

      float centerY() {
         return this.y + this.height * 0.5F;
      }
   }
}
