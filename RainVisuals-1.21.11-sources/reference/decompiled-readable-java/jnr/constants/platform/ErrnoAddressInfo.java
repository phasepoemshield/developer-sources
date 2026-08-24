/*
 * Decompiled with CFR 0.152.
 */
package jnr.constants.platform;

import jnr.constants.Constant;
import jnr.constants.platform.ConstantResolver;

public final class ErrnoAddressInfo
extends Enum<ErrnoAddressInfo>
implements Constant {
    public static final /* enum */ ErrnoAddressInfo EAI_FAMILY;
    public static final /* enum */ ErrnoAddressInfo EAI_FAIL;
    public static final /* enum */ ErrnoAddressInfo EAI_AGAIN;
    public static final /* enum */ ErrnoAddressInfo EAI_NODATA;
    public static final /* enum */ ErrnoAddressInfo EAI_MAX;
    public static final /* enum */ ErrnoAddressInfo EAI_BADHINTS;
    public static final /* enum */ ErrnoAddressInfo EAI_PROTOCOL;
    public static final /* enum */ ErrnoAddressInfo EAI_BADFLAGS;
    public static final /* enum */ ErrnoAddressInfo EAI_OVERFLOW;
    private static final ConstantResolver<ErrnoAddressInfo> resolver;
    public static final /* enum */ ErrnoAddressInfo EAI_ADDRFAMILY;
    public static final /* enum */ ErrnoAddressInfo EAI_SERVICE;
    public static final /* enum */ ErrnoAddressInfo EAI_SYSTEM;
    public static final /* enum */ ErrnoAddressInfo EAI_NONAME;
    public static final /* enum */ ErrnoAddressInfo __UNKNOWN_CONSTANT__;
    private static final /* synthetic */ ErrnoAddressInfo[] $VALUES;
    public static final /* enum */ ErrnoAddressInfo EAI_MEMORY;
    public static final /* enum */ ErrnoAddressInfo EAI_SOCKTYPE;

    @Override
    public final boolean defined() {
        return resolver.defined(this);
    }

    static {
        EAI_ADDRFAMILY = new ErrnoAddressInfo();
        EAI_AGAIN = new ErrnoAddressInfo();
        EAI_BADFLAGS = new ErrnoAddressInfo();
        EAI_FAIL = new ErrnoAddressInfo();
        EAI_FAMILY = new ErrnoAddressInfo();
        EAI_MEMORY = new ErrnoAddressInfo();
        EAI_NODATA = new ErrnoAddressInfo();
        EAI_NONAME = new ErrnoAddressInfo();
        EAI_OVERFLOW = new ErrnoAddressInfo();
        EAI_SERVICE = new ErrnoAddressInfo();
        EAI_SOCKTYPE = new ErrnoAddressInfo();
        EAI_SYSTEM = new ErrnoAddressInfo();
        EAI_BADHINTS = new ErrnoAddressInfo();
        EAI_PROTOCOL = new ErrnoAddressInfo();
        EAI_MAX = new ErrnoAddressInfo();
        __UNKNOWN_CONSTANT__ = new ErrnoAddressInfo();
        ErrnoAddressInfo[] errnoAddressInfoArray = new ErrnoAddressInfo[16];
        errnoAddressInfoArray[0] = EAI_ADDRFAMILY;
        errnoAddressInfoArray[1] = EAI_AGAIN;
        errnoAddressInfoArray[2] = EAI_BADFLAGS;
        errnoAddressInfoArray[3] = EAI_FAIL;
        errnoAddressInfoArray[4] = EAI_FAMILY;
        errnoAddressInfoArray[5] = EAI_MEMORY;
        errnoAddressInfoArray[6] = EAI_NODATA;
        errnoAddressInfoArray[7] = EAI_NONAME;
        errnoAddressInfoArray[8] = EAI_OVERFLOW;
        errnoAddressInfoArray[9] = EAI_SERVICE;
        errnoAddressInfoArray[10] = EAI_SOCKTYPE;
        errnoAddressInfoArray[11] = EAI_SYSTEM;
        errnoAddressInfoArray[12] = EAI_BADHINTS;
        errnoAddressInfoArray[13] = EAI_PROTOCOL;
        errnoAddressInfoArray[14] = EAI_MAX;
        errnoAddressInfoArray[15] = __UNKNOWN_CONSTANT__;
        $VALUES = errnoAddressInfoArray;
        resolver = ConstantResolver.getResolver(ErrnoAddressInfo.class, 20000, 29999);
    }

    public final String description() {
        return resolver.description(this);
    }

    public final int value() {
        return (int)resolver.longValue(this);
    }

    @Override
    public final int intValue() {
        return (int)resolver.longValue(this);
    }

    public static ErrnoAddressInfo valueOf(String name) {
        return Enum.valueOf(ErrnoAddressInfo.class, name);
    }

    public final String toString() {
        return this.description();
    }

    @Override
    public final long longValue() {
        return resolver.longValue(this);
    }

    public static ErrnoAddressInfo[] values() {
        return (ErrnoAddressInfo[])$VALUES.clone();
    }

    public static ErrnoAddressInfo valueOf(long value) {
        return resolver.valueOf(value);
    }
}

