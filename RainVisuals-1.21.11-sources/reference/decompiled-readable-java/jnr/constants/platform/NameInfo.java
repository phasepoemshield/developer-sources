/*
 * Decompiled with CFR 0.152.
 */
package jnr.constants.platform;

import jnr.constants.Constant;
import jnr.constants.platform.ConstantResolver;

public final class NameInfo
extends Enum<NameInfo>
implements Constant {
    public static final /* enum */ NameInfo NI_DGRAM;
    public static final /* enum */ NameInfo NI_NUMERICSERV;
    public static final /* enum */ NameInfo __UNKNOWN_CONSTANT__;
    public static final /* enum */ NameInfo NI_NAMEREQD;
    public static final /* enum */ NameInfo NI_NOFQDN;
    public static final /* enum */ NameInfo NI_NUMERICHOST;
    private static final /* synthetic */ NameInfo[] $VALUES;
    private static final ConstantResolver<NameInfo> resolver;
    public static final /* enum */ NameInfo NI_WITHSCOPEID;
    public static final /* enum */ NameInfo NI_MAXSERV;
    public static final /* enum */ NameInfo NI_MAXHOST;

    public static NameInfo[] values() {
        return (NameInfo[])$VALUES.clone();
    }

    public static NameInfo valueOf(String name) {
        return Enum.valueOf(NameInfo.class, name);
    }

    static {
        NI_MAXHOST = new NameInfo();
        NI_MAXSERV = new NameInfo();
        NI_NOFQDN = new NameInfo();
        NI_NUMERICHOST = new NameInfo();
        NI_NAMEREQD = new NameInfo();
        NI_NUMERICSERV = new NameInfo();
        NI_DGRAM = new NameInfo();
        NI_WITHSCOPEID = new NameInfo();
        __UNKNOWN_CONSTANT__ = new NameInfo();
        NameInfo[] nameInfoArray = new NameInfo[9];
        nameInfoArray[0] = NI_MAXHOST;
        nameInfoArray[1] = NI_MAXSERV;
        nameInfoArray[2] = NI_NOFQDN;
        nameInfoArray[3] = NI_NUMERICHOST;
        nameInfoArray[4] = NI_NAMEREQD;
        nameInfoArray[5] = NI_NUMERICSERV;
        nameInfoArray[6] = NI_DGRAM;
        nameInfoArray[7] = NI_WITHSCOPEID;
        nameInfoArray[8] = __UNKNOWN_CONSTANT__;
        $VALUES = nameInfoArray;
        resolver = ConstantResolver.getResolver(NameInfo.class, 20000, 29999);
    }

    public final String description() {
        return resolver.description(this);
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

    public final String toString() {
        return this.description();
    }

    public static NameInfo valueOf(long value) {
        return resolver.valueOf(value);
    }

    @Override
    public final int intValue() {
        return (int)resolver.longValue(this);
    }
}

