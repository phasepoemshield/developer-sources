package jnr.constants.platform.fake;

import jnr.constants.Constant;

// $VF: Compiled from AddressInfo.java
public enum AddressInfo implements Constant {
   AI_MASK(5L),
   AI_NUMERICHOST(3L),
   AI_V4MAPPED(9L),
   AI_NUMERICSERV(4L),
   AI_ADDRCONFIG(8L),
   AI_CANONNAME(2L),
   AI_V4MAPPED_CFG(7L),
   AI_PASSIVE(1L),
   AI_ALL(6L),
   AI_DEFAULT(10L);

   public static final long MAX_VALUE = 10L;
   private final long value;
   public static final long MIN_VALUE = 1L;

   @Override
   public final int intValue() {
      return (int)this.value;
   }

   @Override
   public final long longValue() {
      return this.value;
   }

   @Override
   public final boolean defined() {
      return true;
   }

   AddressInfo(long value) {
      this.value = value;
   }

   public final int value() {
      return (int)this.value;
   }
}
