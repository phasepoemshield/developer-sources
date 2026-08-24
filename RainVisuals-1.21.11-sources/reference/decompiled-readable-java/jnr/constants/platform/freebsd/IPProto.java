/*
 * Decompiled with CFR 0.152.
 */
package jnr.constants.platform.freebsd;

import java.util.EnumMap;
import java.util.Map;
import jnr.constants.Constant;

public final class IPProto
extends Enum<IPProto>
implements Constant {
    public static final /* enum */ IPProto IPPROTO_EGP;
    public static final /* enum */ IPProto IPPROTO_ICMPV6;
    public static final /* enum */ IPProto IPPROTO_PUP;
    public static final /* enum */ IPProto IPPROTO_HOPOPTS;
    public static final long MIN_VALUE = 0L;
    public static final /* enum */ IPProto IPPROTO_RAW;
    public static final /* enum */ IPProto IPPROTO_IDP;
    public static final /* enum */ IPProto IPPROTO_TP;
    public static final /* enum */ IPProto IPPROTO_TCP;
    private static final /* synthetic */ IPProto[] $VALUES;
    public static final /* enum */ IPProto IPPROTO_ROUTING;
    public static final /* enum */ IPProto IPPROTO_DSTOPTS;
    public static final /* enum */ IPProto IPPROTO_NONE;
    public static final /* enum */ IPProto IPPROTO_IPIP;
    public static final /* enum */ IPProto IPPROTO_RSVP;
    public static final /* enum */ IPProto IPPROTO_ICMP;
    public static final long MAX_VALUE = 256L;
    public static final /* enum */ IPProto IPPROTO_IPV6;
    public static final /* enum */ IPProto IPPROTO_IGMP;
    private final long value;
    public static final /* enum */ IPProto IPPROTO_MTP;
    public static final /* enum */ IPProto IPPROTO_GRE;
    public static final /* enum */ IPProto IPPROTO_IP;
    public static final /* enum */ IPProto IPPROTO_AH;
    public static final /* enum */ IPProto IPPROTO_PIM;
    public static final /* enum */ IPProto IPPROTO_ENCAP;
    public static final /* enum */ IPProto IPPROTO_SCTP;
    public static final /* enum */ IPProto IPPROTO_FRAGMENT;
    public static final /* enum */ IPProto IPPROTO_MAX;
    public static final /* enum */ IPProto IPPROTO_UDP;
    public static final /* enum */ IPProto IPPROTO_ESP;

    public static IPProto valueOf(String name) {
        return Enum.valueOf(IPProto.class, name);
    }

    public final String toString() {
        return StringTable.descriptions.get(this);
    }

    static {
        IPPROTO_IP = new IPProto(0L);
        IPPROTO_HOPOPTS = new IPProto(0L);
        IPPROTO_ICMP = new IPProto(1L);
        IPPROTO_IGMP = new IPProto(2L);
        IPPROTO_IPIP = new IPProto(4L);
        IPPROTO_TCP = new IPProto(6L);
        IPPROTO_EGP = new IPProto(8L);
        IPPROTO_PUP = new IPProto(12L);
        IPPROTO_UDP = new IPProto(17L);
        IPPROTO_IDP = new IPProto(22L);
        IPPROTO_TP = new IPProto(29L);
        IPPROTO_IPV6 = new IPProto(41L);
        IPPROTO_ROUTING = new IPProto(43L);
        IPPROTO_FRAGMENT = new IPProto(44L);
        IPPROTO_RSVP = new IPProto(46L);
        IPPROTO_GRE = new IPProto(47L);
        IPPROTO_ESP = new IPProto(50L);
        IPPROTO_AH = new IPProto(51L);
        IPPROTO_ICMPV6 = new IPProto(58L);
        IPPROTO_NONE = new IPProto(59L);
        IPPROTO_DSTOPTS = new IPProto(60L);
        IPPROTO_MTP = new IPProto(92L);
        IPPROTO_ENCAP = new IPProto(98L);
        IPPROTO_PIM = new IPProto(103L);
        IPPROTO_SCTP = new IPProto(132L);
        IPPROTO_RAW = new IPProto(255L);
        IPPROTO_MAX = new IPProto(256L);
        IPProto[] iPProtoArray = new IPProto[27];
        iPProtoArray[0] = IPPROTO_IP;
        iPProtoArray[1] = IPPROTO_HOPOPTS;
        iPProtoArray[2] = IPPROTO_ICMP;
        iPProtoArray[3] = IPPROTO_IGMP;
        iPProtoArray[4] = IPPROTO_IPIP;
        iPProtoArray[5] = IPPROTO_TCP;
        iPProtoArray[6] = IPPROTO_EGP;
        iPProtoArray[7] = IPPROTO_PUP;
        iPProtoArray[8] = IPPROTO_UDP;
        iPProtoArray[9] = IPPROTO_IDP;
        iPProtoArray[10] = IPPROTO_TP;
        iPProtoArray[11] = IPPROTO_IPV6;
        iPProtoArray[12] = IPPROTO_ROUTING;
        iPProtoArray[13] = IPPROTO_FRAGMENT;
        iPProtoArray[14] = IPPROTO_RSVP;
        iPProtoArray[15] = IPPROTO_GRE;
        iPProtoArray[16] = IPPROTO_ESP;
        iPProtoArray[17] = IPPROTO_AH;
        iPProtoArray[18] = IPPROTO_ICMPV6;
        iPProtoArray[19] = IPPROTO_NONE;
        iPProtoArray[20] = IPPROTO_DSTOPTS;
        iPProtoArray[21] = IPPROTO_MTP;
        iPProtoArray[22] = IPPROTO_ENCAP;
        iPProtoArray[23] = IPPROTO_PIM;
        iPProtoArray[24] = IPPROTO_SCTP;
        iPProtoArray[25] = IPPROTO_RAW;
        iPProtoArray[26] = IPPROTO_MAX;
        $VALUES = iPProtoArray;
    }

    public static IPProto[] values() {
        return (IPProto[])$VALUES.clone();
    }

    public final int value() {
        return (int)this.value;
    }

    @Override
    public final boolean defined() {
        return true;
    }

    private IPProto(long value) {
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

    static final class StringTable {
        public static final Map<IPProto, String> descriptions = StringTable.generateTable();

        public static final Map<IPProto, String> generateTable() {
            EnumMap<IPProto, String> map = new EnumMap<IPProto, String>(IPProto.class);
            map.put(IPPROTO_IP, "IPPROTO_IP");
            map.put(IPPROTO_HOPOPTS, "IPPROTO_HOPOPTS");
            map.put(IPPROTO_ICMP, "IPPROTO_ICMP");
            map.put(IPPROTO_IGMP, "IPPROTO_IGMP");
            map.put(IPPROTO_IPIP, "IPPROTO_IPIP");
            map.put(IPPROTO_TCP, "IPPROTO_TCP");
            map.put(IPPROTO_EGP, "IPPROTO_EGP");
            map.put(IPPROTO_PUP, "IPPROTO_PUP");
            map.put(IPPROTO_UDP, "IPPROTO_UDP");
            map.put(IPPROTO_IDP, "IPPROTO_IDP");
            map.put(IPPROTO_TP, "IPPROTO_TP");
            map.put(IPPROTO_IPV6, "IPPROTO_IPV6");
            map.put(IPPROTO_ROUTING, "IPPROTO_ROUTING");
            map.put(IPPROTO_FRAGMENT, "IPPROTO_FRAGMENT");
            map.put(IPPROTO_RSVP, "IPPROTO_RSVP");
            map.put(IPPROTO_GRE, "IPPROTO_GRE");
            map.put(IPPROTO_ESP, "IPPROTO_ESP");
            map.put(IPPROTO_AH, "IPPROTO_AH");
            map.put(IPPROTO_ICMPV6, "IPPROTO_ICMPV6");
            map.put(IPPROTO_NONE, "IPPROTO_NONE");
            map.put(IPPROTO_DSTOPTS, "IPPROTO_DSTOPTS");
            map.put(IPPROTO_MTP, "IPPROTO_MTP");
            map.put(IPPROTO_ENCAP, "IPPROTO_ENCAP");
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

