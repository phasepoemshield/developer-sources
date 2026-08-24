/*
 * Decompiled with CFR 0.152.
 */
package jnr.constants.platform.darwin;

import java.util.EnumMap;
import java.util.Map;
import jnr.constants.Constant;

public final class ErrnoAddressInfo
extends Enum<ErrnoAddressInfo>
implements Constant {
    public static final /* enum */ ErrnoAddressInfo EAI_PROTOCOL;
    public static final /* enum */ ErrnoAddressInfo EAI_MEMORY;
    public static final /* enum */ ErrnoAddressInfo EAI_MAX;
    public static final /* enum */ ErrnoAddressInfo EAI_BADHINTS;
    public static final /* enum */ ErrnoAddressInfo EAI_NONAME;
    private static final /* synthetic */ ErrnoAddressInfo[] $VALUES;
    public static final /* enum */ ErrnoAddressInfo EAI_NODATA;
    public static final long MAX_VALUE = 15L;
    public static final /* enum */ ErrnoAddressInfo EAI_BADFLAGS;
    public static final /* enum */ ErrnoAddressInfo EAI_OVERFLOW;
    public static final /* enum */ ErrnoAddressInfo EAI_FAMILY;
    public static final /* enum */ ErrnoAddressInfo EAI_ADDRFAMILY;
    public static final /* enum */ ErrnoAddressInfo EAI_SOCKTYPE;
    public static final /* enum */ ErrnoAddressInfo EAI_AGAIN;
    public static final /* enum */ ErrnoAddressInfo EAI_SYSTEM;
    public static final /* enum */ ErrnoAddressInfo EAI_FAIL;
    private final long value;
    public static final long MIN_VALUE = 1L;
    public static final /* enum */ ErrnoAddressInfo EAI_SERVICE;

    public final int value() {
        return (int)this.value;
    }

    private ErrnoAddressInfo(long value) {
        this.value = value;
    }

    @Override
    public final long longValue() {
        return this.value;
    }

    public final String toString() {
        return StringTable.descriptions.get(this);
    }

    @Override
    public final int intValue() {
        return (int)this.value;
    }

    public static ErrnoAddressInfo valueOf(String name) {
        return Enum.valueOf(ErrnoAddressInfo.class, name);
    }

    public static ErrnoAddressInfo[] values() {
        return (ErrnoAddressInfo[])$VALUES.clone();
    }

    @Override
    public final boolean defined() {
        return true;
    }

    static {
        EAI_ADDRFAMILY = new ErrnoAddressInfo(1L);
        EAI_AGAIN = new ErrnoAddressInfo(2L);
        EAI_BADFLAGS = new ErrnoAddressInfo(3L);
        EAI_FAIL = new ErrnoAddressInfo(4L);
        EAI_FAMILY = new ErrnoAddressInfo(5L);
        EAI_MEMORY = new ErrnoAddressInfo(6L);
        EAI_NODATA = new ErrnoAddressInfo(7L);
        EAI_NONAME = new ErrnoAddressInfo(8L);
        EAI_OVERFLOW = new ErrnoAddressInfo(14L);
        EAI_SERVICE = new ErrnoAddressInfo(9L);
        EAI_SOCKTYPE = new ErrnoAddressInfo(10L);
        EAI_SYSTEM = new ErrnoAddressInfo(11L);
        EAI_BADHINTS = new ErrnoAddressInfo(12L);
        EAI_PROTOCOL = new ErrnoAddressInfo(13L);
        EAI_MAX = new ErrnoAddressInfo(15L);
        ErrnoAddressInfo[] errnoAddressInfoArray = new ErrnoAddressInfo[15];
        errnoAddressInfoArray[0] = EAI_ADDRFAMILY;
        errnoAddressInfoArray[1] = EAI_AGAIN;
        errnoAddressInfoArray[2] = EAI_BADFLAGS;
        errnoAddressInfoArray[3] = EAI_FAIL;
        errnoAddressInfoArray[4] = EAI_FAMILY;
        errnoAddressInfoArray[5] = EAI_MEMORY;
        errnoAddressInfoArray[6] = EAI_NODATA;
        errnoAddressInfoArray[7] = EAI_NONAME;
        errnoAddressInfoArray[8] = EAI_OVERFLOW;
        errnoAddressInfoArray[9] = EAI_SERVICE;
        errnoAddressInfoArray[10] = EAI_SOCKTYPE;
        errnoAddressInfoArray[11] = EAI_SYSTEM;
        errnoAddressInfoArray[12] = EAI_BADHINTS;
        errnoAddressInfoArray[13] = EAI_PROTOCOL;
        errnoAddressInfoArray[14] = EAI_MAX;
        $VALUES = errnoAddressInfoArray;
    }

    static final class StringTable {
        public static final Map<ErrnoAddressInfo, String> descriptions = StringTable.generateTable();

        public static final Map<ErrnoAddressInfo, String> generateTable() {
            EnumMap<ErrnoAddressInfo, String> map = new EnumMap<ErrnoAddressInfo, String>(ErrnoAddressInfo.class);
            map.put(EAI_ADDRFAMILY, "EAI_ADDRFAMILY");
            map.put(EAI_AGAIN, "EAI_AGAIN");
            map.put(EAI_BADFLAGS, "EAI_BADFLAGS");
            map.put(EAI_FAIL, "EAI_FAIL");
            map.put(EAI_FAMILY, "EAI_FAMILY");
            map.put(EAI_MEMORY, "EAI_MEMORY");
            map.put(EAI_NODATA, "EAI_NODATA");
            map.put(EAI_NONAME, "EAI_NONAME");
            map.put(EAI_OVERFLOW, "EAI_OVERFLOW");
            map.put(EAI_SERVICE, "EAI_SERVICE");
            map.put(EAI_SOCKTYPE, "EAI_SOCKTYPE");
            map.put(EAI_SYSTEM, "EAI_SYSTEM");
            map.put(EAI_BADHINTS, "EAI_BADHINTS");
            map.put(EAI_PROTOCOL, "EAI_PROTOCOL");
            map.put(EAI_MAX, "EAI_MAX");
            return map;
        }

        StringTable() {
        }
    }
}

