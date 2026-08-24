package jnr.constants.platform;

import jnr.constants.Constant;

// $VF: Compiled from Shutdown.java
public enum Shutdown implements Constant {
   SHUT_WR,
   SHUT_RDWR,
   SHUT_RD,
   __UNKNOWN_CONSTANT__;

   private static final ConstantResolver<Shutdown> resolver = ConstantResolver.getResolver(Shutdown.class, 20000, 29999);

   public final String description() {
      return resolver.description(this);
   }

   public static Shutdown valueOf(long value) {
      return resolver.valueOf(value);
   }

   @Override
   public final boolean defined() {
      return resolver.defined(this);
   }

   @Override
   public final long longValue() {
      return resolver.longValue(this);
   }

   @Override
   public final String toString() {
      return this.description();
   }

   @Override
   public final int intValue() {
      return (int)resolver.longValue(this);
   }

   public final int value() {
      return (int)resolver.longValue(this);
   }
}
