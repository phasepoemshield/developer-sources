package jnr.constants.platform.freebsd.aarch64;

import java.util.EnumMap;
import java.util.Map;
import jnr.constants.Constant;

// $VF: Compiled from InterfaceInfo.java
public enum InterfaceInfo implements Constant {
   IFF_CANTCONFIG(65536L),
   IFF_NOARP(128L),
   IFF_DEBUG(4L),
   IFF_MULTICAST(32768L),
   IFF_DYING(2097152L),
   IFF_SIMPLEX(2048L),
   IFF_MONITOR(262144L),
   IFF_CANTCHANGE(2199410L),
   IFF_PROMISC(256L),
   IFF_PPROMISC(131072L),
   IFF_STATICARP(524288L),
   IFF_BROADCAST(2L),
   IFF_ALTPHYS(16384L),
   IFF_LOOPBACK(8L),
   IFF_OACTIVE(1024L),
   IFF_LINK0(4096L),
   IFF_DRV_OACTIVE(1024L),
   IFF_LINK2(16384L),
   IFF_POINTOPOINT(16L),
   IFF_DRV_RUNNING(64L),
   IFF_ALLMULTI(512L),
   IFF_UP(1L),
   IFF_RENAMING(4194304L),
   IFF_RUNNING(64L),
   IFF_LINK1(8192L);

   private final long value;
   public static final long MIN_VALUE = 1L;
   public static final long MAX_VALUE = 4194304L;

   public final int value() {
      return (int)this.value;
   }

   InterfaceInfo(long value) {
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
   public final String toString() {
      return InterfaceInfo.StringTable.descriptions.get(this);
   }

   @Override
   public final boolean defined() {
      return true;
   }

   // $VF: Compiled from InterfaceInfo.java
   static final class StringTable {
      public static final Map<InterfaceInfo, String> descriptions = generateTable();

      public static final Map<InterfaceInfo, String> generateTable() {
         Map<InterfaceInfo, String> map = new EnumMap<>(InterfaceInfo.class);
         map.put(InterfaceInfo.IFF_ALLMULTI, "IFF_ALLMULTI");
         map.put(InterfaceInfo.IFF_ALTPHYS, "IFF_ALTPHYS");
         map.put(InterfaceInfo.IFF_BROADCAST, "IFF_BROADCAST");
         map.put(InterfaceInfo.IFF_CANTCONFIG, "IFF_CANTCONFIG");
         map.put(InterfaceInfo.IFF_DEBUG, "IFF_DEBUG");
         map.put(InterfaceInfo.IFF_DRV_OACTIVE, "IFF_DRV_OACTIVE");
         map.put(InterfaceInfo.IFF_DRV_RUNNING, "IFF_DRV_RUNNING");
         map.put(InterfaceInfo.IFF_DYING, "IFF_DYING");
         map.put(InterfaceInfo.IFF_LINK0, "IFF_LINK0");
         map.put(InterfaceInfo.IFF_LINK1, "IFF_LINK1");
         map.put(InterfaceInfo.IFF_LINK2, "IFF_LINK2");
         map.put(InterfaceInfo.IFF_LOOPBACK, "IFF_LOOPBACK");
         map.put(InterfaceInfo.IFF_MONITOR, "IFF_MONITOR");
         map.put(InterfaceInfo.IFF_MULTICAST, "IFF_MULTICAST");
         map.put(InterfaceInfo.IFF_NOARP, "IFF_NOARP");
         map.put(InterfaceInfo.IFF_OACTIVE, "IFF_OACTIVE");
         map.put(InterfaceInfo.IFF_POINTOPOINT, "IFF_POINTOPOINT");
         map.put(InterfaceInfo.IFF_PPROMISC, "IFF_PPROMISC");
         map.put(InterfaceInfo.IFF_PROMISC, "IFF_PROMISC");
         map.put(InterfaceInfo.IFF_RENAMING, "IFF_RENAMING");
         map.put(InterfaceInfo.IFF_RUNNING, "IFF_RUNNING");
         map.put(InterfaceInfo.IFF_SIMPLEX, "IFF_SIMPLEX");
         map.put(InterfaceInfo.IFF_STATICARP, "IFF_STATICARP");
         map.put(InterfaceInfo.IFF_UP, "IFF_UP");
         map.put(InterfaceInfo.IFF_CANTCHANGE, "IFF_CANTCHANGE");
         return map;
      }
   }
}
