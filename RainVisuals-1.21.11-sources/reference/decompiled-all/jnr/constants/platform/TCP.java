package jnr.constants.platform;

import jnr.constants.Constant;

// $VF: Compiled from TCP.java
public enum TCP implements Constant {
   TCP_INFO,
   TCP_MAX_SACK,
   TCP_KEEPALIVE,
   TCP_NOOPT,
   TCP_THIN_LINEAR_TIMEOUTS,
   TCP_REPAIR_QUEUE,
   TCP_MAXBURST,
   TCP_COOKIE_TRANSACTIONS,
   __UNKNOWN_CONSTANT__,
   TCP_CONGESTION,
   TCP_RETRANSHZ,
   TCP_QUICKACK,
   TCP_DEFER_ACCEPT,
   TCP_SYNCNT,
   TCP_MINMSSOVERLOAD,
   TCP_MINMSS,
   TCP_FASTOPEN,
   TCP_MAXHLEN,
   TCP_KEEPIDLE,
   TCP_KEEPCNT,
   TCP_THIN_DUPACK,
   TCP_MD5SIG,
   TCP_WINDOW_CLAMP,
   TCP_KEEPINTVL,
   TCP_MAXWIN,
   TCP_USER_TIMEOUT,
   TCP_TIMESTAMP,
   TCP_MAXSEG,
   TCP_CORK,
   TCP_REPAIR_OPTIONS,
   TCP_MAXOLEN,
   TCP_NODELAY,
   TCP_NOPUSH,
   TCP_MAX_WINSHIFT,
   TCP_REPAIR,
   TCP_MSS,
   TCP_QUEUE_SEQ,
   TCP_NSTATES,
   TCP_LINGER2;

   private static final ConstantResolver<TCP> resolver = ConstantResolver.getResolver(TCP.class, 20000, 29999);

   @Override
   public final long longValue() {
      return resolver.longValue(this);
   }

   public final int value() {
      return (int)resolver.longValue(this);
   }

   @Override
   public final boolean defined() {
      return resolver.defined(this);
   }

   public static TCP valueOf(long value) {
      return resolver.valueOf(value);
   }

   public final String description() {
      return resolver.description(this);
   }

   @Override
   public final int intValue() {
      return (int)resolver.longValue(this);
   }

   @Override
   public final String toString() {
      return this.description();
   }
}
