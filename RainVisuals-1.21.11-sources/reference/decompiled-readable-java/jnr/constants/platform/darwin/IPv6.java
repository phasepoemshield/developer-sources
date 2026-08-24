/*
 * Decompiled with CFR 0.152.
 */
package jnr.constants.platform.darwin;

import java.util.EnumMap;
import java.util.Map;
import jnr.constants.Constant;

public final class IPv6
extends Enum<IPv6>
implements Constant {
    private final long value;
    public static final /* enum */ IPv6 IPV6_MULTICAST_LOOP;
    public static final /* enum */ IPv6 IPV6_MULTICAST_IF;
    public static final /* enum */ IPv6 IPV6_CHECKSUM;
    public static final /* enum */ IPv6 IPV6_TCLASS;
    public static final /* enum */ IPv6 IPV6_MULTICAST_HOPS;
    public static final /* enum */ IPv6 IPV6_V6ONLY;
    public static final /* enum */ IPv6 IPV6_UNICAST_HOPS;
    private static final /* synthetic */ IPv6[] $VALUES;
    public static final /* enum */ IPv6 IPV6_LEAVE_GROUP;
    public static final long MAX_VALUE = 36L;
    public static final /* enum */ IPv6 IPV6_RECVTCLASS;
    public static final long MIN_VALUE = 0L;
    public static final /* enum */ IPv6 IPV6_JOIN_GROUP;
    public static final /* enum */ IPv6 IPV6_RTHDR_TYPE_0;

    public static IPv6[] values() {
        return (IPv6[])$VALUES.clone();
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
        IPV6_RECVTCLASS = new IPv6(35L);
        IPV6_RTHDR_TYPE_0 = new IPv6(0L);
        IPV6_TCLASS = new IPv6(36L);
        IPv6[] iPv6Array = new IPv6[11];
        iPv6Array[0] = IPV6_JOIN_GROUP;
        iPv6Array[1] = IPV6_LEAVE_GROUP;
        iPv6Array[2] = IPV6_MULTICAST_HOPS;
        iPv6Array[3] = IPV6_MULTICAST_IF;
        iPv6Array[4] = IPV6_MULTICAST_LOOP;
        iPv6Array[5] = IPV6_UNICAST_HOPS;
        iPv6Array[6] = IPV6_V6ONLY;
        iPv6Array[7] = IPV6_CHECKSUM;
        iPv6Array[8] = IPV6_RECVTCLASS;
        iPv6Array[9] = IPV6_RTHDR_TYPE_0;
        iPv6Array[10] = IPV6_TCLASS;
        $VALUES = iPv6Array;
    }

    @Override
    public final int intValue() {
        return (int)this.value;
    }

    public static IPv6 valueOf(String name) {
        return Enum.valueOf(IPv6.class, name);
    }

    @Override
    public final boolean defined() {
        return true;
    }

    private IPv6(long value) {
        this.value = value;
    }

    public final String toString() {
        return StringTable.descriptions.get(this);
    }

    @Override
    public final long longValue() {
        return this.value;
    }

    public final int value() {
        return (int)this.value;
    }

    static final class StringTable {
        public static final Map<IPv6, String> descriptions = StringTable.generateTable();

        StringTable() {
        }

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
            map.put(IPV6_RECVTCLASS, "IPV6_RECVTCLASS");
            map.put(IPV6_RTHDR_TYPE_0, "IPV6_RTHDR_TYPE_0");
            map.put(IPV6_TCLASS, "IPV6_TCLASS");
            return map;
        }
    }
}

