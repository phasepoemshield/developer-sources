/*
 * Decompiled with CFR 0.152.
 */
package jnr.constants.platform.aix;

import jnr.constants.Constant;

public final class WaitFlags
extends Enum<WaitFlags>
implements Constant {
    private static final /* synthetic */ WaitFlags[] $VALUES;
    public static final /* enum */ WaitFlags WNOWAIT;
    public static final /* enum */ WaitFlags WNOHANG;
    public static final /* enum */ WaitFlags WUNTRACED;
    private final long value;
    public static final /* enum */ WaitFlags WCONTINUED;
    public static final /* enum */ WaitFlags WEXITED;
    public static final long MAX_VALUE = 0x1000000L;
    public static final long MIN_VALUE = 1L;
    public static final /* enum */ WaitFlags WSTOPPED;

    private WaitFlags(long value) {
        this.value = value;
    }

    @Override
    public final int intValue() {
        return (int)this.value;
    }

    static {
        WNOHANG = new WaitFlags(1L);
        WUNTRACED = new WaitFlags(2L);
        WSTOPPED = new WaitFlags(64L);
        WEXITED = new WaitFlags(4L);
        WCONTINUED = new WaitFlags(0x1000000L);
        WNOWAIT = new WaitFlags(16L);
        WaitFlags[] waitFlagsArray = new WaitFlags[6];
        waitFlagsArray[0] = WNOHANG;
        waitFlagsArray[1] = WUNTRACED;
        waitFlagsArray[2] = WSTOPPED;
        waitFlagsArray[3] = WEXITED;
        waitFlagsArray[4] = WCONTINUED;
        waitFlagsArray[5] = WNOWAIT;
        $VALUES = waitFlagsArray;
    }

    public static WaitFlags[] values() {
        return (WaitFlags[])$VALUES.clone();
    }

    public static WaitFlags valueOf(String name) {
        return Enum.valueOf(WaitFlags.class, name);
    }

    @Override
    public final long longValue() {
        return this.value;
    }

    @Override
    public final boolean defined() {
        return true;
    }
}

