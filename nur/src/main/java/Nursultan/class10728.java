package Nursultan;

import com.google.common.collect.AbstractIterator;
import minecraft.class07209;
import minecraft.class07218;

public class class10728 extends AbstractIterator<class07209> {
   private final class07218 M;
   private int B;

   public class10728(int var1, int var2, int var3, int var4, int var5, int var6) {
      this.N = var1;
      this.y = var2;
      this.L = var3;
      this.u = var4;
      this.i = var5;
      this.R = var6;
      this.M = new class07218();
   }

   protected class07209 computeNext() {
      if (this.B == this.N) {
         return (class07209)this.endOfData();
      } else {
         int var1 = this.B % this.y;
         int var2 = this.B / this.y;
         int var3 = var2 % this.L;
         int var4 = var2 / this.L;
         this.B++;
         return this.M.N(this.u + var1, this.i + var3, this.R + var4);
      }
   }
}
