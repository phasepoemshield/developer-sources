package jnr.constants.platform.fake;

import jnr.constants.Constant;

// $VF: Compiled from Syslog.java
public enum Syslog implements Constant {
   LOG_LPR(23L),
   LOG_CRIT(6L),
   LOG_LOCAL4(19L),
   LOG_WARNING(37L),
   LOG_CRON(7L),
   LOG_USER(35L),
   LOG_AUTHPRIV(3L),
   LOG_LOCAL7(22L),
   LOG_DAEMON(8L),
   LOG_SYSLOG(34L),
   LOG_INFO(13L),
   LOG_CONSOLE(5L),
   LOG_LOCAL3(18L),
   LOG_NEWS(26L),
   LOG_ALERT(1L),
   LOG_LOCAL0(15L),
   LOG_NDELAY(25L),
   LOG_ERR(11L),
   LOG_CONS(4L),
   LOG_DEBUG(9L),
   LOG_PERROR(31L),
   LOG_LOCAL1(16L),
   LOG_SECURITY(33L),
   LOG_LOCAL2(17L),
   LOG_AUTH(2L),
   LOG_UUCP(36L),
   LOG_LOCAL5(20L),
   LOG_KERN(14L),
   LOG_MAIL(24L),
   LOG_NTP(29L),
   LOG_EMERG(10L),
   LOG_LOCAL6(21L),
   LOG_NOWAIT(28L),
   LOG_NOTICE(27L),
   LOG_FTP(12L),
   LOG_ODELAY(30L),
   LOG_PID(32L);

   private final long value;
   public static final long MIN_VALUE = 1L;
   public static final long MAX_VALUE = 37L;

   @Override
   public final int intValue() {
      return (int)this.value;
   }

   Syslog(long value) {
      this.value = value;
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
