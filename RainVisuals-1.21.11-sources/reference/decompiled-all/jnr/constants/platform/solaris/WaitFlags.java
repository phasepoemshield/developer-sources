package jnr.constants.platform.solaris;

import java.util.EnumMap;
import java.util.Map;
import jnr.constants.Constant;

// $VF: Compiled from WaitFlags.java
public enum WaitFlags implements Constant {
   WNOWAIT(128L),
   WSTOPPED(4L),
   WUNTRACED(4L),
   WCONTINUED(8L),
   WEXITED(1L),
   WNOHANG(64L);

   public static final long MAX_VALUE = 128L;
   private final long value;
   public static final long MIN_VALUE = 1L;

   @Override
   public final int intValue() {
      return (int)this.value;
   }

   @Override
   public final String toString() {
      return WaitFlags.StringTable.descriptions.get(this);
   }

   @Override
   public final boolean defined() {
      return true;
   }

   WaitFlags(long value) {
      this.value = value;
   }

   public final int value() {
      return (int)this.value;
   }

   @Override
   public final long longValue() {
      return this.value;
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
