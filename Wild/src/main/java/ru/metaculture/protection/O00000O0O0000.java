package ru.metaculture.protection;

public final class O00000O0O0000 {
   private final O0000O00O0OO O00000000 = new O0000O00O0OO();
   private String O000000000;
   private String O0000000000;
   private int O00000000000 = -1;
   private double O000000000000 = Double.NaN;

   public void O00000000(String string) {
      this.O00000000(string, Double.NaN);
   }

   public void O00000000(String string, double d) {
      if (string == null) {
         string = "";
      }

      if (this.O000000000 == null) {
         this.O000000000 = string;
         this.O0000000000 = null;
         this.O000000000000 = d;
         this.O00000000.O0000000000000(1.0);
      } else if (!string.equals(this.O000000000)) {
         if (this.O00000000.O000000000000() >= 0.999F) {
            this.O0000000000 = this.O000000000;
            if (!Double.isNaN(d) && !Double.isNaN(this.O000000000000)) {
               this.O00000000000 = d >= this.O000000000000 ? 1 : -1;
            }

            this.O00000000.O0000000000000(0.0);
         }

         this.O000000000 = string;
         if (!Double.isNaN(d)) {
            this.O000000000000 = d;
         }
      }

      this.O00000000.O00000000();
      this.O00000000.O00000000(1.0, 0.22F, O0000O00O0OO0O.O0000000000O0O, false);
   }

   public void O00000000(RenderManager o0000O00OO0O0, FontObject o0000O0O00O00O, float f, float g, float h, float i, float j, float k, float l, float m, int n) {
      String var12 = this.O000000000 == null ? "" : this.O000000000;
      float var13 = TextMeasureCache.O000000000(o0000O0O00O00O, var12, m);
      this.O0000000000(o0000O00OO0O0, o0000O0O00O00O, f, g, h, i, j, k - var13 * 0.5F, l, m, n);
   }

   public void O000000000(RenderManager o0000O00OO0O0, FontObject o0000O0O00O00O, float f, float g, float h, float i, float j, float k, float l, float m, int n) {
      this.O0000000000(o0000O00OO0O0, o0000O0O00O00O, f, g, h, i, j, k, l, m, n);
   }

   private void O0000000000(
      RenderManager o0000O00OO0O0, FontObject o0000O0O00O00O, float f, float g, float h, float i, float j, float k, float l, float m, int n
   ) {
      float var12 = this.O00000000.O000000000000();
      String var13 = this.O000000000 == null ? "" : this.O000000000;
      if (!(var12 >= 0.999F) && this.O0000000000 != null) {
         String var14 = this.O0000000000;
         int var15 = var13.length();
         int var16 = var14.length();
         int var17 = Math.min(var15, var16);
         int var18 = 0;

         while (var18 < var17 && var13.charAt(var18) == var14.charAt(var18)) {
            var18++;
         }

         int var19 = 0;

         while (var19 < var17 - var18 && var13.charAt(var15 - 1 - var19) == var14.charAt(var16 - 1 - var19)) {
            var19++;
         }

         String var20 = var13.substring(0, var18);
         String var21 = var13.substring(var18, var15 - var19);
         String var22 = var14.substring(var18, var16 - var19);
         String var23 = var13.substring(var15 - var19);
         float var24 = TextMeasureCache.O000000000(o0000O0O00O00O, var20, m);
         float var25 = TextMeasureCache.O000000000(o0000O0O00O00O, var21, m);
         if (!var20.isEmpty()) {
            o0000O00OO0O0.O00000000(o0000O0O00O00O, k, l, m, var20, n);
         }

         float var26 = k + var24;
         int var28 = O0000O000OO000.O00000000(n);
         int var29 = O0000O000OO000.O00000000(n, (int)(var28 * var12));
         int var30 = O0000O000OO000.O00000000(n, (int)(var28 * (1.0F - var12)));
         o0000O00OO0O0.O00000000(f, g, h, i, j, j, j, j);
         if (!var22.isEmpty()) {
            o0000O00OO0O0.O00000000(o0000O0O00O00O, var26, l - this.O00000000000 * m * var12, m, var22, var30);
         }

         if (!var21.isEmpty()) {
            o0000O00OO0O0.O00000000(o0000O0O00O00O, var26, l + this.O00000000000 * m * (1.0F - var12), m, var21, var29);
         }

         o0000O00OO0O0.O0000000000000();
         if (!var23.isEmpty()) {
            o0000O00OO0O0.O00000000(o0000O0O00O00O, var26 + var25, l, m, var23, n);
         }
      } else {
         o0000O00OO0O0.O00000000(o0000O0O00O00O, k, l, m, var13, n);
      }
   }
}
