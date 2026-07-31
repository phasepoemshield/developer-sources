package ru.metaculture.protection;

import net.minecraft.util.math.MathHelper;

public final class O000000O0O0O {
   public static boolean O00000000;
   public static float O000000000;
   public static float O0000000000;
   public static float O00000000000 = -90.0F;
   public static float O000000000000 = 90.0F;
   private static float O0000000000000;
   private static float O000000000000O;
   private static float O00000000000O;
   private static float O00000000000O0;
   private static float O00000000000OO = 1.0F;

   private O000000O0O0O() {
   }

   public static void O00000000(float f, float g, float h) {
      O0000000000000 = f;
      O000000000000O = g;
      O00000000000OO = MathHelper.clamp(h, 0.05F, 1.0F);
   }

   public static void O00000000() {
      if (!O00000000) {
         O00000000000O = 0.0F;
         O00000000000O0 = 0.0F;
         O000000000 = 0.0F;
         O0000000000 = 0.0F;
      } else {
         O00000000000O = O00000000000O + (O0000000000000 - O00000000000O) * O00000000000OO;
         O00000000000O0 = O00000000000O0 + (O000000000000O - O00000000000O0) * O00000000000OO;
         O000000000 = O00000000000O;
         O0000000000 = O00000000000O0;
      }
   }

   public static void O000000000() {
      O00000000 = false;
      O000000000 = 0.0F;
      O0000000000 = 0.0F;
      O00000000000 = -90.0F;
      O000000000000 = 90.0F;
      O0000000000000 = 0.0F;
      O000000000000O = 0.0F;
      O00000000000O = 0.0F;
      O00000000000O0 = 0.0F;
      O00000000000OO = 1.0F;
   }
}
