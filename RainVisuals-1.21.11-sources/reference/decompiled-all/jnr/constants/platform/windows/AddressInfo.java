package jnr.constants.platform.windows;

import java.util.EnumMap;
import java.util.Map;
import jnr.constants.Constant;

// $VF: Compiled from AddressInfo.java
public enum AddressInfo implements Constant {
   AI_V4MAPPED(2048L),
   AI_CANONNAME(2L),
   AI_ADDRCONFIG(1024L),
   AI_NUMERICSERV(8L),
   AI_ALL(256L),
   AI_NUMERICHOST(4L),
   AI_PASSIVE(1L);

   private final long value;
   public static final long MIN_VALUE = 1L;
   public static final long MAX_VALUE = 2048L;

   @Override
   public final long longValue() {
      return this.value;
   }

   public final int value() {
      return (int)this.value;
   }

   @Override
   public final int intValue() {
      return (int)this.value;
   }

   @Override
   public final String toString() {
      return AddressInfo.StringTable.descriptions.get(this);
   }

   @Override
   public final boolean defined() {
      return true;
   }

   AddressInfo(long value) {
      this.value = value;
   }

   // $VF: Compiled from AddressInfo.java
   static final class StringTable {
      public static final Map<AddressInfo, String> descriptions = generateTable();

      public static final Map<AddressInfo, String> generateTable() {
         Map<AddressInfo, String> map = new EnumMap<>(AddressInfo.class);
         map.put(AddressInfo.AI_PASSIVE, "AI_PASSIVE");
         map.put(AddressInfo.AI_CANONNAME, "AI_CANONNAME");
         map.put(AddressInfo.AI_NUMERICHOST, "AI_NUMERICHOST");
         map.put(AddressInfo.AI_NUMERICSERV, "AI_NUMERICSERV");
         map.put(AddressInfo.AI_ALL, "AI_ALL");
         map.put(AddressInfo.AI_ADDRCONFIG, "AI_ADDRCONFIG");
         map.put(AddressInfo.AI_V4MAPPED, "AI_V4MAPPED");
         return map;
      }
   }
}
