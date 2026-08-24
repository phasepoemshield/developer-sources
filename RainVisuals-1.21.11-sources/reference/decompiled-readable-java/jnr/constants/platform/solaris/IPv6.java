/*
 * Decompiled with CFR 0.152.
 */
package jnr.constants.platform.solaris;

import java.util.EnumMap;
import java.util.Map;
import jnr.constants.Constant;

public final class IPv6
extends Enum<IPv6>
implements Constant {
    public static final /* enum */ IPv6 IPV6_RECVHOPOPTS;
    private final long value;
    public static final /* enum */ IPv6 IPV6_HOPOPTS;
    public static final /* enum */ IPv6 IPV6_CHECKSUM;
    public static final /* enum */ IPv6 IPV6_HOPLIMIT;
    public static final /* enum */ IPv6 IPV6_RTHDR;
    public static final /* enum */ IPv6 IPV6_USE_MIN_MTU;
    public static final /* enum */ IPv6 IPV6_RECVDSTOPTS;
    public static final /* enum */ IPv6 IPV6_MULTICAST_HOPS;
    public static final /* enum */ IPv6 IPV6_MULTICAST_IF;
    public static final /* enum */ IPv6 IPV6_V6ONLY;
    public static final /* enum */ IPv6 IPV6_RTHDR_TYPE_0;
    public static final /* enum */ IPv6 IPV6_RECVRTHDR;
    public static final /* enum */ IPv6 IPV6_RECVTCLASS;
    public static final /* enum */ IPv6 IPV6_PKTINFO;
    public static final /* enum */ IPv6 IPV6_NEXTHOP;
    public static final /* enum */ IPv6 IPV6_MULTICAST_LOOP;
    public static final /* enum */ IPv6 IPV6_RECVPATHMTU;
    public static final /* enum */ IPv6 IPV6_TCLASS;
    public static final /* enum */ IPv6 IPV6_UNICAST_HOPS;
    public static final /* enum */ IPv6 IPV6_DONTFRAG;
    public static final /* enum */ IPv6 IPV6_DSTOPTS;
    public static final long MIN_VALUE = 0L;
    public static final /* enum */ IPv6 IPV6_LEAVE_GROUP;
    public static final long MAX_VALUE = 40L;
    private static final /* synthetic */ IPv6[] $VALUES;
    public static final /* enum */ IPv6 IPV6_RTHDRDSTOPTS;
    public static final /* enum */ IPv6 IPV6_RECVPKTINFO;
    public static final /* enum */ IPv6 IPV6_PATHMTU;
    public static final /* enum */ IPv6 IPV6_RECVHOPLIMIT;
    public static final /* enum */ IPv6 IPV6_JOIN_GROUP;

    @Override
    public final boolean defined() {
        return true;
    }

    @Override
    public final long longValue() {
        return this.value;
    }

    @Override
    public final int intValue() {
        return (int)this.value;
    }

    public final int value() {
        return (int)this.value;
    }

    private IPv6(long value) {
        this.value = value;
    }

    static {
        IPV6_JOIN_GROUP = new IPv6(9L);
        IPV6_LEAVE_GROUP = new IPv6(10L);
        IPV6_MULTICAST_HOPS = new IPv6(7L);
        IPV6_MULTICAST_IF = new IPv6(6L);
        IPV6_MULTICAST_LOOP = new IPv6(8L);
        IPV6_UNICAST_HOPS = new IPv6(5L);
        IPV6_V6ONLY = new IPv6(39L);
        IPV6_CHECKSUM = new IPv6(24L);
        IPV6_DONTFRAG = new IPv6(33L);
        IPV6_DSTOPTS = new IPv6(15L);
        IPV6_HOPLIMIT = new IPv6(12L);
        IPV6_HOPOPTS = new IPv6(14L);
        IPV6_NEXTHOP = new IPv6(13L);
        IPV6_PATHMTU = new IPv6(37L);
        IPV6_PKTINFO = new IPv6(11L);
        IPV6_RECVDSTOPTS = new IPv6(40L);
        IPV6_RECVHOPLIMIT = new IPv6(19L);
        IPV6_RECVHOPOPTS = new IPv6(20L);
        IPV6_RECVPKTINFO = new IPv6(18L);
        IPV6_RECVRTHDR = new IPv6(22L);
        IPV6_RECVTCLASS = new IPv6(25L);
        IPV6_RTHDR = new IPv6(16L);
        IPV6_RTHDRDSTOPTS = new IPv6(17L);
        IPV6_RTHDR_TYPE_0 = new IPv6(0L);
        IPV6_RECVPATHMTU = new IPv6(36L);
        IPV6_TCLASS = new IPv6(38L);
        IPV6_USE_MIN_MTU = new IPv6(32L);
        IPv6[] iPv6Array = new IPv6[27];
        iPv6Array[0] = IPV6_JOIN_GROUP;
        iPv6Array[1] = IPV6_LEAVE_GROUP;
        iPv6Array[2] = IPV6_MULTICAST_HOPS;
        iPv6Array[3] = IPV6_MULTICAST_IF;
        iPv6Array[4] = IPV6_MULTICAST_LOOP;
        iPv6Array[5] = IPV6_UNICAST_HOPS;
        iPv6Array[6] = IPV6_V6ONLY;
        iPv6Array[7] = IPV6_CHECKSUM;
        iPv6Array[8] = IPV6_DONTFRAG;
        iPv6Array[9] = IPV6_DSTOPTS;
        iPv6Array[10] = IPV6_HOPLIMIT;
        iPv6Array[11] = IPV6_HOPOPTS;
        iPv6Array[12] = IPV6_NEXTHOP;
        iPv6Array[13] = IPV6_PATHMTU;
        iPv6Array[14] = IPV6_PKTINFO;
        iPv6Array[15] = IPV6_RECVDSTOPTS;
        iPv6Array[16] = IPV6_RECVHOPLIMIT;
        iPv6Array[17] = IPV6_RECVHOPOPTS;
        iPv6Array[18] = IPV6_RECVPKTINFO;
        iPv6Array[19] = IPV6_RECVRTHDR;
        iPv6Array[20] = IPV6_RECVTCLASS;
        iPv6Array[21] = IPV6_RTHDR;
        iPv6Array[22] = IPV6_RTHDRDSTOPTS;
        iPv6Array[23] = IPV6_RTHDR_TYPE_0;
        iPv6Array[24] = IPV6_RECVPATHMTU;
        iPv6Array[25] = IPV6_TCLASS;
        iPv6Array[26] = IPV6_USE_MIN_MTU;
        $VALUES = iPv6Array;
    }

    public static IPv6[] values() {
        return (IPv6[])$VALUES.clone();
    }

    public final String toString() {
        return StringTable.descriptions.get(this);
    }

    public static IPv6 valueOf(String name) {
        return Enum.valueOf(IPv6.class, name);
    }

    static final class StringTable {
        public static final Map<IPv6, String> descriptions = StringTable.generateTable();

        public static final Map<IPv6, String> generateTable() {
            EnumMap<IPv6, String> map = new EnumMap<IPv6, String>(IPv6.class);
            map.put(IPV6_JOIN_GROUP, "IPV6_JOIN_GROUP");
            map.put(IPV6_LEAVE_GROUP, "IPV6_LEAVE_GROUP");
            map.put(IPV6_MULTICAST_HOPS, "IPV6_MULTICAST_HOPS");
            map.put(IPV6_MULTICAST_IF, "IPV6_MULTICAST_IF");
            map.put(IPV6_MULTICAST_LOOP, "IPV6_MULTICAST_LOOP");
            map.put(IPV6_UNICAST_HOPS, "IPV6_UNICAST_HOPS");
            map.put(IPV6_V6ONLY, "IPV6_V6ONLY");
            map.put(IPV6_CHECKSUM, "IPV6_CHECKSUM");
            map.put(IPV6_DONTFRAG, "IPV6_DONTFRAG");
            map.put(IPV6_DSTOPTS, "IPV6_DSTOPTS");
            map.put(IPV6_HOPLIMIT, "IPV6_HOPLIMIT");
            map.put(IPV6_HOPOPTS, "IPV6_HOPOPTS");
            map.put(IPV6_NEXTHOP, "IPV6_NEXTHOP");
            map.put(IPV6_PATHMTU, "IPV6_PATHMTU");
            map.put(IPV6_PKTINFO, "IPV6_PKTINFO");
            map.put(IPV6_RECVDSTOPTS, "IPV6_RECVDSTOPTS");
            map.put(IPV6_RECVHOPLIMIT, "IPV6_RECVHOPLIMIT");
            map.put(IPV6_RECVHOPOPTS, "IPV6_RECVHOPOPTS");
            map.put(IPV6_RECVPKTINFO, "IPV6_RECVPKTINFO");
            map.put(IPV6_RECVRTHDR, "IPV6_RECVRTHDR");
            map.put(IPV6_RECVTCLASS, "IPV6_RECVTCLASS");
            map.put(IPV6_RTHDR, "IPV6_RTHDR");
            map.put(IPV6_RTHDRDSTOPTS, "IPV6_RTHDRDSTOPTS");
            map.put(IPV6_RTHDR_TYPE_0, "IPV6_RTHDR_TYPE_0");
            map.put(IPV6_RECVPATHMTU, "IPV6_RECVPATHMTU");
            map.put(IPV6_TCLASS, "IPV6_TCLASS");
            map.put(IPV6_USE_MIN_MTU, "IPV6_USE_MIN_MTU");
            return map;
        }

        StringTable() {
        }
    }
}

