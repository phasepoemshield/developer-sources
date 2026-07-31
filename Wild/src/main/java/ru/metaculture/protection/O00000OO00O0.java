package ru.metaculture.protection;

public class O00000OO00O0 extends O00000OO000O0O {
   public static boolean O00000000(double d, double e, int i, double f, double g) {
      int var9 = (int)O0000O00OO0OOO.O00000000((float)d, (float)e)[0];
      int var10 = (int)O0000O00OO0OOO.O00000000((float)d, (float)e)[1];
      if (O00000OO000O0O.O0000000000OO != null && O00000OO000O0O.O0000000000OO instanceof ColorSetting) {
         ColorSetting var11 = O00000OO000O0O.O0000000000OO;
         float var12 = O00000OO000O0O.O0000000000OO0;
         float var13 = O00000OO000O0O.O0000000000OOO;
         if (var12 != 0.0F || var13 != 0.0F) {
            float var14 = O00000OO00OO0O.O00000000(var12);
            float var15 = O00000OO00OO0O.O000000000(var14);
            float var16 = O00000OO00OO0O.O0000000000(var13);
            float var17 = 148.0F;
            if (O00000OO000O0O.O000000000O) {
               O00000OO00O0OO.O00000000(var11, var9, var10, var15, var16);
               if (WildClient.O00000000.O0000000000O00 != null) {
                  WildClient.O00000000.O0000000000O00.O0000000000();
               }

               return true;
            }

            if (O00000OO000O0O.O000000000O0) {
               O00000OO00O0OO.O00000000(var11, var10, var16);
               if (WildClient.O00000000.O0000000000O00 != null) {
                  WildClient.O00000000.O0000000000O00.O0000000000();
               }

               return true;
            }

            if (O00000OO000O0O.O000000000O00) {
               O00000OO00O0OO.O00000000(var11, var9, var15, var17);
               if (WildClient.O00000000.O0000000000O00 != null) {
                  WildClient.O00000000.O0000000000O00.O0000000000();
               }

               return true;
            }
         }
      }

      if (O00000OO000O0O.O000000000O0O != null) {
         NumberSetting var18 = O00000OO000O0O.O000000000O0O;
         float var19 = (var9 - O00000OO000O0O.O000000000O0OO) / O00000OO000O0O.O000000000OO0;
         var19 = Math.max(0.0F, Math.min(1.0F, var19));
         var18.O00000000000 = var18.O000000000000 + (var18.O0000000000000 - var18.O000000000000) * var19;
         if (WildClient.O00000000.O0000000000O00 != null) {
            WildClient.O00000000.O0000000000O00.O0000000000();
         }

         return true;
      } else {
         return false;
      }
   }
}
