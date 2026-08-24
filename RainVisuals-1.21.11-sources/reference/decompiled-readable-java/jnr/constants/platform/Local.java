/*
 * Decompiled with CFR 0.152.
 */
package jnr.constants.platform;

import jnr.constants.Constant;
import jnr.constants.platform.ConstantResolver;

public final class Local
extends Enum<Local>
implements Constant {
    public static final /* enum */ Local __UNKNOWN_CONSTANT__;
    private static final /* synthetic */ Local[] $VALUES;
    public static final /* enum */ Local LOCAL_CONNWAIT;
    private static final ConstantResolver<Local> resolver;
    public static final /* enum */ Local LOCAL_PEERCRED;
    public static final /* enum */ Local LOCAL_CREDS;

    @Override
    public final long longValue() {
        return resolver.longValue(this);
    }

    public final String description() {
        return resolver.description(this);
    }

    public static Local valueOf(long value) {
        return resolver.valueOf(value);
    }

    @Override
    public final boolean defined() {
        return resolver.defined(this);
    }

    public final int value() {
        return (int)resolver.longValue(this);
    }

    public final String toString() {
        return this.description();
    }

    public static Local[] values() {
        return (Local[])$VALUES.clone();
    }

    public static Local valueOf(String name) {
        return Enum.valueOf(Local.class, name);
    }

    static {
        LOCAL_PEERCRED = new Local();
        LOCAL_CREDS = new Local();
        LOCAL_CONNWAIT = new Local();
        __UNKNOWN_CONSTANT__ = new Local();
        Local[] localArray = new Local[4];
        localArray[0] = LOCAL_PEERCRED;
        localArray[1] = LOCAL_CREDS;
        localArray[2] = LOCAL_CONNWAIT;
        localArray[3] = __UNKNOWN_CONSTANT__;
        $VALUES = localArray;
        resolver = ConstantResolver.getResolver(Local.class, 20000, 29999);
    }

    @Override
    public final int intValue() {
        return (int)resolver.longValue(this);
    }
}

