package oxxxde;

// $VF: Compiled from heavy
public final class اذ {
   private static final ThreadLocal<Integer> LINE_OFFSET = ThreadLocal.withInitial(() -> 0);

   public static int offsetX(int x) {
      return x + getLineOffset();
   }

   public static int getLineOffset() {
      return LINE_OFFSET.get();
   }

   private اذ() {
   }

   public static void setLineOffset(int offset) {
      LINE_OFFSET.set(offset);
   }
}
