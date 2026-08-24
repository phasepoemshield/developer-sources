package jnr.constants.platform.linux.mips64el;

import java.util.EnumMap;
import java.util.Map;
import jnr.constants.Constant;

// $VF: Compiled from PRIO.java
public enum PRIO implements Constant {
   PRIO_PGRP(1L),
   PRIO_PROCESS(0L),
   PRIO_USER(2L),
   PRIO_MAX(20L),
   PRIO_MIN(-20L);

   public static final long MIN_VALUE = -20L;
   public static final long MAX_VALUE = 20L;
   private final long value;

   @Override
   public final String toString() {
      return PRIO.StringTable.descriptions.get(this);
   }

   @Override
   public final boolean defined() {
      return true;
   }

   public final int value() {
      return (int)this.value;
   }

   @Override
   public final long longValue() {
      return this.value;
   }

   PRIO(long value) {
      this.value = value;
   }

   @Override
   public final int intValue() {
      return (int)this.value;
   }

   // $VF: Compiled from PRIO.java
   static final class StringTable {
      public static final Map<PRIO, String> descriptions = generateTable();

      public static final Map<PRIO, String> generateTable() {
         Map<PRIO, String> map = new EnumMap<>(PRIO.class);
         map.put(PRIO.PRIO_MIN, "PRIO_MIN");
         map.put(PRIO.PRIO_PROCESS, "PRIO_PROCESS");
         map.put(PRIO.PRIO_PGRP, "PRIO_PGRP");
         map.put(PRIO.PRIO_USER, "PRIO_USER");
         map.put(PRIO.PRIO_MAX, "PRIO_MAX");
         return map;
      }
   }
}
