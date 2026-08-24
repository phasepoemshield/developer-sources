/*
 * Decompiled with CFR 0.152.
 */
package jnr.constants.platform;

import jnr.constants.Constant;
import jnr.constants.platform.ConstantResolver;

public final class INAddr
extends Enum<INAddr>
implements Constant {
    private static final ConstantResolver<INAddr> resolver;
    public static final /* enum */ INAddr INADDR_NONE;
    public static final /* enum */ INAddr INADDR_BROADCAST;
    public static final /* enum */ INAddr INADDR_LOOPBACK;
    public static final /* enum */ INAddr __UNKNOWN_CONSTANT__;
    public static final /* enum */ INAddr INADDR_UNSPEC_GROUP;
    private static final /* synthetic */ INAddr[] $VALUES;
    public static final /* enum */ INAddr INADDR_ALLHOSTS_GROUP;
    public static final /* enum */ INAddr INADDR_MAX_LOCAL_GROUP;
    public static final /* enum */ INAddr INADDR_ALLRTRS_GROUP;
    public static final /* enum */ INAddr INADDR_ANY;

    public static INAddr[] values() {
        return (INAddr[])$VALUES.clone();
    }

    public final int value() {
        return (int)resolver.longValue(this);
    }

    public static INAddr valueOf(long value) {
        return resolver.valueOf(value);
    }

    public final String description() {
        return resolver.description(this);
    }

    static {
        INADDR_ANY = new INAddr();
        INADDR_BROADCAST = new INAddr();
        INADDR_NONE = new INAddr();
        INADDR_LOOPBACK = new INAddr();
        INADDR_UNSPEC_GROUP = new INAddr();
        INADDR_ALLHOSTS_GROUP = new INAddr();
        INADDR_ALLRTRS_GROUP = new INAddr();
        INADDR_MAX_LOCAL_GROUP = new INAddr();
        __UNKNOWN_CONSTANT__ = new INAddr();
        INAddr[] iNAddrArray = new INAddr[9];
        iNAddrArray[0] = INADDR_ANY;
        iNAddrArray[1] = INADDR_BROADCAST;
        iNAddrArray[2] = INADDR_NONE;
        iNAddrArray[3] = INADDR_LOOPBACK;
        iNAddrArray[4] = INADDR_UNSPEC_GROUP;
        iNAddrArray[5] = INADDR_ALLHOSTS_GROUP;
        iNAddrArray[6] = INADDR_ALLRTRS_GROUP;
        iNAddrArray[7] = INADDR_MAX_LOCAL_GROUP;
        iNAddrArray[8] = __UNKNOWN_CONSTANT__;
        $VALUES = iNAddrArray;
        resolver = ConstantResolver.getResolver(INAddr.class, 20000, 29999);
    }

    @Override
    public final long longValue() {
        return resolver.longValue(this);
    }

    @Override
    public final boolean defined() {
        return resolver.defined(this);
    }

    public final String toString() {
        return this.description();
    }

    @Override
    public final int intValue() {
        return (int)resolver.longValue(this);
    }

    public static INAddr valueOf(String name) {
        return Enum.valueOf(INAddr.class, name);
    }
}

