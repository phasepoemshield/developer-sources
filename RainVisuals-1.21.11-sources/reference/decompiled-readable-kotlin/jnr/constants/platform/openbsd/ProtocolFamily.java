package jnr.constants.platform.openbsd;

import java.util.EnumMap;
import java.util.Map;
import jnr.constants.Constant;

// $VF: Compiled from ProtocolFamily.java
public enum ProtocolFamily implements Constant {
   PF_APPLETALK(16L),
   PF_LAT(14L),
   PF_INET6(24L),
   PF_RTIP(22L),
   PF_ISDN(26L),
   PF_DECnet(12L),
   PF_XTP(19L),
   PF_ISO(7L),
   PF_ECMA(8L),
   PF_PIP(25L),
   PF_DATAKIT(9L),
   PF_LOCAL(1L),
   PF_SNA(11L),
   PF_CNT(21L),
   PF_HYLINK(15L),
   PF_IMPLINK(3L),
   PF_CHAOS(5L),
   PF_PUP(4L),
   PF_UNSPEC(0L),
   PF_KEY(30L),
   PF_LINK(18L),
   PF_NATM(27L),
   PF_IPX(23L),
   PF_UNIX(1L),
   PF_INET(2L),
   PF_SIP(29L),
   PF_OSI(7L),
   PF_DLI(13L),
   PF_CCITT(10L),
   PF_MAX(36L),
   PF_NS(6L),
   PF_ROUTE(17L),
   PF_COIP(20L);

   public static final long MAX_VALUE = 36L;
   public static final long MIN_VALUE = 0L;
   private final long value;

   @Override
   public final int intValue() {
      return (int)this.value;
   }

   @Override
   public final String toString() {
      return ProtocolFamily.StringTable.descriptions.get(this);
   }

   ProtocolFamily(long value) {
      this.value = value;
   }

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

   // $VF: Compiled from ProtocolFamily.java
   static final class StringTable {
      public static final Map<ProtocolFamily, String> descriptions = generateTable();

      public static final Map<ProtocolFamily, String> generateTable() {
         Map<ProtocolFamily, String> map = new EnumMap<>(ProtocolFamily.class);
         map.put(ProtocolFamily.PF_UNSPEC, "PF_UNSPEC");
         map.put(ProtocolFamily.PF_LOCAL, "PF_LOCAL");
         map.put(ProtocolFamily.PF_UNIX, "PF_UNIX");
         map.put(ProtocolFamily.PF_INET, "PF_INET");
         map.put(ProtocolFamily.PF_IMPLINK, "PF_IMPLINK");
         map.put(ProtocolFamily.PF_PUP, "PF_PUP");
         map.put(ProtocolFamily.PF_CHAOS, "PF_CHAOS");
         map.put(ProtocolFamily.PF_NS, "PF_NS");
         map.put(ProtocolFamily.PF_ISO, "PF_ISO");
         map.put(ProtocolFamily.PF_OSI, "PF_OSI");
         map.put(ProtocolFamily.PF_ECMA, "PF_ECMA");
         map.put(ProtocolFamily.PF_DATAKIT, "PF_DATAKIT");
         map.put(ProtocolFamily.PF_CCITT, "PF_CCITT");
         map.put(ProtocolFamily.PF_SNA, "PF_SNA");
         map.put(ProtocolFamily.PF_DECnet, "PF_DECnet");
         map.put(ProtocolFamily.PF_DLI, "PF_DLI");
         map.put(ProtocolFamily.PF_LAT, "PF_LAT");
         map.put(ProtocolFamily.PF_HYLINK, "PF_HYLINK");
         map.put(ProtocolFamily.PF_APPLETALK, "PF_APPLETALK");
         map.put(ProtocolFamily.PF_ROUTE, "PF_ROUTE");
         map.put(ProtocolFamily.PF_LINK, "PF_LINK");
         map.put(ProtocolFamily.PF_XTP, "PF_XTP");
         map.put(ProtocolFamily.PF_COIP, "PF_COIP");
         map.put(ProtocolFamily.PF_CNT, "PF_CNT");
         map.put(ProtocolFamily.PF_SIP, "PF_SIP");
         map.put(ProtocolFamily.PF_IPX, "PF_IPX");
         map.put(ProtocolFamily.PF_RTIP, "PF_RTIP");
         map.put(ProtocolFamily.PF_PIP, "PF_PIP");
         map.put(ProtocolFamily.PF_ISDN, "PF_ISDN");
         map.put(ProtocolFamily.PF_KEY, "PF_KEY");
         map.put(ProtocolFamily.PF_INET6, "PF_INET6");
         map.put(ProtocolFamily.PF_NATM, "PF_NATM");
         map.put(ProtocolFamily.PF_MAX, "PF_MAX");
         return map;
      }
   }
}
