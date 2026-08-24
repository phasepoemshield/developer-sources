/*
 * Decompiled with CFR 0.152.
 */
package jnr.constants.platform.fake;

import jnr.constants.Constant;

public final class Syslog
extends Enum<Syslog>
implements Constant {
    public static final /* enum */ Syslog LOG_LPR;
    public static final /* enum */ Syslog LOG_CRIT;
    private final long value;
    public static final /* enum */ Syslog LOG_LOCAL4;
    public static final /* enum */ Syslog LOG_WARNING;
    public static final /* enum */ Syslog LOG_CRON;
    public static final /* enum */ Syslog LOG_USER;
    public static final /* enum */ Syslog LOG_AUTHPRIV;
    public static final /* enum */ Syslog LOG_LOCAL7;
    public static final /* enum */ Syslog LOG_DAEMON;
    public static final /* enum */ Syslog LOG_SYSLOG;
    public static final /* enum */ Syslog LOG_INFO;
    public static final /* enum */ Syslog LOG_CONSOLE;
    public static final /* enum */ Syslog LOG_LOCAL3;
    public static final /* enum */ Syslog LOG_NEWS;
    public static final /* enum */ Syslog LOG_ALERT;
    public static final /* enum */ Syslog LOG_LOCAL0;
    public static final /* enum */ Syslog LOG_NDELAY;
    public static final long MIN_VALUE = 1L;
    public static final /* enum */ Syslog LOG_ERR;
    public static final /* enum */ Syslog LOG_CONS;
    public static final long MAX_VALUE = 37L;
    public static final /* enum */ Syslog LOG_DEBUG;
    public static final /* enum */ Syslog LOG_PERROR;
    public static final /* enum */ Syslog LOG_LOCAL1;
    public static final /* enum */ Syslog LOG_SECURITY;
    public static final /* enum */ Syslog LOG_LOCAL2;
    public static final /* enum */ Syslog LOG_AUTH;
    public static final /* enum */ Syslog LOG_UUCP;
    public static final /* enum */ Syslog LOG_LOCAL5;
    public static final /* enum */ Syslog LOG_KERN;
    public static final /* enum */ Syslog LOG_MAIL;
    public static final /* enum */ Syslog LOG_NTP;
    public static final /* enum */ Syslog LOG_EMERG;
    public static final /* enum */ Syslog LOG_LOCAL6;
    public static final /* enum */ Syslog LOG_NOWAIT;
    public static final /* enum */ Syslog LOG_NOTICE;
    public static final /* enum */ Syslog LOG_FTP;
    private static final /* synthetic */ Syslog[] $VALUES;
    public static final /* enum */ Syslog LOG_ODELAY;
    public static final /* enum */ Syslog LOG_PID;

    @Override
    public final int intValue() {
        return (int)this.value;
    }

    private Syslog(long value) {
        this.value = value;
    }

    public static Syslog[] values() {
        return (Syslog[])$VALUES.clone();
    }

    @Override
    public final long longValue() {
        return this.value;
    }

    static {
        LOG_ALERT = new Syslog(1L);
        LOG_AUTH = new Syslog(2L);
        LOG_AUTHPRIV = new Syslog(3L);
        LOG_CONS = new Syslog(4L);
        LOG_CONSOLE = new Syslog(5L);
        LOG_CRIT = new Syslog(6L);
        LOG_CRON = new Syslog(7L);
        LOG_DAEMON = new Syslog(8L);
        LOG_DEBUG = new Syslog(9L);
        LOG_EMERG = new Syslog(10L);
        LOG_ERR = new Syslog(11L);
        LOG_FTP = new Syslog(12L);
        LOG_INFO = new Syslog(13L);
        LOG_KERN = new Syslog(14L);
        LOG_LOCAL0 = new Syslog(15L);
        LOG_LOCAL1 = new Syslog(16L);
        LOG_LOCAL2 = new Syslog(17L);
        LOG_LOCAL3 = new Syslog(18L);
        LOG_LOCAL4 = new Syslog(19L);
        LOG_LOCAL5 = new Syslog(20L);
        LOG_LOCAL6 = new Syslog(21L);
        LOG_LOCAL7 = new Syslog(22L);
        LOG_LPR = new Syslog(23L);
        LOG_MAIL = new Syslog(24L);
        LOG_NDELAY = new Syslog(25L);
        LOG_NEWS = new Syslog(26L);
        LOG_NOTICE = new Syslog(27L);
        LOG_NOWAIT = new Syslog(28L);
        LOG_NTP = new Syslog(29L);
        LOG_ODELAY = new Syslog(30L);
        LOG_PERROR = new Syslog(31L);
        LOG_PID = new Syslog(32L);
        LOG_SECURITY = new Syslog(33L);
        LOG_SYSLOG = new Syslog(34L);
        LOG_USER = new Syslog(35L);
        LOG_UUCP = new Syslog(36L);
        LOG_WARNING = new Syslog(37L);
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

    public final int value() {
        return (int)this.value;
    }

    public static Syslog valueOf(String name) {
        return Enum.valueOf(Syslog.class, name);
    }

    @Override
    public final boolean defined() {
        return true;
    }
}

