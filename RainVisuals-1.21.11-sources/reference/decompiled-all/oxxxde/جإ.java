package oxxxde;

// $VF: Compiled from heavy
public final class جإ {
   private static final ThreadLocal<Float> ALPHA = ThreadLocal.withInitial(() -> 1.0F);

   public static float currentAlpha() {
      return ALPHA.get();
   }

   private جإ() {
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public static void withAlpha(float alpha, Runnable renderCall) {
      float previous = ALPHA.get();
      ALPHA.set(Math.max(0.0F, Math.min(1.0F, alpha)));
      boolean var5 = false /* VF: Semaphore variable */;

      try {
         var5 = true;
         renderCall.run();
         var5 = false;
      } finally {
         if (var5) {
            ALPHA.set(previous);
         }
      }

      ALPHA.set(previous);
   }
}
