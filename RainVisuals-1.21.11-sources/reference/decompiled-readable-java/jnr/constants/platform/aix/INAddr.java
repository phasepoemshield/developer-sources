/*
 * Decompiled with CFR 0.152.
 */
package jnr.constants.platform.aix;

import jnr.constants.Constant;

public final class INAddr
extends Enum<INAddr>
implements Constant {
    public static final /* enum */ INAddr INADDR_LOOPBACK;
    private final long value;
    public static final /* enum */ INAddr INADDR_ALLRTRS_GROUP;
    public static final long MIN_VALUE = 0L;
    public static final /* enum */ INAddr INADDR_BROADCAST;
    private static final /* synthetic */ INAddr[] $VALUES;
    public static final /* enum */ INAddr INADDR_MAX_LOCAL_GROUP;
    public static final /* enum */ INAddr INADDR_UNSPEC_GROUP;
    public static final /* enum */ INAddr INADDR_NONE;
    public static final long MAX_VALUE = 0xFFFFFFFFL;
    public static final /* enum */ INAddr INADDR_ANY;
    public static final /* enum */ INAddr INADDR_ALLHOSTS_GROUP;

    private INAddr(long value) {
        this.value = value;
    }

    @Override
    public final boolean defined() {
        return true;
    }

    @Override
    public final int intValue() {
        return (int)this.value;
    }

    public static INAddr valueOf(String name) {
        return Enum.valueOf(INAddr.class, name);
    }

    static {
        INADDR_ANY = new INAddr(0L);
        INADDR_BROADCAST = new INAddr(0xFFFFFFFFL);
        INADDR_NONE = new INAddr(0xFFFFFFFFL);
        INADDR_LOOPBACK = new INAddr(2130706433L);
        INADDR_UNSPEC_GROUP = new INAddr(0xE0000000L);
        INADDR_ALLHOSTS_GROUP = new INAddr(0xE0000001L);
        INADDR_ALLRTRS_GROUP = new INAddr(0xE0000002L);
        INADDR_MAX_LOCAL_GROUP = new INAddr(0xE00000FFL);
        INAddr[] iNAddrArray = new INAddr[8];
        iNAddrArray[0] = INADDR_ANY;
        iNAddrArray[1] = INADDR_BROADCAST;
        iNAddrArray[2] = INADDR_NONE;
        iNAddrArray[3] = INADDR_LOOPBACK;
        iNAddrArray[4] = INADDR_UNSPEC_GROUP;
        iNAddrArray[5] = INADDR_ALLHOSTS_GROUP;
        iNAddrArray[6] = INADDR_ALLRTRS_GROUP;
        iNAddrArray[7] = INADDR_MAX_LOCAL_GROUP;
        $VALUES = iNAddrArray;
    }

    public static INAddr[] values() {
        return (INAddr[])$VALUES.clone();
    }

    @Override
    public final long longValue() {
        return this.value;
    }
}

