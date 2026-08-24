/*
 * Decompiled with CFR 0.152.
 */
package jnr.constants.platform.solaris;

import java.util.EnumMap;
import java.util.Map;
import jnr.constants.Constant;

public final class INet
extends Enum<INet>
implements Constant {
    public static final long MAX_VALUE = 16L;
    public static final long MIN_VALUE = 16L;
    public static final /* enum */ INet INET_ADDRSTRLEN = new INet(16L);
    private final long value;
    private static final /* synthetic */ INet[] $VALUES;

    private INet(long value) {
        this.value = value;
    }

    @Override
    public final int intValue() {
        return (int)this.value;
    }

    @Override
    public final boolean defined() {
        return true;
    }

    @Override
    public final long longValue() {
        return this.value;
    }

    static {
        INet[] iNetArray = new INet[1];
        iNetArray[0] = INET_ADDRSTRLEN;
        $VALUES = iNetArray;
    }

    public static INet valueOf(String name) {
        return Enum.valueOf(INet.class, name);
    }

    public static INet[] values() {
        return (INet[])$VALUES.clone();
    }

    public final String toString() {
        return StringTable.descriptions.get(this);
    }

    public final int value() {
        return (int)this.value;
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

