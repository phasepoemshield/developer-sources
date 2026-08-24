package jnr.constants.platform.fake;

import jnr.constants.Constant;

// $VF: Compiled from Multicast.java
public enum Multicast implements Constant {
   MCAST_BLOCK_SOURCE(2L),
   MCAST_MSFILTER(7L),
   MCAST_LEAVE_GROUP(4L),
   MCAST_INCLUDE(9L),
   MCAST_LEAVE_SOURCE_GROUP(6L),
   MCAST_JOIN_SOURCE_GROUP(5L),
   MCAST_EXCLUDE(8L),
   MCAST_UNBLOCK_SOURCE(3L),
   MCAST_JOIN_GROUP(1L);

   public static final long MIN_VALUE = 1L;
   public static final long MAX_VALUE = 9L;
   private final long value;

   @Override
   public final int intValue() {
      return (int)this.value;
   }

   Multicast(long value) {
      this.value = value;
   }

   public final int value() {
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
}
