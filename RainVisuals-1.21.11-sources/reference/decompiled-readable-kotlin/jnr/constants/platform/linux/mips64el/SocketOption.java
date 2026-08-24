package jnr.constants.platform.linux.mips64el;

import java.util.EnumMap;
import java.util.Map;
import jnr.constants.Constant;

// $VF: Compiled from SocketOption.java
public enum SocketOption implements Constant {
   SO_SNDLOWAT(4099L),
   SO_PEERCRED(18L),
   SO_BROADCAST(32L),
   SO_ERROR(4103L),
   SO_ACCEPTCONN(4105L),
   SO_SNDBUF(4097L),
   SO_NO_CHECK(11L),
   SO_PEERNAME(28L),
   SO_DONTROUTE(16L),
   SO_SECURITY_ENCRYPTION_NETWORK(24L),
   SO_RCVLOWAT(4100L),
   SO_PASSCRED(17L),
   SO_RCVTIMEO(4102L),
   SO_ATTACH_FILTER(26L),
   SO_SECURITY_AUTHENTICATION(22L),
   SO_DEBUG(1L),
   SO_REUSEPORT(512L),
   SO_LINGER(128L),
   SO_SECURITY_ENCRYPTION_TRANSPORT(23L),
   SO_RCVBUF(4098L),
   SO_OOBINLINE(256L),
   SO_KEEPALIVE(8L),
   SO_TYPE(4104L),
   SO_BINDTODEVICE(25L),
   SO_PRIORITY(12L),
   SO_REUSEADDR(4L),
   SO_DETACH_FILTER(27L),
   SO_TIMESTAMP(29L),
   SO_SNDTIMEO(4101L);

   public static final long MAX_VALUE = 4105L;
   private final long value;
   public static final long MIN_VALUE = 1L;

   @Override
   public final String toString() {
      return SocketOption.StringTable.descriptions.get(this);
   }

   public final int value() {
      return (int)this.value;
   }

   SocketOption(long value) {
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
         map.put(SocketOption.SO_ATTACH_FILTER, "SO_ATTACH_FILTER");
         map.put(SocketOption.SO_BINDTODEVICE, "SO_BINDTODEVICE");
         map.put(SocketOption.SO_DETACH_FILTER, "SO_DETACH_FILTER");
         map.put(SocketOption.SO_NO_CHECK, "SO_NO_CHECK");
         map.put(SocketOption.SO_PASSCRED, "SO_PASSCRED");
         map.put(SocketOption.SO_PEERCRED, "SO_PEERCRED");
         map.put(SocketOption.SO_PEERNAME, "SO_PEERNAME");
         map.put(SocketOption.SO_PRIORITY, "SO_PRIORITY");
         map.put(SocketOption.SO_SECURITY_AUTHENTICATION, "SO_SECURITY_AUTHENTICATION");
         map.put(SocketOption.SO_SECURITY_ENCRYPTION_NETWORK, "SO_SECURITY_ENCRYPTION_NETWORK");
         map.put(SocketOption.SO_SECURITY_ENCRYPTION_TRANSPORT, "SO_SECURITY_ENCRYPTION_TRANSPORT");
         return map;
      }
   }
}
