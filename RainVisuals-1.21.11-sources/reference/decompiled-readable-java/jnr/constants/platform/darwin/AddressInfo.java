/*
 * Decompiled with CFR 0.152.
 */
package jnr.constants.platform.darwin;

import java.util.EnumMap;
import java.util.Map;
import jnr.constants.Constant;

public final class AddressInfo
extends Enum<AddressInfo>
implements Constant {
    private final long value;
    private static final /* synthetic */ AddressInfo[] $VALUES;
    public static final /* enum */ AddressInfo AI_NUMERICSERV;
    public static final /* enum */ AddressInfo AI_NUMERICHOST;
    public static final /* enum */ AddressInfo AI_MASK;
    public static final /* enum */ AddressInfo AI_DEFAULT;
    public static final /* enum */ AddressInfo AI_CANONNAME;
    public static final /* enum */ AddressInfo AI_ALL;
    public static final /* enum */ AddressInfo AI_ADDRCONFIG;
    public static final /* enum */ AddressInfo AI_V4MAPPED_CFG;
    public static final /* enum */ AddressInfo AI_PASSIVE;
    public static final long MIN_VALUE = 1L;
    public static final long MAX_VALUE = 5127L;
    public static final /* enum */ AddressInfo AI_V4MAPPED;

    public static AddressInfo valueOf(String name) {
        return Enum.valueOf(AddressInfo.class, name);
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

    @Override
    public final boolean defined() {
        return true;
    }

    private AddressInfo(long value) {
        this.value = value;
    }

    static {
        AI_PASSIVE = new AddressInfo(1L);
        AI_CANONNAME = new AddressInfo(2L);
        AI_NUMERICHOST = new AddressInfo(4L);
        AI_NUMERICSERV = new AddressInfo(4096L);
        AI_MASK = new AddressInfo(5127L);
        AI_ALL = new AddressInfo(256L);
        AI_V4MAPPED_CFG = new AddressInfo(512L);
        AI_ADDRCONFIG = new AddressInfo(1024L);
        AI_V4MAPPED = new AddressInfo(2048L);
        AI_DEFAULT = new AddressInfo(1536L);
        AddressInfo[] addressInfoArray = new AddressInfo[10];
        addressInfoArray[0] = AI_PASSIVE;
        addressInfoArray[1] = AI_CANONNAME;
        addressInfoArray[2] = AI_NUMERICHOST;
        addressInfoArray[3] = AI_NUMERICSERV;
        addressInfoArray[4] = AI_MASK;
        addressInfoArray[5] = AI_ALL;
        addressInfoArray[6] = AI_V4MAPPED_CFG;
        addressInfoArray[7] = AI_ADDRCONFIG;
        addressInfoArray[8] = AI_V4MAPPED;
        addressInfoArray[9] = AI_DEFAULT;
        $VALUES = addressInfoArray;
    }

    @Override
    public final long longValue() {
        return this.value;
    }

    public static AddressInfo[] values() {
        return (AddressInfo[])$VALUES.clone();
    }

    static final class StringTable {
        public static final Map<AddressInfo, String> descriptions = StringTable.generateTable();

        public static final Map<AddressInfo, String> generateTable() {
            EnumMap<AddressInfo, String> map = new EnumMap<AddressInfo, String>(AddressInfo.class);
            map.put(AI_PASSIVE, "AI_PASSIVE");
            map.put(AI_CANONNAME, "AI_CANONNAME");
            map.put(AI_NUMERICHOST, "AI_NUMERICHOST");
            map.put(AI_NUMERICSERV, "AI_NUMERICSERV");
            map.put(AI_MASK, "AI_MASK");
            map.put(AI_ALL, "AI_ALL");
            map.put(AI_V4MAPPED_CFG, "AI_V4MAPPED_CFG");
            map.put(AI_ADDRCONFIG, "AI_ADDRCONFIG");
            map.put(AI_V4MAPPED, "AI_V4MAPPED");
            map.put(AI_DEFAULT, "AI_DEFAULT");
            return map;
        }

        StringTable() {
        }
    }
}

