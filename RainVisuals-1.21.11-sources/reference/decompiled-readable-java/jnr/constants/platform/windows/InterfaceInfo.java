/*
 * Decompiled with CFR 0.152.
 */
package jnr.constants.platform.windows;

import java.util.EnumMap;
import java.util.Map;
import jnr.constants.Constant;

public final class InterfaceInfo
extends Enum<InterfaceInfo>
implements Constant {
    private final long value;
    private static final /* synthetic */ InterfaceInfo[] $VALUES;
    public static final /* enum */ InterfaceInfo IFF_LOOPBACK;
    public static final long MIN_VALUE = 1L;
    public static final /* enum */ InterfaceInfo IFF_UP;
    public static final /* enum */ InterfaceInfo IFF_MULTICAST;
    public static final long MAX_VALUE = 16L;
    public static final /* enum */ InterfaceInfo IFF_BROADCAST;

    @Override
    public final boolean defined() {
        return true;
    }

    private InterfaceInfo(long value) {
        this.value = value;
    }

    public static InterfaceInfo[] values() {
        return (InterfaceInfo[])$VALUES.clone();
    }

    public final int value() {
        return (int)this.value;
    }

    @Override
    public final long longValue() {
        return this.value;
    }

    public static InterfaceInfo valueOf(String name) {
        return Enum.valueOf(InterfaceInfo.class, name);
    }

    @Override
    public final int intValue() {
        return (int)this.value;
    }

    static {
        IFF_BROADCAST = new InterfaceInfo(2L);
        IFF_LOOPBACK = new InterfaceInfo(4L);
        IFF_MULTICAST = new InterfaceInfo(16L);
        IFF_UP = new InterfaceInfo(1L);
        InterfaceInfo[] interfaceInfoArray = new InterfaceInfo[4];
        interfaceInfoArray[0] = IFF_BROADCAST;
        interfaceInfoArray[1] = IFF_LOOPBACK;
        interfaceInfoArray[2] = IFF_MULTICAST;
        interfaceInfoArray[3] = IFF_UP;
        $VALUES = interfaceInfoArray;
    }

    public final String toString() {
        return StringTable.descriptions.get(this);
    }

    static final class StringTable {
        public static final Map<InterfaceInfo, String> descriptions = StringTable.generateTable();

        public static final Map<InterfaceInfo, String> generateTable() {
            EnumMap<InterfaceInfo, String> map = new EnumMap<InterfaceInfo, String>(InterfaceInfo.class);
            map.put(IFF_BROADCAST, "IFF_BROADCAST");
            map.put(IFF_LOOPBACK, "IFF_LOOPBACK");
            map.put(IFF_MULTICAST, "IFF_MULTICAST");
            map.put(IFF_UP, "IFF_UP");
            return map;
        }

        StringTable() {
        }
    }
}

