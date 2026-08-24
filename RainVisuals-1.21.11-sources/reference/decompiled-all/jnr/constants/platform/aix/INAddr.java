package jnr.constants.platform.aix;

import jnr.constants.Constant;

// $VF: Compiled from INAddr.java
public enum INAddr implements Constant {
   INADDR_LOOPBACK(2130706433L),
   INADDR_ALLRTRS_GROUP(3758096386L),
   INADDR_BROADCAST(4294967295L),
   INADDR_MAX_LOCAL_GROUP(3758096639L),
   INADDR_UNSPEC_GROUP(3758096384L),
   INADDR_NONE(4294967295L),
   INADDR_ANY(0L),
   INADDR_ALLHOSTS_GROUP(3758096385L);

   private final long value;
   public static final long MIN_VALUE = 0L;
   public static final long MAX_VALUE = 4294967295L;

   INAddr(long value) {
      this.value = value;
   }

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
}
