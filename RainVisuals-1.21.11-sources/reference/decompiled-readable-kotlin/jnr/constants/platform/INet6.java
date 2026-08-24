package jnr.constants.platform;

import jnr.constants.Constant;

// $VF: Compiled from INet6.java
public enum INet6 implements Constant {
   INET6_ADDRSTRLEN,
   __UNKNOWN_CONSTANT__;

   private static final ConstantResolver<INet6> resolver = ConstantResolver.getResolver(INet6.class, 20000, 29999);

   public static INet6 valueOf(long value) {
      return resolver.valueOf(value);
   }

   @Override
   public final int intValue() {
      return (int)resolver.longValue(this);
   }

   public final String description() {
      return resolver.description(this);
   }

   @Override
   public final long longValue() {
      return resolver.longValue(this);
   }

   public final int value() {
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
