package jnr.constants.platform.aix;

import jnr.constants.Constant;

// $VF: Compiled from ProtocolFamily.java
public enum ProtocolFamily implements Constant {
   PF_UNIX(1L),
   PF_INET6(24L),
   PF_DECnet(12L),
   PF_ECMA(8L),
   PF_ISO(7L),
   PF_IMPLINK(3L),
   PF_LAT(14L),
   PF_DATAKIT(9L),
   PF_OSI(7L),
   PF_DLI(13L),
   PF_INET(2L),
   PF_CHAOS(5L),
   PF_HYLINK(15L),
   PF_LINK(18L),
   PF_ROUTE(17L),
   PF_APPLETALK(16L),
   PF_PUP(4L),
   PF_SNA(11L),
   PF_MAX(30L),
   PF_NS(6L),
   PF_UNSPEC(0L),
   PF_CCITT(10L),
   PF_XTP(19L);

   public static final long MIN_VALUE = 0L;
   public static final long MAX_VALUE = 30L;
   private final long value;

   @Override
   public final long longValue() {
      return this.value;
   }

   ProtocolFamily(long value) {
      this.value = value;
   }

   @Override
   public final boolean defined() {
      return true;
   }

   @Override
   public final int intValue() {
      return (int)this.value;
   }
}
