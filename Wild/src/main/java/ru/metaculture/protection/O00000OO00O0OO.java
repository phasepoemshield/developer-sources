package ru.metaculture.protection;

public class O00000OO00O0OO extends O00000OO000O0O {
   public static boolean O00000000(int i, int j, int k) {
      ColorSetting var4 = O00000OO000O0O.O0000000000OO;
      if (var4 instanceof ColorSetting && (O00000OO000O0O.O0000000000OO0 != 0.0F || O00000OO000O0O.O0000000000OOO != 0.0F)) {
         float var13 = O00000OO00OO0O.O00000000(O00000OO000O0O.O0000000000OO0);
         float var5 = O00000OO000O0O.O0000000000OOO;
         float var6 = O00000OO00OO0O.O000000000(var13);
         float var7 = O00000OO00OO0O.O0000000000(var5);
         float var8 = O00000OO00OO0O.O00000000000(var13);
         float var9 = O00000OO00OO0O.O000000000000(var5);
         float var10 = O00000OO00OO0O.O0000000000000(var5);
         float var11 = O00000OO00OO0O.O000000000000O(var5);
         float var12 = 148.0F;
         if (k == 0 && O00000OO00OOO.O00000000(i, j, var6, var7, 132.0F, 62.0F)) {
            O00000OO000O0O.O000000000O = true;
            O00000OO000O0O.O000000000O0 = false;
            O00000OO000O0O.O000000000O00 = false;
            O00000000(var4, i, j, var6, var7);
            O000000000();
            return true;
         } else if (k == 0 && O00000OO00OOO.O00000000(i, j, var8, var7, 10.0F, 62.0F)) {
            O00000OO000O0O.O000000000O0 = true;
            O00000OO000O0O.O000000000O = false;
            O00000OO000O0O.O000000000O00 = false;
            O00000000(var4, j, var7);
            O000000000();
            return true;
         } else if (k == 0 && O00000OO00OOO.O00000000(i, j, var6, var9, var12, 7.0F)) {
            O00000OO000O0O.O000000000O00 = true;
            O00000OO000O0O.O000000000O0 = false;
            O00000OO000O0O.O000000000O = false;
            O00000000(var4, i, var6, var12);
            O000000000();
            return true;
         } else if (k == 0 && O00000OO00OOO.O00000000(i, j, var6, var10, var12, 10.0F)) {
            O000000000(var4, i, var6, var12);
            O000000000();
            return true;
         } else if ((k == 0 || k == 1) && O00000OO00OOO.O00000000(i, j, var6, var11, var12, 10.0F)) {
            O00000000(var4, i, var6, var12, k == 1);
            O000000000();
            return true;
         } else {
            return O00000OO00OOO.O00000000(i, j, var13, var5, 160.0F, 119.0F);
         }
      } else {
         return false;
      }
   }

   public static void O00000000(ColorSetting o0000000OOOO0O, int i, int j, float f, float g) {
      float var5 = Math.max(0.0F, Math.min(i - f, 132.0F));
      float var6 = Math.max(0.0F, Math.min(j - g, 62.0F));
      o0000000OOOO0O.O0000000000O00 = var5 / 132.0F;
      o0000000OOOO0O.O0000000000O0O = 1.0F - var6 / 62.0F;
   }

   public static void O00000000(ColorSetting o0000000OOOO0O, int i, float f) {
      float var3 = Math.max(0.0F, Math.min(i - f, 62.0F));
      o0000000OOOO0O.O00000000(var3 / 62.0F * 360.0F);
   }

   public static void O00000000(ColorSetting o0000000OOOO0O, int i, float f, float g) {
      o0000000OOOO0O.O000000000((i - f) / g);
   }

   private static void O000000000(ColorSetting o0000000OOOO0O, int i, float f, float g) {
      byte var4 = 5;
      int var5 = Math.max(0, Math.min(var4 - 1, (int)((i - f) / g * var4)));
      float[] var6 = new float[]{0.0F, 180.0F, -30.0F, 30.0F, 120.0F};
      o0000000OOOO0O.O00000000(o0000000OOOO0O.O000000000000() + var6[var5]);
      if (o0000000OOOO0O.O0000000000O00 < 0.05F) {
         o0000000OOOO0O.O0000000000O00 = 0.65F;
      }

      if (o0000000OOOO0O.O0000000000O0O < 0.08F) {
         o0000000OOOO0O.O0000000000O0O = 0.85F;
      }
   }

   private static void O00000000(ColorSetting o0000000OOOO0O, int i, float f, float g, boolean bl) {
      byte var5 = 9;
      int var6 = Math.max(0, Math.min(var5 - 1, (int)((i - f) / g * var5)));
      if (var6 == 8) {
         if (!bl) {
            o0000000OOOO0O.O000000000000O();
         }
      } else {
         if (bl) {
            o0000000OOOO0O.O00000000000(var6);
         } else {
            o0000000OOOO0O.O0000000000(var6);
         }
      }
   }

   private static void O000000000() {
      if (WildClient.O00000000 != null && WildClient.O00000000.O0000000000O00 != null) {
         WildClient.O00000000.O0000000000O00.O0000000000();
      }
   }
}
