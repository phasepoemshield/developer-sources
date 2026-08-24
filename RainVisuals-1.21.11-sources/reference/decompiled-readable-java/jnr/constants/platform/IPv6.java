/*
 * Decompiled with CFR 0.152.
 */
package jnr.constants.platform;

import jnr.constants.Constant;
import jnr.constants.platform.ConstantResolver;

public final class IPv6
extends Enum<IPv6>
implements Constant {
    public static final /* enum */ IPv6 IPV6_RTHDR_TYPE_0;
    public static final /* enum */ IPv6 IPV6_RECVHOPOPTS;
    public static final /* enum */ IPv6 IPV6_DSTOPTS;
    public static final /* enum */ IPv6 IPV6_LEAVE_GROUP;
    public static final /* enum */ IPv6 IPV6_RECVHOPLIMIT;
    private static final /* synthetic */ IPv6[] $VALUES;
    public static final /* enum */ IPv6 IPV6_HOPOPTS;
    public static final /* enum */ IPv6 IPV6_PKTINFO;
    public static final /* enum */ IPv6 IPV6_RTHDR;
    private static final ConstantResolver<IPv6> resolver;
    public static final /* enum */ IPv6 IPV6_PATHMTU;
    public static final /* enum */ IPv6 __UNKNOWN_CONSTANT__;
    public static final /* enum */ IPv6 IPV6_MULTICAST_IF;
    public static final /* enum */ IPv6 IPV6_CHECKSUM;
    public static final /* enum */ IPv6 IPV6_RECVPKTINFO;
    public static final /* enum */ IPv6 IPV6_RECVTCLASS;
    public static final /* enum */ IPv6 IPV6_USE_MIN_MTU;
    public static final /* enum */ IPv6 IPV6_HOPLIMIT;
    public static final /* enum */ IPv6 IPV6_MULTICAST_HOPS;
    public static final /* enum */ IPv6 IPV6_RECVDSTOPTS;
    public static final /* enum */ IPv6 IPV6_NEXTHOP;
    public static final /* enum */ IPv6 IPV6_V6ONLY;
    public static final /* enum */ IPv6 IPV6_UNICAST_HOPS;
    public static final /* enum */ IPv6 IPV6_DONTFRAG;
    public static final /* enum */ IPv6 IPV6_TCLASS;
    public static final /* enum */ IPv6 IPV6_RECVRTHDR;
    public static final /* enum */ IPv6 IPV6_RTHDRDSTOPTS;
    public static final /* enum */ IPv6 IPV6_RECVPATHMTU;
    public static final /* enum */ IPv6 IPV6_MULTICAST_LOOP;
    public static final /* enum */ IPv6 IPV6_JOIN_GROUP;

    public static IPv6[] values() {
        return (IPv6[])$VALUES.clone();
    }

    public final int value() {
        return (int)resolver.longValue(this);
    }

    @Override
    public final boolean defined() {
        return resolver.defined(this);
    }

    public final String description() {
        return resolver.description(this);
    }

    public static IPv6 valueOf(String name) {
        return Enum.valueOf(IPv6.class, name);
    }

    @Override
    public final int intValue() {
        return (int)resolver.longValue(this);
    }

    public static IPv6 valueOf(long value) {
        return resolver.valueOf(value);
    }

    @Override
    public final long longValue() {
        return resolver.longValue(this);
    }

    static {
        IPV6_JOIN_GROUP = new IPv6();
        IPV6_LEAVE_GROUP = new IPv6();
        IPV6_MULTICAST_HOPS = new IPv6();
        IPV6_MULTICAST_IF = new IPv6();
        IPV6_MULTICAST_LOOP = new IPv6();
        IPV6_UNICAST_HOPS = new IPv6();
        IPV6_V6ONLY = new IPv6();
        IPV6_CHECKSUM = new IPv6();
        IPV6_DONTFRAG = new IPv6();
        IPV6_DSTOPTS = new IPv6();
        IPV6_HOPLIMIT = new IPv6();
        IPV6_HOPOPTS = new IPv6();
        IPV6_NEXTHOP = new IPv6();
        IPV6_PATHMTU = new IPv6();
        IPV6_PKTINFO = new IPv6();
        IPV6_RECVDSTOPTS = new IPv6();
        IPV6_RECVHOPLIMIT = new IPv6();
        IPV6_RECVHOPOPTS = new IPv6();
        IPV6_RECVPKTINFO = new IPv6();
        IPV6_RECVRTHDR = new IPv6();
        IPV6_RECVTCLASS = new IPv6();
        IPV6_RTHDR = new IPv6();
        IPV6_RTHDRDSTOPTS = new IPv6();
        IPV6_RTHDR_TYPE_0 = new IPv6();
        IPV6_RECVPATHMTU = new IPv6();
        IPV6_TCLASS = new IPv6();
        IPV6_USE_MIN_MTU = new IPv6();
        __UNKNOWN_CONSTANT__ = new IPv6();
        IPv6[] iPv6Array = new IPv6[28];
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
        iPv6Array[27] = __UNKNOWN_CONSTANT__;
        $VALUES = iPv6Array;
        resolver = ConstantResolver.getResolver(IPv6.class, 20000, 29999);
    }

    public final String toString() {
        return this.description();
    }
}

