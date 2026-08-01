package zenith;

public class ZenithException extends Exception {
   private static final long Nofrienddamage = 1L;
   private final ZenithInternal148 Nointeract;

   public ZenithException(ZenithInternal148 llli1iilli1ii1) {
      this.Nointeract = llli1iilli1ii1;
   }

   public ZenithException(ZenithInternal148 llli1iilli1ii1, String s) {
      super(s);
      this.Nointeract = llli1iilli1ii1;
   }

   public ZenithException(ZenithInternal148 llli1iilli1ii1, Throwable throwable) {
      super(throwable);
      this.Nointeract = llli1iilli1ii1;
   }

   public ZenithException(ZenithInternal148 llli1iilli1ii1, String s, Throwable throwable) {
      super(s, throwable);
      this.Nointeract = llli1iilli1ii1;
   }

   public ZenithInternal148 EventImpl() {
      return this.Nointeract;
   }
}
