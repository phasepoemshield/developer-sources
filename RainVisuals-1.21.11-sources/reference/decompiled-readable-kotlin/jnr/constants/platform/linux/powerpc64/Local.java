package jnr.constants.platform.linux.powerpc64;

import jnr.constants.Constant;

// $VF: Compiled from Local.java
public enum Local implements Constant {
   public static final long MAX_VALUE = 0L;
   public static final long MIN_VALUE = 0L;
   private final long value;

   @Override
   public final boolean defined() {
      return true;
   }

   Local(long value) {
      this.value = value;
   }

   public final int value() {
      return (int)this.value;
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
