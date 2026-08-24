/*
 * Decompiled with CFR 0.152.
 */
package jnr.constants.platform.openbsd;

import java.util.EnumMap;
import java.util.Map;
import jnr.constants.Constant;

public final class WaitFlags
extends Enum<WaitFlags>
implements Constant {
    public static final /* enum */ WaitFlags WNOHANG = new WaitFlags(1L);
    public static final /* enum */ WaitFlags WUNTRACED = new WaitFlags(2L);
    public static final /* enum */ WaitFlags WCONTINUED = new WaitFlags(8L);
    public static final long MIN_VALUE = 1L;
    private final long value;
    public static final long MAX_VALUE = 8L;
    private static final /* synthetic */ WaitFlags[] $VALUES;

    @Override
    public final long longValue() {
        return this.value;
    }

    public final int value() {
        return (int)this.value;
    }

    public static WaitFlags valueOf(String name) {
        return Enum.valueOf(WaitFlags.class, name);
    }

    public final String toString() {
        return StringTable.descriptions.get(this);
    }

    private WaitFlags(long value) {
        this.value = value;
    }

    public static WaitFlags[] values() {
        return (WaitFlags[])$VALUES.clone();
    }

    @Override
    public final boolean defined() {
        return true;
    }

    static {
        WaitFlags[] waitFlagsArray = new WaitFlags[3];
        waitFlagsArray[0] = WNOHANG;
        waitFlagsArray[1] = WUNTRACED;
        waitFlagsArray[2] = WCONTINUED;
        $VALUES = waitFlagsArray;
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
            map.put(WCONTINUED, "WCONTINUED");
            return map;
        }
    }
}

