/*
 * Decompiled with CFR 0.152.
 */
package jnr.constants.platform.solaris;

import java.util.EnumMap;
import java.util.Map;
import jnr.constants.Constant;

public final class TCP
extends Enum<TCP>
implements Constant {
    public static final /* enum */ TCP TCP_LINGER2;
    public static final /* enum */ TCP TCP_CORK;
    public static final /* enum */ TCP TCP_KEEPALIVE;
    public static final long MIN_VALUE = 1L;
    public static final long MAX_VALUE = 536L;
    public static final /* enum */ TCP TCP_CONGESTION;
    public static final /* enum */ TCP TCP_INFO;
    private final long value;
    public static final /* enum */ TCP TCP_MSS;
    public static final /* enum */ TCP TCP_KEEPCNT;
    private static final /* synthetic */ TCP[] $VALUES;
    public static final /* enum */ TCP TCP_MD5SIG;
    public static final /* enum */ TCP TCP_KEEPINTVL;
    public static final /* enum */ TCP TCP_MAXSEG;
    public static final /* enum */ TCP TCP_KEEPIDLE;
    public static final /* enum */ TCP TCP_NODELAY;

    public final String toString() {
        return StringTable.descriptions.get(this);
    }

    public static TCP[] values() {
        return (TCP[])$VALUES.clone();
    }

    static {
        TCP_MSS = new TCP(536L);
        TCP_NODELAY = new TCP(1L);
        TCP_MAXSEG = new TCP(2L);
        TCP_KEEPALIVE = new TCP(8L);
        TCP_CORK = new TCP(24L);
        TCP_INFO = new TCP(34L);
        TCP_KEEPCNT = new TCP(31L);
        TCP_KEEPIDLE = new TCP(29L);
        TCP_KEEPINTVL = new TCP(30L);
        TCP_LINGER2 = new TCP(28L);
        TCP_MD5SIG = new TCP(36L);
        TCP_CONGESTION = new TCP(35L);
        TCP[] tCPArray = new TCP[12];
        tCPArray[0] = TCP_MSS;
        tCPArray[1] = TCP_NODELAY;
        tCPArray[2] = TCP_MAXSEG;
        tCPArray[3] = TCP_KEEPALIVE;
        tCPArray[4] = TCP_CORK;
        tCPArray[5] = TCP_INFO;
        tCPArray[6] = TCP_KEEPCNT;
        tCPArray[7] = TCP_KEEPIDLE;
        tCPArray[8] = TCP_KEEPINTVL;
        tCPArray[9] = TCP_LINGER2;
        tCPArray[10] = TCP_MD5SIG;
        tCPArray[11] = TCP_CONGESTION;
        $VALUES = tCPArray;
    }

    public static TCP valueOf(String name) {
        return Enum.valueOf(TCP.class, name);
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

    private TCP(long value) {
        this.value = value;
    }

    @Override
    public final int intValue() {
        return (int)this.value;
    }

    static final class StringTable {
        public static final Map<TCP, String> descriptions = StringTable.generateTable();

        StringTable() {
        }

        public static final Map<TCP, String> generateTable() {
            EnumMap<TCP, String> map = new EnumMap<TCP, String>(TCP.class);
            map.put(TCP_MSS, "TCP_MSS");
            map.put(TCP_NODELAY, "TCP_NODELAY");
            map.put(TCP_MAXSEG, "TCP_MAXSEG");
            map.put(TCP_KEEPALIVE, "TCP_KEEPALIVE");
            map.put(TCP_CORK, "TCP_CORK");
            map.put(TCP_INFO, "TCP_INFO");
            map.put(TCP_KEEPCNT, "TCP_KEEPCNT");
            map.put(TCP_KEEPIDLE, "TCP_KEEPIDLE");
            map.put(TCP_KEEPINTVL, "TCP_KEEPINTVL");
            map.put(TCP_LINGER2, "TCP_LINGER2");
            map.put(TCP_MD5SIG, "TCP_MD5SIG");
            map.put(TCP_CONGESTION, "TCP_CONGESTION");
            return map;
        }
    }
}

