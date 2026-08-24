package jnr.constants.platform.aix;

import jnr.constants.Constant;

// $VF: Compiled from Locale.java
public enum Locale implements Constant {
   LC_NUMERIC(3L),
   LC_MONETARY(2L),
   LC_ALL(-1L),
   LC_COLLATE(0L),
   LC_CTYPE(1L),
   LC_TIME(4L),
   LC_MESSAGES(5L);

   public static final long MAX_VALUE = 5L;
   public static final long MIN_VALUE = -1L;
   private final long value;

   Locale(long value) {
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

   @Override
   public final int intValue() {
      return (int)this.value;
   }
}
