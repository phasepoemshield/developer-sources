package jnr.constants.platform.openbsd;

import java.util.EnumMap;
import java.util.Map;
import jnr.constants.Constant;

// $VF: Compiled from TCP.java
public enum TCP implements Constant {
   TCP_MSS(512L),
   TCP_NOPUSH(16L),
   TCP_NODELAY(1L),
   TCP_MAXWIN(65535L),
   TCP_MAXBURST(4L),
   TCP_MAXSEG(2L),
   TCP_MAX_SACK(3L),
   TCP_MAX_WINSHIFT(14L),
   TCP_MD5SIG(4L);

   public static final long MAX_VALUE = 65535L;
   private final long value;
   public static final long MIN_VALUE = 1L;

   @Override
   public final long longValue() {
      return this.value;
   }

   TCP(long value) {
      this.value = value;
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
      return TCP.StringTable.descriptions.get(this);
   }

   // $VF: Compiled from TCP.java
   static final class StringTable {
      public static final Map<TCP, String> descriptions = generateTable();

      public static final Map<TCP, String> generateTable() {
         Map<TCP, String> map = new EnumMap<>(TCP.class);
         map.put(TCP.TCP_MAX_SACK, "TCP_MAX_SACK");
         map.put(TCP.TCP_MSS, "TCP_MSS");
         map.put(TCP.TCP_MAXWIN, "TCP_MAXWIN");
         map.put(TCP.TCP_MAX_WINSHIFT, "TCP_MAX_WINSHIFT");
         map.put(TCP.TCP_MAXBURST, "TCP_MAXBURST");
         map.put(TCP.TCP_NODELAY, "TCP_NODELAY");
         map.put(TCP.TCP_MAXSEG, "TCP_MAXSEG");
         map.put(TCP.TCP_NOPUSH, "TCP_NOPUSH");
         map.put(TCP.TCP_MD5SIG, "TCP_MD5SIG");
         return map;
      }
   }
}
