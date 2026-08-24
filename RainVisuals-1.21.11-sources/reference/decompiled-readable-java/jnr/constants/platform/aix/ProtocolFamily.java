/*
 * Decompiled with CFR 0.152.
 */
package jnr.constants.platform.aix;

import jnr.constants.Constant;

public final class ProtocolFamily
extends Enum<ProtocolFamily>
implements Constant {
    public static final /* enum */ ProtocolFamily PF_UNIX;
    public static final /* enum */ ProtocolFamily PF_INET6;
    public static final /* enum */ ProtocolFamily PF_DECnet;
    public static final long MIN_VALUE = 0L;
    public static final /* enum */ ProtocolFamily PF_ECMA;
    public static final /* enum */ ProtocolFamily PF_ISO;
    public static final /* enum */ ProtocolFamily PF_IMPLINK;
    public static final long MAX_VALUE = 30L;
    public static final /* enum */ ProtocolFamily PF_LAT;
    public static final /* enum */ ProtocolFamily PF_DATAKIT;
    public static final /* enum */ ProtocolFamily PF_OSI;
    public static final /* enum */ ProtocolFamily PF_DLI;
    public static final /* enum */ ProtocolFamily PF_INET;
    public static final /* enum */ ProtocolFamily PF_CHAOS;
    public static final /* enum */ ProtocolFamily PF_HYLINK;
    public static final /* enum */ ProtocolFamily PF_LINK;
    public static final /* enum */ ProtocolFamily PF_ROUTE;
    public static final /* enum */ ProtocolFamily PF_APPLETALK;
    public static final /* enum */ ProtocolFamily PF_PUP;
    public static final /* enum */ ProtocolFamily PF_SNA;
    private static final /* synthetic */ ProtocolFamily[] $VALUES;
    public static final /* enum */ ProtocolFamily PF_MAX;
    public static final /* enum */ ProtocolFamily PF_NS;
    private final long value;
    public static final /* enum */ ProtocolFamily PF_UNSPEC;
    public static final /* enum */ ProtocolFamily PF_CCITT;
    public static final /* enum */ ProtocolFamily PF_XTP;

    public static ProtocolFamily valueOf(String name) {
        return Enum.valueOf(ProtocolFamily.class, name);
    }

    @Override
    public final long longValue() {
        return this.value;
    }

    public static ProtocolFamily[] values() {
        return (ProtocolFamily[])$VALUES.clone();
    }

    private ProtocolFamily(long value) {
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

    static {
        PF_UNSPEC = new ProtocolFamily(0L);
        PF_UNIX = new ProtocolFamily(1L);
        PF_INET = new ProtocolFamily(2L);
        PF_IMPLINK = new ProtocolFamily(3L);
        PF_PUP = new ProtocolFamily(4L);
        PF_CHAOS = new ProtocolFamily(5L);
        PF_NS = new ProtocolFamily(6L);
        PF_ISO = new ProtocolFamily(7L);
        PF_OSI = new ProtocolFamily(7L);
        PF_ECMA = new ProtocolFamily(8L);
        PF_DATAKIT = new ProtocolFamily(9L);
        PF_CCITT = new ProtocolFamily(10L);
        PF_SNA = new ProtocolFamily(11L);
        PF_DECnet = new ProtocolFamily(12L);
        PF_DLI = new ProtocolFamily(13L);
        PF_LAT = new ProtocolFamily(14L);
        PF_HYLINK = new ProtocolFamily(15L);
        PF_APPLETALK = new ProtocolFamily(16L);
        PF_ROUTE = new ProtocolFamily(17L);
        PF_LINK = new ProtocolFamily(18L);
        PF_XTP = new ProtocolFamily(19L);
        PF_INET6 = new ProtocolFamily(24L);
        PF_MAX = new ProtocolFamily(30L);
        ProtocolFamily[] protocolFamilyArray = new ProtocolFamily[23];
        protocolFamilyArray[0] = PF_UNSPEC;
        protocolFamilyArray[1] = PF_UNIX;
        protocolFamilyArray[2] = PF_INET;
        protocolFamilyArray[3] = PF_IMPLINK;
        protocolFamilyArray[4] = PF_PUP;
        protocolFamilyArray[5] = PF_CHAOS;
        protocolFamilyArray[6] = PF_NS;
        protocolFamilyArray[7] = PF_ISO;
        protocolFamilyArray[8] = PF_OSI;
        protocolFamilyArray[9] = PF_ECMA;
        protocolFamilyArray[10] = PF_DATAKIT;
        protocolFamilyArray[11] = PF_CCITT;
        protocolFamilyArray[12] = PF_SNA;
        protocolFamilyArray[13] = PF_DECnet;
        protocolFamilyArray[14] = PF_DLI;
        protocolFamilyArray[15] = PF_LAT;
        protocolFamilyArray[16] = PF_HYLINK;
        protocolFamilyArray[17] = PF_APPLETALK;
        protocolFamilyArray[18] = PF_ROUTE;
        protocolFamilyArray[19] = PF_LINK;
        protocolFamilyArray[20] = PF_XTP;
        protocolFamilyArray[21] = PF_INET6;
        protocolFamilyArray[22] = PF_MAX;
        $VALUES = protocolFamilyArray;
    }
}

