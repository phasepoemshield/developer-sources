package ru.metaculture.protection;

public final class NnNUnv {
   private long UuUVuuUu;
   private long C00OOC00oO = Long.MAX_VALUE;
   private long uUnuvNvvNU;
   private long vVvUvVVuuNvV;
   private boolean uNNnnnuuuN;

   public boolean UuUVuuUu() {
      return this.uNNnnnuuuN;
   }

   public long C00OOC00oO() {
      return System.currentTimeMillis() + this.UuUVuuUu;
   }

   public long uUnuvNvvNU() {
      return this.C00OOC00oO == Long.MAX_VALUE ? 0L : this.C00OOC00oO;
   }

   boolean UuUVuuUu(long var1) {
      return var1 >= this.uUnuvNvvNU;
   }

   void C00OOC00oO(long var1) {
      this.uUnuvNvvNU = var1 + 10000L;
   }

   void UuUVuuUu(long var1, long var3, long var5) {
      long var7 = var5 - var1;
      if (var7 >= 0L && var7 <= 5000L) {
         if (var5 - this.vVvUvVVuuNvV > 300000L) {
            this.vVvUvVVuuNvV = var5;
            this.C00OOC00oO = Long.MAX_VALUE;
         }

         if (var7 <= this.C00OOC00oO) {
            this.C00OOC00oO = var7;
            this.UuUVuuUu = var3 + var7 / 2L - var5;
            this.uNNnnnuuuN = true;
         }
      }
   }

   void vVvUvVVuuNvV() {
      this.UuUVuuUu = 0L;
      this.C00OOC00oO = Long.MAX_VALUE;
      this.uUnuvNvvNU = 0L;
      this.vVvUvVVuuNvV = 0L;
      this.uNNnnnuuuN = false;
   }
}
