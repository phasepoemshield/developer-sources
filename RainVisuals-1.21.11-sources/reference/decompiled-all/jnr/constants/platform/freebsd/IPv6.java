package jnr.constants.platform.freebsd;

import java.util.EnumMap;
import java.util.Map;
import jnr.constants.Constant;

// $VF: Compiled from IPv6.java
public enum IPv6 implements Constant {
   IPV6_DSTOPTS(50L),
   IPV6_V6ONLY(27L),
   IPV6_DONTFRAG(62L),
   IPV6_RECVPATHMTU(43L),
   IPV6_USE_MIN_MTU(42L),
   IPV6_RECVHOPOPTS(39L),
   IPV6_RECVPKTINFO(36L),
   IPV6_LEAVE_GROUP(13L),
   IPV6_RTHDRDSTOPTS(35L),
   IPV6_MULTICAST_HOPS(10L),
   IPV6_HOPLIMIT(47L),
   IPV6_JOIN_GROUP(12L),
   IPV6_RECVTCLASS(57L),
   IPV6_RECVRTHDR(38L),
   IPV6_RECVHOPLIMIT(37L),
   IPV6_MULTICAST_IF(9L),
   IPV6_UNICAST_HOPS(4L),
   IPV6_CHECKSUM(26L),
   IPV6_HOPOPTS(49L),
   IPV6_RTHDR(51L),
   IPV6_TCLASS(61L),
   IPV6_NEXTHOP(48L),
   IPV6_RECVDSTOPTS(40L),
   IPV6_RTHDR_TYPE_0(0L),
   IPV6_PATHMTU(44L),
   IPV6_PKTINFO(46L),
   IPV6_MULTICAST_LOOP(11L);

   public static final long MIN_VALUE = 0L;
   public static final long MAX_VALUE = 62L;
   private final long value;

   @Override
   public final int intValue() {
      return (int)this.value;
   }

   @Override
   public final String toString() {
      return IPv6.StringTable.descriptions.get(this);
   }

   @Override
   public final long longValue() {
      return this.value;
   }

   IPv6(long value) {
      this.value = value;
   }

   @Override
   public final boolean defined() {
      return true;
   }

   public final int value() {
      return (int)this.value;
   }

   // $VF: Compiled from IPv6.java
   static final class StringTable {
      public static final Map<IPv6, String> descriptions = generateTable();

      public static final Map<IPv6, String> generateTable() {
         Map<IPv6, String> map = new EnumMap<>(IPv6.class);
         map.put(IPv6.IPV6_JOIN_GROUP, "IPV6_JOIN_GROUP");
         map.put(IPv6.IPV6_LEAVE_GROUP, "IPV6_LEAVE_GROUP");
         map.put(IPv6.IPV6_MULTICAST_HOPS, "IPV6_MULTICAST_HOPS");
         map.put(IPv6.IPV6_MULTICAST_IF, "IPV6_MULTICAST_IF");
         map.put(IPv6.IPV6_MULTICAST_LOOP, "IPV6_MULTICAST_LOOP");
         map.put(IPv6.IPV6_UNICAST_HOPS, "IPV6_UNICAST_HOPS");
         map.put(IPv6.IPV6_V6ONLY, "IPV6_V6ONLY");
         map.put(IPv6.IPV6_CHECKSUM, "IPV6_CHECKSUM");
         map.put(IPv6.IPV6_DONTFRAG, "IPV6_DONTFRAG");
         map.put(IPv6.IPV6_DSTOPTS, "IPV6_DSTOPTS");
         map.put(IPv6.IPV6_HOPLIMIT, "IPV6_HOPLIMIT");
         map.put(IPv6.IPV6_HOPOPTS, "IPV6_HOPOPTS");
         map.put(IPv6.IPV6_NEXTHOP, "IPV6_NEXTHOP");
         map.put(IPv6.IPV6_PATHMTU, "IPV6_PATHMTU");
         map.put(IPv6.IPV6_PKTINFO, "IPV6_PKTINFO");
         map.put(IPv6.IPV6_RECVDSTOPTS, "IPV6_RECVDSTOPTS");
         map.put(IPv6.IPV6_RECVHOPLIMIT, "IPV6_RECVHOPLIMIT");
         map.put(IPv6.IPV6_RECVHOPOPTS, "IPV6_RECVHOPOPTS");
         map.put(IPv6.IPV6_RECVPKTINFO, "IPV6_RECVPKTINFO");
         map.put(IPv6.IPV6_RECVRTHDR, "IPV6_RECVRTHDR");
         map.put(IPv6.IPV6_RECVTCLASS, "IPV6_RECVTCLASS");
         map.put(IPv6.IPV6_RTHDR, "IPV6_RTHDR");
         map.put(IPv6.IPV6_RTHDRDSTOPTS, "IPV6_RTHDRDSTOPTS");
         map.put(IPv6.IPV6_RTHDR_TYPE_0, "IPV6_RTHDR_TYPE_0");
         map.put(IPv6.IPV6_RECVPATHMTU, "IPV6_RECVPATHMTU");
         map.put(IPv6.IPV6_TCLASS, "IPV6_TCLASS");
         map.put(IPv6.IPV6_USE_MIN_MTU, "IPV6_USE_MIN_MTU");
         return map;
      }
   }
}
