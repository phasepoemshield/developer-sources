package jnr.constants.platform.fake;

import jnr.constants.Constant;

// $VF: Compiled from IPProto.java
public enum IPProto implements Constant {
   IPPROTO_ENCAP(23L),
   IPPROTO_FRAGMENT(14L),
   IPPROTO_DSTOPTS(21L),
   IPPROTO_TCP(6L),
   IPPROTO_IDP(10L),
   IPPROTO_PUP(8L),
   IPPROTO_ICMP(3L),
   IPPROTO_PIM(24L),
   IPPROTO_IP(1L),
   IPPROTO_IPIP(5L),
   IPPROTO_UDP(9L),
   IPPROTO_COMP(25L),
   IPPROTO_GRE(16L),
   IPPROTO_ROUTING(13L),
   IPPROTO_IPV6(12L),
   IPPROTO_NONE(20L),
   IPPROTO_ESP(17L),
   IPPROTO_HOPOPTS(2L),
   IPPROTO_MTP(22L),
   IPPROTO_TP(11L),
   IPPROTO_EGP(7L),
   IPPROTO_MAX(28L),
   IPPROTO_ICMPV6(19L),
   IPPROTO_AH(18L),
   IPPROTO_RSVP(15L),
   IPPROTO_IGMP(4L),
   IPPROTO_RAW(27L),
   IPPROTO_SCTP(26L);

   public static final long MAX_VALUE = 28L;
   private final long value;
   public static final long MIN_VALUE = 1L;

   @Override
   public final long longValue() {
      return this.value;
   }

   @Override
   public final boolean defined() {
      return true;
   }

   public final int value() {
      return (int)this.value;
   }

   IPProto(long value) {
      this.value = value;
   }

   @Override
   public final int intValue() {
      return (int)this.value;
   }
}
