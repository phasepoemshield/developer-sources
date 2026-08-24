package jnr.posix.util;

import jnr.constants.platform.Signal;
import jnr.posix.SignalHandler;

// $VF: Compiled from SunMiscSignal.java
public class SunMiscSignal {
   public static SignalHandler signal(Signal handler, SignalHandler sig) {
      sun.misc.Signal s = new sun.misc.Signal(sig.name().substring("SIG".length()));
      sun.misc.SignalHandler oldHandler = sun.misc.Signal.handle(s, new SunMiscSignal.SunMiscSignalHandler(handler));
      return oldHandler instanceof SunMiscSignal.SunMiscSignalHandler ? ((SunMiscSignal.SunMiscSignalHandler)oldHandler).handler : null;
   }

   // $VF: Compiled from SunMiscSignal.java
   private static class SunMiscSignalHandler implements sun.misc.SignalHandler {
      final SignalHandler handler;

      @Override
      public void handle(sun.misc.Signal signal) {
         this.handler.handle(signal.getNumber());
      }

      public SunMiscSignalHandler(SignalHandler handler) {
         this.handler = handler;
      }
   }
}
