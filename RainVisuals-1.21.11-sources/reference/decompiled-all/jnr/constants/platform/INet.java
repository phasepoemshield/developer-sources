package jnr.constants.platform;

import jnr.constants.Constant;

// $VF: Compiled from INet.java
public enum INet implements Constant {
   __UNKNOWN_CONSTANT__,
   INET_ADDRSTRLEN;

   private static final ConstantResolver<INet> resolver = ConstantResolver.getResolver(INet.class, 20000, 29999);

   @Override
   public final boolean defined() {
      return resolver.defined(this);
   }

   public static INet valueOf(long value) {
      return resolver.valueOf(value);
   }

   public final int value() {
      return (int)resolver.longValue(this);
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

   @Override
   public final long longValue() {
      return resolver.longValue(this);
   }
}
