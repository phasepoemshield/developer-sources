/*
 * Decompiled with CFR 0.152.
 */
package jnr.constants.platform.linux.aarch64;

import java.util.EnumMap;
import java.util.Map;
import jnr.constants.Constant;

public final class Multicast
extends Enum<Multicast>
implements Constant {
    private static final /* synthetic */ Multicast[] $VALUES;
    private final long value;
    public static final /* enum */ Multicast MCAST_UNBLOCK_SOURCE;
    public static final /* enum */ Multicast MCAST_LEAVE_GROUP;
    public static final /* enum */ Multicast MCAST_EXCLUDE;
    public static final /* enum */ Multicast MCAST_INCLUDE;
    public static final /* enum */ Multicast MCAST_BLOCK_SOURCE;
    public static final long MAX_VALUE = 48L;
    public static final long MIN_VALUE = 0L;
    public static final /* enum */ Multicast MCAST_MSFILTER;
    public static final /* enum */ Multicast MCAST_JOIN_GROUP;
    public static final /* enum */ Multicast MCAST_JOIN_SOURCE_GROUP;
    public static final /* enum */ Multicast MCAST_LEAVE_SOURCE_GROUP;

    private Multicast(long value) {
        this.value = value;
    }

    static {
        MCAST_JOIN_GROUP = new Multicast(42L);
        MCAST_BLOCK_SOURCE = new Multicast(43L);
        MCAST_UNBLOCK_SOURCE = new Multicast(44L);
        MCAST_LEAVE_GROUP = new Multicast(45L);
        MCAST_JOIN_SOURCE_GROUP = new Multicast(46L);
        MCAST_LEAVE_SOURCE_GROUP = new Multicast(47L);
        MCAST_MSFILTER = new Multicast(48L);
        MCAST_EXCLUDE = new Multicast(0L);
        MCAST_INCLUDE = new Multicast(1L);
        Multicast[] multicastArray = new Multicast[9];
        multicastArray[0] = MCAST_JOIN_GROUP;
        multicastArray[1] = MCAST_BLOCK_SOURCE;
        multicastArray[2] = MCAST_UNBLOCK_SOURCE;
        multicastArray[3] = MCAST_LEAVE_GROUP;
        multicastArray[4] = MCAST_JOIN_SOURCE_GROUP;
        multicastArray[5] = MCAST_LEAVE_SOURCE_GROUP;
        multicastArray[6] = MCAST_MSFILTER;
        multicastArray[7] = MCAST_EXCLUDE;
        multicastArray[8] = MCAST_INCLUDE;
        $VALUES = multicastArray;
    }

    public static Multicast valueOf(String name) {
        return Enum.valueOf(Multicast.class, name);
    }

    public static Multicast[] values() {
        return (Multicast[])$VALUES.clone();
    }

    @Override
    public final long longValue() {
        return this.value;
    }

    public final int value() {
        return (int)this.value;
    }

    @Override
    public final boolean defined() {
        return true;
    }

    @Override
    public final int intValue() {
        return (int)this.value;
    }

    public final String toString() {
        return StringTable.descriptions.get(this);
    }

    static final class StringTable {
        public static final Map<Multicast, String> descriptions = StringTable.generateTable();

        public static final Map<Multicast, String> generateTable() {
            EnumMap<Multicast, String> map = new EnumMap<Multicast, String>(Multicast.class);
            map.put(MCAST_JOIN_GROUP, "MCAST_JOIN_GROUP");
            map.put(MCAST_BLOCK_SOURCE, "MCAST_BLOCK_SOURCE");
            map.put(MCAST_UNBLOCK_SOURCE, "MCAST_UNBLOCK_SOURCE");
            map.put(MCAST_LEAVE_GROUP, "MCAST_LEAVE_GROUP");
            map.put(MCAST_JOIN_SOURCE_GROUP, "MCAST_JOIN_SOURCE_GROUP");
            map.put(MCAST_LEAVE_SOURCE_GROUP, "MCAST_LEAVE_SOURCE_GROUP");
            map.put(MCAST_MSFILTER, "MCAST_MSFILTER");
            map.put(MCAST_EXCLUDE, "MCAST_EXCLUDE");
            map.put(MCAST_INCLUDE, "MCAST_INCLUDE");
            return map;
        }

        StringTable() {
        }
    }
}

