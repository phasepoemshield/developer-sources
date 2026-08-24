package jnr.constants.platform.solaris;

import java.util.EnumMap;
import java.util.Map;
import jnr.constants.Constant;

// $VF: Compiled from InterfaceInfo.java
public enum InterfaceInfo implements Constant {
   IFF_MULTICAST(2048L),
   IFF_NOTRAILERS(32L),
   IFF_PROMISC(256L),
   IFF_DEBUG(4L),
   IFF_LOOPBACK(8L),
   IFF_CANTCHANGE(60413060332378L),
   IFF_RUNNING(64L),
   IFF_ALLMULTI(512L),
   IFF_BROADCAST(2L),
   IFF_NOARP(128L),
   IFF_UP(1L),
   IFF_POINTOPOINT(16L);

   public static final long MIN_VALUE = 1L;
   public static final long MAX_VALUE = 60413060332378L;
   private final long value;

   InterfaceInfo(long value) {
      this.value = value;
   }

   @Override
   public final String toString() {
      return InterfaceInfo.StringTable.descriptions.get(this);
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
   public final int intValue() {
      return (int)this.value;
   }

   public final int value() {
      return (int)this.value;
   }

   // $VF: Compiled from InterfaceInfo.java
   static final class StringTable {
      public static final Map<InterfaceInfo, String> descriptions = generateTable();

      public static final Map<InterfaceInfo, String> generateTable() {
         Map<InterfaceInfo, String> map = new EnumMap<>(InterfaceInfo.class);
         map.put(InterfaceInfo.IFF_ALLMULTI, "IFF_ALLMULTI");
         map.put(InterfaceInfo.IFF_BROADCAST, "IFF_BROADCAST");
         map.put(InterfaceInfo.IFF_DEBUG, "IFF_DEBUG");
         map.put(InterfaceInfo.IFF_LOOPBACK, "IFF_LOOPBACK");
         map.put(InterfaceInfo.IFF_MULTICAST, "IFF_MULTICAST");
         map.put(InterfaceInfo.IFF_NOARP, "IFF_NOARP");
         map.put(InterfaceInfo.IFF_NOTRAILERS, "IFF_NOTRAILERS");
         map.put(InterfaceInfo.IFF_POINTOPOINT, "IFF_POINTOPOINT");
         map.put(InterfaceInfo.IFF_PROMISC, "IFF_PROMISC");
         map.put(InterfaceInfo.IFF_RUNNING, "IFF_RUNNING");
         map.put(InterfaceInfo.IFF_UP, "IFF_UP");
         map.put(InterfaceInfo.IFF_CANTCHANGE, "IFF_CANTCHANGE");
         return map;
      }
   }
}
