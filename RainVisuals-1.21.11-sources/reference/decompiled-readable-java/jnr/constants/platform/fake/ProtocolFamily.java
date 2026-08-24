/*
 * Decompiled with CFR 0.152.
 */
package jnr.constants.platform.fake;

import jnr.constants.Constant;

public final class ProtocolFamily
extends Enum<ProtocolFamily>
implements Constant {
    private static final /* synthetic */ ProtocolFamily[] $VALUES;
    public static final /* enum */ ProtocolFamily PF_DATAKIT;
    public static final /* enum */ ProtocolFamily PF_RDS;
    public static final /* enum */ ProtocolFamily PF_UNSPEC;
    public static final /* enum */ ProtocolFamily PF_LAT;
    public static final /* enum */ ProtocolFamily PF_ISDN;
    public static final /* enum */ ProtocolFamily PF_PPP;
    public static final /* enum */ ProtocolFamily PF_CCITT;
    public static final /* enum */ ProtocolFamily PF_LINK;
    public static final /* enum */ ProtocolFamily PF_DECnet;
    public static final /* enum */ ProtocolFamily PF_LLC;
    public static final /* enum */ ProtocolFamily PF_INET;
    public static final /* enum */ ProtocolFamily PF_PUP;
    public static final /* enum */ ProtocolFamily PF_ECMA;
    public static final /* enum */ ProtocolFamily PF_INET6;
    public static final /* enum */ ProtocolFamily PF_CAN;
    public static final /* enum */ ProtocolFamily PF_BLUETOOTH;
    public static final /* enum */ ProtocolFamily PF_IB;
    public static final /* enum */ ProtocolFamily PF_IPX;
    public static final /* enum */ ProtocolFamily PF_NETBIOS;
    public static final /* enum */ ProtocolFamily PF_KEY;
    public static final /* enum */ ProtocolFamily PF_MAX;
    public static final /* enum */ ProtocolFamily PF_NETLINK;
    public static final /* enum */ ProtocolFamily PF_COIP;
    public static final /* enum */ ProtocolFamily PF_PPPOX;
    public static final /* enum */ ProtocolFamily PF_CHAOS;
    public static final long MAX_VALUE = 52L;
    public static final /* enum */ ProtocolFamily PF_OSI;
    public static final /* enum */ ProtocolFamily PF_ALG;
    public static final /* enum */ ProtocolFamily PF_DLI;
    public static final /* enum */ ProtocolFamily PF_ROUTE;
    private final long value;
    public static final /* enum */ ProtocolFamily PF_NATM;
    public static final /* enum */ ProtocolFamily PF_XTP;
    public static final /* enum */ ProtocolFamily PF_IMPLINK;
    public static final /* enum */ ProtocolFamily PF_ATM;
    public static final /* enum */ ProtocolFamily PF_UNIX;
    public static final /* enum */ ProtocolFamily PF_PIP;
    public static final /* enum */ ProtocolFamily PF_RTIP;
    public static final /* enum */ ProtocolFamily PF_SYSTEM;
    public static final /* enum */ ProtocolFamily PF_TIPC;
    public static final /* enum */ ProtocolFamily PF_VSOCK;
    public static final /* enum */ ProtocolFamily PF_NS;
    public static final /* enum */ ProtocolFamily PF_ISO;
    public static final /* enum */ ProtocolFamily PF_NDRV;
    public static final /* enum */ ProtocolFamily PF_APPLETALK;
    public static final /* enum */ ProtocolFamily PF_KCM;
    public static final /* enum */ ProtocolFamily PF_CNT;
    public static final /* enum */ ProtocolFamily PF_MPLS;
    public static final /* enum */ ProtocolFamily PF_HYLINK;
    public static final /* enum */ ProtocolFamily PF_XDP;
    public static final /* enum */ ProtocolFamily PF_SNA;
    public static final /* enum */ ProtocolFamily PF_SIP;
    public static final long MIN_VALUE = 1L;
    public static final /* enum */ ProtocolFamily PF_NETGRAPH;
    public static final /* enum */ ProtocolFamily PF_LOCAL;

    @Override
    public final boolean defined() {
        return true;
    }

    @Override
    public final int intValue() {
        return (int)this.value;
    }

    public static ProtocolFamily valueOf(String name) {
        return Enum.valueOf(ProtocolFamily.class, name);
    }

    public final int value() {
        return (int)this.value;
    }

    static {
        PF_UNSPEC = new ProtocolFamily(1L);
        PF_LOCAL = new ProtocolFamily(2L);
        PF_UNIX = new ProtocolFamily(3L);
        PF_INET = new ProtocolFamily(4L);
        PF_IMPLINK = new ProtocolFamily(5L);
        PF_PUP = new ProtocolFamily(6L);
        PF_CHAOS = new ProtocolFamily(7L);
        PF_NS = new ProtocolFamily(8L);
        PF_ISO = new ProtocolFamily(9L);
        PF_OSI = new ProtocolFamily(10L);
        PF_ECMA = new ProtocolFamily(11L);
        PF_DATAKIT = new ProtocolFamily(12L);
        PF_CCITT = new ProtocolFamily(13L);
        PF_SNA = new ProtocolFamily(14L);
        PF_DECnet = new ProtocolFamily(15L);
        PF_DLI = new ProtocolFamily(16L);
        PF_LAT = new ProtocolFamily(17L);
        PF_HYLINK = new ProtocolFamily(18L);
        PF_APPLETALK = new ProtocolFamily(19L);
        PF_ROUTE = new ProtocolFamily(20L);
        PF_LINK = new ProtocolFamily(21L);
        PF_XTP = new ProtocolFamily(22L);
        PF_COIP = new ProtocolFamily(23L);
        PF_CNT = new ProtocolFamily(24L);
        PF_SIP = new ProtocolFamily(25L);
        PF_IPX = new ProtocolFamily(26L);
        PF_RTIP = new ProtocolFamily(27L);
        PF_PIP = new ProtocolFamily(28L);
        PF_NDRV = new ProtocolFamily(29L);
        PF_ISDN = new ProtocolFamily(30L);
        PF_KEY = new ProtocolFamily(31L);
        PF_INET6 = new ProtocolFamily(32L);
        PF_NATM = new ProtocolFamily(33L);
        PF_SYSTEM = new ProtocolFamily(34L);
        PF_NETBIOS = new ProtocolFamily(35L);
        PF_PPP = new ProtocolFamily(36L);
        PF_ATM = new ProtocolFamily(37L);
        PF_NETGRAPH = new ProtocolFamily(38L);
        PF_NETLINK = new ProtocolFamily(39L);
        PF_RDS = new ProtocolFamily(40L);
        PF_PPPOX = new ProtocolFamily(41L);
        PF_LLC = new ProtocolFamily(42L);
        PF_IB = new ProtocolFamily(43L);
        PF_MPLS = new ProtocolFamily(44L);
        PF_CAN = new ProtocolFamily(45L);
        PF_TIPC = new ProtocolFamily(46L);
        PF_BLUETOOTH = new ProtocolFamily(47L);
        PF_ALG = new ProtocolFamily(48L);
        PF_VSOCK = new ProtocolFamily(49L);
        PF_KCM = new ProtocolFamily(50L);
        PF_XDP = new ProtocolFamily(51L);
        PF_MAX = new ProtocolFamily(52L);
        ProtocolFamily[] protocolFamilyArray = new ProtocolFamily[52];
        protocolFamilyArray[0] = PF_UNSPEC;
        protocolFamilyArray[1] = PF_LOCAL;
        protocolFamilyArray[2] = PF_UNIX;
        protocolFamilyArray[3] = PF_INET;
        protocolFamilyArray[4] = PF_IMPLINK;
        protocolFamilyArray[5] = PF_PUP;
        protocolFamilyArray[6] = PF_CHAOS;
        protocolFamilyArray[7] = PF_NS;
        protocolFamilyArray[8] = PF_ISO;
        protocolFamilyArray[9] = PF_OSI;
        protocolFamilyArray[10] = PF_ECMA;
        protocolFamilyArray[11] = PF_DATAKIT;
        protocolFamilyArray[12] = PF_CCITT;
        protocolFamilyArray[13] = PF_SNA;
        protocolFamilyArray[14] = PF_DECnet;
        protocolFamilyArray[15] = PF_DLI;
        protocolFamilyArray[16] = PF_LAT;
        protocolFamilyArray[17] = PF_HYLINK;
        protocolFamilyArray[18] = PF_APPLETALK;
        protocolFamilyArray[19] = PF_ROUTE;
        protocolFamilyArray[20] = PF_LINK;
        protocolFamilyArray[21] = PF_XTP;
        protocolFamilyArray[22] = PF_COIP;
        protocolFamilyArray[23] = PF_CNT;
        protocolFamilyArray[24] = PF_SIP;
        protocolFamilyArray[25] = PF_IPX;
        protocolFamilyArray[26] = PF_RTIP;
        protocolFamilyArray[27] = PF_PIP;
        protocolFamilyArray[28] = PF_NDRV;
        protocolFamilyArray[29] = PF_ISDN;
        protocolFamilyArray[30] = PF_KEY;
        protocolFamilyArray[31] = PF_INET6;
        protocolFamilyArray[32] = PF_NATM;
        protocolFamilyArray[33] = PF_SYSTEM;
        protocolFamilyArray[34] = PF_NETBIOS;
        protocolFamilyArray[35] = PF_PPP;
        protocolFamilyArray[36] = PF_ATM;
        protocolFamilyArray[37] = PF_NETGRAPH;
        protocolFamilyArray[38] = PF_NETLINK;
        protocolFamilyArray[39] = PF_RDS;
        protocolFamilyArray[40] = PF_PPPOX;
        protocolFamilyArray[41] = PF_LLC;
        protocolFamilyArray[42] = PF_IB;
        protocolFamilyArray[43] = PF_MPLS;
        protocolFamilyArray[44] = PF_CAN;
        protocolFamilyArray[45] = PF_TIPC;
        protocolFamilyArray[46] = PF_BLUETOOTH;
        protocolFamilyArray[47] = PF_ALG;
        protocolFamilyArray[48] = PF_VSOCK;
        protocolFamilyArray[49] = PF_KCM;
        protocolFamilyArray[50] = PF_XDP;
        protocolFamilyArray[51] = PF_MAX;
        $VALUES = protocolFamilyArray;
    }

    public static ProtocolFamily[] values() {
        return (ProtocolFamily[])$VALUES.clone();
    }

    private ProtocolFamily(long value) {
        this.value = value;
    }

    @Override
    public final long longValue() {
        return this.value;
    }
}

