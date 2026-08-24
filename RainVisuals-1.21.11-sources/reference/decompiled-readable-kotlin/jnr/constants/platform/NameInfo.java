package jnr.constants.platform;

import jnr.constants.Constant;

// $VF: Compiled from NameInfo.java
public enum NameInfo implements Constant {
   NI_DGRAM,
   NI_NUMERICSERV,
   __UNKNOWN_CONSTANT__,
   NI_NAMEREQD,
   NI_NOFQDN,
   NI_NUMERICHOST,
   NI_WITHSCOPEID,
   NI_MAXSERV,
   NI_MAXHOST;

   private static final ConstantResolver<NameInfo> resolver = ConstantResolver.getResolver(NameInfo.class, 20000, 29999);

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
   public final boolean defined() {
      return resolver.defined(this);
   }

   @Override
   public final String toString() {
      return this.description();
   }

   public static NameInfo valueOf(long value) {
      return resolver.valueOf(value);
   }

   @Override
   public final int intValue() {
      return (int)resolver.longValue(this);
   }
}
