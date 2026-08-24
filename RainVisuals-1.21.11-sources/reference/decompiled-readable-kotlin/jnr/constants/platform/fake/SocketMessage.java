package jnr.constants.platform.fake;

import jnr.constants.Constant;

// $VF: Compiled from SocketMessage.java
public enum SocketMessage implements Constant {
   MSG_EOR(5L),
   MSG_NOSIGNAL(15L),
   MSG_EOF(18L),
   MSG_COMPAT(24L),
   MSG_WAITALL(8L),
   MSG_CTRUNC(7L),
   MSG_SYN(11L),
   MSG_FASTOPEN(17L),
   MSG_RCVMORE(23L),
   MSG_DONTWAIT(1L),
   MSG_OOB(2L),
   MSG_FLUSH(19L),
   MSG_ERRQUEUE(14L),
   MSG_SEND(21L),
   MSG_CONFIRM(12L),
   MSG_HAVEMORE(22L),
   MSG_RST(13L),
   MSG_MORE(16L),
   MSG_PROXY(9L),
   MSG_FIN(10L),
   MSG_PEEK(3L),
   MSG_HOLD(20L),
   MSG_TRUNC(6L),
   MSG_DONTROUTE(4L);

   private final long value;
   public static final long MAX_VALUE = 24L;
   public static final long MIN_VALUE = 1L;

   @Override
   public final int intValue() {
      return (int)this.value;
   }

   @Override
   public final boolean defined() {
      return true;
   }

   SocketMessage(long value) {
      this.value = value;
   }

   public final int value() {
      return (int)this.value;
   }

   @Override
   public final long longValue() {
      return this.value;
   }
}
