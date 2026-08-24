package jnr.constants.platform;

import jnr.constants.Constant;

// $VF: Compiled from Sock.java
public enum Sock implements Constant {
   SOCK_MAXADDRLEN,
   SOCK_RDM,
   __UNKNOWN_CONSTANT__,
   SOCK_SEQPACKET,
   SOCK_RAW,
   SOCK_CLOEXEC,
   SOCK_STREAM,
   SOCK_DGRAM,
   SOCK_NONBLOCK;

   private static final ConstantResolver<Sock> resolver = ConstantResolver.getResolver(Sock.class, 20000, 29999);

   public final int value() {
      return (int)resolver.longValue(this);
   }

   @Override
   public final long longValue() {
      return resolver.longValue(this);
   }

   @Override
   public final boolean defined() {
      return resolver.defined(this);
   }

   public static Sock valueOf(long value) {
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

   public final String description() {
      return resolver.description(this);
   }
}
