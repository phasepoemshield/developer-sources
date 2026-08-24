package jnr.constants.platform.linux.loongarch64;

import java.util.EnumMap;
import java.util.Map;
import jnr.constants.Constant;

// $VF: Compiled from ProtocolFamily.java
public enum ProtocolFamily implements Constant {
   PF_APPLETALK(5L),
   PF_SNA(22L),
   PF_UNSPEC(0L),
   PF_MAX(45L),
   PF_KEY(15L),
   PF_DECnet(12L),
   PF_UNIX(1L),
   PF_ROUTE(16L),
   PF_LOCAL(1L),
   PF_INET(2L),
   PF_ISDN(34L),
   PF_INET6(10L),
   PF_IPX(4L);

   public static final long MIN_VALUE = 0L;
   private final long value;
   public static final long MAX_VALUE = 45L;

   @Override
   public final long longValue() {
      return this.value;
   }

   ProtocolFamily(long value) {
      this.value = value;
   }

   @Override
   public final String toString() {
      return ProtocolFamily.StringTable.descriptions.get(this);
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

   // $VF: Compiled from ProtocolFamily.java
   static final class StringTable {
      public static final Map<ProtocolFamily, String> descriptions = generateTable();

      public static final Map<ProtocolFamily, String> generateTable() {
         Map<ProtocolFamily, String> map = new EnumMap<>(ProtocolFamily.class);
         map.put(ProtocolFamily.PF_UNSPEC, "PF_UNSPEC");
         map.put(ProtocolFamily.PF_LOCAL, "PF_LOCAL");
         map.put(ProtocolFamily.PF_UNIX, "PF_UNIX");
         map.put(ProtocolFamily.PF_INET, "PF_INET");
         map.put(ProtocolFamily.PF_SNA, "PF_SNA");
         map.put(ProtocolFamily.PF_DECnet, "PF_DECnet");
         map.put(ProtocolFamily.PF_APPLETALK, "PF_APPLETALK");
         map.put(ProtocolFamily.PF_ROUTE, "PF_ROUTE");
         map.put(ProtocolFamily.PF_IPX, "PF_IPX");
         map.put(ProtocolFamily.PF_ISDN, "PF_ISDN");
         map.put(ProtocolFamily.PF_KEY, "PF_KEY");
         map.put(ProtocolFamily.PF_INET6, "PF_INET6");
         map.put(ProtocolFamily.PF_MAX, "PF_MAX");
         return map;
      }
   }
}
