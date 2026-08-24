package jnr.constants.platform.fake;

import jnr.constants.Constant;

// $VF: Compiled from Locale.java
public enum Locale implements Constant {
   LC_NUMERIC(1L),
   LC_MESSAGES(5L),
   LC_NAME(8L),
   LC_MONETARY(4L),
   LC_TIME(2L),
   LC_COLLATE(3L),
   LC_IDENTIFICATION(12L),
   LC_ADDRESS(9L),
   LC_PAPER(7L),
   LC_ALL(6L),
   LC_TELEPHONE(10L),
   LC_CTYPE(0L),
   LC_MEASUREMENT(11L);

   private final long value;
   public static final long MIN_VALUE = 0L;
   public static final long MAX_VALUE = 12L;

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

   Locale(long value) {
      this.value = value;
   }

   @Override
   public final boolean defined() {
      return true;
   }
}
