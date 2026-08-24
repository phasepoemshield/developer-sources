package jnr.constants.platform;

import jnr.constants.Constant;

// $VF: Compiled from IPv6.java
public enum IPv6 implements Constant {
   IPV6_RTHDR_TYPE_0,
   IPV6_RECVHOPOPTS,
   IPV6_DSTOPTS,
   IPV6_LEAVE_GROUP,
   IPV6_RECVHOPLIMIT,
   IPV6_HOPOPTS,
   IPV6_PKTINFO,
   IPV6_RTHDR,
   IPV6_PATHMTU,
   __UNKNOWN_CONSTANT__,
   IPV6_MULTICAST_IF,
   IPV6_CHECKSUM,
   IPV6_RECVPKTINFO,
   IPV6_RECVTCLASS,
   IPV6_USE_MIN_MTU,
   IPV6_HOPLIMIT,
   IPV6_MULTICAST_HOPS,
   IPV6_RECVDSTOPTS,
   IPV6_NEXTHOP,
   IPV6_V6ONLY,
   IPV6_UNICAST_HOPS,
   IPV6_DONTFRAG,
   IPV6_TCLASS,
   IPV6_RECVRTHDR,
   IPV6_RTHDRDSTOPTS,
   IPV6_RECVPATHMTU,
   IPV6_MULTICAST_LOOP,
   IPV6_JOIN_GROUP;

   private static final ConstantResolver<IPv6> resolver = ConstantResolver.getResolver(IPv6.class, 20000, 29999);

   public final int value() {
      return (int)resolver.longValue(this);
   }

   @Override
   public final boolean defined() {
      return resolver.defined(this);
   }

   public final String description() {
      return resolver.description(this);
   }

   @Override
   public final int intValue() {
      return (int)resolver.longValue(this);
   }

   public static IPv6 valueOf(long value) {
      return resolver.valueOf(value);
   }

   @Override
   public final long longValue() {
      return resolver.longValue(this);
   }

   @Override
   public final String toString() {
      return this.description();
   }
}
