package jnr.constants.platform.linux;

import java.util.EnumMap;
import java.util.Map;
import jnr.constants.Constant;

// $VF: Compiled from InterfaceInfo.java
public enum InterfaceInfo implements Constant {
   IFF_UP(1L),
   IFF_PORTSEL(8192L),
   IFF_BROADCAST(2L),
   IFF_MULTICAST(4096L),
   IFF_RUNNING(64L),
   IFF_MASTER(1024L),
   IFF_ALLMULTI(512L),
   IFF_DYNAMIC(32768L),
   IFF_NOTRAILERS(32L),
   IFF_NOARP(128L),
   IFF_POINTOPOINT(16L),
   IFF_DEBUG(4L),
   IFF_LOOPBACK(8L),
   IFF_PROMISC(256L),
   IFF_SLAVE(2048L),
   IFF_AUTOMEDIA(16384L);

   private final long value;
   public static final long MIN_VALUE = 1L;
   public static final long MAX_VALUE = 32768L;

   public final int value() {
      return (int)this.value;
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
      return InterfaceInfo.StringTable.descriptions.get(this);
   }

   InterfaceInfo(long value) {
      this.value = value;
   }

   // $VF: Compiled from InterfaceInfo.java
   static final class StringTable {
      public static final Map<InterfaceInfo, String> descriptions = generateTable();

      public static final Map<InterfaceInfo, String> generateTable() {
         Map<InterfaceInfo, String> map = new EnumMap<>(InterfaceInfo.class);
         map.put(InterfaceInfo.IFF_ALLMULTI, "IFF_ALLMULTI");
         map.put(InterfaceInfo.IFF_AUTOMEDIA, "IFF_AUTOMEDIA");
         map.put(InterfaceInfo.IFF_BROADCAST, "IFF_BROADCAST");
         map.put(InterfaceInfo.IFF_DEBUG, "IFF_DEBUG");
         map.put(InterfaceInfo.IFF_DYNAMIC, "IFF_DYNAMIC");
         map.put(InterfaceInfo.IFF_LOOPBACK, "IFF_LOOPBACK");
         map.put(InterfaceInfo.IFF_MASTER, "IFF_MASTER");
         map.put(InterfaceInfo.IFF_MULTICAST, "IFF_MULTICAST");
         map.put(InterfaceInfo.IFF_NOARP, "IFF_NOARP");
         map.put(InterfaceInfo.IFF_NOTRAILERS, "IFF_NOTRAILERS");
         map.put(InterfaceInfo.IFF_POINTOPOINT, "IFF_POINTOPOINT");
         map.put(InterfaceInfo.IFF_PORTSEL, "IFF_PORTSEL");
         map.put(InterfaceInfo.IFF_PROMISC, "IFF_PROMISC");
         map.put(InterfaceInfo.IFF_RUNNING, "IFF_RUNNING");
         map.put(InterfaceInfo.IFF_SLAVE, "IFF_SLAVE");
         map.put(InterfaceInfo.IFF_UP, "IFF_UP");
         return map;
      }
   }
}
