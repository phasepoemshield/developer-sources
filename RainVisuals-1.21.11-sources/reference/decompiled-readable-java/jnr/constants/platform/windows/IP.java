/*
 * Decompiled with CFR 0.152.
 */
package jnr.constants.platform.windows;

import java.util.EnumMap;
import java.util.Map;
import jnr.constants.Constant;

public final class IP
extends Enum<IP>
implements Constant {
    public static final /* enum */ IP IP_MAX_MEMBERSHIPS;
    public static final /* enum */ IP IP_TTL;
    public static final /* enum */ IP IP_DROP_MEMBERSHIP;
    public static final /* enum */ IP IP_DEFAULT_MULTICAST_TTL;
    private static final /* synthetic */ IP[] $VALUES;
    public static final long MAX_VALUE = 20L;
    public static final /* enum */ IP IP_MULTICAST_TTL;
    public static final /* enum */ IP IP_ADD_MEMBERSHIP;
    public static final /* enum */ IP IP_OPTIONS;
    public static final /* enum */ IP IP_DEFAULT_MULTICAST_LOOP;
    private final long value;
    public static final /* enum */ IP IP_MULTICAST_IF;
    public static final long MIN_VALUE = 1L;
    public static final /* enum */ IP IP_TOS;
    public static final /* enum */ IP IP_MULTICAST_LOOP;

    private IP(long value) {
        this.value = value;
    }

    public static IP valueOf(String name) {
        return Enum.valueOf(IP.class, name);
    }

    static {
        IP_OPTIONS = new IP(1L);
        IP_TOS = new IP(8L);
        IP_TTL = new IP(7L);
        IP_MULTICAST_IF = new IP(2L);
        IP_MULTICAST_TTL = new IP(3L);
        IP_MULTICAST_LOOP = new IP(4L);
        IP_ADD_MEMBERSHIP = new IP(5L);
        IP_DROP_MEMBERSHIP = new IP(6L);
        IP_DEFAULT_MULTICAST_TTL = new IP(1L);
        IP_DEFAULT_MULTICAST_LOOP = new IP(1L);
        IP_MAX_MEMBERSHIPS = new IP(20L);
        IP[] iPArray = new IP[11];
        iPArray[0] = IP_OPTIONS;
        iPArray[1] = IP_TOS;
        iPArray[2] = IP_TTL;
        iPArray[3] = IP_MULTICAST_IF;
        iPArray[4] = IP_MULTICAST_TTL;
        iPArray[5] = IP_MULTICAST_LOOP;
        iPArray[6] = IP_ADD_MEMBERSHIP;
        iPArray[7] = IP_DROP_MEMBERSHIP;
        iPArray[8] = IP_DEFAULT_MULTICAST_TTL;
        iPArray[9] = IP_DEFAULT_MULTICAST_LOOP;
        iPArray[10] = IP_MAX_MEMBERSHIPS;
        $VALUES = iPArray;
    }

    @Override
    public final long longValue() {
        return this.value;
    }

    @Override
    public final int intValue() {
        return (int)this.value;
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

    public static IP[] values() {
        return (IP[])$VALUES.clone();
    }

    static final class StringTable {
        public static final Map<IP, String> descriptions = StringTable.generateTable();

        public static final Map<IP, String> generateTable() {
            EnumMap<IP, String> map = new EnumMap<IP, String>(IP.class);
            map.put(IP_OPTIONS, "IP_OPTIONS");
            map.put(IP_TOS, "IP_TOS");
            map.put(IP_TTL, "IP_TTL");
            map.put(IP_MULTICAST_IF, "IP_MULTICAST_IF");
            map.put(IP_MULTICAST_TTL, "IP_MULTICAST_TTL");
            map.put(IP_MULTICAST_LOOP, "IP_MULTICAST_LOOP");
            map.put(IP_ADD_MEMBERSHIP, "IP_ADD_MEMBERSHIP");
            map.put(IP_DROP_MEMBERSHIP, "IP_DROP_MEMBERSHIP");
            map.put(IP_DEFAULT_MULTICAST_TTL, "IP_DEFAULT_MULTICAST_TTL");
            map.put(IP_DEFAULT_MULTICAST_LOOP, "IP_DEFAULT_MULTICAST_LOOP");
            map.put(IP_MAX_MEMBERSHIPS, "IP_MAX_MEMBERSHIPS");
            return map;
        }

        StringTable() {
        }
    }
}

