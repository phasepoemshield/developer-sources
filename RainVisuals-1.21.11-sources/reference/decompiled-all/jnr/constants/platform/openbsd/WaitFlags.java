package jnr.constants.platform.openbsd;

import java.util.EnumMap;
import java.util.Map;
import jnr.constants.Constant;

// $VF: Compiled from WaitFlags.java
public enum WaitFlags implements Constant {
   WNOHANG(1L),
   WUNTRACED(2L),
   WCONTINUED(8L);

   public static final long MIN_VALUE = 1L;
   private final long value;
   public static final long MAX_VALUE = 8L;

   @Override
   public final long longValue() {
      return this.value;
   }

   public final int value() {
      return (int)this.value;
   }

   @Override
   public final String toString() {
      return WaitFlags.StringTable.descriptions.get(this);
   }

   WaitFlags(long value) {
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

   // $VF: Compiled from WaitFlags.java
   static final class StringTable {
      public static final Map<WaitFlags, String> descriptions = generateTable();

      public static final Map<WaitFlags, String> generateTable() {
         Map<WaitFlags, String> map = new EnumMap<>(WaitFlags.class);
         map.put(WaitFlags.WNOHANG, "WNOHANG");
         map.put(WaitFlags.WUNTRACED, "WUNTRACED");
         map.put(WaitFlags.WCONTINUED, "WCONTINUED");
         return map;
      }
   }
}
