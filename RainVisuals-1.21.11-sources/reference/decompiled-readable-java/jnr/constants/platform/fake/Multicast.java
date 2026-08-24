/*
 * Decompiled with CFR 0.152.
 */
package jnr.constants.platform.fake;

import jnr.constants.Constant;

public final class Multicast
extends Enum<Multicast>
implements Constant {
    private static final /* synthetic */ Multicast[] $VALUES;
    public static final /* enum */ Multicast MCAST_BLOCK_SOURCE;
    public static final /* enum */ Multicast MCAST_MSFILTER;
    public static final /* enum */ Multicast MCAST_LEAVE_GROUP;
    public static final /* enum */ Multicast MCAST_INCLUDE;
    public static final /* enum */ Multicast MCAST_LEAVE_SOURCE_GROUP;
    public static final /* enum */ Multicast MCAST_JOIN_SOURCE_GROUP;
    public static final /* enum */ Multicast MCAST_EXCLUDE;
    public static final /* enum */ Multicast MCAST_UNBLOCK_SOURCE;
    public static final /* enum */ Multicast MCAST_JOIN_GROUP;
    public static final long MIN_VALUE = 1L;
    public static final long MAX_VALUE = 9L;
    private final long value;

    public static Multicast valueOf(String name) {
        return Enum.valueOf(Multicast.class, name);
    }

    @Override
    public final int intValue() {
        return (int)this.value;
    }

    private Multicast(long value) {
        this.value = value;
    }

    public final int value() {
        return (int)this.value;
    }

    @Override
    public final long longValue() {
        return this.value;
    }

    @Override
    public final boolean defined() {
        return true;
    }

    public static Multicast[] values() {
        return (Multicast[])$VALUES.clone();
    }

    static {
        MCAST_JOIN_GROUP = new Multicast(1L);
        MCAST_BLOCK_SOURCE = new Multicast(2L);
        MCAST_UNBLOCK_SOURCE = new Multicast(3L);
        MCAST_LEAVE_GROUP = new Multicast(4L);
        MCAST_JOIN_SOURCE_GROUP = new Multicast(5L);
        MCAST_LEAVE_SOURCE_GROUP = new Multicast(6L);
        MCAST_MSFILTER = new Multicast(7L);
        MCAST_EXCLUDE = new Multicast(8L);
        MCAST_INCLUDE = new Multicast(9L);
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
}

