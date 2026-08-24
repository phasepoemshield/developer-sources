package jnr.constants.platform.openbsd;

import java.util.EnumMap;
import java.util.Map;
import jnr.constants.Constant;

// $VF: Compiled from INet6.java
public enum INet6 implements Constant {
   INET6_ADDRSTRLEN(46L);

   public static final long MAX_VALUE = 46L;
   public static final long MIN_VALUE = 46L;
   private final long value;

   @Override
   public final long longValue() {
      return this.value;
   }

   @Override
   public final boolean defined() {
      return true;
   }

   public final int value() {
      return (int)this.value;
   }

   @Override
   public final String toString() {
      return INet6.StringTable.descriptions.get(this);
   }

   @Override
   public final int intValue() {
      return (int)this.value;
   }

   INet6(long value) {
      this.value = value;
   }

   // $VF: Compiled from INet6.java
   static final class StringTable {
      public static final Map<INet6, String> descriptions = generateTable();

      public static final Map<INet6, String> generateTable() {
         Map<INet6, String> map = new EnumMap<>(INet6.class);
         map.put(INet6.INET6_ADDRSTRLEN, "INET6_ADDRSTRLEN");
         return map;
      }
   }
}
