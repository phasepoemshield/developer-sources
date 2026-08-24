package jnr.constants.platform;

import jnr.constants.Constant;

// $VF: Compiled from SocketControlMessage.java
public enum SocketControlMessage implements Constant {
   SCM_BINTIME,
   SCM_TIMESTAMP,
   SCM_TIMESTAMPNS,
   SCM_UCRED,
   SCM_WIFI_STATUS,
   SCM_CREDS,
   SCM_CREDENTIALS,
   __UNKNOWN_CONSTANT__,
   SCM_TIMESTAMPING,
   SCM_RIGHTS;

   private static final ConstantResolver<SocketControlMessage> resolver = ConstantResolver.getResolver(SocketControlMessage.class, 20000, 29999);

   @Override
   public final long longValue() {
      return resolver.longValue(this);
   }

   @Override
   public final String toString() {
      return this.description();
   }

   public static SocketControlMessage valueOf(long value) {
      return resolver.valueOf(value);
   }

   public final String description() {
      return resolver.description(this);
   }

   public final int value() {
      return (int)resolver.longValue(this);
   }

   @Override
   public final int intValue() {
      return (int)resolver.longValue(this);
   }

   @Override
   public final boolean defined() {
      return resolver.defined(this);
   }
}
