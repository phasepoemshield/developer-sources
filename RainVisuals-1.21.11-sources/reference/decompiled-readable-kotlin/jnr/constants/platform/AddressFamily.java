package jnr.constants.platform;

import jnr.constants.Constant;

// $VF: Compiled from AddressFamily.java
public enum AddressFamily implements Constant {
   AF_KCM,
   AF_KEY,
   AF_IMPLINK,
   AF_CCITT,
   AF_NS,
   AF_INET6,
   AF_NETGRAPH,
   AF_CAN,
   AF_ROUTE,
   AF_ATM,
   AF_AX25,
   AF_PUP,
   AF_NETBIOS,
   AF_SNA,
   pseudo_AF_XTP,
   AF_MPLS,
   AF_ISDN,
   AF_BLUETOOTH,
   AF_LLC,
   __UNKNOWN_CONSTANT__,
   AF_CHAOS,
   AF_ECMA,
   AF_DLI,
   AF_TIPC,
   AF_LAT,
   AF_PPP,
   AF_MAX,
   AF_E164,
   AF_UNIX,
   AF_APPLETALK,
   AF_CNT,
   AF_SIP,
   AF_NDRV,
   AF_OSI,
   AF_PPPOX,
   pseudo_AF_HDRCMPLT,
   AF_NETLINK,
   AF_SYSTEM,
   AF_LINK,
   AF_UNSPEC,
   AF_HYLINK,
   pseudo_AF_RTIP,
   AF_VSOCK,
   AF_ISO,
   AF_IB,
   AF_IPX,
   AF_COIP,
   AF_ALG,
   AF_INET,
   AF_DATAKIT,
   pseudo_AF_KEY,
   AF_XDP,
   AF_DECnet,
   pseudo_AF_PIP,
   AF_NATM,
   AF_RDS,
   AF_LOCAL;

   private static final ConstantResolver<AddressFamily> resolver = ConstantResolver.getResolver(AddressFamily.class, 20000, 29999);

   public final int value() {
      return (int)resolver.longValue(this);
   }

   @Override
   public final long longValue() {
      return resolver.longValue(this);
   }

   @Override
   public final int intValue() {
      return (int)resolver.longValue(this);
   }

   public static AddressFamily valueOf(long value) {
      return resolver.valueOf(value);
   }

   public final String description() {
      return resolver.description(this);
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
