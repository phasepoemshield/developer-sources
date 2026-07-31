package zenith;

public abstract class EventImpl_13 implements ZenithInternal028, Event {
   private final byte byteHolder;

   protected EventImpl_13(byte b0) {
      this.byteHolder = b0;
   }

   @Override
   public byte ZenithInternal028() {
      return this.byteHolder;
   }
}
