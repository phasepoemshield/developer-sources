package jnr.constants.platform.solaris;

import java.util.EnumMap;
import java.util.Map;
import jnr.constants.Constant;

// $VF: Compiled from IP.java
public enum IP implements Constant {
   IP_TTL(4L),
   IP_UNBLOCK_SOURCE(22L),
   IP_RECVDSTADDR(7L),
   IP_ADD_SOURCE_MEMBERSHIP(23L),
   IP_DROP_SOURCE_MEMBERSHIP(24L),
   IP_OPTIONS(1L),
   IP_BLOCK_SOURCE(21L),
   IP_RECVSLLA(10L),
   IP_MULTICAST_TTL(17L),
   IP_DEFAULT_MULTICAST_LOOP(1L),
   IP_TOS(3L),
   IP_RECVOPTS(5L),
   IP_RECVIF(9L),
   IP_PKTINFO(26L),
   IP_MULTICAST_IF(16L),
   IP_MULTICAST_LOOP(18L),
   IP_RETOPTS(8L),
   IP_ADD_MEMBERSHIP(19L),
   IP_DONTFRAG(27L),
   IP_HDRINCL(2L),
   IP_RECVTTL(11L),
   IP_DROP_MEMBERSHIP(20L),
   IP_RECVRETOPTS(6L),
   IP_DEFAULT_MULTICAST_TTL(1L);

   public static final long MIN_VALUE = 1L;
   public static final long MAX_VALUE = 27L;
   private final long value;

   @Override
   public final long longValue() {
      return this.value;
   }

   @Override
   public final int intValue() {
      return (int)this.value;
   }

   @Override
   public final boolean defined() {
      return true;
   }

   IP(long value) {
      this.value = value;
   }

   @Override
   public final String toString() {
      return IP.StringTable.descriptions.get(this);
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
         map.put(IP.IP_DONTFRAG, "IP_DONTFRAG");
         map.put(IP.IP_RECVTTL, "IP_RECVTTL");
         map.put(IP.IP_RECVIF, "IP_RECVIF");
         map.put(IP.IP_RECVSLLA, "IP_RECVSLLA");
         map.put(IP.IP_MULTICAST_IF, "IP_MULTICAST_IF");
         map.put(IP.IP_MULTICAST_TTL, "IP_MULTICAST_TTL");
         map.put(IP.IP_MULTICAST_LOOP, "IP_MULTICAST_LOOP");
         map.put(IP.IP_ADD_MEMBERSHIP, "IP_ADD_MEMBERSHIP");
         map.put(IP.IP_DROP_MEMBERSHIP, "IP_DROP_MEMBERSHIP");
         map.put(IP.IP_DEFAULT_MULTICAST_TTL, "IP_DEFAULT_MULTICAST_TTL");
         map.put(IP.IP_DEFAULT_MULTICAST_LOOP, "IP_DEFAULT_MULTICAST_LOOP");
         map.put(IP.IP_PKTINFO, "IP_PKTINFO");
         map.put(IP.IP_UNBLOCK_SOURCE, "IP_UNBLOCK_SOURCE");
         map.put(IP.IP_BLOCK_SOURCE, "IP_BLOCK_SOURCE");
         map.put(IP.IP_ADD_SOURCE_MEMBERSHIP, "IP_ADD_SOURCE_MEMBERSHIP");
         map.put(IP.IP_DROP_SOURCE_MEMBERSHIP, "IP_DROP_SOURCE_MEMBERSHIP");
         return map;
      }
   }
}
