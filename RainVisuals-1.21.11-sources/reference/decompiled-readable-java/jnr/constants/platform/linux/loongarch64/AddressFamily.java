/*
 * Decompiled with CFR 0.152.
 */
package jnr.constants.platform.linux.loongarch64;

import java.util.EnumMap;
import java.util.Map;
import jnr.constants.Constant;

public final class AddressFamily
extends Enum<AddressFamily>
implements Constant {
    public static final /* enum */ AddressFamily AF_LOCAL;
    private final long value;
    public static final /* enum */ AddressFamily AF_IPX;
    public static final /* enum */ AddressFamily AF_INET;
    public static final /* enum */ AddressFamily AF_INET6;
    public static final /* enum */ AddressFamily AF_UNSPEC;
    public static final long MAX_VALUE = 45L;
    public static final /* enum */ AddressFamily AF_DECnet;
    public static final /* enum */ AddressFamily AF_UNIX;
    private static final /* synthetic */ AddressFamily[] $VALUES;
    public static final /* enum */ AddressFamily AF_APPLETALK;
    public static final /* enum */ AddressFamily AF_MAX;
    public static final /* enum */ AddressFamily AF_ISDN;
    public static final /* enum */ AddressFamily AF_AX25;
    public static final /* enum */ AddressFamily AF_ROUTE;
    public static final /* enum */ AddressFamily AF_SNA;
    public static final long MIN_VALUE = 0L;

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
        AF_MAX = new AddressFamily(45L);
        AddressFamily[] addressFamilyArray = new AddressFamily[13];
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
        addressFamilyArray[12] = AF_MAX;
        $VALUES = addressFamilyArray;
    }

    public static AddressFamily[] values() {
        return (AddressFamily[])$VALUES.clone();
    }

    @Override
    public final long longValue() {
        return this.value;
    }

    @Override
    public final boolean defined() {
        return true;
    }

    public final String toString() {
        return StringTable.descriptions.get(this);
    }

    public final int value() {
        return (int)this.value;
    }

    @Override
    public final int intValue() {
        return (int)this.value;
    }

    public static AddressFamily valueOf(String name) {
        return Enum.valueOf(AddressFamily.class, name);
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
            map.put(AF_MAX, "AF_MAX");
            return map;
        }
    }
}

