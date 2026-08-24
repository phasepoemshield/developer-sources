package jnr.constants.platform.dragonflybsd;

import java.util.EnumMap;
import java.util.Map;
import jnr.constants.Constant;

// $VF: Compiled from TCP.java
public enum TCP implements Constant {
   TCP_MINMSS(256L),
   TCP_MAXSEG(2L),
   TCP_KEEPCNT(1024L),
   TCP_NODELAY(1L),
   TCP_KEEPINTVL(512L),
   TCP_MAXHLEN(60L),
   TCP_KEEPIDLE(256L),
   TCP_MAX_WINSHIFT(14L),
   TCP_MAXBURST(4L),
   TCP_MAXOLEN(40L),
   TCP_MSS(512L),
   TCP_MAXWIN(65535L),
   TCP_NOPUSH(4L),
   TCP_NOOPT(8L);

   public static final long MIN_VALUE = 1L;
   private final long value;
   public static final long MAX_VALUE = 65535L;

   @Override
   public final boolean defined() {
      return true;
   }

   public final int value() {
      return (int)this.value;
   }

   @Override
   public final String toString() {
      return TCP.StringTable.descriptions.get(this);
   }

   @Override
   public final int intValue() {
      return (int)this.value;
   }

   TCP(long value) {
      this.value = value;
   }

   @Override
   public final long longValue() {
      return this.value;
   }

   // $VF: Compiled from TCP.java
   static final class StringTable {
      public static final Map<TCP, String> descriptions = generateTable();

      public static final Map<TCP, String> generateTable() {
         Map<TCP, String> map = new EnumMap<>(TCP.class);
         map.put(TCP.TCP_MSS, "TCP_MSS");
         map.put(TCP.TCP_MINMSS, "TCP_MINMSS");
         map.put(TCP.TCP_MAXWIN, "TCP_MAXWIN");
         map.put(TCP.TCP_MAX_WINSHIFT, "TCP_MAX_WINSHIFT");
         map.put(TCP.TCP_MAXBURST, "TCP_MAXBURST");
         map.put(TCP.TCP_MAXHLEN, "TCP_MAXHLEN");
         map.put(TCP.TCP_MAXOLEN, "TCP_MAXOLEN");
         map.put(TCP.TCP_NODELAY, "TCP_NODELAY");
         map.put(TCP.TCP_MAXSEG, "TCP_MAXSEG");
         map.put(TCP.TCP_NOPUSH, "TCP_NOPUSH");
         map.put(TCP.TCP_NOOPT, "TCP_NOOPT");
         map.put(TCP.TCP_KEEPCNT, "TCP_KEEPCNT");
         map.put(TCP.TCP_KEEPIDLE, "TCP_KEEPIDLE");
         map.put(TCP.TCP_KEEPINTVL, "TCP_KEEPINTVL");
         return map;
      }
   }
}
