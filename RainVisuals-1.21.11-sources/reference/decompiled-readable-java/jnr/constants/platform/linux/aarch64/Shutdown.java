/*
 * Decompiled with CFR 0.152.
 */
package jnr.constants.platform.linux.aarch64;

import java.util.EnumMap;
import java.util.Map;
import jnr.constants.Constant;

public final class Shutdown
extends Enum<Shutdown>
implements Constant {
    public static final /* enum */ Shutdown SHUT_RDWR;
    private static final /* synthetic */ Shutdown[] $VALUES;
    public static final long MIN_VALUE = 0L;
    public static final /* enum */ Shutdown SHUT_RD;
    private final long value;
    public static final long MAX_VALUE = 2L;
    public static final /* enum */ Shutdown SHUT_WR;

    static {
        SHUT_RD = new Shutdown(0L);
        SHUT_WR = new Shutdown(1L);
        SHUT_RDWR = new Shutdown(2L);
        Shutdown[] shutdownArray = new Shutdown[3];
        shutdownArray[0] = SHUT_RD;
        shutdownArray[1] = SHUT_WR;
        shutdownArray[2] = SHUT_RDWR;
        $VALUES = shutdownArray;
    }

    @Override
    public final long longValue() {
        return this.value;
    }

    @Override
    public final boolean defined() {
        return true;
    }

    public static Shutdown[] values() {
        return (Shutdown[])$VALUES.clone();
    }

    public final int value() {
        return (int)this.value;
    }

    private Shutdown(long value) {
        this.value = value;
    }

    public final String toString() {
        return StringTable.descriptions.get(this);
    }

    public static Shutdown valueOf(String name) {
        return Enum.valueOf(Shutdown.class, name);
    }

    @Override
    public final int intValue() {
        return (int)this.value;
    }

    static final class StringTable {
        public static final Map<Shutdown, String> descriptions = StringTable.generateTable();

        StringTable() {
        }

        public static final Map<Shutdown, String> generateTable() {
            EnumMap<Shutdown, String> map = new EnumMap<Shutdown, String>(Shutdown.class);
            map.put(SHUT_RD, "SHUT_RD");
            map.put(SHUT_WR, "SHUT_WR");
            map.put(SHUT_RDWR, "SHUT_RDWR");
            return map;
        }
    }
}

