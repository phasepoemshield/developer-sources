package jnr.constants.platform;

import jnr.constants.Constant;

// $VF: Compiled from RLIMIT.java
public enum RLIMIT implements Constant {
   RLIMIT_MEMLOCK,
   RLIMIT_RTPRIO,
   RLIMIT_FSIZE,
   __UNKNOWN_CONSTANT__,
   RLIMIT_RTTIME,
   RLIMIT_SIGPENDING,
   RLIMIT_CPU,
   RLIMIT_RSS,
   RLIMIT_OFILE,
   RLIMIT_NPROC,
   RLIMIT_NICE,
   RLIMIT_STACK,
   RLIMIT_NLIMITS,
   RLIMIT_LOCKS,
   RLIMIT_AS,
   RLIMIT_DATA,
   RLIMIT_NOFILE,
   RLIMIT_CORE,
   RLIMIT_MSGQUEUE;

   private static final ConstantResolver<RLIMIT> resolver = ConstantResolver.getResolver(RLIMIT.class, 20000, 29999);

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

   @Override
   public final int intValue() {
      return (int)resolver.longValue(this);
   }

   public final int value() {
      return (int)resolver.longValue(this);
   }

   public static RLIMIT valueOf(long value) {
      return resolver.valueOf(value);
   }

   @Override
   public final String toString() {
      return this.description();
   }
}
