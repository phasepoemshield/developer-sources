package jnr.constants.platform;

import jnr.constants.Constant;

// $VF: Compiled from IPProto.java
public enum IPProto implements Constant {
   IPPROTO_TP,
   IPPROTO_NONE,
   IPPROTO_ESP,
   IPPROTO_IGMP,
   IPPROTO_MAX,
   IPPROTO_ICMP,
   IPPROTO_MTP,
   IPPROTO_COMP,
   IPPROTO_IP,
   IPPROTO_TCP,
   IPPROTO_RSVP,
   IPPROTO_AH,
   IPPROTO_IDP,
   IPPROTO_FRAGMENT,
   IPPROTO_IPV6,
   IPPROTO_ICMPV6,
   IPPROTO_PUP,
   IPPROTO_RAW,
   IPPROTO_HOPOPTS,
   IPPROTO_SCTP,
   IPPROTO_UDP,
   IPPROTO_DSTOPTS,
   IPPROTO_EGP,
   IPPROTO_GRE,
   IPPROTO_ENCAP,
   IPPROTO_IPIP,
   __UNKNOWN_CONSTANT__,
   IPPROTO_ROUTING,
   IPPROTO_PIM;

   private static final ConstantResolver<IPProto> resolver = ConstantResolver.getResolver(IPProto.class, 20000, 29999);

   @Override
   public final int intValue() {
      return (int)resolver.longValue(this);
   }

   public final String description() {
      return resolver.description(this);
   }

   public final int value() {
      return (int)resolver.longValue(this);
   }

   public static IPProto valueOf(long value) {
      return resolver.valueOf(value);
   }

   @Override
   public final String toString() {
      return this.description();
   }

   @Override
   public final boolean defined() {
      return resolver.defined(this);
   }

   @Override
   public final long longValue() {
      return resolver.longValue(this);
   }
}
