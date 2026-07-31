package l;

public abstract class Event3 implements Helper41, Helper43 {
   private boolean cancelled;

   protected Event3() {
   }

   @Override
   public boolean method581() {
      return this.cancelled;
   }

   @Override
   public void method582() {
      this.cancelled = true;
   }

   public void method1613(boolean var1) {
      this.cancelled = var1;
   }
}
