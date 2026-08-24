package jnr.constants.platform.openbsd;

import java.util.EnumMap;
import java.util.Map;
import jnr.constants.Constant;

// $VF: Compiled from Locale.java
public enum Locale implements Constant {
   LC_NUMERIC(4L),
   LC_COLLATE(1L),
   LC_TIME(5L),
   LC_MESSAGES(6L),
   LC_CTYPE(2L),
   LC_MONETARY(3L),
   LC_ALL(0L);

   public static final long MAX_VALUE = 6L;
   public static final long MIN_VALUE = 0L;
   private final long value;

   @Override
   public final String toString() {
      return Locale.StringTable.descriptions.get(this);
   }

   public final int value() {
      return (int)this.value;
   }

   @Override
   public final long longValue() {
      return this.value;
   }

   Locale(long value) {
      this.value = value;
   }

   @Override
   public final boolean defined() {
      return true;
   }

   @Override
   public final int intValue() {
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
         return map;
      }
   }
}
