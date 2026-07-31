package ru.metaculture.protection;

public class O0000O0O00OO00 {
   public int O00000000(int i, int j, double d) {
      if (d < 0.0) {
         d = 0.0;
      }

      if (d > 1.0) {
         d = 1.0;
      }

      int var5 = i >> 24 & 0xFF;
      int var6 = j >> 24 & 0xFF;
      if (var5 == 0) {
         var5 = 255;
      }

      if (var6 == 0) {
         var6 = 255;
      }

      int var7 = (int)Math.round(var5 + (var6 - var5) * d);
      return var7 << 24 | O0000O000OO000.O00000000000(i, j, (float)d);
   }

   public int O00000000(int i, int j, int k) {
      return this.O00000000(i, j, k, 255);
   }

   public static int O00000000(int i, double d) {
      int var3 = (int)Math.round(d * 255.0);
      int var4 = i & 16777215;
      return var3 << 24 | var4;
   }

   public int O00000000(int i, int j, int k, int l) {
      return (l & 0xFF) << 24 | (i & 0xFF) << 16 | (j & 0xFF) << 8 | k & 0xFF;
   }

   public static int O000000000(int i, int j, int k, int l) {
      return (l & 0xFF) << 24 | (i & 0xFF) << 16 | (j & 0xFF) << 8 | k & 0xFF;
   }

   public static int O00000000(int i) {
      return i >>> 24 & 0xFF;
   }

   public static int O000000000(int i) {
      return i >>> 16 & 0xFF;
   }

   public static int O0000000000(int i) {
      return i >>> 8 & 0xFF;
   }

   public static int O00000000000(int i) {
      return i & 0xFF;
   }

   public static int O00000000(int i, int j, float f) {
      if (f <= 0.0F) {
         return i;
      } else if (f >= 1.0F) {
         return j;
      } else {
         int var4 = i >>> 24 & 0xFF;
         int var5 = j >>> 24 & 0xFF;
         int var6 = Math.round(var4 + (var5 - var4) * f);
         return (var6 & 0xFF) << 24 | O0000O000OO000.O00000000000(i, j, f);
      }
   }
}
