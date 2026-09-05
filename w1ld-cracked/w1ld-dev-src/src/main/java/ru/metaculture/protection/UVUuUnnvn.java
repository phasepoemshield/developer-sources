package ru.metaculture.protection;

public class UVUuUnnvn {
   private long UuUVuuUu = -1L;

   public UVUuUnnvn() {
      this.UuUVuuUu = System.currentTimeMillis();
   }

   public boolean UuUVuuUu(double var1) {
      return System.currentTimeMillis() - this.UuUVuuUu >= var1;
   }

   public boolean UuUVuuUu(boolean var1, double var2) {
      return var1 || this.UuUVuuUu(var2);
   }

   public long UuUVuuUu() {
      return this.UuUVuuUu;
   }

   public void C00OOC00oO() {
      this.UuUVuuUu = System.currentTimeMillis();
   }

   public long uUnuvNvvNU() {
      return System.currentTimeMillis() - this.UuUVuuUu;
   }

   public long vVvUvVVuuNvV() {
      return System.nanoTime() / 1000000L;
   }

   public void UuUVuuUu(long var1) {
      this.UuUVuuUu = var1;
   }
}
