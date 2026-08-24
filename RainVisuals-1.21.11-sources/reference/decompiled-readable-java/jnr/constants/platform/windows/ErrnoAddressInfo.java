/*
 * Decompiled with CFR 0.152.
 */
package jnr.constants.platform.windows;

import java.util.EnumMap;
import java.util.Map;
import jnr.constants.Constant;

public final class ErrnoAddressInfo
extends Enum<ErrnoAddressInfo>
implements Constant {
    public static final /* enum */ ErrnoAddressInfo EAI_FAIL;
    public static final long MIN_VALUE = 8L;
    public static final /* enum */ ErrnoAddressInfo EAI_FAMILY;
    private static final /* synthetic */ ErrnoAddressInfo[] $VALUES;
    public static final /* enum */ ErrnoAddressInfo EAI_BADFLAGS;
    public static final /* enum */ ErrnoAddressInfo EAI_SOCKTYPE;
    public static final /* enum */ ErrnoAddressInfo EAI_NONAME;
    private final long value;
    public static final /* enum */ ErrnoAddressInfo EAI_MEMORY;
    public static final /* enum */ ErrnoAddressInfo EAI_NODATA;
    public static final long MAX_VALUE = 11004L;
    public static final /* enum */ ErrnoAddressInfo EAI_SERVICE;
    public static final /* enum */ ErrnoAddressInfo EAI_AGAIN;

    public static ErrnoAddressInfo[] values() {
        return (ErrnoAddressInfo[])$VALUES.clone();
    }

    public final int value() {
        return (int)this.value;
    }

    public final String toString() {
        return StringTable.descriptions.get(this);
    }

    private ErrnoAddressInfo(long value) {
        this.value = value;
    }

    @Override
    public final boolean defined() {
        return true;
    }

    @Override
    public final int intValue() {
        return (int)this.value;
    }

    @Override
    public final long longValue() {
        return this.value;
    }

    public static ErrnoAddressInfo valueOf(String name) {
        return Enum.valueOf(ErrnoAddressInfo.class, name);
    }

    static {
        EAI_AGAIN = new ErrnoAddressInfo(11002L);
        EAI_BADFLAGS = new ErrnoAddressInfo(10022L);
        EAI_FAIL = new ErrnoAddressInfo(11003L);
        EAI_FAMILY = new ErrnoAddressInfo(10047L);
        EAI_MEMORY = new ErrnoAddressInfo(8L);
        EAI_NODATA = new ErrnoAddressInfo(11004L);
        EAI_NONAME = new ErrnoAddressInfo(11001L);
        EAI_SERVICE = new ErrnoAddressInfo(10109L);
        EAI_SOCKTYPE = new ErrnoAddressInfo(10044L);
        ErrnoAddressInfo[] errnoAddressInfoArray = new ErrnoAddressInfo[9];
        errnoAddressInfoArray[0] = EAI_AGAIN;
        errnoAddressInfoArray[1] = EAI_BADFLAGS;
        errnoAddressInfoArray[2] = EAI_FAIL;
        errnoAddressInfoArray[3] = EAI_FAMILY;
        errnoAddressInfoArray[4] = EAI_MEMORY;
        errnoAddressInfoArray[5] = EAI_NODATA;
        errnoAddressInfoArray[6] = EAI_NONAME;
        errnoAddressInfoArray[7] = EAI_SERVICE;
        errnoAddressInfoArray[8] = EAI_SOCKTYPE;
        $VALUES = errnoAddressInfoArray;
    }

    static final class StringTable {
        public static final Map<ErrnoAddressInfo, String> descriptions = StringTable.generateTable();

        public static final Map<ErrnoAddressInfo, String> generateTable() {
            EnumMap<ErrnoAddressInfo, String> map = new EnumMap<ErrnoAddressInfo, String>(ErrnoAddressInfo.class);
            map.put(EAI_AGAIN, "EAI_AGAIN");
            map.put(EAI_BADFLAGS, "EAI_BADFLAGS");
            map.put(EAI_FAIL, "EAI_FAIL");
            map.put(EAI_FAMILY, "EAI_FAMILY");
            map.put(EAI_MEMORY, "EAI_MEMORY");
            map.put(EAI_NODATA, "EAI_NODATA");
            map.put(EAI_NONAME, "EAI_NONAME");
            map.put(EAI_SERVICE, "EAI_SERVICE");
            map.put(EAI_SOCKTYPE, "EAI_SOCKTYPE");
            return map;
        }

        StringTable() {
        }
    }
}

