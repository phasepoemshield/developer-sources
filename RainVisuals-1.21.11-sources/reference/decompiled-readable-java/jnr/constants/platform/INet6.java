/*
 * Decompiled with CFR 0.152.
 */
package jnr.constants.platform;

import jnr.constants.Constant;
import jnr.constants.platform.ConstantResolver;

public final class INet6
extends Enum<INet6>
implements Constant {
    public static final /* enum */ INet6 INET6_ADDRSTRLEN = new INet6();
    public static final /* enum */ INet6 __UNKNOWN_CONSTANT__ = new INet6();
    private static final /* synthetic */ INet6[] $VALUES;
    private static final ConstantResolver<INet6> resolver;

    public static INet6 valueOf(long value) {
        return resolver.valueOf(value);
    }

    static {
        INet6[] iNet6Array = new INet6[2];
        iNet6Array[0] = INET6_ADDRSTRLEN;
        iNet6Array[1] = __UNKNOWN_CONSTANT__;
        $VALUES = iNet6Array;
        resolver = ConstantResolver.getResolver(INet6.class, 20000, 29999);
    }

    @Override
    public final int intValue() {
        return (int)resolver.longValue(this);
    }

    public final String description() {
        return resolver.description(this);
    }

    @Override
    public final long longValue() {
        return resolver.longValue(this);
    }

    public final int value() {
        return (int)resolver.longValue(this);
    }

    public static INet6[] values() {
        return (INet6[])$VALUES.clone();
    }

    public final String toString() {
        return this.description();
    }

    public static INet6 valueOf(String name) {
        return Enum.valueOf(INet6.class, name);
    }

    @Override
    public final boolean defined() {
        return resolver.defined(this);
    }
}

