/*
 * Decompiled with CFR 0.152.
 */
package jnr.constants.platform.solaris;

import java.util.EnumMap;
import java.util.Map;
import jnr.constants.Constant;

public final class IP
extends Enum<IP>
implements Constant {
    public static final /* enum */ IP IP_TTL;
    public static final long MIN_VALUE = 1L;
    public static final long MAX_VALUE = 27L;
    public static final /* enum */ IP IP_UNBLOCK_SOURCE;
    public static final /* enum */ IP IP_RECVDSTADDR;
    public static final /* enum */ IP IP_ADD_SOURCE_MEMBERSHIP;
    private final long value;
    public static final /* enum */ IP IP_DROP_SOURCE_MEMBERSHIP;
    public static final /* enum */ IP IP_OPTIONS;
    public static final /* enum */ IP IP_BLOCK_SOURCE;
    public static final /* enum */ IP IP_RECVSLLA;
    public static final /* enum */ IP IP_MULTICAST_TTL;
    public static final /* enum */ IP IP_DEFAULT_MULTICAST_LOOP;
    public static final /* enum */ IP IP_TOS;
    public static final /* enum */ IP IP_RECVOPTS;
    public static final /* enum */ IP IP_RECVIF;
    public static final /* enum */ IP IP_PKTINFO;
    public static final /* enum */ IP IP_MULTICAST_IF;
    public static final /* enum */ IP IP_MULTICAST_LOOP;
    public static final /* enum */ IP IP_RETOPTS;
    private static final /* synthetic */ IP[] $VALUES;
    public static final /* enum */ IP IP_ADD_MEMBERSHIP;
    public static final /* enum */ IP IP_DONTFRAG;
    public static final /* enum */ IP IP_HDRINCL;
    public static final /* enum */ IP IP_RECVTTL;
    public static final /* enum */ IP IP_DROP_MEMBERSHIP;
    public static final /* enum */ IP IP_RECVRETOPTS;
    public static final /* enum */ IP IP_DEFAULT_MULTICAST_TTL;

    @Override
    public final long longValue() {
        return this.value;
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
        IP_DONTFRAG = new IP(27L);
        IP_RECVTTL = new IP(11L);
        IP_RECVIF = new IP(9L);
        IP_RECVSLLA = new IP(10L);
        IP_MULTICAST_IF = new IP(16L);
        IP_MULTICAST_TTL = new IP(17L);
        IP_MULTICAST_LOOP = new IP(18L);
        IP_ADD_MEMBERSHIP = new IP(19L);
        IP_DROP_MEMBERSHIP = new IP(20L);
        IP_DEFAULT_MULTICAST_TTL = new IP(1L);
        IP_DEFAULT_MULTICAST_LOOP = new IP(1L);
        IP_PKTINFO = new IP(26L);
        IP_UNBLOCK_SOURCE = new IP(22L);
        IP_BLOCK_SOURCE = new IP(21L);
        IP_ADD_SOURCE_MEMBERSHIP = new IP(23L);
        IP_DROP_SOURCE_MEMBERSHIP = new IP(24L);
        IP[] iPArray = new IP[24];
        iPArray[0] = IP_OPTIONS;
        iPArray[1] = IP_HDRINCL;
        iPArray[2] = IP_TOS;
        iPArray[3] = IP_TTL;
        iPArray[4] = IP_RECVOPTS;
        iPArray[5] = IP_RECVRETOPTS;
        iPArray[6] = IP_RECVDSTADDR;
        iPArray[7] = IP_RETOPTS;
        iPArray[8] = IP_DONTFRAG;
        iPArray[9] = IP_RECVTTL;
        iPArray[10] = IP_RECVIF;
        iPArray[11] = IP_RECVSLLA;
        iPArray[12] = IP_MULTICAST_IF;
        iPArray[13] = IP_MULTICAST_TTL;
        iPArray[14] = IP_MULTICAST_LOOP;
        iPArray[15] = IP_ADD_MEMBERSHIP;
        iPArray[16] = IP_DROP_MEMBERSHIP;
        iPArray[17] = IP_DEFAULT_MULTICAST_TTL;
        iPArray[18] = IP_DEFAULT_MULTICAST_LOOP;
        iPArray[19] = IP_PKTINFO;
        iPArray[20] = IP_UNBLOCK_SOURCE;
        iPArray[21] = IP_BLOCK_SOURCE;
        iPArray[22] = IP_ADD_SOURCE_MEMBERSHIP;
        iPArray[23] = IP_DROP_SOURCE_MEMBERSHIP;
        $VALUES = iPArray;
    }

    @Override
    public final boolean defined() {
        return true;
    }

    public static IP[] values() {
        return (IP[])$VALUES.clone();
    }

    public static IP valueOf(String name) {
        return Enum.valueOf(IP.class, name);
    }

    private IP(long value) {
        this.value = value;
    }

    public final String toString() {
        return StringTable.descriptions.get(this);
    }

    public final int value() {
        return (int)this.value;
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
            map.put(IP_RECVDSTADDR, "IP_RECVDSTADDR");
            map.put(IP_RETOPTS, "IP_RETOPTS");
            map.put(IP_DONTFRAG, "IP_DONTFRAG");
            map.put(IP_RECVTTL, "IP_RECVTTL");
            map.put(IP_RECVIF, "IP_RECVIF");
            map.put(IP_RECVSLLA, "IP_RECVSLLA");
            map.put(IP_MULTICAST_IF, "IP_MULTICAST_IF");
            map.put(IP_MULTICAST_TTL, "IP_MULTICAST_TTL");
            map.put(IP_MULTICAST_LOOP, "IP_MULTICAST_LOOP");
            map.put(IP_ADD_MEMBERSHIP, "IP_ADD_MEMBERSHIP");
            map.put(IP_DROP_MEMBERSHIP, "IP_DROP_MEMBERSHIP");
            map.put(IP_DEFAULT_MULTICAST_TTL, "IP_DEFAULT_MULTICAST_TTL");
            map.put(IP_DEFAULT_MULTICAST_LOOP, "IP_DEFAULT_MULTICAST_LOOP");
            map.put(IP_PKTINFO, "IP_PKTINFO");
            map.put(IP_UNBLOCK_SOURCE, "IP_UNBLOCK_SOURCE");
            map.put(IP_BLOCK_SOURCE, "IP_BLOCK_SOURCE");
            map.put(IP_ADD_SOURCE_MEMBERSHIP, "IP_ADD_SOURCE_MEMBERSHIP");
            map.put(IP_DROP_SOURCE_MEMBERSHIP, "IP_DROP_SOURCE_MEMBERSHIP");
            return map;
        }
    }
}

