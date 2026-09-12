package Nursultan;

record class09732(int[] glyphs) {
   boolean N(int var1) {
      int var2 = 0;
      int var3 = this.glyphs.length - 1;

      while (var2 <= var3) {
         int var4 = var2 + var3 >>> 1;
         if (this.glyphs[var4] < var1) {
            var2 = var4 + 1;
         } else {
            if (this.glyphs[var4] <= var1) {
               return true;
            }

            var3 = var4 - 1;
         }
      }

      return false;
   }

   public int[] N() {
      return this.glyphs;
   }
}
