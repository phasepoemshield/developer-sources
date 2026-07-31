package ru.metaculture.protection;

public class O00000OO00O0O extends O00000OO000O0O {
   public static boolean O00000000(RenderManager o0000O00OO0O0, double d, double e, int i) {
      int var6 = (int)O0000O00OO0OOO.O00000000((float)d, (float)e)[0];
      int var7 = (int)O0000O00OO0OOO.O00000000((float)d, (float)e)[1];
      O0000O00OOO var8 = new O0000O00OOO(O00000OO000O0O.O00000000);
      O00000OO000O0O.O00000000O000 = (int)O0000O00OO0OO0.O00000000000OO(
         O00000OO000O0O.O00000000O000, 0.0F, O0000O00OO0OOO.O00000000(var8.O00000000()) - O00000OO000O0O.O00000000O000O
      );
      O00000OO000O0O.O00000000O0000 = (int)O0000O00OO0OO0.O00000000000OO(
         O00000OO000O0O.O00000000O0000, 0.0F, O0000O00OO0OOO.O00000000(var8.O000000000()) - O00000OO000O0O.O00000000O00O
      );
      if (!O00000OO000O0O.O00000000O00) {
         float var9 = O00000OO000O0O.O00000000O000 + 111.885F;
         float var10 = O00000OO000O0O.O00000000O0000 + 6.185F;
         float var11 = 124.04F;
         float var12 = 21.325F;
         if (i == 0 && O00000OO00OOO.O00000000(var6, var7, var9, var10, var11, var12)) {
            O00000OO000O0O.O000000000OO0O = true;
            return true;
         }

         O00000OO00O0O0.O00000000(var6, var7);
         if (O00000OO00O0OO.O00000000(var6, var7, i)) {
            return true;
         }

         if (O00000OO00OO.O00000000(o0000O00OO0O0, var6, var7, i)) {
            return true;
         }

         O00000OO0O.O00000000(d, e, i);
      }

      if (O00000OO000O0O.O000000000O000 != null && i >= 0 && i <= 2) {
         int var13 = -100 - i;
         O00000OO000O0O.O000000000O000.O00000000000 = var13;
         O00000OO000O0O.O000000000O000.O000000000000O = false;
         O00000OO000O0O.O000000000O000 = null;
         return true;
      } else {
         return false;
      }
   }
}
