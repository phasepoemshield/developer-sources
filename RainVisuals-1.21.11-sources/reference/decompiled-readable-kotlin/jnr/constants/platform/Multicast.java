package jnr.constants.platform;

import jnr.constants.Constant;

// $VF: Compiled from Multicast.java
public enum Multicast implements Constant {
   MCAST_JOIN_GROUP,
   MCAST_JOIN_SOURCE_GROUP,
   MCAST_EXCLUDE,
   __UNKNOWN_CONSTANT__,
   MCAST_UNBLOCK_SOURCE,
   MCAST_MSFILTER,
   MCAST_BLOCK_SOURCE,
   MCAST_LEAVE_GROUP,
   MCAST_INCLUDE,
   MCAST_LEAVE_SOURCE_GROUP;

   private static final ConstantResolver<Multicast> resolver = ConstantResolver.getResolver(Multicast.class, 20000, 29999);

   @Override
   public final boolean defined() {
      return resolver.defined(this);
   }

   @Override
   public final int intValue() {
      return (int)resolver.longValue(this);
   }

   @Override
   public final long longValue() {
      return resolver.longValue(this);
   }

   @Override
   public final String toString() {
      return this.description();
   }

   public static Multicast valueOf(long value) {
      return resolver.valueOf(value);
   }

   public final int value() {
      return (int)resolver.longValue(this);
   }

   public final String description() {
      return resolver.description(this);
   }
}
