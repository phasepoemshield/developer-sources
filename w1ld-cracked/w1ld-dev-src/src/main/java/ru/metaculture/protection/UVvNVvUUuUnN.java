package ru.metaculture.protection;

import java.util.Locale;

public final class UVvNVvUUuUnN {
   private static final long UuUVuuUu = 600L;
   private static final float C00OOC00oO = 2.0F;
   private static final int uUnuvNvvNU = 12;
   private static final int vVvUvVVuuNvV = 48;
   private final UVvNVvUUuUnN.NVnVnNnN uNNnnnuuuN;
   private float nuUnNvnuUu;
   private float VVuuUN;
   private float vNUvnnVnUvu;
   private float uVUuuVnNVU;
   private float vuuuNvNuv;
   private String nvUVNnuu = "";
   private boolean UuuNnUvUuv;
   private boolean nUUVuvU;
   private boolean UnUNVVVNuv;
   private long vNVuvnUUnuUn;
   private float UvnvNVnnnnNU;
   private float uVUVnuvnuVuv;
   private float NVNnnvnuunNv;
   private String uVunuUNVVUUV = "";
   private long UNnVVNvvnVvU;

   public UVvNVvUUuUnN(UVvNVvUUuUnN.NVnVnNnN var1, float var2, float var3, float var4, float var5) {
      this.uNNnnnuuuN = var1;
      this.nuUnNvnuUu = var2;
      this.VVuuUN = var3;
      this.vNUvnnVnUvu = var4;
      this.uVUuuVnNVU = var5;
   }

   public static UVvNVvUUuUnN UuUVuuUu(float var0, float var1) {
      return new UVvNVvUUuUnN(UVvNVvUUuUnN.NVnVnNnN.NUMERIC, var0, var1, 0.012F, 0.001F);
   }

   public static UVvNVvUUuUnN UuUVuuUu() {
      return new UVvNVvUUuUnN(UVvNVvUUuUnN.NVnVnNnN.TEXT, 0.0F, 0.0F, 0.0F, 0.0F);
   }

   public UVvNVvUUuUnN.NVnVnNnN C00OOC00oO() {
      return this.uNNnnnuuuN;
   }

   public void C00OOC00oO(float var1, float var2) {
      this.nuUnNvnuUu = var1;
      this.VVuuUN = var2;
      this.vuuuNvNuv = this.C00OOC00oO(this.vuuuNvNuv);
   }

   public void uUnuvNvvNU(float var1, float var2) {
      this.vNUvnnVnUvu = var1;
      this.uVUuuVnNVU = var2;
   }

   public void UuUVuuUu(float var1) {
      this.vuuuNvNuv = this.C00OOC00oO(var1);
   }

   public void UuUVuuUu(String var1) {
      this.nvUVNnuu = var1 == null ? "" : var1;
   }

   public float uUnuvNvvNU() {
      return this.vuuuNvNuv;
   }

   public String vVvUvVVuuNvV() {
      return this.nvUVNnuu;
   }

   public boolean uNNnnnuuuN() {
      return this.UuuNnUvUuv;
   }

   public boolean nuUnNvnuUu() {
      return this.UnUNVVVNuv;
   }

   public boolean VVuuUN() {
      return this.nUUVuvU;
   }

   public boolean vNUvnnVnUvu() {
      return this.UuuNnUvUuv || this.UnUNVVVNuv || this.nUUVuvU;
   }

   public boolean UuUVuuUu(float var1, float var2, int var3, vnvNNVNU var4) {
      if (var3 != 0) {
         return false;
      } else if (var4 == null || !var4.contains(var1, var2)) {
         return false;
      } else if (this.UuuNnUvUuv) {
         return true;
      } else {
         this.nUUVuvU = true;
         this.UnUNVVVNuv = false;
         this.vNVuvnUUnuUn = System.currentTimeMillis();
         this.UvnvNVnnnnNU = var1;
         this.uVUVnuvnuVuv = var1;
         this.NVNnnvnuunNv = this.vuuuNvNuv;
         return true;
      }
   }

   public boolean UuUVuuUu(float var1, float var2, boolean var3) {
      if (this.UuuNnUvUuv || this.uNNnnnuuuN != UVvNVvUUuUnN.NVnVnNnN.NUMERIC) {
         return false;
      } else if (!this.nUUVuvU && !this.UnUNVVVNuv) {
         return false;
      } else {
         if (!this.UnUNVVVNuv && Math.abs(var1 - this.UvnvNVnnnnNU) > 2.0F) {
            this.UnUNVVVNuv = true;
         }

         if (this.UnUNVVVNuv) {
            float var4 = var3 ? this.uVUuuVnNVU : this.vNUvnnVnUvu;
            float var5 = (var1 - this.uVUVnuvnuVuv) * var4;
            this.vuuuNvNuv = this.C00OOC00oO(this.NVNnnvnuunNv + var5);
            return true;
         } else {
            return false;
         }
      }
   }

   public boolean vVvUvVVuuNvV(float var1, float var2) {
      if (this.UuuNnUvUuv) {
         this.nUUVuvU = false;
         this.UnUNVVVNuv = false;
         return false;
      } else {
         boolean var3 = this.UnUNVVVNuv;
         if (this.nUUVuvU && !this.UnUNVVVNuv && System.currentTimeMillis() - this.vNVuvnUUnuUn < 600L) {
            this.UuuNnUvUuv = true;
            this.uVunuUNVVUUV = this.uNNnnnuuuN == UVvNVvUUuUnN.NVnVnNnN.NUMERIC ? C00OOC00oO(uUnuvNvvNU(this.vuuuNvNuv)) : this.nvUVNnuu;
            this.UNnVVNvvnVvU = System.currentTimeMillis();
         }

         this.nUUVuvU = false;
         this.UnUNVVVNuv = false;
         return var3;
      }
   }

   public boolean UuUVuuUu(char var1) {
      if (!this.UuuNnUvUuv) {
         return false;
      } else if (this.uNNnnnuuuN == UVvNVvUUuUnN.NVnVnNnN.NUMERIC) {
         if (var1 >= '0' && var1 <= '9' || var1 == '.' || var1 == ',' || var1 == '-') {
            if (var1 == '-' && !this.uVunuUNVVUUV.isEmpty()) {
               return true;
            }

            if ((var1 == '.' || var1 == ',') && this.uVunuUNVVUUV.contains(".")) {
               return true;
            }

            if (this.uVunuUNVVUUV.length() < 12) {
               this.uVunuUNVVUUV = this.uVunuUNVVUUV + (var1 == ',' ? '.' : var1);
               this.UNnVVNvvnVvU = System.currentTimeMillis();
            }
         }

         return true;
      } else {
         if (this.uVunuUNVVUUV.length() < 48 && (Character.isLetterOrDigit(var1) || var1 == ' ' || var1 == '_' || var1 == '-' || var1 == '.')) {
            this.uVunuUNVVUUV = this.uVunuUNVVUUV + var1;
            this.UNnVVNvvnVvU = System.currentTimeMillis();
         }

         return true;
      }
   }

   public boolean UuUVuuUu(int var1) {
      if (!this.UuuNnUvUuv) {
         return false;
      } else if (var1 == 256) {
         this.UuuNnUvUuv = false;
         this.uVunuUNVVUUV = "";
         return true;
      } else if (var1 == 257 || var1 == 335 || var1 == 258) {
         this.uVUuuVnNVU();
         return true;
      } else if (var1 == 259) {
         if (!this.uVunuUNVVUUV.isEmpty()) {
            this.uVunuUNVVUUV = this.uVunuUNVVUUV.substring(0, this.uVunuUNVVUUV.length() - 1);
            this.UNnVVNvvnVvU = System.currentTimeMillis();
         }

         return true;
      } else {
         return true;
      }
   }

   public void uVUuuVnNVU() {
      if (this.UuuNnUvUuv) {
         if (this.uNNnnnuuuN == UVvNVvUUuUnN.NVnVnNnN.NUMERIC) {
            try {
               float var1 = Float.parseFloat(this.uVunuUNVVUUV.replace(',', '.'));
               if (Float.isFinite(var1)) {
                  this.vuuuNvNuv = this.C00OOC00oO(var1);
               }
            } catch (NumberFormatException var2) {
            }
         } else {
            this.nvUVNnuu = this.uVunuUNVVUUV;
         }

         this.UuuNnUvUuv = false;
         this.uVunuUNVVUUV = "";
      }
   }

   public void vuuuNvNuv() {
      this.UuuNnUvUuv = false;
      this.uVunuUNVVUUV = "";
      this.nUUVuvU = false;
      this.UnUNVVVNuv = false;
   }

   public void UuUVuuUu(UnVNvNnU var1, nUvnuVnNUU var2, NUunUunuNV var3, vnvNNVNU var4, float var5, float var6) {
      boolean var7 = var4.contains(var5, var6);
      boolean var8 = var7 || this.UnUNVVVNuv || this.nUUVuvU;
      int var9 = this.UuuNnUvUuv
         ? NUunUunuNV.UuUVuuUu(var3.uVunuUNVVUUV(), 132)
         : NUunUunuNV.UuUVuuUu(var3.uVUuuVnNVU(), NUunUunuNV.UuUVuuUu(var3.UNnVVNvvnVvU(), 56), var8 ? 1.0F : 0.0F);
      var1.UuUVuuUu(var4.x(), var4.y(), var4.w(), var4.h(), var2.UuUVuuUu(6.0F), var9);
      if (!this.UuuNnUvUuv && this.uNNnnnuuuN == UVvNVvUUuUnN.NVnVnNnN.NUMERIC) {
         float var10 = Math.max(1.0E-4F, this.VVuuUN - this.nuUnNvnuUu);
         float var11 = Math.max(0.0F, Math.min(1.0F, (this.vuuuNvNuv - this.nuUnNvnuUu) / var10));
         var1.UuUVuuUu(var4.x(), var4.y(), var4.w() * var11, var4.h(), var2.UuUVuuUu(6.0F), NUunUunuNV.UuUVuuUu(var3.uVunuUNVVUUV(), var8 ? 80 : 48));
      }

      var1.UuUVuuUu(
         var4.x(),
         var4.y(),
         var4.w(),
         var4.h(),
         var2.UuUVuuUu(6.0F),
         this.UuuNnUvUuv
            ? NUunUunuNV.UuUVuuUu(var3.uVunuUNVVUUV(), 230)
            : NUunUunuNV.UuUVuuUu(var3.nvUVNnuu(), NUunUunuNV.UuUVuuUu(var3.uVunuUNVVUUV(), 122), var8 ? 1.0F : 0.0F),
         this.UuuNnUvUuv ? 1.0F : 0.6F
      );
      String var14 = this.UuuNnUvUuv
         ? this.uVunuUNVVUUV
         : (this.uNNnnnuuuN == UVvNVvUUuUnN.NVnVnNnN.NUMERIC ? C00OOC00oO(uUnuvNvvNU(this.vuuuNvNuv)) : this.nvUVNnuu);
      float var15 = nunvNNUnvU.UuUVuuUu(var2, vNvnnVvvVUu.UuUVuuUu, var14, 9.0F);
      int var12 = var3.uNnUnnuNUnNu() ? NUunUunuNV.UuUVuuUu(10, 10, 10, 255) : var3.NVNnnvnuunNv();
      nunvNNUnvU.UuUVuuUu(var1, var2, vNvnnVvvVUu.UuUVuuUu, var4.x() + (var4.w() - var15) * 0.5F, var4.y(), var4.h(), 9.0F, var14, var12);
      if (this.UuuNnUvUuv && (System.currentTimeMillis() - this.UNnVVNvvnVvU) / 500L % 2L == 0L) {
         float var13 = var4.x() + (var4.w() - var15) * 0.5F + var15 + var2.UuUVuuUu(1.5F);
         var1.UuUVuuUu(var13, var4.y() + var2.UuUVuuUu(3.0F), 1.0F, var4.h() - var2.UuUVuuUu(6.0F), 0.0F, NUunUunuNV.UuUVuuUu(var3.uVunuUNVVUUV(), 240));
      }
   }

   private float C00OOC00oO(float var1) {
      return !Float.isFinite(var1) ? this.vuuuNvNuv : Math.max(this.nuUnNvnuUu, Math.min(this.VVuuUN, var1));
   }

   private static String uUnuvNvvNU(float var0) {
      return String.format(Locale.ROOT, "%.3f", var0);
   }

   private static String C00OOC00oO(String var0) {
      if (var0 != null && var0.contains(".")) {
         int var1 = var0.length();

         while (var1 > 0 && var0.charAt(var1 - 1) == '0') {
            var1--;
         }

         if (var1 > 0 && var0.charAt(var1 - 1) == '.') {
            var1--;
         }

         return var0.substring(0, var1);
      } else {
         return var0;
      }
   }

   public static enum NVnVnNnN {
      NUMERIC,
      TEXT;
   }
}
