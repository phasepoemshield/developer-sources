package jnr.constants.platform.fake;

import jnr.constants.Constant;

// $VF: Compiled from INet.java
public enum INet implements Constant {
   INET_ADDRSTRLEN(1L);

   private final long value;
   public static final long MIN_VALUE = 1L;
   public static final long MAX_VALUE = 1L;

   @Override
   public final long longValue() {
      return this.value;
   }

   public final int value() {
      return (int)this.value;
   }

   @Override
   public final boolean defined() {
      return true;
   }

   @Override
   public final int intValue() {
      return (int)this.value;
   }

   INet(long value) {
      this.value = value;
   }
}
