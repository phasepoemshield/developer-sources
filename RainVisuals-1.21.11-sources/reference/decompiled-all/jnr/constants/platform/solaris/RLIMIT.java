package jnr.constants.platform.solaris;

import java.util.EnumMap;
import java.util.Map;
import jnr.constants.Constant;

// $VF: Compiled from RLIMIT.java
public enum RLIMIT implements Constant {
   RLIMIT_DATA(2L),
   RLIMIT_FSIZE(1L),
   RLIMIT_CPU(0L),
   RLIMIT_NOFILE(5L),
   RLIMIT_STACK(3L),
   RLIMIT_AS(6L),
   RLIMIT_CORE(4L);

   public static final long MAX_VALUE = 6L;
   private final long value;
   public static final long MIN_VALUE = 0L;

   RLIMIT(long value) {
      this.value = value;
   }

   @Override
   public final String toString() {
      return RLIMIT.StringTable.descriptions.get(this);
   }

   @Override
   public final boolean defined() {
      return true;
   }

   public final int value() {
      return (int)this.value;
   }

   @Override
   public final long longValue() {
      return this.value;
   }

   @Override
   public final int intValue() {
      return (int)this.value;
   }

   // $VF: Compiled from RLIMIT.java
   static final class StringTable {
      public static final Map<RLIMIT, String> descriptions = generateTable();

      public static final Map<RLIMIT, String> generateTable() {
         Map<RLIMIT, String> map = new EnumMap<>(RLIMIT.class);
         map.put(RLIMIT.RLIMIT_AS, "RLIMIT_AS");
         map.put(RLIMIT.RLIMIT_CORE, "RLIMIT_CORE");
         map.put(RLIMIT.RLIMIT_CPU, "RLIMIT_CPU");
         map.put(RLIMIT.RLIMIT_DATA, "RLIMIT_DATA");
         map.put(RLIMIT.RLIMIT_FSIZE, "RLIMIT_FSIZE");
         map.put(RLIMIT.RLIMIT_NOFILE, "RLIMIT_NOFILE");
         map.put(RLIMIT.RLIMIT_STACK, "RLIMIT_STACK");
         return map;
      }
   }
}
