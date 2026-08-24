/*
 * Decompiled with CFR 0.152.
 */
package jnr.constants.platform;

import jnr.constants.Constant;
import jnr.constants.platform.ConstantResolver;

public final class Shutdown
extends Enum<Shutdown>
implements Constant {
    public static final /* enum */ Shutdown SHUT_WR;
    private static final /* synthetic */ Shutdown[] $VALUES;
    public static final /* enum */ Shutdown SHUT_RDWR;
    private static final ConstantResolver<Shutdown> resolver;
    public static final /* enum */ Shutdown SHUT_RD;
    public static final /* enum */ Shutdown __UNKNOWN_CONSTANT__;

    public static Shutdown[] values() {
        return (Shutdown[])$VALUES.clone();
    }

    public final String description() {
        return resolver.description(this);
    }

    public static Shutdown valueOf(String name) {
        return Enum.valueOf(Shutdown.class, name);
    }

    public static Shutdown valueOf(long value) {
        return resolver.valueOf(value);
    }

    static {
        SHUT_RD = new Shutdown();
        SHUT_WR = new Shutdown();
        SHUT_RDWR = new Shutdown();
        __UNKNOWN_CONSTANT__ = new Shutdown();
        Shutdown[] shutdownArray = new Shutdown[4];
        shutdownArray[0] = SHUT_RD;
        shutdownArray[1] = SHUT_WR;
        shutdownArray[2] = SHUT_RDWR;
        shutdownArray[3] = __UNKNOWN_CONSTANT__;
        $VALUES = shutdownArray;
        resolver = ConstantResolver.getResolver(Shutdown.class, 20000, 29999);
    }

    @Override
    public final boolean defined() {
        return resolver.defined(this);
    }

    @Override
    public final long longValue() {
        return resolver.longValue(this);
    }

    public final String toString() {
        return this.description();
    }

    @Override
    public final int intValue() {
        return (int)resolver.longValue(this);
    }

    public final int value() {
        return (int)resolver.longValue(this);
    }
}

