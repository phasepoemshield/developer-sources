/*
 * Decompiled with CFR 0.152.
 */
package jnr.constants.platform;

import jnr.constants.Constant;
import jnr.constants.platform.ConstantResolver;

public final class Syslog
extends Enum<Syslog>
implements Constant {
    public static final /* enum */ Syslog LOG_PERROR;
    public static final /* enum */ Syslog LOG_CONS;
    public static final /* enum */ Syslog LOG_CRON;
    public static final /* enum */ Syslog __UNKNOWN_CONSTANT__;
    public static final /* enum */ Syslog LOG_LOCAL0;
    public static final /* enum */ Syslog LOG_LOCAL4;
    public static final /* enum */ Syslog LOG_LOCAL5;
    public static final /* enum */ Syslog LOG_NEWS;
    public static final /* enum */ Syslog LOG_DEBUG;
    public static final /* enum */ Syslog LOG_WARNING;
    public static final /* enum */ Syslog LOG_LOCAL3;
    public static final /* enum */ Syslog LOG_NTP;
    public static final /* enum */ Syslog LOG_USER;
    public static final /* enum */ Syslog LOG_CRIT;
    public static final /* enum */ Syslog LOG_UUCP;
    public static final /* enum */ Syslog LOG_LOCAL2;
    public static final /* enum */ Syslog LOG_MAIL;
    public static final /* enum */ Syslog LOG_SECURITY;
    public static final /* enum */ Syslog LOG_INFO;
    public static final /* enum */ Syslog LOG_SYSLOG;
    public static final /* enum */ Syslog LOG_NDELAY;
    public static final /* enum */ Syslog LOG_AUTH;
    public static final /* enum */ Syslog LOG_DAEMON;
    public static final /* enum */ Syslog LOG_ODELAY;
    public static final /* enum */ Syslog LOG_NOWAIT;
    public static final /* enum */ Syslog LOG_PID;
    private static final ConstantResolver<Syslog> resolver;
    public static final /* enum */ Syslog LOG_NOTICE;
    public static final /* enum */ Syslog LOG_LPR;
    public static final /* enum */ Syslog LOG_EMERG;
    public static final /* enum */ Syslog LOG_CONSOLE;
    public static final /* enum */ Syslog LOG_LOCAL7;
    public static final /* enum */ Syslog LOG_AUTHPRIV;
    private static final /* synthetic */ Syslog[] $VALUES;
    public static final /* enum */ Syslog LOG_LOCAL1;
    public static final /* enum */ Syslog LOG_ALERT;
    public static final /* enum */ Syslog LOG_ERR;
    public static final /* enum */ Syslog LOG_FTP;
    public static final /* enum */ Syslog LOG_KERN;
    public static final /* enum */ Syslog LOG_LOCAL6;

    public final String toString() {
        return this.description();
    }

    public static Syslog valueOf(String name) {
        return Enum.valueOf(Syslog.class, name);
    }

    public static Syslog valueOf(long value) {
        return resolver.valueOf(value);
    }

    @Override
    public final long longValue() {
        return resolver.longValue(this);
    }

    public static Syslog[] values() {
        return (Syslog[])$VALUES.clone();
    }

    @Override
    public final boolean defined() {
        return resolver.defined(this);
    }

    public final int value() {
        return (int)resolver.longValue(this);
    }

    static {
        LOG_ALERT = new Syslog();
        LOG_AUTH = new Syslog();
        LOG_AUTHPRIV = new Syslog();
        LOG_CONS = new Syslog();
        LOG_CONSOLE = new Syslog();
        LOG_CRIT = new Syslog();
        LOG_CRON = new Syslog();
        LOG_DAEMON = new Syslog();
        LOG_DEBUG = new Syslog();
        LOG_EMERG = new Syslog();
        LOG_ERR = new Syslog();
        LOG_FTP = new Syslog();
        LOG_INFO = new Syslog();
        LOG_KERN = new Syslog();
        LOG_LOCAL0 = new Syslog();
        LOG_LOCAL1 = new Syslog();
        LOG_LOCAL2 = new Syslog();
        LOG_LOCAL3 = new Syslog();
        LOG_LOCAL4 = new Syslog();
        LOG_LOCAL5 = new Syslog();
        LOG_LOCAL6 = new Syslog();
        LOG_LOCAL7 = new Syslog();
        LOG_LPR = new Syslog();
        LOG_MAIL = new Syslog();
        LOG_NDELAY = new Syslog();
        LOG_NEWS = new Syslog();
        LOG_NOTICE = new Syslog();
        LOG_NOWAIT = new Syslog();
        LOG_NTP = new Syslog();
        LOG_ODELAY = new Syslog();
        LOG_PERROR = new Syslog();
        LOG_PID = new Syslog();
        LOG_SECURITY = new Syslog();
        LOG_SYSLOG = new Syslog();
        LOG_USER = new Syslog();
        LOG_UUCP = new Syslog();
        LOG_WARNING = new Syslog();
        __UNKNOWN_CONSTANT__ = new Syslog();
        Syslog[] syslogArray = new Syslog[38];
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
        syslogArray[37] = __UNKNOWN_CONSTANT__;
        $VALUES = syslogArray;
        resolver = ConstantResolver.getResolver(Syslog.class, 20000, 29999);
    }

    @Override
    public final int intValue() {
        return (int)resolver.longValue(this);
    }

    public final String description() {
        return resolver.description(this);
    }
}

