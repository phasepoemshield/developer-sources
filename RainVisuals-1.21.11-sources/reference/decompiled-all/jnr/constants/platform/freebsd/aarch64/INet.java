package jnr.constants.platform.freebsd.aarch64;

import java.util.EnumMap;
import java.util.Map;
import jnr.constants.Constant;

// $VF: Compiled from INet.java
public enum INet implements Constant {
   INET_ADDRSTRLEN(16L);

   public static final long MIN_VALUE = 16L;
   private final long value;
   public static final long MAX_VALUE = 16L;

   @Override
   public final int intValue() {
      return (int)this.value;
   }

   @Override
   public final String toString() {
      return INet.StringTable.descriptions.get(this);
   }

   INet(long value) {
      this.value = value;
   }

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
