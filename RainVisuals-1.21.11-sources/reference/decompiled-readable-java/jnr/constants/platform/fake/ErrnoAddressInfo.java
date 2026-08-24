/*
 * Decompiled with CFR 0.152.
 */
package jnr.constants.platform.fake;

import jnr.constants.Constant;

public final class ErrnoAddressInfo
extends Enum<ErrnoAddressInfo>
implements Constant {
    public static final /* enum */ ErrnoAddressInfo EAI_BADFLAGS;
    public static final /* enum */ ErrnoAddressInfo EAI_AGAIN;
    public static final /* enum */ ErrnoAddressInfo EAI_FAIL;
    public static final /* enum */ ErrnoAddressInfo EAI_SYSTEM;
    private final long value;
    public static final /* enum */ ErrnoAddressInfo EAI_ADDRFAMILY;
    public static final /* enum */ ErrnoAddressInfo EAI_PROTOCOL;
    public static final long MIN_VALUE = 1L;
    public static final /* enum */ ErrnoAddressInfo EAI_BADHINTS;
    public static final /* enum */ ErrnoAddressInfo EAI_MAX;
    public static final /* enum */ ErrnoAddressInfo EAI_NODATA;
    private static final /* synthetic */ ErrnoAddressInfo[] $VALUES;
    public static final long MAX_VALUE = 15L;
    public static final /* enum */ ErrnoAddressInfo EAI_NONAME;
    public static final /* enum */ ErrnoAddressInfo EAI_MEMORY;
    public static final /* enum */ ErrnoAddressInfo EAI_SOCKTYPE;
    public static final /* enum */ ErrnoAddressInfo EAI_SERVICE;
    public static final /* enum */ ErrnoAddressInfo EAI_FAMILY;
    public static final /* enum */ ErrnoAddressInfo EAI_OVERFLOW;

    private ErrnoAddressInfo(long value) {
        this.value = value;
    }

    @Override
    public final boolean defined() {
        return true;
    }

    public static ErrnoAddressInfo[] values() {
        return (ErrnoAddressInfo[])$VALUES.clone();
    }

    static {
        EAI_ADDRFAMILY = new ErrnoAddressInfo(1L);
        EAI_AGAIN = new ErrnoAddressInfo(2L);
        EAI_BADFLAGS = new ErrnoAddressInfo(3L);
        EAI_FAIL = new ErrnoAddressInfo(4L);
        EAI_FAMILY = new ErrnoAddressInfo(5L);
        EAI_MEMORY = new ErrnoAddressInfo(6L);
        EAI_NODATA = new ErrnoAddressInfo(7L);
        EAI_NONAME = new ErrnoAddressInfo(8L);
        EAI_OVERFLOW = new ErrnoAddressInfo(9L);
        EAI_SERVICE = new ErrnoAddressInfo(10L);
        EAI_SOCKTYPE = new ErrnoAddressInfo(11L);
        EAI_SYSTEM = new ErrnoAddressInfo(12L);
        EAI_BADHINTS = new ErrnoAddressInfo(13L);
        EAI_PROTOCOL = new ErrnoAddressInfo(14L);
        EAI_MAX = new ErrnoAddressInfo(15L);
        ErrnoAddressInfo[] errnoAddressInfoArray = new ErrnoAddressInfo[15];
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
        $VALUES = errnoAddressInfoArray;
    }

    @Override
    public final long longValue() {
        return this.value;
    }

    @Override
    public final int intValue() {
        return (int)this.value;
    }

    public final int value() {
        return (int)this.value;
    }

    public static ErrnoAddressInfo valueOf(String name) {
        return Enum.valueOf(ErrnoAddressInfo.class, name);
    }
}

