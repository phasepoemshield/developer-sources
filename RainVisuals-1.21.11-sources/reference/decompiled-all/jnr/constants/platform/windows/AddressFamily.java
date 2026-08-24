package jnr.constants.platform.windows;

import java.util.EnumMap;
import java.util.Map;
import jnr.constants.Constant;

// $VF: Compiled from AddressFamily.java
public enum AddressFamily implements Constant {
   AF_OSI(7L),
   AF_ATM(22L),
   AF_ISO(7L),
   AF_DLI(13L),
   AF_CCITT(10L),
   AF_IMPLINK(3L),
   AF_INET(2L),
   AF_APPLETALK(16L),
   AF_MAX(33L),
   AF_IPX(6L),
   AF_PUP(4L),
   AF_SNA(11L),
   AF_DATAKIT(9L),
   AF_CHAOS(5L),
   AF_INET6(23L),
   AF_UNIX(1L),
   AF_DECnet(12L),
   AF_LAT(14L),
   AF_HYLINK(15L),
   AF_NETBIOS(17L),
   AF_NS(6L),
   AF_UNSPEC(0L),
   AF_ECMA(8L);

   private final long value;
   public static final long MIN_VALUE = 0L;
   public static final long MAX_VALUE = 33L;

   @Override
   public final int intValue() {
      return (int)this.value;
   }

   public final int value() {
      return (int)this.value;
   }

   @Override
   public final boolean defined() {
      return true;
   }

   @Override
   public final String toString() {
      return AddressFamily.StringTable.descriptions.get(this);
   }

   @Override
   public final long longValue() {
      return this.value;
   }

   AddressFamily(long value) {
      this.value = value;
   }

   // $VF: Compiled from AddressFamily.java
   static final class StringTable {
      public static final Map<AddressFamily, String> descriptions = generateTable();

      public static final Map<AddressFamily, String> generateTable() {
         Map<AddressFamily, String> map = new EnumMap<>(AddressFamily.class);
         map.put(AddressFamily.AF_UNSPEC, "AF_UNSPEC");
         map.put(AddressFamily.AF_UNIX, "AF_UNIX");
         map.put(AddressFamily.AF_INET, "AF_INET");
         map.put(AddressFamily.AF_IMPLINK, "AF_IMPLINK");
         map.put(AddressFamily.AF_PUP, "AF_PUP");
         map.put(AddressFamily.AF_CHAOS, "AF_CHAOS");
         map.put(AddressFamily.AF_NS, "AF_NS");
         map.put(AddressFamily.AF_ISO, "AF_ISO");
         map.put(AddressFamily.AF_OSI, "AF_OSI");
         map.put(AddressFamily.AF_ECMA, "AF_ECMA");
         map.put(AddressFamily.AF_DATAKIT, "AF_DATAKIT");
         map.put(AddressFamily.AF_CCITT, "AF_CCITT");
         map.put(AddressFamily.AF_SNA, "AF_SNA");
         map.put(AddressFamily.AF_DECnet, "AF_DECnet");
         map.put(AddressFamily.AF_DLI, "AF_DLI");
         map.put(AddressFamily.AF_LAT, "AF_LAT");
         map.put(AddressFamily.AF_HYLINK, "AF_HYLINK");
         map.put(AddressFamily.AF_APPLETALK, "AF_APPLETALK");
         map.put(AddressFamily.AF_IPX, "AF_IPX");
         map.put(AddressFamily.AF_INET6, "AF_INET6");
         map.put(AddressFamily.AF_NETBIOS, "AF_NETBIOS");
         map.put(AddressFamily.AF_ATM, "AF_ATM");
         map.put(AddressFamily.AF_MAX, "AF_MAX");
         return map;
      }
   }
}
