package ru.metaculture.protection;

import java.io.DataOutputStream;
import java.io.IOException;

final class UNUNvUUUu {
   private static final int UuUVuuUu = 32;
   private final long[] C00OOC00oO = new long[32];
   private final int[] uUnuvNvvNU = new int[32];
   private final int[] vVvUvVVuuNvV = new int[32];
   private final int[] uNNnnnuuuN = new int[32];
   private final long[] nuUnNvnuUu = new long[32];
   private int VVuuUN;
   private int vNUvnnVnUvu;
   private int uVUuuVnNVU;

   void UuUVuuUu(long var1, int var3, int var4, int var5, long var6) {
      int var8 = this.VVuuUN;
      this.C00OOC00oO[var8] = var1;
      this.uUnuvNvvNU[var8] = var3;
      this.vVvUvVVuuNvV[var8] = var4;
      this.uNNnnnuuuN[var8] = var5;
      this.nuUnNvnuUu[var8] = var6;
      this.VVuuUN = var8 + 1 & 31;
      if (this.vNUvnnVnUvu < 32) {
         this.vNUvnnVnUvu++;
      }

      this.uVUuuVnNVU++;
   }

   int UuUVuuUu() {
      return this.uVUuuVnNVU;
   }

   int C00OOC00oO() {
      return this.vNUvnnVnUvu;
   }

   int uUnuvNvvNU() {
      if (this.vNUvnnVnUvu <= 0) {
         return 0;
      } else {
         int var1 = this.VVuuUN - 1 & 31;
         return this.uUnuvNvvNU[var1];
      }
   }

   int vVvUvVVuuNvV() {
      if (this.vNUvnnVnUvu <= 0) {
         return 0;
      } else {
         int var1 = this.VVuuUN - 1 & 31;
         return this.vVvUvVVuuNvV[var1];
      }
   }

   void UuUVuuUu(DataOutputStream var1) throws IOException {
      var1.writeInt(this.vNUvnnVnUvu);
      int var2 = this.VVuuUN - this.vNUvnnVnUvu & 31;

      for (int var3 = 0; var3 < this.vNUvnnVnUvu; var3++) {
         int var4 = var2 + var3 & 31;
         var1.writeLong(this.C00OOC00oO[var4]);
         var1.writeInt(this.uUnuvNvvNU[var4]);
         var1.writeInt(this.vVvUvVVuuNvV[var4]);
         var1.writeInt(this.uNNnnnuuuN[var4]);
         var1.writeLong(this.nuUnNvnuUu[var4]);
      }
   }
}
