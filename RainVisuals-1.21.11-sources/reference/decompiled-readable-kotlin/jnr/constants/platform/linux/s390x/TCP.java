package jnr.constants.platform.linux.s390x;

import java.util.EnumMap;
import java.util.Map;
import jnr.constants.Constant;

// $VF: Compiled from TCP.java
public enum TCP implements Constant {
   TCP_DEFER_ACCEPT(9L),
   TCP_COOKIE_TRANSACTIONS(15L),
   TCP_KEEPINTVL(5L),
   TCP_KEEPCNT(6L),
   TCP_REPAIR_QUEUE(20L),
   TCP_REPAIR(19L),
   TCP_SYNCNT(7L),
   TCP_CORK(3L),
   TCP_MAXWIN(65535L),
   TCP_NODELAY(1L),
   TCP_THIN_LINEAR_TIMEOUTS(16L),
   TCP_REPAIR_OPTIONS(22L),
   TCP_LINGER2(8L),
   TCP_MAX_WINSHIFT(14L),
   TCP_CONGESTION(13L),
   TCP_MSS(512L),
   TCP_MAXSEG(2L),
   TCP_QUEUE_SEQ(21L),
   TCP_MD5SIG(14L),
   TCP_USER_TIMEOUT(18L),
   TCP_KEEPIDLE(4L),
   TCP_INFO(11L),
   TCP_QUICKACK(12L),
   TCP_FASTOPEN(23L),
   TCP_THIN_DUPACK(17L),
   TCP_TIMESTAMP(24L),
   TCP_WINDOW_CLAMP(10L);

   public static final long MAX_VALUE = 65535L;
   private final long value;
   public static final long MIN_VALUE = 1L;

   @Override
   public final String toString() {
      return TCP.StringTable.descriptions.get(this);
   }

   @Override
   public final boolean defined() {
      return true;
   }

   @Override
   public final long longValue() {
      return this.value;
   }

   TCP(long value) {
      this.value = value;
   }

   @Override
   public final int intValue() {
      return (int)this.value;
   }

   public final int value() {
      return (int)this.value;
   }

   // $VF: Compiled from TCP.java
   static final class StringTable {
      public static final Map<TCP, String> descriptions = generateTable();

      public static final Map<TCP, String> generateTable() {
         Map<TCP, String> map = new EnumMap<>(TCP.class);
         map.put(TCP.TCP_MSS, "TCP_MSS");
         map.put(TCP.TCP_MAXWIN, "TCP_MAXWIN");
         map.put(TCP.TCP_MAX_WINSHIFT, "TCP_MAX_WINSHIFT");
         map.put(TCP.TCP_NODELAY, "TCP_NODELAY");
         map.put(TCP.TCP_MAXSEG, "TCP_MAXSEG");
         map.put(TCP.TCP_CORK, "TCP_CORK");
         map.put(TCP.TCP_DEFER_ACCEPT, "TCP_DEFER_ACCEPT");
         map.put(TCP.TCP_INFO, "TCP_INFO");
         map.put(TCP.TCP_KEEPCNT, "TCP_KEEPCNT");
         map.put(TCP.TCP_KEEPIDLE, "TCP_KEEPIDLE");
         map.put(TCP.TCP_KEEPINTVL, "TCP_KEEPINTVL");
         map.put(TCP.TCP_LINGER2, "TCP_LINGER2");
         map.put(TCP.TCP_MD5SIG, "TCP_MD5SIG");
         map.put(TCP.TCP_QUICKACK, "TCP_QUICKACK");
         map.put(TCP.TCP_SYNCNT, "TCP_SYNCNT");
         map.put(TCP.TCP_WINDOW_CLAMP, "TCP_WINDOW_CLAMP");
         map.put(TCP.TCP_FASTOPEN, "TCP_FASTOPEN");
         map.put(TCP.TCP_CONGESTION, "TCP_CONGESTION");
         map.put(TCP.TCP_COOKIE_TRANSACTIONS, "TCP_COOKIE_TRANSACTIONS");
         map.put(TCP.TCP_QUEUE_SEQ, "TCP_QUEUE_SEQ");
         map.put(TCP.TCP_REPAIR, "TCP_REPAIR");
         map.put(TCP.TCP_REPAIR_OPTIONS, "TCP_REPAIR_OPTIONS");
         map.put(TCP.TCP_REPAIR_QUEUE, "TCP_REPAIR_QUEUE");
         map.put(TCP.TCP_THIN_DUPACK, "TCP_THIN_DUPACK");
         map.put(TCP.TCP_THIN_LINEAR_TIMEOUTS, "TCP_THIN_LINEAR_TIMEOUTS");
         map.put(TCP.TCP_TIMESTAMP, "TCP_TIMESTAMP");
         map.put(TCP.TCP_USER_TIMEOUT, "TCP_USER_TIMEOUT");
         return map;
      }
   }
}
