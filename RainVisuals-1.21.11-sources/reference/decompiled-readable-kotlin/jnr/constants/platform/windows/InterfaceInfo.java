package jnr.constants.platform.windows;

import java.util.EnumMap;
import java.util.Map;
import jnr.constants.Constant;

// $VF: Compiled from InterfaceInfo.java
public enum InterfaceInfo implements Constant {
   IFF_LOOPBACK(4L),
   IFF_UP(1L),
   IFF_MULTICAST(16L),
   IFF_BROADCAST(2L);

   private final long value;
   public static final long MIN_VALUE = 1L;
   public static final long MAX_VALUE = 16L;

   @Override
   public final boolean defined() {
      return true;
   }

   InterfaceInfo(long value) {
      this.value = value;
   }

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
   public final String toString() {
      return InterfaceInfo.StringTable.descriptions.get(this);
   }

   // $VF: Compiled from InterfaceInfo.java
   static final class StringTable {
      public static final Map<InterfaceInfo, String> descriptions = generateTable();

      public static final Map<InterfaceInfo, String> generateTable() {
         Map<InterfaceInfo, String> map = new EnumMap<>(InterfaceInfo.class);
         map.put(InterfaceInfo.IFF_BROADCAST, "IFF_BROADCAST");
         map.put(InterfaceInfo.IFF_LOOPBACK, "IFF_LOOPBACK");
         map.put(InterfaceInfo.IFF_MULTICAST, "IFF_MULTICAST");
         map.put(InterfaceInfo.IFF_UP, "IFF_UP");
         return map;
      }
   }
}
