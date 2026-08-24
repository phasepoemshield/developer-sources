/*
 * Decompiled with CFR 0.152.
 */
package jnr.constants.platform;

import jnr.constants.Constant;
import jnr.constants.platform.ConstantResolver;

public final class INet
extends Enum<INet>
implements Constant {
    public static final /* enum */ INet __UNKNOWN_CONSTANT__;
    public static final /* enum */ INet INET_ADDRSTRLEN;
    private static final ConstantResolver<INet> resolver;
    private static final /* synthetic */ INet[] $VALUES;

    @Override
    public final boolean defined() {
        return resolver.defined(this);
    }

    public static INet valueOf(String name) {
        return Enum.valueOf(INet.class, name);
    }

    public static INet valueOf(long value) {
        return resolver.valueOf(value);
    }

    public static INet[] values() {
        return (INet[])$VALUES.clone();
    }

    public final int value() {
        return (int)resolver.longValue(this);
    }

    static {
        INET_ADDRSTRLEN = new INet();
        __UNKNOWN_CONSTANT__ = new INet();
        INet[] iNetArray = new INet[2];
        iNetArray[0] = INET_ADDRSTRLEN;
        iNetArray[1] = __UNKNOWN_CONSTANT__;
        $VALUES = iNetArray;
        resolver = ConstantResolver.getResolver(INet.class, 20000, 29999);
    }

    @Override
    public final int intValue() {
        return (int)resolver.longValue(this);
    }

    public final String toString() {
        return this.description();
    }

    public final String description() {
        return resolver.description(this);
    }

    @Override
    public final long longValue() {
        return resolver.longValue(this);
    }
}

