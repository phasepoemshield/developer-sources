package jnr.constants.platform.linux.mips64el;

import java.util.EnumMap;
import java.util.Map;
import jnr.constants.Constant;

// $VF: Compiled from IP.java
public enum IP implements Constant {
   IP_PASSSEC(18L),
   IP_MULTICAST_LOOP(34L),
   IP_ADD_MEMBERSHIP(35L),
   IP_RETOPTS(7L),
   IP_DEFAULT_MULTICAST_TTL(1L),
   IP_RECVOPTS(6L),
   IP_TRANSPARENT(19L),
   IP_RECVERR(11L),
   IP_DROP_MEMBERSHIP(36L),
   IP_PMTUDISC_DONT(0L),
   IP_TOS(1L),
   IP_PKTOPTIONS(9L),
   IP_IPSEC_POLICY(16L),
   IP_MINTTL(21L),
   IP_MTU(14L),
   IP_RECVTTL(12L),
   IP_DROP_SOURCE_MEMBERSHIP(40L),
   IP_MTU_DISCOVER(10L),
   IP_OPTIONS(4L),
   IP_PKTINFO(8L),
   IP_UNBLOCK_SOURCE(37L),
   IP_MULTICAST_IF(32L),
   IP_PMTUDISC_WANT(1L),
   IP_MAX_MEMBERSHIPS(20L),
   IP_ROUTER_ALERT(5L),
   IP_FREEBIND(15L),
   IP_RECVRETOPTS(7L),
   IP_MULTICAST_TTL(33L),
   IP_BLOCK_SOURCE(38L),
   IP_HDRINCL(3L),
   IP_MSFILTER(41L),
   IP_PMTUDISC_DO(2L),
   IP_RECVTOS(13L),
   IP_XFRM_POLICY(17L),
   IP_DEFAULT_MULTICAST_LOOP(1L),
   IP_TTL(2L),
   IP_ADD_SOURCE_MEMBERSHIP(39L);

   private final long value;
   public static final long MIN_VALUE = 0L;
   public static final long MAX_VALUE = 41L;

   @Override
   public final boolean defined() {
      return true;
   }

   @Override
   public final int intValue() {
      return (int)this.value;
   }

   IP(long value) {
      this.value = value;
   }

   @Override
   public final long longValue() {
      return this.value;
   }

   public final int value() {
      return (int)this.value;
   }

   @Override
   public final String toString() {
      return IP.StringTable.descriptions.get(this);
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
         map.put(IP.IP_RETOPTS, "IP_RETOPTS");
         map.put(IP.IP_MINTTL, "IP_MINTTL");
         map.put(IP.IP_RECVTTL, "IP_RECVTTL");
         map.put(IP.IP_MULTICAST_IF, "IP_MULTICAST_IF");
         map.put(IP.IP_MULTICAST_TTL, "IP_MULTICAST_TTL");
         map.put(IP.IP_MULTICAST_LOOP, "IP_MULTICAST_LOOP");
         map.put(IP.IP_ADD_MEMBERSHIP, "IP_ADD_MEMBERSHIP");
         map.put(IP.IP_DROP_MEMBERSHIP, "IP_DROP_MEMBERSHIP");
         map.put(IP.IP_DEFAULT_MULTICAST_TTL, "IP_DEFAULT_MULTICAST_TTL");
         map.put(IP.IP_DEFAULT_MULTICAST_LOOP, "IP_DEFAULT_MULTICAST_LOOP");
         map.put(IP.IP_MAX_MEMBERSHIPS, "IP_MAX_MEMBERSHIPS");
         map.put(IP.IP_ROUTER_ALERT, "IP_ROUTER_ALERT");
         map.put(IP.IP_PKTINFO, "IP_PKTINFO");
         map.put(IP.IP_PKTOPTIONS, "IP_PKTOPTIONS");
         map.put(IP.IP_MTU_DISCOVER, "IP_MTU_DISCOVER");
         map.put(IP.IP_RECVERR, "IP_RECVERR");
         map.put(IP.IP_RECVTOS, "IP_RECVTOS");
         map.put(IP.IP_MTU, "IP_MTU");
         map.put(IP.IP_FREEBIND, "IP_FREEBIND");
         map.put(IP.IP_IPSEC_POLICY, "IP_IPSEC_POLICY");
         map.put(IP.IP_XFRM_POLICY, "IP_XFRM_POLICY");
         map.put(IP.IP_PASSSEC, "IP_PASSSEC");
         map.put(IP.IP_TRANSPARENT, "IP_TRANSPARENT");
         map.put(IP.IP_PMTUDISC_DONT, "IP_PMTUDISC_DONT");
         map.put(IP.IP_PMTUDISC_WANT, "IP_PMTUDISC_WANT");
         map.put(IP.IP_PMTUDISC_DO, "IP_PMTUDISC_DO");
         map.put(IP.IP_UNBLOCK_SOURCE, "IP_UNBLOCK_SOURCE");
         map.put(IP.IP_BLOCK_SOURCE, "IP_BLOCK_SOURCE");
         map.put(IP.IP_ADD_SOURCE_MEMBERSHIP, "IP_ADD_SOURCE_MEMBERSHIP");
         map.put(IP.IP_DROP_SOURCE_MEMBERSHIP, "IP_DROP_SOURCE_MEMBERSHIP");
         map.put(IP.IP_MSFILTER, "IP_MSFILTER");
         return map;
      }
   }
}
