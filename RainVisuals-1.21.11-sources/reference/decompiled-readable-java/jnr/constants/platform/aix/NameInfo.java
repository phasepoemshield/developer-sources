/*
 * Decompiled with CFR 0.152.
 */
package jnr.constants.platform.aix;

import jnr.constants.Constant;

public final class NameInfo
extends Enum<NameInfo>
implements Constant {
    public static final /* enum */ NameInfo NI_NUMERICSERV;
    public static final long MIN_VALUE = 1L;
    public static final /* enum */ NameInfo NI_NAMEREQD;
    private static final /* synthetic */ NameInfo[] $VALUES;
    private final long value;
    public static final /* enum */ NameInfo NI_MAXHOST;
    public static final /* enum */ NameInfo NI_MAXSERV;
    public static final /* enum */ NameInfo NI_NUMERICHOST;
    public static final /* enum */ NameInfo NI_DGRAM;
    public static final long MAX_VALUE = 1025L;
    public static final /* enum */ NameInfo NI_NOFQDN;

    @Override
    public final boolean defined() {
        return true;
    }

    @Override
    public final int intValue() {
        return (int)this.value;
    }

    public static NameInfo[] values() {
        return (NameInfo[])$VALUES.clone();
    }

    public static NameInfo valueOf(String name) {
        return Enum.valueOf(NameInfo.class, name);
    }

    static {
        NI_MAXHOST = new NameInfo(1025L);
        NI_MAXSERV = new NameInfo(32L);
        NI_NOFQDN = new NameInfo(1L);
        NI_NUMERICHOST = new NameInfo(2L);
        NI_NAMEREQD = new NameInfo(4L);
        NI_NUMERICSERV = new NameInfo(8L);
        NI_DGRAM = new NameInfo(16L);
        NameInfo[] nameInfoArray = new NameInfo[7];
        nameInfoArray[0] = NI_MAXHOST;
        nameInfoArray[1] = NI_MAXSERV;
        nameInfoArray[2] = NI_NOFQDN;
        nameInfoArray[3] = NI_NUMERICHOST;
        nameInfoArray[4] = NI_NAMEREQD;
        nameInfoArray[5] = NI_NUMERICSERV;
        nameInfoArray[6] = NI_DGRAM;
        $VALUES = nameInfoArray;
    }

    @Override
    public final long longValue() {
        return this.value;
    }

    private NameInfo(long value) {
        this.value = value;
    }
}

