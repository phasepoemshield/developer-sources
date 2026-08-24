package jnr.constants.platform.fake;

import jnr.constants.Constant;

// $VF: Compiled from Access.java
public enum Access implements Constant {
   W_OK(2L),
   X_OK(1L),
   R_OK(4L),
   F_OK(0L);

   private final long value;
   public static final long MIN_VALUE = 0L;
   public static final long MAX_VALUE = 4L;

   @Override
   public final int intValue() {
      return (int)this.value;
   }

   public final int value() {
      return (int)this.value;
   }

   @Override
   public final boolean defined() {
      return true;
   }

   Access(long value) {
      this.value = value;
   }

   @Override
   public final long longValue() {
      return this.value;
   }
}
