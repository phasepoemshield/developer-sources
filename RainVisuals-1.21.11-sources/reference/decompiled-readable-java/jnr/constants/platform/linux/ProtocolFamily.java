/*
 * Decompiled with CFR 0.152.
 */
package jnr.constants.platform.linux;

import java.util.EnumMap;
import java.util.Map;
import jnr.constants.Constant;

public final class ProtocolFamily
extends Enum<ProtocolFamily>
implements Constant {
    public static final /* enum */ ProtocolFamily PF_LLC;
    public static final /* enum */ ProtocolFamily PF_SNA;
    public static final /* enum */ ProtocolFamily PF_TIPC;
    public static final /* enum */ ProtocolFamily PF_MPLS;
    public static final long MAX_VALUE = 45L;
    public static final /* enum */ ProtocolFamily PF_RDS;
    public static final /* enum */ ProtocolFamily PF_NETLINK;
    public static final /* enum */ ProtocolFamily PF_BLUETOOTH;
    public static final /* enum */ ProtocolFamily PF_VSOCK;
    public static final /* enum */ ProtocolFamily PF_KCM;
    public static final /* enum */ ProtocolFamily PF_IPX;
    public static final /* enum */ ProtocolFamily PF_INET;
    public static final long MIN_VALUE = 0L;
    public static final /* enum */ ProtocolFamily PF_UNIX;
    public static final /* enum */ ProtocolFamily PF_ROUTE;
    public static final /* enum */ ProtocolFamily PF_APPLETALK;
    public static final /* enum */ ProtocolFamily PF_KEY;
    public static final /* enum */ ProtocolFamily PF_XDP;
    public static final /* enum */ ProtocolFamily PF_DECnet;
    public static final /* enum */ ProtocolFamily PF_MAX;
    public static final /* enum */ ProtocolFamily PF_CAN;
    public static final /* enum */ ProtocolFamily PF_LOCAL;
    private static final /* synthetic */ ProtocolFamily[] $VALUES;
    public static final /* enum */ ProtocolFamily PF_ISDN;
    private final long value;
    public static final /* enum */ ProtocolFamily PF_ALG;
    public static final /* enum */ ProtocolFamily PF_IB;
    public static final /* enum */ ProtocolFamily PF_UNSPEC;
    public static final /* enum */ ProtocolFamily PF_INET6;
    public static final /* enum */ ProtocolFamily PF_PPPOX;

    static {
        PF_UNSPEC = new ProtocolFamily(0L);
        PF_LOCAL = new ProtocolFamily(1L);
        PF_UNIX = new ProtocolFamily(1L);
        PF_INET = new ProtocolFamily(2L);
        PF_SNA = new ProtocolFamily(22L);
        PF_DECnet = new ProtocolFamily(12L);
        PF_APPLETALK = new ProtocolFamily(5L);
        PF_ROUTE = new ProtocolFamily(16L);
        PF_IPX = new ProtocolFamily(4L);
        PF_ISDN = new ProtocolFamily(34L);
        PF_KEY = new ProtocolFamily(15L);
        PF_INET6 = new ProtocolFamily(10L);
        PF_NETLINK = new ProtocolFamily(16L);
        PF_RDS = new ProtocolFamily(21L);
        PF_PPPOX = new ProtocolFamily(24L);
        PF_LLC = new ProtocolFamily(26L);
        PF_IB = new ProtocolFamily(27L);
        PF_MPLS = new ProtocolFamily(28L);
        PF_CAN = new ProtocolFamily(29L);
        PF_TIPC = new ProtocolFamily(30L);
        PF_BLUETOOTH = new ProtocolFamily(31L);
        PF_ALG = new ProtocolFamily(38L);
        PF_VSOCK = new ProtocolFamily(40L);
        PF_KCM = new ProtocolFamily(41L);
        PF_XDP = new ProtocolFamily(44L);
        PF_MAX = new ProtocolFamily(45L);
        ProtocolFamily[] protocolFamilyArray = new ProtocolFamily[26];
        protocolFamilyArray[0] = PF_UNSPEC;
        protocolFamilyArray[1] = PF_LOCAL;
        protocolFamilyArray[2] = PF_UNIX;
        protocolFamilyArray[3] = PF_INET;
        protocolFamilyArray[4] = PF_SNA;
        protocolFamilyArray[5] = PF_DECnet;
        protocolFamilyArray[6] = PF_APPLETALK;
        protocolFamilyArray[7] = PF_ROUTE;
        protocolFamilyArray[8] = PF_IPX;
        protocolFamilyArray[9] = PF_ISDN;
        protocolFamilyArray[10] = PF_KEY;
        protocolFamilyArray[11] = PF_INET6;
        protocolFamilyArray[12] = PF_NETLINK;
        protocolFamilyArray[13] = PF_RDS;
        protocolFamilyArray[14] = PF_PPPOX;
        protocolFamilyArray[15] = PF_LLC;
        protocolFamilyArray[16] = PF_IB;
        protocolFamilyArray[17] = PF_MPLS;
        protocolFamilyArray[18] = PF_CAN;
        protocolFamilyArray[19] = PF_TIPC;
        protocolFamilyArray[20] = PF_BLUETOOTH;
        protocolFamilyArray[21] = PF_ALG;
        protocolFamilyArray[22] = PF_VSOCK;
        protocolFamilyArray[23] = PF_KCM;
        protocolFamilyArray[24] = PF_XDP;
        protocolFamilyArray[25] = PF_MAX;
        $VALUES = protocolFamilyArray;
    }

    private ProtocolFamily(long value) {
        this.value = value;
    }

    @Override
    public final long longValue() {
        return this.value;
    }

    @Override
    public final int intValue() {
        return (int)this.value;
    }

    public final int value() {
        return (int)this.value;
    }

    public static ProtocolFamily[] values() {
        return (ProtocolFamily[])$VALUES.clone();
    }

    public final String toString() {
        return StringTable.descriptions.get(this);
    }

    public static ProtocolFamily valueOf(String name) {
        return Enum.valueOf(ProtocolFamily.class, name);
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
            map.put(PF_SNA, "PF_SNA");
            map.put(PF_DECnet, "PF_DECnet");
            map.put(PF_APPLETALK, "PF_APPLETALK");
            map.put(PF_ROUTE, "PF_ROUTE");
            map.put(PF_IPX, "PF_IPX");
            map.put(PF_ISDN, "PF_ISDN");
            map.put(PF_KEY, "PF_KEY");
            map.put(PF_INET6, "PF_INET6");
            map.put(PF_NETLINK, "PF_NETLINK");
            map.put(PF_RDS, "PF_RDS");
            map.put(PF_PPPOX, "PF_PPPOX");
            map.put(PF_LLC, "PF_LLC");
            map.put(PF_IB, "PF_IB");
            map.put(PF_MPLS, "PF_MPLS");
            map.put(PF_CAN, "PF_CAN");
            map.put(PF_TIPC, "PF_TIPC");
            map.put(PF_BLUETOOTH, "PF_BLUETOOTH");
            map.put(PF_ALG, "PF_ALG");
            map.put(PF_VSOCK, "PF_VSOCK");
            map.put(PF_KCM, "PF_KCM");
            map.put(PF_XDP, "PF_XDP");
            map.put(PF_MAX, "PF_MAX");
            return map;
        }

        StringTable() {
        }
    }
}

