/*
 * Decompiled with CFR 0.152.
 */
package jnr.constants.platform;

import jnr.constants.Constant;
import jnr.constants.platform.ConstantResolver;

public final class TCP
extends Enum<TCP>
implements Constant {
    public static final /* enum */ TCP TCP_INFO;
    public static final /* enum */ TCP TCP_MAX_SACK;
    public static final /* enum */ TCP TCP_KEEPALIVE;
    public static final /* enum */ TCP TCP_NOOPT;
    public static final /* enum */ TCP TCP_THIN_LINEAR_TIMEOUTS;
    public static final /* enum */ TCP TCP_REPAIR_QUEUE;
    public static final /* enum */ TCP TCP_MAXBURST;
    public static final /* enum */ TCP TCP_COOKIE_TRANSACTIONS;
    public static final /* enum */ TCP __UNKNOWN_CONSTANT__;
    public static final /* enum */ TCP TCP_CONGESTION;
    public static final /* enum */ TCP TCP_RETRANSHZ;
    public static final /* enum */ TCP TCP_QUICKACK;
    public static final /* enum */ TCP TCP_DEFER_ACCEPT;
    public static final /* enum */ TCP TCP_SYNCNT;
    public static final /* enum */ TCP TCP_MINMSSOVERLOAD;
    public static final /* enum */ TCP TCP_MINMSS;
    public static final /* enum */ TCP TCP_FASTOPEN;
    public static final /* enum */ TCP TCP_MAXHLEN;
    private static final /* synthetic */ TCP[] $VALUES;
    public static final /* enum */ TCP TCP_KEEPIDLE;
    public static final /* enum */ TCP TCP_KEEPCNT;
    public static final /* enum */ TCP TCP_THIN_DUPACK;
    private static final ConstantResolver<TCP> resolver;
    public static final /* enum */ TCP TCP_MD5SIG;
    public static final /* enum */ TCP TCP_WINDOW_CLAMP;
    public static final /* enum */ TCP TCP_KEEPINTVL;
    public static final /* enum */ TCP TCP_MAXWIN;
    public static final /* enum */ TCP TCP_USER_TIMEOUT;
    public static final /* enum */ TCP TCP_TIMESTAMP;
    public static final /* enum */ TCP TCP_MAXSEG;
    public static final /* enum */ TCP TCP_CORK;
    public static final /* enum */ TCP TCP_REPAIR_OPTIONS;
    public static final /* enum */ TCP TCP_MAXOLEN;
    public static final /* enum */ TCP TCP_NODELAY;
    public static final /* enum */ TCP TCP_NOPUSH;
    public static final /* enum */ TCP TCP_MAX_WINSHIFT;
    public static final /* enum */ TCP TCP_REPAIR;
    public static final /* enum */ TCP TCP_MSS;
    public static final /* enum */ TCP TCP_QUEUE_SEQ;
    public static final /* enum */ TCP TCP_NSTATES;
    public static final /* enum */ TCP TCP_LINGER2;

    @Override
    public final long longValue() {
        return resolver.longValue(this);
    }

    public final int value() {
        return (int)resolver.longValue(this);
    }

    public static TCP valueOf(String name) {
        return Enum.valueOf(TCP.class, name);
    }

    @Override
    public final boolean defined() {
        return resolver.defined(this);
    }

    public static TCP valueOf(long value) {
        return resolver.valueOf(value);
    }

    static {
        TCP_MAX_SACK = new TCP();
        TCP_MSS = new TCP();
        TCP_MINMSS = new TCP();
        TCP_MINMSSOVERLOAD = new TCP();
        TCP_MAXWIN = new TCP();
        TCP_MAX_WINSHIFT = new TCP();
        TCP_MAXBURST = new TCP();
        TCP_MAXHLEN = new TCP();
        TCP_MAXOLEN = new TCP();
        TCP_NODELAY = new TCP();
        TCP_MAXSEG = new TCP();
        TCP_NOPUSH = new TCP();
        TCP_NOOPT = new TCP();
        TCP_KEEPALIVE = new TCP();
        TCP_NSTATES = new TCP();
        TCP_RETRANSHZ = new TCP();
        TCP_CORK = new TCP();
        TCP_DEFER_ACCEPT = new TCP();
        TCP_INFO = new TCP();
        TCP_KEEPCNT = new TCP();
        TCP_KEEPIDLE = new TCP();
        TCP_KEEPINTVL = new TCP();
        TCP_LINGER2 = new TCP();
        TCP_MD5SIG = new TCP();
        TCP_QUICKACK = new TCP();
        TCP_SYNCNT = new TCP();
        TCP_WINDOW_CLAMP = new TCP();
        TCP_FASTOPEN = new TCP();
        TCP_CONGESTION = new TCP();
        TCP_COOKIE_TRANSACTIONS = new TCP();
        TCP_QUEUE_SEQ = new TCP();
        TCP_REPAIR = new TCP();
        TCP_REPAIR_OPTIONS = new TCP();
        TCP_REPAIR_QUEUE = new TCP();
        TCP_THIN_DUPACK = new TCP();
        TCP_THIN_LINEAR_TIMEOUTS = new TCP();
        TCP_TIMESTAMP = new TCP();
        TCP_USER_TIMEOUT = new TCP();
        __UNKNOWN_CONSTANT__ = new TCP();
        TCP[] tCPArray = new TCP[39];
        tCPArray[0] = TCP_MAX_SACK;
        tCPArray[1] = TCP_MSS;
        tCPArray[2] = TCP_MINMSS;
        tCPArray[3] = TCP_MINMSSOVERLOAD;
        tCPArray[4] = TCP_MAXWIN;
        tCPArray[5] = TCP_MAX_WINSHIFT;
        tCPArray[6] = TCP_MAXBURST;
        tCPArray[7] = TCP_MAXHLEN;
        tCPArray[8] = TCP_MAXOLEN;
        tCPArray[9] = TCP_NODELAY;
        tCPArray[10] = TCP_MAXSEG;
        tCPArray[11] = TCP_NOPUSH;
        tCPArray[12] = TCP_NOOPT;
        tCPArray[13] = TCP_KEEPALIVE;
        tCPArray[14] = TCP_NSTATES;
        tCPArray[15] = TCP_RETRANSHZ;
        tCPArray[16] = TCP_CORK;
        tCPArray[17] = TCP_DEFER_ACCEPT;
        tCPArray[18] = TCP_INFO;
        tCPArray[19] = TCP_KEEPCNT;
        tCPArray[20] = TCP_KEEPIDLE;
        tCPArray[21] = TCP_KEEPINTVL;
        tCPArray[22] = TCP_LINGER2;
        tCPArray[23] = TCP_MD5SIG;
        tCPArray[24] = TCP_QUICKACK;
        tCPArray[25] = TCP_SYNCNT;
        tCPArray[26] = TCP_WINDOW_CLAMP;
        tCPArray[27] = TCP_FASTOPEN;
        tCPArray[28] = TCP_CONGESTION;
        tCPArray[29] = TCP_COOKIE_TRANSACTIONS;
        tCPArray[30] = TCP_QUEUE_SEQ;
        tCPArray[31] = TCP_REPAIR;
        tCPArray[32] = TCP_REPAIR_OPTIONS;
        tCPArray[33] = TCP_REPAIR_QUEUE;
        tCPArray[34] = TCP_THIN_DUPACK;
        tCPArray[35] = TCP_THIN_LINEAR_TIMEOUTS;
        tCPArray[36] = TCP_TIMESTAMP;
        tCPArray[37] = TCP_USER_TIMEOUT;
        tCPArray[38] = __UNKNOWN_CONSTANT__;
        $VALUES = tCPArray;
        resolver = ConstantResolver.getResolver(TCP.class, 20000, 29999);
    }

    public final String description() {
        return resolver.description(this);
    }

    @Override
    public final int intValue() {
        return (int)resolver.longValue(this);
    }

    public final String toString() {
        return this.description();
    }

    public static TCP[] values() {
        return (TCP[])$VALUES.clone();
    }
}

