package jnr.constants.platform.linux.mips64el;

import java.util.EnumMap;
import java.util.Map;
import jnr.constants.Constant;

// $VF: Compiled from WaitFlags.java
public enum WaitFlags implements Constant {
   WNOWAIT(16777216L),
   WCONTINUED(8L),
   WUNTRACED(2L),
   WSTOPPED(2L),
   WNOHANG(1L),
   WEXITED(4L);

   private final long value;
   public static final long MAX_VALUE = 16777216L;
   public static final long MIN_VALUE = 1L;

   @Override
   public final int intValue() {
      return (int)this.value;
   }

   @Override
   public final long longValue() {
      return this.value;
   }

   @Override
   public final String toString() {
      return WaitFlags.StringTable.descriptions.get(this);
   }

   WaitFlags(long value) {
      this.value = value;
   }

   public final int value() {
      return (int)this.value;
   }

   @Override
   public final boolean defined() {
      return true;
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
