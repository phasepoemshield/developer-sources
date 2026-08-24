package oxxxde;

// $VF: Compiled from heavy
public final class صد {
   private static final ThreadLocal<Float> ALPHA = ThreadLocal.withInitial(() -> 1.0F);
   private static final ThreadLocal<Boolean> ACTIVE = ThreadLocal.withInitial(() -> false);

   public static int applyAlpha(int color) {
      if (!ACTIVE.get()) {
         return color;
      }

      int alpha = Math.round(ALPHA.get() * 255.0F);
      return color & 16777215 | alpha << 24;
   }

   private static float clamp(float value) {
      return Math.max(0.0F, Math.min(1.0F, value));
   }

   private صد() {
   }

   public static void withAlpha(float alpha, Runnable action) {
      boolean previousActive = ACTIVE.get();
      float previousAlpha = ALPHA.get();
      ACTIVE.set(true);
      ALPHA.set(clamp(alpha));

      try {
         action.run();
      } finally {
         ACTIVE.set(previousActive);
         ALPHA.set(previousAlpha);
      }
   }
}
