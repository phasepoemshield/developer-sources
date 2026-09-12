package Nursultan;

record class09725(class09732 cov, class09714 c1, class09714 c2, int[][] adv) implements class09729 {
   public class09714 L() {
      return this.c2;
   }

   public int[][] u() {
      return this.adv;
   }

   public class09714 y() {
      return this.c1;
   }

   @Override
   public int N(int var1, int var2) {
      if (!this.cov.N(var1)) {
         return Integer.MIN_VALUE;
      } else {
         int var3 = this.c1.N(var1);
         int var4 = this.c2.N(var2);
         return var3 < this.adv.length && var4 < this.adv[var3].length ? this.adv[var3][var4] : 0;
      }
   }

   public class09732 N() {
      return this.cov;
   }
}
