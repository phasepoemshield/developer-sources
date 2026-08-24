/*
 * Decompiled with CFR 0.152.
 */
package jnr.constants.platform;

import jnr.constants.Constant;
import jnr.constants.platform.ConstantResolver;

public final class RLIM
extends Enum<RLIM>
implements Constant {
    public static final /* enum */ RLIM __UNKNOWN_CONSTANT__;
    public static final /* enum */ RLIM RLIM_SAVED_MAX;
    public static final /* enum */ RLIM RLIM_SAVED_CUR;
    private static final /* synthetic */ RLIM[] $VALUES;
    public static final /* enum */ RLIM RLIM_INFINITY;
    private static final ConstantResolver<RLIM> resolver;
    public static final /* enum */ RLIM RLIM_NLIMITS;

    @Override
    public final boolean defined() {
        return resolver.defined(this);
    }

    public final String description() {
        return resolver.description(this);
    }

    public static RLIM[] values() {
        return (RLIM[])$VALUES.clone();
    }

    public final String toString() {
        return this.description();
    }

    @Override
    public final long longValue() {
        return resolver.longValue(this);
    }

    static {
        RLIM_NLIMITS = new RLIM();
        RLIM_INFINITY = new RLIM();
        RLIM_SAVED_MAX = new RLIM();
        RLIM_SAVED_CUR = new RLIM();
        __UNKNOWN_CONSTANT__ = new RLIM();
        RLIM[] rLIMArray = new RLIM[5];
        rLIMArray[0] = RLIM_NLIMITS;
        rLIMArray[1] = RLIM_INFINITY;
        rLIMArray[2] = RLIM_SAVED_MAX;
        rLIMArray[3] = RLIM_SAVED_CUR;
        rLIMArray[4] = __UNKNOWN_CONSTANT__;
        $VALUES = rLIMArray;
        resolver = ConstantResolver.getResolver(RLIM.class, 20000, 29999);
    }

    @Override
    public final int intValue() {
        return (int)resolver.longValue(this);
    }

    public static RLIM valueOf(long value) {
        return resolver.valueOf(value);
    }

    public static RLIM valueOf(String name) {
        return Enum.valueOf(RLIM.class, name);
    }

    public final int value() {
        return (int)resolver.longValue(this);
    }
}

