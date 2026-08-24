/*
 * Decompiled with CFR 0.152.
 */
package jnr.constants.platform.windows;

import java.util.EnumMap;
import java.util.Map;
import jnr.constants.Constant;

public final class IPv6
extends Enum<IPv6>
implements Constant {
    public static final /* enum */ IPv6 IPV6_MULTICAST_HOPS;
    public static final long MIN_VALUE = 1L;
    public static final /* enum */ IPv6 IPV6_V6ONLY;
    private static final /* synthetic */ IPv6[] $VALUES;
    public static final /* enum */ IPv6 IPV6_CHECKSUM;
    public static final /* enum */ IPv6 IPV6_HOPLIMIT;
    public static final /* enum */ IPv6 IPV6_MULTICAST_LOOP;
    public static final /* enum */ IPv6 IPV6_HOPOPTS;
    public static final /* enum */ IPv6 IPV6_JOIN_GROUP;
    public static final /* enum */ IPv6 IPV6_RECVRTHDR;
    private final long value;
    public static final /* enum */ IPv6 IPV6_UNICAST_HOPS;
    public static final /* enum */ IPv6 IPV6_PKTINFO;
    public static final /* enum */ IPv6 IPV6_LEAVE_GROUP;
    public static final long MAX_VALUE = 40L;
    public static final /* enum */ IPv6 IPV6_RTHDR;
    public static final /* enum */ IPv6 IPV6_RECVTCLASS;
    public static final /* enum */ IPv6 IPV6_MULTICAST_IF;
    public static final /* enum */ IPv6 IPV6_TCLASS;
    public static final /* enum */ IPv6 IPV6_DONTFRAG;

    public final String toString() {
        return StringTable.descriptions.get(this);
    }

    public static IPv6 valueOf(String name) {
        return Enum.valueOf(IPv6.class, name);
    }

    @Override
    public final long longValue() {
        return this.value;
    }

    static {
        IPV6_JOIN_GROUP = new IPv6(12L);
        IPV6_LEAVE_GROUP = new IPv6(13L);
        IPV6_MULTICAST_HOPS = new IPv6(10L);
        IPV6_MULTICAST_IF = new IPv6(9L);
        IPV6_MULTICAST_LOOP = new IPv6(11L);
        IPV6_UNICAST_HOPS = new IPv6(4L);
        IPV6_V6ONLY = new IPv6(27L);
        IPV6_CHECKSUM = new IPv6(26L);
        IPV6_DONTFRAG = new IPv6(14L);
        IPV6_HOPLIMIT = new IPv6(21L);
        IPV6_HOPOPTS = new IPv6(1L);
        IPV6_PKTINFO = new IPv6(19L);
        IPV6_RECVRTHDR = new IPv6(38L);
        IPV6_RECVTCLASS = new IPv6(40L);
        IPV6_RTHDR = new IPv6(32L);
        IPV6_TCLASS = new IPv6(39L);
        IPv6[] iPv6Array = new IPv6[16];
        iPv6Array[0] = IPV6_JOIN_GROUP;
        iPv6Array[1] = IPV6_LEAVE_GROUP;
        iPv6Array[2] = IPV6_MULTICAST_HOPS;
        iPv6Array[3] = IPV6_MULTICAST_IF;
        iPv6Array[4] = IPV6_MULTICAST_LOOP;
        iPv6Array[5] = IPV6_UNICAST_HOPS;
        iPv6Array[6] = IPV6_V6ONLY;
        iPv6Array[7] = IPV6_CHECKSUM;
        iPv6Array[8] = IPV6_DONTFRAG;
        iPv6Array[9] = IPV6_HOPLIMIT;
        iPv6Array[10] = IPV6_HOPOPTS;
        iPv6Array[11] = IPV6_PKTINFO;
        iPv6Array[12] = IPV6_RECVRTHDR;
        iPv6Array[13] = IPV6_RECVTCLASS;
        iPv6Array[14] = IPV6_RTHDR;
        iPv6Array[15] = IPV6_TCLASS;
        $VALUES = iPv6Array;
    }

    private IPv6(long value) {
        this.value = value;
    }

    @Override
    public final int intValue() {
        return (int)this.value;
    }

    public static IPv6[] values() {
        return (IPv6[])$VALUES.clone();
    }

    public final int value() {
        return (int)this.value;
    }

    @Override
    public final boolean defined() {
        return true;
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
            map.put(IPV6_HOPLIMIT, "IPV6_HOPLIMIT");
            map.put(IPV6_HOPOPTS, "IPV6_HOPOPTS");
            map.put(IPV6_PKTINFO, "IPV6_PKTINFO");
            map.put(IPV6_RECVRTHDR, "IPV6_RECVRTHDR");
            map.put(IPV6_RECVTCLASS, "IPV6_RECVTCLASS");
            map.put(IPV6_RTHDR, "IPV6_RTHDR");
            map.put(IPV6_TCLASS, "IPV6_TCLASS");
            return map;
        }

        StringTable() {
        }
    }
}

