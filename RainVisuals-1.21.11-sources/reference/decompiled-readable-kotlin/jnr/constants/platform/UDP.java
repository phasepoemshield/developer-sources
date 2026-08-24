package jnr.constants.platform;

import jnr.constants.Constant;

// $VF: Compiled from UDP.java
public enum UDP implements Constant {
   UDP_CORK,
   __UNKNOWN_CONSTANT__;

   private static final ConstantResolver<UDP> resolver = ConstantResolver.getResolver(UDP.class, 20000, 29999);

   @Override
   public final long longValue() {
      return resolver.longValue(this);
   }

   public final String description() {
      return resolver.description(this);
   }

   @Override
   public final String toString() {
      return this.description();
   }

   @Override
   public final boolean defined() {
      return resolver.defined(this);
   }

   public final int value() {
      return (int)resolver.longValue(this);
   }

   public static UDP valueOf(long value) {
      return resolver.valueOf(value);
   }

   @Override
   public final int intValue() {
      return (int)resolver.longValue(this);
   }
}
