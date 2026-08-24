/*
 * Decompiled with CFR 0.152.
 */
package jnr.constants.platform.linux.s390x;

import java.util.EnumMap;
import java.util.Map;
import jnr.constants.Constant;

public final class Shutdown
extends Enum<Shutdown>
implements Constant {
    private final long value;
    public static final /* enum */ Shutdown SHUT_RDWR;
    public static final long MAX_VALUE = 2L;
    public static final /* enum */ Shutdown SHUT_RD;
    public static final /* enum */ Shutdown SHUT_WR;
    public static final long MIN_VALUE = 0L;
    private static final /* synthetic */ Shutdown[] $VALUES;

    public static Shutdown[] values() {
        return (Shutdown[])$VALUES.clone();
    }

    @Override
    public final boolean defined() {
        return true;
    }

    private Shutdown(long value) {
        this.value = value;
    }

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

    public static Shutdown valueOf(String name) {
        return Enum.valueOf(Shutdown.class, name);
    }

    @Override
    public final int intValue() {
        return (int)this.value;
    }

    public final int value() {
        return (int)this.value;
    }

    public final String toString() {
        return StringTable.descriptions.get(this);
    }

    static final class StringTable {
        public static final Map<Shutdown, String> descriptions = StringTable.generateTable();

        public static final Map<Shutdown, String> generateTable() {
            EnumMap<Shutdown, String> map = new EnumMap<Shutdown, String>(Shutdown.class);
            map.put(SHUT_RD, "SHUT_RD");
            map.put(SHUT_WR, "SHUT_WR");
            map.put(SHUT_RDWR, "SHUT_RDWR");
            return map;
        }

        StringTable() {
        }
    }
}

