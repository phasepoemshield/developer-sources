package jnr.constants.platform.darwin;

import jnr.constants.Constant;

// $VF: Compiled from UDP.java
public enum UDP implements Constant {
   public static final long MIN_VALUE = 0L;
   private final long value;
   public static final long MAX_VALUE = 0L;

   UDP(long value) {
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

   @Override
   public final long longValue() {
      return this.value;
   }
}
