/*
 * Decompiled with CFR 0.152.
 */
package jnr.constants.platform.linux.s390x;

import java.util.EnumMap;
import java.util.Map;
import jnr.constants.Constant;

public final class AddressInfo
extends Enum<AddressInfo>
implements Constant {
    public static final long MAX_VALUE = 1024L;
    public static final long MIN_VALUE = 1L;
    public static final /* enum */ AddressInfo AI_NUMERICHOST;
    public static final /* enum */ AddressInfo AI_PASSIVE;
    public static final /* enum */ AddressInfo AI_CANONNAME;
    public static final /* enum */ AddressInfo AI_ALL;
    public static final /* enum */ AddressInfo AI_NUMERICSERV;
    public static final /* enum */ AddressInfo AI_V4MAPPED;
    private static final /* synthetic */ AddressInfo[] $VALUES;
    private final long value;
    public static final /* enum */ AddressInfo AI_ADDRCONFIG;

    public final int value() {
        return (int)this.value;
    }

    static {
        AI_PASSIVE = new AddressInfo(1L);
        AI_CANONNAME = new AddressInfo(2L);
        AI_NUMERICHOST = new AddressInfo(4L);
        AI_NUMERICSERV = new AddressInfo(1024L);
        AI_ALL = new AddressInfo(16L);
        AI_ADDRCONFIG = new AddressInfo(32L);
        AI_V4MAPPED = new AddressInfo(8L);
        AddressInfo[] addressInfoArray = new AddressInfo[7];
        addressInfoArray[0] = AI_PASSIVE;
        addressInfoArray[1] = AI_CANONNAME;
        addressInfoArray[2] = AI_NUMERICHOST;
        addressInfoArray[3] = AI_NUMERICSERV;
        addressInfoArray[4] = AI_ALL;
        addressInfoArray[5] = AI_ADDRCONFIG;
        addressInfoArray[6] = AI_V4MAPPED;
        $VALUES = addressInfoArray;
    }

    public final String toString() {
        return StringTable.descriptions.get(this);
    }

    private AddressInfo(long value) {
        this.value = value;
    }

    @Override
    public final boolean defined() {
        return true;
    }

    @Override
    public final long longValue() {
        return this.value;
    }

    public static AddressInfo[] values() {
        return (AddressInfo[])$VALUES.clone();
    }

    @Override
    public final int intValue() {
        return (int)this.value;
    }

    public static AddressInfo valueOf(String name) {
        return Enum.valueOf(AddressInfo.class, name);
    }

    static final class StringTable {
        public static final Map<AddressInfo, String> descriptions = StringTable.generateTable();

        StringTable() {
        }

        public static final Map<AddressInfo, String> generateTable() {
            EnumMap<AddressInfo, String> map = new EnumMap<AddressInfo, String>(AddressInfo.class);
            map.put(AI_PASSIVE, "AI_PASSIVE");
            map.put(AI_CANONNAME, "AI_CANONNAME");
            map.put(AI_NUMERICHOST, "AI_NUMERICHOST");
            map.put(AI_NUMERICSERV, "AI_NUMERICSERV");
            map.put(AI_ALL, "AI_ALL");
            map.put(AI_ADDRCONFIG, "AI_ADDRCONFIG");
            map.put(AI_V4MAPPED, "AI_V4MAPPED");
            return map;
        }
    }
}

