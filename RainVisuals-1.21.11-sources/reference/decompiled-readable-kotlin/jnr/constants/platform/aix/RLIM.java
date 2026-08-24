package jnr.constants.platform.aix;

import jnr.constants.Constant;

// $VF: Compiled from RLIM.java
public enum RLIM implements Constant {
   RLIM_INFINITY(Long.MAX_VALUE),
   RLIM_SAVED_CUR(9223372036854775805L),
   RLIM_SAVED_MAX(9223372036854775806L),
   RLIM_NLIMITS(10L);

   public static final long MIN_VALUE = 10L;
   private final long value;
   public static final long MAX_VALUE = Long.MAX_VALUE;

   @Override
   public final boolean defined() {
      return true;
   }

   @Override
   public final int intValue() {
      return (int)this.value;
   }

   RLIM(long value) {
      this.value = value;
   }

   @Override
   public final long longValue() {
      return this.value;
   }
}
