/*
 * Decompiled with CFR 0.152.
 */
package jnr.constants.platform;

import jnr.constants.Constant;
import jnr.constants.platform.ConstantResolver;

public final class WaitFlags
extends Enum<WaitFlags>
implements Constant {
    public static final /* enum */ WaitFlags WNOHANG = new WaitFlags();
    public static final /* enum */ WaitFlags __UNKNOWN_CONSTANT__;
    public static final /* enum */ WaitFlags WCONTINUED;
    private static final ConstantResolver<WaitFlags> resolver;
    public static final /* enum */ WaitFlags WUNTRACED;
    public static final /* enum */ WaitFlags WSTOPPED;
    public static final /* enum */ WaitFlags WNOWAIT;
    private static final /* synthetic */ WaitFlags[] $VALUES;
    public static final /* enum */ WaitFlags WEXITED;

    public final int value() {
        return (int)resolver.longValue(this);
    }

    public static WaitFlags[] values() {
        return (WaitFlags[])$VALUES.clone();
    }

    public final String description() {
        return resolver.description(this);
    }

    public static WaitFlags valueOf(long value) {
        return resolver.valueOf(value);
    }

    @Override
    public final boolean defined() {
        return resolver.defined(this);
    }

    static {
        WUNTRACED = new WaitFlags();
        WSTOPPED = new WaitFlags();
        WEXITED = new WaitFlags();
        WCONTINUED = new WaitFlags();
        WNOWAIT = new WaitFlags();
        __UNKNOWN_CONSTANT__ = new WaitFlags();
        WaitFlags[] waitFlagsArray = new WaitFlags[7];
        waitFlagsArray[0] = WNOHANG;
        waitFlagsArray[1] = WUNTRACED;
        waitFlagsArray[2] = WSTOPPED;
        waitFlagsArray[3] = WEXITED;
        waitFlagsArray[4] = WCONTINUED;
        waitFlagsArray[5] = WNOWAIT;
        waitFlagsArray[6] = __UNKNOWN_CONSTANT__;
        $VALUES = waitFlagsArray;
        resolver = ConstantResolver.getBitmaskResolver(WaitFlags.class);
    }

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

    public static WaitFlags valueOf(String name) {
        return Enum.valueOf(WaitFlags.class, name);
    }
}

