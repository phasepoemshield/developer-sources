package Nursultan;

import minecraft.class04995;
import minecraft.class07438;

public class class11078 {
   public Object N_0;
   public Object N_1;
   public Object N_2;
   public Object N_3;
   public boolean N_init;

   public class11078() {
      this.y();
      this.N_3 = 1;
   }

   private void y() {
      if (!this.N_init) {
         this.N_init = true;
         this.N_0 = 0L;
         this.N_1 = 0.0F;
         this.N_2 = 0.0F;
         this.N_3 = 0;
      }
   }

   public class11499 N(class11087 var1, class07438 var2, class11499 var3, class11499 var4, boolean var5, boolean var6, boolean var7, boolean var8) {
      if (var3 != null && var4 != null && var5 && !var6 && !var8) {
         long var10 = System.currentTimeMillis();
         this.N(var10, var7);
         float var12 = var4.y();
         float var13 = var4.R();
         float var14 = var7 ? 1.45F : 1.0F;

         for (float[] var18 : new float[][]{
            {(Float)this.N_1 * var14, (Float)this.N_2 * var14},
            {(Float)this.N_1 * 0.74F * var14, -(Float)this.N_2 * 0.92F},
            {-(Float)this.N_1 * 0.62F, (Float)this.N_2 * 0.72F * var14},
            {(float)((Integer)this.N_3).intValue() * 0.38F, (float)(-(Integer)this.N_3) * 0.16F},
            {(float)(-(Integer)this.N_3) * 0.31F, (float)((Integer)this.N_3).intValue() * 0.18F},
            {(Float)this.N_1 * 1.38F, (Float)this.N_2 * 0.44F},
            {-(Float)this.N_1 * 0.92F, -(Float)this.N_2 * 1.16F}
         }) {
            class11499 var19 = new class11499(var12 + var18[0], class04995.N(var13 + var18[1], -90.0F, 90.0F));
            if (var1.N(var2, var19)) {
               return var19;
            }
         }

         return var4;
      } else {
         return var4;
      }
   }

   public void N() {
      this.N_0 = 0L;
      this.N_1 = 0.0F;
      this.N_2 = 0.0F;
      this.N_3 = 1;
   }

   private void N(long var1, boolean var3) {
      if (var1 >= (Long)this.N_0) {
         this.N_3 = -(Integer)this.N_3;
         float var4 = var3 ? 1.0F : 0.0F;
         this.N_1 = (float)((Integer)this.N_3).intValue() * class09139.N((double)(0.36F + var4 * 0.14F), (double)(1.18F + var4 * 0.36F));
         this.N_2 = (Math.random() > 0.5 ? 1.0F : -1.0F) * class09139.N(0.12F, (double)(0.44F + var4 * 0.18F));
         this.N_0 = var1 + (long)class09139.N(38.0, var3 ? 92.0 : 132.0);
      }
   }
}
