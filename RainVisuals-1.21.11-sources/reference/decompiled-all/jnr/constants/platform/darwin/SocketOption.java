package jnr.constants.platform.darwin;

import java.util.EnumMap;
import java.util.Map;
import jnr.constants.Constant;

// $VF: Compiled from SocketOption.java
public enum SocketOption implements Constant {
   SO_ERROR(4103L),
   SO_WANTOOBFLAG(32768L),
   SO_RCVTIMEO(4102L),
   SO_NOADDRERR(4131L),
   SO_BROADCAST(32L),
   SO_OOBINLINE(256L),
   SO_USELOOPBACK(64L),
   SO_DEBUG(1L),
   SO_TIMESTAMP(1024L),
   SO_TYPE(4104L),
   SO_KEEPALIVE(8L),
   SO_REUSEPORT(512L),
   SO_DONTTRUNC(8192L),
   SO_WANTMORE(16384L),
   SO_LINGER(128L),
   SO_DONTROUTE(16L),
   SO_NWRITE(4132L),
   SO_NOSIGPIPE(4130L),
   SO_LABEL(4112L),
   SO_RCVBUF(4098L),
   SO_REUSESHAREUID(4133L),
   SO_RCVLOWAT(4100L),
   SO_NREAD(4128L),
   SO_ACCEPTCONN(2L),
   SO_SNDBUF(4097L),
   SO_SNDLOWAT(4099L),
   SO_PEERLABEL(4113L),
   SO_SNDTIMEO(4101L),
   SO_NKE(4129L),
   SO_REUSEADDR(4L);

   public static final long MAX_VALUE = 32768L;
   private final long value;
   public static final long MIN_VALUE = 1L;

   @Override
   public final String toString() {
      return SocketOption.StringTable.descriptions.get(this);
   }

   @Override
   public final int intValue() {
      return (int)this.value;
   }

   @Override
   public final boolean defined() {
      return true;
   }

   SocketOption(long value) {
      this.value = value;
   }

   @Override
   public final long longValue() {
      return this.value;
   }

   public final int value() {
      return (int)this.value;
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
         map.put(SocketOption.SO_DONTTRUNC, "SO_DONTTRUNC");
         map.put(SocketOption.SO_WANTMORE, "SO_WANTMORE");
         map.put(SocketOption.SO_WANTOOBFLAG, "SO_WANTOOBFLAG");
         map.put(SocketOption.SO_SNDBUF, "SO_SNDBUF");
         map.put(SocketOption.SO_RCVBUF, "SO_RCVBUF");
         map.put(SocketOption.SO_SNDLOWAT, "SO_SNDLOWAT");
         map.put(SocketOption.SO_RCVLOWAT, "SO_RCVLOWAT");
         map.put(SocketOption.SO_SNDTIMEO, "SO_SNDTIMEO");
         map.put(SocketOption.SO_RCVTIMEO, "SO_RCVTIMEO");
         map.put(SocketOption.SO_ERROR, "SO_ERROR");
         map.put(SocketOption.SO_TYPE, "SO_TYPE");
         map.put(SocketOption.SO_NREAD, "SO_NREAD");
         map.put(SocketOption.SO_NKE, "SO_NKE");
         map.put(SocketOption.SO_NOSIGPIPE, "SO_NOSIGPIPE");
         map.put(SocketOption.SO_NOADDRERR, "SO_NOADDRERR");
         map.put(SocketOption.SO_NWRITE, "SO_NWRITE");
         map.put(SocketOption.SO_REUSESHAREUID, "SO_REUSESHAREUID");
         map.put(SocketOption.SO_LABEL, "SO_LABEL");
         map.put(SocketOption.SO_PEERLABEL, "SO_PEERLABEL");
         return map;
      }
   }
}
