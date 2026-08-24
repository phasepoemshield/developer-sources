/*
 * Decompiled with CFR 0.152.
 */
package jnr.constants.platform;

import jnr.constants.Constant;
import jnr.constants.platform.ConstantResolver;

public final class UDP
extends Enum<UDP>
implements Constant {
    private static final /* synthetic */ UDP[] $VALUES;
    public static final /* enum */ UDP UDP_CORK = new UDP();
    public static final /* enum */ UDP __UNKNOWN_CONSTANT__ = new UDP();
    private static final ConstantResolver<UDP> resolver;

    @Override
    public final long longValue() {
        return resolver.longValue(this);
    }

    public final String description() {
        return resolver.description(this);
    }

    public final String toString() {
        return this.description();
    }

    @Override
    public final boolean defined() {
        return resolver.defined(this);
    }

    public final int value() {
        return (int)resolver.longValue(this);
    }

    public static UDP[] values() {
        return (UDP[])$VALUES.clone();
    }

    public static UDP valueOf(long value) {
        return resolver.valueOf(value);
    }

    public static UDP valueOf(String name) {
        return Enum.valueOf(UDP.class, name);
    }

    static {
        UDP[] uDPArray = new UDP[2];
        uDPArray[0] = UDP_CORK;
        uDPArray[1] = __UNKNOWN_CONSTANT__;
        $VALUES = uDPArray;
        resolver = ConstantResolver.getResolver(UDP.class, 20000, 29999);
    }

    @Override
    public final int intValue() {
        return (int)resolver.longValue(this);
    }
}

