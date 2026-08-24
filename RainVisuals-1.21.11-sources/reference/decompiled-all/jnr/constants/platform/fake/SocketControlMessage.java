package jnr.constants.platform.fake;

import jnr.constants.Constant;

// $VF: Compiled from SocketControlMessage.java
public enum SocketControlMessage implements Constant {
   SCM_TIMESTAMPING(4L),
   SCM_UCRED(8L),
   SCM_CREDENTIALS(6L),
   SCM_WIFI_STATUS(9L),
   SCM_CREDS(7L),
   SCM_TIMESTAMPNS(3L),
   SCM_RIGHTS(1L),
   SCM_TIMESTAMP(2L),
   SCM_BINTIME(5L);

   private final long value;
   public static final long MIN_VALUE = 1L;
   public static final long MAX_VALUE = 9L;

   @Override
   public final int intValue() {
      return (int)this.value;
   }

   @Override
   public final long longValue() {
      return this.value;
   }

   SocketControlMessage(long value) {
      this.value = value;
   }

   @Override
   public final boolean defined() {
      return true;
   }

   public final int value() {
      return (int)this.value;
   }
}
