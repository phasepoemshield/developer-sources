package jnr.constants.platform.solaris;

import java.util.EnumMap;
import java.util.Map;
import jnr.constants.Constant;

// $VF: Compiled from TCP.java
public enum TCP implements Constant {
   TCP_LINGER2(28L),
   TCP_CORK(24L),
   TCP_KEEPALIVE(8L),
   TCP_CONGESTION(35L),
   TCP_INFO(34L),
   TCP_MSS(536L),
   TCP_KEEPCNT(31L),
   TCP_MD5SIG(36L),
   TCP_KEEPINTVL(30L),
   TCP_MAXSEG(2L),
   TCP_KEEPIDLE(29L),
   TCP_NODELAY(1L);

   public static final long MIN_VALUE = 1L;
   public static final long MAX_VALUE = 536L;
   private final long value;

   @Override
   public final String toString() {
      return TCP.StringTable.descriptions.get(this);
   }

   @Override
   public final long longValue() {
      return this.value;
   }

   public final int value() {
      return (int)this.value;
   }

   @Override
   public final boolean defined() {
      return true;
   }

   TCP(long value) {
      this.value = value;
   }

   @Override
   public final int intValue() {
      return (int)this.value;
   }

   // $VF: Compiled from TCP.java
   static final class StringTable {
      public static final Map<TCP, String> descriptions = generateTable();

      public static final Map<TCP, String> generateTable() {
         Map<TCP, String> map = new EnumMap<>(TCP.class);
         map.put(TCP.TCP_MSS, "TCP_MSS");
         map.put(TCP.TCP_NODELAY, "TCP_NODELAY");
         map.put(TCP.TCP_MAXSEG, "TCP_MAXSEG");
         map.put(TCP.TCP_KEEPALIVE, "TCP_KEEPALIVE");
         map.put(TCP.TCP_CORK, "TCP_CORK");
         map.put(TCP.TCP_INFO, "TCP_INFO");
         map.put(TCP.TCP_KEEPCNT, "TCP_KEEPCNT");
         map.put(TCP.TCP_KEEPIDLE, "TCP_KEEPIDLE");
         map.put(TCP.TCP_KEEPINTVL, "TCP_KEEPINTVL");
         map.put(TCP.TCP_LINGER2, "TCP_LINGER2");
         map.put(TCP.TCP_MD5SIG, "TCP_MD5SIG");
         map.put(TCP.TCP_CONGESTION, "TCP_CONGESTION");
         return map;
      }
   }
}
