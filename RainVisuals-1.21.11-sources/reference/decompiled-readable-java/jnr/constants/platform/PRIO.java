/*
 * Decompiled with CFR 0.152.
 */
package jnr.constants.platform;

import jnr.constants.Constant;
import jnr.constants.platform.ConstantResolver;

public final class PRIO
extends Enum<PRIO>
implements Constant {
    public static final /* enum */ PRIO PRIO_MIN = new PRIO();
    public static final /* enum */ PRIO PRIO_MAX;
    public static final /* enum */ PRIO PRIO_USER;
    public static final /* enum */ PRIO PRIO_PROCESS;
    private static final ConstantResolver<PRIO> resolver;
    public static final /* enum */ PRIO __UNKNOWN_CONSTANT__;
    public static final /* enum */ PRIO PRIO_PGRP;
    private static final /* synthetic */ PRIO[] $VALUES;

    public final String description() {
        return resolver.description(this);
    }

    public static PRIO valueOf(String name) {
        return Enum.valueOf(PRIO.class, name);
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

    public static PRIO valueOf(long value) {
        return resolver.valueOf(value);
    }

    static {
        PRIO_PROCESS = new PRIO();
        PRIO_PGRP = new PRIO();
        PRIO_USER = new PRIO();
        PRIO_MAX = new PRIO();
        __UNKNOWN_CONSTANT__ = new PRIO();
        PRIO[] pRIOArray = new PRIO[6];
        pRIOArray[0] = PRIO_MIN;
        pRIOArray[1] = PRIO_PROCESS;
        pRIOArray[2] = PRIO_PGRP;
        pRIOArray[3] = PRIO_USER;
        pRIOArray[4] = PRIO_MAX;
        pRIOArray[5] = __UNKNOWN_CONSTANT__;
        $VALUES = pRIOArray;
        resolver = ConstantResolver.getResolver(PRIO.class, 20000, 29999);
    }

    @Override
    public final int intValue() {
        return (int)resolver.longValue(this);
    }

    @Override
    public final long longValue() {
        return resolver.longValue(this);
    }

    public static PRIO[] values() {
        return (PRIO[])$VALUES.clone();
    }
}

