package jnr.constants.platform.fake;

import jnr.constants.Constant;

// $VF: Compiled from NameInfo.java
public enum NameInfo implements Constant {
   NI_NUMERICSERV(6L),
   NI_NUMERICHOST(4L),
   NI_MAXSERV(2L),
   NI_NAMEREQD(5L),
   NI_MAXHOST(1L),
   NI_NOFQDN(3L),
   NI_DGRAM(7L),
   NI_WITHSCOPEID(8L);

   public static final long MAX_VALUE = 8L;
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

   NameInfo(long value) {
      this.value = value;
   }

   public final int value() {
      return (int)this.value;
   }

   @Override
   public final long longValue() {
      return this.value;
   }
}
