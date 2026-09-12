package Nursultan;

record class09714(int[] start, int[] end, int[] cls) {
   public int[] L() {
      return this.cls;
   }

   public int[] y() {
      return this.end;
   }

   public int[] N() {
      return this.start;
   }

   int N(int var1) {
      int var2 = 0;
      int var3 = this.start.length - 1;

      while (var2 <= var3) {
         int var4 = var2 + var3 >>> 1;
         if (var1 < this.start[var4]) {
            var3 = var4 - 1;
         } else {
            if (var1 <= this.end[var4]) {
               return this.cls[var4];
            }

            var2 = var4 + 1;
         }
      }

      return 0;
   }
}
