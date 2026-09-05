package ru.metaculture.protection;

public final class unVnUnVv {
   private static final long UuUVuuUu = -3750763034362895579L;
   private static final long C00OOC00oO = 1099511628211L;
   private long uUnuvNvvNU;

   public unVnUnVv() {
      this.UuUVuuUu(System.nanoTime() ^ UuUVuuUu("wild-1.21.8-1787661348375"));
   }

   public void UuUVuuUu(long var1) {
      this.uUnuvNvvNU = -3750763034362895579L;
      this.C00OOC00oO(var1);
   }

   public void UuUVuuUu(int var1) {
      this.uUnuvNvvNU ^= var1 & 255L;
      this.uUnuvNvvNU *= 1099511628211L;
      this.uUnuvNvvNU ^= var1 >>> 8 & 255L;
      this.uUnuvNvvNU *= 1099511628211L;
      this.uUnuvNvvNU ^= var1 >>> 16 & 255L;
      this.uUnuvNvvNU *= 1099511628211L;
      this.uUnuvNvvNU ^= var1 >>> 24 & 255L;
      this.uUnuvNvvNU *= 1099511628211L;
   }

   public void C00OOC00oO(long var1) {
      this.UuUVuuUu((int)var1);
      this.UuUVuuUu((int)(var1 >>> 32));
   }

   public void UuUVuuUu(float var1) {
      this.UuUVuuUu(Float.floatToRawIntBits(var1));
   }

   public long UuUVuuUu() {
      return this.uUnuvNvvNU;
   }

   static long UuUVuuUu(String var0) {
      long var1 = -3750763034362895579L;
      if (var0 == null) {
         return var1;
      } else {
         for (int var3 = 0; var3 < var0.length(); var3++) {
            var1 ^= var0.charAt(var3);
            var1 *= 1099511628211L;
         }

         return var1;
      }
   }
}
