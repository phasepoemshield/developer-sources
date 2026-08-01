package ru.metaculture.protection;

import java.io.DataOutputStream;
import java.io.IOException;

final class O00000000O0OOO {
   private static final int O00000000 = 32;
   private final long[] O000000000 = new long[32];
   private final int[] O0000000000 = new int[32];
   private final int[] O00000000000 = new int[32];
   private final int[] O000000000000 = new int[32];
   private final long[] O0000000000000 = new long[32];
   private int O000000000000O;
   private int O00000000000O;
   private int O00000000000O0;

   void O00000000(long l, int i, int j, int k, long m) {
      int var8 = this.O000000000000O;
      this.O000000000[var8] = l;
      this.O0000000000[var8] = i;
      this.O00000000000[var8] = j;
      this.O000000000000[var8] = k;
      this.O0000000000000[var8] = m;
      this.O000000000000O = var8 + 1 & 31;
      if (this.O00000000000O < 32) {
         this.O00000000000O++;
      }

      this.O00000000000O0++;
   }

   int O00000000() {
      return this.O00000000000O0;
   }

   int O000000000() {
      return this.O00000000000O;
   }

   int O0000000000() {
      if (this.O00000000000O <= 0) {
         return 0;
      } else {
         int var1 = this.O000000000000O - 1 & 31;
         return this.O0000000000[var1];
      }
   }

   int O00000000000() {
      if (this.O00000000000O <= 0) {
         return 0;
      } else {
         int var1 = this.O000000000000O - 1 & 31;
         return this.O00000000000[var1];
      }
   }

   void O00000000(DataOutputStream dataOutputStream) throws IOException {
      dataOutputStream.writeInt(this.O00000000000O);
      int var2 = this.O000000000000O - this.O00000000000O & 31;

      for (int var3 = 0; var3 < this.O00000000000O; var3++) {
         int var4 = var2 + var3 & 31;
         dataOutputStream.writeLong(this.O000000000[var4]);
         dataOutputStream.writeInt(this.O0000000000[var4]);
         dataOutputStream.writeInt(this.O00000000000[var4]);
         dataOutputStream.writeInt(this.O000000000000[var4]);
         dataOutputStream.writeLong(this.O0000000000000[var4]);
      }
   }
}
