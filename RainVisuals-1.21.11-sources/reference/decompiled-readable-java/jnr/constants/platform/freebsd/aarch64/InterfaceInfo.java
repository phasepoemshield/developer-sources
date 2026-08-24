/*
 * Decompiled with CFR 0.152.
 */
package jnr.constants.platform.freebsd.aarch64;

import java.util.EnumMap;
import java.util.Map;
import jnr.constants.Constant;

public final class InterfaceInfo
extends Enum<InterfaceInfo>
implements Constant {
    public static final /* enum */ InterfaceInfo IFF_CANTCONFIG;
    public static final /* enum */ InterfaceInfo IFF_NOARP;
    public static final /* enum */ InterfaceInfo IFF_DEBUG;
    public static final /* enum */ InterfaceInfo IFF_MULTICAST;
    public static final /* enum */ InterfaceInfo IFF_DYING;
    public static final /* enum */ InterfaceInfo IFF_SIMPLEX;
    public static final /* enum */ InterfaceInfo IFF_MONITOR;
    private final long value;
    public static final /* enum */ InterfaceInfo IFF_CANTCHANGE;
    public static final /* enum */ InterfaceInfo IFF_PROMISC;
    public static final /* enum */ InterfaceInfo IFF_PPROMISC;
    public static final long MIN_VALUE = 1L;
    public static final /* enum */ InterfaceInfo IFF_STATICARP;
    public static final long MAX_VALUE = 0x400000L;
    public static final /* enum */ InterfaceInfo IFF_BROADCAST;
    public static final /* enum */ InterfaceInfo IFF_ALTPHYS;
    public static final /* enum */ InterfaceInfo IFF_LOOPBACK;
    public static final /* enum */ InterfaceInfo IFF_OACTIVE;
    public static final /* enum */ InterfaceInfo IFF_LINK0;
    public static final /* enum */ InterfaceInfo IFF_DRV_OACTIVE;
    public static final /* enum */ InterfaceInfo IFF_LINK2;
    public static final /* enum */ InterfaceInfo IFF_POINTOPOINT;
    public static final /* enum */ InterfaceInfo IFF_DRV_RUNNING;
    public static final /* enum */ InterfaceInfo IFF_ALLMULTI;
    public static final /* enum */ InterfaceInfo IFF_UP;
    public static final /* enum */ InterfaceInfo IFF_RENAMING;
    public static final /* enum */ InterfaceInfo IFF_RUNNING;
    private static final /* synthetic */ InterfaceInfo[] $VALUES;
    public static final /* enum */ InterfaceInfo IFF_LINK1;

    public static InterfaceInfo valueOf(String name) {
        return Enum.valueOf(InterfaceInfo.class, name);
    }

    public static InterfaceInfo[] values() {
        return (InterfaceInfo[])$VALUES.clone();
    }

    public final int value() {
        return (int)this.value;
    }

    private InterfaceInfo(long value) {
        this.value = value;
    }

    @Override
    public final long longValue() {
        return this.value;
    }

    @Override
    public final int intValue() {
        return (int)this.value;
    }

    public final String toString() {
        return StringTable.descriptions.get(this);
    }

    static {
        IFF_ALLMULTI = new InterfaceInfo(512L);
        IFF_ALTPHYS = new InterfaceInfo(16384L);
        IFF_BROADCAST = new InterfaceInfo(2L);
        IFF_CANTCONFIG = new InterfaceInfo(65536L);
        IFF_DEBUG = new InterfaceInfo(4L);
        IFF_DRV_OACTIVE = new InterfaceInfo(1024L);
        IFF_DRV_RUNNING = new InterfaceInfo(64L);
        IFF_DYING = new InterfaceInfo(0x200000L);
        IFF_LINK0 = new InterfaceInfo(4096L);
        IFF_LINK1 = new InterfaceInfo(8192L);
        IFF_LINK2 = new InterfaceInfo(16384L);
        IFF_LOOPBACK = new InterfaceInfo(8L);
        IFF_MONITOR = new InterfaceInfo(262144L);
        IFF_MULTICAST = new InterfaceInfo(32768L);
        IFF_NOARP = new InterfaceInfo(128L);
        IFF_OACTIVE = new InterfaceInfo(1024L);
        IFF_POINTOPOINT = new InterfaceInfo(16L);
        IFF_PPROMISC = new InterfaceInfo(131072L);
        IFF_PROMISC = new InterfaceInfo(256L);
        IFF_RENAMING = new InterfaceInfo(0x400000L);
        IFF_RUNNING = new InterfaceInfo(64L);
        IFF_SIMPLEX = new InterfaceInfo(2048L);
        IFF_STATICARP = new InterfaceInfo(524288L);
        IFF_UP = new InterfaceInfo(1L);
        IFF_CANTCHANGE = new InterfaceInfo(2199410L);
        InterfaceInfo[] interfaceInfoArray = new InterfaceInfo[25];
        interfaceInfoArray[0] = IFF_ALLMULTI;
        interfaceInfoArray[1] = IFF_ALTPHYS;
        interfaceInfoArray[2] = IFF_BROADCAST;
        interfaceInfoArray[3] = IFF_CANTCONFIG;
        interfaceInfoArray[4] = IFF_DEBUG;
        interfaceInfoArray[5] = IFF_DRV_OACTIVE;
        interfaceInfoArray[6] = IFF_DRV_RUNNING;
        interfaceInfoArray[7] = IFF_DYING;
        interfaceInfoArray[8] = IFF_LINK0;
        interfaceInfoArray[9] = IFF_LINK1;
        interfaceInfoArray[10] = IFF_LINK2;
        interfaceInfoArray[11] = IFF_LOOPBACK;
        interfaceInfoArray[12] = IFF_MONITOR;
        interfaceInfoArray[13] = IFF_MULTICAST;
        interfaceInfoArray[14] = IFF_NOARP;
        interfaceInfoArray[15] = IFF_OACTIVE;
        interfaceInfoArray[16] = IFF_POINTOPOINT;
        interfaceInfoArray[17] = IFF_PPROMISC;
        interfaceInfoArray[18] = IFF_PROMISC;
        interfaceInfoArray[19] = IFF_RENAMING;
        interfaceInfoArray[20] = IFF_RUNNING;
        interfaceInfoArray[21] = IFF_SIMPLEX;
        interfaceInfoArray[22] = IFF_STATICARP;
        interfaceInfoArray[23] = IFF_UP;
        interfaceInfoArray[24] = IFF_CANTCHANGE;
        $VALUES = interfaceInfoArray;
    }

    @Override
    public final boolean defined() {
        return true;
    }

    static final class StringTable {
        public static final Map<InterfaceInfo, String> descriptions = StringTable.generateTable();

        StringTable() {
        }

        public static final Map<InterfaceInfo, String> generateTable() {
            EnumMap<InterfaceInfo, String> map = new EnumMap<InterfaceInfo, String>(InterfaceInfo.class);
            map.put(IFF_ALLMULTI, "IFF_ALLMULTI");
            map.put(IFF_ALTPHYS, "IFF_ALTPHYS");
            map.put(IFF_BROADCAST, "IFF_BROADCAST");
            map.put(IFF_CANTCONFIG, "IFF_CANTCONFIG");
            map.put(IFF_DEBUG, "IFF_DEBUG");
            map.put(IFF_DRV_OACTIVE, "IFF_DRV_OACTIVE");
            map.put(IFF_DRV_RUNNING, "IFF_DRV_RUNNING");
            map.put(IFF_DYING, "IFF_DYING");
            map.put(IFF_LINK0, "IFF_LINK0");
            map.put(IFF_LINK1, "IFF_LINK1");
            map.put(IFF_LINK2, "IFF_LINK2");
            map.put(IFF_LOOPBACK, "IFF_LOOPBACK");
            map.put(IFF_MONITOR, "IFF_MONITOR");
            map.put(IFF_MULTICAST, "IFF_MULTICAST");
            map.put(IFF_NOARP, "IFF_NOARP");
            map.put(IFF_OACTIVE, "IFF_OACTIVE");
            map.put(IFF_POINTOPOINT, "IFF_POINTOPOINT");
            map.put(IFF_PPROMISC, "IFF_PPROMISC");
            map.put(IFF_PROMISC, "IFF_PROMISC");
            map.put(IFF_RENAMING, "IFF_RENAMING");
            map.put(IFF_RUNNING, "IFF_RUNNING");
            map.put(IFF_SIMPLEX, "IFF_SIMPLEX");
            map.put(IFF_STATICARP, "IFF_STATICARP");
            map.put(IFF_UP, "IFF_UP");
            map.put(IFF_CANTCHANGE, "IFF_CANTCHANGE");
            return map;
        }
    }
}

