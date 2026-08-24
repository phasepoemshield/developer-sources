package jnr.constants.platform.fake;

import jnr.constants.Constant;

// $VF: Compiled from Local.java
public enum Local implements Constant {
   LOCAL_PEERCRED(1L),
   LOCAL_CONNWAIT(3L),
   LOCAL_CREDS(2L);

   public static final long MAX_VALUE = 3L;
   private final long value;
   public static final long MIN_VALUE = 1L;

   @Override
   public final int intValue() {
      return (int)this.value;
   }

   Local(long value) {
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
