/*
 * Decompiled with CFR 0.152.
 */
package jnr.constants.platform.linux.aarch64;

import java.util.EnumMap;
import java.util.Map;
import jnr.constants.Constant;

public final class AddressFamily
extends Enum<AddressFamily>
implements Constant {
    public static final /* enum */ AddressFamily AF_XDP;
    public static final /* enum */ AddressFamily AF_RDS;
    public static final /* enum */ AddressFamily AF_CAN;
    public static final /* enum */ AddressFamily AF_IPX;
    public static final /* enum */ AddressFamily AF_AX25;
    public static final /* enum */ AddressFamily AF_MAX;
    public static final /* enum */ AddressFamily AF_ISDN;
    public static final /* enum */ AddressFamily AF_MPLS;
    public static final /* enum */ AddressFamily AF_BLUETOOTH;
    public static final /* enum */ AddressFamily AF_LLC;
    public static final /* enum */ AddressFamily AF_ALG;
    public static final /* enum */ AddressFamily AF_SNA;
    public static final /* enum */ AddressFamily AF_IB;
    private final long value;
    public static final /* enum */ AddressFamily AF_ROUTE;
    public static final /* enum */ AddressFamily AF_KCM;
    public static final long MAX_VALUE = 45L;
    public static final /* enum */ AddressFamily AF_INET;
    public static final /* enum */ AddressFamily AF_PPPOX;
    public static final /* enum */ AddressFamily AF_TIPC;
    public static final /* enum */ AddressFamily AF_UNSPEC;
    public static final /* enum */ AddressFamily AF_DECnet;
    public static final /* enum */ AddressFamily AF_KEY;
    public static final /* enum */ AddressFamily AF_APPLETALK;
    public static final long MIN_VALUE = 0L;
    public static final /* enum */ AddressFamily AF_VSOCK;
    public static final /* enum */ AddressFamily AF_UNIX;
    public static final /* enum */ AddressFamily AF_INET6;
    public static final /* enum */ AddressFamily AF_LOCAL;
    private static final /* synthetic */ AddressFamily[] $VALUES;
    public static final /* enum */ AddressFamily AF_NETLINK;

    private AddressFamily(long value) {
        this.value = value;
    }

    static {
        AF_UNSPEC = new AddressFamily(0L);
        AF_LOCAL = new AddressFamily(1L);
        AF_UNIX = new AddressFamily(1L);
        AF_INET = new AddressFamily(2L);
        AF_SNA = new AddressFamily(22L);
        AF_DECnet = new AddressFamily(12L);
        AF_APPLETALK = new AddressFamily(5L);
        AF_ROUTE = new AddressFamily(16L);
        AF_IPX = new AddressFamily(4L);
        AF_ISDN = new AddressFamily(34L);
        AF_INET6 = new AddressFamily(10L);
        AF_AX25 = new AddressFamily(3L);
        AF_KEY = new AddressFamily(15L);
        AF_NETLINK = new AddressFamily(16L);
        AF_RDS = new AddressFamily(21L);
        AF_PPPOX = new AddressFamily(24L);
        AF_LLC = new AddressFamily(26L);
        AF_IB = new AddressFamily(27L);
        AF_MPLS = new AddressFamily(28L);
        AF_CAN = new AddressFamily(29L);
        AF_TIPC = new AddressFamily(30L);
        AF_BLUETOOTH = new AddressFamily(31L);
        AF_ALG = new AddressFamily(38L);
        AF_VSOCK = new AddressFamily(40L);
        AF_KCM = new AddressFamily(41L);
        AF_XDP = new AddressFamily(44L);
        AF_MAX = new AddressFamily(45L);
        AddressFamily[] addressFamilyArray = new AddressFamily[27];
        addressFamilyArray[0] = AF_UNSPEC;
        addressFamilyArray[1] = AF_LOCAL;
        addressFamilyArray[2] = AF_UNIX;
        addressFamilyArray[3] = AF_INET;
        addressFamilyArray[4] = AF_SNA;
        addressFamilyArray[5] = AF_DECnet;
        addressFamilyArray[6] = AF_APPLETALK;
        addressFamilyArray[7] = AF_ROUTE;
        addressFamilyArray[8] = AF_IPX;
        addressFamilyArray[9] = AF_ISDN;
        addressFamilyArray[10] = AF_INET6;
        addressFamilyArray[11] = AF_AX25;
        addressFamilyArray[12] = AF_KEY;
        addressFamilyArray[13] = AF_NETLINK;
        addressFamilyArray[14] = AF_RDS;
        addressFamilyArray[15] = AF_PPPOX;
        addressFamilyArray[16] = AF_LLC;
        addressFamilyArray[17] = AF_IB;
        addressFamilyArray[18] = AF_MPLS;
        addressFamilyArray[19] = AF_CAN;
        addressFamilyArray[20] = AF_TIPC;
        addressFamilyArray[21] = AF_BLUETOOTH;
        addressFamilyArray[22] = AF_ALG;
        addressFamilyArray[23] = AF_VSOCK;
        addressFamilyArray[24] = AF_KCM;
        addressFamilyArray[25] = AF_XDP;
        addressFamilyArray[26] = AF_MAX;
        $VALUES = addressFamilyArray;
    }

    public static AddressFamily valueOf(String name) {
        return Enum.valueOf(AddressFamily.class, name);
    }

    @Override
    public final long longValue() {
        return this.value;
    }

    @Override
    public final int intValue() {
        return (int)this.value;
    }

    public static AddressFamily[] values() {
        return (AddressFamily[])$VALUES.clone();
    }

    @Override
    public final boolean defined() {
        return true;
    }

    public final int value() {
        return (int)this.value;
    }

    public final String toString() {
        return StringTable.descriptions.get(this);
    }

    static final class StringTable {
        public static final Map<AddressFamily, String> descriptions = StringTable.generateTable();

        StringTable() {
        }

        public static final Map<AddressFamily, String> generateTable() {
            EnumMap<AddressFamily, String> map = new EnumMap<AddressFamily, String>(AddressFamily.class);
            map.put(AF_UNSPEC, "AF_UNSPEC");
            map.put(AF_LOCAL, "AF_LOCAL");
            map.put(AF_UNIX, "AF_UNIX");
            map.put(AF_INET, "AF_INET");
            map.put(AF_SNA, "AF_SNA");
            map.put(AF_DECnet, "AF_DECnet");
            map.put(AF_APPLETALK, "AF_APPLETALK");
            map.put(AF_ROUTE, "AF_ROUTE");
            map.put(AF_IPX, "AF_IPX");
            map.put(AF_ISDN, "AF_ISDN");
            map.put(AF_INET6, "AF_INET6");
            map.put(AF_AX25, "AF_AX25");
            map.put(AF_KEY, "AF_KEY");
            map.put(AF_NETLINK, "AF_NETLINK");
            map.put(AF_RDS, "AF_RDS");
            map.put(AF_PPPOX, "AF_PPPOX");
            map.put(AF_LLC, "AF_LLC");
            map.put(AF_IB, "AF_IB");
            map.put(AF_MPLS, "AF_MPLS");
            map.put(AF_CAN, "AF_CAN");
            map.put(AF_TIPC, "AF_TIPC");
            map.put(AF_BLUETOOTH, "AF_BLUETOOTH");
            map.put(AF_ALG, "AF_ALG");
            map.put(AF_VSOCK, "AF_VSOCK");
            map.put(AF_KCM, "AF_KCM");
            map.put(AF_XDP, "AF_XDP");
            map.put(AF_MAX, "AF_MAX");
            return map;
        }
    }
}

