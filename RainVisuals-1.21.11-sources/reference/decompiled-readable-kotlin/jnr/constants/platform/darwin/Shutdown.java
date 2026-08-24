package jnr.constants.platform.darwin;

import java.util.EnumMap;
import java.util.Map;
import jnr.constants.Constant;

// $VF: Compiled from Shutdown.java
public enum Shutdown implements Constant {
   SHUT_WR(1L),
   SHUT_RDWR(2L),
   SHUT_RD(0L);

   public static final long MAX_VALUE = 2L;
   public static final long MIN_VALUE = 0L;
   private final long value;

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

   Shutdown(long value) {
      this.value = value;
   }

   @Override
   public final String toString() {
      return Shutdown.StringTable.descriptions.get(this);
   }

   @Override
   public final boolean defined() {
      return true;
   }

   // $VF: Compiled from Shutdown.java
   static final class StringTable {
      public static final Map<Shutdown, String> descriptions = generateTable();

      public static final Map<Shutdown, String> generateTable() {
         Map<Shutdown, String> map = new EnumMap<>(Shutdown.class);
         map.put(Shutdown.SHUT_RD, "SHUT_RD");
         map.put(Shutdown.SHUT_WR, "SHUT_WR");
         map.put(Shutdown.SHUT_RDWR, "SHUT_RDWR");
         return map;
      }
   }
}
