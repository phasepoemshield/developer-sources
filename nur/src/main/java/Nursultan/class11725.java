package Nursultan;

public class class11725 implements class09868 {
   public Object N_0;

   private boolean L(class09838 var1) {
      return var1 != null && var1.L() == class09870.ITALIC;
   }

   public class11725() {
      this.u();
   }

   private void u() {
   }

   private class09079 y(class09838 var1) {
      return class09079.N(var1.y()).orElse(class09079.REGULAR);
   }

   private float N(float var1, float var2) {
      return Math.max(1.0F, (float)Math.round(var1 * var2));
   }

   @Override
   public float N(String var1, float var2, class09838 var3) {
      float var4 = ((class09794)this.N_0).N();
      return N(var3).y(var1, this.N(var2, var4), this.y(var3), this.L(var3)) / var4;
   }

   @Override
   public float N(int var1, float var2, class09838 var3) {
      class09079 var4 = this.y(var3);
      boolean var5 = this.L(var3);
      float var6 = ((class09794)this.N_0).N();
      float var7 = this.N(var2, var6);

      return switch (var1) {
         case 9 -> (float)Math.round(N(var3).N(var7, var4, var5, 32) * 4.0F) / var6;
         case 10, 13 -> 0.0F;
         default -> (float)Math.round(N(var3).N(var7, var4, var5, var1)) / var6;
      };
   }

   private static class09093 N(class09838 var0) {
      class09093 var1 = class09080.N(var0.N());
      if (var1 == null) {
         throw new IllegalArgumentException("Unknown font family: " + var0.N());
      } else {
         return var1;
      }
   }

   public void N(class09794 var1) {
      this.N_0 = var1;
   }

   @Override
   public float N(float var1, class09838 var2) {
      float var3 = ((class09794)this.N_0).N();
      return N(var2).N(this.N(var1, var3), this.y(var2), this.L(var2)) / var3;
   }

   @Override
   public float N(int var1, int var2, float var3, class09838 var4) {
      float var5 = ((class09794)this.N_0).N();
      class09093 var6 = N(var4);
      class09079 var7 = this.y(var4);
      boolean var8 = this.L(var4);
      float var9 = this.N(var3, var5);
      float var10 = var6.N(var9, var7, var8, var1);
      float var11 = var6.N(var9, var7, var8, var1, var2);
      return (float)(Math.round(var10 + var11) - Math.round(var10)) / var5;
   }
}
