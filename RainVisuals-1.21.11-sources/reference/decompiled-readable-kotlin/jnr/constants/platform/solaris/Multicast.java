package jnr.constants.platform.solaris;

import java.util.EnumMap;
import java.util.Map;
import jnr.constants.Constant;

// $VF: Compiled from Multicast.java
public enum Multicast implements Constant {
   MCAST_EXCLUDE(2L),
   MCAST_JOIN_SOURCE_GROUP(45L),
   MCAST_UNBLOCK_SOURCE(44L),
   MCAST_JOIN_GROUP(41L),
   MCAST_LEAVE_SOURCE_GROUP(46L),
   MCAST_INCLUDE(1L),
   MCAST_BLOCK_SOURCE(43L),
   MCAST_LEAVE_GROUP(42L);

   public static final long MIN_VALUE = 1L;
   private final long value;
   public static final long MAX_VALUE = 46L;

   public final int value() {
      return (int)this.value;
   }

   @Override
   public final String toString() {
      return Multicast.StringTable.descriptions.get(this);
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

   Multicast(long value) {
      this.value = value;
   }

   // $VF: Compiled from Multicast.java
   static final class StringTable {
      public static final Map<Multicast, String> descriptions = generateTable();

      public static final Map<Multicast, String> generateTable() {
         Map<Multicast, String> map = new EnumMap<>(Multicast.class);
         map.put(Multicast.MCAST_JOIN_GROUP, "MCAST_JOIN_GROUP");
         map.put(Multicast.MCAST_BLOCK_SOURCE, "MCAST_BLOCK_SOURCE");
         map.put(Multicast.MCAST_UNBLOCK_SOURCE, "MCAST_UNBLOCK_SOURCE");
         map.put(Multicast.MCAST_LEAVE_GROUP, "MCAST_LEAVE_GROUP");
         map.put(Multicast.MCAST_JOIN_SOURCE_GROUP, "MCAST_JOIN_SOURCE_GROUP");
         map.put(Multicast.MCAST_LEAVE_SOURCE_GROUP, "MCAST_LEAVE_SOURCE_GROUP");
         map.put(Multicast.MCAST_EXCLUDE, "MCAST_EXCLUDE");
         map.put(Multicast.MCAST_INCLUDE, "MCAST_INCLUDE");
         return map;
      }
   }
}
