package jnr.constants.platform.aix;

import jnr.constants.Constant;

// $VF: Compiled from NameInfo.java
public enum NameInfo implements Constant {
   NI_NUMERICSERV(8L),
   NI_NAMEREQD(4L),
   NI_MAXHOST(1025L),
   NI_MAXSERV(32L),
   NI_NUMERICHOST(2L),
   NI_DGRAM(16L),
   NI_NOFQDN(1L);

   public static final long MIN_VALUE = 1L;
   private final long value;
   public static final long MAX_VALUE = 1025L;

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

   NameInfo(long value) {
      this.value = value;
   }
}
