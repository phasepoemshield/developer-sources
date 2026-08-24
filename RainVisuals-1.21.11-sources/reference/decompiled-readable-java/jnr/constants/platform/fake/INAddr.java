/*
 * Decompiled with CFR 0.152.
 */
package jnr.constants.platform.fake;

import jnr.constants.Constant;

public final class INAddr
extends Enum<INAddr>
implements Constant {
    public static final /* enum */ INAddr INADDR_MAX_LOCAL_GROUP;
    private final long value;
    public static final /* enum */ INAddr INADDR_NONE;
    private static final /* synthetic */ INAddr[] $VALUES;
    public static final /* enum */ INAddr INADDR_ALLRTRS_GROUP;
    public static final /* enum */ INAddr INADDR_BROADCAST;
    public static final long MIN_VALUE = 1L;
    public static final /* enum */ INAddr INADDR_ANY;
    public static final /* enum */ INAddr INADDR_UNSPEC_GROUP;
    public static final long MAX_VALUE = 8L;
    public static final /* enum */ INAddr INADDR_LOOPBACK;
    public static final /* enum */ INAddr INADDR_ALLHOSTS_GROUP;

    @Override
    public final long longValue() {
        return this.value;
    }

    public static INAddr valueOf(String name) {
        return Enum.valueOf(INAddr.class, name);
    }

    private INAddr(long value) {
        this.value = value;
    }

    @Override
    public final int intValue() {
        return (int)this.value;
    }

    @Override
    public final boolean defined() {
        return true;
    }

    public final int value() {
        return (int)this.value;
    }

    static {
        INADDR_ANY = new INAddr(1L);
        INADDR_BROADCAST = new INAddr(2L);
        INADDR_NONE = new INAddr(3L);
        INADDR_LOOPBACK = new INAddr(4L);
        INADDR_UNSPEC_GROUP = new INAddr(5L);
        INADDR_ALLHOSTS_GROUP = new INAddr(6L);
        INADDR_ALLRTRS_GROUP = new INAddr(7L);
        INADDR_MAX_LOCAL_GROUP = new INAddr(8L);
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
}

