/*
 * Decompiled with CFR 0.152.
 */
package jnr.constants.platform.fake;

import jnr.constants.Constant;

public final class InterfaceInfo
extends Enum<InterfaceInfo>
implements Constant {
    public static final /* enum */ InterfaceInfo IFF_ECHO;
    public static final /* enum */ InterfaceInfo IFF_XMIT_DST_RELEASE;
    public static final /* enum */ InterfaceInfo IFF_DYING;
    public static final /* enum */ InterfaceInfo IFF_EBRIDGE;
    public static final long MIN_VALUE = 1L;
    public static final /* enum */ InterfaceInfo IFF_WAN_HDLC;
    private static final /* synthetic */ InterfaceInfo[] $VALUES;
    public static final /* enum */ InterfaceInfo IFF_SUPP_NOFCS;
    public static final /* enum */ InterfaceInfo IFF_LINK0;
    public static final /* enum */ InterfaceInfo IFF_DRV_RUNNING;
    public static final /* enum */ InterfaceInfo IFF_SLAVE_INACTIVE;
    public static final /* enum */ InterfaceInfo IFF_DISABLE_NETPOLL;
    private final long value;
    public static final /* enum */ InterfaceInfo IFF_BRIDGE_PORT;
    public static final /* enum */ InterfaceInfo IFF_PPROMISC;
    public static final /* enum */ InterfaceInfo IFF_SLAVE;
    public static final long MAX_VALUE = 58L;
    public static final /* enum */ InterfaceInfo IFF_DONT_BRIDGE;
    public static final /* enum */ InterfaceInfo IFF_OVS_DATAPATH;
    public static final /* enum */ InterfaceInfo IFF_BROADCAST;
    public static final /* enum */ InterfaceInfo IFF_SLAVE_NEEDARP;
    public static final /* enum */ InterfaceInfo IFF_VOLATILE;
    public static final /* enum */ InterfaceInfo IFF_802_1Q_VLAN;
    public static final /* enum */ InterfaceInfo IFF_NOARP;
    public static final /* enum */ InterfaceInfo IFF_LINK2;
    public static final /* enum */ InterfaceInfo IFF_CANTCONFIG;
    public static final /* enum */ InterfaceInfo IFF_LOOPBACK;
    public static final /* enum */ InterfaceInfo IFF_DYNAMIC;
    public static final /* enum */ InterfaceInfo IFF_CANTCHANGE;
    public static final /* enum */ InterfaceInfo IFF_AUTOMEDIA;
    public static final /* enum */ InterfaceInfo IFF_NOTRAILERS;
    public static final /* enum */ InterfaceInfo IFF_UNICAST_FLT;
    public static final /* enum */ InterfaceInfo IFF_STATICARP;
    public static final /* enum */ InterfaceInfo IFF_ISATAP;
    public static final /* enum */ InterfaceInfo IFF_DRV_OACTIVE;
    public static final /* enum */ InterfaceInfo IFF_LOWER_UP;
    public static final /* enum */ InterfaceInfo IFF_DEBUG;
    public static final /* enum */ InterfaceInfo IFF_MASTER_ARPMON;
    public static final /* enum */ InterfaceInfo IFF_RENAMING;
    public static final /* enum */ InterfaceInfo IFF_TEAM_PORT;
    public static final /* enum */ InterfaceInfo IFF_ALTPHYS;
    public static final /* enum */ InterfaceInfo IFF_RUNNING;
    public static final /* enum */ InterfaceInfo IFF_POINTOPOINT;
    public static final /* enum */ InterfaceInfo IFF_MASTER;
    public static final /* enum */ InterfaceInfo IFF_OACTIVE;
    public static final /* enum */ InterfaceInfo IFF_MONITOR;
    public static final /* enum */ InterfaceInfo IFF_BONDING;
    public static final /* enum */ InterfaceInfo IFF_SIMPLEX;
    public static final /* enum */ InterfaceInfo IFF_MASTER_8023AD;
    public static final /* enum */ InterfaceInfo IFF_MASTER_ALB;
    public static final /* enum */ InterfaceInfo IFF_SMART;
    public static final /* enum */ InterfaceInfo IFF_TX_SKB_SHARING;
    public static final /* enum */ InterfaceInfo IFF_PORTSEL;
    public static final /* enum */ InterfaceInfo IFF_MULTICAST;
    public static final /* enum */ InterfaceInfo IFF_ALLMULTI;
    public static final /* enum */ InterfaceInfo IFF_ROUTE;
    public static final /* enum */ InterfaceInfo IFF_LIVE_ADDR_CHANGE;
    public static final /* enum */ InterfaceInfo IFF_LINK1;
    public static final /* enum */ InterfaceInfo IFF_DORMANT;
    public static final /* enum */ InterfaceInfo IFF_UP;
    public static final /* enum */ InterfaceInfo IFF_PROMISC;
    public static final /* enum */ InterfaceInfo IFF_MACVLAN_PORT;

    public final int value() {
        return (int)this.value;
    }

    private InterfaceInfo(long value) {
        this.value = value;
    }

    static {
        IFF_802_1Q_VLAN = new InterfaceInfo(1L);
        IFF_ALLMULTI = new InterfaceInfo(2L);
        IFF_ALTPHYS = new InterfaceInfo(3L);
        IFF_AUTOMEDIA = new InterfaceInfo(4L);
        IFF_BONDING = new InterfaceInfo(5L);
        IFF_BRIDGE_PORT = new InterfaceInfo(6L);
        IFF_BROADCAST = new InterfaceInfo(7L);
        IFF_CANTCONFIG = new InterfaceInfo(8L);
        IFF_DEBUG = new InterfaceInfo(9L);
        IFF_DISABLE_NETPOLL = new InterfaceInfo(10L);
        IFF_DONT_BRIDGE = new InterfaceInfo(11L);
        IFF_DORMANT = new InterfaceInfo(12L);
        IFF_DRV_OACTIVE = new InterfaceInfo(13L);
        IFF_DRV_RUNNING = new InterfaceInfo(14L);
        IFF_DYING = new InterfaceInfo(15L);
        IFF_DYNAMIC = new InterfaceInfo(16L);
        IFF_EBRIDGE = new InterfaceInfo(17L);
        IFF_ECHO = new InterfaceInfo(18L);
        IFF_ISATAP = new InterfaceInfo(19L);
        IFF_LINK0 = new InterfaceInfo(20L);
        IFF_LINK1 = new InterfaceInfo(21L);
        IFF_LINK2 = new InterfaceInfo(22L);
        IFF_LIVE_ADDR_CHANGE = new InterfaceInfo(23L);
        IFF_LOOPBACK = new InterfaceInfo(24L);
        IFF_LOWER_UP = new InterfaceInfo(25L);
        IFF_MACVLAN_PORT = new InterfaceInfo(26L);
        IFF_MASTER = new InterfaceInfo(27L);
        IFF_MASTER_8023AD = new InterfaceInfo(28L);
        IFF_MASTER_ALB = new InterfaceInfo(29L);
        IFF_MASTER_ARPMON = new InterfaceInfo(30L);
        IFF_MONITOR = new InterfaceInfo(31L);
        IFF_MULTICAST = new InterfaceInfo(32L);
        IFF_NOARP = new InterfaceInfo(33L);
        IFF_NOTRAILERS = new InterfaceInfo(34L);
        IFF_OACTIVE = new InterfaceInfo(35L);
        IFF_OVS_DATAPATH = new InterfaceInfo(36L);
        IFF_POINTOPOINT = new InterfaceInfo(37L);
        IFF_PORTSEL = new InterfaceInfo(38L);
        IFF_PPROMISC = new InterfaceInfo(39L);
        IFF_PROMISC = new InterfaceInfo(40L);
        IFF_RENAMING = new InterfaceInfo(41L);
        IFF_ROUTE = new InterfaceInfo(42L);
        IFF_RUNNING = new InterfaceInfo(43L);
        IFF_SIMPLEX = new InterfaceInfo(44L);
        IFF_SLAVE = new InterfaceInfo(45L);
        IFF_SLAVE_INACTIVE = new InterfaceInfo(46L);
        IFF_SLAVE_NEEDARP = new InterfaceInfo(47L);
        IFF_SMART = new InterfaceInfo(48L);
        IFF_STATICARP = new InterfaceInfo(49L);
        IFF_SUPP_NOFCS = new InterfaceInfo(50L);
        IFF_TEAM_PORT = new InterfaceInfo(51L);
        IFF_TX_SKB_SHARING = new InterfaceInfo(52L);
        IFF_UNICAST_FLT = new InterfaceInfo(53L);
        IFF_UP = new InterfaceInfo(54L);
        IFF_WAN_HDLC = new InterfaceInfo(55L);
        IFF_XMIT_DST_RELEASE = new InterfaceInfo(56L);
        IFF_VOLATILE = new InterfaceInfo(57L);
        IFF_CANTCHANGE = new InterfaceInfo(58L);
        InterfaceInfo[] interfaceInfoArray = new InterfaceInfo[58];
        interfaceInfoArray[0] = IFF_802_1Q_VLAN;
        interfaceInfoArray[1] = IFF_ALLMULTI;
        interfaceInfoArray[2] = IFF_ALTPHYS;
        interfaceInfoArray[3] = IFF_AUTOMEDIA;
        interfaceInfoArray[4] = IFF_BONDING;
        interfaceInfoArray[5] = IFF_BRIDGE_PORT;
        interfaceInfoArray[6] = IFF_BROADCAST;
        interfaceInfoArray[7] = IFF_CANTCONFIG;
        interfaceInfoArray[8] = IFF_DEBUG;
        interfaceInfoArray[9] = IFF_DISABLE_NETPOLL;
        interfaceInfoArray[10] = IFF_DONT_BRIDGE;
        interfaceInfoArray[11] = IFF_DORMANT;
        interfaceInfoArray[12] = IFF_DRV_OACTIVE;
        interfaceInfoArray[13] = IFF_DRV_RUNNING;
        interfaceInfoArray[14] = IFF_DYING;
        interfaceInfoArray[15] = IFF_DYNAMIC;
        interfaceInfoArray[16] = IFF_EBRIDGE;
        interfaceInfoArray[17] = IFF_ECHO;
        interfaceInfoArray[18] = IFF_ISATAP;
        interfaceInfoArray[19] = IFF_LINK0;
        interfaceInfoArray[20] = IFF_LINK1;
        interfaceInfoArray[21] = IFF_LINK2;
        interfaceInfoArray[22] = IFF_LIVE_ADDR_CHANGE;
        interfaceInfoArray[23] = IFF_LOOPBACK;
        interfaceInfoArray[24] = IFF_LOWER_UP;
        interfaceInfoArray[25] = IFF_MACVLAN_PORT;
        interfaceInfoArray[26] = IFF_MASTER;
        interfaceInfoArray[27] = IFF_MASTER_8023AD;
        interfaceInfoArray[28] = IFF_MASTER_ALB;
        interfaceInfoArray[29] = IFF_MASTER_ARPMON;
        interfaceInfoArray[30] = IFF_MONITOR;
        interfaceInfoArray[31] = IFF_MULTICAST;
        interfaceInfoArray[32] = IFF_NOARP;
        interfaceInfoArray[33] = IFF_NOTRAILERS;
        interfaceInfoArray[34] = IFF_OACTIVE;
        interfaceInfoArray[35] = IFF_OVS_DATAPATH;
        interfaceInfoArray[36] = IFF_POINTOPOINT;
        interfaceInfoArray[37] = IFF_PORTSEL;
        interfaceInfoArray[38] = IFF_PPROMISC;
        interfaceInfoArray[39] = IFF_PROMISC;
        interfaceInfoArray[40] = IFF_RENAMING;
        interfaceInfoArray[41] = IFF_ROUTE;
        interfaceInfoArray[42] = IFF_RUNNING;
        interfaceInfoArray[43] = IFF_SIMPLEX;
        interfaceInfoArray[44] = IFF_SLAVE;
        interfaceInfoArray[45] = IFF_SLAVE_INACTIVE;
        interfaceInfoArray[46] = IFF_SLAVE_NEEDARP;
        interfaceInfoArray[47] = IFF_SMART;
        interfaceInfoArray[48] = IFF_STATICARP;
        interfaceInfoArray[49] = IFF_SUPP_NOFCS;
        interfaceInfoArray[50] = IFF_TEAM_PORT;
        interfaceInfoArray[51] = IFF_TX_SKB_SHARING;
        interfaceInfoArray[52] = IFF_UNICAST_FLT;
        interfaceInfoArray[53] = IFF_UP;
        interfaceInfoArray[54] = IFF_WAN_HDLC;
        interfaceInfoArray[55] = IFF_XMIT_DST_RELEASE;
        interfaceInfoArray[56] = IFF_VOLATILE;
        interfaceInfoArray[57] = IFF_CANTCHANGE;
        $VALUES = interfaceInfoArray;
    }

    public static InterfaceInfo[] values() {
        return (InterfaceInfo[])$VALUES.clone();
    }

    public static InterfaceInfo valueOf(String name) {
        return Enum.valueOf(InterfaceInfo.class, name);
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
}

