package jnr.constants.platform;

import jnr.constants.Constant;

// $VF: Compiled from InterfaceInfo.java
public enum InterfaceInfo implements Constant {
   IFF_802_1Q_VLAN,
   IFF_LINK2,
   IFF_STATICARP,
   IFF_LINK0,
   IFF_BROADCAST,
   IFF_PROMISC,
   IFF_MASTER_8023AD,
   IFF_DISABLE_NETPOLL,
   IFF_CANTCONFIG,
   IFF_SMART,
   IFF_BRIDGE_PORT,
   IFF_ECHO,
   IFF_EBRIDGE,
   IFF_PORTSEL,
   IFF_TEAM_PORT,
   IFF_ALTPHYS,
   IFF_AUTOMEDIA,
   IFF_POINTOPOINT,
   IFF_PPROMISC,
   IFF_LINK1,
   IFF_LOOPBACK,
   IFF_ISATAP,
   IFF_DORMANT,
   IFF_OACTIVE,
   IFF_MULTICAST,
   IFF_UNICAST_FLT,
   IFF_SUPP_NOFCS,
   IFF_NOTRAILERS,
   IFF_MONITOR,
   IFF_VOLATILE,
   IFF_BONDING,
   IFF_DEBUG,
   IFF_DYNAMIC,
   IFF_SLAVE_NEEDARP,
   IFF_RENAMING,
   IFF_SLAVE,
   IFF_SIMPLEX,
   IFF_LOWER_UP,
   __UNKNOWN_CONSTANT__,
   IFF_UP,
   IFF_DONT_BRIDGE,
   IFF_TX_SKB_SHARING,
   IFF_SLAVE_INACTIVE,
   IFF_DRV_RUNNING,
   IFF_MACVLAN_PORT,
   IFF_RUNNING,
   IFF_DYING,
   IFF_WAN_HDLC,
   IFF_ALLMULTI,
   IFF_DRV_OACTIVE,
   IFF_CANTCHANGE,
   IFF_MASTER_ARPMON,
   IFF_LIVE_ADDR_CHANGE,
   IFF_MASTER,
   IFF_XMIT_DST_RELEASE,
   IFF_MASTER_ALB,
   IFF_OVS_DATAPATH,
   IFF_ROUTE,
   IFF_NOARP;

   private static final ConstantResolver<InterfaceInfo> resolver = ConstantResolver.getResolver(InterfaceInfo.class, 20000, 29999);

   public final int value() {
      return (int)resolver.longValue(this);
   }

   @Override
   public final int intValue() {
      return (int)resolver.longValue(this);
   }

   public static InterfaceInfo valueOf(long value) {
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

   public final String description() {
      return resolver.description(this);
   }
}
