package jnr.constants.platform;

import jnr.constants.Constant;

// $VF: Compiled from SocketMessage.java
public enum SocketMessage implements Constant {
   MSG_MORE,
   MSG_WAITALL,
   MSG_EOF,
   MSG_PROXY,
   MSG_SYN,
   MSG_RCVMORE,
   MSG_SEND,
   MSG_FASTOPEN,
   MSG_ERRQUEUE,
   MSG_HAVEMORE,
   MSG_PEEK,
   MSG_HOLD,
   MSG_EOR,
   MSG_OOB,
   MSG_COMPAT,
   MSG_NOSIGNAL,
   MSG_CTRUNC,
   MSG_CONFIRM,
   MSG_DONTWAIT,
   MSG_DONTROUTE,
   __UNKNOWN_CONSTANT__,
   MSG_FIN,
   MSG_RST,
   MSG_FLUSH,
   MSG_TRUNC;

   private static final ConstantResolver<SocketMessage> resolver = ConstantResolver.getResolver(SocketMessage.class, 20000, 29999);

   @Override
   public final boolean defined() {
      return resolver.defined(this);
   }

   public final String description() {
      return resolver.description(this);
   }

   public static SocketMessage valueOf(long value) {
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
   public final long longValue() {
      return resolver.longValue(this);
   }

   public final int value() {
      return (int)resolver.longValue(this);
   }
}
