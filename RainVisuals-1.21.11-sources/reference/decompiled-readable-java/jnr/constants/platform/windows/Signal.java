/*
 * Decompiled with CFR 0.152.
 */
package jnr.constants.platform.windows;

import java.util.EnumMap;
import java.util.Map;
import jnr.constants.Constant;

public final class Signal
extends Enum<Signal>
implements Constant {
    public static final /* enum */ Signal SIGSEGV;
    public static final long MAX_VALUE = 23L;
    private static final /* synthetic */ Signal[] $VALUES;
    public static final /* enum */ Signal SIGINT;
    public static final /* enum */ Signal SIGTERM;
    private final long value;
    public static final /* enum */ Signal NSIG;
    public static final long MIN_VALUE = 2L;
    public static final /* enum */ Signal SIGILL;
    public static final /* enum */ Signal SIGABRT;
    public static final /* enum */ Signal SIGFPE;

    static {
        SIGINT = new Signal(2L);
        SIGILL = new Signal(4L);
        SIGABRT = new Signal(22L);
        SIGFPE = new Signal(8L);
        SIGSEGV = new Signal(11L);
        SIGTERM = new Signal(15L);
        NSIG = new Signal(23L);
        Signal[] signalArray = new Signal[7];
        signalArray[0] = SIGINT;
        signalArray[1] = SIGILL;
        signalArray[2] = SIGABRT;
        signalArray[3] = SIGFPE;
        signalArray[4] = SIGSEGV;
        signalArray[5] = SIGTERM;
        signalArray[6] = NSIG;
        $VALUES = signalArray;
    }

    public final int value() {
        return (int)this.value;
    }

    public static Signal[] values() {
        return (Signal[])$VALUES.clone();
    }

    public final String toString() {
        return StringTable.descriptions.get(this);
    }

    private Signal(long value) {
        this.value = value;
    }

    @Override
    public final boolean defined() {
        return true;
    }

    @Override
    public final int intValue() {
        return (int)this.value;
    }

    @Override
    public final long longValue() {
        return this.value;
    }

    public static Signal valueOf(String name) {
        return Enum.valueOf(Signal.class, name);
    }

    static final class StringTable {
        public static final Map<Signal, String> descriptions = StringTable.generateTable();

        StringTable() {
        }

        public static final Map<Signal, String> generateTable() {
            EnumMap<Signal, String> map = new EnumMap<Signal, String>(Signal.class);
            map.put(SIGINT, "SIGINT");
            map.put(SIGILL, "SIGILL");
            map.put(SIGABRT, "SIGABRT");
            map.put(SIGFPE, "SIGFPE");
            map.put(SIGSEGV, "SIGSEGV");
            map.put(SIGTERM, "SIGTERM");
            map.put(NSIG, "NSIG");
            return map;
        }
    }
}

