/*
 * Decompiled with CFR 0.152.
 */
package jnr.constants.platform;

import jnr.constants.Constant;
import jnr.constants.platform.ConstantResolver;

public final class AddressFamily
extends Enum<AddressFamily>
implements Constant {
    public static final /* enum */ AddressFamily AF_KCM;
    public static final /* enum */ AddressFamily AF_KEY;
    public static final /* enum */ AddressFamily AF_IMPLINK;
    public static final /* enum */ AddressFamily AF_CCITT;
    public static final /* enum */ AddressFamily AF_NS;
    public static final /* enum */ AddressFamily AF_INET6;
    public static final /* enum */ AddressFamily AF_NETGRAPH;
    public static final /* enum */ AddressFamily AF_CAN;
    public static final /* enum */ AddressFamily AF_ROUTE;
    public static final /* enum */ AddressFamily AF_ATM;
    public static final /* enum */ AddressFamily AF_AX25;
    public static final /* enum */ AddressFamily AF_PUP;
    public static final /* enum */ AddressFamily AF_NETBIOS;
    public static final /* enum */ AddressFamily AF_SNA;
    public static final /* enum */ AddressFamily pseudo_AF_XTP;
    public static final /* enum */ AddressFamily AF_MPLS;
    public static final /* enum */ AddressFamily AF_ISDN;
    public static final /* enum */ AddressFamily AF_BLUETOOTH;
    public static final /* enum */ AddressFamily AF_LLC;
    public static final /* enum */ AddressFamily __UNKNOWN_CONSTANT__;
    private static final ConstantResolver<AddressFamily> resolver;
    public static final /* enum */ AddressFamily AF_CHAOS;
    public static final /* enum */ AddressFamily AF_ECMA;
    public static final /* enum */ AddressFamily AF_DLI;
    public static final /* enum */ AddressFamily AF_TIPC;
    public static final /* enum */ AddressFamily AF_LAT;
    public static final /* enum */ AddressFamily AF_PPP;
    public static final /* enum */ AddressFamily AF_MAX;
    public static final /* enum */ AddressFamily AF_E164;
    public static final /* enum */ AddressFamily AF_UNIX;
    public static final /* enum */ AddressFamily AF_APPLETALK;
    public static final /* enum */ AddressFamily AF_CNT;
    public static final /* enum */ AddressFamily AF_SIP;
    public static final /* enum */ AddressFamily AF_NDRV;
    public static final /* enum */ AddressFamily AF_OSI;
    public static final /* enum */ AddressFamily AF_PPPOX;
    public static final /* enum */ AddressFamily pseudo_AF_HDRCMPLT;
    public static final /* enum */ AddressFamily AF_NETLINK;
    public static final /* enum */ AddressFamily AF_SYSTEM;
    public static final /* enum */ AddressFamily AF_LINK;
    public static final /* enum */ AddressFamily AF_UNSPEC;
    public static final /* enum */ AddressFamily AF_HYLINK;
    public static final /* enum */ AddressFamily pseudo_AF_RTIP;
    public static final /* enum */ AddressFamily AF_VSOCK;
    private static final /* synthetic */ AddressFamily[] $VALUES;
    public static final /* enum */ AddressFamily AF_ISO;
    public static final /* enum */ AddressFamily AF_IB;
    public static final /* enum */ AddressFamily AF_IPX;
    public static final /* enum */ AddressFamily AF_COIP;
    public static final /* enum */ AddressFamily AF_ALG;
    public static final /* enum */ AddressFamily AF_INET;
    public static final /* enum */ AddressFamily AF_DATAKIT;
    public static final /* enum */ AddressFamily pseudo_AF_KEY;
    public static final /* enum */ AddressFamily AF_XDP;
    public static final /* enum */ AddressFamily AF_DECnet;
    public static final /* enum */ AddressFamily pseudo_AF_PIP;
    public static final /* enum */ AddressFamily AF_NATM;
    public static final /* enum */ AddressFamily AF_RDS;
    public static final /* enum */ AddressFamily AF_LOCAL;

    public final int value() {
        return (int)resolver.longValue(this);
    }

    static {
        AF_UNSPEC = new AddressFamily();
        AF_LOCAL = new AddressFamily();
        AF_UNIX = new AddressFamily();
        AF_INET = new AddressFamily();
        AF_IMPLINK = new AddressFamily();
        AF_PUP = new AddressFamily();
        AF_CHAOS = new AddressFamily();
        AF_NS = new AddressFamily();
        AF_ISO = new AddressFamily();
        AF_OSI = new AddressFamily();
        AF_ECMA = new AddressFamily();
        AF_DATAKIT = new AddressFamily();
        AF_CCITT = new AddressFamily();
        AF_SNA = new AddressFamily();
        AF_DECnet = new AddressFamily();
        AF_DLI = new AddressFamily();
        AF_LAT = new AddressFamily();
        AF_HYLINK = new AddressFamily();
        AF_APPLETALK = new AddressFamily();
        AF_ROUTE = new AddressFamily();
        AF_LINK = new AddressFamily();
        pseudo_AF_XTP = new AddressFamily();
        AF_COIP = new AddressFamily();
        AF_CNT = new AddressFamily();
        pseudo_AF_RTIP = new AddressFamily();
        AF_IPX = new AddressFamily();
        AF_SIP = new AddressFamily();
        pseudo_AF_PIP = new AddressFamily();
        AF_NDRV = new AddressFamily();
        AF_ISDN = new AddressFamily();
        AF_E164 = new AddressFamily();
        pseudo_AF_KEY = new AddressFamily();
        AF_INET6 = new AddressFamily();
        AF_NATM = new AddressFamily();
        AF_SYSTEM = new AddressFamily();
        AF_NETBIOS = new AddressFamily();
        AF_PPP = new AddressFamily();
        AF_ATM = new AddressFamily();
        pseudo_AF_HDRCMPLT = new AddressFamily();
        AF_NETGRAPH = new AddressFamily();
        AF_AX25 = new AddressFamily();
        AF_KEY = new AddressFamily();
        AF_NETLINK = new AddressFamily();
        AF_RDS = new AddressFamily();
        AF_PPPOX = new AddressFamily();
        AF_LLC = new AddressFamily();
        AF_IB = new AddressFamily();
        AF_MPLS = new AddressFamily();
        AF_CAN = new AddressFamily();
        AF_TIPC = new AddressFamily();
        AF_BLUETOOTH = new AddressFamily();
        AF_ALG = new AddressFamily();
        AF_VSOCK = new AddressFamily();
        AF_KCM = new AddressFamily();
        AF_XDP = new AddressFamily();
        AF_MAX = new AddressFamily();
        __UNKNOWN_CONSTANT__ = new AddressFamily();
        AddressFamily[] addressFamilyArray = new AddressFamily[57];
        addressFamilyArray[0] = AF_UNSPEC;
        addressFamilyArray[1] = AF_LOCAL;
        addressFamilyArray[2] = AF_UNIX;
        addressFamilyArray[3] = AF_INET;
        addressFamilyArray[4] = AF_IMPLINK;
        addressFamilyArray[5] = AF_PUP;
        addressFamilyArray[6] = AF_CHAOS;
        addressFamilyArray[7] = AF_NS;
        addressFamilyArray[8] = AF_ISO;
        addressFamilyArray[9] = AF_OSI;
        addressFamilyArray[10] = AF_ECMA;
        addressFamilyArray[11] = AF_DATAKIT;
        addressFamilyArray[12] = AF_CCITT;
        addressFamilyArray[13] = AF_SNA;
        addressFamilyArray[14] = AF_DECnet;
        addressFamilyArray[15] = AF_DLI;
        addressFamilyArray[16] = AF_LAT;
        addressFamilyArray[17] = AF_HYLINK;
        addressFamilyArray[18] = AF_APPLETALK;
        addressFamilyArray[19] = AF_ROUTE;
        addressFamilyArray[20] = AF_LINK;
        addressFamilyArray[21] = pseudo_AF_XTP;
        addressFamilyArray[22] = AF_COIP;
        addressFamilyArray[23] = AF_CNT;
        addressFamilyArray[24] = pseudo_AF_RTIP;
        addressFamilyArray[25] = AF_IPX;
        addressFamilyArray[26] = AF_SIP;
        addressFamilyArray[27] = pseudo_AF_PIP;
        addressFamilyArray[28] = AF_NDRV;
        addressFamilyArray[29] = AF_ISDN;
        addressFamilyArray[30] = AF_E164;
        addressFamilyArray[31] = pseudo_AF_KEY;
        addressFamilyArray[32] = AF_INET6;
        addressFamilyArray[33] = AF_NATM;
        addressFamilyArray[34] = AF_SYSTEM;
        addressFamilyArray[35] = AF_NETBIOS;
        addressFamilyArray[36] = AF_PPP;
        addressFamilyArray[37] = AF_ATM;
        addressFamilyArray[38] = pseudo_AF_HDRCMPLT;
        addressFamilyArray[39] = AF_NETGRAPH;
        addressFamilyArray[40] = AF_AX25;
        addressFamilyArray[41] = AF_KEY;
        addressFamilyArray[42] = AF_NETLINK;
        addressFamilyArray[43] = AF_RDS;
        addressFamilyArray[44] = AF_PPPOX;
        addressFamilyArray[45] = AF_LLC;
        addressFamilyArray[46] = AF_IB;
        addressFamilyArray[47] = AF_MPLS;
        addressFamilyArray[48] = AF_CAN;
        addressFamilyArray[49] = AF_TIPC;
        addressFamilyArray[50] = AF_BLUETOOTH;
        addressFamilyArray[51] = AF_ALG;
        addressFamilyArray[52] = AF_VSOCK;
        addressFamilyArray[53] = AF_KCM;
        addressFamilyArray[54] = AF_XDP;
        addressFamilyArray[55] = AF_MAX;
        addressFamilyArray[56] = __UNKNOWN_CONSTANT__;
        $VALUES = addressFamilyArray;
        resolver = ConstantResolver.getResolver(AddressFamily.class, 20000, 29999);
    }

    public static AddressFamily[] values() {
        return (AddressFamily[])$VALUES.clone();
    }

    @Override
    public final long longValue() {
        return resolver.longValue(this);
    }

    @Override
    public final int intValue() {
        return (int)resolver.longValue(this);
    }

    public static AddressFamily valueOf(long value) {
        return resolver.valueOf(value);
    }

    public final String description() {
        return resolver.description(this);
    }

    public final String toString() {
        return this.description();
    }

    public static AddressFamily valueOf(String name) {
        return Enum.valueOf(AddressFamily.class, name);
    }

    @Override
    public final boolean defined() {
        return resolver.defined(this);
    }
}

