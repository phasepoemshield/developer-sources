/*
 * Decompiled with CFR 0.152.
 */
package jnr.constants.platform.aix;

import jnr.constants.Constant;

public final class AddressFamily
extends Enum<AddressFamily>
implements Constant {
    public static final /* enum */ AddressFamily AF_DECnet;
    private final long value;
    public static final /* enum */ AddressFamily AF_SNA;
    public static final /* enum */ AddressFamily AF_NS;
    public static final /* enum */ AddressFamily AF_CCITT;
    public static final /* enum */ AddressFamily AF_LAT;
    public static final /* enum */ AddressFamily AF_OSI;
    public static final long MAX_VALUE = 30L;
    public static final /* enum */ AddressFamily AF_LINK;
    public static final /* enum */ AddressFamily AF_CHAOS;
    public static final /* enum */ AddressFamily AF_UNIX;
    public static final /* enum */ AddressFamily AF_ROUTE;
    public static final /* enum */ AddressFamily pseudo_AF_XTP;
    public static final /* enum */ AddressFamily AF_ISO;
    public static final /* enum */ AddressFamily AF_PUP;
    public static final long MIN_VALUE = 0L;
    private static final /* synthetic */ AddressFamily[] $VALUES;
    public static final /* enum */ AddressFamily AF_APPLETALK;
    public static final /* enum */ AddressFamily AF_HYLINK;
    public static final /* enum */ AddressFamily AF_ECMA;
    public static final /* enum */ AddressFamily AF_INET6;
    public static final /* enum */ AddressFamily AF_DLI;
    public static final /* enum */ AddressFamily AF_DATAKIT;
    public static final /* enum */ AddressFamily AF_MAX;
    public static final /* enum */ AddressFamily AF_IMPLINK;
    public static final /* enum */ AddressFamily AF_INET;
    public static final /* enum */ AddressFamily AF_UNSPEC;

    @Override
    public final int intValue() {
        return (int)this.value;
    }

    private AddressFamily(long value) {
        this.value = value;
    }

    static {
        AF_UNSPEC = new AddressFamily(0L);
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
        AF_INET6 = new AddressFamily(24L);
        AF_MAX = new AddressFamily(30L);
        AddressFamily[] addressFamilyArray = new AddressFamily[23];
        addressFamilyArray[0] = AF_UNSPEC;
        addressFamilyArray[1] = AF_UNIX;
        addressFamilyArray[2] = AF_INET;
        addressFamilyArray[3] = AF_IMPLINK;
        addressFamilyArray[4] = AF_PUP;
        addressFamilyArray[5] = AF_CHAOS;
        addressFamilyArray[6] = AF_NS;
        addressFamilyArray[7] = AF_ISO;
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
        addressFamilyArray[20] = pseudo_AF_XTP;
        addressFamilyArray[21] = AF_INET6;
        addressFamilyArray[22] = AF_MAX;
        $VALUES = addressFamilyArray;
    }

    @Override
    public final boolean defined() {
        return true;
    }

    @Override
    public final long longValue() {
        return this.value;
    }

    public static AddressFamily[] values() {
        return (AddressFamily[])$VALUES.clone();
    }

    public static AddressFamily valueOf(String name) {
        return Enum.valueOf(AddressFamily.class, name);
    }
}

