package jnr.constants.platform.freebsd;

import java.util.EnumMap;
import java.util.Map;
import jnr.constants.Constant;

// $VF: Compiled from Local.java
public enum Local implements Constant {
   LOCAL_CREDS(2L),
   LOCAL_PEERCRED(1L),
   LOCAL_CONNWAIT(4L);

   private final long value;
   public static final long MAX_VALUE = 4L;
   public static final long MIN_VALUE = 1L;

   @Override
   public final boolean defined() {
      return true;
   }

   @Override
   public final int intValue() {
      return (int)this.value;
   }

   Local(long value) {
      this.value = value;
   }

   @Override
   public final String toString() {
      return Local.StringTable.descriptions.get(this);
   }

   @Override
   public final long longValue() {
      return this.value;
   }

   public final int value() {
      return (int)this.value;
   }

   // $VF: Compiled from Local.java
   static final class StringTable {
      public static final Map<Local, String> descriptions = generateTable();

      public static final Map<Local, String> generateTable() {
         Map<Local, String> map = new EnumMap<>(Local.class);
         map.put(Local.LOCAL_PEERCRED, "LOCAL_PEERCRED");
         map.put(Local.LOCAL_CREDS, "LOCAL_CREDS");
         map.put(Local.LOCAL_CONNWAIT, "LOCAL_CONNWAIT");
         return map;
      }
   }
}
