package jnr.constants.platform.windows;

import java.util.EnumMap;
import java.util.Map;
import jnr.constants.Constant;

// $VF: Compiled from Signal.java
public enum Signal implements Constant {
   SIGSEGV(11L),
   SIGINT(2L),
   SIGTERM(15L),
   NSIG(23L),
   SIGILL(4L),
   SIGABRT(22L),
   SIGFPE(8L);

   public static final long MAX_VALUE = 23L;
   private final long value;
   public static final long MIN_VALUE = 2L;

   public final int value() {
      return (int)this.value;
   }

   @Override
   public final String toString() {
      return Signal.StringTable.descriptions.get(this);
   }

   Signal(long value) {
      this.value = value;
   }

   @Override
   public final boolean defined() {
      return true;
   }

   @Override
   public final int intValue() {
      return (int)this.value;
   }

   @Override
   public final long longValue() {
      return this.value;
   }

   // $VF: Compiled from Signal.java
   static final class StringTable {
      public static final Map<Signal, String> descriptions = generateTable();

      public static final Map<Signal, String> generateTable() {
         Map<Signal, String> map = new EnumMap<>(Signal.class);
         map.put(Signal.SIGINT, "SIGINT");
         map.put(Signal.SIGILL, "SIGILL");
         map.put(Signal.SIGABRT, "SIGABRT");
         map.put(Signal.SIGFPE, "SIGFPE");
         map.put(Signal.SIGSEGV, "SIGSEGV");
         map.put(Signal.SIGTERM, "SIGTERM");
         map.put(Signal.NSIG, "NSIG");
         return map;
      }
   }
}
