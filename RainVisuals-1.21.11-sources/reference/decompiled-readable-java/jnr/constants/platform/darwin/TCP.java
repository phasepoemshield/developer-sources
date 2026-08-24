/*
 * Decompiled with CFR 0.152.
 */
package jnr.constants.platform.darwin;

import java.util.EnumMap;
import java.util.Map;
import jnr.constants.Constant;

public final class TCP
extends Enum<TCP>
implements Constant {
    public static final /* enum */ TCP TCP_MAXSEG;
    private static final /* synthetic */ TCP[] $VALUES;
    public static final long MAX_VALUE = 65535L;
    public static final long MIN_VALUE = 1L;
    public static final /* enum */ TCP TCP_MAX_SACK;
    public static final /* enum */ TCP TCP_MSS;
    public static final /* enum */ TCP TCP_MAX_WINSHIFT;
    public static final /* enum */ TCP TCP_NOPUSH;
    public static final /* enum */ TCP TCP_NODELAY;
    public static final /* enum */ TCP TCP_KEEPALIVE;
    private final long value;
    public static final /* enum */ TCP TCP_MAXHLEN;
    public static final /* enum */ TCP TCP_MINMSS;
    public static final /* enum */ TCP TCP_MAXWIN;
    public static final /* enum */ TCP TCP_MAXOLEN;
    public static final /* enum */ TCP TCP_NOOPT;

    public static TCP[] values() {
        return (TCP[])$VALUES.clone();
    }

    @Override
    public final int intValue() {
        return (int)this.value;
    }

    public final int value() {
        return (int)this.value;
    }

    static {
        TCP_MAX_SACK = new TCP(4L);
        TCP_MSS = new TCP(512L);
        TCP_MINMSS = new TCP(216L);
        TCP_MAXWIN = new TCP(65535L);
        TCP_MAX_WINSHIFT = new TCP(14L);
        TCP_MAXHLEN = new TCP(60L);
        TCP_MAXOLEN = new TCP(40L);
        TCP_NODELAY = new TCP(1L);
        TCP_MAXSEG = new TCP(2L);
        TCP_NOPUSH = new TCP(4L);
        TCP_NOOPT = new TCP(8L);
        TCP_KEEPALIVE = new TCP(16L);
        TCP[] tCPArray = new TCP[12];
        tCPArray[0] = TCP_MAX_SACK;
        tCPArray[1] = TCP_MSS;
        tCPArray[2] = TCP_MINMSS;
        tCPArray[3] = TCP_MAXWIN;
        tCPArray[4] = TCP_MAX_WINSHIFT;
        tCPArray[5] = TCP_MAXHLEN;
        tCPArray[6] = TCP_MAXOLEN;
        tCPArray[7] = TCP_NODELAY;
        tCPArray[8] = TCP_MAXSEG;
        tCPArray[9] = TCP_NOPUSH;
        tCPArray[10] = TCP_NOOPT;
        tCPArray[11] = TCP_KEEPALIVE;
        $VALUES = tCPArray;
    }

    @Override
    public final boolean defined() {
        return true;
    }

    private TCP(long value) {
        this.value = value;
    }

    @Override
    public final long longValue() {
        return this.value;
    }

    public static TCP valueOf(String name) {
        return Enum.valueOf(TCP.class, name);
    }

    public final String toString() {
        return StringTable.descriptions.get(this);
    }

    static final class StringTable {
        public static final Map<TCP, String> descriptions = StringTable.generateTable();

        public static final Map<TCP, String> generateTable() {
            EnumMap<TCP, String> map = new EnumMap<TCP, String>(TCP.class);
            map.put(TCP_MAX_SACK, "TCP_MAX_SACK");
            map.put(TCP_MSS, "TCP_MSS");
            map.put(TCP_MINMSS, "TCP_MINMSS");
            map.put(TCP_MAXWIN, "TCP_MAXWIN");
            map.put(TCP_MAX_WINSHIFT, "TCP_MAX_WINSHIFT");
            map.put(TCP_MAXHLEN, "TCP_MAXHLEN");
            map.put(TCP_MAXOLEN, "TCP_MAXOLEN");
            map.put(TCP_NODELAY, "TCP_NODELAY");
            map.put(TCP_MAXSEG, "TCP_MAXSEG");
            map.put(TCP_NOPUSH, "TCP_NOPUSH");
            map.put(TCP_NOOPT, "TCP_NOOPT");
            map.put(TCP_KEEPALIVE, "TCP_KEEPALIVE");
            return map;
        }

        StringTable() {
        }
    }
}

