/*
 * Decompiled with CFR 0.152.
 */
package jnr.constants.platform.freebsd;

import java.util.EnumMap;
import java.util.Map;
import jnr.constants.Constant;

public final class IP
extends Enum<IP>
implements Constant {
    public static final /* enum */ IP IP_MINTTL;
    public static final /* enum */ IP IP_TOS;
    public static final /* enum */ IP IP_OPTIONS;
    public static final /* enum */ IP IP_RECVOPTS;
    public static final /* enum */ IP IP_DONTFRAG;
    public static final /* enum */ IP IP_MULTICAST_TTL;
    public static final /* enum */ IP IP_ONESBCAST;
    public static final /* enum */ IP IP_RECVIF;
    public static final /* enum */ IP IP_IPSEC_POLICY;
    public static final /* enum */ IP IP_HDRINCL;
    public static final /* enum */ IP IP_UNBLOCK_SOURCE;
    public static final /* enum */ IP IP_RECVTTL;
    public static final /* enum */ IP IP_TTL;
    public static final /* enum */ IP IP_DROP_SOURCE_MEMBERSHIP;
    public static final /* enum */ IP IP_MSFILTER;
    public static final /* enum */ IP IP_ADD_SOURCE_MEMBERSHIP;
    public static final /* enum */ IP IP_RETOPTS;
    public static final /* enum */ IP IP_DROP_MEMBERSHIP;
    public static final /* enum */ IP IP_SENDSRCADDR;
    public static final /* enum */ IP IP_MULTICAST_IF;
    public static final /* enum */ IP IP_RECVDSTADDR;
    public static final long MAX_VALUE = 4095L;
    public static final long MIN_VALUE = 1L;
    public static final /* enum */ IP IP_RECVRETOPTS;
    public static final /* enum */ IP IP_PORTRANGE;
    public static final /* enum */ IP IP_RECVTOS;
    private final long value;
    public static final /* enum */ IP IP_MAX_MEMBERSHIPS;
    public static final /* enum */ IP IP_MULTICAST_LOOP;
    public static final /* enum */ IP IP_BLOCK_SOURCE;
    public static final /* enum */ IP IP_ADD_MEMBERSHIP;
    public static final /* enum */ IP IP_DEFAULT_MULTICAST_LOOP;
    public static final /* enum */ IP IP_DEFAULT_MULTICAST_TTL;
    private static final /* synthetic */ IP[] $VALUES;

    @Override
    public final long longValue() {
        return this.value;
    }

    public static IP[] values() {
        return (IP[])$VALUES.clone();
    }

    @Override
    public final boolean defined() {
        return true;
    }

    public final String toString() {
        return StringTable.descriptions.get(this);
    }

    public final int value() {
        return (int)this.value;
    }

    public static IP valueOf(String name) {
        return Enum.valueOf(IP.class, name);
    }

    @Override
    public final int intValue() {
        return (int)this.value;
    }

    static {
        IP_OPTIONS = new IP(1L);
        IP_HDRINCL = new IP(2L);
        IP_TOS = new IP(3L);
        IP_TTL = new IP(4L);
        IP_RECVOPTS = new IP(5L);
        IP_RECVRETOPTS = new IP(6L);
        IP_RECVDSTADDR = new IP(7L);
        IP_RETOPTS = new IP(8L);
        IP_MINTTL = new IP(66L);
        IP_DONTFRAG = new IP(67L);
        IP_SENDSRCADDR = new IP(7L);
        IP_ONESBCAST = new IP(23L);
        IP_RECVTTL = new IP(65L);
        IP_RECVIF = new IP(20L);
        IP_PORTRANGE = new IP(19L);
        IP_MULTICAST_IF = new IP(9L);
        IP_MULTICAST_TTL = new IP(10L);
        IP_MULTICAST_LOOP = new IP(11L);
        IP_ADD_MEMBERSHIP = new IP(12L);
        IP_DROP_MEMBERSHIP = new IP(13L);
        IP_DEFAULT_MULTICAST_TTL = new IP(1L);
        IP_DEFAULT_MULTICAST_LOOP = new IP(1L);
        IP_MAX_MEMBERSHIPS = new IP(4095L);
        IP_RECVTOS = new IP(68L);
        IP_IPSEC_POLICY = new IP(21L);
        IP_UNBLOCK_SOURCE = new IP(73L);
        IP_BLOCK_SOURCE = new IP(72L);
        IP_ADD_SOURCE_MEMBERSHIP = new IP(70L);
        IP_DROP_SOURCE_MEMBERSHIP = new IP(71L);
        IP_MSFILTER = new IP(74L);
        IP[] iPArray = new IP[30];
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
        iPArray[14] = IP_PORTRANGE;
        iPArray[15] = IP_MULTICAST_IF;
        iPArray[16] = IP_MULTICAST_TTL;
        iPArray[17] = IP_MULTICAST_LOOP;
        iPArray[18] = IP_ADD_MEMBERSHIP;
        iPArray[19] = IP_DROP_MEMBERSHIP;
        iPArray[20] = IP_DEFAULT_MULTICAST_TTL;
        iPArray[21] = IP_DEFAULT_MULTICAST_LOOP;
        iPArray[22] = IP_MAX_MEMBERSHIPS;
        iPArray[23] = IP_RECVTOS;
        iPArray[24] = IP_IPSEC_POLICY;
        iPArray[25] = IP_UNBLOCK_SOURCE;
        iPArray[26] = IP_BLOCK_SOURCE;
        iPArray[27] = IP_ADD_SOURCE_MEMBERSHIP;
        iPArray[28] = IP_DROP_SOURCE_MEMBERSHIP;
        iPArray[29] = IP_MSFILTER;
        $VALUES = iPArray;
    }

    private IP(long value) {
        this.value = value;
    }

    static final class StringTable {
        public static final Map<IP, String> descriptions = StringTable.generateTable();

        public static final Map<IP, String> generateTable() {
            EnumMap<IP, String> map = new EnumMap<IP, String>(IP.class);
            map.put(IP_OPTIONS, "IP_OPTIONS");
            map.put(IP_HDRINCL, "IP_HDRINCL");
            map.put(IP_TOS, "IP_TOS");
            map.put(IP_TTL, "IP_TTL");
            map.put(IP_RECVOPTS, "IP_RECVOPTS");
            map.put(IP_RECVRETOPTS, "IP_RECVRETOPTS");
            map.put(IP_RECVDSTADDR, "IP_RECVDSTADDR");
            map.put(IP_RETOPTS, "IP_RETOPTS");
            map.put(IP_MINTTL, "IP_MINTTL");
            map.put(IP_DONTFRAG, "IP_DONTFRAG");
            map.put(IP_SENDSRCADDR, "IP_SENDSRCADDR");
            map.put(IP_ONESBCAST, "IP_ONESBCAST");
            map.put(IP_RECVTTL, "IP_RECVTTL");
            map.put(IP_RECVIF, "IP_RECVIF");
            map.put(IP_PORTRANGE, "IP_PORTRANGE");
            map.put(IP_MULTICAST_IF, "IP_MULTICAST_IF");
            map.put(IP_MULTICAST_TTL, "IP_MULTICAST_TTL");
            map.put(IP_MULTICAST_LOOP, "IP_MULTICAST_LOOP");
            map.put(IP_ADD_MEMBERSHIP, "IP_ADD_MEMBERSHIP");
            map.put(IP_DROP_MEMBERSHIP, "IP_DROP_MEMBERSHIP");
            map.put(IP_DEFAULT_MULTICAST_TTL, "IP_DEFAULT_MULTICAST_TTL");
            map.put(IP_DEFAULT_MULTICAST_LOOP, "IP_DEFAULT_MULTICAST_LOOP");
            map.put(IP_MAX_MEMBERSHIPS, "IP_MAX_MEMBERSHIPS");
            map.put(IP_RECVTOS, "IP_RECVTOS");
            map.put(IP_IPSEC_POLICY, "IP_IPSEC_POLICY");
            map.put(IP_UNBLOCK_SOURCE, "IP_UNBLOCK_SOURCE");
            map.put(IP_BLOCK_SOURCE, "IP_BLOCK_SOURCE");
            map.put(IP_ADD_SOURCE_MEMBERSHIP, "IP_ADD_SOURCE_MEMBERSHIP");
            map.put(IP_DROP_SOURCE_MEMBERSHIP, "IP_DROP_SOURCE_MEMBERSHIP");
            map.put(IP_MSFILTER, "IP_MSFILTER");
            return map;
        }

        StringTable() {
        }
    }
}

