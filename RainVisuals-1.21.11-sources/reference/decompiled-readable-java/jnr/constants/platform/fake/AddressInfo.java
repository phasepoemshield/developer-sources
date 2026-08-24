/*
 * Decompiled with CFR 0.152.
 */
package jnr.constants.platform.fake;

import jnr.constants.Constant;

public final class AddressInfo
extends Enum<AddressInfo>
implements Constant {
    public static final /* enum */ AddressInfo AI_MASK;
    public static final /* enum */ AddressInfo AI_NUMERICHOST;
    public static final /* enum */ AddressInfo AI_V4MAPPED;
    public static final /* enum */ AddressInfo AI_NUMERICSERV;
    private static final /* synthetic */ AddressInfo[] $VALUES;
    public static final long MAX_VALUE = 10L;
    public static final /* enum */ AddressInfo AI_ADDRCONFIG;
    public static final /* enum */ AddressInfo AI_CANONNAME;
    public static final /* enum */ AddressInfo AI_V4MAPPED_CFG;
    private final long value;
    public static final /* enum */ AddressInfo AI_PASSIVE;
    public static final long MIN_VALUE = 1L;
    public static final /* enum */ AddressInfo AI_ALL;
    public static final /* enum */ AddressInfo AI_DEFAULT;

    public static AddressInfo valueOf(String name) {
        return Enum.valueOf(AddressInfo.class, name);
    }

    @Override
    public final int intValue() {
        return (int)this.value;
    }

    @Override
    public final long longValue() {
        return this.value;
    }

    @Override
    public final boolean defined() {
        return true;
    }

    private AddressInfo(long value) {
        this.value = value;
    }

    public static AddressInfo[] values() {
        return (AddressInfo[])$VALUES.clone();
    }

    public final int value() {
        return (int)this.value;
    }

    static {
        AI_PASSIVE = new AddressInfo(1L);
        AI_CANONNAME = new AddressInfo(2L);
        AI_NUMERICHOST = new AddressInfo(3L);
        AI_NUMERICSERV = new AddressInfo(4L);
        AI_MASK = new AddressInfo(5L);
        AI_ALL = new AddressInfo(6L);
        AI_V4MAPPED_CFG = new AddressInfo(7L);
        AI_ADDRCONFIG = new AddressInfo(8L);
        AI_V4MAPPED = new AddressInfo(9L);
        AI_DEFAULT = new AddressInfo(10L);
        AddressInfo[] addressInfoArray = new AddressInfo[10];
        addressInfoArray[0] = AI_PASSIVE;
        addressInfoArray[1] = AI_CANONNAME;
        addressInfoArray[2] = AI_NUMERICHOST;
        addressInfoArray[3] = AI_NUMERICSERV;
        addressInfoArray[4] = AI_MASK;
        addressInfoArray[5] = AI_ALL;
        addressInfoArray[6] = AI_V4MAPPED_CFG;
        addressInfoArray[7] = AI_ADDRCONFIG;
        addressInfoArray[8] = AI_V4MAPPED;
        addressInfoArray[9] = AI_DEFAULT;
        $VALUES = addressInfoArray;
    }
}

