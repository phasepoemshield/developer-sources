package jnr.constants.platform;

import jnr.constants.Constant;

// $VF: Compiled from SocketLevel.java
public enum SocketLevel implements Constant {
   SOL_SOCKET,
   SOL_IP,
   SOL_TCP,
   SOL_IPV6,
   SOL_UDP,
   __UNKNOWN_CONSTANT__;

   private static final ConstantResolver<SocketLevel> resolver = ConstantResolver.getResolver(SocketLevel.class, 20000, 29999);

   public final int value() {
      return (int)resolver.longValue(this);
   }

   @Override
   public final long longValue() {
      return resolver.longValue(this);
   }

   public final String description() {
      return resolver.description(this);
   }

   public static SocketLevel valueOf(long value) {
      return resolver.valueOf(value);
   }

   @Override
   public final int intValue() {
      return (int)resolver.longValue(this);
   }

   @Override
   public final String toString() {
      return this.description();
   }

   @Override
   public final boolean defined() {
      return resolver.defined(this);
   }
}
