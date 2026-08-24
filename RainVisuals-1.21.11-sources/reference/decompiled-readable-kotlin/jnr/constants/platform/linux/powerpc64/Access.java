package jnr.constants.platform.linux.powerpc64;

import java.util.EnumMap;
import java.util.Map;
import jnr.constants.Constant;

// $VF: Compiled from Access.java
public enum Access implements Constant {
   R_OK(4L),
   W_OK(2L),
   F_OK(0L),
   X_OK(1L);

   public static final long MAX_VALUE = 4L;
   private final long value;
   public static final long MIN_VALUE = 0L;

   @Override
   public final long longValue() {
      return this.value;
   }

   @Override
   public final int intValue() {
      return (int)this.value;
   }

   @Override
   public final String toString() {
      return Access.StringTable.descriptions.get(this);
   }

   Access(long value) {
      this.value = value;
   }

   @Override
   public final boolean defined() {
      return true;
   }

   public final int value() {
      return (int)this.value;
   }

   // $VF: Compiled from Access.java
   static final class StringTable {
      public static final Map<Access, String> descriptions = generateTable();

      public static final Map<Access, String> generateTable() {
         Map<Access, String> map = new EnumMap<>(Access.class);
         map.put(Access.F_OK, "F_OK");
         map.put(Access.X_OK, "X_OK");
         map.put(Access.W_OK, "W_OK");
         map.put(Access.R_OK, "R_OK");
         return map;
      }
   }
}
