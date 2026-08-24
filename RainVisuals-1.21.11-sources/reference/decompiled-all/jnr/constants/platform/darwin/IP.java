package jnr.constants.platform.darwin;

import java.util.EnumMap;
import java.util.Map;
import jnr.constants.Constant;

// $VF: Compiled from IP.java
public enum IP implements Constant {
   IP_HDRINCL(2L),
   IP_TOS(3L),
   IP_RECVTOS(27L),
   IP_MAX_MEMBERSHIPS(4095L),
   IP_DROP_MEMBERSHIP(13L),
   IP_ADD_MEMBERSHIP(12L),
   IP_RECVIF(20L),
   IP_RETOPTS(8L),
   IP_PKTINFO(26L),
   IP_MSFILTER(74L),
   IP_RECVTTL(24L),
   IP_MULTICAST_LOOP(11L),
   IP_RECVOPTS(5L),
   IP_MULTICAST_IF(9L),
   IP_UNBLOCK_SOURCE(73L),
   IP_PORTRANGE(19L),
   IP_RECVDSTADDR(7L),
   IP_IPSEC_POLICY(21L),
   IP_DEFAULT_MULTICAST_LOOP(1L),
   IP_ADD_SOURCE_MEMBERSHIP(70L),
   IP_RECVRETOPTS(6L),
   IP_DROP_SOURCE_MEMBERSHIP(71L),
   IP_OPTIONS(1L),
   IP_BLOCK_SOURCE(72L),
   IP_TTL(4L),
   IP_MULTICAST_TTL(10L),
   IP_DEFAULT_MULTICAST_TTL(1L);

   private final long value;
   public static final long MIN_VALUE = 1L;
   public static final long MAX_VALUE = 4095L;

   @Override
   public final boolean defined() {
      return true;
   }

   @Override
   public final String toString() {
      return IP.StringTable.descriptions.get(this);
   }

   IP(long value) {
      this.value = value;
   }

   @Override
   public final long longValue() {
      return this.value;
   }

   @Override
   public final int intValue() {
      return (int)this.value;
   }

   public final int value() {
      return (int)this.value;
   }

   // $VF: Compiled from IP.java
   static final class StringTable {
      public static final Map<IP, String> descriptions = generateTable();

      public static final Map<IP, String> generateTable() {
         Map<IP, String> map = new EnumMap<>(IP.class);
         map.put(IP.IP_OPTIONS, "IP_OPTIONS");
         map.put(IP.IP_HDRINCL, "IP_HDRINCL");
         map.put(IP.IP_TOS, "IP_TOS");
         map.put(IP.IP_TTL, "IP_TTL");
         map.put(IP.IP_RECVOPTS, "IP_RECVOPTS");
         map.put(IP.IP_RECVRETOPTS, "IP_RECVRETOPTS");
         map.put(IP.IP_RECVDSTADDR, "IP_RECVDSTADDR");
         map.put(IP.IP_RETOPTS, "IP_RETOPTS");
         map.put(IP.IP_RECVTTL, "IP_RECVTTL");
         map.put(IP.IP_RECVIF, "IP_RECVIF");
         map.put(IP.IP_PORTRANGE, "IP_PORTRANGE");
         map.put(IP.IP_MULTICAST_IF, "IP_MULTICAST_IF");
         map.put(IP.IP_MULTICAST_TTL, "IP_MULTICAST_TTL");
         map.put(IP.IP_MULTICAST_LOOP, "IP_MULTICAST_LOOP");
         map.put(IP.IP_ADD_MEMBERSHIP, "IP_ADD_MEMBERSHIP");
         map.put(IP.IP_DROP_MEMBERSHIP, "IP_DROP_MEMBERSHIP");
         map.put(IP.IP_DEFAULT_MULTICAST_TTL, "IP_DEFAULT_MULTICAST_TTL");
         map.put(IP.IP_DEFAULT_MULTICAST_LOOP, "IP_DEFAULT_MULTICAST_LOOP");
         map.put(IP.IP_MAX_MEMBERSHIPS, "IP_MAX_MEMBERSHIPS");
         map.put(IP.IP_PKTINFO, "IP_PKTINFO");
         map.put(IP.IP_RECVTOS, "IP_RECVTOS");
         map.put(IP.IP_IPSEC_POLICY, "IP_IPSEC_POLICY");
         map.put(IP.IP_UNBLOCK_SOURCE, "IP_UNBLOCK_SOURCE");
         map.put(IP.IP_BLOCK_SOURCE, "IP_BLOCK_SOURCE");
         map.put(IP.IP_ADD_SOURCE_MEMBERSHIP, "IP_ADD_SOURCE_MEMBERSHIP");
         map.put(IP.IP_DROP_SOURCE_MEMBERSHIP, "IP_DROP_SOURCE_MEMBERSHIP");
         map.put(IP.IP_MSFILTER, "IP_MSFILTER");
         return map;
      }
   }
}
