/*
 * Decompiled with CFR 0.152.
 */
package jnr.constants.platform.fake;

import jnr.constants.Constant;

public final class IPProto
extends Enum<IPProto>
implements Constant {
    public static final /* enum */ IPProto IPPROTO_ENCAP;
    public static final /* enum */ IPProto IPPROTO_FRAGMENT;
    public static final long MAX_VALUE = 28L;
    public static final /* enum */ IPProto IPPROTO_DSTOPTS;
    public static final /* enum */ IPProto IPPROTO_TCP;
    public static final /* enum */ IPProto IPPROTO_IDP;
    private final long value;
    public static final /* enum */ IPProto IPPROTO_PUP;
    public static final /* enum */ IPProto IPPROTO_ICMP;
    public static final /* enum */ IPProto IPPROTO_PIM;
    public static final /* enum */ IPProto IPPROTO_IP;
    public static final /* enum */ IPProto IPPROTO_IPIP;
    public static final /* enum */ IPProto IPPROTO_UDP;
    public static final /* enum */ IPProto IPPROTO_COMP;
    public static final long MIN_VALUE = 1L;
    public static final /* enum */ IPProto IPPROTO_GRE;
    public static final /* enum */ IPProto IPPROTO_ROUTING;
    public static final /* enum */ IPProto IPPROTO_IPV6;
    public static final /* enum */ IPProto IPPROTO_NONE;
    public static final /* enum */ IPProto IPPROTO_ESP;
    public static final /* enum */ IPProto IPPROTO_HOPOPTS;
    public static final /* enum */ IPProto IPPROTO_MTP;
    public static final /* enum */ IPProto IPPROTO_TP;
    public static final /* enum */ IPProto IPPROTO_EGP;
    public static final /* enum */ IPProto IPPROTO_MAX;
    public static final /* enum */ IPProto IPPROTO_ICMPV6;
    public static final /* enum */ IPProto IPPROTO_AH;
    public static final /* enum */ IPProto IPPROTO_RSVP;
    public static final /* enum */ IPProto IPPROTO_IGMP;
    public static final /* enum */ IPProto IPPROTO_RAW;
    private static final /* synthetic */ IPProto[] $VALUES;
    public static final /* enum */ IPProto IPPROTO_SCTP;

    @Override
    public final long longValue() {
        return this.value;
    }

    @Override
    public final boolean defined() {
        return true;
    }

    public static IPProto[] values() {
        return (IPProto[])$VALUES.clone();
    }

    public final int value() {
        return (int)this.value;
    }

    private IPProto(long value) {
        this.value = value;
    }

    @Override
    public final int intValue() {
        return (int)this.value;
    }

    public static IPProto valueOf(String name) {
        return Enum.valueOf(IPProto.class, name);
    }

    static {
        IPPROTO_IP = new IPProto(1L);
        IPPROTO_HOPOPTS = new IPProto(2L);
        IPPROTO_ICMP = new IPProto(3L);
        IPPROTO_IGMP = new IPProto(4L);
        IPPROTO_IPIP = new IPProto(5L);
        IPPROTO_TCP = new IPProto(6L);
        IPPROTO_EGP = new IPProto(7L);
        IPPROTO_PUP = new IPProto(8L);
        IPPROTO_UDP = new IPProto(9L);
        IPPROTO_IDP = new IPProto(10L);
        IPPROTO_TP = new IPProto(11L);
        IPPROTO_IPV6 = new IPProto(12L);
        IPPROTO_ROUTING = new IPProto(13L);
        IPPROTO_FRAGMENT = new IPProto(14L);
        IPPROTO_RSVP = new IPProto(15L);
        IPPROTO_GRE = new IPProto(16L);
        IPPROTO_ESP = new IPProto(17L);
        IPPROTO_AH = new IPProto(18L);
        IPPROTO_ICMPV6 = new IPProto(19L);
        IPPROTO_NONE = new IPProto(20L);
        IPPROTO_DSTOPTS = new IPProto(21L);
        IPPROTO_MTP = new IPProto(22L);
        IPPROTO_ENCAP = new IPProto(23L);
        IPPROTO_PIM = new IPProto(24L);
        IPPROTO_COMP = new IPProto(25L);
        IPPROTO_SCTP = new IPProto(26L);
        IPPROTO_RAW = new IPProto(27L);
        IPPROTO_MAX = new IPProto(28L);
        IPProto[] iPProtoArray = new IPProto[28];
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
        iPProtoArray[24] = IPPROTO_COMP;
        iPProtoArray[25] = IPPROTO_SCTP;
        iPProtoArray[26] = IPPROTO_RAW;
        iPProtoArray[27] = IPPROTO_MAX;
        $VALUES = iPProtoArray;
    }
}

