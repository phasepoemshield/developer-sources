/*
 * Decompiled with CFR 0.152.
 */
package jnr.constants.platform.darwin;

import java.util.EnumMap;
import java.util.Map;
import jnr.constants.Constant;

public final class InterfaceInfo
extends Enum<InterfaceInfo>
implements Constant {
    public static final /* enum */ InterfaceInfo IFF_LOOPBACK;
    public static final /* enum */ InterfaceInfo IFF_ALLMULTI;
    public static final /* enum */ InterfaceInfo IFF_LINK2;
    public static final /* enum */ InterfaceInfo IFF_UP;
    public static final /* enum */ InterfaceInfo IFF_LINK1;
    public static final /* enum */ InterfaceInfo IFF_DEBUG;
    public static final /* enum */ InterfaceInfo IFF_NOTRAILERS;
    public static final /* enum */ InterfaceInfo IFF_ALTPHYS;
    public static final long MIN_VALUE = 1L;
    public static final /* enum */ InterfaceInfo IFF_OACTIVE;
    public static final /* enum */ InterfaceInfo IFF_NOARP;
    private final long value;
    public static final /* enum */ InterfaceInfo IFF_BROADCAST;
    public static final /* enum */ InterfaceInfo IFF_SIMPLEX;
    public static final long MAX_VALUE = 32768L;
    public static final /* enum */ InterfaceInfo IFF_LINK0;
    public static final /* enum */ InterfaceInfo IFF_RUNNING;
    public static final /* enum */ InterfaceInfo IFF_POINTOPOINT;
    public static final /* enum */ InterfaceInfo IFF_PROMISC;
    public static final /* enum */ InterfaceInfo IFF_MULTICAST;
    private static final /* synthetic */ InterfaceInfo[] $VALUES;

    @Override
    public final int intValue() {
        return (int)this.value;
    }

    public static InterfaceInfo[] values() {
        return (InterfaceInfo[])$VALUES.clone();
    }

    private InterfaceInfo(long value) {
        this.value = value;
    }

    @Override
    public final long longValue() {
        return this.value;
    }

    @Override
    public final boolean defined() {
        return true;
    }

    public final int value() {
        return (int)this.value;
    }

    public static InterfaceInfo valueOf(String name) {
        return Enum.valueOf(InterfaceInfo.class, name);
    }

    static {
        IFF_ALLMULTI = new InterfaceInfo(512L);
        IFF_ALTPHYS = new InterfaceInfo(16384L);
        IFF_BROADCAST = new InterfaceInfo(2L);
        IFF_DEBUG = new InterfaceInfo(4L);
        IFF_LINK0 = new InterfaceInfo(4096L);
        IFF_LINK1 = new InterfaceInfo(8192L);
        IFF_LINK2 = new InterfaceInfo(16384L);
        IFF_LOOPBACK = new InterfaceInfo(8L);
        IFF_MULTICAST = new InterfaceInfo(32768L);
        IFF_NOARP = new InterfaceInfo(128L);
        IFF_NOTRAILERS = new InterfaceInfo(32L);
        IFF_OACTIVE = new InterfaceInfo(1024L);
        IFF_POINTOPOINT = new InterfaceInfo(16L);
        IFF_PROMISC = new InterfaceInfo(256L);
        IFF_RUNNING = new InterfaceInfo(64L);
        IFF_SIMPLEX = new InterfaceInfo(2048L);
        IFF_UP = new InterfaceInfo(1L);
        InterfaceInfo[] interfaceInfoArray = new InterfaceInfo[17];
        interfaceInfoArray[0] = IFF_ALLMULTI;
        interfaceInfoArray[1] = IFF_ALTPHYS;
        interfaceInfoArray[2] = IFF_BROADCAST;
        interfaceInfoArray[3] = IFF_DEBUG;
        interfaceInfoArray[4] = IFF_LINK0;
        interfaceInfoArray[5] = IFF_LINK1;
        interfaceInfoArray[6] = IFF_LINK2;
        interfaceInfoArray[7] = IFF_LOOPBACK;
        interfaceInfoArray[8] = IFF_MULTICAST;
        interfaceInfoArray[9] = IFF_NOARP;
        interfaceInfoArray[10] = IFF_NOTRAILERS;
        interfaceInfoArray[11] = IFF_OACTIVE;
        interfaceInfoArray[12] = IFF_POINTOPOINT;
        interfaceInfoArray[13] = IFF_PROMISC;
        interfaceInfoArray[14] = IFF_RUNNING;
        interfaceInfoArray[15] = IFF_SIMPLEX;
        interfaceInfoArray[16] = IFF_UP;
        $VALUES = interfaceInfoArray;
    }

    public final String toString() {
        return StringTable.descriptions.get(this);
    }

    static final class StringTable {
        public static final Map<InterfaceInfo, String> descriptions = StringTable.generateTable();

        public static final Map<InterfaceInfo, String> generateTable() {
            EnumMap<InterfaceInfo, String> map = new EnumMap<InterfaceInfo, String>(InterfaceInfo.class);
            map.put(IFF_ALLMULTI, "IFF_ALLMULTI");
            map.put(IFF_ALTPHYS, "IFF_ALTPHYS");
            map.put(IFF_BROADCAST, "IFF_BROADCAST");
            map.put(IFF_DEBUG, "IFF_DEBUG");
            map.put(IFF_LINK0, "IFF_LINK0");
            map.put(IFF_LINK1, "IFF_LINK1");
            map.put(IFF_LINK2, "IFF_LINK2");
            map.put(IFF_LOOPBACK, "IFF_LOOPBACK");
            map.put(IFF_MULTICAST, "IFF_MULTICAST");
            map.put(IFF_NOARP, "IFF_NOARP");
            map.put(IFF_NOTRAILERS, "IFF_NOTRAILERS");
            map.put(IFF_OACTIVE, "IFF_OACTIVE");
            map.put(IFF_POINTOPOINT, "IFF_POINTOPOINT");
            map.put(IFF_PROMISC, "IFF_PROMISC");
            map.put(IFF_RUNNING, "IFF_RUNNING");
            map.put(IFF_SIMPLEX, "IFF_SIMPLEX");
            map.put(IFF_UP, "IFF_UP");
            return map;
        }

        StringTable() {
        }
    }
}

