package jnr.constants.platform.fake;

import jnr.constants.Constant;

// $VF: Compiled from INAddr.java
public enum INAddr implements Constant {
   INADDR_MAX_LOCAL_GROUP(8L),
   INADDR_NONE(3L),
   INADDR_ALLRTRS_GROUP(7L),
   INADDR_BROADCAST(2L),
   INADDR_ANY(1L),
   INADDR_UNSPEC_GROUP(5L),
   INADDR_LOOPBACK(4L),
   INADDR_ALLHOSTS_GROUP(6L);

   private final long value;
   public static final long MIN_VALUE = 1L;
   public static final long MAX_VALUE = 8L;

   @Override
   public final long longValue() {
      return this.value;
   }

   INAddr(long value) {
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

   public final int value() {
      return (int)this.value;
   }
}
