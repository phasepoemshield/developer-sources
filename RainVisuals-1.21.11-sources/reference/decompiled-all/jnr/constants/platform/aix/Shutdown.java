package jnr.constants.platform.aix;

import jnr.constants.Constant;

// $VF: Compiled from Shutdown.java
public enum Shutdown implements Constant {
   SHUT_RDWR(2L),
   SHUT_WR(1L),
   SHUT_RD(0L);

   private final long value;
   public static final long MAX_VALUE = 2L;
   public static final long MIN_VALUE = 0L;

   @Override
   public final boolean defined() {
      return true;
   }

   @Override
   public final long longValue() {
      return this.value;
   }

   @Override
   public final int intValue() {
      return (int)this.value;
   }

   Shutdown(long value) {
      this.value = value;
   }
}
