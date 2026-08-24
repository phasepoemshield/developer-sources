/*
 * Decompiled with CFR 0.152.
 */
package jnr.constants.platform.fake;

import jnr.constants.Constant;

public final class NameInfo
extends Enum<NameInfo>
implements Constant {
    private static final /* synthetic */ NameInfo[] $VALUES;
    public static final long MAX_VALUE = 8L;
    public static final /* enum */ NameInfo NI_NUMERICSERV;
    public static final /* enum */ NameInfo NI_NUMERICHOST;
    public static final /* enum */ NameInfo NI_MAXSERV;
    public static final /* enum */ NameInfo NI_NAMEREQD;
    public static final /* enum */ NameInfo NI_MAXHOST;
    public static final /* enum */ NameInfo NI_NOFQDN;
    public static final /* enum */ NameInfo NI_DGRAM;
    public static final /* enum */ NameInfo NI_WITHSCOPEID;
    public static final long MIN_VALUE = 1L;
    private final long value;

    @Override
    public final boolean defined() {
        return true;
    }

    @Override
    public final int intValue() {
        return (int)this.value;
    }

    private NameInfo(long value) {
        this.value = value;
    }

    public final int value() {
        return (int)this.value;
    }

    public static NameInfo valueOf(String name) {
        return Enum.valueOf(NameInfo.class, name);
    }

    static {
        NI_MAXHOST = new NameInfo(1L);
        NI_MAXSERV = new NameInfo(2L);
        NI_NOFQDN = new NameInfo(3L);
        NI_NUMERICHOST = new NameInfo(4L);
        NI_NAMEREQD = new NameInfo(5L);
        NI_NUMERICSERV = new NameInfo(6L);
        NI_DGRAM = new NameInfo(7L);
        NI_WITHSCOPEID = new NameInfo(8L);
        NameInfo[] nameInfoArray = new NameInfo[8];
        nameInfoArray[0] = NI_MAXHOST;
        nameInfoArray[1] = NI_MAXSERV;
        nameInfoArray[2] = NI_NOFQDN;
        nameInfoArray[3] = NI_NUMERICHOST;
        nameInfoArray[4] = NI_NAMEREQD;
        nameInfoArray[5] = NI_NUMERICSERV;
        nameInfoArray[6] = NI_DGRAM;
        nameInfoArray[7] = NI_WITHSCOPEID;
        $VALUES = nameInfoArray;
    }

    @Override
    public final long longValue() {
        return this.value;
    }

    public static NameInfo[] values() {
        return (NameInfo[])$VALUES.clone();
    }
}

