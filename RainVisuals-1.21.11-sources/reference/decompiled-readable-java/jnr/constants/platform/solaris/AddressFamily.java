/*
 * Decompiled with CFR 0.152.
 */
package jnr.constants.platform.solaris;

import java.util.EnumMap;
import java.util.Map;
import jnr.constants.Constant;

public final class AddressFamily
extends Enum<AddressFamily>
implements Constant {
    public static final /* enum */ AddressFamily AF_NS;
    public static final /* enum */ AddressFamily AF_NETLINK;
    public static final /* enum */ AddressFamily AF_HYLINK;
    public static final /* enum */ AddressFamily AF_KEY;
    public static final /* enum */ AddressFamily AF_CCITT;
    public static final /* enum */ AddressFamily AF_UNIX;
    public static final /* enum */ AddressFamily AF_MAX;
    public static final /* enum */ AddressFamily AF_IPX;
    public static final long MAX_VALUE = 34L;
    public static final /* enum */ AddressFamily AF_INET;
    public static final /* enum */ AddressFamily AF_DECnet;
    public static final long MIN_VALUE = 0L;
    public static final /* enum */ AddressFamily AF_SNA;
    public static final /* enum */ AddressFamily AF_LAT;
    public static final /* enum */ AddressFamily AF_DLI;
    public static final /* enum */ AddressFamily AF_PUP;
    public static final /* enum */ AddressFamily AF_DATAKIT;
    private static final /* synthetic */ AddressFamily[] $VALUES;
    public static final /* enum */ AddressFamily AF_APPLETALK;
    public static final /* enum */ AddressFamily AF_ROUTE;
    private final long value;
    public static final /* enum */ AddressFamily AF_UNSPEC;
    public static final /* enum */ AddressFamily AF_INET6;
    public static final /* enum */ AddressFamily AF_OSI;
    public static final /* enum */ AddressFamily AF_ECMA;
    public static final /* enum */ AddressFamily AF_LINK;
    public static final /* enum */ AddressFamily AF_CHAOS;
    public static final /* enum */ AddressFamily AF_LOCAL;
    public static final /* enum */ AddressFamily AF_IMPLINK;

    public final int value() {
        return (int)this.value;
    }

    private AddressFamily(long value) {
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

    @Override
    public final boolean defined() {
        return true;
    }

    public final String toString() {
        return StringTable.descriptions.get(this);
    }

    public static AddressFamily valueOf(String name) {
        return Enum.valueOf(AddressFamily.class, name);
    }

    static {
        AF_UNSPEC = new AddressFamily(0L);
        AF_LOCAL = new AddressFamily(1L);
        AF_UNIX = new AddressFamily(1L);
        AF_INET = new AddressFamily(2L);
        AF_IMPLINK = new AddressFamily(3L);
        AF_PUP = new AddressFamily(4L);
        AF_CHAOS = new AddressFamily(5L);
        AF_NS = new AddressFamily(6L);
        AF_OSI = new AddressFamily(19L);
        AF_ECMA = new AddressFamily(8L);
        AF_DATAKIT = new AddressFamily(9L);
        AF_CCITT = new AddressFamily(10L);
        AF_SNA = new AddressFamily(11L);
        AF_DECnet = new AddressFamily(12L);
        AF_DLI = new AddressFamily(13L);
        AF_LAT = new AddressFamily(14L);
        AF_HYLINK = new AddressFamily(15L);
        AF_APPLETALK = new AddressFamily(16L);
        AF_ROUTE = new AddressFamily(24L);
        AF_LINK = new AddressFamily(25L);
        AF_IPX = new AddressFamily(23L);
        AF_INET6 = new AddressFamily(26L);
        AF_KEY = new AddressFamily(27L);
        AF_NETLINK = new AddressFamily(34L);
        AF_MAX = new AddressFamily(34L);
        AddressFamily[] addressFamilyArray = new AddressFamily[25];
        addressFamilyArray[0] = AF_UNSPEC;
        addressFamilyArray[1] = AF_LOCAL;
        addressFamilyArray[2] = AF_UNIX;
        addressFamilyArray[3] = AF_INET;
        addressFamilyArray[4] = AF_IMPLINK;
        addressFamilyArray[5] = AF_PUP;
        addressFamilyArray[6] = AF_CHAOS;
        addressFamilyArray[7] = AF_NS;
        addressFamilyArray[8] = AF_OSI;
        addressFamilyArray[9] = AF_ECMA;
        addressFamilyArray[10] = AF_DATAKIT;
        addressFamilyArray[11] = AF_CCITT;
        addressFamilyArray[12] = AF_SNA;
        addressFamilyArray[13] = AF_DECnet;
        addressFamilyArray[14] = AF_DLI;
        addressFamilyArray[15] = AF_LAT;
        addressFamilyArray[16] = AF_HYLINK;
        addressFamilyArray[17] = AF_APPLETALK;
        addressFamilyArray[18] = AF_ROUTE;
        addressFamilyArray[19] = AF_LINK;
        addressFamilyArray[20] = AF_IPX;
        addressFamilyArray[21] = AF_INET6;
        addressFamilyArray[22] = AF_KEY;
        addressFamilyArray[23] = AF_NETLINK;
        addressFamilyArray[24] = AF_MAX;
        $VALUES = addressFamilyArray;
    }

    public static AddressFamily[] values() {
        return (AddressFamily[])$VALUES.clone();
    }

    static final class StringTable {
        public static final Map<AddressFamily, String> descriptions = StringTable.generateTable();

        public static final Map<AddressFamily, String> generateTable() {
            EnumMap<AddressFamily, String> map = new EnumMap<AddressFamily, String>(AddressFamily.class);
            map.put(AF_UNSPEC, "AF_UNSPEC");
            map.put(AF_LOCAL, "AF_LOCAL");
            map.put(AF_UNIX, "AF_UNIX");
            map.put(AF_INET, "AF_INET");
            map.put(AF_IMPLINK, "AF_IMPLINK");
            map.put(AF_PUP, "AF_PUP");
            map.put(AF_CHAOS, "AF_CHAOS");
            map.put(AF_NS, "AF_NS");
            map.put(AF_OSI, "AF_OSI");
            map.put(AF_ECMA, "AF_ECMA");
            map.put(AF_DATAKIT, "AF_DATAKIT");
            map.put(AF_CCITT, "AF_CCITT");
            map.put(AF_SNA, "AF_SNA");
            map.put(AF_DECnet, "AF_DECnet");
            map.put(AF_DLI, "AF_DLI");
            map.put(AF_LAT, "AF_LAT");
            map.put(AF_HYLINK, "AF_HYLINK");
            map.put(AF_APPLETALK, "AF_APPLETALK");
            map.put(AF_ROUTE, "AF_ROUTE");
            map.put(AF_LINK, "AF_LINK");
            map.put(AF_IPX, "AF_IPX");
            map.put(AF_INET6, "AF_INET6");
            map.put(AF_KEY, "AF_KEY");
            map.put(AF_NETLINK, "AF_NETLINK");
            map.put(AF_MAX, "AF_MAX");
            return map;
        }

        StringTable() {
        }
    }
}

