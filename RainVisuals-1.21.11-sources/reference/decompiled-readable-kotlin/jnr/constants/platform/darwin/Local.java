package jnr.constants.platform.darwin;

import java.util.EnumMap;
import java.util.Map;
import jnr.constants.Constant;

// $VF: Compiled from Local.java
public enum Local implements Constant {
   LOCAL_PEERCRED(1L);

   public static final long MAX_VALUE = 1L;
   public static final long MIN_VALUE = 1L;
   private final long value;

   Local(long value) {
      this.value = value;
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
      return Local.StringTable.descriptions.get(this);
   }

   public final int value() {
      return (int)this.value;
   }

   @Override
   public final long longValue() {
      return this.value;
   }

   // $VF: Compiled from Local.java
   static final class StringTable {
      public static final Map<Local, String> descriptions = generateTable();

      public static final Map<Local, String> generateTable() {
         Map<Local, String> map = new EnumMap<>(Local.class);
         map.put(Local.LOCAL_PEERCRED, "LOCAL_PEERCRED");
         return map;
      }
   }
}
