package jnr.constants.platform;

import jnr.constants.Constant;

// $VF: Compiled from ProtocolFamily.java
public enum ProtocolFamily implements Constant {
   PF_DLI,
   PF_APPLETALK,
   PF_PPP,
   PF_MAX,
   PF_CCITT,
   PF_TIPC,
   PF_PPPOX,
   PF_KEY,
   PF_UNIX,
   PF_SNA,
   PF_DECnet,
   PF_PIP,
   PF_RDS,
   PF_ALG,
   PF_VSOCK,
   PF_INET,
   PF_RTIP,
   PF_SIP,
   PF_LOCAL,
   PF_LAT,
   PF_ECMA,
   PF_ISO,
   PF_INET6,
   PF_XTP,
   PF_IMPLINK,
   PF_IB,
   PF_UNSPEC,
   __UNKNOWN_CONSTANT__,
   PF_ROUTE,
   PF_CHAOS,
   PF_LLC,
   PF_COIP,
   PF_MPLS,
   PF_OSI,
   PF_ISDN,
   PF_CNT,
   PF_NETGRAPH,
   PF_CAN,
   PF_NETLINK,
   PF_SYSTEM,
   PF_ATM,
   PF_DATAKIT,
   PF_HYLINK,
   PF_BLUETOOTH,
   PF_XDP,
   PF_NETBIOS,
   PF_IPX,
   PF_KCM,
   PF_LINK,
   PF_PUP,
   PF_NDRV,
   PF_NS,
   PF_NATM;

   private static final ConstantResolver<ProtocolFamily> resolver = ConstantResolver.getResolver(ProtocolFamily.class, 20000, 29999);

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

   @Override
   public final long longValue() {
      return resolver.longValue(this);
   }

   public static ProtocolFamily valueOf(long value) {
      return resolver.valueOf(value);
   }

   @Override
   public final String toString() {
      return this.description();
   }

   public final String description() {
      return resolver.description(this);
   }
}
