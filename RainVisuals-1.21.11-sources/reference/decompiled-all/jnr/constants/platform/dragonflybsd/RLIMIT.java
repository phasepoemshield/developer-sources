package jnr.constants.platform.dragonflybsd;

import java.util.EnumMap;
import java.util.Map;
import jnr.constants.Constant;

// $VF: Compiled from RLIMIT.java
public enum RLIMIT implements Constant {
   RLIMIT_AS(10L),
   RLIMIT_NPROC(7L),
   RLIMIT_FSIZE(1L),
   RLIMIT_STACK(3L),
   RLIMIT_DATA(2L),
   RLIMIT_CORE(4L),
   RLIMIT_CPU(0L),
   RLIMIT_NOFILE(8L),
   RLIMIT_RSS(5L),
   RLIMIT_MEMLOCK(6L);

   public static final long MIN_VALUE = 0L;
   private final long value;
   public static final long MAX_VALUE = 10L;

   RLIMIT(long value) {
      this.value = value;
   }

   @Override
   public final int intValue() {
      return (int)this.value;
   }

   @Override
   public final long longValue() {
      return this.value;
   }

   public final int value() {
      return (int)this.value;
   }

   @Override
   public final boolean defined() {
      return true;
   }

   @Override
   public final String toString() {
      return RLIMIT.StringTable.descriptions.get(this);
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
         map.put(RLIMIT.RLIMIT_MEMLOCK, "RLIMIT_MEMLOCK");
         map.put(RLIMIT.RLIMIT_NOFILE, "RLIMIT_NOFILE");
         map.put(RLIMIT.RLIMIT_NPROC, "RLIMIT_NPROC");
         map.put(RLIMIT.RLIMIT_RSS, "RLIMIT_RSS");
         map.put(RLIMIT.RLIMIT_STACK, "RLIMIT_STACK");
         return map;
      }
   }
}
