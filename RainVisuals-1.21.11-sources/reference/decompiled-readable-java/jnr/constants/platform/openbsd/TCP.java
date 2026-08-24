/*
 * Decompiled with CFR 0.152.
 */
package jnr.constants.platform.openbsd;

import java.util.EnumMap;
import java.util.Map;
import jnr.constants.Constant;

public final class TCP
extends Enum<TCP>
implements Constant {
    public static final /* enum */ TCP TCP_MSS;
    public static final /* enum */ TCP TCP_NOPUSH;
    public static final /* enum */ TCP TCP_NODELAY;
    public static final /* enum */ TCP TCP_MAXWIN;
    private static final /* synthetic */ TCP[] $VALUES;
    public static final /* enum */ TCP TCP_MAXBURST;
    public static final long MAX_VALUE = 65535L;
    public static final /* enum */ TCP TCP_MAXSEG;
    private final long value;
    public static final /* enum */ TCP TCP_MAX_SACK;
    public static final /* enum */ TCP TCP_MAX_WINSHIFT;
    public static final /* enum */ TCP TCP_MD5SIG;
    public static final long MIN_VALUE = 1L;

    @Override
    public final long longValue() {
        return this.value;
    }

    private TCP(long value) {
        this.value = value;
    }

    public final int value() {
        return (int)this.value;
    }

    public static TCP valueOf(String name) {
        return Enum.valueOf(TCP.class, name);
    }

    @Override
    public final boolean defined() {
        return true;
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

    static {
        TCP_MAX_SACK = new TCP(3L);
        TCP_MSS = new TCP(512L);
        TCP_MAXWIN = new TCP(65535L);
        TCP_MAX_WINSHIFT = new TCP(14L);
        TCP_MAXBURST = new TCP(4L);
        TCP_NODELAY = new TCP(1L);
        TCP_MAXSEG = new TCP(2L);
        TCP_NOPUSH = new TCP(16L);
        TCP_MD5SIG = new TCP(4L);
        TCP[] tCPArray = new TCP[9];
        tCPArray[0] = TCP_MAX_SACK;
        tCPArray[1] = TCP_MSS;
        tCPArray[2] = TCP_MAXWIN;
        tCPArray[3] = TCP_MAX_WINSHIFT;
        tCPArray[4] = TCP_MAXBURST;
        tCPArray[5] = TCP_NODELAY;
        tCPArray[6] = TCP_MAXSEG;
        tCPArray[7] = TCP_NOPUSH;
        tCPArray[8] = TCP_MD5SIG;
        $VALUES = tCPArray;
    }

    static final class StringTable {
        public static final Map<TCP, String> descriptions = StringTable.generateTable();

        public static final Map<TCP, String> generateTable() {
            EnumMap<TCP, String> map = new EnumMap<TCP, String>(TCP.class);
            map.put(TCP_MAX_SACK, "TCP_MAX_SACK");
            map.put(TCP_MSS, "TCP_MSS");
            map.put(TCP_MAXWIN, "TCP_MAXWIN");
            map.put(TCP_MAX_WINSHIFT, "TCP_MAX_WINSHIFT");
            map.put(TCP_MAXBURST, "TCP_MAXBURST");
            map.put(TCP_NODELAY, "TCP_NODELAY");
            map.put(TCP_MAXSEG, "TCP_MAXSEG");
            map.put(TCP_NOPUSH, "TCP_NOPUSH");
            map.put(TCP_MD5SIG, "TCP_MD5SIG");
            return map;
        }

        StringTable() {
        }
    }
}

