/*
 * Decompiled with CFR 0.152.
 */
package jnr.constants.platform.freebsd.aarch64;

import java.util.EnumMap;
import java.util.Map;
import jnr.constants.Constant;

public final class Syslog
extends Enum<Syslog>
implements Constant {
    public static final /* enum */ Syslog LOG_NDELAY;
    public static final /* enum */ Syslog LOG_LOCAL4;
    public static final /* enum */ Syslog LOG_ERR;
    public static final /* enum */ Syslog LOG_LOCAL3;
    public static final /* enum */ Syslog LOG_INFO;
    public static final long MIN_VALUE = 0L;
    public static final /* enum */ Syslog LOG_LOCAL5;
    public static final /* enum */ Syslog LOG_EMERG;
    public static final /* enum */ Syslog LOG_NEWS;
    private final long value;
    public static final /* enum */ Syslog LOG_KERN;
    public static final /* enum */ Syslog LOG_CONSOLE;
    public static final /* enum */ Syslog LOG_PERROR;
    public static final /* enum */ Syslog LOG_FTP;
    public static final /* enum */ Syslog LOG_MAIL;
    public static final /* enum */ Syslog LOG_UUCP;
    public static final /* enum */ Syslog LOG_DEBUG;
    public static final /* enum */ Syslog LOG_LOCAL7;
    public static final /* enum */ Syslog LOG_USER;
    public static final /* enum */ Syslog LOG_PID;
    private static final /* synthetic */ Syslog[] $VALUES;
    public static final /* enum */ Syslog LOG_DAEMON;
    public static final /* enum */ Syslog LOG_SECURITY;
    public static final /* enum */ Syslog LOG_ODELAY;
    public static final /* enum */ Syslog LOG_AUTHPRIV;
    public static final /* enum */ Syslog LOG_LPR;
    public static final /* enum */ Syslog LOG_CONS;
    public static final /* enum */ Syslog LOG_LOCAL2;
    public static final /* enum */ Syslog LOG_NOTICE;
    public static final /* enum */ Syslog LOG_WARNING;
    public static final /* enum */ Syslog LOG_AUTH;
    public static final /* enum */ Syslog LOG_LOCAL0;
    public static final /* enum */ Syslog LOG_CRIT;
    public static final /* enum */ Syslog LOG_SYSLOG;
    public static final /* enum */ Syslog LOG_LOCAL1;
    public static final /* enum */ Syslog LOG_CRON;
    public static final /* enum */ Syslog LOG_ALERT;
    public static final /* enum */ Syslog LOG_LOCAL6;
    public static final /* enum */ Syslog LOG_NTP;
    public static final long MAX_VALUE = 184L;
    public static final /* enum */ Syslog LOG_NOWAIT;

    public static Syslog[] values() {
        return (Syslog[])$VALUES.clone();
    }

    @Override
    public final int intValue() {
        return (int)this.value;
    }

    public static Syslog valueOf(String name) {
        return Enum.valueOf(Syslog.class, name);
    }

    private Syslog(long value) {
        this.value = value;
    }

    @Override
    public final boolean defined() {
        return true;
    }

    @Override
    public final long longValue() {
        return this.value;
    }

    public final int value() {
        return (int)this.value;
    }

    public final String toString() {
        return StringTable.descriptions.get(this);
    }

    static {
        LOG_ALERT = new Syslog(1L);
        LOG_AUTH = new Syslog(32L);
        LOG_AUTHPRIV = new Syslog(80L);
        LOG_CONS = new Syslog(2L);
        LOG_CONSOLE = new Syslog(112L);
        LOG_CRIT = new Syslog(2L);
        LOG_CRON = new Syslog(72L);
        LOG_DAEMON = new Syslog(24L);
        LOG_DEBUG = new Syslog(7L);
        LOG_EMERG = new Syslog(0L);
        LOG_ERR = new Syslog(3L);
        LOG_FTP = new Syslog(88L);
        LOG_INFO = new Syslog(6L);
        LOG_KERN = new Syslog(0L);
        LOG_LOCAL0 = new Syslog(128L);
        LOG_LOCAL1 = new Syslog(136L);
        LOG_LOCAL2 = new Syslog(144L);
        LOG_LOCAL3 = new Syslog(152L);
        LOG_LOCAL4 = new Syslog(160L);
        LOG_LOCAL5 = new Syslog(168L);
        LOG_LOCAL6 = new Syslog(176L);
        LOG_LOCAL7 = new Syslog(184L);
        LOG_LPR = new Syslog(48L);
        LOG_MAIL = new Syslog(16L);
        LOG_NDELAY = new Syslog(8L);
        LOG_NEWS = new Syslog(56L);
        LOG_NOTICE = new Syslog(5L);
        LOG_NOWAIT = new Syslog(16L);
        LOG_NTP = new Syslog(96L);
        LOG_ODELAY = new Syslog(4L);
        LOG_PERROR = new Syslog(32L);
        LOG_PID = new Syslog(1L);
        LOG_SECURITY = new Syslog(104L);
        LOG_SYSLOG = new Syslog(40L);
        LOG_USER = new Syslog(8L);
        LOG_UUCP = new Syslog(64L);
        LOG_WARNING = new Syslog(4L);
        Syslog[] syslogArray = new Syslog[37];
        syslogArray[0] = LOG_ALERT;
        syslogArray[1] = LOG_AUTH;
        syslogArray[2] = LOG_AUTHPRIV;
        syslogArray[3] = LOG_CONS;
        syslogArray[4] = LOG_CONSOLE;
        syslogArray[5] = LOG_CRIT;
        syslogArray[6] = LOG_CRON;
        syslogArray[7] = LOG_DAEMON;
        syslogArray[8] = LOG_DEBUG;
        syslogArray[9] = LOG_EMERG;
        syslogArray[10] = LOG_ERR;
        syslogArray[11] = LOG_FTP;
        syslogArray[12] = LOG_INFO;
        syslogArray[13] = LOG_KERN;
        syslogArray[14] = LOG_LOCAL0;
        syslogArray[15] = LOG_LOCAL1;
        syslogArray[16] = LOG_LOCAL2;
        syslogArray[17] = LOG_LOCAL3;
        syslogArray[18] = LOG_LOCAL4;
        syslogArray[19] = LOG_LOCAL5;
        syslogArray[20] = LOG_LOCAL6;
        syslogArray[21] = LOG_LOCAL7;
        syslogArray[22] = LOG_LPR;
        syslogArray[23] = LOG_MAIL;
        syslogArray[24] = LOG_NDELAY;
        syslogArray[25] = LOG_NEWS;
        syslogArray[26] = LOG_NOTICE;
        syslogArray[27] = LOG_NOWAIT;
        syslogArray[28] = LOG_NTP;
        syslogArray[29] = LOG_ODELAY;
        syslogArray[30] = LOG_PERROR;
        syslogArray[31] = LOG_PID;
        syslogArray[32] = LOG_SECURITY;
        syslogArray[33] = LOG_SYSLOG;
        syslogArray[34] = LOG_USER;
        syslogArray[35] = LOG_UUCP;
        syslogArray[36] = LOG_WARNING;
        $VALUES = syslogArray;
    }

    static final class StringTable {
        public static final Map<Syslog, String> descriptions = StringTable.generateTable();

        StringTable() {
        }

        public static final Map<Syslog, String> generateTable() {
            EnumMap<Syslog, String> map = new EnumMap<Syslog, String>(Syslog.class);
            map.put(LOG_ALERT, "LOG_ALERT");
            map.put(LOG_AUTH, "LOG_AUTH");
            map.put(LOG_AUTHPRIV, "LOG_AUTHPRIV");
            map.put(LOG_CONS, "LOG_CONS");
            map.put(LOG_CONSOLE, "LOG_CONSOLE");
            map.put(LOG_CRIT, "LOG_CRIT");
            map.put(LOG_CRON, "LOG_CRON");
            map.put(LOG_DAEMON, "LOG_DAEMON");
            map.put(LOG_DEBUG, "LOG_DEBUG");
            map.put(LOG_EMERG, "LOG_EMERG");
            map.put(LOG_ERR, "LOG_ERR");
            map.put(LOG_FTP, "LOG_FTP");
            map.put(LOG_INFO, "LOG_INFO");
            map.put(LOG_KERN, "LOG_KERN");
            map.put(LOG_LOCAL0, "LOG_LOCAL0");
            map.put(LOG_LOCAL1, "LOG_LOCAL1");
            map.put(LOG_LOCAL2, "LOG_LOCAL2");
            map.put(LOG_LOCAL3, "LOG_LOCAL3");
            map.put(LOG_LOCAL4, "LOG_LOCAL4");
            map.put(LOG_LOCAL5, "LOG_LOCAL5");
            map.put(LOG_LOCAL6, "LOG_LOCAL6");
            map.put(LOG_LOCAL7, "LOG_LOCAL7");
            map.put(LOG_LPR, "LOG_LPR");
            map.put(LOG_MAIL, "LOG_MAIL");
            map.put(LOG_NDELAY, "LOG_NDELAY");
            map.put(LOG_NEWS, "LOG_NEWS");
            map.put(LOG_NOTICE, "LOG_NOTICE");
            map.put(LOG_NOWAIT, "LOG_NOWAIT");
            map.put(LOG_NTP, "LOG_NTP");
            map.put(LOG_ODELAY, "LOG_ODELAY");
            map.put(LOG_PERROR, "LOG_PERROR");
            map.put(LOG_PID, "LOG_PID");
            map.put(LOG_SECURITY, "LOG_SECURITY");
            map.put(LOG_SYSLOG, "LOG_SYSLOG");
            map.put(LOG_USER, "LOG_USER");
            map.put(LOG_UUCP, "LOG_UUCP");
            map.put(LOG_WARNING, "LOG_WARNING");
            return map;
        }
    }
}

