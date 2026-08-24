package jnr.constants.platform.freebsd;

import java.util.EnumMap;
import java.util.Map;
import jnr.constants.Constant;

// $VF: Compiled from WaitFlags.java
public enum WaitFlags implements Constant {
   WCONTINUED(4L),
   WEXITED(16L),
   WNOWAIT(8L),
   WSTOPPED(2L),
   WUNTRACED(2L),
   WNOHANG(1L);

   private final long value;
   public static final long MAX_VALUE = 16L;
   public static final long MIN_VALUE = 1L;

   public final int value() {
      return (int)this.value;
   }

   WaitFlags(long value) {
      this.value = value;
   }

   @Override
   public final int intValue() {
      return (int)this.value;
   }

   @Override
   public final boolean defined() {
      return true;
   }

   @Override
   public final long longValue() {
      return this.value;
   }

   @Override
   public final String toString() {
      return WaitFlags.StringTable.descriptions.get(this);
   }

   // $VF: Compiled from WaitFlags.java
   static final class StringTable {
      public static final Map<WaitFlags, String> descriptions = generateTable();

      public static final Map<WaitFlags, String> generateTable() {
         Map<WaitFlags, String> map = new EnumMap<>(WaitFlags.class);
         map.put(WaitFlags.WNOHANG, "WNOHANG");
         map.put(WaitFlags.WUNTRACED, "WUNTRACED");
         map.put(WaitFlags.WSTOPPED, "WSTOPPED");
         map.put(WaitFlags.WEXITED, "WEXITED");
         map.put(WaitFlags.WCONTINUED, "WCONTINUED");
         map.put(WaitFlags.WNOWAIT, "WNOWAIT");
         return map;
      }
   }
}
