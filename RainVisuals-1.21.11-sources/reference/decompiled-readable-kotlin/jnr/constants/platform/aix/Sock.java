package jnr.constants.platform.aix;

import jnr.constants.Constant;

// $VF: Compiled from Sock.java
public enum Sock implements Constant {
   SOCK_SEQPACKET(5L),
   SOCK_RDM(4L),
   SOCK_DGRAM(2L),
   SOCK_STREAM(1L),
   SOCK_RAW(3L);

   private final long value;
   public static final long MIN_VALUE = 1L;
   public static final long MAX_VALUE = 5L;

   Sock(long value) {
      this.value = value;
   }

   @Override
   public final long longValue() {
      return this.value;
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
