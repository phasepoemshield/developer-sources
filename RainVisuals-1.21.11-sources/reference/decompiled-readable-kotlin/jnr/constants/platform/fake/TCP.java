package jnr.constants.platform.fake;

import jnr.constants.Constant;

// $VF: Compiled from TCP.java
public enum TCP implements Constant {
   TCP_REPAIR_QUEUE(34L),
   TCP_SYNCNT(26L),
   TCP_NOPUSH(12L),
   TCP_MAX_WINSHIFT(6L),
   TCP_USER_TIMEOUT(38L),
   TCP_MAXWIN(5L),
   TCP_THIN_LINEAR_TIMEOUTS(36L),
   TCP_COOKIE_TRANSACTIONS(30L),
   TCP_KEEPCNT(20L),
   TCP_KEEPALIVE(14L),
   TCP_FASTOPEN(28L),
   TCP_REPAIR_OPTIONS(33L),
   TCP_MINMSS(3L),
   TCP_MAX_SACK(1L),
   TCP_MAXHLEN(8L),
   TCP_QUICKACK(25L),
   TCP_MD5SIG(24L),
   TCP_INFO(19L),
   TCP_LINGER2(23L),
   TCP_WINDOW_CLAMP(27L),
   TCP_KEEPIDLE(21L),
   TCP_THIN_DUPACK(35L),
   TCP_NODELAY(10L),
   TCP_RETRANSHZ(16L),
   TCP_DEFER_ACCEPT(18L),
   TCP_MAXBURST(7L),
   TCP_KEEPINTVL(22L),
   TCP_CORK(17L),
   TCP_CONGESTION(29L),
   TCP_MAXOLEN(9L),
   TCP_QUEUE_SEQ(31L),
   TCP_NOOPT(13L),
   TCP_MSS(2L),
   TCP_MINMSSOVERLOAD(4L),
   TCP_MAXSEG(11L),
   TCP_TIMESTAMP(37L),
   TCP_REPAIR(32L),
   TCP_NSTATES(15L);

   private final long value;
   public static final long MIN_VALUE = 1L;
   public static final long MAX_VALUE = 38L;

   TCP(long value) {
      this.value = value;
   }

   @Override
   public final int intValue() {
      return (int)this.value;
   }

   @Override
   public final long longValue() {
      return this.value;
   }

   public final int value() {
      return (int)this.value;
   }

   @Override
   public final boolean defined() {
      return true;
   }
}
