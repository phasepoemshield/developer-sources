/*
 * Decompiled with CFR 0.152.
 */
package jnr.constants.platform.fake;

import jnr.constants.Constant;

public final class IP
extends Enum<IP>
implements Constant {
    public static final /* enum */ IP IP_DROP_SOURCE_MEMBERSHIP;
    public static final /* enum */ IP IP_RECVDSTADDR;
    public static final /* enum */ IP IP_SENDSRCADDR;
    public static final /* enum */ IP IP_IPSEC_POLICY;
    public static final /* enum */ IP IP_RECVTOS;
    public static final /* enum */ IP IP_RECVTTL;
    public static final /* enum */ IP IP_UNBLOCK_SOURCE;
    public static final /* enum */ IP IP_RETOPTS;
    public static final /* enum */ IP IP_PORTRANGE;
    public static final /* enum */ IP IP_MULTICAST_LOOP;
    public static final /* enum */ IP IP_HDRINCL;
    public static final /* enum */ IP IP_RECVSLLA;
    public static final /* enum */ IP IP_RECVIF;
    public static final /* enum */ IP IP_DONTFRAG;
    public static final /* enum */ IP IP_MULTICAST_IF;
    public static final /* enum */ IP IP_TTL;
    public static final /* enum */ IP IP_MAX_MEMBERSHIPS;
    public static final /* enum */ IP IP_DEFAULT_MULTICAST_LOOP;
    public static final long MIN_VALUE = 1L;
    public static final /* enum */ IP IP_BLOCK_SOURCE;
    public static final /* enum */ IP IP_PKTOPTIONS;
    private static final /* synthetic */ IP[] $VALUES;
    public static final /* enum */ IP IP_DROP_MEMBERSHIP;
    public static final /* enum */ IP IP_PASSSEC;
    public static final /* enum */ IP IP_ADD_SOURCE_MEMBERSHIP;
    public static final /* enum */ IP IP_ONESBCAST;
    public static final /* enum */ IP IP_XFRM_POLICY;
    public static final /* enum */ IP IP_PMTUDISC_DONT;
    public static final /* enum */ IP IP_OPTIONS;
    public static final /* enum */ IP IP_PKTINFO;
    private final long value;
    public static final /* enum */ IP IP_RECVERR;
    public static final /* enum */ IP IP_ROUTER_ALERT;
    public static final /* enum */ IP IP_MTU_DISCOVER;
    public static final /* enum */ IP IP_RECVRETOPTS;
    public static final /* enum */ IP IP_MSFILTER;
    public static final /* enum */ IP IP_DEFAULT_MULTICAST_TTL;
    public static final /* enum */ IP IP_FREEBIND;
    public static final /* enum */ IP IP_ADD_MEMBERSHIP;
    public static final /* enum */ IP IP_PMTUDISC_WANT;
    public static final /* enum */ IP IP_MULTICAST_TTL;
    public static final long MAX_VALUE = 44L;
    public static final /* enum */ IP IP_MINTTL;
    public static final /* enum */ IP IP_MTU;
    public static final /* enum */ IP IP_TOS;
    public static final /* enum */ IP IP_PMTUDISC_DO;
    public static final /* enum */ IP IP_RECVOPTS;
    public static final /* enum */ IP IP_TRANSPARENT;

    static {
        IP_OPTIONS = new IP(1L);
        IP_HDRINCL = new IP(2L);
        IP_TOS = new IP(3L);
        IP_TTL = new IP(4L);
        IP_RECVOPTS = new IP(5L);
        IP_RECVRETOPTS = new IP(6L);
        IP_RECVDSTADDR = new IP(7L);
        IP_RETOPTS = new IP(8L);
        IP_MINTTL = new IP(9L);
        IP_DONTFRAG = new IP(10L);
        IP_SENDSRCADDR = new IP(11L);
        IP_ONESBCAST = new IP(12L);
        IP_RECVTTL = new IP(13L);
        IP_RECVIF = new IP(14L);
        IP_RECVSLLA = new IP(15L);
        IP_PORTRANGE = new IP(16L);
        IP_MULTICAST_IF = new IP(17L);
        IP_MULTICAST_TTL = new IP(18L);
        IP_MULTICAST_LOOP = new IP(19L);
        IP_ADD_MEMBERSHIP = new IP(20L);
        IP_DROP_MEMBERSHIP = new IP(21L);
        IP_DEFAULT_MULTICAST_TTL = new IP(22L);
        IP_DEFAULT_MULTICAST_LOOP = new IP(23L);
        IP_MAX_MEMBERSHIPS = new IP(24L);
        IP_ROUTER_ALERT = new IP(25L);
        IP_PKTINFO = new IP(26L);
        IP_PKTOPTIONS = new IP(27L);
        IP_MTU_DISCOVER = new IP(28L);
        IP_RECVERR = new IP(29L);
        IP_RECVTOS = new IP(30L);
        IP_MTU = new IP(31L);
        IP_FREEBIND = new IP(32L);
        IP_IPSEC_POLICY = new IP(33L);
        IP_XFRM_POLICY = new IP(34L);
        IP_PASSSEC = new IP(35L);
        IP_TRANSPARENT = new IP(36L);
        IP_PMTUDISC_DONT = new IP(37L);
        IP_PMTUDISC_WANT = new IP(38L);
        IP_PMTUDISC_DO = new IP(39L);
        IP_UNBLOCK_SOURCE = new IP(40L);
        IP_BLOCK_SOURCE = new IP(41L);
        IP_ADD_SOURCE_MEMBERSHIP = new IP(42L);
        IP_DROP_SOURCE_MEMBERSHIP = new IP(43L);
        IP_MSFILTER = new IP(44L);
        IP[] iPArray = new IP[44];
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
        $VALUES = iPArray;
    }

    public static IP valueOf(String name) {
        return Enum.valueOf(IP.class, name);
    }

    @Override
    public final int intValue() {
        return (int)this.value;
    }

    public static IP[] values() {
        return (IP[])$VALUES.clone();
    }

    public final int value() {
        return (int)this.value;
    }

    private IP(long value) {
        this.value = value;
    }

    @Override
    public final boolean defined() {
        return true;
    }

    @Override
    public final long longValue() {
        return this.value;
    }
}

