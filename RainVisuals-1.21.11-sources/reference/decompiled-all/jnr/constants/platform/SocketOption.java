package jnr.constants.platform;

import jnr.constants.Constant;

// $VF: Compiled from SocketOption.java
public enum SocketOption implements Constant {
   SO_MAC_EXEMPT,
   SO_BPF_EXTENSIONS,
   SO_SECURITY_AUTHENTICATION,
   SO_ALLZONES,
   SO_NOADDRERR,
   SO_PEERNAME,
   SO_LOCK_FILTER,
   SO_BUSY_POLL,
   SO_PEERSEC,
   SO_DEBUG,
   SO_NREAD,
   SO_TYPE,
   SO_WIFI_STATUS,
   SO_DONTTRUNC,
   SO_TIMESTAMPNS,
   SO_SNDBUF,
   SO_PEERLABEL,
   SO_USELOOPBACK,
   SO_RCVBUFFORCE,
   SO_SNDBUFFORCE,
   SO_BROADCAST,
   SO_WANTOOBFLAG,
   SO_LABEL,
   SO_RCVBUF,
   SO_RCVTIMEO,
   SO_NOFCS,
   SO_SNDTIMEO,
   SO_PASSCRED,
   SO_PEERCRED,
   SO_SECURITY_ENCRYPTION_TRANSPORT,
   SO_NKE,
   SO_ACCEPTCONN,
   SO_PASSSEC,
   SO_RECVUCRED,
   SO_WANTMORE,
   SO_DETACH_FILTER,
   SO_KEEPALIVE,
   SO_GET_FILTER,
   SO_DOMAIN,
   SO_ATTACH_FILTER,
   SO_LINGER,
   SO_MAX_PACING_RATE,
   SO_REUSESHAREUID,
   SO_RCVLOWAT,
   SO_BINDTODEVICE,
   SO_MARK,
   SO_TIMESTAMPING,
   SO_SELECT_ERR_QUEUE,
   __UNKNOWN_CONSTANT__,
   SO_NOSIGPIPE,
   SO_REUSEADDR,
   SO_PROTOCOL,
   SO_DONTROUTE,
   SO_REUSEPORT,
   SO_NWRITE,
   SO_SECURITY_ENCRYPTION_NETWORK,
   SO_ACCEPTFILTER,
   SO_PRIORITY,
   SO_ERROR,
   SO_OOBINLINE,
   SO_RXQ_OVFL,
   SO_SNDLOWAT,
   SO_PEEK_OFF,
   SO_NO_CHECK,
   SO_TIMESTAMP;

   private static final ConstantResolver<SocketOption> resolver = ConstantResolver.getResolver(SocketOption.class, 20000, 29999);

   public static SocketOption valueOf(long value) {
      return resolver.valueOf(value);
   }

   @Override
   public final long longValue() {
      return resolver.longValue(this);
   }

   @Override
   public final boolean defined() {
      return resolver.defined(this);
   }

   @Override
   public final int intValue() {
      return (int)resolver.longValue(this);
   }

   public final String description() {
      return resolver.description(this);
   }

   @Override
   public final String toString() {
      return this.description();
   }

   public final int value() {
      return (int)resolver.longValue(this);
   }
}
