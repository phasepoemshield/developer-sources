package jnr.constants.platform.aix;

import jnr.constants.Constant;

// $VF: Compiled from SocketOption.java
public enum SocketOption implements Constant {
   SO_RCVBUF(4098L),
   SO_ERROR(4103L),
   SO_SNDLOWAT(4099L),
   SO_REUSEPORT(512L),
   SO_REUSEADDR(4L),
   SO_SNDTIMEO(4101L),
   SO_KEEPALIVE(8L),
   SO_LINGER(128L),
   SO_RCVTIMEO(4102L),
   SO_OOBINLINE(256L),
   SO_RCVLOWAT(4100L),
   SO_BROADCAST(32L),
   SO_DONTROUTE(16L),
   SO_SNDBUF(4097L),
   SO_USELOOPBACK(64L),
   SO_TYPE(4104L),
   SO_ACCEPTCONN(2L),
   SO_DEBUG(1L);

   public static final long MIN_VALUE = 1L;
   private final long value;
   public static final long MAX_VALUE = 4104L;

   @Override
   public final boolean defined() {
      return true;
   }

   @Override
   public final int intValue() {
      return (int)this.value;
   }

   @Override
   public final long longValue() {
      return this.value;
   }

   SocketOption(long value) {
      this.value = value;
   }
}
