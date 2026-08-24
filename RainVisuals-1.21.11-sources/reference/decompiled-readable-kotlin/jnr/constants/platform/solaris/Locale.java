package jnr.constants.platform.solaris;

import java.util.EnumMap;
import java.util.Map;
import jnr.constants.Constant;

// $VF: Compiled from Locale.java
public enum Locale implements Constant {
   LC_CTYPE(0L),
   LC_TIME(2L),
   LC_COLLATE(3L),
   LC_MESSAGES(5L),
   LC_NUMERIC(1L),
   LC_ALL(6L),
   LC_MONETARY(4L);

   private final long value;
   public static final long MAX_VALUE = 6L;
   public static final long MIN_VALUE = 0L;

   @Override
   public final int intValue() {
      return (int)this.value;
   }

   @Override
   public final String toString() {
      return Locale.StringTable.descriptions.get(this);
   }

   Locale(long value) {
      this.value = value;
   }

   @Override
   public final long longValue() {
      return this.value;
   }

   public final int value() {
      return (int)this.value;
   }

   @Override
   public final boolean defined() {
      return true;
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
