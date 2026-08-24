package jnr.constants.platform.linux.loongarch64;

import java.util.EnumMap;
import java.util.Map;
import jnr.constants.Constant;

// $VF: Compiled from AddressFamily.java
public enum AddressFamily implements Constant {
   AF_LOCAL(1L),
   AF_IPX(4L),
   AF_INET(2L),
   AF_INET6(10L),
   AF_UNSPEC(0L),
   AF_DECnet(12L),
   AF_UNIX(1L),
   AF_APPLETALK(5L),
   AF_MAX(45L),
   AF_ISDN(34L),
   AF_AX25(3L),
   AF_ROUTE(16L),
   AF_SNA(22L);

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
   public final boolean defined() {
      return true;
   }

   @Override
   public final String toString() {
      return AddressFamily.StringTable.descriptions.get(this);
   }

   public final int value() {
      return (int)this.value;
   }

   @Override
   public final int intValue() {
      return (int)this.value;
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
         map.put(AddressFamily.AF_MAX, "AF_MAX");
         return map;
      }
   }
}
