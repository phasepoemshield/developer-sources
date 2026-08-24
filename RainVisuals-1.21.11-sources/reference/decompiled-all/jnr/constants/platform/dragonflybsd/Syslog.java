package jnr.constants.platform.dragonflybsd;

import java.util.EnumMap;
import java.util.Map;
import jnr.constants.Constant;

// $VF: Compiled from Syslog.java
public enum Syslog implements Constant {
   LOG_LPR(48L),
   LOG_LOCAL6(176L),
   LOG_CRIT(2L),
   LOG_LOCAL4(160L),
   LOG_LOCAL5(168L),
   LOG_SECURITY(104L),
   LOG_AUTHPRIV(80L),
   LOG_DEBUG(7L),
   LOG_AUTH(32L),
   LOG_NOTICE(5L),
   LOG_CONS(2L),
   LOG_PID(1L),
   LOG_MAIL(16L),
   LOG_LOCAL0(128L),
   LOG_ODELAY(4L),
   LOG_LOCAL3(152L),
   LOG_PERROR(32L),
   LOG_INFO(6L),
   LOG_CRON(72L),
   LOG_LOCAL2(144L),
   LOG_SYSLOG(40L),
   LOG_CONSOLE(112L),
   LOG_NOWAIT(16L),
   LOG_LOCAL1(136L),
   LOG_ALERT(1L),
   LOG_LOCAL7(184L),
   LOG_NTP(96L),
   LOG_UUCP(64L),
   LOG_DAEMON(24L),
   LOG_KERN(0L),
   LOG_EMERG(0L),
   LOG_NDELAY(8L),
   LOG_ERR(3L),
   LOG_USER(8L),
   LOG_WARNING(4L),
   LOG_NEWS(56L),
   LOG_FTP(88L);

   public static final long MAX_VALUE = 184L;
   public static final long MIN_VALUE = 0L;
   private final long value;

   @Override
   public final String toString() {
      return Syslog.StringTable.descriptions.get(this);
   }

   @Override
   public final int intValue() {
      return (int)this.value;
   }

   public final int value() {
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

   Syslog(long value) {
      this.value = value;
   }

   // $VF: Compiled from Syslog.java
   static final class StringTable {
      public static final Map<Syslog, String> descriptions = generateTable();

      public static final Map<Syslog, String> generateTable() {
         Map<Syslog, String> map = new EnumMap<>(Syslog.class);
         map.put(Syslog.LOG_ALERT, "LOG_ALERT");
         map.put(Syslog.LOG_AUTH, "LOG_AUTH");
         map.put(Syslog.LOG_AUTHPRIV, "LOG_AUTHPRIV");
         map.put(Syslog.LOG_CONS, "LOG_CONS");
         map.put(Syslog.LOG_CONSOLE, "LOG_CONSOLE");
         map.put(Syslog.LOG_CRIT, "LOG_CRIT");
         map.put(Syslog.LOG_CRON, "LOG_CRON");
         map.put(Syslog.LOG_DAEMON, "LOG_DAEMON");
         map.put(Syslog.LOG_DEBUG, "LOG_DEBUG");
         map.put(Syslog.LOG_EMERG, "LOG_EMERG");
         map.put(Syslog.LOG_ERR, "LOG_ERR");
         map.put(Syslog.LOG_FTP, "LOG_FTP");
         map.put(Syslog.LOG_INFO, "LOG_INFO");
         map.put(Syslog.LOG_KERN, "LOG_KERN");
         map.put(Syslog.LOG_LOCAL0, "LOG_LOCAL0");
         map.put(Syslog.LOG_LOCAL1, "LOG_LOCAL1");
         map.put(Syslog.LOG_LOCAL2, "LOG_LOCAL2");
         map.put(Syslog.LOG_LOCAL3, "LOG_LOCAL3");
         map.put(Syslog.LOG_LOCAL4, "LOG_LOCAL4");
         map.put(Syslog.LOG_LOCAL5, "LOG_LOCAL5");
         map.put(Syslog.LOG_LOCAL6, "LOG_LOCAL6");
         map.put(Syslog.LOG_LOCAL7, "LOG_LOCAL7");
         map.put(Syslog.LOG_LPR, "LOG_LPR");
         map.put(Syslog.LOG_MAIL, "LOG_MAIL");
         map.put(Syslog.LOG_NDELAY, "LOG_NDELAY");
         map.put(Syslog.LOG_NEWS, "LOG_NEWS");
         map.put(Syslog.LOG_NOTICE, "LOG_NOTICE");
         map.put(Syslog.LOG_NOWAIT, "LOG_NOWAIT");
         map.put(Syslog.LOG_NTP, "LOG_NTP");
         map.put(Syslog.LOG_ODELAY, "LOG_ODELAY");
         map.put(Syslog.LOG_PERROR, "LOG_PERROR");
         map.put(Syslog.LOG_PID, "LOG_PID");
         map.put(Syslog.LOG_SECURITY, "LOG_SECURITY");
         map.put(Syslog.LOG_SYSLOG, "LOG_SYSLOG");
         map.put(Syslog.LOG_USER, "LOG_USER");
         map.put(Syslog.LOG_UUCP, "LOG_UUCP");
         map.put(Syslog.LOG_WARNING, "LOG_WARNING");
         return map;
      }
   }
}
