package jnr.constants.platform;

import jnr.constants.Constant;

// $VF: Compiled from Syslog.java
public enum Syslog implements Constant {
   LOG_PERROR,
   LOG_CONS,
   LOG_CRON,
   __UNKNOWN_CONSTANT__,
   LOG_LOCAL0,
   LOG_LOCAL4,
   LOG_LOCAL5,
   LOG_NEWS,
   LOG_DEBUG,
   LOG_WARNING,
   LOG_LOCAL3,
   LOG_NTP,
   LOG_USER,
   LOG_CRIT,
   LOG_UUCP,
   LOG_LOCAL2,
   LOG_MAIL,
   LOG_SECURITY,
   LOG_INFO,
   LOG_SYSLOG,
   LOG_NDELAY,
   LOG_AUTH,
   LOG_DAEMON,
   LOG_ODELAY,
   LOG_NOWAIT,
   LOG_PID,
   LOG_NOTICE,
   LOG_LPR,
   LOG_EMERG,
   LOG_CONSOLE,
   LOG_LOCAL7,
   LOG_AUTHPRIV,
   LOG_LOCAL1,
   LOG_ALERT,
   LOG_ERR,
   LOG_FTP,
   LOG_KERN,
   LOG_LOCAL6;

   private static final ConstantResolver<Syslog> resolver = ConstantResolver.getResolver(Syslog.class, 20000, 29999);

   @Override
   public final String toString() {
      return this.description();
   }

   public static Syslog valueOf(long value) {
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

   public final int value() {
      return (int)resolver.longValue(this);
   }

   @Override
   public final int intValue() {
      return (int)resolver.longValue(this);
   }

   public final String description() {
      return resolver.description(this);
   }
}
