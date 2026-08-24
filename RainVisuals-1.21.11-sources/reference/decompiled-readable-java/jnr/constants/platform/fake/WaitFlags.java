/*
 * Decompiled with CFR 0.152.
 */
package jnr.constants.platform.fake;

import jnr.constants.Constant;

public final class WaitFlags
extends Enum<WaitFlags>
implements Constant {
    public static final /* enum */ WaitFlags WCONTINUED;
    public static final /* enum */ WaitFlags WEXITED;
    public static final long MAX_VALUE = 32L;
    public static final /* enum */ WaitFlags WNOHANG;
    public static final long MIN_VALUE = 1L;
    public static final /* enum */ WaitFlags WUNTRACED;
    private static final /* synthetic */ WaitFlags[] $VALUES;
    public static final /* enum */ WaitFlags WNOWAIT;
    private final long value;
    public static final /* enum */ WaitFlags WSTOPPED;

    @Override
    public final long longValue() {
        return this.value;
    }

    public static WaitFlags[] values() {
        return (WaitFlags[])$VALUES.clone();
    }

    private WaitFlags(long value) {
        this.value = value;
    }

    static {
        WNOHANG = new WaitFlags(1L);
        WUNTRACED = new WaitFlags(2L);
        WSTOPPED = new WaitFlags(4L);
        WEXITED = new WaitFlags(8L);
        WCONTINUED = new WaitFlags(16L);
        WNOWAIT = new WaitFlags(32L);
        WaitFlags[] waitFlagsArray = new WaitFlags[6];
        waitFlagsArray[0] = WNOHANG;
        waitFlagsArray[1] = WUNTRACED;
        waitFlagsArray[2] = WSTOPPED;
        waitFlagsArray[3] = WEXITED;
        waitFlagsArray[4] = WCONTINUED;
        waitFlagsArray[5] = WNOWAIT;
        $VALUES = waitFlagsArray;
    }

    @Override
    public final int intValue() {
        return (int)this.value;
    }

    public final int value() {
        return (int)this.value;
    }

    @Override
    public final boolean defined() {
        return true;
    }

    public static WaitFlags valueOf(String name) {
        return Enum.valueOf(WaitFlags.class, name);
    }
}

