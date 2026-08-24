/*
 * Decompiled with CFR 0.152.
 */
package jnr.constants.platform.openbsd;

import java.util.EnumMap;
import java.util.Map;
import jnr.constants.Constant;

public final class INAddr
extends Enum<INAddr>
implements Constant {
    public static final /* enum */ INAddr INADDR_BROADCAST;
    public static final long MIN_VALUE = 0L;
    public static final /* enum */ INAddr INADDR_ALLHOSTS_GROUP;
    public static final /* enum */ INAddr INADDR_NONE;
    public static final long MAX_VALUE = 0xFFFFFFFFL;
    private static final /* synthetic */ INAddr[] $VALUES;
    private final long value;
    public static final /* enum */ INAddr INADDR_LOOPBACK;
    public static final /* enum */ INAddr INADDR_UNSPEC_GROUP;
    public static final /* enum */ INAddr INADDR_ANY;
    public static final /* enum */ INAddr INADDR_MAX_LOCAL_GROUP;

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

    static {
        INADDR_ANY = new INAddr(0L);
        INADDR_BROADCAST = new INAddr(0xFFFFFFFFL);
        INADDR_NONE = new INAddr(0xFFFFFFFFL);
        INADDR_LOOPBACK = new INAddr(2130706433L);
        INADDR_UNSPEC_GROUP = new INAddr(0xE0000000L);
        INADDR_ALLHOSTS_GROUP = new INAddr(0xE0000001L);
        INADDR_MAX_LOCAL_GROUP = new INAddr(0xE00000FFL);
        INAddr[] iNAddrArray = new INAddr[7];
        iNAddrArray[0] = INADDR_ANY;
        iNAddrArray[1] = INADDR_BROADCAST;
        iNAddrArray[2] = INADDR_NONE;
        iNAddrArray[3] = INADDR_LOOPBACK;
        iNAddrArray[4] = INADDR_UNSPEC_GROUP;
        iNAddrArray[5] = INADDR_ALLHOSTS_GROUP;
        iNAddrArray[6] = INADDR_MAX_LOCAL_GROUP;
        $VALUES = iNAddrArray;
    }

    public final String toString() {
        return StringTable.descriptions.get(this);
    }

    private INAddr(long value) {
        this.value = value;
    }

    public static INAddr[] values() {
        return (INAddr[])$VALUES.clone();
    }

    @Override
    public final int intValue() {
        return (int)this.value;
    }

    public static INAddr valueOf(String name) {
        return Enum.valueOf(INAddr.class, name);
    }

    static final class StringTable {
        public static final Map<INAddr, String> descriptions = StringTable.generateTable();

        public static final Map<INAddr, String> generateTable() {
            EnumMap<INAddr, String> map = new EnumMap<INAddr, String>(INAddr.class);
            map.put(INADDR_ANY, "INADDR_ANY");
            map.put(INADDR_BROADCAST, "INADDR_BROADCAST");
            map.put(INADDR_NONE, "INADDR_NONE");
            map.put(INADDR_LOOPBACK, "INADDR_LOOPBACK");
            map.put(INADDR_UNSPEC_GROUP, "INADDR_UNSPEC_GROUP");
            map.put(INADDR_ALLHOSTS_GROUP, "INADDR_ALLHOSTS_GROUP");
            map.put(INADDR_MAX_LOCAL_GROUP, "INADDR_MAX_LOCAL_GROUP");
            return map;
        }

        StringTable() {
        }
    }
}

