/*
 * Decompiled with CFR 0.152.
 */
package jnr.constants.platform;

import jnr.constants.Constant;
import jnr.constants.platform.ConstantResolver;

public final class IP
extends Enum<IP>
implements Constant {
    public static final /* enum */ IP IP_MTU;
    public static final /* enum */ IP IP_TTL;
    public static final /* enum */ IP IP_FREEBIND;
    public static final /* enum */ IP IP_PKTINFO;
    public static final /* enum */ IP IP_ADD_MEMBERSHIP;
    public static final /* enum */ IP IP_PMTUDISC_DO;
    public static final /* enum */ IP IP_BLOCK_SOURCE;
    public static final /* enum */ IP IP_MULTICAST_IF;
    public static final /* enum */ IP __UNKNOWN_CONSTANT__;
    public static final /* enum */ IP IP_DROP_MEMBERSHIP;
    public static final /* enum */ IP IP_RECVRETOPTS;
    public static final /* enum */ IP IP_MTU_DISCOVER;
    public static final /* enum */ IP IP_MAX_MEMBERSHIPS;
    public static final /* enum */ IP IP_PMTUDISC_DONT;
    public static final /* enum */ IP IP_MULTICAST_TTL;
    public static final /* enum */ IP IP_ADD_SOURCE_MEMBERSHIP;
    public static final /* enum */ IP IP_XFRM_POLICY;
    public static final /* enum */ IP IP_OPTIONS;
    public static final /* enum */ IP IP_ROUTER_ALERT;
    private static final ConstantResolver<IP> resolver;
    public static final /* enum */ IP IP_PORTRANGE;
    public static final /* enum */ IP IP_IPSEC_POLICY;
    public static final /* enum */ IP IP_RECVDSTADDR;
    public static final /* enum */ IP IP_DONTFRAG;
    public static final /* enum */ IP IP_PASSSEC;
    public static final /* enum */ IP IP_RETOPTS;
    public static final /* enum */ IP IP_RECVOPTS;
    public static final /* enum */ IP IP_DEFAULT_MULTICAST_TTL;
    public static final /* enum */ IP IP_RECVTOS;
    public static final /* enum */ IP IP_ONESBCAST;
    public static final /* enum */ IP IP_RECVSLLA;
    public static final /* enum */ IP IP_RECVIF;
    public static final /* enum */ IP IP_RECVERR;
    public static final /* enum */ IP IP_PKTOPTIONS;
    public static final /* enum */ IP IP_DEFAULT_MULTICAST_LOOP;
    public static final /* enum */ IP IP_DROP_SOURCE_MEMBERSHIP;
    public static final /* enum */ IP IP_PMTUDISC_WANT;
    public static final /* enum */ IP IP_RECVTTL;
    public static final /* enum */ IP IP_MULTICAST_LOOP;
    public static final /* enum */ IP IP_TRANSPARENT;
    public static final /* enum */ IP IP_SENDSRCADDR;
    private static final /* synthetic */ IP[] $VALUES;
    public static final /* enum */ IP IP_UNBLOCK_SOURCE;
    public static final /* enum */ IP IP_TOS;
    public static final /* enum */ IP IP_HDRINCL;
    public static final /* enum */ IP IP_MSFILTER;
    public static final /* enum */ IP IP_MINTTL;

    public final String description() {
        return resolver.description(this);
    }

    public final int value() {
        return (int)resolver.longValue(this);
    }

    @Override
    public final int intValue() {
        return (int)resolver.longValue(this);
    }

    static {
        IP_OPTIONS = new IP();
        IP_HDRINCL = new IP();
        IP_TOS = new IP();
        IP_TTL = new IP();
        IP_RECVOPTS = new IP();
        IP_RECVRETOPTS = new IP();
        IP_RECVDSTADDR = new IP();
        IP_RETOPTS = new IP();
        IP_MINTTL = new IP();
        IP_DONTFRAG = new IP();
        IP_SENDSRCADDR = new IP();
        IP_ONESBCAST = new IP();
        IP_RECVTTL = new IP();
        IP_RECVIF = new IP();
        IP_RECVSLLA = new IP();
        IP_PORTRANGE = new IP();
        IP_MULTICAST_IF = new IP();
        IP_MULTICAST_TTL = new IP();
        IP_MULTICAST_LOOP = new IP();
        IP_ADD_MEMBERSHIP = new IP();
        IP_DROP_MEMBERSHIP = new IP();
        IP_DEFAULT_MULTICAST_TTL = new IP();
        IP_DEFAULT_MULTICAST_LOOP = new IP();
        IP_MAX_MEMBERSHIPS = new IP();
        IP_ROUTER_ALERT = new IP();
        IP_PKTINFO = new IP();
        IP_PKTOPTIONS = new IP();
        IP_MTU_DISCOVER = new IP();
        IP_RECVERR = new IP();
        IP_RECVTOS = new IP();
        IP_MTU = new IP();
        IP_FREEBIND = new IP();
        IP_IPSEC_POLICY = new IP();
        IP_XFRM_POLICY = new IP();
        IP_PASSSEC = new IP();
        IP_TRANSPARENT = new IP();
        IP_PMTUDISC_DONT = new IP();
        IP_PMTUDISC_WANT = new IP();
        IP_PMTUDISC_DO = new IP();
        IP_UNBLOCK_SOURCE = new IP();
        IP_BLOCK_SOURCE = new IP();
        IP_ADD_SOURCE_MEMBERSHIP = new IP();
        IP_DROP_SOURCE_MEMBERSHIP = new IP();
        IP_MSFILTER = new IP();
        __UNKNOWN_CONSTANT__ = new IP();
        IP[] iPArray = new IP[45];
        iPArray[0] = IP_OPTIONS;
        iPArray[1] = IP_HDRINCL;
        iPArray[2] = IP_TOS;
        iPArray[3] = IP_TTL;
        iPArray[4] = IP_RECVOPTS;
        iPArray[5] = IP_RECVRETOPTS;
        iPArray[6] = IP_RECVDSTADDR;
        iPArray[7] = IP_RETOPTS;
        iPArray[8] = IP_MINTTL;
        iPArray[9] = IP_DONTFRAG;
        iPArray[10] = IP_SENDSRCADDR;
        iPArray[11] = IP_ONESBCAST;
        iPArray[12] = IP_RECVTTL;
        iPArray[13] = IP_RECVIF;
        iPArray[14] = IP_RECVSLLA;
        iPArray[15] = IP_PORTRANGE;
        iPArray[16] = IP_MULTICAST_IF;
        iPArray[17] = IP_MULTICAST_TTL;
        iPArray[18] = IP_MULTICAST_LOOP;
        iPArray[19] = IP_ADD_MEMBERSHIP;
        iPArray[20] = IP_DROP_MEMBERSHIP;
        iPArray[21] = IP_DEFAULT_MULTICAST_TTL;
        iPArray[22] = IP_DEFAULT_MULTICAST_LOOP;
        iPArray[23] = IP_MAX_MEMBERSHIPS;
        iPArray[24] = IP_ROUTER_ALERT;
        iPArray[25] = IP_PKTINFO;
        iPArray[26] = IP_PKTOPTIONS;
        iPArray[27] = IP_MTU_DISCOVER;
        iPArray[28] = IP_RECVERR;
        iPArray[29] = IP_RECVTOS;
        iPArray[30] = IP_MTU;
        iPArray[31] = IP_FREEBIND;
        iPArray[32] = IP_IPSEC_POLICY;
        iPArray[33] = IP_XFRM_POLICY;
        iPArray[34] = IP_PASSSEC;
        iPArray[35] = IP_TRANSPARENT;
        iPArray[36] = IP_PMTUDISC_DONT;
        iPArray[37] = IP_PMTUDISC_WANT;
        iPArray[38] = IP_PMTUDISC_DO;
        iPArray[39] = IP_UNBLOCK_SOURCE;
        iPArray[40] = IP_BLOCK_SOURCE;
        iPArray[41] = IP_ADD_SOURCE_MEMBERSHIP;
        iPArray[42] = IP_DROP_SOURCE_MEMBERSHIP;
        iPArray[43] = IP_MSFILTER;
        iPArray[44] = __UNKNOWN_CONSTANT__;
        $VALUES = iPArray;
        resolver = ConstantResolver.getResolver(IP.class, 20000, 29999);
    }

    @Override
    public final boolean defined() {
        return resolver.defined(this);
    }

    public static IP valueOf(long value) {
        return resolver.valueOf(value);
    }

    @Override
    public final long longValue() {
        return resolver.longValue(this);
    }

    public static IP[] values() {
        return (IP[])$VALUES.clone();
    }

    public final String toString() {
        return this.description();
    }

    public static IP valueOf(String name) {
        return Enum.valueOf(IP.class, name);
    }
}

