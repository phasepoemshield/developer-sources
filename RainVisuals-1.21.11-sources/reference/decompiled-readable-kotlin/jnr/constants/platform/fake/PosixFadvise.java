package jnr.constants.platform.fake;

import jnr.constants.Constant;

// $VF: Compiled from PosixFadvise.java
public enum PosixFadvise implements Constant {
   POSIX_FADV_WILLNEED(5L),
   POSIX_FADV_NORMAL(1L),
   POSIX_FADV_RANDOM(3L),
   POSIX_FADV_SEQUENTIAL(2L),
   POSIX_FADV_DONTNEED(6L),
   POSIX_FADV_NOREUSE(4L);

   public static final long MAX_VALUE = 6L;
   private final long value;
   public static final long MIN_VALUE = 1L;

   PosixFadvise(long value) {
      this.value = value;
   }

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
}
