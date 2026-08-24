/*
 * Decompiled with CFR 0.152.
 */
package jnr.constants.platform.solaris;

import java.util.EnumMap;
import java.util.Map;
import jnr.constants.Constant;

public final class InterfaceInfo
extends Enum<InterfaceInfo>
implements Constant {
    public static final /* enum */ InterfaceInfo IFF_MULTICAST;
    public static final long MIN_VALUE = 1L;
    public static final long MAX_VALUE = 60413060332378L;
    public static final /* enum */ InterfaceInfo IFF_NOTRAILERS;
    public static final /* enum */ InterfaceInfo IFF_PROMISC;
    public static final /* enum */ InterfaceInfo IFF_DEBUG;
    public static final /* enum */ InterfaceInfo IFF_LOOPBACK;
    public static final /* enum */ InterfaceInfo IFF_CANTCHANGE;
    public static final /* enum */ InterfaceInfo IFF_RUNNING;
    public static final /* enum */ InterfaceInfo IFF_ALLMULTI;
    public static final /* enum */ InterfaceInfo IFF_BROADCAST;
    public static final /* enum */ InterfaceInfo IFF_NOARP;
    public static final /* enum */ InterfaceInfo IFF_UP;
    public static final /* enum */ InterfaceInfo IFF_POINTOPOINT;
    private final long value;
    private static final /* synthetic */ InterfaceInfo[] $VALUES;

    private InterfaceInfo(long value) {
        this.value = value;
    }

    public final String toString() {
        return StringTable.descriptions.get(this);
    }

    @Override
    public final long longValue() {
        return this.value;
    }

    @Override
    public final boolean defined() {
        return true;
    }

    static {
        IFF_ALLMULTI = new InterfaceInfo(512L);
        IFF_BROADCAST = new InterfaceInfo(2L);
        IFF_DEBUG = new InterfaceInfo(4L);
        IFF_LOOPBACK = new InterfaceInfo(8L);
        IFF_MULTICAST = new InterfaceInfo(2048L);
        IFF_NOARP = new InterfaceInfo(128L);
        IFF_NOTRAILERS = new InterfaceInfo(32L);
        IFF_POINTOPOINT = new InterfaceInfo(16L);
        IFF_PROMISC = new InterfaceInfo(256L);
        IFF_RUNNING = new InterfaceInfo(64L);
        IFF_UP = new InterfaceInfo(1L);
        IFF_CANTCHANGE = new InterfaceInfo(60413060332378L);
        InterfaceInfo[] interfaceInfoArray = new InterfaceInfo[12];
        interfaceInfoArray[0] = IFF_ALLMULTI;
        interfaceInfoArray[1] = IFF_BROADCAST;
        interfaceInfoArray[2] = IFF_DEBUG;
        interfaceInfoArray[3] = IFF_LOOPBACK;
        interfaceInfoArray[4] = IFF_MULTICAST;
        interfaceInfoArray[5] = IFF_NOARP;
        interfaceInfoArray[6] = IFF_NOTRAILERS;
        interfaceInfoArray[7] = IFF_POINTOPOINT;
        interfaceInfoArray[8] = IFF_PROMISC;
        interfaceInfoArray[9] = IFF_RUNNING;
        interfaceInfoArray[10] = IFF_UP;
        interfaceInfoArray[11] = IFF_CANTCHANGE;
        $VALUES = interfaceInfoArray;
    }

    public static InterfaceInfo valueOf(String name) {
        return Enum.valueOf(InterfaceInfo.class, name);
    }

    @Override
    public final int intValue() {
        return (int)this.value;
    }

    public final int value() {
        return (int)this.value;
    }

    public static InterfaceInfo[] values() {
        return (InterfaceInfo[])$VALUES.clone();
    }

    static final class StringTable {
        public static final Map<InterfaceInfo, String> descriptions = StringTable.generateTable();

        public static final Map<InterfaceInfo, String> generateTable() {
            EnumMap<InterfaceInfo, String> map = new EnumMap<InterfaceInfo, String>(InterfaceInfo.class);
            map.put(IFF_ALLMULTI, "IFF_ALLMULTI");
            map.put(IFF_BROADCAST, "IFF_BROADCAST");
            map.put(IFF_DEBUG, "IFF_DEBUG");
            map.put(IFF_LOOPBACK, "IFF_LOOPBACK");
            map.put(IFF_MULTICAST, "IFF_MULTICAST");
            map.put(IFF_NOARP, "IFF_NOARP");
            map.put(IFF_NOTRAILERS, "IFF_NOTRAILERS");
            map.put(IFF_POINTOPOINT, "IFF_POINTOPOINT");
            map.put(IFF_PROMISC, "IFF_PROMISC");
            map.put(IFF_RUNNING, "IFF_RUNNING");
            map.put(IFF_UP, "IFF_UP");
            map.put(IFF_CANTCHANGE, "IFF_CANTCHANGE");
            return map;
        }

        StringTable() {
        }
    }
}

