package jnr.constants.platform.linux.loongarch64;

import java.util.EnumMap;
import java.util.Map;
import jnr.constants.Constant;

// $VF: Compiled from UDP.java
public enum UDP implements Constant {
   UDP_CORK(1L);

   private final long value;
   public static final long MAX_VALUE = 1L;
   public static final long MIN_VALUE = 1L;

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

   @Override
   public final int intValue() {
      return (int)this.value;
   }

   @Override
   public final String toString() {
      return UDP.StringTable.descriptions.get(this);
   }

   UDP(long value) {
      this.value = value;
   }

   // $VF: Compiled from UDP.java
   static final class StringTable {
      public static final Map<UDP, String> descriptions = generateTable();

      public static final Map<UDP, String> generateTable() {
         Map<UDP, String> map = new EnumMap<>(UDP.class);
         map.put(UDP.UDP_CORK, "UDP_CORK");
         return map;
      }
   }
}
