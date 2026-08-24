package jnr.constants.platform.windows;

import java.util.EnumMap;
import java.util.Map;
import jnr.constants.Constant;

// $VF: Compiled from TCP.java
public enum TCP implements Constant {
   TCP_NODELAY(1L);

   public static final long MAX_VALUE = 1L;
   private final long value;
   public static final long MIN_VALUE = 1L;

   @Override
   public final long longValue() {
      return this.value;
   }

   @Override
   public final boolean defined() {
      return true;
   }

   @Override
   public final int intValue() {
      return (int)this.value;
   }

   TCP(long value) {
      this.value = value;
   }

   public final int value() {
      return (int)this.value;
   }

   @Override
   public final String toString() {
      return TCP.StringTable.descriptions.get(this);
   }

   // $VF: Compiled from TCP.java
   static final class StringTable {
      public static final Map<TCP, String> descriptions = generateTable();

      public static final Map<TCP, String> generateTable() {
         Map<TCP, String> map = new EnumMap<>(TCP.class);
         map.put(TCP.TCP_NODELAY, "TCP_NODELAY");
         return map;
      }
   }
}
