package ru.metaculture.protection;

public class O00000OO000OO extends O00000OO000O0O {
   public static boolean O00000000(char c, int i) {
      if (O00000OO000O0O.O000000000O00O != null) {
         if (c == '\b') {
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

         if (c >= ' ' && c != 127) {
            if (O00000OO000O0O.O000000000O00O.O000000000000.length() < 16) {
               O00000OO000O0O.O000000000O00O.O000000000000 = O00000OO000O0O.O000000000O00O.O000000000000 + c;
               if (WildClient.O00000000.O0000000000O00 != null) {
                  WildClient.O00000000.O0000000000O00.O0000000000();
               }
            }

            return true;
         }
      }

      if (O00000OO000O0O.O000000000OO0O) {
         if (c == '\b') {
            return true;
         }

         if (c >= ' ' && c != 127 && (c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z' || c >= '0' && c <= '9' || c == ' ')) {
            if (O00000OO000O0O.O000000000OO00.length() < 50) {
               O00000OO000O0O.O000000000OO00 = O00000OO000O0O.O000000000OO00 + c;
            }

            return true;
         }
      }

      return false;
   }
}
