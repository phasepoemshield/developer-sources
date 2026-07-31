package zenith;

public abstract class EventImpl_24 implements Event {
   private boolean EventImpl_13;

   protected EventImpl_24() {
   }

   public void stop() {
      this.EventImpl_13 = true;
   }

   public boolean EventImpl_24() {
      return this.EventImpl_13;
   }
}
