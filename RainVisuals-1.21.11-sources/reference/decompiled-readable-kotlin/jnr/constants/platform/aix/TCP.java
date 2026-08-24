package jnr.constants.platform.aix;

import jnr.constants.Constant;

// $VF: Compiled from TCP.java
public enum TCP implements Constant {
   TCP_MAXWIN(65535L),
   TCP_MAXBURST(8L),
   TCP_MSS(1460L),
   TCP_NODELAY(1L),
   TCP_MAX_SACK(4L),
   TCP_MAXSEG(2L);

   public static final long MAX_VALUE = 65535L;
   public static final long MIN_VALUE = 1L;
   private final long value;

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

   TCP(long value) {
      this.value = value;
   }
}
