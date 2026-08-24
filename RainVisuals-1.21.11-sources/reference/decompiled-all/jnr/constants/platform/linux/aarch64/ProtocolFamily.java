package jnr.constants.platform.linux.aarch64;

import java.util.EnumMap;
import java.util.Map;
import jnr.constants.Constant;

// $VF: Compiled from ProtocolFamily.java
public enum ProtocolFamily implements Constant {
   PF_VSOCK(40L),
   PF_SNA(22L),
   PF_KEY(15L),
   PF_ISDN(34L),
   PF_NETLINK(16L),
   PF_ROUTE(16L),
   PF_APPLETALK(5L),
   PF_MPLS(28L),
   PF_KCM(41L),
   PF_TIPC(30L),
   PF_IPX(4L),
   PF_ALG(38L),
   PF_IB(27L),
   PF_UNSPEC(0L),
   PF_INET6(10L),
   PF_RDS(21L),
   PF_XDP(44L),
   PF_LLC(26L),
   PF_MAX(45L),
   PF_DECnet(12L),
   PF_BLUETOOTH(31L),
   PF_INET(2L),
   PF_PPPOX(24L),
   PF_UNIX(1L),
   PF_CAN(29L),
   PF_LOCAL(1L);

   public static final long MAX_VALUE = 45L;
   public static final long MIN_VALUE = 0L;
   private final long value;

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
   public final String toString() {
      return ProtocolFamily.StringTable.descriptions.get(this);
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
         map.put(ProtocolFamily.PF_NETLINK, "PF_NETLINK");
         map.put(ProtocolFamily.PF_RDS, "PF_RDS");
         map.put(ProtocolFamily.PF_PPPOX, "PF_PPPOX");
         map.put(ProtocolFamily.PF_LLC, "PF_LLC");
         map.put(ProtocolFamily.PF_IB, "PF_IB");
         map.put(ProtocolFamily.PF_MPLS, "PF_MPLS");
         map.put(ProtocolFamily.PF_CAN, "PF_CAN");
         map.put(ProtocolFamily.PF_TIPC, "PF_TIPC");
         map.put(ProtocolFamily.PF_BLUETOOTH, "PF_BLUETOOTH");
         map.put(ProtocolFamily.PF_ALG, "PF_ALG");
         map.put(ProtocolFamily.PF_VSOCK, "PF_VSOCK");
         map.put(ProtocolFamily.PF_KCM, "PF_KCM");
         map.put(ProtocolFamily.PF_XDP, "PF_XDP");
         map.put(ProtocolFamily.PF_MAX, "PF_MAX");
         return map;
      }
   }
}
