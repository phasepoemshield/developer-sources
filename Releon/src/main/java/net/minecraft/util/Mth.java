package net.minecraft.util;

import net.minecraft.util.math.MathHelper;

public final class Mth {
   private Mth() {
   }

   public static float clamp(float value, float min, float max) {
      return MathHelper.clamp(value, min, max);
   }

   public static int clamp(int value, int min, int max) {
      return MathHelper.clamp(value, min, max);
   }

   public static int lerpInt(float delta, int start, int end) {
      return Math.round((float)MathHelper.lerp(delta, start, end));
   }

   public static float lerp(float delta, float start, float end) {
      return MathHelper.lerp(delta, start, end);
   }

   public static double lerp(double delta, double start, double end) {
      return MathHelper.lerp(delta, start, end);
   }

   public static float wrapDegrees(float degrees) {
      return MathHelper.wrapDegrees(degrees);
   }

   public static double wrapDegrees(double degrees) {
      return MathHelper.wrapDegrees(degrees);
   }
}
