package ru.metaculture.protection;

import java.util.Arrays;

public final class UUnUvUV {
   public static final byte UuUVuuUu = -1;
   private long[] C00OOC00oO;
   private byte[] uUnuvNvvNU;
   private int vVvUvVVuuNvV;
   private int uNNnnnuuuN;
   private int nuUnNvnuUu;

   public UUnUvUV() {
      this.UuUVuuUu(16);
   }

   private void UuUVuuUu(int var1) {
      this.C00OOC00oO = new long[var1];
      this.uUnuvNvvNU = new byte[var1];
      Arrays.fill(this.uUnuvNvvNU, (byte)-1);
      this.vVvUvVVuuNvV = var1 - 1;
      this.nuUnNvnuUu = var1 - (var1 >> 2) - (var1 >> 3);
      this.uNNnnnuuuN = 0;
   }

   public int UuUVuuUu() {
      return this.uNNnnnuuuN;
   }

   public int C00OOC00oO() {
      return this.C00OOC00oO.length;
   }

   public long[] uUnuvNvvNU() {
      return this.C00OOC00oO;
   }

   public byte[] vVvUvVVuuNvV() {
      return this.uUnuvNvvNU;
   }

   private int uUnuvNvvNU(long var1) {
      long var3 = var1 * -7046029254386353131L;
      var3 ^= var3 >>> 32;
      return (int)var3 & this.vVvUvVVuuNvV;
   }

   public byte UuUVuuUu(long var1) {
      int var3 = this.uUnuvNvvNU(var1);

      while (true) {
         byte var4 = this.uUnuvNvvNU[var3];
         if (var4 == -1) {
            return -1;
         }

         if (this.C00OOC00oO[var3] == var1) {
            return var4;
         }

         var3 = var3 + 1 & this.vVvUvVVuuNvV;
      }
   }

   public boolean UuUVuuUu(long var1, byte var3) {
      int var4 = this.uUnuvNvvNU(var1);

      while (true) {
         byte var5 = this.uUnuvNvvNU[var4];
         if (var5 == -1) {
            this.C00OOC00oO[var4] = var1;
            this.uUnuvNvvNU[var4] = var3;
            this.uNNnnnuuuN++;
            if (this.uNNnnnuuuN >= this.nuUnNvnuUu) {
               this.nuUnNvnuUu();
            }

            return true;
         }

         if (this.C00OOC00oO[var4] == var1) {
            if (var5 == var3) {
               return false;
            }

            this.uUnuvNvvNU[var4] = var3;
            return true;
         }

         var4 = var4 + 1 & this.vVvUvVVuuNvV;
      }
   }

   public boolean C00OOC00oO(long var1) {
      int var3 = this.uUnuvNvvNU(var1);

      while (true) {
         int var4 = this.uUnuvNvvNU[var3];
         if (var4 == -1) {
            return false;
         }

         if (this.C00OOC00oO[var3] == var1) {
            this.uUnuvNvvNU[var3] = -1;
            this.uNNnnnuuuN--;
            var4 = var3;
            int var5 = var3;

            while (true) {
               var5 = var5 + 1 & this.vVvUvVVuuNvV;
               byte var6 = this.uUnuvNvvNU[var5];
               if (var6 == -1) {
                  return true;
               }

               int var7 = this.uUnuvNvvNU(this.C00OOC00oO[var5]);
               if ((var5 - var7 & this.vVvUvVVuuNvV) >= (var5 - var4 & this.vVvUvVVuuNvV)) {
                  this.C00OOC00oO[var4] = this.C00OOC00oO[var5];
                  this.uUnuvNvvNU[var4] = var6;
                  this.uUnuvNvvNU[var5] = -1;
                  var4 = var5;
               }
            }
         }

         var3 = var3 + 1 & this.vVvUvVVuuNvV;
      }
   }

   public void uNNnnnuuuN() {
      if (this.uNNnnnuuuN != 0) {
         Arrays.fill(this.uUnuvNvvNU, (byte)-1);
         this.uNNnnnuuuN = 0;
      }
   }

   private void nuUnNvnuUu() {
      long[] var1 = this.C00OOC00oO;
      byte[] var2 = this.uUnuvNvvNU;
      this.UuUVuuUu(var1.length << 1);

      for (int var3 = 0; var3 < var2.length; var3++) {
         byte var4 = var2[var3];
         if (var4 != -1) {
            this.C00OOC00oO(var1[var3], var4);
         }
      }
   }

   private void C00OOC00oO(long var1, byte var3) {
      int var4 = this.uUnuvNvvNU(var1);

      while (this.uUnuvNvvNU[var4] != -1) {
         var4 = var4 + 1 & this.vVvUvVVuuNvV;
      }

      this.C00OOC00oO[var4] = var1;
      this.uUnuvNvvNU[var4] = var3;
      this.uNNnnnuuuN++;
   }
}
