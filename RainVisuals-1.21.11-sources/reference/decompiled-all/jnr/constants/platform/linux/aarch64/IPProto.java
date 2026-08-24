package jnr.constants.platform.linux.aarch64;

import java.util.EnumMap;
import java.util.Map;
import jnr.constants.Constant;

// $VF: Compiled from IPProto.java
public enum IPProto implements Constant {
   IPPROTO_EGP(8L),
   IPPROTO_ICMP(1L),
   IPPROTO_PIM(103L),
   IPPROTO_AH(51L),
   IPPROTO_FRAGMENT(44L),
   IPPROTO_TCP(6L),
   IPPROTO_ROUTING(43L),
   IPPROTO_ESP(50L),
   IPPROTO_IP(0L),
   IPPROTO_PUP(12L),
   IPPROTO_IPIP(4L),
   IPPROTO_COMP(108L),
   IPPROTO_UDP(17L),
   IPPROTO_MTP(92L),
   IPPROTO_IGMP(2L),
   IPPROTO_NONE(59L),
   IPPROTO_ENCAP(98L),
   IPPROTO_RAW(255L),
   IPPROTO_GRE(47L),
   IPPROTO_IPV6(41L),
   IPPROTO_DSTOPTS(60L),
   IPPROTO_SCTP(132L),
   IPPROTO_TP(29L),
   IPPROTO_IDP(22L),
   IPPROTO_ICMPV6(58L),
   IPPROTO_RSVP(46L),
   IPPROTO_HOPOPTS(0L);

   public static final long MAX_VALUE = 255L;
   private final long value;
   public static final long MIN_VALUE = 0L;

   @Override
   public final long longValue() {
      return this.value;
   }

   public final int value() {
      return (int)this.value;
   }

   @Override
   public final int intValue() {
      return (int)this.value;
   }

   @Override
   public final String toString() {
      return IPProto.StringTable.descriptions.get(this);
   }

   @Override
   public final boolean defined() {
      return true;
   }

   IPProto(long value) {
      this.value = value;
   }

   // $VF: Compiled from IPProto.java
   static final class StringTable {
      public static final Map<IPProto, String> descriptions = generateTable();

      public static final Map<IPProto, String> generateTable() {
         Map<IPProto, String> map = new EnumMap<>(IPProto.class);
         map.put(IPProto.IPPROTO_IP, "IPPROTO_IP");
         map.put(IPProto.IPPROTO_HOPOPTS, "IPPROTO_HOPOPTS");
         map.put(IPProto.IPPROTO_ICMP, "IPPROTO_ICMP");
         map.put(IPProto.IPPROTO_IGMP, "IPPROTO_IGMP");
         map.put(IPProto.IPPROTO_IPIP, "IPPROTO_IPIP");
         map.put(IPProto.IPPROTO_TCP, "IPPROTO_TCP");
         map.put(IPProto.IPPROTO_EGP, "IPPROTO_EGP");
         map.put(IPProto.IPPROTO_PUP, "IPPROTO_PUP");
         map.put(IPProto.IPPROTO_UDP, "IPPROTO_UDP");
         map.put(IPProto.IPPROTO_IDP, "IPPROTO_IDP");
         map.put(IPProto.IPPROTO_TP, "IPPROTO_TP");
         map.put(IPProto.IPPROTO_IPV6, "IPPROTO_IPV6");
         map.put(IPProto.IPPROTO_ROUTING, "IPPROTO_ROUTING");
         map.put(IPProto.IPPROTO_FRAGMENT, "IPPROTO_FRAGMENT");
         map.put(IPProto.IPPROTO_RSVP, "IPPROTO_RSVP");
         map.put(IPProto.IPPROTO_GRE, "IPPROTO_GRE");
         map.put(IPProto.IPPROTO_ESP, "IPPROTO_ESP");
         map.put(IPProto.IPPROTO_AH, "IPPROTO_AH");
         map.put(IPProto.IPPROTO_ICMPV6, "IPPROTO_ICMPV6");
         map.put(IPProto.IPPROTO_NONE, "IPPROTO_NONE");
         map.put(IPProto.IPPROTO_DSTOPTS, "IPPROTO_DSTOPTS");
         map.put(IPProto.IPPROTO_MTP, "IPPROTO_MTP");
         map.put(IPProto.IPPROTO_ENCAP, "IPPROTO_ENCAP");
         map.put(IPProto.IPPROTO_PIM, "IPPROTO_PIM");
         map.put(IPProto.IPPROTO_COMP, "IPPROTO_COMP");
         map.put(IPProto.IPPROTO_SCTP, "IPPROTO_SCTP");
         map.put(IPProto.IPPROTO_RAW, "IPPROTO_RAW");
         return map;
      }
   }
}
