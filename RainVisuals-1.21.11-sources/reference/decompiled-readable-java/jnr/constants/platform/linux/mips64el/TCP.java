/*
 * Decompiled with CFR 0.152.
 */
package jnr.constants.platform.linux.mips64el;

import java.util.EnumMap;
import java.util.Map;
import jnr.constants.Constant;

public final class TCP
extends Enum<TCP>
implements Constant {
    public static final /* enum */ TCP TCP_THIN_DUPACK;
    public static final /* enum */ TCP TCP_LINGER2;
    public static final /* enum */ TCP TCP_NODELAY;
    public static final /* enum */ TCP TCP_CONGESTION;
    public static final /* enum */ TCP TCP_FASTOPEN;
    public static final /* enum */ TCP TCP_REPAIR_OPTIONS;
    public static final /* enum */ TCP TCP_MD5SIG;
    public static final long MAX_VALUE = 65535L;
    public static final /* enum */ TCP TCP_USER_TIMEOUT;
    public static final long MIN_VALUE = 1L;
    private final long value;
    public static final /* enum */ TCP TCP_MAXWIN;
    public static final /* enum */ TCP TCP_KEEPCNT;
    public static final /* enum */ TCP TCP_QUEUE_SEQ;
    public static final /* enum */ TCP TCP_REPAIR;
    public static final /* enum */ TCP TCP_TIMESTAMP;
    public static final /* enum */ TCP TCP_CORK;
    public static final /* enum */ TCP TCP_MSS;
    public static final /* enum */ TCP TCP_KEEPINTVL;
    public static final /* enum */ TCP TCP_QUICKACK;
    public static final /* enum */ TCP TCP_SYNCNT;
    public static final /* enum */ TCP TCP_REPAIR_QUEUE;
    public static final /* enum */ TCP TCP_DEFER_ACCEPT;
    public static final /* enum */ TCP TCP_THIN_LINEAR_TIMEOUTS;
    public static final /* enum */ TCP TCP_MAXSEG;
    public static final /* enum */ TCP TCP_COOKIE_TRANSACTIONS;
    public static final /* enum */ TCP TCP_MAX_WINSHIFT;
    public static final /* enum */ TCP TCP_KEEPIDLE;
    private static final /* synthetic */ TCP[] $VALUES;
    public static final /* enum */ TCP TCP_WINDOW_CLAMP;
    public static final /* enum */ TCP TCP_INFO;

    public final int value() {
        return (int)this.value;
    }

    @Override
    public final long longValue() {
        return this.value;
    }

    public static TCP valueOf(String name) {
        return Enum.valueOf(TCP.class, name);
    }

    @Override
    public final int intValue() {
        return (int)this.value;
    }

    public final String toString() {
        return StringTable.descriptions.get(this);
    }

    public static TCP[] values() {
        return (TCP[])$VALUES.clone();
    }

    @Override
    public final boolean defined() {
        return true;
    }

    private TCP(long value) {
        this.value = value;
    }

    static {
        TCP_MSS = new TCP(512L);
        TCP_MAXWIN = new TCP(65535L);
        TCP_MAX_WINSHIFT = new TCP(14L);
        TCP_NODELAY = new TCP(1L);
        TCP_MAXSEG = new TCP(2L);
        TCP_CORK = new TCP(3L);
        TCP_DEFER_ACCEPT = new TCP(9L);
        TCP_INFO = new TCP(11L);
        TCP_KEEPCNT = new TCP(6L);
        TCP_KEEPIDLE = new TCP(4L);
        TCP_KEEPINTVL = new TCP(5L);
        TCP_LINGER2 = new TCP(8L);
        TCP_MD5SIG = new TCP(14L);
        TCP_QUICKACK = new TCP(12L);
        TCP_SYNCNT = new TCP(7L);
        TCP_WINDOW_CLAMP = new TCP(10L);
        TCP_FASTOPEN = new TCP(23L);
        TCP_CONGESTION = new TCP(13L);
        TCP_COOKIE_TRANSACTIONS = new TCP(15L);
        TCP_QUEUE_SEQ = new TCP(21L);
        TCP_REPAIR = new TCP(19L);
        TCP_REPAIR_OPTIONS = new TCP(22L);
        TCP_REPAIR_QUEUE = new TCP(20L);
        TCP_THIN_DUPACK = new TCP(17L);
        TCP_THIN_LINEAR_TIMEOUTS = new TCP(16L);
        TCP_TIMESTAMP = new TCP(24L);
        TCP_USER_TIMEOUT = new TCP(18L);
        TCP[] tCPArray = new TCP[27];
        tCPArray[0] = TCP_MSS;
        tCPArray[1] = TCP_MAXWIN;
        tCPArray[2] = TCP_MAX_WINSHIFT;
        tCPArray[3] = TCP_NODELAY;
        tCPArray[4] = TCP_MAXSEG;
        tCPArray[5] = TCP_CORK;
        tCPArray[6] = TCP_DEFER_ACCEPT;
        tCPArray[7] = TCP_INFO;
        tCPArray[8] = TCP_KEEPCNT;
        tCPArray[9] = TCP_KEEPIDLE;
        tCPArray[10] = TCP_KEEPINTVL;
        tCPArray[11] = TCP_LINGER2;
        tCPArray[12] = TCP_MD5SIG;
        tCPArray[13] = TCP_QUICKACK;
        tCPArray[14] = TCP_SYNCNT;
        tCPArray[15] = TCP_WINDOW_CLAMP;
        tCPArray[16] = TCP_FASTOPEN;
        tCPArray[17] = TCP_CONGESTION;
        tCPArray[18] = TCP_COOKIE_TRANSACTIONS;
        tCPArray[19] = TCP_QUEUE_SEQ;
        tCPArray[20] = TCP_REPAIR;
        tCPArray[21] = TCP_REPAIR_OPTIONS;
        tCPArray[22] = TCP_REPAIR_QUEUE;
        tCPArray[23] = TCP_THIN_DUPACK;
        tCPArray[24] = TCP_THIN_LINEAR_TIMEOUTS;
        tCPArray[25] = TCP_TIMESTAMP;
        tCPArray[26] = TCP_USER_TIMEOUT;
        $VALUES = tCPArray;
    }

    static final class StringTable {
        public static final Map<TCP, String> descriptions = StringTable.generateTable();

        public static final Map<TCP, String> generateTable() {
            EnumMap<TCP, String> map = new EnumMap<TCP, String>(TCP.class);
            map.put(TCP_MSS, "TCP_MSS");
            map.put(TCP_MAXWIN, "TCP_MAXWIN");
            map.put(TCP_MAX_WINSHIFT, "TCP_MAX_WINSHIFT");
            map.put(TCP_NODELAY, "TCP_NODELAY");
            map.put(TCP_MAXSEG, "TCP_MAXSEG");
            map.put(TCP_CORK, "TCP_CORK");
            map.put(TCP_DEFER_ACCEPT, "TCP_DEFER_ACCEPT");
            map.put(TCP_INFO, "TCP_INFO");
            map.put(TCP_KEEPCNT, "TCP_KEEPCNT");
            map.put(TCP_KEEPIDLE, "TCP_KEEPIDLE");
            map.put(TCP_KEEPINTVL, "TCP_KEEPINTVL");
            map.put(TCP_LINGER2, "TCP_LINGER2");
            map.put(TCP_MD5SIG, "TCP_MD5SIG");
            map.put(TCP_QUICKACK, "TCP_QUICKACK");
            map.put(TCP_SYNCNT, "TCP_SYNCNT");
            map.put(TCP_WINDOW_CLAMP, "TCP_WINDOW_CLAMP");
            map.put(TCP_FASTOPEN, "TCP_FASTOPEN");
            map.put(TCP_CONGESTION, "TCP_CONGESTION");
            map.put(TCP_COOKIE_TRANSACTIONS, "TCP_COOKIE_TRANSACTIONS");
            map.put(TCP_QUEUE_SEQ, "TCP_QUEUE_SEQ");
            map.put(TCP_REPAIR, "TCP_REPAIR");
            map.put(TCP_REPAIR_OPTIONS, "TCP_REPAIR_OPTIONS");
            map.put(TCP_REPAIR_QUEUE, "TCP_REPAIR_QUEUE");
            map.put(TCP_THIN_DUPACK, "TCP_THIN_DUPACK");
            map.put(TCP_THIN_LINEAR_TIMEOUTS, "TCP_THIN_LINEAR_TIMEOUTS");
            map.put(TCP_TIMESTAMP, "TCP_TIMESTAMP");
            map.put(TCP_USER_TIMEOUT, "TCP_USER_TIMEOUT");
            return map;
        }

        StringTable() {
        }
    }
}

