package jnr.constants.platform;

import jnr.constants.Constant;

// $VF: Compiled from AddressInfo.java
public enum AddressInfo implements Constant {
   AI_NUMERICSERV,
   AI_CANONNAME,
   AI_NUMERICHOST,
   AI_ALL,
   AI_ADDRCONFIG,
   AI_MASK,
   AI_DEFAULT,
   __UNKNOWN_CONSTANT__,
   AI_V4MAPPED_CFG,
   AI_PASSIVE,
   AI_V4MAPPED;

   private static final ConstantResolver<AddressInfo> resolver = ConstantResolver.getResolver(AddressInfo.class, 20000, 29999);

   public final String description() {
      return resolver.description(this);
   }

   @Override
   public final String toString() {
      return this.description();
   }

   @Override
   public final long longValue() {
      return resolver.longValue(this);
   }

   public final int value() {
      return (int)resolver.longValue(this);
   }

   @Override
   public final boolean defined() {
      return resolver.defined(this);
   }

   @Override
   public final int intValue() {
      return (int)resolver.longValue(this);
   }

   public static AddressInfo valueOf(long value) {
      return resolver.valueOf(value);
   }
}
