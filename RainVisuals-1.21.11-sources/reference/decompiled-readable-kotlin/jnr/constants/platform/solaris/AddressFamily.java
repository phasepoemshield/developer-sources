package jnr.constants.platform.solaris;

import java.util.EnumMap;
import java.util.Map;
import jnr.constants.Constant;

// $VF: Compiled from AddressFamily.java
public enum AddressFamily implements Constant {
   AF_NS(6L),
   AF_NETLINK(34L),
   AF_HYLINK(15L),
   AF_KEY(27L),
   AF_CCITT(10L),
   AF_UNIX(1L),
   AF_MAX(34L),
   AF_IPX(23L),
   AF_INET(2L),
   AF_DECnet(12L),
   AF_SNA(11L),
   AF_LAT(14L),
   AF_DLI(13L),
   AF_PUP(4L),
   AF_DATAKIT(9L),
   AF_APPLETALK(16L),
   AF_ROUTE(24L),
   AF_UNSPEC(0L),
   AF_INET6(26L),
   AF_OSI(19L),
   AF_ECMA(8L),
   AF_LINK(25L),
   AF_CHAOS(5L),
   AF_LOCAL(1L),
   AF_IMPLINK(3L);

   public static final long MAX_VALUE = 34L;
   public static final long MIN_VALUE = 0L;
   private final long value;

   public final int value() {
      return (int)this.value;
   }

   AddressFamily(long value) {
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

   @Override
   public final boolean defined() {
      return true;
   }

   @Override
   public final String toString() {
      return AddressFamily.StringTable.descriptions.get(this);
   }

   // $VF: Compiled from AddressFamily.java
   static final class StringTable {
      public static final Map<AddressFamily, String> descriptions = generateTable();

      public static final Map<AddressFamily, String> generateTable() {
         Map<AddressFamily, String> map = new EnumMap<>(AddressFamily.class);
         map.put(AddressFamily.AF_UNSPEC, "AF_UNSPEC");
         map.put(AddressFamily.AF_LOCAL, "AF_LOCAL");
         map.put(AddressFamily.AF_UNIX, "AF_UNIX");
         map.put(AddressFamily.AF_INET, "AF_INET");
         map.put(AddressFamily.AF_IMPLINK, "AF_IMPLINK");
         map.put(AddressFamily.AF_PUP, "AF_PUP");
         map.put(AddressFamily.AF_CHAOS, "AF_CHAOS");
         map.put(AddressFamily.AF_NS, "AF_NS");
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
         map.put(AddressFamily.AF_ROUTE, "AF_ROUTE");
         map.put(AddressFamily.AF_LINK, "AF_LINK");
         map.put(AddressFamily.AF_IPX, "AF_IPX");
         map.put(AddressFamily.AF_INET6, "AF_INET6");
         map.put(AddressFamily.AF_KEY, "AF_KEY");
         map.put(AddressFamily.AF_NETLINK, "AF_NETLINK");
         map.put(AddressFamily.AF_MAX, "AF_MAX");
         return map;
      }
   }
}
