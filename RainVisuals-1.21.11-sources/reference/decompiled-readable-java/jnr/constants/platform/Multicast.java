/*
 * Decompiled with CFR 0.152.
 */
package jnr.constants.platform;

import jnr.constants.Constant;
import jnr.constants.platform.ConstantResolver;

public final class Multicast
extends Enum<Multicast>
implements Constant {
    public static final /* enum */ Multicast MCAST_JOIN_GROUP = new Multicast();
    public static final /* enum */ Multicast MCAST_JOIN_SOURCE_GROUP;
    public static final /* enum */ Multicast MCAST_EXCLUDE;
    private static final /* synthetic */ Multicast[] $VALUES;
    public static final /* enum */ Multicast __UNKNOWN_CONSTANT__;
    public static final /* enum */ Multicast MCAST_UNBLOCK_SOURCE;
    public static final /* enum */ Multicast MCAST_MSFILTER;
    public static final /* enum */ Multicast MCAST_BLOCK_SOURCE;
    public static final /* enum */ Multicast MCAST_LEAVE_GROUP;
    public static final /* enum */ Multicast MCAST_INCLUDE;
    public static final /* enum */ Multicast MCAST_LEAVE_SOURCE_GROUP;
    private static final ConstantResolver<Multicast> resolver;

    @Override
    public final boolean defined() {
        return resolver.defined(this);
    }

    @Override
    public final int intValue() {
        return (int)resolver.longValue(this);
    }

    @Override
    public final long longValue() {
        return resolver.longValue(this);
    }

    public final String toString() {
        return this.description();
    }

    public static Multicast valueOf(long value) {
        return resolver.valueOf(value);
    }

    public static Multicast[] values() {
        return (Multicast[])$VALUES.clone();
    }

    public final int value() {
        return (int)resolver.longValue(this);
    }

    public static Multicast valueOf(String name) {
        return Enum.valueOf(Multicast.class, name);
    }

    static {
        MCAST_BLOCK_SOURCE = new Multicast();
        MCAST_UNBLOCK_SOURCE = new Multicast();
        MCAST_LEAVE_GROUP = new Multicast();
        MCAST_JOIN_SOURCE_GROUP = new Multicast();
        MCAST_LEAVE_SOURCE_GROUP = new Multicast();
        MCAST_MSFILTER = new Multicast();
        MCAST_EXCLUDE = new Multicast();
        MCAST_INCLUDE = new Multicast();
        __UNKNOWN_CONSTANT__ = new Multicast();
        Multicast[] multicastArray = new Multicast[10];
        multicastArray[0] = MCAST_JOIN_GROUP;
        multicastArray[1] = MCAST_BLOCK_SOURCE;
        multicastArray[2] = MCAST_UNBLOCK_SOURCE;
        multicastArray[3] = MCAST_LEAVE_GROUP;
        multicastArray[4] = MCAST_JOIN_SOURCE_GROUP;
        multicastArray[5] = MCAST_LEAVE_SOURCE_GROUP;
        multicastArray[6] = MCAST_MSFILTER;
        multicastArray[7] = MCAST_EXCLUDE;
        multicastArray[8] = MCAST_INCLUDE;
        multicastArray[9] = __UNKNOWN_CONSTANT__;
        $VALUES = multicastArray;
        resolver = ConstantResolver.getResolver(Multicast.class, 20000, 29999);
    }

    public final String description() {
        return resolver.description(this);
    }
}

