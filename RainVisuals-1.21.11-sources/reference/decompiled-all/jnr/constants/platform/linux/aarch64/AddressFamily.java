package jnr.constants.platform.linux.aarch64;

import java.util.EnumMap;
import java.util.Map;
import jnr.constants.Constant;

// $VF: Compiled from AddressFamily.java
public enum AddressFamily implements Constant {
   AF_XDP(44L),
   AF_RDS(21L),
   AF_CAN(29L),
   AF_IPX(4L),
   AF_AX25(3L),
   AF_MAX(45L),
   AF_ISDN(34L),
   AF_MPLS(28L),
   AF_BLUETOOTH(31L),
   AF_LLC(26L),
   AF_ALG(38L),
   AF_SNA(22L),
   AF_IB(27L),
   AF_ROUTE(16L),
   AF_KCM(41L),
   AF_INET(2L),
   AF_PPPOX(24L),
   AF_TIPC(30L),
   AF_UNSPEC(0L),
   AF_DECnet(12L),
   AF_KEY(15L),
   AF_APPLETALK(5L),
   AF_VSOCK(40L),
   AF_UNIX(1L),
   AF_INET6(10L),
   AF_LOCAL(1L),
   AF_NETLINK(16L);

   private final long value;
   public static final long MAX_VALUE = 45L;
   public static final long MIN_VALUE = 0L;

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

   public final int value() {
      return (int)this.value;
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
         map.put(AddressFamily.AF_SNA, "AF_SNA");
         map.put(AddressFamily.AF_DECnet, "AF_DECnet");
         map.put(AddressFamily.AF_APPLETALK, "AF_APPLETALK");
         map.put(AddressFamily.AF_ROUTE, "AF_ROUTE");
         map.put(AddressFamily.AF_IPX, "AF_IPX");
         map.put(AddressFamily.AF_ISDN, "AF_ISDN");
         map.put(AddressFamily.AF_INET6, "AF_INET6");
         map.put(AddressFamily.AF_AX25, "AF_AX25");
         map.put(AddressFamily.AF_KEY, "AF_KEY");
         map.put(AddressFamily.AF_NETLINK, "AF_NETLINK");
         map.put(AddressFamily.AF_RDS, "AF_RDS");
         map.put(AddressFamily.AF_PPPOX, "AF_PPPOX");
         map.put(AddressFamily.AF_LLC, "AF_LLC");
         map.put(AddressFamily.AF_IB, "AF_IB");
         map.put(AddressFamily.AF_MPLS, "AF_MPLS");
         map.put(AddressFamily.AF_CAN, "AF_CAN");
         map.put(AddressFamily.AF_TIPC, "AF_TIPC");
         map.put(AddressFamily.AF_BLUETOOTH, "AF_BLUETOOTH");
         map.put(AddressFamily.AF_ALG, "AF_ALG");
         map.put(AddressFamily.AF_VSOCK, "AF_VSOCK");
         map.put(AddressFamily.AF_KCM, "AF_KCM");
         map.put(AddressFamily.AF_XDP, "AF_XDP");
         map.put(AddressFamily.AF_MAX, "AF_MAX");
         return map;
      }
   }
}
