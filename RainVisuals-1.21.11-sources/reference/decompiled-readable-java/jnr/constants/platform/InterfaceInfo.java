/*
 * Decompiled with CFR 0.152.
 */
package jnr.constants.platform;

import jnr.constants.Constant;
import jnr.constants.platform.ConstantResolver;

public final class InterfaceInfo
extends Enum<InterfaceInfo>
implements Constant {
    public static final /* enum */ InterfaceInfo IFF_802_1Q_VLAN = new InterfaceInfo();
    public static final /* enum */ InterfaceInfo IFF_LINK2;
    public static final /* enum */ InterfaceInfo IFF_STATICARP;
    public static final /* enum */ InterfaceInfo IFF_LINK0;
    public static final /* enum */ InterfaceInfo IFF_BROADCAST;
    public static final /* enum */ InterfaceInfo IFF_PROMISC;
    public static final /* enum */ InterfaceInfo IFF_MASTER_8023AD;
    public static final /* enum */ InterfaceInfo IFF_DISABLE_NETPOLL;
    public static final /* enum */ InterfaceInfo IFF_CANTCONFIG;
    public static final /* enum */ InterfaceInfo IFF_SMART;
    public static final /* enum */ InterfaceInfo IFF_BRIDGE_PORT;
    public static final /* enum */ InterfaceInfo IFF_ECHO;
    public static final /* enum */ InterfaceInfo IFF_EBRIDGE;
    public static final /* enum */ InterfaceInfo IFF_PORTSEL;
    public static final /* enum */ InterfaceInfo IFF_TEAM_PORT;
    public static final /* enum */ InterfaceInfo IFF_ALTPHYS;
    public static final /* enum */ InterfaceInfo IFF_AUTOMEDIA;
    public static final /* enum */ InterfaceInfo IFF_POINTOPOINT;
    public static final /* enum */ InterfaceInfo IFF_PPROMISC;
    public static final /* enum */ InterfaceInfo IFF_LINK1;
    public static final /* enum */ InterfaceInfo IFF_LOOPBACK;
    public static final /* enum */ InterfaceInfo IFF_ISATAP;
    public static final /* enum */ InterfaceInfo IFF_DORMANT;
    public static final /* enum */ InterfaceInfo IFF_OACTIVE;
    public static final /* enum */ InterfaceInfo IFF_MULTICAST;
    public static final /* enum */ InterfaceInfo IFF_UNICAST_FLT;
    public static final /* enum */ InterfaceInfo IFF_SUPP_NOFCS;
    public static final /* enum */ InterfaceInfo IFF_NOTRAILERS;
    public static final /* enum */ InterfaceInfo IFF_MONITOR;
    public static final /* enum */ InterfaceInfo IFF_VOLATILE;
    public static final /* enum */ InterfaceInfo IFF_BONDING;
    public static final /* enum */ InterfaceInfo IFF_DEBUG;
    public static final /* enum */ InterfaceInfo IFF_DYNAMIC;
    public static final /* enum */ InterfaceInfo IFF_SLAVE_NEEDARP;
    public static final /* enum */ InterfaceInfo IFF_RENAMING;
    public static final /* enum */ InterfaceInfo IFF_SLAVE;
    public static final /* enum */ InterfaceInfo IFF_SIMPLEX;
    public static final /* enum */ InterfaceInfo IFF_LOWER_UP;
    public static final /* enum */ InterfaceInfo __UNKNOWN_CONSTANT__;
    public static final /* enum */ InterfaceInfo IFF_UP;
    public static final /* enum */ InterfaceInfo IFF_DONT_BRIDGE;
    private static final /* synthetic */ InterfaceInfo[] $VALUES;
    public static final /* enum */ InterfaceInfo IFF_TX_SKB_SHARING;
    public static final /* enum */ InterfaceInfo IFF_SLAVE_INACTIVE;
    public static final /* enum */ InterfaceInfo IFF_DRV_RUNNING;
    public static final /* enum */ InterfaceInfo IFF_MACVLAN_PORT;
    public static final /* enum */ InterfaceInfo IFF_RUNNING;
    public static final /* enum */ InterfaceInfo IFF_DYING;
    public static final /* enum */ InterfaceInfo IFF_WAN_HDLC;
    private static final ConstantResolver<InterfaceInfo> resolver;
    public static final /* enum */ InterfaceInfo IFF_ALLMULTI;
    public static final /* enum */ InterfaceInfo IFF_DRV_OACTIVE;
    public static final /* enum */ InterfaceInfo IFF_CANTCHANGE;
    public static final /* enum */ InterfaceInfo IFF_MASTER_ARPMON;
    public static final /* enum */ InterfaceInfo IFF_LIVE_ADDR_CHANGE;
    public static final /* enum */ InterfaceInfo IFF_MASTER;
    public static final /* enum */ InterfaceInfo IFF_XMIT_DST_RELEASE;
    public static final /* enum */ InterfaceInfo IFF_MASTER_ALB;
    public static final /* enum */ InterfaceInfo IFF_OVS_DATAPATH;
    public static final /* enum */ InterfaceInfo IFF_ROUTE;
    public static final /* enum */ InterfaceInfo IFF_NOARP;

    public static InterfaceInfo valueOf(String name) {
        return Enum.valueOf(InterfaceInfo.class, name);
    }

    public final int value() {
        return (int)resolver.longValue(this);
    }

    @Override
    public final int intValue() {
        return (int)resolver.longValue(this);
    }

    public static InterfaceInfo valueOf(long value) {
        return resolver.valueOf(value);
    }

    public final String toString() {
        return this.description();
    }

    @Override
    public final boolean defined() {
        return resolver.defined(this);
    }

    @Override
    public final long longValue() {
        return resolver.longValue(this);
    }

    public static InterfaceInfo[] values() {
        return (InterfaceInfo[])$VALUES.clone();
    }

    static {
        IFF_ALLMULTI = new InterfaceInfo();
        IFF_ALTPHYS = new InterfaceInfo();
        IFF_AUTOMEDIA = new InterfaceInfo();
        IFF_BONDING = new InterfaceInfo();
        IFF_BRIDGE_PORT = new InterfaceInfo();
        IFF_BROADCAST = new InterfaceInfo();
        IFF_CANTCONFIG = new InterfaceInfo();
        IFF_DEBUG = new InterfaceInfo();
        IFF_DISABLE_NETPOLL = new InterfaceInfo();
        IFF_DONT_BRIDGE = new InterfaceInfo();
        IFF_DORMANT = new InterfaceInfo();
        IFF_DRV_OACTIVE = new InterfaceInfo();
        IFF_DRV_RUNNING = new InterfaceInfo();
        IFF_DYING = new InterfaceInfo();
        IFF_DYNAMIC = new InterfaceInfo();
        IFF_EBRIDGE = new InterfaceInfo();
        IFF_ECHO = new InterfaceInfo();
        IFF_ISATAP = new InterfaceInfo();
        IFF_LINK0 = new InterfaceInfo();
        IFF_LINK1 = new InterfaceInfo();
        IFF_LINK2 = new InterfaceInfo();
        IFF_LIVE_ADDR_CHANGE = new InterfaceInfo();
        IFF_LOOPBACK = new InterfaceInfo();
        IFF_LOWER_UP = new InterfaceInfo();
        IFF_MACVLAN_PORT = new InterfaceInfo();
        IFF_MASTER = new InterfaceInfo();
        IFF_MASTER_8023AD = new InterfaceInfo();
        IFF_MASTER_ALB = new InterfaceInfo();
        IFF_MASTER_ARPMON = new InterfaceInfo();
        IFF_MONITOR = new InterfaceInfo();
        IFF_MULTICAST = new InterfaceInfo();
        IFF_NOARP = new InterfaceInfo();
        IFF_NOTRAILERS = new InterfaceInfo();
        IFF_OACTIVE = new InterfaceInfo();
        IFF_OVS_DATAPATH = new InterfaceInfo();
        IFF_POINTOPOINT = new InterfaceInfo();
        IFF_PORTSEL = new InterfaceInfo();
        IFF_PPROMISC = new InterfaceInfo();
        IFF_PROMISC = new InterfaceInfo();
        IFF_RENAMING = new InterfaceInfo();
        IFF_ROUTE = new InterfaceInfo();
        IFF_RUNNING = new InterfaceInfo();
        IFF_SIMPLEX = new InterfaceInfo();
        IFF_SLAVE = new InterfaceInfo();
        IFF_SLAVE_INACTIVE = new InterfaceInfo();
        IFF_SLAVE_NEEDARP = new InterfaceInfo();
        IFF_SMART = new InterfaceInfo();
        IFF_STATICARP = new InterfaceInfo();
        IFF_SUPP_NOFCS = new InterfaceInfo();
        IFF_TEAM_PORT = new InterfaceInfo();
        IFF_TX_SKB_SHARING = new InterfaceInfo();
        IFF_UNICAST_FLT = new InterfaceInfo();
        IFF_UP = new InterfaceInfo();
        IFF_WAN_HDLC = new InterfaceInfo();
        IFF_XMIT_DST_RELEASE = new InterfaceInfo();
        IFF_VOLATILE = new InterfaceInfo();
        IFF_CANTCHANGE = new InterfaceInfo();
        __UNKNOWN_CONSTANT__ = new InterfaceInfo();
        InterfaceInfo[] interfaceInfoArray = new InterfaceInfo[59];
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
        interfaceInfoArray[58] = __UNKNOWN_CONSTANT__;
        $VALUES = interfaceInfoArray;
        resolver = ConstantResolver.getResolver(InterfaceInfo.class, 20000, 29999);
    }

    public final String description() {
        return resolver.description(this);
    }
}

