package net.minecraft.util;

import net.minecraft.util.math.ColorHelper;

public final class ARGB {
   private ARGB() {
   }

   public static int alpha(int color) {
      return ColorHelper.getAlpha(color);
   }

   public static int red(int color) {
      return ColorHelper.getRed(color);
   }

   public static int green(int color) {
      return ColorHelper.getGreen(color);
   }

   public static int blue(int color) {
      return ColorHelper.getBlue(color);
   }

   public static int color(int alpha, int red, int green, int blue) {
      return ColorHelper.getArgb(alpha, red, green, blue);
   }

   public static int color(int red, int green, int blue) {
      return ColorHelper.getArgb(255, red, green, blue);
   }

   public static int lerp(float delta, int from, int to) {
      return ColorHelper.lerp(delta, from, to);
   }
}
