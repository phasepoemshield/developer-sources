package Nursultan;

import com.google.common.collect.AbstractIterator;
import minecraft.class07209;
import minecraft.class07218;

public class class10729 extends AbstractIterator<class07209> {
   private final class07218 B;
   private int Z;
   private int z;
   private int U;
   private int E;
   private int W;
   private boolean m;

   public class10729(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      this.N = var1;
      this.y = var2;
      this.L = var3;
      this.u = var4;
      this.i = var5;
      this.R = var6;
      this.M = var7;
      this.B = new class07218();
   }

   protected class07209 computeNext() {
      if (this.m) {
         this.m = false;
         this.B.method_20788(this.N - (this.B.method_10260() - this.N));
         return this.B;
      } else {
         class07218 var1;
         for (var1 = null; var1 == null; this.W++) {
            if (this.W > this.U) {
               this.E++;
               if (this.E > this.z) {
                  this.Z++;
                  if (this.Z > this.y) {
                     return (class07209)this.endOfData();
                  }

                  this.z = Math.min(this.L, this.Z);
                  this.E = -this.z;
               }

               this.U = Math.min(this.u, this.Z - Math.abs(this.E));
               this.W = -this.U;
            }

            int var2 = this.E;
            int var3 = this.W;
            int var4 = this.Z - Math.abs(var2) - Math.abs(var3);
            if (var4 <= this.i) {
               this.m = var4 != 0;
               var1 = this.B.N(this.R + var2, this.M + var3, this.N + var4);
            }
         }

         return var1;
      }
   }
}
