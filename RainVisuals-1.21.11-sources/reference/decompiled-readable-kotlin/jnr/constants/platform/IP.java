package jnr.constants.platform;

import jnr.constants.Constant;

// $VF: Compiled from IP.java
public enum IP implements Constant {
   IP_MTU,
   IP_TTL,
   IP_FREEBIND,
   IP_PKTINFO,
   IP_ADD_MEMBERSHIP,
   IP_PMTUDISC_DO,
   IP_BLOCK_SOURCE,
   IP_MULTICAST_IF,
   __UNKNOWN_CONSTANT__,
   IP_DROP_MEMBERSHIP,
   IP_RECVRETOPTS,
   IP_MTU_DISCOVER,
   IP_MAX_MEMBERSHIPS,
   IP_PMTUDISC_DONT,
   IP_MULTICAST_TTL,
   IP_ADD_SOURCE_MEMBERSHIP,
   IP_XFRM_POLICY,
   IP_OPTIONS,
   IP_ROUTER_ALERT,
   IP_PORTRANGE,
   IP_IPSEC_POLICY,
   IP_RECVDSTADDR,
   IP_DONTFRAG,
   IP_PASSSEC,
   IP_RETOPTS,
   IP_RECVOPTS,
   IP_DEFAULT_MULTICAST_TTL,
   IP_RECVTOS,
   IP_ONESBCAST,
   IP_RECVSLLA,
   IP_RECVIF,
   IP_RECVERR,
   IP_PKTOPTIONS,
   IP_DEFAULT_MULTICAST_LOOP,
   IP_DROP_SOURCE_MEMBERSHIP,
   IP_PMTUDISC_WANT,
   IP_RECVTTL,
   IP_MULTICAST_LOOP,
   IP_TRANSPARENT,
   IP_SENDSRCADDR,
   IP_UNBLOCK_SOURCE,
   IP_TOS,
   IP_HDRINCL,
   IP_MSFILTER,
   IP_MINTTL;

   private static final ConstantResolver<IP> resolver = ConstantResolver.getResolver(IP.class, 20000, 29999);

   public final String description() {
      return resolver.description(this);
   }

   public final int value() {
      return (int)resolver.longValue(this);
   }

   @Override
   public final int intValue() {
      return (int)resolver.longValue(this);
   }

   @Override
   public final boolean defined() {
      return resolver.defined(this);
   }

   public static IP valueOf(long value) {
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
