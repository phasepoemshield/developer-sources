package jnr.constants.platform;

import jnr.constants.Constant;

// $VF: Compiled from Confstr.java
public enum Confstr implements Constant {
   _CS_POSIX_V6_LPBIG_OFFBIG_LDFLAGS,
   _CS_POSIX_V6_ILP32_OFFBIG_CFLAGS,
   _CS_PATH,
   _CS_POSIX_V7_LP64_OFF64_LIBS,
   _CS_POSIX_V7_ILP32_OFF32_CFLAGS,
   _CS_GNU_LIBC_VERSION,
   _CS_GNU_LIBPTHREAD_VERSION,
   _CS_POSIX_V7_ILP32_OFFBIG_LDFLAGS,
   _CS_POSIX_V6_ILP32_OFFBIG_LIBS,
   _CS_POSIX_V7_WIDTH_RESTRICTED_ENVS,
   _CS_POSIX_V6_LPBIG_OFFBIG_LIBS,
   _CS_V7_ENV,
   _CS_POSIX_V7_LPBIG_OFFBIG_LIBS,
   _CS_POSIX_V6_LP64_OFF64_LDFLAGS,
   _CS_POSIX_V7_LP64_OFF64_LDFLAGS,
   _CS_POSIX_V7_LPBIG_OFFBIG_CFLAGS,
   _CS_POSIX_V7_ILP32_OFF32_LDFLAGS,
   _CS_V6_ENV,
   _CS_POSIX_V6_LP64_OFF64_LIBS,
   _CS_POSIX_V6_WIDTH_RESTRICTED_ENVS,
   __UNKNOWN_CONSTANT__,
   _CS_POSIX_V6_LP64_OFF64_CFLAGS,
   _CS_POSIX_V6_ILP32_OFF32_LIBS,
   _CS_POSIX_V6_ILP32_OFF32_LDFLAGS,
   _CS_POSIX_V6_ILP32_OFF32_CFLAGS,
   _CS_POSIX_V6_ILP32_OFFBIG_LDFLAGS,
   _CS_POSIX_V7_LPBIG_OFFBIG_LDFLAGS,
   _CS_POSIX_V7_ILP32_OFF32_LIBS,
   _CS_POSIX_V7_ILP32_OFFBIG_LIBS,
   _CS_POSIX_V7_LP64_OFF64_CFLAGS,
   _CS_POSIX_V6_LPBIG_OFFBIG_CFLAGS,
   _CS_POSIX_V7_ILP32_OFFBIG_CFLAGS;

   private static final ConstantResolver<Confstr> resolver = ConstantResolver.getResolver(Confstr.class, 20000, 29999);

   @Override
   public final long longValue() {
      return resolver.longValue(this);
   }

   @Override
   public final boolean defined() {
      return resolver.defined(this);
   }

   public final String description() {
      return resolver.description(this);
   }

   public static Confstr valueOf(long value) {
      return resolver.valueOf(value);
   }

   @Override
   public final int intValue() {
      return (int)resolver.longValue(this);
   }

   public final int value() {
      return (int)resolver.longValue(this);
   }

   @Override
   public final String toString() {
      return this.description();
   }
}
