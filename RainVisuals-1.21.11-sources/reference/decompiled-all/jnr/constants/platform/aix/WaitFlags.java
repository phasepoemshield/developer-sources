package jnr.constants.platform.aix;

import jnr.constants.Constant;

// $VF: Compiled from WaitFlags.java
public enum WaitFlags implements Constant {
   WNOWAIT(16L),
   WNOHANG(1L),
   WUNTRACED(2L),
   WCONTINUED(16777216L),
   WEXITED(4L),
   WSTOPPED(64L);

   private final long value;
   public static final long MAX_VALUE = 16777216L;
   public static final long MIN_VALUE = 1L;

   WaitFlags(long value) {
      this.value = value;
   }

   @Override
   public final int intValue() {
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
