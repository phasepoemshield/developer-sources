/*
 * Decompiled with CFR 0.152.
 */
package jnr.constants.platform.dragonflybsd;

import java.util.EnumMap;
import java.util.Map;
import jnr.constants.Constant;

public final class WaitFlags
extends Enum<WaitFlags>
implements Constant {
    public static final /* enum */ WaitFlags WNOWAIT;
    public static final long MAX_VALUE = 16L;
    public static final /* enum */ WaitFlags WUNTRACED;
    private static final /* synthetic */ WaitFlags[] $VALUES;
    public static final /* enum */ WaitFlags WEXITED;
    public static final /* enum */ WaitFlags WNOHANG;
    public static final /* enum */ WaitFlags WCONTINUED;
    public static final /* enum */ WaitFlags WSTOPPED;
    private final long value;
    public static final long MIN_VALUE = 1L;

    @Override
    public final boolean defined() {
        return true;
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
        WSTOPPED = new WaitFlags(2L);
        WEXITED = new WaitFlags(16L);
        WCONTINUED = new WaitFlags(4L);
        WNOWAIT = new WaitFlags(8L);
        WaitFlags[] waitFlagsArray = new WaitFlags[6];
        waitFlagsArray[0] = WNOHANG;
        waitFlagsArray[1] = WUNTRACED;
        waitFlagsArray[2] = WSTOPPED;
        waitFlagsArray[3] = WEXITED;
        waitFlagsArray[4] = WCONTINUED;
        waitFlagsArray[5] = WNOWAIT;
        $VALUES = waitFlagsArray;
    }

    public final int value() {
        return (int)this.value;
    }

    public static WaitFlags valueOf(String name) {
        return Enum.valueOf(WaitFlags.class, name);
    }

    @Override
    public final long longValue() {
        return this.value;
    }

    public final String toString() {
        return StringTable.descriptions.get(this);
    }

    @Override
    public final int intValue() {
        return (int)this.value;
    }

    static final class StringTable {
        public static final Map<WaitFlags, String> descriptions = StringTable.generateTable();

        StringTable() {
        }

        public static final Map<WaitFlags, String> generateTable() {
            EnumMap<WaitFlags, String> map = new EnumMap<WaitFlags, String>(WaitFlags.class);
            map.put(WNOHANG, "WNOHANG");
            map.put(WUNTRACED, "WUNTRACED");
            map.put(WSTOPPED, "WSTOPPED");
            map.put(WEXITED, "WEXITED");
            map.put(WCONTINUED, "WCONTINUED");
            map.put(WNOWAIT, "WNOWAIT");
            return map;
        }
    }
}

