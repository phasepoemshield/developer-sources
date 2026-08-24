/*
 * Decompiled with CFR 0.152.
 */
package jnr.constants.platform.openbsd;

import java.util.EnumMap;
import java.util.Map;
import jnr.constants.Constant;

public final class AddressInfo
extends Enum<AddressInfo>
implements Constant {
    public static final /* enum */ AddressInfo AI_NUMERICHOST;
    public static final long MAX_VALUE = 119L;
    public static final /* enum */ AddressInfo AI_PASSIVE;
    public static final /* enum */ AddressInfo AI_NUMERICSERV;
    private final long value;
    private static final /* synthetic */ AddressInfo[] $VALUES;
    public static final /* enum */ AddressInfo AI_CANONNAME;
    public static final /* enum */ AddressInfo AI_ADDRCONFIG;
    public static final /* enum */ AddressInfo AI_MASK;
    public static final long MIN_VALUE = 1L;

    public static AddressInfo[] values() {
        return (AddressInfo[])$VALUES.clone();
    }

    @Override
    public final int intValue() {
        return (int)this.value;
    }

    private AddressInfo(long value) {
        this.value = value;
    }

    @Override
    public final long longValue() {
        return this.value;
    }

    public final String toString() {
        return StringTable.descriptions.get(this);
    }

    public static AddressInfo valueOf(String name) {
        return Enum.valueOf(AddressInfo.class, name);
    }

    static {
        AI_PASSIVE = new AddressInfo(1L);
        AI_CANONNAME = new AddressInfo(2L);
        AI_NUMERICHOST = new AddressInfo(4L);
        AI_NUMERICSERV = new AddressInfo(16L);
        AI_MASK = new AddressInfo(119L);
        AI_ADDRCONFIG = new AddressInfo(64L);
        AddressInfo[] addressInfoArray = new AddressInfo[6];
        addressInfoArray[0] = AI_PASSIVE;
        addressInfoArray[1] = AI_CANONNAME;
        addressInfoArray[2] = AI_NUMERICHOST;
        addressInfoArray[3] = AI_NUMERICSERV;
        addressInfoArray[4] = AI_MASK;
        addressInfoArray[5] = AI_ADDRCONFIG;
        $VALUES = addressInfoArray;
    }

    public final int value() {
        return (int)this.value;
    }

    @Override
    public final boolean defined() {
        return true;
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
            map.put(AI_MASK, "AI_MASK");
            map.put(AI_ADDRCONFIG, "AI_ADDRCONFIG");
            return map;
        }
    }
}

