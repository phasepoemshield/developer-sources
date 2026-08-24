package jnr.constants.platform.linux;

import java.util.EnumMap;
import java.util.Map;
import jnr.constants.Constant;

// $VF: Compiled from NameInfo.java
public enum NameInfo implements Constant {
   NI_DGRAM(16L),
   NI_NOFQDN(4L),
   NI_MAXHOST(1025L),
   NI_NAMEREQD(8L),
   NI_NUMERICSERV(2L),
   NI_NUMERICHOST(1L),
   NI_MAXSERV(32L);

   public static final long MIN_VALUE = 1L;
   private final long value;
   public static final long MAX_VALUE = 1025L;

   NameInfo(long value) {
      this.value = value;
   }

   @Override
   public final int intValue() {
      return (int)this.value;
   }

   public final int value() {
      return (int)this.value;
   }

   @Override
   public final long longValue() {
      return this.value;
   }

   @Override
   public final String toString() {
      return NameInfo.StringTable.descriptions.get(this);
   }

   @Override
   public final boolean defined() {
      return true;
   }

   // $VF: Compiled from NameInfo.java
   static final class StringTable {
      public static final Map<NameInfo, String> descriptions = generateTable();

      public static final Map<NameInfo, String> generateTable() {
         Map<NameInfo, String> map = new EnumMap<>(NameInfo.class);
         map.put(NameInfo.NI_MAXHOST, "NI_MAXHOST");
         map.put(NameInfo.NI_MAXSERV, "NI_MAXSERV");
         map.put(NameInfo.NI_NOFQDN, "NI_NOFQDN");
         map.put(NameInfo.NI_NUMERICHOST, "NI_NUMERICHOST");
         map.put(NameInfo.NI_NAMEREQD, "NI_NAMEREQD");
         map.put(NameInfo.NI_NUMERICSERV, "NI_NUMERICSERV");
         map.put(NameInfo.NI_DGRAM, "NI_DGRAM");
         return map;
      }
   }
}
