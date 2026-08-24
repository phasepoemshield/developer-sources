/*
 * Decompiled with CFR 0.152.
 */
package jnr.constants.platform;

import jnr.constants.Constant;
import jnr.constants.platform.ConstantResolver;

public final class IPProto
extends Enum<IPProto>
implements Constant {
    public static final /* enum */ IPProto IPPROTO_TP;
    private static final ConstantResolver<IPProto> resolver;
    public static final /* enum */ IPProto IPPROTO_NONE;
    public static final /* enum */ IPProto IPPROTO_ESP;
    public static final /* enum */ IPProto IPPROTO_IGMP;
    public static final /* enum */ IPProto IPPROTO_MAX;
    public static final /* enum */ IPProto IPPROTO_ICMP;
    public static final /* enum */ IPProto IPPROTO_MTP;
    public static final /* enum */ IPProto IPPROTO_COMP;
    public static final /* enum */ IPProto IPPROTO_IP;
    public static final /* enum */ IPProto IPPROTO_TCP;
    public static final /* enum */ IPProto IPPROTO_RSVP;
    public static final /* enum */ IPProto IPPROTO_AH;
    public static final /* enum */ IPProto IPPROTO_IDP;
    public static final /* enum */ IPProto IPPROTO_FRAGMENT;
    public static final /* enum */ IPProto IPPROTO_IPV6;
    private static final /* synthetic */ IPProto[] $VALUES;
    public static final /* enum */ IPProto IPPROTO_ICMPV6;
    public static final /* enum */ IPProto IPPROTO_PUP;
    public static final /* enum */ IPProto IPPROTO_RAW;
    public static final /* enum */ IPProto IPPROTO_HOPOPTS;
    public static final /* enum */ IPProto IPPROTO_SCTP;
    public static final /* enum */ IPProto IPPROTO_UDP;
    public static final /* enum */ IPProto IPPROTO_DSTOPTS;
    public static final /* enum */ IPProto IPPROTO_EGP;
    public static final /* enum */ IPProto IPPROTO_GRE;
    public static final /* enum */ IPProto IPPROTO_ENCAP;
    public static final /* enum */ IPProto IPPROTO_IPIP;
    public static final /* enum */ IPProto __UNKNOWN_CONSTANT__;
    public static final /* enum */ IPProto IPPROTO_ROUTING;
    public static final /* enum */ IPProto IPPROTO_PIM;

    public static IPProto[] values() {
        return (IPProto[])$VALUES.clone();
    }

    @Override
    public final int intValue() {
        return (int)resolver.longValue(this);
    }

    public final String description() {
        return resolver.description(this);
    }

    static {
        IPPROTO_IP = new IPProto();
        IPPROTO_HOPOPTS = new IPProto();
        IPPROTO_ICMP = new IPProto();
        IPPROTO_IGMP = new IPProto();
        IPPROTO_IPIP = new IPProto();
        IPPROTO_TCP = new IPProto();
        IPPROTO_EGP = new IPProto();
        IPPROTO_PUP = new IPProto();
        IPPROTO_UDP = new IPProto();
        IPPROTO_IDP = new IPProto();
        IPPROTO_TP = new IPProto();
        IPPROTO_IPV6 = new IPProto();
        IPPROTO_ROUTING = new IPProto();
        IPPROTO_FRAGMENT = new IPProto();
        IPPROTO_RSVP = new IPProto();
        IPPROTO_GRE = new IPProto();
        IPPROTO_ESP = new IPProto();
        IPPROTO_AH = new IPProto();
        IPPROTO_ICMPV6 = new IPProto();
        IPPROTO_NONE = new IPProto();
        IPPROTO_DSTOPTS = new IPProto();
        IPPROTO_MTP = new IPProto();
        IPPROTO_ENCAP = new IPProto();
        IPPROTO_PIM = new IPProto();
        IPPROTO_COMP = new IPProto();
        IPPROTO_SCTP = new IPProto();
        IPPROTO_RAW = new IPProto();
        IPPROTO_MAX = new IPProto();
        __UNKNOWN_CONSTANT__ = new IPProto();
        IPProto[] iPProtoArray = new IPProto[29];
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
        iPProtoArray[28] = __UNKNOWN_CONSTANT__;
        $VALUES = iPProtoArray;
        resolver = ConstantResolver.getResolver(IPProto.class, 20000, 29999);
    }

    public final int value() {
        return (int)resolver.longValue(this);
    }

    public static IPProto valueOf(long value) {
        return resolver.valueOf(value);
    }

    public final String toString() {
        return this.description();
    }

    @Override
    public final boolean defined() {
        return resolver.defined(this);
    }

    public static IPProto valueOf(String name) {
        return Enum.valueOf(IPProto.class, name);
    }

    @Override
    public final long longValue() {
        return resolver.longValue(this);
    }
}

