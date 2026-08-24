/*
 * Decompiled with CFR 0.152.
 */
package jnr.constants.platform;

import jnr.constants.Constant;
import jnr.constants.platform.ConstantResolver;

public final class Access
extends Enum<Access>
implements Constant {
    private static final /* synthetic */ Access[] $VALUES;
    public static final /* enum */ Access F_OK = new Access();
    public static final /* enum */ Access X_OK = new Access();
    private static final ConstantResolver<Access> resolver;
    public static final /* enum */ Access W_OK;
    public static final /* enum */ Access R_OK;
    public static final /* enum */ Access __UNKNOWN_CONSTANT__;

    public final String toString() {
        return this.description();
    }

    @Override
    public final int intValue() {
        return (int)resolver.longValue(this);
    }

    @Override
    public final long longValue() {
        return resolver.longValue(this);
    }

    public final String description() {
        return resolver.description(this);
    }

    public static Access valueOf(long value) {
        return resolver.valueOf(value);
    }

    public static Access valueOf(String name) {
        return Enum.valueOf(Access.class, name);
    }

    public static Access[] values() {
        return (Access[])$VALUES.clone();
    }

    @Override
    public final boolean defined() {
        return resolver.defined(this);
    }

    public final int value() {
        return (int)resolver.longValue(this);
    }

    static {
        W_OK = new Access();
        R_OK = new Access();
        __UNKNOWN_CONSTANT__ = new Access();
        Access[] accessArray = new Access[5];
        accessArray[0] = F_OK;
        accessArray[1] = X_OK;
        accessArray[2] = W_OK;
        accessArray[3] = R_OK;
        accessArray[4] = __UNKNOWN_CONSTANT__;
        $VALUES = accessArray;
        resolver = ConstantResolver.getBitmaskResolver(Access.class);
    }
}

