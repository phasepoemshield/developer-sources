package jnr.constants.platform.windows;

import java.util.EnumMap;
import java.util.Map;
import jnr.constants.Constant;

// $VF: Compiled from IP.java
public enum IP implements Constant {
   IP_MAX_MEMBERSHIPS(20L),
   IP_TTL(7L),
   IP_DROP_MEMBERSHIP(6L),
   IP_DEFAULT_MULTICAST_TTL(1L),
   IP_MULTICAST_TTL(3L),
   IP_ADD_MEMBERSHIP(5L),
   IP_OPTIONS(1L),
   IP_DEFAULT_MULTICAST_LOOP(1L),
   IP_MULTICAST_IF(2L),
   IP_TOS(8L),
   IP_MULTICAST_LOOP(4L);

   public static final long MAX_VALUE = 20L;
   private final long value;
   public static final long MIN_VALUE = 1L;

   IP(long value) {
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

   @Override
   public final String toString() {
      return IP.StringTable.descriptions.get(this);
   }

   public final int value() {
      return (int)this.value;
   }

   // $VF: Compiled from IP.java
   static final class StringTable {
      public static final Map<IP, String> descriptions = generateTable();

      public static final Map<IP, String> generateTable() {
         Map<IP, String> map = new EnumMap<>(IP.class);
         map.put(IP.IP_OPTIONS, "IP_OPTIONS");
         map.put(IP.IP_TOS, "IP_TOS");
         map.put(IP.IP_TTL, "IP_TTL");
         map.put(IP.IP_MULTICAST_IF, "IP_MULTICAST_IF");
         map.put(IP.IP_MULTICAST_TTL, "IP_MULTICAST_TTL");
         map.put(IP.IP_MULTICAST_LOOP, "IP_MULTICAST_LOOP");
         map.put(IP.IP_ADD_MEMBERSHIP, "IP_ADD_MEMBERSHIP");
         map.put(IP.IP_DROP_MEMBERSHIP, "IP_DROP_MEMBERSHIP");
         map.put(IP.IP_DEFAULT_MULTICAST_TTL, "IP_DEFAULT_MULTICAST_TTL");
         map.put(IP.IP_DEFAULT_MULTICAST_LOOP, "IP_DEFAULT_MULTICAST_LOOP");
         map.put(IP.IP_MAX_MEMBERSHIPS, "IP_MAX_MEMBERSHIPS");
         return map;
      }
   }
}
