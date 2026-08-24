/*
 * Decompiled with CFR 0.152.
 */
package jnr.constants.platform.dragonflybsd;

import java.util.EnumMap;
import java.util.Map;
import jnr.constants.Constant;

public final class INet
extends Enum<INet>
implements Constant {
    public static final long MAX_VALUE = 16L;
    private static final /* synthetic */ INet[] $VALUES;
    public static final /* enum */ INet INET_ADDRSTRLEN = new INet(16L);
    private final long value;
    public static final long MIN_VALUE = 16L;

    @Override
    public final long longValue() {
        return this.value;
    }

    static {
        INet[] iNetArray = new INet[1];
        iNetArray[0] = INET_ADDRSTRLEN;
        $VALUES = iNetArray;
    }

    @Override
    public final boolean defined() {
        return true;
    }

    @Override
    public final int intValue() {
        return (int)this.value;
    }

    public static INet[] values() {
        return (INet[])$VALUES.clone();
    }

    public final int value() {
        return (int)this.value;
    }

    private INet(long value) {
        this.value = value;
    }

    public static INet valueOf(String name) {
        return Enum.valueOf(INet.class, name);
    }

    public final String toString() {
        return StringTable.descriptions.get(this);
    }

    static final class StringTable {
        public static final Map<INet, String> descriptions = StringTable.generateTable();

        public static final Map<INet, String> generateTable() {
            EnumMap<INet, String> map = new EnumMap<INet, String>(INet.class);
            map.put(INET_ADDRSTRLEN, "INET_ADDRSTRLEN");
            return map;
        }

        StringTable() {
        }
    }
}

