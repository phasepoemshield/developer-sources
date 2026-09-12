package Nursultan;

final class class09910 {
   private class09915 N;
   private boolean y;
   private int L;

   class09910() {
      this.N = class09915.N;
   }

   int N(class09915 var1) {
      class09915 var2 = var1 == null ? class09915.N : var1;
      if (!this.y || !this.N.equals(var2)) {
         this.N = var2;
         this.y = true;
         this.L++;
      }

      return this.L;
   }
}
