package jnr.constants.platform.aix;

import jnr.constants.Constant;

// $VF: Compiled from Access.java
public enum Access implements Constant {
   W_OK(2L),
   X_OK(1L),
   R_OK(4L),
   F_OK(0L);

   private final long value;
   public static final long MAX_VALUE = 4L;
   public static final long MIN_VALUE = 0L;

   @Override
   public final long longValue() {
      return this.value;
   }

   Access(long value) {
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
}
