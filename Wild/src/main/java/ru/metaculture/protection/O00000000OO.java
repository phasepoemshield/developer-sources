package ru.metaculture.protection;

public final class O00000000OO {
   private static final long O00000000 = -3750763034362895579L;
   private static final long O000000000 = 1099511628211L;
   private long O0000000000;

   public O00000000OO() {
      this.O00000000(System.nanoTime() ^ O00000000("wild-1.21.8-1783538716222"));
   }

   public void O00000000(long l) {
      this.O0000000000 = -3750763034362895579L;
      this.O000000000(l);
   }

   public void O00000000(int i) {
      this.O0000000000 ^= i & 255L;
      this.O0000000000 *= 1099511628211L;
      this.O0000000000 ^= i >>> 8 & 255L;
      this.O0000000000 *= 1099511628211L;
      this.O0000000000 ^= i >>> 16 & 255L;
      this.O0000000000 *= 1099511628211L;
      this.O0000000000 ^= i >>> 24 & 255L;
      this.O0000000000 *= 1099511628211L;
   }

   public void O000000000(long l) {
      this.O00000000((int)l);
      this.O00000000((int)(l >>> 32));
   }

   public void O00000000(float f) {
      this.O00000000(Float.floatToRawIntBits(f));
   }

   public long O00000000() {
      return this.O0000000000;
   }

   static long O00000000(String string) {
      long var1 = -3750763034362895579L;
      if (string == null) {
         return var1;
      } else {
         for (int var3 = 0; var3 < string.length(); var3++) {
            var1 ^= string.charAt(var3);
            var1 *= 1099511628211L;
         }

         return var1;
      }
   }
}
