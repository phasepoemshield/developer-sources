package oxxxde;

// $VF: Compiled from heavy
public final class ظد {
   private static int depth;

   public static void push() {
      depth++;
   }

   private ظد() {
   }

   public static boolean isActive() {
      return depth > 0;
   }

   public static void pop() {
      depth = Math.max(0, depth - 1);
   }
}
