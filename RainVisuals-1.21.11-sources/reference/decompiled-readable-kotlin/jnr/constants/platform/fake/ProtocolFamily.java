package jnr.constants.platform.fake;

import jnr.constants.Constant;

// $VF: Compiled from ProtocolFamily.java
public enum ProtocolFamily implements Constant {
   PF_DATAKIT(12L),
   PF_RDS(40L),
   PF_UNSPEC(1L),
   PF_LAT(17L),
   PF_ISDN(30L),
   PF_PPP(36L),
   PF_CCITT(13L),
   PF_LINK(21L),
   PF_DECnet(15L),
   PF_LLC(42L),
   PF_INET(4L),
   PF_PUP(6L),
   PF_ECMA(11L),
   PF_INET6(32L),
   PF_CAN(45L),
   PF_BLUETOOTH(47L),
   PF_IB(43L),
   PF_IPX(26L),
   PF_NETBIOS(35L),
   PF_KEY(31L),
   PF_MAX(52L),
   PF_NETLINK(39L),
   PF_COIP(23L),
   PF_PPPOX(41L),
   PF_CHAOS(7L),
   PF_OSI(10L),
   PF_ALG(48L),
   PF_DLI(16L),
   PF_ROUTE(20L),
   PF_NATM(33L),
   PF_XTP(22L),
   PF_IMPLINK(5L),
   PF_ATM(37L),
   PF_UNIX(3L),
   PF_PIP(28L),
   PF_RTIP(27L),
   PF_SYSTEM(34L),
   PF_TIPC(46L),
   PF_VSOCK(49L),
   PF_NS(8L),
   PF_ISO(9L),
   PF_NDRV(29L),
   PF_APPLETALK(19L),
   PF_KCM(50L),
   PF_CNT(24L),
   PF_MPLS(44L),
   PF_HYLINK(18L),
   PF_XDP(51L),
   PF_SNA(14L),
   PF_SIP(25L),
   PF_NETGRAPH(38L),
   PF_LOCAL(2L);

   public static final long MAX_VALUE = 52L;
   private final long value;
   public static final long MIN_VALUE = 1L;

   @Override
   public final boolean defined() {
      return true;
   }

   @Override
   public final int intValue() {
      return (int)this.value;
   }

   public final int value() {
      return (int)this.value;
   }

   ProtocolFamily(long value) {
      this.value = value;
   }

   @Override
   public final long longValue() {
      return this.value;
   }
}
