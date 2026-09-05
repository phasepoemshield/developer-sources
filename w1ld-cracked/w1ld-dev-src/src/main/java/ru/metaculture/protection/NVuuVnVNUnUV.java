package ru.metaculture.protection;

final class NVuuVnVNUnUV<T> {
   private final T UuUVuuUu;
   private final T C00OOC00oO;
   private T uUnuvNvvNU;

   NVuuVnVNUnUV(T var1, T var2) {
      if (var1 != null && var2 != null && var1 != var2) {
         this.UuUVuuUu = (T)var1;
         this.C00OOC00oO = (T)var2;
         this.uUnuvNvvNU = (T)var1;
      } else {
         throw new IllegalArgumentException("ChinaHat uniform values must be distinct");
      }
   }

   T UuUVuuUu() {
      return this.uUnuvNvvNU;
   }

   void C00OOC00oO() {
      this.uUnuvNvvNU = this.uUnuvNvvNU == this.UuUVuuUu ? this.C00OOC00oO : this.UuUVuuUu;
   }
}
