/*
 * Decompiled with CFR 0.152.
 */
package jnr.constants.platform.linux.mips64el;

import java.util.EnumMap;
import java.util.Map;
import jnr.constants.Constant;

public final class IP
extends Enum<IP>
implements Constant {
    public static final /* enum */ IP IP_PASSSEC;
    public static final /* enum */ IP IP_MULTICAST_LOOP;
    public static final /* enum */ IP IP_ADD_MEMBERSHIP;
    public static final /* enum */ IP IP_RETOPTS;
    public static final /* enum */ IP IP_DEFAULT_MULTICAST_TTL;
    public static final /* enum */ IP IP_RECVOPTS;
    public static final /* enum */ IP IP_TRANSPARENT;
    public static final /* enum */ IP IP_RECVERR;
    private static final /* synthetic */ IP[] $VALUES;
    public static final /* enum */ IP IP_DROP_MEMBERSHIP;
    public static final /* enum */ IP IP_PMTUDISC_DONT;
    public static final /* enum */ IP IP_TOS;
    public static final /* enum */ IP IP_PKTOPTIONS;
    public static final /* enum */ IP IP_IPSEC_POLICY;
    private final long value;
    public static final /* enum */ IP IP_MINTTL;
    public static final /* enum */ IP IP_MTU;
    public static final /* enum */ IP IP_RECVTTL;
    public static final /* enum */ IP IP_DROP_SOURCE_MEMBERSHIP;
    public static final /* enum */ IP IP_MTU_DISCOVER;
    public static final /* enum */ IP IP_OPTIONS;
    public static final /* enum */ IP IP_PKTINFO;
    public static final /* enum */ IP IP_UNBLOCK_SOURCE;
    public static final /* enum */ IP IP_MULTICAST_IF;
    public static final /* enum */ IP IP_PMTUDISC_WANT;
    public static final /* enum */ IP IP_MAX_MEMBERSHIPS;
    public static final /* enum */ IP IP_ROUTER_ALERT;
    public static final /* enum */ IP IP_FREEBIND;
    public static final /* enum */ IP IP_RECVRETOPTS;
    public static final /* enum */ IP IP_MULTICAST_TTL;
    public static final /* enum */ IP IP_BLOCK_SOURCE;
    public static final long MIN_VALUE = 0L;
    public static final /* enum */ IP IP_HDRINCL;
    public static final /* enum */ IP IP_MSFILTER;
    public static final /* enum */ IP IP_PMTUDISC_DO;
    public static final /* enum */ IP IP_RECVTOS;
    public static final /* enum */ IP IP_XFRM_POLICY;
    public static final /* enum */ IP IP_DEFAULT_MULTICAST_LOOP;
    public static final /* enum */ IP IP_TTL;
    public static final long MAX_VALUE = 41L;
    public static final /* enum */ IP IP_ADD_SOURCE_MEMBERSHIP;

    @Override
    public final boolean defined() {
        return true;
    }

    public static IP valueOf(String name) {
        return Enum.valueOf(IP.class, name);
    }

    @Override
    public final int intValue() {
        return (int)this.value;
    }

    private IP(long value) {
        this.value = value;
    }

    @Override
    public final long longValue() {
        return this.value;
    }

    public final int value() {
        return (int)this.value;
    }

    public final String toString() {
        return StringTable.descriptions.get(this);
    }

    public static IP[] values() {
        return (IP[])$VALUES.clone();
    }

    static {
        IP_OPTIONS = new IP(4L);
        IP_HDRINCL = new IP(3L);
        IP_TOS = new IP(1L);
        IP_TTL = new IP(2L);
        IP_RECVOPTS = new IP(6L);
        IP_RECVRETOPTS = new IP(7L);
        IP_RETOPTS = new IP(7L);
        IP_MINTTL = new IP(21L);
        IP_RECVTTL = new IP(12L);
        IP_MULTICAST_IF = new IP(32L);
        IP_MULTICAST_TTL = new IP(33L);
        IP_MULTICAST_LOOP = new IP(34L);
        IP_ADD_MEMBERSHIP = new IP(35L);
        IP_DROP_MEMBERSHIP = new IP(36L);
        IP_DEFAULT_MULTICAST_TTL = new IP(1L);
        IP_DEFAULT_MULTICAST_LOOP = new IP(1L);
        IP_MAX_MEMBERSHIPS = new IP(20L);
        IP_ROUTER_ALERT = new IP(5L);
        IP_PKTINFO = new IP(8L);
        IP_PKTOPTIONS = new IP(9L);
        IP_MTU_DISCOVER = new IP(10L);
        IP_RECVERR = new IP(11L);
        IP_RECVTOS = new IP(13L);
        IP_MTU = new IP(14L);
        IP_FREEBIND = new IP(15L);
        IP_IPSEC_POLICY = new IP(16L);
        IP_XFRM_POLICY = new IP(17L);
        IP_PASSSEC = new IP(18L);
        IP_TRANSPARENT = new IP(19L);
        IP_PMTUDISC_DONT = new IP(0L);
        IP_PMTUDISC_WANT = new IP(1L);
        IP_PMTUDISC_DO = new IP(2L);
        IP_UNBLOCK_SOURCE = new IP(37L);
        IP_BLOCK_SOURCE = new IP(38L);
        IP_ADD_SOURCE_MEMBERSHIP = new IP(39L);
        IP_DROP_SOURCE_MEMBERSHIP = new IP(40L);
        IP_MSFILTER = new IP(41L);
        IP[] iPArray = new IP[37];
        iPArray[0] = IP_OPTIONS;
        iPArray[1] = IP_HDRINCL;
        iPArray[2] = IP_TOS;
        iPArray[3] = IP_TTL;
        iPArray[4] = IP_RECVOPTS;
        iPArray[5] = IP_RECVRETOPTS;
        iPArray[6] = IP_RETOPTS;
        iPArray[7] = IP_MINTTL;
        iPArray[8] = IP_RECVTTL;
        iPArray[9] = IP_MULTICAST_IF;
        iPArray[10] = IP_MULTICAST_TTL;
        iPArray[11] = IP_MULTICAST_LOOP;
        iPArray[12] = IP_ADD_MEMBERSHIP;
        iPArray[13] = IP_DROP_MEMBERSHIP;
        iPArray[14] = IP_DEFAULT_MULTICAST_TTL;
        iPArray[15] = IP_DEFAULT_MULTICAST_LOOP;
        iPArray[16] = IP_MAX_MEMBERSHIPS;
        iPArray[17] = IP_ROUTER_ALERT;
        iPArray[18] = IP_PKTINFO;
        iPArray[19] = IP_PKTOPTIONS;
        iPArray[20] = IP_MTU_DISCOVER;
        iPArray[21] = IP_RECVERR;
        iPArray[22] = IP_RECVTOS;
        iPArray[23] = IP_MTU;
        iPArray[24] = IP_FREEBIND;
        iPArray[25] = IP_IPSEC_POLICY;
        iPArray[26] = IP_XFRM_POLICY;
        iPArray[27] = IP_PASSSEC;
        iPArray[28] = IP_TRANSPARENT;
        iPArray[29] = IP_PMTUDISC_DONT;
        iPArray[30] = IP_PMTUDISC_WANT;
        iPArray[31] = IP_PMTUDISC_DO;
        iPArray[32] = IP_UNBLOCK_SOURCE;
        iPArray[33] = IP_BLOCK_SOURCE;
        iPArray[34] = IP_ADD_SOURCE_MEMBERSHIP;
        iPArray[35] = IP_DROP_SOURCE_MEMBERSHIP;
        iPArray[36] = IP_MSFILTER;
        $VALUES = iPArray;
    }

    static final class StringTable {
        public static final Map<IP, String> descriptions = StringTable.generateTable();

        StringTable() {
        }

        public static final Map<IP, String> generateTable() {
            EnumMap<IP, String> map = new EnumMap<IP, String>(IP.class);
            map.put(IP_OPTIONS, "IP_OPTIONS");
            map.put(IP_HDRINCL, "IP_HDRINCL");
            map.put(IP_TOS, "IP_TOS");
            map.put(IP_TTL, "IP_TTL");
            map.put(IP_RECVOPTS, "IP_RECVOPTS");
            map.put(IP_RECVRETOPTS, "IP_RECVRETOPTS");
            map.put(IP_RETOPTS, "IP_RETOPTS");
            map.put(IP_MINTTL, "IP_MINTTL");
            map.put(IP_RECVTTL, "IP_RECVTTL");
            map.put(IP_MULTICAST_IF, "IP_MULTICAST_IF");
            map.put(IP_MULTICAST_TTL, "IP_MULTICAST_TTL");
            map.put(IP_MULTICAST_LOOP, "IP_MULTICAST_LOOP");
            map.put(IP_ADD_MEMBERSHIP, "IP_ADD_MEMBERSHIP");
            map.put(IP_DROP_MEMBERSHIP, "IP_DROP_MEMBERSHIP");
            map.put(IP_DEFAULT_MULTICAST_TTL, "IP_DEFAULT_MULTICAST_TTL");
            map.put(IP_DEFAULT_MULTICAST_LOOP, "IP_DEFAULT_MULTICAST_LOOP");
            map.put(IP_MAX_MEMBERSHIPS, "IP_MAX_MEMBERSHIPS");
            map.put(IP_ROUTER_ALERT, "IP_ROUTER_ALERT");
            map.put(IP_PKTINFO, "IP_PKTINFO");
            map.put(IP_PKTOPTIONS, "IP_PKTOPTIONS");
            map.put(IP_MTU_DISCOVER, "IP_MTU_DISCOVER");
            map.put(IP_RECVERR, "IP_RECVERR");
            map.put(IP_RECVTOS, "IP_RECVTOS");
            map.put(IP_MTU, "IP_MTU");
            map.put(IP_FREEBIND, "IP_FREEBIND");
            map.put(IP_IPSEC_POLICY, "IP_IPSEC_POLICY");
            map.put(IP_XFRM_POLICY, "IP_XFRM_POLICY");
            map.put(IP_PASSSEC, "IP_PASSSEC");
            map.put(IP_TRANSPARENT, "IP_TRANSPARENT");
            map.put(IP_PMTUDISC_DONT, "IP_PMTUDISC_DONT");
            map.put(IP_PMTUDISC_WANT, "IP_PMTUDISC_WANT");
            map.put(IP_PMTUDISC_DO, "IP_PMTUDISC_DO");
            map.put(IP_UNBLOCK_SOURCE, "IP_UNBLOCK_SOURCE");
            map.put(IP_BLOCK_SOURCE, "IP_BLOCK_SOURCE");
            map.put(IP_ADD_SOURCE_MEMBERSHIP, "IP_ADD_SOURCE_MEMBERSHIP");
            map.put(IP_DROP_SOURCE_MEMBERSHIP, "IP_DROP_SOURCE_MEMBERSHIP");
            map.put(IP_MSFILTER, "IP_MSFILTER");
            return map;
        }
    }
}

