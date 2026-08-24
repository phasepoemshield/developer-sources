package jnr.constants.platform.linux;

import java.util.EnumMap;
import java.util.Map;
import jnr.constants.Constant;

// $VF: Compiled from SocketOption.java
public enum SocketOption implements Constant {
   SO_WIFI_STATUS(41L),
   SO_SNDTIMEO(21L),
   SO_ACCEPTCONN(30L),
   SO_BUSY_POLL(46L),
   SO_REUSEADDR(2L),
   SO_RCVLOWAT(18L),
   SO_BINDTODEVICE(25L),
   SO_PRIORITY(12L),
   SO_MAX_PACING_RATE(47L),
   SO_PEEK_OFF(42L),
   SO_NOFCS(43L),
   SO_LOCK_FILTER(44L),
   SO_PROTOCOL(38L),
   SO_DONTROUTE(5L),
   SO_LINGER(13L),
   SO_RCVBUF(8L),
   SO_KEEPALIVE(9L),
   SO_SECURITY_ENCRYPTION_NETWORK(24L),
   SO_PEERNAME(28L),
   SO_TIMESTAMPING(37L),
   SO_MARK(36L),
   SO_REUSEPORT(15L),
   SO_BPF_EXTENSIONS(48L),
   SO_SNDBUFFORCE(32L),
   SO_BROADCAST(6L),
   SO_TIMESTAMPNS(35L),
   SO_DETACH_FILTER(27L),
   SO_OOBINLINE(10L),
   SO_TYPE(3L),
   SO_SECURITY_AUTHENTICATION(22L),
   SO_SELECT_ERR_QUEUE(45L),
   SO_PEERSEC(31L),
   SO_DEBUG(1L),
   SO_PASSCRED(16L),
   SO_DOMAIN(39L),
   SO_ATTACH_FILTER(26L),
   SO_SNDBUF(7L),
   SO_ERROR(4L),
   SO_RCVTIMEO(20L),
   SO_PASSSEC(34L),
   SO_SECURITY_ENCRYPTION_TRANSPORT(23L),
   SO_RXQ_OVFL(40L),
   SO_SNDLOWAT(19L),
   SO_NO_CHECK(11L),
   SO_TIMESTAMP(29L),
   SO_PEERCRED(17L),
   SO_RCVBUFFORCE(33L),
   SO_GET_FILTER(26L);

   private final long value;
   public static final long MIN_VALUE = 1L;
   public static final long MAX_VALUE = 48L;

   @Override
   public final int intValue() {
      return (int)this.value;
   }

   SocketOption(long value) {
      this.value = value;
   }

   @Override
   public final boolean defined() {
      return true;
   }

   public final int value() {
      return (int)this.value;
   }

   @Override
   public final long longValue() {
      return this.value;
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
         map.put(SocketOption.SO_SNDBUFFORCE, "SO_SNDBUFFORCE");
         map.put(SocketOption.SO_RCVBUFFORCE, "SO_RCVBUFFORCE");
         map.put(SocketOption.SO_GET_FILTER, "SO_GET_FILTER");
         map.put(SocketOption.SO_TIMESTAMPNS, "SO_TIMESTAMPNS");
         map.put(SocketOption.SO_PEERSEC, "SO_PEERSEC");
         map.put(SocketOption.SO_PASSSEC, "SO_PASSSEC");
         map.put(SocketOption.SO_MARK, "SO_MARK");
         map.put(SocketOption.SO_TIMESTAMPING, "SO_TIMESTAMPING");
         map.put(SocketOption.SO_PROTOCOL, "SO_PROTOCOL");
         map.put(SocketOption.SO_DOMAIN, "SO_DOMAIN");
         map.put(SocketOption.SO_RXQ_OVFL, "SO_RXQ_OVFL");
         map.put(SocketOption.SO_WIFI_STATUS, "SO_WIFI_STATUS");
         map.put(SocketOption.SO_PEEK_OFF, "SO_PEEK_OFF");
         map.put(SocketOption.SO_NOFCS, "SO_NOFCS");
         map.put(SocketOption.SO_LOCK_FILTER, "SO_LOCK_FILTER");
         map.put(SocketOption.SO_SELECT_ERR_QUEUE, "SO_SELECT_ERR_QUEUE");
         map.put(SocketOption.SO_BUSY_POLL, "SO_BUSY_POLL");
         map.put(SocketOption.SO_MAX_PACING_RATE, "SO_MAX_PACING_RATE");
         map.put(SocketOption.SO_BPF_EXTENSIONS, "SO_BPF_EXTENSIONS");
         map.put(SocketOption.SO_SECURITY_AUTHENTICATION, "SO_SECURITY_AUTHENTICATION");
         map.put(SocketOption.SO_SECURITY_ENCRYPTION_NETWORK, "SO_SECURITY_ENCRYPTION_NETWORK");
         map.put(SocketOption.SO_SECURITY_ENCRYPTION_TRANSPORT, "SO_SECURITY_ENCRYPTION_TRANSPORT");
         return map;
      }
   }
}
