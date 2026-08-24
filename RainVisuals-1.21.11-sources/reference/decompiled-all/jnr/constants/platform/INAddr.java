package jnr.constants.platform;

import jnr.constants.Constant;

// $VF: Compiled from INAddr.java
public enum INAddr implements Constant {
   INADDR_NONE,
   INADDR_BROADCAST,
   INADDR_LOOPBACK,
   __UNKNOWN_CONSTANT__,
   INADDR_UNSPEC_GROUP,
   INADDR_ALLHOSTS_GROUP,
   INADDR_MAX_LOCAL_GROUP,
   INADDR_ALLRTRS_GROUP,
   INADDR_ANY;

   private static final ConstantResolver<INAddr> resolver = ConstantResolver.getResolver(INAddr.class, 20000, 29999);

   public final int value() {
      return (int)resolver.longValue(this);
   }

   public static INAddr valueOf(long value) {
      return resolver.valueOf(value);
   }

   public final String description() {
      return resolver.description(this);
   }

   @Override
   public final long longValue() {
      return resolver.longValue(this);
   }

   @Override
   public final boolean defined() {
      return resolver.defined(this);
   }

   @Override
   public final String toString() {
      return this.description();
   }

   @Override
   public final int intValue() {
      return (int)resolver.longValue(this);
   }
}
