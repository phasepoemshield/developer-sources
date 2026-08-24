/*
 * Decompiled with CFR 0.152.
 */
package jnr.constants.platform.linux.powerpc64;

import java.util.EnumMap;
import java.util.Map;
import jnr.constants.Constant;

public final class InterfaceInfo
extends Enum<InterfaceInfo>
implements Constant {
    public static final /* enum */ InterfaceInfo IFF_ALLMULTI = new InterfaceInfo(512L);
    public static final long MIN_VALUE = 1L;
    public static final /* enum */ InterfaceInfo IFF_NOARP;
    public static final /* enum */ InterfaceInfo IFF_NOTRAILERS;
    public static final /* enum */ InterfaceInfo IFF_UP;
    public static final /* enum */ InterfaceInfo IFF_POINTOPOINT;
    public static final /* enum */ InterfaceInfo IFF_MASTER;
    public static final /* enum */ InterfaceInfo IFF_BROADCAST;
    public static final long MAX_VALUE = 32768L;
    public static final /* enum */ InterfaceInfo IFF_PORTSEL;
    public static final /* enum */ InterfaceInfo IFF_AUTOMEDIA;
    private static final /* synthetic */ InterfaceInfo[] $VALUES;
    public static final /* enum */ InterfaceInfo IFF_RUNNING;
    public static final /* enum */ InterfaceInfo IFF_PROMISC;
    public static final /* enum */ InterfaceInfo IFF_DYNAMIC;
    public static final /* enum */ InterfaceInfo IFF_LOOPBACK;
    private final long value;
    public static final /* enum */ InterfaceInfo IFF_MULTICAST;
    public static final /* enum */ InterfaceInfo IFF_DEBUG;
    public static final /* enum */ InterfaceInfo IFF_SLAVE;

    public final int value() {
        return (int)this.value;
    }

    private InterfaceInfo(long value) {
        this.value = value;
    }

    public static InterfaceInfo[] values() {
        return (InterfaceInfo[])$VALUES.clone();
    }

    @Override
    public final int intValue() {
        return (int)this.value;
    }

    @Override
    public final boolean defined() {
        return true;
    }

    @Override
    public final long longValue() {
        return this.value;
    }

    public final String toString() {
        return StringTable.descriptions.get(this);
    }

    public static InterfaceInfo valueOf(String name) {
        return Enum.valueOf(InterfaceInfo.class, name);
    }

    static {
        IFF_AUTOMEDIA = new InterfaceInfo(16384L);
        IFF_BROADCAST = new InterfaceInfo(2L);
        IFF_DEBUG = new InterfaceInfo(4L);
        IFF_DYNAMIC = new InterfaceInfo(32768L);
        IFF_LOOPBACK = new InterfaceInfo(8L);
        IFF_MASTER = new InterfaceInfo(1024L);
        IFF_MULTICAST = new InterfaceInfo(4096L);
        IFF_NOARP = new InterfaceInfo(128L);
        IFF_NOTRAILERS = new InterfaceInfo(32L);
        IFF_POINTOPOINT = new InterfaceInfo(16L);
        IFF_PORTSEL = new InterfaceInfo(8192L);
        IFF_PROMISC = new InterfaceInfo(256L);
        IFF_RUNNING = new InterfaceInfo(64L);
        IFF_SLAVE = new InterfaceInfo(2048L);
        IFF_UP = new InterfaceInfo(1L);
        InterfaceInfo[] interfaceInfoArray = new InterfaceInfo[16];
        interfaceInfoArray[0] = IFF_ALLMULTI;
        interfaceInfoArray[1] = IFF_AUTOMEDIA;
        interfaceInfoArray[2] = IFF_BROADCAST;
        interfaceInfoArray[3] = IFF_DEBUG;
        interfaceInfoArray[4] = IFF_DYNAMIC;
        interfaceInfoArray[5] = IFF_LOOPBACK;
        interfaceInfoArray[6] = IFF_MASTER;
        interfaceInfoArray[7] = IFF_MULTICAST;
        interfaceInfoArray[8] = IFF_NOARP;
        interfaceInfoArray[9] = IFF_NOTRAILERS;
        interfaceInfoArray[10] = IFF_POINTOPOINT;
        interfaceInfoArray[11] = IFF_PORTSEL;
        interfaceInfoArray[12] = IFF_PROMISC;
        interfaceInfoArray[13] = IFF_RUNNING;
        interfaceInfoArray[14] = IFF_SLAVE;
        interfaceInfoArray[15] = IFF_UP;
        $VALUES = interfaceInfoArray;
    }

    static final class StringTable {
        public static final Map<InterfaceInfo, String> descriptions = StringTable.generateTable();

        StringTable() {
        }

        public static final Map<InterfaceInfo, String> generateTable() {
            EnumMap<InterfaceInfo, String> map = new EnumMap<InterfaceInfo, String>(InterfaceInfo.class);
            map.put(IFF_ALLMULTI, "IFF_ALLMULTI");
            map.put(IFF_AUTOMEDIA, "IFF_AUTOMEDIA");
            map.put(IFF_BROADCAST, "IFF_BROADCAST");
            map.put(IFF_DEBUG, "IFF_DEBUG");
            map.put(IFF_DYNAMIC, "IFF_DYNAMIC");
            map.put(IFF_LOOPBACK, "IFF_LOOPBACK");
            map.put(IFF_MASTER, "IFF_MASTER");
            map.put(IFF_MULTICAST, "IFF_MULTICAST");
            map.put(IFF_NOARP, "IFF_NOARP");
            map.put(IFF_NOTRAILERS, "IFF_NOTRAILERS");
            map.put(IFF_POINTOPOINT, "IFF_POINTOPOINT");
            map.put(IFF_PORTSEL, "IFF_PORTSEL");
            map.put(IFF_PROMISC, "IFF_PROMISC");
            map.put(IFF_RUNNING, "IFF_RUNNING");
            map.put(IFF_SLAVE, "IFF_SLAVE");
            map.put(IFF_UP, "IFF_UP");
            return map;
        }
    }
}

