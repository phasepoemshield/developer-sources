/*
 * Decompiled with CFR 0.152.
 */
package jnr.constants.platform.fake;

import jnr.constants.Constant;

public final class TCP
extends Enum<TCP>
implements Constant {
    public static final /* enum */ TCP TCP_REPAIR_QUEUE;
    public static final /* enum */ TCP TCP_SYNCNT;
    public static final /* enum */ TCP TCP_NOPUSH;
    public static final /* enum */ TCP TCP_MAX_WINSHIFT;
    public static final /* enum */ TCP TCP_USER_TIMEOUT;
    public static final /* enum */ TCP TCP_MAXWIN;
    public static final /* enum */ TCP TCP_THIN_LINEAR_TIMEOUTS;
    public static final /* enum */ TCP TCP_COOKIE_TRANSACTIONS;
    public static final /* enum */ TCP TCP_KEEPCNT;
    public static final /* enum */ TCP TCP_KEEPALIVE;
    public static final /* enum */ TCP TCP_FASTOPEN;
    public static final /* enum */ TCP TCP_REPAIR_OPTIONS;
    public static final /* enum */ TCP TCP_MINMSS;
    private static final /* synthetic */ TCP[] $VALUES;
    public static final /* enum */ TCP TCP_MAX_SACK;
    public static final /* enum */ TCP TCP_MAXHLEN;
    public static final /* enum */ TCP TCP_QUICKACK;
    public static final /* enum */ TCP TCP_MD5SIG;
    public static final /* enum */ TCP TCP_INFO;
    private final long value;
    public static final /* enum */ TCP TCP_LINGER2;
    public static final /* enum */ TCP TCP_WINDOW_CLAMP;
    public static final /* enum */ TCP TCP_KEEPIDLE;
    public static final /* enum */ TCP TCP_THIN_DUPACK;
    public static final long MIN_VALUE = 1L;
    public static final /* enum */ TCP TCP_NODELAY;
    public static final /* enum */ TCP TCP_RETRANSHZ;
    public static final long MAX_VALUE = 38L;
    public static final /* enum */ TCP TCP_DEFER_ACCEPT;
    public static final /* enum */ TCP TCP_MAXBURST;
    public static final /* enum */ TCP TCP_KEEPINTVL;
    public static final /* enum */ TCP TCP_CORK;
    public static final /* enum */ TCP TCP_CONGESTION;
    public static final /* enum */ TCP TCP_MAXOLEN;
    public static final /* enum */ TCP TCP_QUEUE_SEQ;
    public static final /* enum */ TCP TCP_NOOPT;
    public static final /* enum */ TCP TCP_MSS;
    public static final /* enum */ TCP TCP_MINMSSOVERLOAD;
    public static final /* enum */ TCP TCP_MAXSEG;
    public static final /* enum */ TCP TCP_TIMESTAMP;
    public static final /* enum */ TCP TCP_REPAIR;
    public static final /* enum */ TCP TCP_NSTATES;

    public static TCP valueOf(String name) {
        return Enum.valueOf(TCP.class, name);
    }

    private TCP(long value) {
        this.value = value;
    }

    public static TCP[] values() {
        return (TCP[])$VALUES.clone();
    }

    static {
        TCP_MAX_SACK = new TCP(1L);
        TCP_MSS = new TCP(2L);
        TCP_MINMSS = new TCP(3L);
        TCP_MINMSSOVERLOAD = new TCP(4L);
        TCP_MAXWIN = new TCP(5L);
        TCP_MAX_WINSHIFT = new TCP(6L);
        TCP_MAXBURST = new TCP(7L);
        TCP_MAXHLEN = new TCP(8L);
        TCP_MAXOLEN = new TCP(9L);
        TCP_NODELAY = new TCP(10L);
        TCP_MAXSEG = new TCP(11L);
        TCP_NOPUSH = new TCP(12L);
        TCP_NOOPT = new TCP(13L);
        TCP_KEEPALIVE = new TCP(14L);
        TCP_NSTATES = new TCP(15L);
        TCP_RETRANSHZ = new TCP(16L);
        TCP_CORK = new TCP(17L);
        TCP_DEFER_ACCEPT = new TCP(18L);
        TCP_INFO = new TCP(19L);
        TCP_KEEPCNT = new TCP(20L);
        TCP_KEEPIDLE = new TCP(21L);
        TCP_KEEPINTVL = new TCP(22L);
        TCP_LINGER2 = new TCP(23L);
        TCP_MD5SIG = new TCP(24L);
        TCP_QUICKACK = new TCP(25L);
        TCP_SYNCNT = new TCP(26L);
        TCP_WINDOW_CLAMP = new TCP(27L);
        TCP_FASTOPEN = new TCP(28L);
        TCP_CONGESTION = new TCP(29L);
        TCP_COOKIE_TRANSACTIONS = new TCP(30L);
        TCP_QUEUE_SEQ = new TCP(31L);
        TCP_REPAIR = new TCP(32L);
        TCP_REPAIR_OPTIONS = new TCP(33L);
        TCP_REPAIR_QUEUE = new TCP(34L);
        TCP_THIN_DUPACK = new TCP(35L);
        TCP_THIN_LINEAR_TIMEOUTS = new TCP(36L);
        TCP_TIMESTAMP = new TCP(37L);
        TCP_USER_TIMEOUT = new TCP(38L);
        TCP[] tCPArray = new TCP[38];
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
        $VALUES = tCPArray;
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

