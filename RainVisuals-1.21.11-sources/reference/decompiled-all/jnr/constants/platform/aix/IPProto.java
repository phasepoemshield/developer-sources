package jnr.constants.platform.aix;

import jnr.constants.Constant;

// $VF: Compiled from IPProto.java
public enum IPProto implements Constant {
   IPPROTO_IPIP(4L),
   IPPROTO_ROUTING(43L),
   IPPROTO_DSTOPTS(60L),
   IPPROTO_IDP(22L),
   IPPROTO_IGMP(2L),
   IPPROTO_FRAGMENT(44L),
   IPPROTO_EGP(8L),
   IPPROTO_HOPOPTS(0L),
   IPPROTO_GRE(47L),
   IPPROTO_AH(51L),
   IPPROTO_TP(29L),
   IPPROTO_SCTP(132L),
   IPPROTO_RSVP(46L),
   IPPROTO_MAX(256L),
   IPPROTO_ESP(50L),
   IPPROTO_TCP(6L),
   IPPROTO_UDP(17L),
   IPPROTO_NONE(59L),
   IPPROTO_PUP(12L),
   IPPROTO_RAW(255L),
   IPPROTO_IPV6(41L),
   IPPROTO_IP(0L),
   IPPROTO_ICMP(1L),
   IPPROTO_ICMPV6(58L);

   public static final long MAX_VALUE = 256L;
   public static final long MIN_VALUE = 0L;
   private final long value;

   @Override
   public final boolean defined() {
      return true;
   }

   IPProto(long value) {
      this.value = value;
   }

   @Override
   public final int intValue() {
      return (int)this.value;
   }

   @Override
   public final long longValue() {
      return this.value;
   }
}
