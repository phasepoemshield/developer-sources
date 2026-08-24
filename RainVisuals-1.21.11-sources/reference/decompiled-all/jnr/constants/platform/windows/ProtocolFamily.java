package jnr.constants.platform.windows;

import java.util.EnumMap;
import java.util.Map;
import jnr.constants.Constant;

// $VF: Compiled from ProtocolFamily.java
public enum ProtocolFamily implements Constant {
   PF_PUP(4L),
   PF_UNSPEC(0L),
   PF_IMPLINK(3L),
   PF_ISO(7L),
   PF_ATM(22L),
   PF_HYLINK(15L),
   PF_INET(2L),
   PF_MAX(33L),
   PF_IPX(6L),
   PF_CCITT(10L),
   PF_UNIX(1L),
   PF_DATAKIT(9L),
   PF_DLI(13L),
   PF_ECMA(8L),
   PF_NS(6L),
   PF_DECnet(12L),
   PF_OSI(7L),
   PF_INET6(23L),
   PF_APPLETALK(16L),
   PF_LAT(14L),
   PF_CHAOS(5L),
   PF_SNA(11L);

   private final long value;
   public static final long MIN_VALUE = 0L;
   public static final long MAX_VALUE = 33L;

   @Override
   public final String toString() {
      return ProtocolFamily.StringTable.descriptions.get(this);
   }

   @Override
   public final long longValue() {
      return this.value;
   }

   @Override
   public final boolean defined() {
      return true;
   }

   ProtocolFamily(long value) {
      this.value = value;
   }

   public final int value() {
      return (int)this.value;
   }

   @Override
   public final int intValue() {
      return (int)this.value;
   }

   // $VF: Compiled from ProtocolFamily.java
   static final class StringTable {
      public static final Map<ProtocolFamily, String> descriptions = generateTable();

      public static final Map<ProtocolFamily, String> generateTable() {
         Map<ProtocolFamily, String> map = new EnumMap<>(ProtocolFamily.class);
         map.put(ProtocolFamily.PF_UNSPEC, "PF_UNSPEC");
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
         map.put(ProtocolFamily.PF_IPX, "PF_IPX");
         map.put(ProtocolFamily.PF_INET6, "PF_INET6");
         map.put(ProtocolFamily.PF_ATM, "PF_ATM");
         map.put(ProtocolFamily.PF_MAX, "PF_MAX");
         return map;
      }
   }
}
