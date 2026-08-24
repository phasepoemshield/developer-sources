/*
 * Decompiled with CFR 0.152.
 */
package jnr.constants.platform;

import jnr.constants.Constant;
import jnr.constants.platform.ConstantResolver;

public final class AddressInfo
extends Enum<AddressInfo>
implements Constant {
    public static final /* enum */ AddressInfo AI_NUMERICSERV;
    public static final /* enum */ AddressInfo AI_CANONNAME;
    public static final /* enum */ AddressInfo AI_NUMERICHOST;
    public static final /* enum */ AddressInfo AI_ALL;
    public static final /* enum */ AddressInfo AI_ADDRCONFIG;
    public static final /* enum */ AddressInfo AI_MASK;
    public static final /* enum */ AddressInfo AI_DEFAULT;
    private static final /* synthetic */ AddressInfo[] $VALUES;
    private static final ConstantResolver<AddressInfo> resolver;
    public static final /* enum */ AddressInfo __UNKNOWN_CONSTANT__;
    public static final /* enum */ AddressInfo AI_V4MAPPED_CFG;
    public static final /* enum */ AddressInfo AI_PASSIVE;
    public static final /* enum */ AddressInfo AI_V4MAPPED;

    public final String description() {
        return resolver.description(this);
    }

    static {
        AI_PASSIVE = new AddressInfo();
        AI_CANONNAME = new AddressInfo();
        AI_NUMERICHOST = new AddressInfo();
        AI_NUMERICSERV = new AddressInfo();
        AI_MASK = new AddressInfo();
        AI_ALL = new AddressInfo();
        AI_V4MAPPED_CFG = new AddressInfo();
        AI_ADDRCONFIG = new AddressInfo();
        AI_V4MAPPED = new AddressInfo();
        AI_DEFAULT = new AddressInfo();
        __UNKNOWN_CONSTANT__ = new AddressInfo();
        AddressInfo[] addressInfoArray = new AddressInfo[11];
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
        addressInfoArray[10] = __UNKNOWN_CONSTANT__;
        $VALUES = addressInfoArray;
        resolver = ConstantResolver.getResolver(AddressInfo.class, 20000, 29999);
    }

    public final String toString() {
        return this.description();
    }

    @Override
    public final long longValue() {
        return resolver.longValue(this);
    }

    public final int value() {
        return (int)resolver.longValue(this);
    }

    @Override
    public final boolean defined() {
        return resolver.defined(this);
    }

    @Override
    public final int intValue() {
        return (int)resolver.longValue(this);
    }

    public static AddressInfo[] values() {
        return (AddressInfo[])$VALUES.clone();
    }

    public static AddressInfo valueOf(long value) {
        return resolver.valueOf(value);
    }

    public static AddressInfo valueOf(String name) {
        return Enum.valueOf(AddressInfo.class, name);
    }
}

