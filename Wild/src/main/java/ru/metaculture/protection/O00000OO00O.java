package ru.metaculture.protection;

public class O00000OO00O extends O00000OO000O0O {
   public static boolean O00000000(int i, int j, int k) {
      boolean var3 = (k & 2) != 0;
      if (var3 && i == 70) {
         O00000OO000O0O.O000000000OO0O = !O00000OO000O0O.O000000000OO0O;
         if (!O00000OO000O0O.O000000000OO0O && O00000OO000O0O.O000000000OO00 == null) {
            O00000OO000O0O.O000000000OO00 = "";
         }

         return true;
      } else if (O00000OO000O0O.O000000000O0O0 != null) {
         if (i == 256) {
            O00000OO000O0O.O000000000O0O0.O0000000000O = false;
            O00000OO000O0O.O000000000O0O0 = null;
         } else if (i == 261) {
            O00000OO000O0O.O000000000O0O0.O000000000000 = -1;
            O00000OO000O0O.O000000000O0O0.O0000000000O = false;
            O00000OO000O0O.O0000000000(O00000OO000O0O.O000000000O0O0).O00000000(0.0, 0.2F, O0000O0O00.O000000000O00);
            O00000OO000O0O.O000000000O0O0 = null;
            if (WildClient.O00000000.O0000000000O00 != null) {
               WildClient.O00000000.O0000000000O00.O0000000000();
            }
         } else {
            O00000OO000O0O.O000000000O0O0.O000000000000 = i;
            O00000OO000O0O.O000000000O0O0.O0000000000O = false;
            O00000OO000O0O.O0000000000(O00000OO000O0O.O000000000O0O0).O00000000(1.0, 0.2F, O0000O0O00.O000000000O00);
            O00000OO000O0O.O000000000O0O0 = null;
            if (WildClient.O00000000.O0000000000O00 != null) {
               WildClient.O00000000.O0000000000O00.O0000000000();
            }
         }

         return true;
      } else if (O00000OO000O0O.O000000000O000 != null) {
         if (i == 256) {
            O00000OO000O0O.O000000000O000.O000000000000O = false;
            O00000OO000O0O.O000000000O000 = null;
         } else if (i == 261) {
            O00000OO000O0O.O000000000O000.O00000000000 = -1;
            O00000OO000O0O.O000000000O000.O000000000000O = false;
            O00000OO000O0O.O000000000O000 = null;
            if (WildClient.O00000000.O0000000000O00 != null) {
               WildClient.O00000000.O0000000000O00.O0000000000();
            }
         } else {
            O00000OO000O0O.O000000000O000.O00000000000 = i;
            O00000OO000O0O.O000000000O000.O000000000000O = false;
            O00000OO000O0O.O000000000O000 = null;
            if (WildClient.O00000000.O0000000000O00 != null) {
               WildClient.O00000000.O0000000000O00.O0000000000();
            }
         }

         return true;
      } else {
         if (O00000OO000O0O.O000000000O00O != null) {
            if (i == 256) {
               O00000OO000O0O.O000000000O00O.O00000000000O = false;
               O00000OO000O0O.O000000000O00O = null;
               if (WildClient.O00000000.O0000000000O00 != null) {
                  WildClient.O00000000.O0000000000O00.O0000000000();
               }

               return true;
            }

            if (i == 259) {
               if (!O00000OO000O0O.O000000000O00O.O000000000000.isEmpty()) {
                  O00000OO000O0O.O000000000O00O.O000000000000 = O00000OO000O0O.O000000000O00O
                     .O000000000000
                     .substring(0, O00000OO000O0O.O000000000O00O.O000000000000.length() - 1);
                  if (WildClient.O00000000.O0000000000O00 != null) {
                     WildClient.O00000000.O0000000000O00.O0000000000();
                  }
               }

               return true;
            }
         }

         if (O00000OO000O0O.O000000000OO0O) {
            if (i == 256) {
               O00000OO000O0O.O000000000OO0O = false;
               O00000OO000O0O.O000000000OO00 = "";
               return true;
            }

            if (i == 261) {
               O00000OO000O0O.O000000000OO00 = "";
               return true;
            }

            if (i == 259) {
               if (O00000OO000O0O.O000000000OO00 != null && !O00000OO000O0O.O000000000OO00.isEmpty()) {
                  if (var3) {
                     int var4 = O00000OO000O0O.O000000000OO00.lastIndexOf(32);
                     O00000OO000O0O.O000000000OO00 = var4 < 0 ? "" : O00000OO000O0O.O000000000OO00.substring(0, var4);
                  } else {
                     O00000OO000O0O.O000000000OO00 = O00000OO000O0O.O000000000OO00.substring(0, O00000OO000O0O.O000000000OO00.length() - 1);
                  }

                  return true;
               }

               O00000OO000O0O.O000000000OO00 = "";
               return true;
            }
         }

         return false;
      }
   }
}
