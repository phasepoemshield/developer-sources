package jnr.constants.platform.windows;

import java.util.EnumMap;
import java.util.Map;
import jnr.constants.Constant;

// $VF: Compiled from IPProto.java
public enum IPProto implements Constant {
   IPPROTO_FRAGMENT(44L),
   IPPROTO_ICMPV6(58L),
   IPPROTO_RAW(255L),
   IPPROTO_SCTP(132L),
   IPPROTO_PIM(103L),
   IPPROTO_MAX(256L),
   IPPROTO_UDP(17L),
   IPPROTO_EGP(8L),
   IPPROTO_AH(51L),
   IPPROTO_PUP(12L),
   IPPROTO_NONE(59L),
   IPPROTO_IDP(22L),
   IPPROTO_IGMP(2L),
   IPPROTO_DSTOPTS(60L),
   IPPROTO_TCP(6L),
   IPPROTO_IP(0L),
   IPPROTO_IPV6(41L),
   IPPROTO_ROUTING(43L),
   IPPROTO_ESP(50L),
   IPPROTO_HOPOPTS(0L),
   IPPROTO_ICMP(1L);

   public static final long MIN_VALUE = 0L;
   public static final long MAX_VALUE = 256L;
   private final long value;

   @Override
   public final long longValue() {
      return this.value;
   }

   public final int value() {
      return (int)this.value;
   }

   IPProto(long value) {
      this.value = value;
   }

   @Override
   public final boolean defined() {
      return true;
   }

   @Override
   public final int intValue() {
      return (int)this.value;
   }

   @Override
   public final String toString() {
      return IPProto.StringTable.descriptions.get(this);
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
         map.put(IPProto.IPPROTO_TCP, "IPPROTO_TCP");
         map.put(IPProto.IPPROTO_EGP, "IPPROTO_EGP");
         map.put(IPProto.IPPROTO_PUP, "IPPROTO_PUP");
         map.put(IPProto.IPPROTO_UDP, "IPPROTO_UDP");
         map.put(IPProto.IPPROTO_IDP, "IPPROTO_IDP");
         map.put(IPProto.IPPROTO_IPV6, "IPPROTO_IPV6");
         map.put(IPProto.IPPROTO_ROUTING, "IPPROTO_ROUTING");
         map.put(IPProto.IPPROTO_FRAGMENT, "IPPROTO_FRAGMENT");
         map.put(IPProto.IPPROTO_ESP, "IPPROTO_ESP");
         map.put(IPProto.IPPROTO_AH, "IPPROTO_AH");
         map.put(IPProto.IPPROTO_ICMPV6, "IPPROTO_ICMPV6");
         map.put(IPProto.IPPROTO_NONE, "IPPROTO_NONE");
         map.put(IPProto.IPPROTO_DSTOPTS, "IPPROTO_DSTOPTS");
         map.put(IPProto.IPPROTO_PIM, "IPPROTO_PIM");
         map.put(IPProto.IPPROTO_SCTP, "IPPROTO_SCTP");
         map.put(IPProto.IPPROTO_RAW, "IPPROTO_RAW");
         map.put(IPProto.IPPROTO_MAX, "IPPROTO_MAX");
         return map;
      }
   }
}
