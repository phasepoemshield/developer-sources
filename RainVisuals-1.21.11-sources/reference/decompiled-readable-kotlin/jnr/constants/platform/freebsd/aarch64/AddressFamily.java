package jnr.constants.platform.freebsd.aarch64;

import java.util.EnumMap;
import java.util.Map;
import jnr.constants.Constant;

// $VF: Compiled from AddressFamily.java
public enum AddressFamily implements Constant {
   AF_DATAKIT(9L),
   pseudo_AF_HDRCMPLT(31L),
   AF_INET6(28L),
   AF_CCITT(10L),
   AF_INET(2L),
   AF_DLI(13L),
   AF_IPX(23L),
   AF_ATM(30L),
   AF_CHAOS(5L),
   AF_CNT(21L),
   AF_IMPLINK(3L),
   AF_MAX(43L),
   AF_UNIX(1L),
   AF_LINK(18L),
   pseudo_AF_RTIP(22L),
   AF_OSI(7L),
   AF_PUP(4L),
   pseudo_AF_XTP(19L),
   AF_SIP(24L),
   AF_LAT(14L),
   AF_ECMA(8L),
   AF_NATM(29L),
   AF_ROUTE(17L),
   pseudo_AF_PIP(25L),
   AF_UNSPEC(0L),
   pseudo_AF_KEY(27L),
   AF_COIP(20L),
   AF_ISO(7L),
   AF_NETBIOS(6L),
   AF_ISDN(26L),
   AF_LOCAL(1L),
   AF_E164(26L),
   AF_DECnet(12L),
   AF_APPLETALK(16L),
   AF_NETGRAPH(32L),
   AF_HYLINK(15L),
   AF_SNA(11L);

   private final long value;
   public static final long MAX_VALUE = 43L;
   public static final long MIN_VALUE = 0L;

   public final int value() {
      return (int)this.value;
   }

   @Override
   public final String toString() {
      return AddressFamily.StringTable.descriptions.get(this);
   }

   AddressFamily(long value) {
      this.value = value;
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
   public final long longValue() {
      return this.value;
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
         map.put(AddressFamily.AF_ROUTE, "AF_ROUTE");
         map.put(AddressFamily.AF_LINK, "AF_LINK");
         map.put(AddressFamily.pseudo_AF_XTP, "pseudo_AF_XTP");
         map.put(AddressFamily.AF_COIP, "AF_COIP");
         map.put(AddressFamily.AF_CNT, "AF_CNT");
         map.put(AddressFamily.pseudo_AF_RTIP, "pseudo_AF_RTIP");
         map.put(AddressFamily.AF_IPX, "AF_IPX");
         map.put(AddressFamily.AF_SIP, "AF_SIP");
         map.put(AddressFamily.pseudo_AF_PIP, "pseudo_AF_PIP");
         map.put(AddressFamily.AF_ISDN, "AF_ISDN");
         map.put(AddressFamily.AF_E164, "AF_E164");
         map.put(AddressFamily.pseudo_AF_KEY, "pseudo_AF_KEY");
         map.put(AddressFamily.AF_INET6, "AF_INET6");
         map.put(AddressFamily.AF_NATM, "AF_NATM");
         map.put(AddressFamily.AF_NETBIOS, "AF_NETBIOS");
         map.put(AddressFamily.AF_ATM, "AF_ATM");
         map.put(AddressFamily.pseudo_AF_HDRCMPLT, "pseudo_AF_HDRCMPLT");
         map.put(AddressFamily.AF_NETGRAPH, "AF_NETGRAPH");
         map.put(AddressFamily.AF_MAX, "AF_MAX");
         return map;
      }
   }
}
