package jnr.constants.platform.fake;

import jnr.constants.Constant;

// $VF: Compiled from Sock.java
public enum Sock implements Constant {
   SOCK_STREAM(1L),
   SOCK_RAW(3L),
   SOCK_RDM(4L),
   SOCK_CLOEXEC(7L),
   SOCK_SEQPACKET(5L),
   SOCK_MAXADDRLEN(8L),
   SOCK_NONBLOCK(6L),
   SOCK_DGRAM(2L);

   public static final long MIN_VALUE = 1L;
   public static final long MAX_VALUE = 8L;
   private final long value;

   public final int value() {
      return (int)this.value;
   }

   Sock(long value) {
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
