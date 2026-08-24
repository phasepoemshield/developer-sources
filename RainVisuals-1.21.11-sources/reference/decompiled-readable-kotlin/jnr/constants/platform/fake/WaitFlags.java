package jnr.constants.platform.fake;

import jnr.constants.Constant;

// $VF: Compiled from WaitFlags.java
public enum WaitFlags implements Constant {
   WCONTINUED(16L),
   WEXITED(8L),
   WNOHANG(1L),
   WUNTRACED(2L),
   WNOWAIT(32L),
   WSTOPPED(4L);

   public static final long MAX_VALUE = 32L;
   public static final long MIN_VALUE = 1L;
   private final long value;

   @Override
   public final long longValue() {
      return this.value;
   }

   WaitFlags(long value) {
      this.value = value;
   }

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
}
