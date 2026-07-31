package ru.metaculture.protection;

public class O000000O0O00O extends O000000O0O0000 {
   public static boolean O00000000;
   public static boolean O000000000;
   public static float O0000000000;
   public static float O00000000000;

   @EventHandler
   public void O00000000(O0000000O0OO0O o0000000O0OO0O) {
      if (O00000000) {
         this.O00000000(o0000000O0OO0O.O0000000000(), o0000000O0OO0O.O00000000000());
         o0000000O0OO0O.O000000000();
      }
   }

   @EventHandler
   public void O00000000(O0000000O0OOOO o0000000O0OOOO) {
      if (O00000000) {
         o0000000O0OOOO.O00000000(O0000000000);
         o0000000O0OOOO.O000000000(O00000000000);
      } else {
         O0000000000 = o0000000O0OOOO.O0000000000();
         O00000000000 = o0000000O0OOOO.O00000000000();
      }
   }

   private void O00000000(double d, double e) {
      O00000000000 = O0000O00OO0OO0.O00000000000OO((float)(O00000000000 + e * 0.15), -90.0F, 90.0F);
      O0000000000 = (float)(O0000000000 + d * 0.15);
   }
}
