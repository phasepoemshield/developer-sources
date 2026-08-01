package ru.metaculture.protection;

import java.util.ArrayList;

public final class O0000O00000OOO {
   private static final float O00000000 = 170.0F;
   private String O000000000 = "";
   private final ArrayList<Long> O0000000000 = new ArrayList<>();
   private final ArrayList<O0000O00000OOO.W333> O00000000000 = new ArrayList<>();

   public boolean O00000000() {
      return !this.O00000000000.isEmpty();
   }

   public void O00000000(
      RenderManager o0000O00OO0O0,
      O0000O00000 o0000O00000,
      FontObject o0000O0O00O00O,
      String string,
      float f,
      float g,
      float h,
      float i,
      int j,
      boolean bl,
      int k,
      long l
   ) {
      this.O00000000(string, o0000O0O00O00O, f, i, l);
      float var14 = f;

      for (int var15 = 0; var15 < string.length(); var15++) {
         String var16 = String.valueOf(string.charAt(var15));
         float var17 = O0000O00000OO.O00000000(o0000O0O00O00O, var16, i);
         long var18 = var15 < this.O0000000000.size() ? this.O0000000000.get(var15) : 0L;
         float var20 = (float)(l - var18) / 170.0F;
         float var21 = 0.0F;
         int var22 = j;
         if (var20 < 1.0F) {
            float var23 = 1.0F - (1.0F - var20) * (1.0F - var20);
            var21 = (1.0F - var23) * o0000O00000.O00000000(7.0F);
            var22 = ColorScheme.O00000000(j, Math.round(255.0F * var23));
         }

         O0000O00000OO.O00000000(o0000O00OO0O0, o0000O00000, o0000O0O00O00O, var14, g + var21, h, i, var16, var22);
         var14 += var17;
      }

      if (bl) {
         O0000O00000OO.O00000000(o0000O00OO0O0, o0000O00000, o0000O0O00O00O, var14, g, h, i, "|", k);
      }

      for (int var24 = this.O00000000000.size() - 1; var24 >= 0; var24--) {
         O0000O00000OOO.W333 var25 = this.O00000000000.get(var24);
         float var26 = (float)(l - var25.born()) / 170.0F;
         if (var26 >= 1.0F) {
            this.O00000000000.remove(var24);
         } else {
            float var27 = 1.0F - (1.0F - var26) * (1.0F - var26);
            O0000O00000OO.O00000000(
               o0000O00OO0O0,
               o0000O00000,
               o0000O0O00O00O,
               var25.x(),
               g + var27 * o0000O00000.O00000000(8.0F),
               h,
               i,
               var25.ch(),
               ColorScheme.O00000000(j, Math.round(255.0F * (1.0F - var27)))
            );
         }
      }
   }

   private void O00000000(String string, FontObject o0000O0O00O00O, float f, float g, long l) {
      if (!string.equals(this.O000000000)) {
         int var7 = 0;
         int var8 = Math.min(this.O000000000.length(), string.length());

         while (var7 < var8 && this.O000000000.charAt(var7) == string.charAt(var7)) {
            var7++;
         }

         float var9 = f + O0000O00000OO.O00000000(o0000O0O00O00O, this.O000000000.substring(0, var7), g);

         for (int var10 = var7; var10 < this.O000000000.length(); var10++) {
            String var11 = String.valueOf(this.O000000000.charAt(var10));
            this.O00000000000.add(new O0000O00000OOO.W333(var11, var9, l));
            var9 += O0000O00000OO.O00000000(o0000O0O00O00O, var11, g);
         }

         while (this.O0000000000.size() > var7) {
            this.O0000000000.remove(this.O0000000000.size() - 1);
         }

         while (this.O0000000000.size() < string.length()) {
            this.O0000000000.add(l);
         }

         this.O000000000 = string;
      }
   }

   record W333(String ch, float x, long born) {
   }
}
