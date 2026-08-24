package jnr.constants.platform.fake;

import jnr.constants.Constant;

// $VF: Compiled from AddressFamily.java
public enum AddressFamily implements Constant {
   pseudo_AF_XTP(22L),
   AF_INET(4L),
   AF_DATAKIT(12L),
   AF_ALG(52L),
   AF_PUP(6L),
   AF_IMPLINK(5L),
   AF_COIP(23L),
   AF_SYSTEM(35L),
   AF_ECMA(11L),
   AF_CAN(49L),
   AF_INET6(33L),
   AF_DLI(16L),
   AF_PPP(37L),
   AF_SNA(14L),
   AF_TIPC(50L),
   AF_IB(47L),
   AF_MPLS(48L),
   AF_AX25(41L),
   AF_NATM(34L),
   AF_OSI(10L),
   pseudo_AF_HDRCMPLT(39L),
   AF_ROUTE(20L),
   AF_SIP(27L),
   AF_LLC(46L),
   AF_RDS(44L),
   AF_LOCAL(2L),
   pseudo_AF_RTIP(25L),
   AF_CNT(24L),
   AF_NS(8L),
   AF_CHAOS(7L),
   AF_CCITT(13L),
   pseudo_AF_PIP(28L),
   AF_KEY(42L),
   AF_ISO(9L),
   AF_BLUETOOTH(51L),
   AF_NETLINK(43L),
   AF_NDRV(29L),
   pseudo_AF_KEY(32L),
   AF_IPX(26L),
   AF_LAT(17L),
   AF_MAX(56L),
   AF_XDP(55L),
   AF_HYLINK(18L),
   AF_DECnet(15L),
   AF_UNIX(3L),
   AF_UNSPEC(1L),
   AF_NETGRAPH(40L),
   AF_PPPOX(45L),
   AF_APPLETALK(19L),
   AF_KCM(54L),
   AF_NETBIOS(36L),
   AF_E164(31L),
   AF_VSOCK(53L),
   AF_ATM(38L),
   AF_ISDN(30L),
   AF_LINK(21L);

   public static final long MIN_VALUE = 1L;
   public static final long MAX_VALUE = 56L;
   private final long value;

   public final int value() {
      return (int)this.value;
   }

   @Override
   public final long longValue() {
      return this.value;
   }

   AddressFamily(long value) {
      this.value = value;
   }

   @Override
   public final int intValue() {
      return (int)this.value;
   }

   @Override
   public final boolean defined() {
      return true;
   }
}
