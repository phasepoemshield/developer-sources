package jnr.constants.platform.fake;

import jnr.constants.Constant;

// $VF: Compiled from RLIMIT.java
public enum RLIMIT implements Constant {
   RLIMIT_NPROC(12L),
   RLIMIT_MEMLOCK(7L),
   RLIMIT_CORE(2L),
   RLIMIT_RTPRIO(15L),
   RLIMIT_MSGQUEUE(8L),
   RLIMIT_OFILE(13L),
   RLIMIT_NOFILE(11L),
   RLIMIT_NICE(9L),
   RLIMIT_RSS(14L),
   RLIMIT_CPU(3L),
   RLIMIT_DATA(4L),
   RLIMIT_LOCKS(6L),
   RLIMIT_RTTIME(16L),
   RLIMIT_SIGPENDING(17L),
   RLIMIT_STACK(18L),
   RLIMIT_AS(1L),
   RLIMIT_NLIMITS(10L),
   RLIMIT_FSIZE(5L);

   public static final long MAX_VALUE = 18L;
   public static final long MIN_VALUE = 1L;
   private final long value;

   RLIMIT(long value) {
      this.value = value;
   }

   @Override
   public final long longValue() {
      return this.value;
   }

   @Override
   public final boolean defined() {
      return true;
   }

   public final int value() {
      return (int)this.value;
   }

   @Override
   public final int intValue() {
      return (int)this.value;
   }
}
