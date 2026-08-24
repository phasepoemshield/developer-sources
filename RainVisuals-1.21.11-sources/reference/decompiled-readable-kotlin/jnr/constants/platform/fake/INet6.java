package jnr.constants.platform.fake;

import jnr.constants.Constant;

// $VF: Compiled from INet6.java
public enum INet6 implements Constant {
   INET6_ADDRSTRLEN(1L);

   public static final long MIN_VALUE = 1L;
   public static final long MAX_VALUE = 1L;
   private final long value;

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

   public final int value() {
      return (int)this.value;
   }

   INet6(long value) {
      this.value = value;
   }
}
