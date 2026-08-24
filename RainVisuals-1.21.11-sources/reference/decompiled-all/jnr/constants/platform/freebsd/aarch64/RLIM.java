package jnr.constants.platform.freebsd.aarch64;

import java.util.EnumMap;
import java.util.Map;
import jnr.constants.Constant;

// $VF: Compiled from RLIM.java
public enum RLIM implements Constant {
   RLIM_INFINITY(Long.MAX_VALUE),
   RLIM_NLIMITS(15L),
   RLIM_SAVED_CUR(Long.MAX_VALUE),
   RLIM_SAVED_MAX(Long.MAX_VALUE);

   public static final long MIN_VALUE = 15L;
   private final long value;
   public static final long MAX_VALUE = Long.MAX_VALUE;

   @Override
   public final boolean defined() {
      return true;
   }

   RLIM(long value) {
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
   public final String toString() {
      return RLIM.StringTable.descriptions.get(this);
   }

   @Override
   public final int intValue() {
      return (int)this.value;
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
