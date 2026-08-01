package ru.metaculture.protection;

public final class O00000OOOOOO00 {
   public boolean O00000000(O0000O000O0O0 o0000O000O0O0, int i) {
      if (o0000O000O0O0.O0000000OOO() != null) {
         o0000O000O0O0.O00000000(i);
         return true;
      } else if (o0000O000O0O0.O0000000OOO0() != null) {
         o0000O000O0O0.O000000000(i);
         return true;
      } else if (o0000O000O0O0.O0000000OOO00() != null) {
         o0000O000O0O0.O0000000000(i);
         return true;
      } else if (o0000O000O0O0.O000000O0O00O() != null) {
         this.O000000000000(o0000O000O0O0, i);
         return true;
      } else if (o0000O000O0O0.O000000O0O00OO() != null) {
         this.O0000000000000(o0000O000O0O0, i);
         return true;
      } else if (o0000O000O0O0.O0000000OOO000() != null) {
         this.O000000000(o0000O000O0O0, i);
         return true;
      } else if (o0000O000O0O0.O00000000OOO00()) {
         this.O00000000000(o0000O000O0O0, i);
         return true;
      } else if (o0000O000O0O0.O00000000OOO()) {
         this.O0000000000(o0000O000O0O0, i);
         return true;
      } else {
         return false;
      }
   }

   public boolean O00000000(O0000O000O0O0 o0000O000O0O0, char c) {
      if (o0000O000O0O0.O000000O0O00O() != null) {
         this.O000000000(o0000O000O0O0, c);
         return true;
      } else if (o0000O000O0O0.O000000O0O00OO() != null) {
         this.O0000000000(o0000O000O0O0, c);
         return true;
      } else if (o0000O000O0O0.O0000000OOO000() != null) {
         if (!Character.isISOControl(c)) {
            TextSetting var10000 = o0000O000O0O0.O0000000OOO000();
            var10000.O000000000000 = var10000.O000000000000 + c;
            o0000O000O0O0.O00000000O000O();
         }

         return true;
      } else if (o0000O000O0O0.O00000000OOO00()) {
         if (!Character.isISOControl(c)) {
            o0000O000O0O0.O000000000(c);
         }

         return true;
      } else if (o0000O000O0O0.O00000000OOO()) {
         if (!Character.isISOControl(c)) {
            o0000O000O0O0.O00000000(c);
         }

         return true;
      } else {
         return false;
      }
   }

   private void O000000000(O0000O000O0O0 o0000O000O0O0, int i) {
      if (i == 256 || i == 257) {
         o0000O000O0O0.O00000000((NumberSetting)null);
      } else if (i == 259 && !o0000O000O0O0.O0000000OOO000().O000000000000.isEmpty()) {
         String var3 = o0000O000O0O0.O0000000OOO000().O000000000000;
         o0000O000O0O0.O0000000OOO000().O000000000000 = var3.substring(0, var3.length() - 1);
         o0000O000O0O0.O00000000O000O();
      }
   }

   private void O0000000000(O0000O000O0O0 o0000O000O0O0, int i) {
      if (i == 256 || i == 257) {
         o0000O000O0O0.O00000000000O(false);
      } else if (i == 259) {
         o0000O000O0O0.O000000000O0();
      }
   }

   private void O00000000000(O0000O000O0O0 o0000O000O0O0, int i) {
      if (i == 256) {
         o0000O000O0O0.O000000000O000();
         o0000O000O0O0.O00000000000O0(false);
      } else if (i == 257) {
         o0000O000O0O0.O00000000000O0(false);
      } else if (i == 259) {
         o0000O000O0O0.O000000000O00O();
      }
   }

   private void O000000000000(O0000O000O0O0 o0000O000O0O0, int i) {
      ColorSetting var3 = o0000O000O0O0.O000000O0O00O();
      if (var3 != null) {
         if (i == 256) {
            o0000O000O0O0.O000000000000((ColorSetting)null);
            o0000O000O0O0.O0000000000000("");
         } else if (i != 257 && i != 258) {
            if (i == 259) {
               String var4 = o0000O000O0O0.O000000O0O00O0();
               if (var4 != null && !var4.isEmpty()) {
                  o0000O000O0O0.O0000000000000(var4.substring(0, var4.length() - 1));
               }
            }
         } else {
            this.O00000000(o0000O000O0O0, var3);
            o0000O000O0O0.O000000000000((ColorSetting)null);
            o0000O000O0O0.O0000000000000("");
         }
      }
   }

   private void O000000000(O0000O000O0O0 o0000O000O0O0, char c) {
      if (O00000000(c)) {
         String var3 = o0000O000O0O0.O000000O0O00O0();
         if (var3 == null) {
            var3 = "";
         }

         if (var3.length() < 8) {
            o0000O000O0O0.O0000000000000(var3 + Character.toUpperCase(c));
         }
      }
   }

   private void O0000000000000(O0000O000O0O0 o0000O000O0O0, int i) {
      ColorSetting var3 = o0000O000O0O0.O000000O0O00OO();
      if (var3 != null) {
         if (i == 256) {
            o0000O000O0O0.O0000000000000((ColorSetting)null);
            o0000O000O0O0.O000000000000O("");
         } else if (i != 257 && i != 258) {
            if (i == 259) {
               String var4 = o0000O000O0O0.O000000O0O0O();
               if (var4 != null && !var4.isEmpty()) {
                  o0000O000O0O0.O000000000000O(var4.substring(0, var4.length() - 1));
               }
            }
         } else {
            this.O000000000(o0000O000O0O0, var3);
            o0000O000O0O0.O0000000000000((ColorSetting)null);
            o0000O000O0O0.O000000000000O("");
         }
      }
   }

   private void O0000000000(O0000O000O0O0 o0000O000O0O0, char c) {
      if (c >= '0' && c <= '9') {
         String var3 = o0000O000O0O0.O000000O0O0O();
         if (var3 == null) {
            var3 = "";
         }

         if (var3.length() < 3) {
            o0000O000O0O0.O000000000000O(var3 + c);
         }
      }
   }

   private void O00000000(O0000O000O0O0 o0000O000O0O0, ColorSetting o0000000OOOO0O) {
      String var3 = o0000O000O0O0.O000000O0O00O0();
      if (var3 != null) {
         String var4 = var3.trim();
         if (var4.startsWith("#")) {
            var4 = var4.substring(1);
         }

         if (!var4.isEmpty()) {
            try {
               long var5 = Long.parseUnsignedLong(var4, 16);
               int var7;
               switch (var4.length()) {
                  case 3:
                     int var14 = ((int)(var5 >> 8) & 15) * 17;
                     int var16 = ((int)(var5 >> 4) & 15) * 17;
                     int var17 = ((int)var5 & 15) * 17;
                     int var18 = Math.round(o0000000OOOO0O.O0000000000OO * 255.0F) & 0xFF;
                     var7 = var18 << 24 | var14 << 16 | var16 << 8 | var17;
                     break;
                  case 4:
                     int var13 = ((int)(var5 >> 12) & 15) * 17;
                     int var15 = ((int)(var5 >> 8) & 15) * 17;
                     int var10 = ((int)(var5 >> 4) & 15) * 17;
                     int var11 = ((int)var5 & 15) * 17;
                     var7 = var11 << 24 | var13 << 16 | var15 << 8 | var10;
                     break;
                  case 5:
                  case 7:
                  default:
                     return;
                  case 6:
                     int var8 = (int)var5 & 16777215;
                     int var9 = Math.round(o0000000OOOO0O.O0000000000OO * 255.0F) & 0xFF;
                     var7 = var9 << 24 | var8;
                     break;
                  case 8:
                     var7 = (int)var5;
               }

               o0000000OOOO0O.O00000000(var7);
               o0000O000O0O0.O00000000O000O();
            } catch (NumberFormatException var12) {
            }
         }
      }
   }

   private void O000000000(O0000O000O0O0 o0000O000O0O0, ColorSetting o0000000OOOO0O) {
      String var3 = o0000O000O0O0.O000000O0O0O();
      if (var3 != null && !var3.isEmpty()) {
         try {
            int var4 = Integer.parseUnsignedInt(var3);
            if (var4 < 0) {
               var4 = 0;
            }

            if (var4 > 100) {
               var4 = 100;
            }

            o0000000OOOO0O.O000000000(var4 / 100.0F);
            o0000O000O0O0.O00000000O000O();
         } catch (NumberFormatException var5) {
         }
      }
   }

   private static boolean O00000000(char c) {
      return c >= '0' && c <= '9' || c >= 'a' && c <= 'f' || c >= 'A' && c <= 'F';
   }
}
