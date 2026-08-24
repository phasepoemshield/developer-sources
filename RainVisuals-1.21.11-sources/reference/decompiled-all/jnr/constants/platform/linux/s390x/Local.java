package jnr.constants.platform.linux.s390x;

import jnr.constants.Constant;

// $VF: Compiled from Local.java
public enum Local implements Constant {
   public static final long MAX_VALUE = 0L;
   public static final long MIN_VALUE = 0L;
   private final long value;

   Local(long value) {
      this.value = value;
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

   @Override
   public final long longValue() {
      return this.value;
   }
}
