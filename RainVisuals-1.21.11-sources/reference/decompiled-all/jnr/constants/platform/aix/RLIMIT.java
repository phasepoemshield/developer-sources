package jnr.constants.platform.aix;

import jnr.constants.Constant;

// $VF: Compiled from RLIMIT.java
public enum RLIMIT implements Constant {
   RLIMIT_AS(6L),
   RLIMIT_NPROC(9L),
   RLIMIT_CORE(4L),
   RLIMIT_DATA(2L),
   RLIMIT_NOFILE(7L),
   RLIMIT_RSS(5L),
   RLIMIT_FSIZE(1L),
   RLIMIT_STACK(3L),
   RLIMIT_CPU(0L);

   public static final long MAX_VALUE = 9L;
   public static final long MIN_VALUE = 0L;
   private final long value;

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
   public final boolean defined() {
      return true;
   }
}
