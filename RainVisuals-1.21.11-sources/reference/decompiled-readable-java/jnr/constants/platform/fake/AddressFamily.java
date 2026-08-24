/*
 * Decompiled with CFR 0.152.
 */
package jnr.constants.platform.fake;

import jnr.constants.Constant;

public final class AddressFamily
extends Enum<AddressFamily>
implements Constant {
    public static final /* enum */ AddressFamily pseudo_AF_XTP;
    public static final long MIN_VALUE = 1L;
    public static final /* enum */ AddressFamily AF_INET;
    private static final /* synthetic */ AddressFamily[] $VALUES;
    public static final /* enum */ AddressFamily AF_DATAKIT;
    public static final /* enum */ AddressFamily AF_ALG;
    public static final /* enum */ AddressFamily AF_PUP;
    public static final /* enum */ AddressFamily AF_IMPLINK;
    public static final /* enum */ AddressFamily AF_COIP;
    public static final /* enum */ AddressFamily AF_SYSTEM;
    public static final /* enum */ AddressFamily AF_ECMA;
    public static final /* enum */ AddressFamily AF_CAN;
    public static final long MAX_VALUE = 56L;
    public static final /* enum */ AddressFamily AF_INET6;
    public static final /* enum */ AddressFamily AF_DLI;
    public static final /* enum */ AddressFamily AF_PPP;
    public static final /* enum */ AddressFamily AF_SNA;
    public static final /* enum */ AddressFamily AF_TIPC;
    public static final /* enum */ AddressFamily AF_IB;
    public static final /* enum */ AddressFamily AF_MPLS;
    public static final /* enum */ AddressFamily AF_AX25;
    public static final /* enum */ AddressFamily AF_NATM;
    public static final /* enum */ AddressFamily AF_OSI;
    public static final /* enum */ AddressFamily pseudo_AF_HDRCMPLT;
    public static final /* enum */ AddressFamily AF_ROUTE;
    public static final /* enum */ AddressFamily AF_SIP;
    public static final /* enum */ AddressFamily AF_LLC;
    public static final /* enum */ AddressFamily AF_RDS;
    public static final /* enum */ AddressFamily AF_LOCAL;
    public static final /* enum */ AddressFamily pseudo_AF_RTIP;
    public static final /* enum */ AddressFamily AF_CNT;
    public static final /* enum */ AddressFamily AF_NS;
    public static final /* enum */ AddressFamily AF_CHAOS;
    public static final /* enum */ AddressFamily AF_CCITT;
    public static final /* enum */ AddressFamily pseudo_AF_PIP;
    public static final /* enum */ AddressFamily AF_KEY;
    public static final /* enum */ AddressFamily AF_ISO;
    public static final /* enum */ AddressFamily AF_BLUETOOTH;
    public static final /* enum */ AddressFamily AF_NETLINK;
    public static final /* enum */ AddressFamily AF_NDRV;
    public static final /* enum */ AddressFamily pseudo_AF_KEY;
    public static final /* enum */ AddressFamily AF_IPX;
    public static final /* enum */ AddressFamily AF_LAT;
    public static final /* enum */ AddressFamily AF_MAX;
    public static final /* enum */ AddressFamily AF_XDP;
    private final long value;
    public static final /* enum */ AddressFamily AF_HYLINK;
    public static final /* enum */ AddressFamily AF_DECnet;
    public static final /* enum */ AddressFamily AF_UNIX;
    public static final /* enum */ AddressFamily AF_UNSPEC;
    public static final /* enum */ AddressFamily AF_NETGRAPH;
    public static final /* enum */ AddressFamily AF_PPPOX;
    public static final /* enum */ AddressFamily AF_APPLETALK;
    public static final /* enum */ AddressFamily AF_KCM;
    public static final /* enum */ AddressFamily AF_NETBIOS;
    public static final /* enum */ AddressFamily AF_E164;
    public static final /* enum */ AddressFamily AF_VSOCK;
    public static final /* enum */ AddressFamily AF_ATM;
    public static final /* enum */ AddressFamily AF_ISDN;
    public static final /* enum */ AddressFamily AF_LINK;

    public final int value() {
        return (int)this.value;
    }

    public static AddressFamily[] values() {
        return (AddressFamily[])$VALUES.clone();
    }

    @Override
    public final long longValue() {
        return this.value;
    }

    private AddressFamily(long value) {
        this.value = value;
    }

    @Override
    public final int intValue() {
        return (int)this.value;
    }

    static {
        AF_UNSPEC = new AddressFamily(1L);
        AF_LOCAL = new AddressFamily(2L);
        AF_UNIX = new AddressFamily(3L);
        AF_INET = new AddressFamily(4L);
        AF_IMPLINK = new AddressFamily(5L);
        AF_PUP = new AddressFamily(6L);
        AF_CHAOS = new AddressFamily(7L);
        AF_NS = new AddressFamily(8L);
        AF_ISO = new AddressFamily(9L);
        AF_OSI = new AddressFamily(10L);
        AF_ECMA = new AddressFamily(11L);
        AF_DATAKIT = new AddressFamily(12L);
        AF_CCITT = new AddressFamily(13L);
        AF_SNA = new AddressFamily(14L);
        AF_DECnet = new AddressFamily(15L);
        AF_DLI = new AddressFamily(16L);
        AF_LAT = new AddressFamily(17L);
        AF_HYLINK = new AddressFamily(18L);
        AF_APPLETALK = new AddressFamily(19L);
        AF_ROUTE = new AddressFamily(20L);
        AF_LINK = new AddressFamily(21L);
        pseudo_AF_XTP = new AddressFamily(22L);
        AF_COIP = new AddressFamily(23L);
        AF_CNT = new AddressFamily(24L);
        pseudo_AF_RTIP = new AddressFamily(25L);
        AF_IPX = new AddressFamily(26L);
        AF_SIP = new AddressFamily(27L);
        pseudo_AF_PIP = new AddressFamily(28L);
        AF_NDRV = new AddressFamily(29L);
        AF_ISDN = new AddressFamily(30L);
        AF_E164 = new AddressFamily(31L);
        pseudo_AF_KEY = new AddressFamily(32L);
        AF_INET6 = new AddressFamily(33L);
        AF_NATM = new AddressFamily(34L);
        AF_SYSTEM = new AddressFamily(35L);
        AF_NETBIOS = new AddressFamily(36L);
        AF_PPP = new AddressFamily(37L);
        AF_ATM = new AddressFamily(38L);
        pseudo_AF_HDRCMPLT = new AddressFamily(39L);
        AF_NETGRAPH = new AddressFamily(40L);
        AF_AX25 = new AddressFamily(41L);
        AF_KEY = new AddressFamily(42L);
        AF_NETLINK = new AddressFamily(43L);
        AF_RDS = new AddressFamily(44L);
        AF_PPPOX = new AddressFamily(45L);
        AF_LLC = new AddressFamily(46L);
        AF_IB = new AddressFamily(47L);
        AF_MPLS = new AddressFamily(48L);
        AF_CAN = new AddressFamily(49L);
        AF_TIPC = new AddressFamily(50L);
        AF_BLUETOOTH = new AddressFamily(51L);
        AF_ALG = new AddressFamily(52L);
        AF_VSOCK = new AddressFamily(53L);
        AF_KCM = new AddressFamily(54L);
        AF_XDP = new AddressFamily(55L);
        AF_MAX = new AddressFamily(56L);
        AddressFamily[] addressFamilyArray = new AddressFamily[56];
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
        $VALUES = addressFamilyArray;
    }

    @Override
    public final boolean defined() {
        return true;
    }

    public static AddressFamily valueOf(String name) {
        return Enum.valueOf(AddressFamily.class, name);
    }
}

