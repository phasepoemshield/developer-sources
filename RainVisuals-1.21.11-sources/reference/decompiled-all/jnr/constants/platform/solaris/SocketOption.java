package jnr.constants.platform.solaris;

import java.util.EnumMap;
import java.util.Map;
import jnr.constants.Constant;

// $VF: Compiled from SocketOption.java
public enum SocketOption implements Constant {
   SO_RCVTIMEO(4102L),
   SO_KEEPALIVE(8L),
   SO_ERROR(4103L),
   SO_ACCEPTCONN(2L),
   SO_ATTACH_FILTER(1073741825L),
   SO_REUSEPORT(4110L),
   SO_BROADCAST(32L),
   SO_DEBUG(1L),
   SO_DOMAIN(4108L),
   SO_SNDLOWAT(4099L),
   SO_MAC_EXEMPT(4107L),
   SO_DETACH_FILTER(1073741826L),
   SO_RCVLOWAT(4100L),
   SO_SNDBUF(4097L),
   SO_LINGER(128L),
   SO_TYPE(4104L),
   SO_RECVUCRED(1024L),
   SO_OOBINLINE(256L),
   SO_NOSIGPIPE(8192L),
   SO_USELOOPBACK(64L),
   SO_ALLZONES(4116L),
   SO_SNDTIMEO(4101L),
   SO_REUSEADDR(4L),
   SO_DONTROUTE(16L),
   SO_RCVBUF(4098L),
   SO_TIMESTAMP(4115L);

   public static final long MAX_VALUE = 1073741826L;
   public static final long MIN_VALUE = 1L;
   private final long value;

   @Override
   public final boolean defined() {
      return true;
   }

   public final int value() {
      return (int)this.value;
   }

   SocketOption(long value) {
      this.value = value;
   }

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
      return SocketOption.StringTable.descriptions.get(this);
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
         map.put(SocketOption.SO_REUSEPORT, "SO_REUSEPORT");
         map.put(SocketOption.SO_TIMESTAMP, "SO_TIMESTAMP");
         map.put(SocketOption.SO_SNDBUF, "SO_SNDBUF");
         map.put(SocketOption.SO_RCVBUF, "SO_RCVBUF");
         map.put(SocketOption.SO_SNDLOWAT, "SO_SNDLOWAT");
         map.put(SocketOption.SO_RCVLOWAT, "SO_RCVLOWAT");
         map.put(SocketOption.SO_SNDTIMEO, "SO_SNDTIMEO");
         map.put(SocketOption.SO_RCVTIMEO, "SO_RCVTIMEO");
         map.put(SocketOption.SO_ERROR, "SO_ERROR");
         map.put(SocketOption.SO_TYPE, "SO_TYPE");
         map.put(SocketOption.SO_NOSIGPIPE, "SO_NOSIGPIPE");
         map.put(SocketOption.SO_ATTACH_FILTER, "SO_ATTACH_FILTER");
         map.put(SocketOption.SO_DETACH_FILTER, "SO_DETACH_FILTER");
         map.put(SocketOption.SO_RECVUCRED, "SO_RECVUCRED");
         map.put(SocketOption.SO_MAC_EXEMPT, "SO_MAC_EXEMPT");
         map.put(SocketOption.SO_ALLZONES, "SO_ALLZONES");
         map.put(SocketOption.SO_DOMAIN, "SO_DOMAIN");
         return map;
      }
   }
}
