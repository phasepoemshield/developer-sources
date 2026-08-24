package jnr.constants.platform.linux.mips64el;

import jnr.constants.Constant;

// $VF: Compiled from Local.java
public enum Local implements Constant {
   private final long value;
   public static final long MIN_VALUE = 0L;
   public static final long MAX_VALUE = 0L;

   @Override
   public final long longValue() {
      return this.value;
   }

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
}
