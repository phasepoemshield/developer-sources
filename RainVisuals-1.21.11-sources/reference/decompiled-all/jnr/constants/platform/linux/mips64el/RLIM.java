package jnr.constants.platform.linux.mips64el;

import java.util.EnumMap;
import java.util.Map;
import jnr.constants.Constant;

// $VF: Compiled from RLIM.java
public enum RLIM implements Constant {
   RLIM_INFINITY(-1L),
   RLIM_SAVED_CUR(-1L),
   RLIM_SAVED_MAX(-1L),
   RLIM_NLIMITS(16L);

   public static final long MIN_VALUE = 16L;
   public static final long MAX_VALUE = -1L;
   private final long value;

   @Override
   public final boolean defined() {
      return true;
   }

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
      return RLIM.StringTable.descriptions.get(this);
   }

   RLIM(long value) {
      this.value = value;
   }

   // $VF: Compiled from RLIM.java
   static final class StringTable {
      public static final Map<RLIM, String> descriptions = generateTable();

      public static final Map<RLIM, String> generateTable() {
         Map<RLIM, String> map = new EnumMap<>(RLIM.class);
         map.put(RLIM.RLIM_NLIMITS, "RLIM_NLIMITS");
         map.put(RLIM.RLIM_INFINITY, "RLIM_INFINITY");
         map.put(RLIM.RLIM_SAVED_MAX, "RLIM_SAVED_MAX");
         map.put(RLIM.RLIM_SAVED_CUR, "RLIM_SAVED_CUR");
         return map;
      }
   }
}
