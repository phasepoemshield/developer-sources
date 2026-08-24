/*
 * Decompiled with CFR 0.152.
 */
package jnr.constants.platform.windows;

import java.util.EnumMap;
import java.util.Map;
import jnr.constants.Constant;

public final class IPProto
extends Enum<IPProto>
implements Constant {
    public static final /* enum */ IPProto IPPROTO_FRAGMENT;
    public static final /* enum */ IPProto IPPROTO_ICMPV6;
    public static final long MIN_VALUE = 0L;
    public static final /* enum */ IPProto IPPROTO_RAW;
    public static final /* enum */ IPProto IPPROTO_SCTP;
    public static final /* enum */ IPProto IPPROTO_PIM;
    public static final /* enum */ IPProto IPPROTO_MAX;
    public static final /* enum */ IPProto IPPROTO_UDP;
    public static final /* enum */ IPProto IPPROTO_EGP;
    public static final /* enum */ IPProto IPPROTO_AH;
    public static final /* enum */ IPProto IPPROTO_PUP;
    public static final /* enum */ IPProto IPPROTO_NONE;
    public static final /* enum */ IPProto IPPROTO_IDP;
    public static final /* enum */ IPProto IPPROTO_IGMP;
    public static final /* enum */ IPProto IPPROTO_DSTOPTS;
    public static final long MAX_VALUE = 256L;
    public static final /* enum */ IPProto IPPROTO_TCP;
    public static final /* enum */ IPProto IPPROTO_IP;
    private final long value;
    public static final /* enum */ IPProto IPPROTO_IPV6;
    public static final /* enum */ IPProto IPPROTO_ROUTING;
    public static final /* enum */ IPProto IPPROTO_ESP;
    public static final /* enum */ IPProto IPPROTO_HOPOPTS;
    private static final /* synthetic */ IPProto[] $VALUES;
    public static final /* enum */ IPProto IPPROTO_ICMP;

    public static IPProto[] values() {
        return (IPProto[])$VALUES.clone();
    }

    @Override
    public final long longValue() {
        return this.value;
    }

    public final int value() {
        return (int)this.value;
    }

    public static IPProto valueOf(String name) {
        return Enum.valueOf(IPProto.class, name);
    }

    private IPProto(long value) {
        this.value = value;
    }

    @Override
    public final boolean defined() {
        return true;
    }

    static {
        IPPROTO_IP = new IPProto(0L);
        IPPROTO_HOPOPTS = new IPProto(0L);
        IPPROTO_ICMP = new IPProto(1L);
        IPPROTO_IGMP = new IPProto(2L);
        IPPROTO_TCP = new IPProto(6L);
        IPPROTO_EGP = new IPProto(8L);
        IPPROTO_PUP = new IPProto(12L);
        IPPROTO_UDP = new IPProto(17L);
        IPPROTO_IDP = new IPProto(22L);
        IPPROTO_IPV6 = new IPProto(41L);
        IPPROTO_ROUTING = new IPProto(43L);
        IPPROTO_FRAGMENT = new IPProto(44L);
        IPPROTO_ESP = new IPProto(50L);
        IPPROTO_AH = new IPProto(51L);
        IPPROTO_ICMPV6 = new IPProto(58L);
        IPPROTO_NONE = new IPProto(59L);
        IPPROTO_DSTOPTS = new IPProto(60L);
        IPPROTO_PIM = new IPProto(103L);
        IPPROTO_SCTP = new IPProto(132L);
        IPPROTO_RAW = new IPProto(255L);
        IPPROTO_MAX = new IPProto(256L);
        IPProto[] iPProtoArray = new IPProto[21];
        iPProtoArray[0] = IPPROTO_IP;
        iPProtoArray[1] = IPPROTO_HOPOPTS;
        iPProtoArray[2] = IPPROTO_ICMP;
        iPProtoArray[3] = IPPROTO_IGMP;
        iPProtoArray[4] = IPPROTO_TCP;
        iPProtoArray[5] = IPPROTO_EGP;
        iPProtoArray[6] = IPPROTO_PUP;
        iPProtoArray[7] = IPPROTO_UDP;
        iPProtoArray[8] = IPPROTO_IDP;
        iPProtoArray[9] = IPPROTO_IPV6;
        iPProtoArray[10] = IPPROTO_ROUTING;
        iPProtoArray[11] = IPPROTO_FRAGMENT;
        iPProtoArray[12] = IPPROTO_ESP;
        iPProtoArray[13] = IPPROTO_AH;
        iPProtoArray[14] = IPPROTO_ICMPV6;
        iPProtoArray[15] = IPPROTO_NONE;
        iPProtoArray[16] = IPPROTO_DSTOPTS;
        iPProtoArray[17] = IPPROTO_PIM;
        iPProtoArray[18] = IPPROTO_SCTP;
        iPProtoArray[19] = IPPROTO_RAW;
        iPProtoArray[20] = IPPROTO_MAX;
        $VALUES = iPProtoArray;
    }

    @Override
    public final int intValue() {
        return (int)this.value;
    }

    public final String toString() {
        return StringTable.descriptions.get(this);
    }

    static final class StringTable {
        public static final Map<IPProto, String> descriptions = StringTable.generateTable();

        public static final Map<IPProto, String> generateTable() {
            EnumMap<IPProto, String> map = new EnumMap<IPProto, String>(IPProto.class);
            map.put(IPPROTO_IP, "IPPROTO_IP");
            map.put(IPPROTO_HOPOPTS, "IPPROTO_HOPOPTS");
            map.put(IPPROTO_ICMP, "IPPROTO_ICMP");
            map.put(IPPROTO_IGMP, "IPPROTO_IGMP");
            map.put(IPPROTO_TCP, "IPPROTO_TCP");
            map.put(IPPROTO_EGP, "IPPROTO_EGP");
            map.put(IPPROTO_PUP, "IPPROTO_PUP");
            map.put(IPPROTO_UDP, "IPPROTO_UDP");
            map.put(IPPROTO_IDP, "IPPROTO_IDP");
            map.put(IPPROTO_IPV6, "IPPROTO_IPV6");
            map.put(IPPROTO_ROUTING, "IPPROTO_ROUTING");
            map.put(IPPROTO_FRAGMENT, "IPPROTO_FRAGMENT");
            map.put(IPPROTO_ESP, "IPPROTO_ESP");
            map.put(IPPROTO_AH, "IPPROTO_AH");
            map.put(IPPROTO_ICMPV6, "IPPROTO_ICMPV6");
            map.put(IPPROTO_NONE, "IPPROTO_NONE");
            map.put(IPPROTO_DSTOPTS, "IPPROTO_DSTOPTS");
            map.put(IPPROTO_PIM, "IPPROTO_PIM");
            map.put(IPPROTO_SCTP, "IPPROTO_SCTP");
            map.put(IPPROTO_RAW, "IPPROTO_RAW");
            map.put(IPPROTO_MAX, "IPPROTO_MAX");
            return map;
        }

        StringTable() {
        }
    }
}

