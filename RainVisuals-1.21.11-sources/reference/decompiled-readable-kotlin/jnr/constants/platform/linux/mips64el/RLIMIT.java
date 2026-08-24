package jnr.constants.platform.linux.mips64el;

import java.util.EnumMap;
import java.util.Map;
import jnr.constants.Constant;

// $VF: Compiled from RLIMIT.java
public enum RLIMIT implements Constant {
   RLIMIT_CORE(4L),
   RLIMIT_NICE(13L),
   RLIMIT_NOFILE(5L),
   RLIMIT_AS(6L),
   RLIMIT_RSS(7L),
   RLIMIT_CPU(0L),
   RLIMIT_MSGQUEUE(12L),
   RLIMIT_OFILE(5L),
   RLIMIT_RTPRIO(14L),
   RLIMIT_NPROC(8L),
   RLIMIT_RTTIME(15L),
   RLIMIT_MEMLOCK(9L),
   RLIMIT_STACK(3L),
   RLIMIT_DATA(2L),
   RLIMIT_LOCKS(10L),
   RLIMIT_SIGPENDING(11L),
   RLIMIT_NLIMITS(16L),
   RLIMIT_FSIZE(1L);

   public static final long MIN_VALUE = 0L;
   private final long value;
   public static final long MAX_VALUE = 16L;

   @Override
   public final boolean defined() {
      return true;
   }

   @Override
   public final long longValue() {
      return this.value;
   }

   RLIMIT(long value) {
      this.value = value;
   }

   @Override
   public final int intValue() {
      return (int)this.value;
   }

   @Override
   public final String toString() {
      return RLIMIT.StringTable.descriptions.get(this);
   }

   public final int value() {
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
         map.put(RLIMIT.RLIMIT_LOCKS, "RLIMIT_LOCKS");
         map.put(RLIMIT.RLIMIT_MEMLOCK, "RLIMIT_MEMLOCK");
         map.put(RLIMIT.RLIMIT_MSGQUEUE, "RLIMIT_MSGQUEUE");
         map.put(RLIMIT.RLIMIT_NICE, "RLIMIT_NICE");
         map.put(RLIMIT.RLIMIT_NLIMITS, "RLIMIT_NLIMITS");
         map.put(RLIMIT.RLIMIT_NOFILE, "RLIMIT_NOFILE");
         map.put(RLIMIT.RLIMIT_NPROC, "RLIMIT_NPROC");
         map.put(RLIMIT.RLIMIT_OFILE, "RLIMIT_OFILE");
         map.put(RLIMIT.RLIMIT_RSS, "RLIMIT_RSS");
         map.put(RLIMIT.RLIMIT_RTPRIO, "RLIMIT_RTPRIO");
         map.put(RLIMIT.RLIMIT_RTTIME, "RLIMIT_RTTIME");
         map.put(RLIMIT.RLIMIT_SIGPENDING, "RLIMIT_SIGPENDING");
         map.put(RLIMIT.RLIMIT_STACK, "RLIMIT_STACK");
         return map;
      }
   }
}
