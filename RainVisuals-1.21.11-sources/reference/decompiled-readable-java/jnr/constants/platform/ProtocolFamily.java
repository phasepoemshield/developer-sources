/*
 * Decompiled with CFR 0.152.
 */
package jnr.constants.platform;

import jnr.constants.Constant;
import jnr.constants.platform.ConstantResolver;

public final class ProtocolFamily
extends Enum<ProtocolFamily>
implements Constant {
    public static final /* enum */ ProtocolFamily PF_DLI;
    public static final /* enum */ ProtocolFamily PF_APPLETALK;
    public static final /* enum */ ProtocolFamily PF_PPP;
    public static final /* enum */ ProtocolFamily PF_MAX;
    public static final /* enum */ ProtocolFamily PF_CCITT;
    public static final /* enum */ ProtocolFamily PF_TIPC;
    public static final /* enum */ ProtocolFamily PF_PPPOX;
    public static final /* enum */ ProtocolFamily PF_KEY;
    public static final /* enum */ ProtocolFamily PF_UNIX;
    public static final /* enum */ ProtocolFamily PF_SNA;
    public static final /* enum */ ProtocolFamily PF_DECnet;
    public static final /* enum */ ProtocolFamily PF_PIP;
    public static final /* enum */ ProtocolFamily PF_RDS;
    public static final /* enum */ ProtocolFamily PF_ALG;
    public static final /* enum */ ProtocolFamily PF_VSOCK;
    public static final /* enum */ ProtocolFamily PF_INET;
    private static final /* synthetic */ ProtocolFamily[] $VALUES;
    public static final /* enum */ ProtocolFamily PF_RTIP;
    public static final /* enum */ ProtocolFamily PF_SIP;
    public static final /* enum */ ProtocolFamily PF_LOCAL;
    public static final /* enum */ ProtocolFamily PF_LAT;
    public static final /* enum */ ProtocolFamily PF_ECMA;
    public static final /* enum */ ProtocolFamily PF_ISO;
    public static final /* enum */ ProtocolFamily PF_INET6;
    public static final /* enum */ ProtocolFamily PF_XTP;
    public static final /* enum */ ProtocolFamily PF_IMPLINK;
    public static final /* enum */ ProtocolFamily PF_IB;
    public static final /* enum */ ProtocolFamily PF_UNSPEC;
    public static final /* enum */ ProtocolFamily __UNKNOWN_CONSTANT__;
    public static final /* enum */ ProtocolFamily PF_ROUTE;
    public static final /* enum */ ProtocolFamily PF_CHAOS;
    public static final /* enum */ ProtocolFamily PF_LLC;
    public static final /* enum */ ProtocolFamily PF_COIP;
    public static final /* enum */ ProtocolFamily PF_MPLS;
    public static final /* enum */ ProtocolFamily PF_OSI;
    private static final ConstantResolver<ProtocolFamily> resolver;
    public static final /* enum */ ProtocolFamily PF_ISDN;
    public static final /* enum */ ProtocolFamily PF_CNT;
    public static final /* enum */ ProtocolFamily PF_NETGRAPH;
    public static final /* enum */ ProtocolFamily PF_CAN;
    public static final /* enum */ ProtocolFamily PF_NETLINK;
    public static final /* enum */ ProtocolFamily PF_SYSTEM;
    public static final /* enum */ ProtocolFamily PF_ATM;
    public static final /* enum */ ProtocolFamily PF_DATAKIT;
    public static final /* enum */ ProtocolFamily PF_HYLINK;
    public static final /* enum */ ProtocolFamily PF_BLUETOOTH;
    public static final /* enum */ ProtocolFamily PF_XDP;
    public static final /* enum */ ProtocolFamily PF_NETBIOS;
    public static final /* enum */ ProtocolFamily PF_IPX;
    public static final /* enum */ ProtocolFamily PF_KCM;
    public static final /* enum */ ProtocolFamily PF_LINK;
    public static final /* enum */ ProtocolFamily PF_PUP;
    public static final /* enum */ ProtocolFamily PF_NDRV;
    public static final /* enum */ ProtocolFamily PF_NS;
    public static final /* enum */ ProtocolFamily PF_NATM;

    static {
        PF_UNSPEC = new ProtocolFamily();
        PF_LOCAL = new ProtocolFamily();
        PF_UNIX = new ProtocolFamily();
        PF_INET = new ProtocolFamily();
        PF_IMPLINK = new ProtocolFamily();
        PF_PUP = new ProtocolFamily();
        PF_CHAOS = new ProtocolFamily();
        PF_NS = new ProtocolFamily();
        PF_ISO = new ProtocolFamily();
        PF_OSI = new ProtocolFamily();
        PF_ECMA = new ProtocolFamily();
        PF_DATAKIT = new ProtocolFamily();
        PF_CCITT = new ProtocolFamily();
        PF_SNA = new ProtocolFamily();
        PF_DECnet = new ProtocolFamily();
        PF_DLI = new ProtocolFamily();
        PF_LAT = new ProtocolFamily();
        PF_HYLINK = new ProtocolFamily();
        PF_APPLETALK = new ProtocolFamily();
        PF_ROUTE = new ProtocolFamily();
        PF_LINK = new ProtocolFamily();
        PF_XTP = new ProtocolFamily();
        PF_COIP = new ProtocolFamily();
        PF_CNT = new ProtocolFamily();
        PF_SIP = new ProtocolFamily();
        PF_IPX = new ProtocolFamily();
        PF_RTIP = new ProtocolFamily();
        PF_PIP = new ProtocolFamily();
        PF_NDRV = new ProtocolFamily();
        PF_ISDN = new ProtocolFamily();
        PF_KEY = new ProtocolFamily();
        PF_INET6 = new ProtocolFamily();
        PF_NATM = new ProtocolFamily();
        PF_SYSTEM = new ProtocolFamily();
        PF_NETBIOS = new ProtocolFamily();
        PF_PPP = new ProtocolFamily();
        PF_ATM = new ProtocolFamily();
        PF_NETGRAPH = new ProtocolFamily();
        PF_NETLINK = new ProtocolFamily();
        PF_RDS = new ProtocolFamily();
        PF_PPPOX = new ProtocolFamily();
        PF_LLC = new ProtocolFamily();
        PF_IB = new ProtocolFamily();
        PF_MPLS = new ProtocolFamily();
        PF_CAN = new ProtocolFamily();
        PF_TIPC = new ProtocolFamily();
        PF_BLUETOOTH = new ProtocolFamily();
        PF_ALG = new ProtocolFamily();
        PF_VSOCK = new ProtocolFamily();
        PF_KCM = new ProtocolFamily();
        PF_XDP = new ProtocolFamily();
        PF_MAX = new ProtocolFamily();
        __UNKNOWN_CONSTANT__ = new ProtocolFamily();
        ProtocolFamily[] protocolFamilyArray = new ProtocolFamily[53];
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
        protocolFamilyArray[52] = __UNKNOWN_CONSTANT__;
        $VALUES = protocolFamilyArray;
        resolver = ConstantResolver.getResolver(ProtocolFamily.class, 20000, 29999);
    }

    public final int value() {
        return (int)resolver.longValue(this);
    }

    public static ProtocolFamily valueOf(String name) {
        return Enum.valueOf(ProtocolFamily.class, name);
    }

    @Override
    public final int intValue() {
        return (int)resolver.longValue(this);
    }

    public static ProtocolFamily[] values() {
        return (ProtocolFamily[])$VALUES.clone();
    }

    @Override
    public final boolean defined() {
        return resolver.defined(this);
    }

    @Override
    public final long longValue() {
        return resolver.longValue(this);
    }

    public static ProtocolFamily valueOf(long value) {
        return resolver.valueOf(value);
    }

    public final String toString() {
        return this.description();
    }

    public final String description() {
        return resolver.description(this);
    }
}

