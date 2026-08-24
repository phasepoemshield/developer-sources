package jnr.constants.platform.windows;

import java.util.EnumMap;
import java.util.Map;
import jnr.constants.Constant;

// $VF: Compiled from SocketOption.java
public enum SocketOption implements Constant {
   SO_RCVBUF(4098L),
   SO_ACCEPTCONN(2L),
   SO_USELOOPBACK(64L),
   SO_TYPE(4104L),
   SO_KEEPALIVE(8L),
   SO_LINGER(128L),
   SO_SNDBUF(4097L),
   SO_DEBUG(1L),
   SO_ERROR(4103L),
   SO_REUSEADDR(4L),
   SO_BROADCAST(32L),
   SO_RCVTIMEO(4102L),
   SO_DONTROUTE(16L),
   SO_SNDTIMEO(4101L),
   SO_RCVLOWAT(4100L),
   SO_OOBINLINE(256L),
   SO_SNDLOWAT(4099L);

   public static final long MAX_VALUE = 4104L;
   public static final long MIN_VALUE = 1L;
   private final long value;

   @Override
   public final long longValue() {
      return this.value;
   }

   @Override
   public final String toString() {
      return SocketOption.StringTable.descriptions.get(this);
   }

   SocketOption(long value) {
      this.value = value;
   }

   @Override
   public final int intValue() {
      return (int)this.value;
   }

   public final int value() {
      return (int)this.value;
   }

   @Override
   public final boolean defined() {
      return true;
   }

   // $VF: Compiled from SocketOption.java
   static final class StringTable {
      public static final Map<SocketOption, String> descriptions = generateTable();

      public static final Map<SocketOption, String> generateTable() {
         Map<SocketOption, String> map = new EnumMap<>(SocketOption.class);
         map.put(SocketOption.SO_DEBUG, "SO_DEBUG");
         map.put(SocketOption.SO_ACCEPTCONN, "SO_ACCEPTCONN");
         map.put(SocketOption.SO_REUSEADDR, "SO_REUSEADDR");
         map.put(SocketOption.SO_KEEPALIVE, "SO_KEEPALIVE");
         map.put(SocketOption.SO_DONTROUTE, "SO_DONTROUTE");
         map.put(SocketOption.SO_BROADCAST, "SO_BROADCAST");
         map.put(SocketOption.SO_USELOOPBACK, "SO_USELOOPBACK");
         map.put(SocketOption.SO_LINGER, "SO_LINGER");
         map.put(SocketOption.SO_OOBINLINE, "SO_OOBINLINE");
         map.put(SocketOption.SO_SNDBUF, "SO_SNDBUF");
         map.put(SocketOption.SO_RCVBUF, "SO_RCVBUF");
         map.put(SocketOption.SO_SNDLOWAT, "SO_SNDLOWAT");
         map.put(SocketOption.SO_RCVLOWAT, "SO_RCVLOWAT");
         map.put(SocketOption.SO_SNDTIMEO, "SO_SNDTIMEO");
         map.put(SocketOption.SO_RCVTIMEO, "SO_RCVTIMEO");
         map.put(SocketOption.SO_ERROR, "SO_ERROR");
         map.put(SocketOption.SO_TYPE, "SO_TYPE");
         return map;
      }
   }
}
