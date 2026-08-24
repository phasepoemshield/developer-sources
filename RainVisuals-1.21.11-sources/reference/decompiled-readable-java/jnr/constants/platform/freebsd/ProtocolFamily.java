/*
 * Decompiled with CFR 0.152.
 */
package jnr.constants.platform.freebsd;

import java.util.EnumMap;
import java.util.Map;
import jnr.constants.Constant;

public final class ProtocolFamily
extends Enum<ProtocolFamily>
implements Constant {
    public static final /* enum */ ProtocolFamily PF_DECnet;
    public static final /* enum */ ProtocolFamily PF_APPLETALK;
    public static final /* enum */ ProtocolFamily PF_HYLINK;
    public static final /* enum */ ProtocolFamily PF_SIP;
    public static final /* enum */ ProtocolFamily PF_RTIP;
    public static final /* enum */ ProtocolFamily PF_XTP;
    public static final /* enum */ ProtocolFamily PF_CHAOS;
    public static final /* enum */ ProtocolFamily PF_UNSPEC;
    public static final /* enum */ ProtocolFamily PF_UNIX;
    public static final /* enum */ ProtocolFamily PF_CNT;
    public static final /* enum */ ProtocolFamily PF_OSI;
    public static final /* enum */ ProtocolFamily PF_ROUTE;
    public static final /* enum */ ProtocolFamily PF_KEY;
    public static final /* enum */ ProtocolFamily PF_CCITT;
    public static final /* enum */ ProtocolFamily PF_DLI;
    public static final /* enum */ ProtocolFamily PF_INET;
    public static final /* enum */ ProtocolFamily PF_LAT;
    public static final /* enum */ ProtocolFamily PF_ISDN;
    public static final long MAX_VALUE = 43L;
    public static final /* enum */ ProtocolFamily PF_ISO;
    public static final /* enum */ ProtocolFamily PF_NETGRAPH;
    public static final /* enum */ ProtocolFamily PF_PIP;
    public static final /* enum */ ProtocolFamily PF_LINK;
    public static final /* enum */ ProtocolFamily PF_SNA;
    public static final /* enum */ ProtocolFamily PF_ATM;
    public static final /* enum */ ProtocolFamily PF_IPX;
    private static final /* synthetic */ ProtocolFamily[] $VALUES;
    public static final /* enum */ ProtocolFamily PF_PUP;
    public static final /* enum */ ProtocolFamily PF_NETBIOS;
    public static final /* enum */ ProtocolFamily PF_ECMA;
    public static final /* enum */ ProtocolFamily PF_IMPLINK;
    public static final /* enum */ ProtocolFamily PF_MAX;
    public static final /* enum */ ProtocolFamily PF_INET6;
    public static final /* enum */ ProtocolFamily PF_COIP;
    public static final long MIN_VALUE = 0L;
    private final long value;
    public static final /* enum */ ProtocolFamily PF_DATAKIT;
    public static final /* enum */ ProtocolFamily PF_LOCAL;
    public static final /* enum */ ProtocolFamily PF_NATM;

    @Override
    public final long longValue() {
        return this.value;
    }

    public static ProtocolFamily[] values() {
        return (ProtocolFamily[])$VALUES.clone();
    }

    public final String toString() {
        return StringTable.descriptions.get(this);
    }

    private ProtocolFamily(long value) {
        this.value = value;
    }

    public static ProtocolFamily valueOf(String name) {
        return Enum.valueOf(ProtocolFamily.class, name);
    }

    @Override
    public final int intValue() {
        return (int)this.value;
    }

    static {
        PF_UNSPEC = new ProtocolFamily(0L);
        PF_LOCAL = new ProtocolFamily(1L);
        PF_UNIX = new ProtocolFamily(1L);
        PF_INET = new ProtocolFamily(2L);
        PF_IMPLINK = new ProtocolFamily(3L);
        PF_PUP = new ProtocolFamily(4L);
        PF_CHAOS = new ProtocolFamily(5L);
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
        PF_COIP = new ProtocolFamily(20L);
        PF_CNT = new ProtocolFamily(21L);
        PF_SIP = new ProtocolFamily(24L);
        PF_IPX = new ProtocolFamily(23L);
        PF_RTIP = new ProtocolFamily(22L);
        PF_PIP = new ProtocolFamily(25L);
        PF_ISDN = new ProtocolFamily(26L);
        PF_KEY = new ProtocolFamily(27L);
        PF_INET6 = new ProtocolFamily(28L);
        PF_NATM = new ProtocolFamily(29L);
        PF_NETBIOS = new ProtocolFamily(6L);
        PF_ATM = new ProtocolFamily(30L);
        PF_NETGRAPH = new ProtocolFamily(32L);
        PF_MAX = new ProtocolFamily(43L);
        ProtocolFamily[] protocolFamilyArray = new ProtocolFamily[35];
        protocolFamilyArray[0] = PF_UNSPEC;
        protocolFamilyArray[1] = PF_LOCAL;
        protocolFamilyArray[2] = PF_UNIX;
        protocolFamilyArray[3] = PF_INET;
        protocolFamilyArray[4] = PF_IMPLINK;
        protocolFamilyArray[5] = PF_PUP;
        protocolFamilyArray[6] = PF_CHAOS;
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
        protocolFamilyArray[21] = PF_COIP;
        protocolFamilyArray[22] = PF_CNT;
        protocolFamilyArray[23] = PF_SIP;
        protocolFamilyArray[24] = PF_IPX;
        protocolFamilyArray[25] = PF_RTIP;
        protocolFamilyArray[26] = PF_PIP;
        protocolFamilyArray[27] = PF_ISDN;
        protocolFamilyArray[28] = PF_KEY;
        protocolFamilyArray[29] = PF_INET6;
        protocolFamilyArray[30] = PF_NATM;
        protocolFamilyArray[31] = PF_NETBIOS;
        protocolFamilyArray[32] = PF_ATM;
        protocolFamilyArray[33] = PF_NETGRAPH;
        protocolFamilyArray[34] = PF_MAX;
        $VALUES = protocolFamilyArray;
    }

    public final int value() {
        return (int)this.value;
    }

    @Override
    public final boolean defined() {
        return true;
    }

    static final class StringTable {
        public static final Map<ProtocolFamily, String> descriptions = StringTable.generateTable();

        public static final Map<ProtocolFamily, String> generateTable() {
            EnumMap<ProtocolFamily, String> map = new EnumMap<ProtocolFamily, String>(ProtocolFamily.class);
            map.put(PF_UNSPEC, "PF_UNSPEC");
            map.put(PF_LOCAL, "PF_LOCAL");
            map.put(PF_UNIX, "PF_UNIX");
            map.put(PF_INET, "PF_INET");
            map.put(PF_IMPLINK, "PF_IMPLINK");
            map.put(PF_PUP, "PF_PUP");
            map.put(PF_CHAOS, "PF_CHAOS");
            map.put(PF_ISO, "PF_ISO");
            map.put(PF_OSI, "PF_OSI");
            map.put(PF_ECMA, "PF_ECMA");
            map.put(PF_DATAKIT, "PF_DATAKIT");
            map.put(PF_CCITT, "PF_CCITT");
            map.put(PF_SNA, "PF_SNA");
            map.put(PF_DECnet, "PF_DECnet");
            map.put(PF_DLI, "PF_DLI");
            map.put(PF_LAT, "PF_LAT");
            map.put(PF_HYLINK, "PF_HYLINK");
            map.put(PF_APPLETALK, "PF_APPLETALK");
            map.put(PF_ROUTE, "PF_ROUTE");
            map.put(PF_LINK, "PF_LINK");
            map.put(PF_XTP, "PF_XTP");
            map.put(PF_COIP, "PF_COIP");
            map.put(PF_CNT, "PF_CNT");
            map.put(PF_SIP, "PF_SIP");
            map.put(PF_IPX, "PF_IPX");
            map.put(PF_RTIP, "PF_RTIP");
            map.put(PF_PIP, "PF_PIP");
            map.put(PF_ISDN, "PF_ISDN");
            map.put(PF_KEY, "PF_KEY");
            map.put(PF_INET6, "PF_INET6");
            map.put(PF_NATM, "PF_NATM");
            map.put(PF_NETBIOS, "PF_NETBIOS");
            map.put(PF_ATM, "PF_ATM");
            map.put(PF_NETGRAPH, "PF_NETGRAPH");
            map.put(PF_MAX, "PF_MAX");
            return map;
        }

        StringTable() {
        }
    }
}

