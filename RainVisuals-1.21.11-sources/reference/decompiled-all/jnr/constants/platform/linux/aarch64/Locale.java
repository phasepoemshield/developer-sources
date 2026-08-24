package jnr.constants.platform.linux.aarch64;

import java.util.EnumMap;
import java.util.Map;
import jnr.constants.Constant;

// $VF: Compiled from Locale.java
public enum Locale implements Constant {
   LC_TELEPHONE(10L),
   LC_PAPER(7L),
   LC_MONETARY(4L),
   LC_TIME(2L),
   LC_COLLATE(3L),
   LC_IDENTIFICATION(12L),
   LC_MEASUREMENT(11L),
   LC_NUMERIC(1L),
   LC_MESSAGES(5L),
   LC_ADDRESS(9L),
   LC_ALL(6L),
   LC_CTYPE(0L),
   LC_NAME(8L);

   public static final long MAX_VALUE = 12L;
   public static final long MIN_VALUE = 0L;
   private final long value;

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
      return Locale.StringTable.descriptions.get(this);
   }

   @Override
   public final boolean defined() {
      return true;
   }

   Locale(long value) {
      this.value = value;
   }

   public final int value() {
      return (int)this.value;
   }

   // $VF: Compiled from Locale.java
   static final class StringTable {
      public static final Map<Locale, String> descriptions = generateTable();

      public static final Map<Locale, String> generateTable() {
         Map<Locale, String> map = new EnumMap<>(Locale.class);
         map.put(Locale.LC_CTYPE, "LC_CTYPE");
         map.put(Locale.LC_NUMERIC, "LC_NUMERIC");
         map.put(Locale.LC_TIME, "LC_TIME");
         map.put(Locale.LC_COLLATE, "LC_COLLATE");
         map.put(Locale.LC_MONETARY, "LC_MONETARY");
         map.put(Locale.LC_MESSAGES, "LC_MESSAGES");
         map.put(Locale.LC_ALL, "LC_ALL");
         map.put(Locale.LC_PAPER, "LC_PAPER");
         map.put(Locale.LC_NAME, "LC_NAME");
         map.put(Locale.LC_ADDRESS, "LC_ADDRESS");
         map.put(Locale.LC_TELEPHONE, "LC_TELEPHONE");
         map.put(Locale.LC_MEASUREMENT, "LC_MEASUREMENT");
         map.put(Locale.LC_IDENTIFICATION, "LC_IDENTIFICATION");
         return map;
      }
   }
}
