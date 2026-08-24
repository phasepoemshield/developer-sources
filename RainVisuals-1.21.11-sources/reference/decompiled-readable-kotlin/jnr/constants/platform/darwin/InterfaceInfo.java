package jnr.constants.platform.darwin;

import java.util.EnumMap;
import java.util.Map;
import jnr.constants.Constant;

// $VF: Compiled from InterfaceInfo.java
public enum InterfaceInfo implements Constant {
   IFF_LOOPBACK(8L),
   IFF_ALLMULTI(512L),
   IFF_LINK2(16384L),
   IFF_UP(1L),
   IFF_LINK1(8192L),
   IFF_DEBUG(4L),
   IFF_NOTRAILERS(32L),
   IFF_ALTPHYS(16384L),
   IFF_OACTIVE(1024L),
   IFF_NOARP(128L),
   IFF_BROADCAST(2L),
   IFF_SIMPLEX(2048L),
   IFF_LINK0(4096L),
   IFF_RUNNING(64L),
   IFF_POINTOPOINT(16L),
   IFF_PROMISC(256L),
   IFF_MULTICAST(32768L);

   public static final long MIN_VALUE = 1L;
   private final long value;
   public static final long MAX_VALUE = 32768L;

   @Override
   public final int intValue() {
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
   public final boolean defined() {
      return true;
   }

   public final int value() {
      return (int)this.value;
   }

   @Override
   public final String toString() {
      return InterfaceInfo.StringTable.descriptions.get(this);
   }

   // $VF: Compiled from InterfaceInfo.java
   static final class StringTable {
      public static final Map<InterfaceInfo, String> descriptions = generateTable();

      public static final Map<InterfaceInfo, String> generateTable() {
         Map<InterfaceInfo, String> map = new EnumMap<>(InterfaceInfo.class);
         map.put(InterfaceInfo.IFF_ALLMULTI, "IFF_ALLMULTI");
         map.put(InterfaceInfo.IFF_ALTPHYS, "IFF_ALTPHYS");
         map.put(InterfaceInfo.IFF_BROADCAST, "IFF_BROADCAST");
         map.put(InterfaceInfo.IFF_DEBUG, "IFF_DEBUG");
         map.put(InterfaceInfo.IFF_LINK0, "IFF_LINK0");
         map.put(InterfaceInfo.IFF_LINK1, "IFF_LINK1");
         map.put(InterfaceInfo.IFF_LINK2, "IFF_LINK2");
         map.put(InterfaceInfo.IFF_LOOPBACK, "IFF_LOOPBACK");
         map.put(InterfaceInfo.IFF_MULTICAST, "IFF_MULTICAST");
         map.put(InterfaceInfo.IFF_NOARP, "IFF_NOARP");
         map.put(InterfaceInfo.IFF_NOTRAILERS, "IFF_NOTRAILERS");
         map.put(InterfaceInfo.IFF_OACTIVE, "IFF_OACTIVE");
         map.put(InterfaceInfo.IFF_POINTOPOINT, "IFF_POINTOPOINT");
         map.put(InterfaceInfo.IFF_PROMISC, "IFF_PROMISC");
         map.put(InterfaceInfo.IFF_RUNNING, "IFF_RUNNING");
         map.put(InterfaceInfo.IFF_SIMPLEX, "IFF_SIMPLEX");
         map.put(InterfaceInfo.IFF_UP, "IFF_UP");
         return map;
      }
   }
}
