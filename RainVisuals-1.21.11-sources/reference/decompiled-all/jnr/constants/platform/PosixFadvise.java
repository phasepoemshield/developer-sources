package jnr.constants.platform;

import jnr.constants.Constant;

// $VF: Compiled from PosixFadvise.java
public enum PosixFadvise implements Constant {
   POSIX_FADV_RANDOM,
   POSIX_FADV_NOREUSE,
   __UNKNOWN_CONSTANT__,
   POSIX_FADV_SEQUENTIAL,
   POSIX_FADV_DONTNEED,
   POSIX_FADV_NORMAL,
   POSIX_FADV_WILLNEED;

   private static final ConstantResolver<PosixFadvise> resolver = ConstantResolver.getResolver(PosixFadvise.class, 20000, 29999);

   public final int value() {
      return (int)resolver.longValue(this);
   }

   public static PosixFadvise valueOf(long value) {
      return resolver.valueOf(value);
   }

   @Override
   public final String toString() {
      return this.description();
   }

   @Override
   public final int intValue() {
      return (int)resolver.longValue(this);
   }

   @Override
   public final boolean defined() {
      return resolver.defined(this);
   }

   public final String description() {
      return resolver.description(this);
   }

   @Override
   public final long longValue() {
      return resolver.longValue(this);
   }
}
