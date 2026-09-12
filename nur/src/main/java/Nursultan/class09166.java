package Nursultan;

import java.util.SplittableRandom;
import java.util.concurrent.ThreadLocalRandom;

public class class09166 {
   public Object N_0;
   public Object N_1;
   public Object N_2;
   public boolean N_init;

   public class09166() {
      this.R();
      this.N_0 = this.B();
   }

   private SplittableRandom B() {
      long var1 = System.nanoTime() ^ ThreadLocalRandom.current().nextLong() ^ (long)System.identityHashCode(this) << 32;
      return new SplittableRandom(this.N(var1));
   }

   public void y() {
      this.N_0 = this.B();
      this.N_1 = 0.0F;
      this.N_2 = 0.0F;
   }

   public float y(float var1, float var2) {
      if (var2 <= var1) {
         return var1;
      } else {
         double var3 = (((SplittableRandom)this.N_0).nextDouble() + ((SplittableRandom)this.N_0).nextDouble()) * 0.5;
         return var1 + (var2 - var1) * (float)var3;
      }
   }

   public float N(boolean var1, float var2) {
      float var4 = (var1 ? (Float)this.N_1 : (Float)this.N_2) * this.N(0.52F, 0.76F) + this.y(-var2, var2) * this.N(0.24F, 0.48F);
      var4 = Math.max(-var2, Math.min(var2, var4));
      if (var1) {
         this.N_1 = var4;
      } else {
         this.N_2 = var4;
      }

      return var4;
   }

   public boolean N(float var1) {
      return ((SplittableRandom)this.N_0).nextDouble() < (double)Math.max(0.0F, Math.min(1.0F, var1));
   }

   public float N(float var1, float var2) {
      return var2 <= var1 ? var1 : var1 + (var2 - var1) * (float)((SplittableRandom)this.N_0).nextDouble();
   }

   private long N(long var1) {
      var1 ^= var1 >>> 33;
      var1 *= -49064778989728563L;
      var1 ^= var1 >>> 33;
      var1 *= -4265267296055464877L;
      return var1 ^ var1 >>> 33;
   }

   public int N() {
      return ((SplittableRandom)this.N_0).nextBoolean() ? 1 : -1;
   }

   public int N(int var1, int var2) {
      return var2 <= var1 ? var1 : ((SplittableRandom)this.N_0).nextInt(var1, var2 + 1);
   }

   private void R() {
      if (!this.N_init) {
         this.N_init = true;
         this.N_1 = 0.0F;
         this.N_2 = 0.0F;
      }
   }
}
