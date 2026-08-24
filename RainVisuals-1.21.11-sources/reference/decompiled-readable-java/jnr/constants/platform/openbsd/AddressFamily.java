/*
 * Decompiled with CFR 0.152.
 */
package jnr.constants.platform.openbsd;

import java.util.EnumMap;
import java.util.Map;
import jnr.constants.Constant;

public final class AddressFamily
extends Enum<AddressFamily>
implements Constant {
    public static final /* enum */ AddressFamily AF_DECnet;
    public static final /* enum */ AddressFamily AF_PUP;
    public static final /* enum */ AddressFamily AF_UNSPEC;
    public static final /* enum */ AddressFamily AF_CNT;
    public static final /* enum */ AddressFamily AF_LOCAL;
    public static final long MIN_VALUE = 0L;
    public static final /* enum */ AddressFamily AF_IMPLINK;
    public static final /* enum */ AddressFamily AF_ISO;
    public static final /* enum */ AddressFamily AF_MAX;
    public static final /* enum */ AddressFamily AF_INET6;
    public static final /* enum */ AddressFamily AF_COIP;
    public static final /* enum */ AddressFamily AF_INET;
    public static final /* enum */ AddressFamily pseudo_AF_HDRCMPLT;
    public static final /* enum */ AddressFamily AF_HYLINK;
    public static final /* enum */ AddressFamily AF_NS;
    public static final /* enum */ AddressFamily AF_IPX;
    public static final /* enum */ AddressFamily AF_E164;
    private final long value;
    public static final /* enum */ AddressFamily pseudo_AF_PIP;
    public static final /* enum */ AddressFamily AF_ROUTE;
    public static final /* enum */ AddressFamily AF_CHAOS;
    public static final /* enum */ AddressFamily AF_ECMA;
    public static final /* enum */ AddressFamily AF_LAT;
    public static final /* enum */ AddressFamily AF_CCITT;
    public static final /* enum */ AddressFamily AF_DLI;
    public static final /* enum */ AddressFamily AF_DATAKIT;
    public static final /* enum */ AddressFamily pseudo_AF_XTP;
    public static final /* enum */ AddressFamily AF_OSI;
    public static final /* enum */ AddressFamily AF_UNIX;
    private static final /* synthetic */ AddressFamily[] $VALUES;
    public static final /* enum */ AddressFamily AF_APPLETALK;
    public static final /* enum */ AddressFamily AF_NATM;
    public static final /* enum */ AddressFamily AF_ISDN;
    public static final long MAX_VALUE = 36L;
    public static final /* enum */ AddressFamily AF_SNA;
    public static final /* enum */ AddressFamily AF_LINK;
    public static final /* enum */ AddressFamily pseudo_AF_RTIP;
    public static final /* enum */ AddressFamily AF_SIP;

    @Override
    public final long longValue() {
        return this.value;
    }

    @Override
    public final boolean defined() {
        return true;
    }

    private AddressFamily(long value) {
        this.value = value;
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
        AF_ISO = new AddressFamily(7L);
        AF_OSI = new AddressFamily(7L);
        AF_ECMA = new AddressFamily(8L);
        AF_DATAKIT = new AddressFamily(9L);
        AF_CCITT = new AddressFamily(10L);
        AF_SNA = new AddressFamily(11L);
        AF_DECnet = new AddressFamily(12L);
        AF_DLI = new AddressFamily(13L);
        AF_LAT = new AddressFamily(14L);
        AF_HYLINK = new AddressFamily(15L);
        AF_APPLETALK = new AddressFamily(16L);
        AF_ROUTE = new AddressFamily(17L);
        AF_LINK = new AddressFamily(18L);
        pseudo_AF_XTP = new AddressFamily(19L);
        AF_COIP = new AddressFamily(20L);
        AF_CNT = new AddressFamily(21L);
        pseudo_AF_RTIP = new AddressFamily(22L);
        AF_IPX = new AddressFamily(23L);
        AF_SIP = new AddressFamily(29L);
        pseudo_AF_PIP = new AddressFamily(25L);
        AF_ISDN = new AddressFamily(26L);
        AF_E164 = new AddressFamily(26L);
        AF_INET6 = new AddressFamily(24L);
        AF_NATM = new AddressFamily(27L);
        pseudo_AF_HDRCMPLT = new AddressFamily(31L);
        AF_MAX = new AddressFamily(36L);
        AddressFamily[] addressFamilyArray = new AddressFamily[34];
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
        addressFamilyArray[28] = AF_ISDN;
        addressFamilyArray[29] = AF_E164;
        addressFamilyArray[30] = AF_INET6;
        addressFamilyArray[31] = AF_NATM;
        addressFamilyArray[32] = pseudo_AF_HDRCMPLT;
        addressFamilyArray[33] = AF_MAX;
        $VALUES = addressFamilyArray;
    }

    public final String toString() {
        return StringTable.descriptions.get(this);
    }

    public final int value() {
        return (int)this.value;
    }

    public static AddressFamily valueOf(String name) {
        return Enum.valueOf(AddressFamily.class, name);
    }

    public static AddressFamily[] values() {
        return (AddressFamily[])$VALUES.clone();
    }

    @Override
    public final int intValue() {
        return (int)this.value;
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
            map.put(AF_IMPLINK, "AF_IMPLINK");
            map.put(AF_PUP, "AF_PUP");
            map.put(AF_CHAOS, "AF_CHAOS");
            map.put(AF_NS, "AF_NS");
            map.put(AF_ISO, "AF_ISO");
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
            map.put(pseudo_AF_XTP, "pseudo_AF_XTP");
            map.put(AF_COIP, "AF_COIP");
            map.put(AF_CNT, "AF_CNT");
            map.put(pseudo_AF_RTIP, "pseudo_AF_RTIP");
            map.put(AF_IPX, "AF_IPX");
            map.put(AF_SIP, "AF_SIP");
            map.put(pseudo_AF_PIP, "pseudo_AF_PIP");
            map.put(AF_ISDN, "AF_ISDN");
            map.put(AF_E164, "AF_E164");
            map.put(AF_INET6, "AF_INET6");
            map.put(AF_NATM, "AF_NATM");
            map.put(pseudo_AF_HDRCMPLT, "pseudo_AF_HDRCMPLT");
            map.put(AF_MAX, "AF_MAX");
            return map;
        }
    }
}

