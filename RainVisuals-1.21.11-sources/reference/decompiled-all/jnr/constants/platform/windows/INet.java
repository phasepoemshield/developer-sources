package jnr.constants.platform.windows;

import java.util.EnumMap;
import java.util.Map;
import jnr.constants.Constant;

// $VF: Compiled from INet.java
public enum INet implements Constant {
   INET_ADDRSTRLEN(22L);

   public static final long MAX_VALUE = 22L;
   private final long value;
   public static final long MIN_VALUE = 22L;

   @Override
   public final String toString() {
      return INet.StringTable.descriptions.get(this);
   }

   INet(long value) {
      this.value = value;
   }

   @Override
   public final int intValue() {
      return (int)this.value;
   }

   public final int value() {
      return (int)this.value;
   }

   @Override
   public final long longValue() {
      return this.value;
   }

   @Override
   public final boolean defined() {
      return true;
   }

   // $VF: Compiled from INet.java
   static final class StringTable {
      public static final Map<INet, String> descriptions = generateTable();

      public static final Map<INet, String> generateTable() {
         Map<INet, String> map = new EnumMap<>(INet.class);
         map.put(INet.INET_ADDRSTRLEN, "INET_ADDRSTRLEN");
         return map;
      }
   }
}
